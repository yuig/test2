package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class xk implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @om.b("id")
    private String f43709a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("type")
    private String f43710b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("content_type")
    private String f43711c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("title")
    private String f43712d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("subtitle")
    private String f43713e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("object_id")
    private String f43714f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("is_promoted")
    private Boolean f43715g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("author_name")
    private String f43716h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("badge_type")
    private String f43717i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("story_category")
    private Integer f43718j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("show_cover")
    private Boolean f43719k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("identifier_icon_type")
    private Integer f43720l;

    /* renamed from: m, reason: collision with root package name */
    public String f43721m;

    /* renamed from: n, reason: collision with root package name */
    public String f43722n;

    /* renamed from: o, reason: collision with root package name */
    public String f43723o;

    /* renamed from: p, reason: collision with root package name */
    public String f43724p;

    /* renamed from: q, reason: collision with root package name */
    public String f43725q;

    /* renamed from: r, reason: collision with root package name */
    public List f43726r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f43727s;

    /* renamed from: t, reason: collision with root package name */
    public ih f43728t;

    /* renamed from: u, reason: collision with root package name */
    public String f43729u;

    /* renamed from: v, reason: collision with root package name */
    public String f43730v;

    /* renamed from: w, reason: collision with root package name */
    public List f43731w;

    /* renamed from: x, reason: collision with root package name */
    public List f43732x;

    public xk() {
    }

    public final void A(String str) {
        this.f43722n = str;
    }

    public final void B(String str) {
        this.f43724p = str;
    }

    public final void C(String str) {
        this.f43723o = str;
    }

    public final void D(String str) {
        this.f43713e = str;
    }

    public final void E(String str) {
        this.f43712d = str;
    }

    public final void F(ArrayList arrayList) {
        this.f43726r = arrayList;
    }

    public final void G(String str) {
        this.f43730v = str;
    }

    public final String a() {
        return this.f43711c;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f43709a;
    }

    public final List c() {
        return df.j1.d1(this.f43725q) ? Arrays.asList(this.f43725q.split(",")) : new ArrayList();
    }

    public final List e() {
        return df.j1.d1(this.f43722n) ? Arrays.asList(this.f43722n.split(",")) : new ArrayList();
    }

    public final Boolean g() {
        Boolean bool = this.f43719k;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List h() {
        return df.j1.d1(this.f43723o) ? Arrays.asList(this.f43723o.split(",")) : new ArrayList();
    }

    public final Integer j() {
        Integer num = this.f43718j;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final z32.n1 k() {
        Integer num = this.f43720l;
        if (num == null) {
            return null;
        }
        return z32.n1.findByValue(num.intValue());
    }

    public final String l() {
        return this.f43713e;
    }

    public final String n() {
        return this.f43712d;
    }

    public final String q() {
        return this.f43710b;
    }

    public final void s(ih ihVar) {
        this.f43728t = ihVar;
    }

    public final void u(String str) {
        this.f43729u = str;
    }

    public final void v(ArrayList arrayList) {
    }

    public final void w(ArrayList arrayList) {
        this.f43732x = arrayList;
    }

    public final void x(String str) {
        this.f43721m = str;
    }

    public final void y(boolean z13) {
        this.f43727s = z13;
    }

    public final void z(String str) {
        this.f43725q = str;
    }

    public xk(Long l13) {
    }
}
