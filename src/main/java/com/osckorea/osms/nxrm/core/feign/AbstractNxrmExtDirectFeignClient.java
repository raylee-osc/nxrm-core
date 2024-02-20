package com.osckorea.osms.nxrm.core.feign;

import java.net.URI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import com.osckorea.osms.nxrm.core.constants.NxrmExtDirectApiConstant;
import com.osckorea.osms.nxrm.core.dto.ext.common.NxrmExtDirectDto;

public abstract interface AbstractNxrmExtDirectFeignClient<T> {
    @PostMapping(value = NxrmExtDirectApiConstant.BASE_URL)
    public NxrmExtDirectDto.Response<T> request(@RequestBody NxrmExtDirectDto.Request request);

    @PostMapping(value = NxrmExtDirectApiConstant.BASE_URL, headers = {"Authorization"})
    public NxrmExtDirectDto.Response<T> request(@RequestHeader("Authorization") String auth, @RequestBody NxrmExtDirectDto.Request request);

    @PostMapping(value = NxrmExtDirectApiConstant.BASE_URL, headers = {"Authorization"})
    public NxrmExtDirectDto.Response<T> request(URI url, @RequestHeader("Authorization") String auth, @RequestBody NxrmExtDirectDto.Request request);
}
