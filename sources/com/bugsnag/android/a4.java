package com.bugsnag.android;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a4 implements n1 {

    /* renamed from: d, reason: collision with root package name */
    public static final z3 f29153d = new z3();

    /* renamed from: a, reason: collision with root package name */
    public final String f29154a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29155b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29156c;

    public a4(String str, String str2, String str3) {
        this.f29154a = str;
        this.f29155b = str2;
        this.f29156c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(a4.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bugsnag.android.User");
        }
        a4 a4Var = (a4) obj;
        return Intrinsics.d(this.f29154a, a4Var.f29154a) && Intrinsics.d(this.f29155b, a4Var.f29155b) && Intrinsics.d(this.f29156c, a4Var.f29156c);
    }

    public final int hashCode() {
        String str = this.f29154a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f29155b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f29156c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        o1Var.K("id");
        o1Var.z(this.f29154a);
        o1Var.K("email");
        o1Var.z(this.f29155b);
        o1Var.K("name");
        o1Var.z(this.f29156c);
        o1Var.g();
    }
}
