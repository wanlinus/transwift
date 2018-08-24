package cn.wanlinus.transwift.baidu.service;

import cn.wanlinus.transwift.baidu.domain.BaiduTransResponseData;
import cn.wanlinus.transwift.domain.Result;
import cn.wanlinus.transwift.domain.TransFormData;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author wanli
 * @date 2018-08-23 14:29
 */
@Service
public class BaiduTransService {

    private static final Logger logger = LoggerFactory.getLogger(BaiduTransService.class);

    @Value("${baidu.appid}")
    private String appid;

    @Value("${baidu.secretKey}")
    private String secretKey;
    private final String url = "http://api.fanyi.baidu.com/api/trans/vip/translate";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @param data
     * @return
     */
    public List<Result> trans(TransFormData data) {
        String salt = String.valueOf(System.currentTimeMillis());
        String str = appid + data.getContent() + salt + secretKey;
        String sign = DigestUtils.md5Hex(str);
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("appid", appid);
        map.add("q", data.getContent());
        map.add("from", data.getFrom());
        map.add("to", data.getTo());
        map.add("salt", salt);
        map.add("sign", sign);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(map, httpHeaders);
        ResponseEntity<BaiduTransResponseData> response = restTemplate.postForEntity(url, requestEntity, BaiduTransResponseData.class);
        return Optional.ofNullable(response.getBody()).map(BaiduTransResponseData::getTrans_result).orElse(Collections.emptyList());
    }


}
