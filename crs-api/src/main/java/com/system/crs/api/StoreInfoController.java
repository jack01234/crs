package com.system.crs.api;

import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.ServerRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 店铺信息展示层
 *
 * @author yingmuhuadao
 * @date 2019/10/12
 */
@Slf4j
@RestController(value = "/crs/store/")
public class StoreInfoController {

    /**
     * 获取店铺信息
     *
     * @param request 请求参数
     * @return 店铺信息
     */
    @RequestMapping(value = "/queryStoreInfo",method = RequestMethod.POST)
    public Mono<String> queryStoreInfo(ServerRequest request){

        return Mono.justOrEmpty("");
    }
}
