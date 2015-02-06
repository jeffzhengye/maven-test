package com.aaa.annotation.guice;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.ImmutableMap;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

@Slf4j
public class MapSetProvider extends AbstractModule{
    private String ss;
    public MapSetProvider(@Named("example") String ss) {
        this.ss = ss;
    }
    
    @Override
    protected void configure() {
//        bind(Map.class).annotatedWith(Names.named("COMMON")).
    }
    
    public void printInject(){
        log.info("inject: " + ss);
    }
    
    @Singleton
    @Provides
    Map<String, String> provideMap(String xmlFile) {
        if(xmlFile.equals("test1")){
            log.info("building map 1");
            return ImmutableMap.<String, String>builder().put("test1", "test1").build();
        }else{
            log.info("building map other");
            return ImmutableMap.<String, String>builder().put("other", "other").build();
        }
    }
    
    public static void main(String[] args) {
//        Injector injector = Guice.createInjector(new MapSetProvider());
//        Map<String, String> map1 = injector.getInstance(MapSetProvider.class).provideMap("test1");
//        Map<String, String> map2 = injector.getInstance(MapSetProvider.class).provideMap("test1");
//        injector.getInstance(MapSetProvider.class).printInject();
    }

}


//@Internal
//public class InternalResourceModule extends AbstractModule {
//    private ClassLoader classLoader;
//
//    public InternalResourceModule(ClassLoader classLoader) {
//        this.classLoader = classLoader;
//    }
//
//    @Override
//    protected void configure() {
//    }
//
//    @Provides
//    @Singleton
//    ResourceLoader getResourceLoader(@Named(NlpModule.MODULE_NAME) String moduleName) {
//        String resourcePath = "com/maluuba/nlp/" + moduleName.replace('.', '/');
//        return new ClassPathResourceLoader(classLoader, resourcePath);
//    }
//}