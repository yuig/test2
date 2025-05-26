package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class p80 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40901a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40902b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("additional_images")
    private List<i40> f40903c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("checkout_token")
    private String f40904d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("dimensions")
    private Map<String, Object> f40905e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_preselected")
    private Boolean f40906f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("item_id")
    private String f40907g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("item_set_id")
    private String f40908h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("links")
    private List<String> f40909i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("merchant_item_id")
    private String f40910j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("merchant_item_set_id")
    private String f40911k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("offer_summary")
    private wz f40912l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("pin_id")
    private String f40913m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("shipping_info")
    private xh0 f40914n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("title")
    private String f40915o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f40916p;

    public /* synthetic */ p80(String str, String str2, List list, String str3, Map map, Boolean bool, String str4, String str5, List list2, String str6, String str7, wz wzVar, String str8, xh0 xh0Var, String str9, boolean[] zArr, int i13) {
        this(str, str2, list, str3, map, bool, str4, str5, list2, str6, str7, wzVar, str8, xh0Var, str9, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p80 p80Var = (p80) obj;
        return Objects.equals(this.f40906f, p80Var.f40906f) && Objects.equals(this.f40901a, p80Var.f40901a) && Objects.equals(this.f40902b, p80Var.f40902b) && Objects.equals(this.f40903c, p80Var.f40903c) && Objects.equals(this.f40904d, p80Var.f40904d) && Objects.equals(this.f40905e, p80Var.f40905e) && Objects.equals(this.f40907g, p80Var.f40907g) && Objects.equals(this.f40908h, p80Var.f40908h) && Objects.equals(this.f40909i, p80Var.f40909i) && Objects.equals(this.f40910j, p80Var.f40910j) && Objects.equals(this.f40911k, p80Var.f40911k) && Objects.equals(this.f40912l, p80Var.f40912l) && Objects.equals(this.f40913m, p80Var.f40913m) && Objects.equals(this.f40914n, p80Var.f40914n) && Objects.equals(this.f40915o, p80Var.f40915o);
    }

    public final int hashCode() {
        return Objects.hash(this.f40901a, this.f40902b, this.f40903c, this.f40904d, this.f40905e, this.f40906f, this.f40907g, this.f40908h, this.f40909i, this.f40910j, this.f40911k, this.f40912l, this.f40913m, this.f40914n, this.f40915o);
    }

    public final Map p() {
        return this.f40905e;
    }

    public final wz q() {
        return this.f40912l;
    }

    public p80() {
        this.f40916p = new boolean[15];
    }

    private p80(@NonNull String str, String str2, List<i40> list, String str3, Map<String, Object> map, Boolean bool, String str4, String str5, List<String> list2, String str6, String str7, wz wzVar, String str8, xh0 xh0Var, String str9, boolean[] zArr) {
        this.f40901a = str;
        this.f40902b = str2;
        this.f40903c = list;
        this.f40904d = str3;
        this.f40905e = map;
        this.f40906f = bool;
        this.f40907g = str4;
        this.f40908h = str5;
        this.f40909i = list2;
        this.f40910j = str6;
        this.f40911k = str7;
        this.f40912l = wzVar;
        this.f40913m = str8;
        this.f40914n = xh0Var;
        this.f40915o = str9;
        this.f40916p = zArr;
    }
}
