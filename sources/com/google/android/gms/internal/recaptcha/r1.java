package com.google.android.gms.internal.recaptcha;

import android.content.Context;

/* loaded from: classes.dex */
public final class r1 extends com.google.android.gms.common.api.f implements qi.a {

    /* renamed from: l, reason: collision with root package name */
    public static final x92.b f31781l;

    /* renamed from: k, reason: collision with root package name */
    public final Context f31782k;

    static {
        com.google.android.gms.common.api.d dVar = new com.google.android.gms.common.api.d();
        new rd.j(12);
        f31781l = new x92.b("Recaptcha.API", new qh.i(3), dVar);
    }

    public r1(Context context) {
        super(context, null, f31781l, null, com.google.android.gms.common.api.e.f30758c);
        this.f31782k = context;
        int i13 = f.f31749a;
        new StringBuilder(57).append("https://www.recaptcha.net/recaptcha/api3/accountchallenge");
        n1.e();
        int i14 = f.f31749a;
        new StringBuilder(54).append("https://www.recaptcha.net/recaptcha/api3/accountverify");
        o1.e();
    }
}
