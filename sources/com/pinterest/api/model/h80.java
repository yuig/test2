package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class h80 {

    /* renamed from: a */
    @NonNull
    @om.b("id")
    private String f38333a;

    /* renamed from: b */
    @om.b("node_id")
    private String f38334b;

    /* renamed from: c */
    @om.b("additional_images")
    private List<i40> f38335c;

    /* renamed from: d */
    @om.b("brand")
    private cb f38336d;

    /* renamed from: e */
    @om.b("expiration_date")
    private Date f38337e;

    /* renamed from: f */
    @om.b("merchant_id_str")
    private String f38338f;

    /* renamed from: g */
    @om.b("name")
    private String f38339g;

    /* renamed from: h */
    @om.b("offer_summary")
    private wz f38340h;

    /* renamed from: i */
    @om.b("offers")
    private List<wz> f38341i;

    /* renamed from: j */
    @om.b("shipping_info")
    private xh0 f38342j;

    /* renamed from: k */
    @om.b("variant_set")
    private t80 f38343k;

    /* renamed from: l */
    @om.b("videos")
    private List<b01> f38344l;

    /* renamed from: m */
    public final boolean[] f38345m;

    public /* synthetic */ h80(String str, String str2, List list, cb cbVar, Date date, String str3, String str4, wz wzVar, List list2, xh0 xh0Var, t80 t80Var, List list3, boolean[] zArr, int i13) {
        this(str, str2, list, cbVar, date, str3, str4, wzVar, list2, xh0Var, t80Var, list3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h80 h80Var = (h80) obj;
        return Objects.equals(this.f38333a, h80Var.f38333a) && Objects.equals(this.f38334b, h80Var.f38334b) && Objects.equals(this.f38335c, h80Var.f38335c) && Objects.equals(this.f38336d, h80Var.f38336d) && Objects.equals(this.f38337e, h80Var.f38337e) && Objects.equals(this.f38338f, h80Var.f38338f) && Objects.equals(this.f38339g, h80Var.f38339g) && Objects.equals(this.f38340h, h80Var.f38340h) && Objects.equals(this.f38341i, h80Var.f38341i) && Objects.equals(this.f38342j, h80Var.f38342j) && Objects.equals(this.f38343k, h80Var.f38343k) && Objects.equals(this.f38344l, h80Var.f38344l);
    }

    public final int hashCode() {
        return Objects.hash(this.f38333a, this.f38334b, this.f38335c, this.f38336d, this.f38337e, this.f38338f, this.f38339g, this.f38340h, this.f38341i, this.f38342j, this.f38343k, this.f38344l);
    }

    public final List m() {
        return this.f38335c;
    }

    public final cb n() {
        return this.f38336d;
    }

    public final String o() {
        return this.f38339g;
    }

    public final wz p() {
        return this.f38340h;
    }

    public final List q() {
        return this.f38341i;
    }

    public final xh0 r() {
        return this.f38342j;
    }

    public final String s() {
        return this.f38333a;
    }

    public final t80 t() {
        return this.f38343k;
    }

    public final List u() {
        return this.f38344l;
    }

    public h80() {
        this.f38345m = new boolean[12];
    }

    private h80(@NonNull String str, String str2, List<i40> list, cb cbVar, Date date, String str3, String str4, wz wzVar, List<wz> list2, xh0 xh0Var, t80 t80Var, List<b01> list3, boolean[] zArr) {
        this.f38333a = str;
        this.f38334b = str2;
        this.f38335c = list;
        this.f38336d = cbVar;
        this.f38337e = date;
        this.f38338f = str3;
        this.f38339g = str4;
        this.f38340h = wzVar;
        this.f38341i = list2;
        this.f38342j = xh0Var;
        this.f38343k = t80Var;
        this.f38344l = list3;
        this.f38345m = zArr;
    }
}
