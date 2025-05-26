package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o50 implements dl1.r0 {
    @Override // dl1.r0
    public final boolean b(dl1.s sVar) {
        f30 model = (f30) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        return !(id3 == null || kotlin.text.z.j(id3));
    }
}
