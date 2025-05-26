package com.pinterest.framework.multisection.datasource.pagedlist;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends v implements wt1.c {

    /* renamed from: k, reason: collision with root package name */
    public final h0 f49187k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(gd0.d pagedList, boolean z13) {
        super((r0) pagedList, z13, false);
        Intrinsics.checkNotNullParameter(pagedList, "pagedList");
        this.f49187k = pagedList;
    }

    @Override // wt1.c
    public final void b(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f49187k.b(bundle);
    }

    @Override // wt1.c
    public final void l(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f49187k.l(bundle);
    }
}
