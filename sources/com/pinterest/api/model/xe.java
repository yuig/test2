package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xe implements fl1.e {
    @Override // fl1.e
    public final dl1.s a(dl1.s sVar, dl1.s sVar2) {
        mv oldModel = (mv) sVar;
        mv newModel = (mv) sVar2;
        Intrinsics.checkNotNullParameter(oldModel, "oldModel");
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        if (oldModel == newModel) {
            oldModel.getClass();
        } else {
            lv Q = oldModel.Q();
            Q.b(newModel);
            oldModel = Q.a();
        }
        mv a13 = oldModel.Q().a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
