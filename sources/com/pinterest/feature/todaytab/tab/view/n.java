package com.pinterest.feature.todaytab.tab.view;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f48737a = {RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO, 200, 201, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER, RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR};

    public static final int a(int i13) {
        if (i13 == c42.c.HERO.getValue()) {
            return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_HERO;
        }
        if (i13 == c42.c.THREE_PIN_COLLECTION.getValue()) {
            return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_THREE_PINS_COLLECTION;
        }
        if (i13 == c42.c.SINGLE_VIDEO.getValue()) {
            return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_VIDEO;
        }
        if (i13 == c42.c.SINGLE_PIN.getValue()) {
            return 200;
        }
        if (i13 == c42.c.IDEA_STREAM.getValue()) {
            return 201;
        }
        if (i13 == c42.c.STORY_PIN.getValue()) {
            return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_STORY_PIN;
        }
        if (i13 == c42.c.CUSTOM_COVER.getValue()) {
            return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_CUSTOM_COVER;
        }
        if (i13 == c42.c.SINGLE_CREATOR.getValue()) {
            return RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_USE_CASE_MODULE_SINGLE_CREATOR;
        }
        return -2;
    }
}
