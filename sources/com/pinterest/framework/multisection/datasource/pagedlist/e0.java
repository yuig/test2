package com.pinterest.framework.multisection.datasource.pagedlist;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f49096b;

    /* renamed from: c, reason: collision with root package name */
    public final dl1.s f49097c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i13, dl1.s item, int i14) {
        super(true);
        boolean z13 = (i14 & 4) != 0;
        Intrinsics.checkNotNullParameter(item, "item");
        this.f49096b = i13;
        this.f49097c = item;
        this.f49098d = z13;
    }
}
