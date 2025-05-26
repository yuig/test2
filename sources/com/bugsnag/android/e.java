package com.bugsnag.android;

/* loaded from: classes3.dex */
public class e implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29197b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29199d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29200e;

    /* renamed from: f, reason: collision with root package name */
    public final String f29201f;

    /* renamed from: g, reason: collision with root package name */
    public final Number f29202g;

    /* renamed from: h, reason: collision with root package name */
    public final id.c f29203h;

    public e(String str, String str2, String str3, String str4, String str5, id.c cVar, String str6, Integer num) {
        this.f29196a = str;
        this.f29197b = str2;
        this.f29198c = str3;
        this.f29199d = str4;
        this.f29200e = str5;
        this.f29201f = str6;
        this.f29202g = num;
        this.f29203h = cVar;
    }

    public void a(o1 o1Var) {
        o1Var.K("binaryArch");
        o1Var.z(this.f29196a);
        o1Var.K("buildUUID");
        id.c cVar = this.f29203h;
        o1Var.z(cVar == null ? null : (String) cVar.a());
        o1Var.K("codeBundleId");
        o1Var.z(this.f29200e);
        o1Var.K("id");
        o1Var.z(this.f29197b);
        o1Var.K("releaseStage");
        o1Var.z(this.f29198c);
        o1Var.K("type");
        o1Var.z(this.f29201f);
        o1Var.K("version");
        o1Var.z(this.f29199d);
        o1Var.K("versionCode");
        o1Var.w(this.f29202g);
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        o1Var.d();
        a(o1Var);
        o1Var.g();
    }
}
