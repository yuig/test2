package com.bugsnag.android;

/* loaded from: classes3.dex */
public final class h extends e {

    /* renamed from: i, reason: collision with root package name */
    public final Number f29244i;

    /* renamed from: j, reason: collision with root package name */
    public final Number f29245j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f29246k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f29247l;

    public h(String str, String str2, String str3, String str4, String str5, id.c cVar, String str6, Integer num, Long l13, Long l14, Boolean bool, Boolean bool2) {
        super(str, str2, str3, str4, str5, cVar, str6, num);
        this.f29244i = l13;
        this.f29245j = l14;
        this.f29246k = bool;
        this.f29247l = bool2;
    }

    @Override // com.bugsnag.android.e
    public final void a(o1 o1Var) {
        super.a(o1Var);
        o1Var.K("duration");
        o1Var.w(this.f29244i);
        o1Var.K("durationInForeground");
        o1Var.w(this.f29245j);
        o1Var.K("inForeground");
        o1Var.q(this.f29246k);
        o1Var.K("isLaunching");
        o1Var.q(this.f29247l);
    }
}
