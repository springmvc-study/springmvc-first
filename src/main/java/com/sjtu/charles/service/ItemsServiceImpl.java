package com.sjtu.charles.service;

import com.sjtu.charles.mapper.ItemsCustomMapper;
import com.sjtu.charles.po.ItemsCustom;
import com.sjtu.charles.po.ItemsQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/6/14.
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsCustomMapper itemsCustomMapper;

    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsCustomMapper.findItemsList(itemsQueryVo);
    }
}
