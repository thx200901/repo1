package com.softeem.stargym.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig  implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer() {

            @Override
            public void addViewControllers(ViewControllerRegistry registry){
                registry.addViewController("/client/upload.html").setViewName("/upload");
            }


//            @Override
//            public void addResourceHandlers(ResourceHandlerRegistry registry) {
//                /* 其中的路径写的是文件保存的路径，可以直接将file:/后面的内容全部进行替换 */
//                registry.addResourceHandler("/Path/**").addResourceLocations("file:/D:/Idea/demo925002/target/classes/upload/");
//            }


        };
        return webMvcConfigurer;
    }

}
