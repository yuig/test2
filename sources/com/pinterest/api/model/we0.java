package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class we0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("additional_images")
    private List<i40> f43235a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("brand")
    private cb f43236b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("has_multi_images")
    private Boolean f43237c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("id")
    private String f43238d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("item_id")
    private String f43239e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("item_set_id")
    private String f43240f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("label_info")
    private wt f43241g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("name")
    private String f43242h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("offer_summary")
    private wz f43243i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("offers")
    private List<wz> f43244j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("purchase_url")
    private String f43245k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("shipping_info")
    private xh0 f43246l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("type")
    private String f43247m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f43248n;

    public /* synthetic */ we0(List list, cb cbVar, Boolean bool, String str, String str2, String str3, wt wtVar, String str4, wz wzVar, List list2, String str5, xh0 xh0Var, String str6, boolean[] zArr, int i13) {
        this(list, cbVar, bool, str, str2, str3, wtVar, str4, wzVar, list2, str5, xh0Var, str6, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        we0 we0Var = (we0) obj;
        return Objects.equals(this.f43237c, we0Var.f43237c) && Objects.equals(this.f43235a, we0Var.f43235a) && Objects.equals(this.f43236b, we0Var.f43236b) && Objects.equals(this.f43238d, we0Var.f43238d) && Objects.equals(this.f43239e, we0Var.f43239e) && Objects.equals(this.f43240f, we0Var.f43240f) && Objects.equals(this.f43241g, we0Var.f43241g) && Objects.equals(this.f43242h, we0Var.f43242h) && Objects.equals(this.f43243i, we0Var.f43243i) && Objects.equals(this.f43244j, we0Var.f43244j) && Objects.equals(this.f43245k, we0Var.f43245k) && Objects.equals(this.f43246l, we0Var.f43246l) && Objects.equals(this.f43247m, we0Var.f43247m);
    }

    public final int hashCode() {
        return Objects.hash(this.f43235a, this.f43236b, this.f43237c, this.f43238d, this.f43239e, this.f43240f, this.f43241g, this.f43242h, this.f43243i, this.f43244j, this.f43245k, this.f43246l, this.f43247m);
    }

    public final List n() {
        return this.f43235a;
    }

    public final cb o() {
        return this.f43236b;
    }

    public final Boolean p() {
        Boolean bool = this.f43237c;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String q() {
        return this.f43239e;
    }

    public final String r() {
        return this.f43240f;
    }

    public final wt s() {
        return this.f43241g;
    }

    public final String t() {
        return this.f43242h;
    }

    public final wz u() {
        return this.f43243i;
    }

    public final List v() {
        return this.f43244j;
    }

    public final xh0 w() {
        return this.f43246l;
    }

    public we0() {
        this.f43248n = new boolean[13];
    }

    private we0(List<i40> list, cb cbVar, Boolean bool, String str, String str2, String str3, wt wtVar, String str4, wz wzVar, List<wz> list2, String str5, xh0 xh0Var, String str6, boolean[] zArr) {
        this.f43235a = list;
        this.f43236b = cbVar;
        this.f43237c = bool;
        this.f43238d = str;
        this.f43239e = str2;
        this.f43240f = str3;
        this.f43241g = wtVar;
        this.f43242h = str4;
        this.f43243i = wzVar;
        this.f43244j = list2;
        this.f43245k = str5;
        this.f43246l = xh0Var;
        this.f43247m = str6;
        this.f43248n = zArr;
    }
}
