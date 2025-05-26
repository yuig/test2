package com.pinterest.api.model;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wf {
    private wf() {
    }

    public /* synthetic */ wf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static xf a(vd0.c coverShuffleAssetObject) {
        Intrinsics.checkNotNullParameter(coverShuffleAssetObject, "coverShuffleAssetObject");
        vd0.c bitmapMaskObject = coverShuffleAssetObject.m("bitmap_mask");
        r7 r7Var = null;
        if (bitmapMaskObject != null) {
            r7.f41487i.getClass();
            Intrinsics.checkNotNullParameter(bitmapMaskObject, "bitmapMaskObject");
            vd0.a k13 = bitmapMaskObject.k("mask_bounds");
            Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
            vd0.a i13 = k13.i(0);
            vd0.a i14 = k13.i(1);
            ArrayList arrayList = new ArrayList();
            if (i13 != null) {
                Float e13 = i13.e(0);
                Intrinsics.checkNotNullExpressionValue(e13, "optFloat(...)");
                arrayList.add(e13);
                Float e14 = i13.e(1);
                Intrinsics.checkNotNullExpressionValue(e14, "optFloat(...)");
                arrayList.add(e14);
            }
            if (i14 != null) {
                Float e15 = i14.e(0);
                Intrinsics.checkNotNullExpressionValue(e15, "optFloat(...)");
                arrayList.add(e15);
                Float e16 = i14.e(1);
                Intrinsics.checkNotNullExpressionValue(e16, "optFloat(...)");
                arrayList.add(e16);
            }
            if (arrayList.size() != 4) {
                arrayList = null;
            }
            r7Var = new r7(Integer.valueOf(bitmapMaskObject.j(0, "id")), bitmapMaskObject.o("type", ""), bitmapMaskObject.o("mask_image", ""), k13, arrayList != null ? (Float) arrayList.get(0) : null, arrayList != null ? (Float) arrayList.get(1) : null, arrayList != null ? (Float) arrayList.get(2) : null, arrayList != null ? (Float) arrayList.get(3) : null);
        }
        return new xf(r7Var, coverShuffleAssetObject.o("id", ""), Integer.valueOf(coverShuffleAssetObject.j(0, "item_type")));
    }
}
