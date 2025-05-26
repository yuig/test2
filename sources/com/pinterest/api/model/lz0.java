package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lz0 implements dl1.r0 {
    @Override // dl1.r0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean b(wy0 model) {
        String Z2;
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        return (id3 == null || kotlin.text.z.j(id3) || (Z2 = model.Z2()) == null || kotlin.text.z.j(Z2)) ? false : true;
    }
}
