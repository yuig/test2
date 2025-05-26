package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class pi0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40994a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40995b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("effect_data")
    private Map<String, Object> f40996c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("images")
    private Map<String, sr> f40997d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("item_type")
    private a f40998e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("mask")
    private String f40999f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("offset")
    private List<Object> f41000g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("pin")
    private f30 f41001h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("rotation")
    private Double f41002i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("scale")
    private Double f41003j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("shuffle_asset")
    private hi0 f41004k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("shuffle_item_image")
    private vi0 f41005l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("template_config")
    private zi0 f41006m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("text")
    private dj0 f41007n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f41008o;

    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        PIN(1),
        TEXT(2),
        IMAGE(3);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ pi0(String str, String str2, Map map, Map map2, a aVar, String str3, List list, f30 f30Var, Double d2, Double d13, hi0 hi0Var, vi0 vi0Var, zi0 zi0Var, dj0 dj0Var, boolean[] zArr, int i13) {
        this(str, str2, map, map2, aVar, str3, list, f30Var, d2, d13, hi0Var, vi0Var, zi0Var, dj0Var, zArr);
    }

    public final String A() {
        return this.f40999f;
    }

    public final List B() {
        return this.f41000g;
    }

    public final f30 C() {
        return this.f41001h;
    }

    public final Double D() {
        Double d2 = this.f41002i;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double E() {
        Double d2 = this.f41003j;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final hi0 F() {
        return this.f41004k;
    }

    public final vi0 G() {
        return this.f41005l;
    }

    public final zi0 H() {
        return this.f41006m;
    }

    public final dj0 I() {
        return this.f41007n;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f40994a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pi0 pi0Var = (pi0) obj;
        return Objects.equals(this.f41003j, pi0Var.f41003j) && Objects.equals(this.f41002i, pi0Var.f41002i) && Objects.equals(this.f40998e, pi0Var.f40998e) && Objects.equals(this.f40994a, pi0Var.f40994a) && Objects.equals(this.f40995b, pi0Var.f40995b) && Objects.equals(this.f40996c, pi0Var.f40996c) && Objects.equals(this.f40997d, pi0Var.f40997d) && Objects.equals(this.f40999f, pi0Var.f40999f) && Objects.equals(this.f41000g, pi0Var.f41000g) && Objects.equals(this.f41001h, pi0Var.f41001h) && Objects.equals(this.f41004k, pi0Var.f41004k) && Objects.equals(this.f41005l, pi0Var.f41005l) && Objects.equals(this.f41006m, pi0Var.f41006m) && Objects.equals(this.f41007n, pi0Var.f41007n);
    }

    public final int hashCode() {
        return Objects.hash(this.f40994a, this.f40995b, this.f40996c, this.f40997d, this.f40998e, this.f40999f, this.f41000g, this.f41001h, this.f41002i, this.f41003j, this.f41004k, this.f41005l, this.f41006m, this.f41007n);
    }

    @Override // dl1.s
    public final String o() {
        return this.f40995b;
    }

    public final Map x() {
        return this.f40996c;
    }

    public final Map y() {
        return this.f40997d;
    }

    public final a z() {
        return this.f40998e;
    }

    public pi0() {
        this.f41008o = new boolean[14];
    }

    private pi0(@NonNull String str, String str2, Map<String, Object> map, Map<String, sr> map2, a aVar, String str3, List<Object> list, f30 f30Var, Double d2, Double d13, hi0 hi0Var, vi0 vi0Var, zi0 zi0Var, dj0 dj0Var, boolean[] zArr) {
        this.f40994a = str;
        this.f40995b = str2;
        this.f40996c = map;
        this.f40997d = map2;
        this.f40998e = aVar;
        this.f40999f = str3;
        this.f41000g = list;
        this.f41001h = f30Var;
        this.f41002i = d2;
        this.f41003j = d13;
        this.f41004k = hi0Var;
        this.f41005l = vi0Var;
        this.f41006m = zi0Var;
        this.f41007n = dj0Var;
        this.f41008o = zArr;
    }
}
