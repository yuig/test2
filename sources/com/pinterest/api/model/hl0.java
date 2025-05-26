package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hl0 extends vg {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(String str) {
        super(Boolean.FALSE);
        this.f38484b = str;
    }

    @Override // com.pinterest.api.model.vg
    public final Object e(fo0 value8) {
        Intrinsics.checkNotNullParameter(value8, "value8");
        return (!Intrinsics.d(value8.l(), this.f38484b) || value8.j().booleanValue()) ? Boolean.FALSE : Boolean.TRUE;
    }
}
