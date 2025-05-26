package com.bugsnag.android;

/* loaded from: classes3.dex */
public final class s3 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final t3 f29637a;

    public s3(String str, String str2, ErrorType errorType, boolean z13, r3 r3Var, s2 s2Var) {
        this.f29637a = new t3(str, str2, errorType, z13, r3Var.getDescriptor(), s2Var);
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        this.f29637a.toStream(o1Var);
    }

    public s3(t3 t3Var) {
        this.f29637a = t3Var;
    }
}
