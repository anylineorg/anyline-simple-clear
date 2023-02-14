package org.anyline.simple.clear.task;

import org.anyline.net.HttpResponse;
import org.anyline.net.HttpUtil;
import org.anyline.service.AnylineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class DefaultTask {
    private static Logger log = LoggerFactory.getLogger(DefaultTask.class);
    @Autowired
    private AnylineService service;
    @Scheduled(cron="* * * * * ?")
    public void init(){
        log.warn("init test");
        HttpResponse response = HttpUtil.get("http://www.baidu.com");
        log.warn("http status:{}", response.getStatus());
        service.query("crm_user");
    }
}
