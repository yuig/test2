package com.pinterest.api.model;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class n90 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("ad_group_id")
    private String f40357a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("advertiser_id")
    private String f40358b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("advertiser_name")
    private String f40359c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("campaign_id")
    private String f40360d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("completion_message")
    private String f40361e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("description")
    private String f40362f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("disclosure_language")
    private String f40363g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("headline")
    private String f40364h;

    /* renamed from: i, reason: collision with root package name */
    @om.b(SbaPinRep.AUXDATA_LEADAD_FORM_ID)
    private String f40365i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("lead_id")
    private String f40366j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("pin_promotion_id")
    private String f40367k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("policy_links")
    private List<r90> f40368l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("privacy_policy_link")
    private String f40369m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("questions")
    private List<v90> f40370n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f40371o;

    public /* synthetic */ n90(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, List list2, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, str12, list2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n90 n90Var = (n90) obj;
        return Objects.equals(this.f40357a, n90Var.f40357a) && Objects.equals(this.f40358b, n90Var.f40358b) && Objects.equals(this.f40359c, n90Var.f40359c) && Objects.equals(this.f40360d, n90Var.f40360d) && Objects.equals(this.f40361e, n90Var.f40361e) && Objects.equals(this.f40362f, n90Var.f40362f) && Objects.equals(this.f40363g, n90Var.f40363g) && Objects.equals(this.f40364h, n90Var.f40364h) && Objects.equals(this.f40365i, n90Var.f40365i) && Objects.equals(this.f40366j, n90Var.f40366j) && Objects.equals(this.f40367k, n90Var.f40367k) && Objects.equals(this.f40368l, n90Var.f40368l) && Objects.equals(this.f40369m, n90Var.f40369m) && Objects.equals(this.f40370n, n90Var.f40370n);
    }

    public final int hashCode() {
        return Objects.hash(this.f40357a, this.f40358b, this.f40359c, this.f40360d, this.f40361e, this.f40362f, this.f40363g, this.f40364h, this.f40365i, this.f40366j, this.f40367k, this.f40368l, this.f40369m, this.f40370n);
    }

    public final String o() {
        return this.f40357a;
    }

    public final String p() {
        return this.f40358b;
    }

    public final String q() {
        return this.f40360d;
    }

    public final String r() {
        return this.f40361e;
    }

    public final String s() {
        return this.f40363g;
    }

    public final String t() {
        return this.f40365i;
    }

    public final String u() {
        return this.f40366j;
    }

    public final String v() {
        return this.f40367k;
    }

    public final List w() {
        return this.f40368l;
    }

    public final String x() {
        return this.f40369m;
    }

    public final List y() {
        return this.f40370n;
    }

    public n90() {
        this.f40371o = new boolean[14];
    }

    private n90(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<r90> list, String str12, List<v90> list2, boolean[] zArr) {
        this.f40357a = str;
        this.f40358b = str2;
        this.f40359c = str3;
        this.f40360d = str4;
        this.f40361e = str5;
        this.f40362f = str6;
        this.f40363g = str7;
        this.f40364h = str8;
        this.f40365i = str9;
        this.f40366j = str10;
        this.f40367k = str11;
        this.f40368l = list;
        this.f40369m = str12;
        this.f40370n = list2;
        this.f40371o = zArr;
    }
}
