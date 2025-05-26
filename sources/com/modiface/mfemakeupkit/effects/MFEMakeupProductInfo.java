package com.modiface.mfemakeupkit.effects;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public class MFEMakeupProductInfo {
    public final String brand;
    public final MFEMakeupProductCategory category;
    public final ArrayList<MFEMakeupShadeInfo> shadeInfoList;
    public final String upc;

    public MFEMakeupProductInfo(String str, MFEMakeupProductCategory mFEMakeupProductCategory, String str2, ArrayList<MFEMakeupShadeInfo> arrayList) {
        this.brand = str;
        this.category = mFEMakeupProductCategory;
        this.upc = str2;
        this.shadeInfoList = arrayList;
    }
}
