package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.appsflyer.AdRevenueScheme;
import java.util.Objects;

/* loaded from: classes.dex */
public class d20 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36624a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36625b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("active")
    private Boolean f36626c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("business_name")
    private String f36627d;

    /* renamed from: e, reason: collision with root package name */
    @om.b(AdRevenueScheme.COUNTRY)
    private String f36628e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("created_time")
    private Integer f36629f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("currency")
    private String f36630g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("email")
    private String f36631h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("first_name")
    private String f36632i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("last_name")
    private String f36633j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("payout_eligible")
    private Boolean f36634k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("payout_frequency")
    private String f36635l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("payout_profile_id")
    private String f36636m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("payout_threshold_in_micro_currency")
    private Integer f36637n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("psp_account_ready")
    private Boolean f36638o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("type")
    private String f36639p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("update_time")
    private Integer f36640q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f36641r;

    public /* synthetic */ d20(String str, String str2, Boolean bool, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, Boolean bool2, String str9, String str10, Integer num2, Boolean bool3, String str11, Integer num3, boolean[] zArr, int i13) {
        this(str, str2, bool, str3, str4, num, str5, str6, str7, str8, bool2, str9, str10, num2, bool3, str11, num3, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f36624a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d20 d20Var = (d20) obj;
        return Objects.equals(this.f36640q, d20Var.f36640q) && Objects.equals(this.f36638o, d20Var.f36638o) && Objects.equals(this.f36637n, d20Var.f36637n) && Objects.equals(this.f36634k, d20Var.f36634k) && Objects.equals(this.f36629f, d20Var.f36629f) && Objects.equals(this.f36626c, d20Var.f36626c) && Objects.equals(this.f36624a, d20Var.f36624a) && Objects.equals(this.f36625b, d20Var.f36625b) && Objects.equals(this.f36627d, d20Var.f36627d) && Objects.equals(this.f36628e, d20Var.f36628e) && Objects.equals(this.f36630g, d20Var.f36630g) && Objects.equals(this.f36631h, d20Var.f36631h) && Objects.equals(this.f36632i, d20Var.f36632i) && Objects.equals(this.f36633j, d20Var.f36633j) && Objects.equals(this.f36635l, d20Var.f36635l) && Objects.equals(this.f36636m, d20Var.f36636m) && Objects.equals(this.f36639p, d20Var.f36639p);
    }

    public final int hashCode() {
        return Objects.hash(this.f36624a, this.f36625b, this.f36626c, this.f36627d, this.f36628e, this.f36629f, this.f36630g, this.f36631h, this.f36632i, this.f36633j, this.f36634k, this.f36635l, this.f36636m, this.f36637n, this.f36638o, this.f36639p, this.f36640q);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36625b;
    }

    public d20() {
        this.f36641r = new boolean[17];
    }

    private d20(@NonNull String str, String str2, Boolean bool, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, Boolean bool2, String str9, String str10, Integer num2, Boolean bool3, String str11, Integer num3, boolean[] zArr) {
        this.f36624a = str;
        this.f36625b = str2;
        this.f36626c = bool;
        this.f36627d = str3;
        this.f36628e = str4;
        this.f36629f = num;
        this.f36630g = str5;
        this.f36631h = str6;
        this.f36632i = str7;
        this.f36633j = str8;
        this.f36634k = bool2;
        this.f36635l = str9;
        this.f36636m = str10;
        this.f36637n = num2;
        this.f36638o = bool3;
        this.f36639p = str11;
        this.f36640q = num3;
        this.f36641r = zArr;
    }
}
