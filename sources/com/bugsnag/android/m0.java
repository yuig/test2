package com.bugsnag.android;

/* loaded from: classes3.dex */
public final class m0 implements n1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f29338b = new l0();

    /* renamed from: a, reason: collision with root package name */
    public final String f29339a;

    public m0(String str) {
        this.f29339a = str;
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        o1Var.K("id");
        o1Var.z(this.f29339a);
        o1Var.g();
    }
}
