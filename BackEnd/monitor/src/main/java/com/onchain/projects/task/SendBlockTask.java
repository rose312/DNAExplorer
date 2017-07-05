package com.onchain.projects.task;

import com.onchain.projects.ws.service.SendBlockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by ZhouQ on 2017/6/5.
 */
@Component("SendBlockTask")
@Scope("prototype")
public class SendBlockTask extends Thread {
    private Logger logger = LoggerFactory.getLogger(MachineInfoTask.class);

    @Autowired
    private SendBlockService sendBlockService;

    @Override
    public void run() {
        logger.debug("SendBlockTask begin...");
        try {
            sendBlockService.sendBlockInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
