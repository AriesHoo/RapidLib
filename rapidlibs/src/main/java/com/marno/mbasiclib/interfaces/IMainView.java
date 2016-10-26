package com.marno.mbasiclib.interfaces;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.flyco.tablayout.CommonTabLayout;

import java.util.ArrayList;

/**
 * Created by marno on 2016/8/28/09:29.
 */
public interface IMainView {

    /**
     * 添加tab名字
     *
     * @return 保存了tab名字的数组
     */
     String[] getTabNameArray();

    /**
     * 添加tab图标（未选中）
     *
     * @return 保存了tab（未选中）图标的数组
     */
    @NonNull
    int[] getTabUnselectedIcon();

    /**
     * 添加tab图标（选中）
     *
     * @return 保存了tab（选中）图标的数组
     */
    @NonNull
    int[] getTabSelectedIcon();

    /**
     * 添加Fragment
     *
     * @return 保存fagment的集合
     */
    @NonNull
    ArrayList<Fragment> initFragments();

    /**
     * 如果需要手动修改tab的一些属性，可以在这里设置
     * 比如控制字体大小，显示未读消息，更改字体颜色等
     */
    void setTab(CommonTabLayout tabLayout);
}
