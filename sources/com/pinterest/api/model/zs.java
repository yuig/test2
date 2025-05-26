package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class zs implements fl1.d, dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44429a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44430b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_color")
    private String f44431c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("best_pins_images")
    private List<sr> f44432d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("category_id")
    private String f44433e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("feed_update_time")
    private Date f44434f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("follower_count")
    private Integer f44435g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("image_signature")
    private String f44436h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("images")
    private Map<String, sr> f44437i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("is_followed")
    private Boolean f44438j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("key")
    private String f44439k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("name")
    private String f44440l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("recommendation_source")
    private String f44441m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("tv_interest")
    private fx0 f44442n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("url_name")
    private String f44443o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f44444p;

    public /* synthetic */ zs(String str, String str2, String str3, List list, String str4, Date date, Integer num, String str5, Map map, Boolean bool, String str6, String str7, String str8, fx0 fx0Var, String str9, boolean[] zArr, int i13) {
        this(str, str2, str3, list, str4, date, num, str5, map, bool, str6, str7, str8, fx0Var, str9, zArr);
    }

    public final String A() {
        return this.f44433e;
    }

    public final Map B() {
        return this.f44437i;
    }

    public final Boolean C() {
        Boolean bool = this.f44438j;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String D() {
        return this.f44440l;
    }

    public final String E() {
        return this.f44441m;
    }

    public final String F() {
        return this.f44443o;
    }

    @Override // fl1.d
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final zs a(zs zsVar) {
        if (this == zsVar) {
            return this;
        }
        ws wsVar = new ws(this, 0);
        boolean[] zArr = zsVar.f44444p;
        int length = zArr.length;
        boolean[] zArr2 = wsVar.f43368p;
        if (length > 0 && zArr[0]) {
            wsVar.f43353a = zsVar.f44429a;
            zArr2[0] = true;
        }
        if (zArr.length > 1 && zArr[1]) {
            wsVar.f43354b = zsVar.f44430b;
            zArr2[1] = true;
        }
        if (zArr.length > 2 && zArr[2]) {
            wsVar.f43355c = zsVar.f44431c;
            zArr2[2] = true;
        }
        if (zArr.length > 3 && zArr[3]) {
            wsVar.f43356d = zsVar.f44432d;
            zArr2[3] = true;
        }
        if (zArr.length > 4 && zArr[4]) {
            wsVar.f43357e = zsVar.f44433e;
            zArr2[4] = true;
        }
        if (zArr.length > 5 && zArr[5]) {
            wsVar.f43358f = zsVar.f44434f;
            zArr2[5] = true;
        }
        if (zArr.length > 6 && zArr[6]) {
            wsVar.f43359g = zsVar.f44435g;
            zArr2[6] = true;
        }
        if (zArr.length > 7 && zArr[7]) {
            wsVar.f43360h = zsVar.f44436h;
            zArr2[7] = true;
        }
        if (zArr.length > 8 && zArr[8]) {
            wsVar.f43361i = zsVar.f44437i;
            zArr2[8] = true;
        }
        if (zArr.length > 9 && zArr[9]) {
            wsVar.f43362j = zsVar.f44438j;
            zArr2[9] = true;
        }
        if (zArr.length > 10 && zArr[10]) {
            wsVar.f43363k = zsVar.f44439k;
            zArr2[10] = true;
        }
        if (zArr.length > 11 && zArr[11]) {
            wsVar.f43364l = zsVar.f44440l;
            zArr2[11] = true;
        }
        if (zArr.length > 12 && zArr[12]) {
            wsVar.f43365m = zsVar.f44441m;
            zArr2[12] = true;
        }
        if (zArr.length > 13 && zArr[13]) {
            wsVar.f43366n = zsVar.f44442n;
            zArr2[13] = true;
        }
        if (zArr.length > 14 && zArr[14]) {
            wsVar.f43367o = zsVar.f44443o;
            zArr2[14] = true;
        }
        return wsVar.a();
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f44429a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zs zsVar = (zs) obj;
        return Objects.equals(this.f44438j, zsVar.f44438j) && Objects.equals(this.f44435g, zsVar.f44435g) && Objects.equals(this.f44429a, zsVar.f44429a) && Objects.equals(this.f44430b, zsVar.f44430b) && Objects.equals(this.f44431c, zsVar.f44431c) && Objects.equals(this.f44432d, zsVar.f44432d) && Objects.equals(this.f44433e, zsVar.f44433e) && Objects.equals(this.f44434f, zsVar.f44434f) && Objects.equals(this.f44436h, zsVar.f44436h) && Objects.equals(this.f44437i, zsVar.f44437i) && Objects.equals(this.f44439k, zsVar.f44439k) && Objects.equals(this.f44440l, zsVar.f44440l) && Objects.equals(this.f44441m, zsVar.f44441m) && Objects.equals(this.f44442n, zsVar.f44442n) && Objects.equals(this.f44443o, zsVar.f44443o);
    }

    public final int hashCode() {
        return Objects.hash(this.f44429a, this.f44430b, this.f44431c, this.f44432d, this.f44433e, this.f44434f, this.f44435g, this.f44436h, this.f44437i, this.f44438j, this.f44439k, this.f44440l, this.f44441m, this.f44442n, this.f44443o);
    }

    @Override // dl1.s
    public final String o() {
        return this.f44430b;
    }

    public final String z() {
        return this.f44431c;
    }

    public zs() {
        this.f44444p = new boolean[15];
    }

    private zs(@NonNull String str, String str2, String str3, List<sr> list, String str4, Date date, Integer num, String str5, Map<String, sr> map, Boolean bool, String str6, String str7, String str8, fx0 fx0Var, String str9, boolean[] zArr) {
        this.f44429a = str;
        this.f44430b = str2;
        this.f44431c = str3;
        this.f44432d = list;
        this.f44433e = str4;
        this.f44434f = date;
        this.f44435g = num;
        this.f44436h = str5;
        this.f44437i = map;
        this.f44438j = bool;
        this.f44439k = str6;
        this.f44440l = str7;
        this.f44441m = str8;
        this.f44442n = fx0Var;
        this.f44443o = str9;
        this.f44444p = zArr;
    }
}
