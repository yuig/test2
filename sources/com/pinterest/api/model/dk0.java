package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class dk0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36862a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36863b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("args")
    private Map<String, Object> f36864c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("full_feed_title")
    private String f36865d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("landing_page_header_style")
    private Integer f36866e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("location")
    private a f36867f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("pins_display")
    private Integer f36868g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("quick_save_icon")
    private Integer f36869h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("request_params")
    private String f36870i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("style")
    private b f36871j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("text")
    private String f36872k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("url")
    private String f36873l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("user")
    private wy0 f36874m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("view_parameter_type")
    private Integer f36875n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f36876o;

    /* loaded from: classes3.dex */
    public enum a {
        NONE(0),
        FOOTER(1),
        HEADER(2),
        END(3),
        HEADER_AND_END_OVERFLOW(4);

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
        STANDARD(0),
        COMMERCE(1),
        USER(2),
        ARROW_INDICATOR_ICON(3);

        private final int value;

        b(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public /* synthetic */ dk0(String str, String str2, Map map, String str3, Integer num, a aVar, Integer num2, Integer num3, String str4, b bVar, String str5, String str6, wy0 wy0Var, Integer num4, boolean[] zArr, int i13) {
        this(str, str2, map, str3, num, aVar, num2, num3, str4, bVar, str5, str6, wy0Var, num4, zArr);
    }

    public final String A() {
        return this.f36870i;
    }

    public final String B() {
        return this.f36873l;
    }

    public final Integer C() {
        Integer num = this.f36875n;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    @Override // dl1.s
    public final String b() {
        return this.f36862a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dk0 dk0Var = (dk0) obj;
        return Objects.equals(this.f36875n, dk0Var.f36875n) && Objects.equals(this.f36871j, dk0Var.f36871j) && Objects.equals(this.f36869h, dk0Var.f36869h) && Objects.equals(this.f36868g, dk0Var.f36868g) && Objects.equals(this.f36867f, dk0Var.f36867f) && Objects.equals(this.f36866e, dk0Var.f36866e) && Objects.equals(this.f36862a, dk0Var.f36862a) && Objects.equals(this.f36863b, dk0Var.f36863b) && Objects.equals(this.f36864c, dk0Var.f36864c) && Objects.equals(this.f36865d, dk0Var.f36865d) && Objects.equals(this.f36870i, dk0Var.f36870i) && Objects.equals(this.f36872k, dk0Var.f36872k) && Objects.equals(this.f36873l, dk0Var.f36873l) && Objects.equals(this.f36874m, dk0Var.f36874m);
    }

    public final int hashCode() {
        return Objects.hash(this.f36862a, this.f36863b, this.f36864c, this.f36865d, this.f36866e, this.f36867f, this.f36868g, this.f36869h, this.f36870i, this.f36871j, this.f36872k, this.f36873l, this.f36874m, this.f36875n);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36863b;
    }

    public final Integer x() {
        Integer num = this.f36866e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer y() {
        Integer num = this.f36868g;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer z() {
        Integer num = this.f36869h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public dk0() {
        this.f36876o = new boolean[14];
    }

    private dk0(@NonNull String str, String str2, Map<String, Object> map, String str3, Integer num, a aVar, Integer num2, Integer num3, String str4, b bVar, String str5, String str6, wy0 wy0Var, Integer num4, boolean[] zArr) {
        this.f36862a = str;
        this.f36863b = str2;
        this.f36864c = map;
        this.f36865d = str3;
        this.f36866e = num;
        this.f36867f = aVar;
        this.f36868g = num2;
        this.f36869h = num3;
        this.f36870i = str4;
        this.f36871j = bVar;
        this.f36872k = str5;
        this.f36873l = str6;
        this.f36874m = wy0Var;
        this.f36875n = num4;
        this.f36876o = zArr;
    }
}
