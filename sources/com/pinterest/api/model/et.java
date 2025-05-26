package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class et implements dl1.r0 {
    public static boolean c(zs model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        return !(id3 == null || kotlin.text.z.j(id3));
    }

    @Override // dl1.r0
    public final /* bridge */ /* synthetic */ boolean b(dl1.s sVar) {
        return c((zs) sVar);
    }
}
