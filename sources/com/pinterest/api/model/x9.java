package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x9 implements dl1.r0 {
    public static boolean c(v7 model) {
        String j13;
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        return (id3 == null || kotlin.text.z.j(id3) || (j13 = model.j1()) == null || kotlin.text.z.j(j13)) ? false : true;
    }

    @Override // dl1.r0
    public final /* bridge */ /* synthetic */ boolean b(dl1.s sVar) {
        return c((v7) sVar);
    }
}
