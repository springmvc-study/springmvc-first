package com.sjtu.charles.mapper;

import com.sjtu.charles.po.ItemsCustom;
import com.sjtu.charles.po.ItemsQueryVo;

import java.util.List;

/**
 * Created by Administrator on 2016/6/14.
 */
public interface ItemsCustomMapper {
    //商品查询列表
    List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;

}
