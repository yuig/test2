package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class st {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41984a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41985b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("dominant_color")
    private String f41986c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_signature")
    private String f41987d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("images")
    private Map<String, sr> f41988e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_editable")
    private Boolean f41989f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("item_id")
    private String f41990g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("link")
    private String f41991h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("pin_id")
    private String f41992i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("price_currency")
    private String f41993j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("price_value")
    private Double f41994k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("title")
    private String f41995l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f41996m;

    public /* synthetic */ st(String str, String str2, String str3, String str4, Map map, Boolean bool, String str5, String str6, String str7, String str8, Double d2, String str9, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, map, bool, str5, str6, str7, str8, d2, str9, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        st stVar = (st) obj;
        return Objects.equals(this.f41994k, stVar.f41994k) && Objects.equals(this.f41989f, stVar.f41989f) && Objects.equals(this.f41984a, stVar.f41984a) && Objects.equals(this.f41985b, stVar.f41985b) && Objects.equals(this.f41986c, stVar.f41986c) && Objects.equals(this.f41987d, stVar.f41987d) && Objects.equals(this.f41988e, stVar.f41988e) && Objects.equals(this.f41990g, stVar.f41990g) && Objects.equals(this.f41991h, stVar.f41991h) && Objects.equals(this.f41992i, stVar.f41992i) && Objects.equals(this.f41993j, stVar.f41993j) && Objects.equals(this.f41995l, stVar.f41995l);
    }

    public final int hashCode() {
        return Objects.hash(this.f41984a, this.f41985b, this.f41986c, this.f41987d, this.f41988e, this.f41989f, this.f41990g, this.f41991h, this.f41992i, this.f41993j, this.f41994k, this.f41995l);
    }

    public final String m() {
        return this.f41986c;
    }

    public final String n() {
        return this.f41987d;
    }

    public final Map o() {
        return this.f41988e;
    }

    public final Boolean p() {
        Boolean bool = this.f41989f;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String q() {
        return this.f41990g;
    }

    public final String r() {
        return this.f41991h;
    }

    public final String s() {
        return this.f41992i;
    }

    public final String t() {
        return this.f41993j;
    }

    public final Double u() {
        Double d2 = this.f41994k;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final boolean v() {
        boolean[] zArr = this.f41996m;
        return zArr.length > 10 && zArr[10];
    }

    public final String w() {
        return this.f41995l;
    }

    public st() {
        this.f41996m = new boolean[12];
    }

    private st(@NonNull String str, String str2, String str3, String str4, Map<String, sr> map, Boolean bool, String str5, String str6, String str7, String str8, Double d2, String str9, boolean[] zArr) {
        this.f41984a = str;
        this.f41985b = str2;
        this.f41986c = str3;
        this.f41987d = str4;
        this.f41988e = map;
        this.f41989f = bool;
        this.f41990g = str5;
        this.f41991h = str6;
        this.f41992i = str7;
        this.f41993j = str8;
        this.f41994k = d2;
        this.f41995l = str9;
        this.f41996m = zArr;
    }
}
