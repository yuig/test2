package com.pinterest.framework.multisection.datasource.pagedlist;

import androidx.recyclerview.widget.g1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f49188a;

    /* renamed from: b, reason: collision with root package name */
    public final uk2.f f49189b;

    public u(int i13, uk2.f updatePublisher) {
        Intrinsics.checkNotNullParameter(updatePublisher, "updatePublisher");
        this.f49188a = i13;
        this.f49189b = updatePublisher;
    }

    @Override // androidx.recyclerview.widget.g1
    public final void j(int i13, int i14) {
        this.f49189b.c(new sq0.r(i13 + this.f49188a, i14));
    }

    @Override // androidx.recyclerview.widget.g1
    public final void m(int i13, int i14) {
        this.f49189b.c(new sq0.t(i13 + this.f49188a, i14));
    }

    @Override // androidx.recyclerview.widget.g1
    public final void p(int i13, Object obj, int i14) {
        this.f49189b.c(new sq0.p(i13 + this.f49188a, i14));
    }

    @Override // androidx.recyclerview.widget.g1
    public final void q(int i13, int i14) {
        int i15 = this.f49188a;
        this.f49189b.c(new sq0.s(i13 + i15, i14 + i15));
    }
}
