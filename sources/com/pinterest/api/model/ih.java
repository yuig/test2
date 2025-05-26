package com.pinterest.api.model;

import java.util.HashMap;

/* loaded from: classes3.dex */
public class ih implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @om.b("text")
    private String f38772a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("url")
    private String f38773b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("location")
    private Integer f38774c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("style")
    private Integer f38775d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("args")
    private HashMap<String, String> f38776e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("user")
    private wy0 f38777f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("full_feed_title")
    private String f38778g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("request_params")
    private String f38779h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("view_parameter_type")
    private Integer f38780i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("pins_display")
    private Integer f38781j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("end_card_title")
    private String f38782k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("end_card_images")
    private HashMap<String, HashMap<String, String>> f38783l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("show_landing_page_hero")
    private Boolean f38784m;

    private ih() {
    }

    public static ih w(vd0.c cVar) {
        return (ih) vd0.c.f125622b.e(cVar.f125623a, ih.class);
    }

    public final z32.l a() {
        Integer num = this.f38774c;
        return num == null ? z32.l.NONE : z32.l.findByValue(num.intValue());
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f38773b;
    }

    public final z32.o c() {
        Integer num = this.f38775d;
        return num == null ? z32.o.BUTTON : z32.o.findByValue(num.intValue());
    }

    public final String e() {
        return this.f38773b;
    }

    public final String g() {
        return this.f38772a;
    }

    public final wy0 h() {
        return this.f38777f;
    }

    public final HashMap j() {
        return this.f38783l;
    }

    public final String k() {
        return this.f38782k;
    }

    public final String l() {
        return this.f38778g;
    }

    public final z32.c2 n() {
        Integer num = this.f38781j;
        if (num == null) {
            return null;
        }
        return z32.c2.findByValue(num.intValue());
    }

    public final Integer q() {
        return this.f38781j;
    }

    public final String s() {
        return this.f38779h;
    }

    public final Boolean u() {
        Boolean bool = this.f38784m;
        return bool != null ? bool : Boolean.FALSE;
    }

    public final Integer v() {
        return this.f38780i;
    }

    public final void x(String str) {
        this.f38773b = str;
    }

    public ih(String str, String str2, Integer num, Integer num2, HashMap<String, String> hashMap, wy0 wy0Var, String str3, String str4, Integer num3, Integer num4, String str5, HashMap<String, HashMap<String, String>> hashMap2, Boolean bool) {
        this.f38772a = str;
        this.f38773b = str2;
        this.f38774c = num;
        this.f38775d = num2;
        this.f38776e = hashMap;
        this.f38777f = wy0Var;
        this.f38778g = str3;
        this.f38779h = str4;
        this.f38780i = num3;
        this.f38781j = num4;
        this.f38782k = str5;
        this.f38783l = hashMap2;
        this.f38784m = bool;
    }
}
