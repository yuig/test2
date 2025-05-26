package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ha implements dl1.r0 {
    @Override // dl1.r0
    public final boolean b(dl1.s sVar) {
        String A;
        ba model = (ba) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        return (id3 == null || kotlin.text.z.j(id3) || (A = model.A()) == null || kotlin.text.z.j(A)) ? false : true;
    }
}
