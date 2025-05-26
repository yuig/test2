package com.bugsnag.android;

import java.util.List;

/* loaded from: classes3.dex */
public final class u0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public String f29655a;

    /* renamed from: b, reason: collision with root package name */
    public String f29656b;

    /* renamed from: c, reason: collision with root package name */
    public ErrorType f29657c;

    /* renamed from: d, reason: collision with root package name */
    public final List f29658d;

    public u0(String str, String str2, s2 s2Var, ErrorType errorType) {
        this.f29655a = str;
        this.f29656b = str2;
        this.f29657c = errorType;
        this.f29658d = s2Var.f29636a;
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        o1Var.K("errorClass");
        o1Var.z(this.f29655a);
        o1Var.K("message");
        o1Var.z(this.f29656b);
        o1Var.K("type");
        o1Var.z(this.f29657c.getDesc());
        o1Var.K("stacktrace");
        o1Var.M(this.f29658d);
        o1Var.g();
    }
}
