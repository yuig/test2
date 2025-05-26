package com.pinterest.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t60 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final float f42108a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42109b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42110c;

    public t60(float f13, boolean z13) {
        this.f42108a = f13;
        this.f42109b = z13;
        String a13 = cp2.a.a(9);
        Intrinsics.checkNotNullExpressionValue(a13, "randomAlphanumeric(...)");
        this.f42110c = a13;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f42110c;
    }

    public /* synthetic */ t60(float f13, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, (i13 & 2) != 0 ? false : z13);
    }
}
