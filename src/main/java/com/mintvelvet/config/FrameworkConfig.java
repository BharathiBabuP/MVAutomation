package com.mintvelvet.config;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {

    long timeout() ;
    String url();
    String chromebinarypath();
    String firefoxbinarypath();
    String browser();
    String runmode();
    String remoteurl();
    String overridereports();
    String passedstepsscreenshots();
    String failedstepsscreenshots();
}
