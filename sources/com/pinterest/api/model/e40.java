package com.pinterest.api.model;

@Deprecated
/* loaded from: classes.dex */
public class e40 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public String f37174a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("url")
    private String f37175b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("width")
    private Integer f37176c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("height")
    private Integer f37177d;

    public final Integer a() {
        return this.f37177d;
    }

    @Override // dl1.s
    public final String b() {
        return "null | " + this.f37174a;
    }

    public final String c() {
        return this.f37175b;
    }

    public final Integer e() {
        return this.f37176c;
    }

    public final void g(Integer num) {
        this.f37177d = num;
    }

    public final void h(String str) {
        this.f37175b = str;
    }

    public final void j(Integer num) {
        this.f37176c = num;
    }
}
