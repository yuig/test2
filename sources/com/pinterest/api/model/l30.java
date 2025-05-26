package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class l30 {

    /* renamed from: a */
    @om.b("ad_destination_url")
    private String f39637a;

    /* renamed from: b */
    @om.b("android_deep_link")
    private String f39638b;

    /* renamed from: c */
    @om.b("details")
    private String f39639c;

    /* renamed from: d */
    @om.b("domain")
    private String f39640d;

    /* renamed from: e */
    @om.b("id")
    private String f39641e;

    /* renamed from: f */
    @om.b("image_signature")
    private String f39642f;

    /* renamed from: g */
    @om.b("images")
    private Map<String, sr> f39643g;

    /* renamed from: h */
    @om.b("item_id")
    private String f39644h;

    /* renamed from: i */
    @om.b("link")
    private String f39645i;

    /* renamed from: j */
    @om.b("rich_metadata")
    private oe0 f39646j;

    /* renamed from: k */
    @om.b("rich_summary")
    private se0 f39647k;

    /* renamed from: l */
    @om.b("title")
    private String f39648l;

    /* renamed from: m */
    @om.b("videos")
    private b01 f39649m;

    /* renamed from: n */
    public final boolean[] f39650n;

    public /* synthetic */ l30(String str, String str2, String str3, String str4, String str5, String str6, Map map, String str7, String str8, oe0 oe0Var, se0 se0Var, String str9, b01 b01Var, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, map, str7, str8, oe0Var, se0Var, str9, b01Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l30 l30Var = (l30) obj;
        return Objects.equals(this.f39637a, l30Var.f39637a) && Objects.equals(this.f39638b, l30Var.f39638b) && Objects.equals(this.f39639c, l30Var.f39639c) && Objects.equals(this.f39640d, l30Var.f39640d) && Objects.equals(this.f39641e, l30Var.f39641e) && Objects.equals(this.f39642f, l30Var.f39642f) && Objects.equals(this.f39643g, l30Var.f39643g) && Objects.equals(this.f39644h, l30Var.f39644h) && Objects.equals(this.f39645i, l30Var.f39645i) && Objects.equals(this.f39646j, l30Var.f39646j) && Objects.equals(this.f39647k, l30Var.f39647k) && Objects.equals(this.f39648l, l30Var.f39648l) && Objects.equals(this.f39649m, l30Var.f39649m);
    }

    public final int hashCode() {
        return Objects.hash(this.f39637a, this.f39638b, this.f39639c, this.f39640d, this.f39641e, this.f39642f, this.f39643g, this.f39644h, this.f39645i, this.f39646j, this.f39647k, this.f39648l, this.f39649m);
    }

    public final String n() {
        return this.f39637a;
    }

    public final String o() {
        return this.f39638b;
    }

    public final String p() {
        return this.f39639c;
    }

    public final String q() {
        return this.f39640d;
    }

    public final String r() {
        return this.f39642f;
    }

    public final Map s() {
        return this.f39643g;
    }

    public final String t() {
        return this.f39644h;
    }

    public final String u() {
        return this.f39645i;
    }

    public final oe0 v() {
        return this.f39646j;
    }

    public final se0 w() {
        return this.f39647k;
    }

    public final String x() {
        return this.f39648l;
    }

    public final String y() {
        return this.f39641e;
    }

    public final b01 z() {
        return this.f39649m;
    }

    public l30() {
        this.f39650n = new boolean[13];
    }

    private l30(String str, String str2, String str3, String str4, String str5, String str6, Map<String, sr> map, String str7, String str8, oe0 oe0Var, se0 se0Var, String str9, b01 b01Var, boolean[] zArr) {
        this.f39637a = str;
        this.f39638b = str2;
        this.f39639c = str3;
        this.f39640d = str4;
        this.f39641e = str5;
        this.f39642f = str6;
        this.f39643g = map;
        this.f39644h = str7;
        this.f39645i = str8;
        this.f39646j = oe0Var;
        this.f39647k = se0Var;
        this.f39648l = str9;
        this.f39649m = b01Var;
        this.f39650n = zArr;
    }
}
