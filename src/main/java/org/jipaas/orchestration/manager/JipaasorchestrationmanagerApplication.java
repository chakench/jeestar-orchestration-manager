package org.jipaas.orchestration.manager;

import org.jipaas.autoconfigure.orchestration.manager.EnableJipaasOrchestrationManager;
import org.jipaas.orchestration.common.constant.OrchConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableJipaasOrchestrationManager
@SpringBootApplication

public class JipaasorchestrationmanagerApplication {
    
        public static void main(String[] args) {
            Thread.currentThread().setName(OrchConstants.THREAD_NAME_MANAGER_SERVER);
            try {
                SpringApplication.run(JipaasorchestrationmanagerApplication.class, args);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}