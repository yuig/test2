package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class kg0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39427a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39428b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("board")
    private v7 f39429c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("created_at")
    private Date f39430d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("description")
    private String f39431e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("image")
    private Map<String, sr> f39432f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("image_signature")
    private String f39433g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("link")
    private String f39434h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("metadata_attributes")
    private rg0 f39435i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("model_type")
    private a f39436j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("scheduled_ts")
    private Integer f39437k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("scheduled_type")
    private Integer f39438l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("section")
    private ba f39439m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("status")
    private b f39440n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("title")
    private String f39441o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("type")
    private String f39442p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("user")
    private wy0 f39443q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("video")
    private b01 f39444r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("video_signature")
    private String f39445s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f39446t;

    /* loaded from: classes3.dex */
    public enum a {
        STANDARD_PIN(0),
        IDEA_PIN(1);

        private final int value;

        a(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        READY(0),
        EDIT_REQUIRED(1);

        private final int value;

        b(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ kg0(String str, String str2, v7 v7Var, Date date, String str3, Map map, String str4, String str5, rg0 rg0Var, a aVar, Integer num, Integer num2, ba baVar, b bVar, String str6, String str7, wy0 wy0Var, b01 b01Var, String str8, boolean[] zArr, int i13) {
        this(str, str2, v7Var, date, str3, map, str4, str5, rg0Var, aVar, num, num2, baVar, bVar, str6, str7, wy0Var, b01Var, str8, zArr);
    }

    public final v7 C() {
        return this.f39429c;
    }

    public final Map D() {
        return this.f39432f;
    }

    public final rg0 E() {
        return this.f39435i;
    }

    public final a F() {
        return this.f39436j;
    }

    public final Integer G() {
        Integer num = this.f39437k;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final ba H() {
        return this.f39439m;
    }

    public final wy0 I() {
        return this.f39443q;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f39427a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kg0 kg0Var = (kg0) obj;
        return Objects.equals(this.f39440n, kg0Var.f39440n) && Objects.equals(this.f39438l, kg0Var.f39438l) && Objects.equals(this.f39437k, kg0Var.f39437k) && Objects.equals(this.f39436j, kg0Var.f39436j) && Objects.equals(this.f39427a, kg0Var.f39427a) && Objects.equals(this.f39428b, kg0Var.f39428b) && Objects.equals(this.f39429c, kg0Var.f39429c) && Objects.equals(this.f39430d, kg0Var.f39430d) && Objects.equals(this.f39431e, kg0Var.f39431e) && Objects.equals(this.f39432f, kg0Var.f39432f) && Objects.equals(this.f39433g, kg0Var.f39433g) && Objects.equals(this.f39434h, kg0Var.f39434h) && Objects.equals(this.f39435i, kg0Var.f39435i) && Objects.equals(this.f39439m, kg0Var.f39439m) && Objects.equals(this.f39441o, kg0Var.f39441o) && Objects.equals(this.f39442p, kg0Var.f39442p) && Objects.equals(this.f39443q, kg0Var.f39443q) && Objects.equals(this.f39444r, kg0Var.f39444r) && Objects.equals(this.f39445s, kg0Var.f39445s);
    }

    public final int hashCode() {
        return Objects.hash(this.f39427a, this.f39428b, this.f39429c, this.f39430d, this.f39431e, this.f39432f, this.f39433g, this.f39434h, this.f39435i, this.f39436j, this.f39437k, this.f39438l, this.f39439m, this.f39440n, this.f39441o, this.f39442p, this.f39443q, this.f39444r, this.f39445s);
    }

    @Override // dl1.s
    public final String o() {
        return this.f39428b;
    }

    public kg0() {
        this.f39446t = new boolean[19];
    }

    private kg0(@NonNull String str, String str2, v7 v7Var, Date date, String str3, Map<String, sr> map, String str4, String str5, rg0 rg0Var, a aVar, Integer num, Integer num2, ba baVar, b bVar, String str6, String str7, wy0 wy0Var, b01 b01Var, String str8, boolean[] zArr) {
        this.f39427a = str;
        this.f39428b = str2;
        this.f39429c = v7Var;
        this.f39430d = date;
        this.f39431e = str3;
        this.f39432f = map;
        this.f39433g = str4;
        this.f39434h = str5;
        this.f39435i = rg0Var;
        this.f39436j = aVar;
        this.f39437k = num;
        this.f39438l = num2;
        this.f39439m = baVar;
        this.f39440n = bVar;
        this.f39441o = str6;
        this.f39442p = str7;
        this.f39443q = wy0Var;
        this.f39444r = b01Var;
        this.f39445s = str8;
        this.f39446t = zArr;
    }
}
