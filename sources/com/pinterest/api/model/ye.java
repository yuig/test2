package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ye implements fl1.e {
    @Override // fl1.e
    public final dl1.s a(dl1.s sVar, dl1.s sVar2) {
        ue oldModel = (ue) sVar;
        ue newModel = (ue) sVar2;
        Intrinsics.checkNotNullParameter(oldModel, "oldModel");
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        if (oldModel == newModel) {
            oldModel.getClass();
        } else {
            oldModel.getClass();
            re reVar = new re(oldModel, 0);
            reVar.b(newModel);
            oldModel = reVar.a();
        }
        ue a13 = new re(oldModel, 0).a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
