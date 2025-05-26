package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fz0 implements fl1.e {
    @Override // fl1.e
    public final dl1.s a(dl1.s sVar, dl1.s sVar2) {
        wy0 oldModel = (wy0) sVar;
        wy0 newModel = (wy0) sVar2;
        Intrinsics.checkNotNullParameter(oldModel, "oldModel");
        Intrinsics.checkNotNullParameter(newModel, "newModel");
        wy0 a13 = oldModel.G4(newModel).H4().a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
