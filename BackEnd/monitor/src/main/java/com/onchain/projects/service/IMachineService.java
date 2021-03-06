package com.onchain.projects.service;

import com.onchain.projects.domain.Machine;

import java.util.List;

/**
 * Created by ZhouQ on 2017/6/1.
 */
public interface IMachineService {

    Integer storeMachineInfo(Machine machine);

    Integer delMachineInfo(String ip);

    List<Machine> getMachineInfo(String ip);


}
