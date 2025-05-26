package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ce0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("alignment")
    private Integer f36394a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("color")
    private String f36395b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("font_id")
    private Integer f36396c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("font_size")
    private Double f36397d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("hex_color")
    private String f36398e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("highlight_color")
    private String f36399f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("vertical_alignment")
    private Integer f36400g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36401h;

    public /* synthetic */ ce0(Integer num, String str, Integer num2, Double d2, String str2, String str3, Integer num3, boolean[] zArr, int i13) {
        this(num, str, num2, d2, str2, str3, num3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ce0 ce0Var = (ce0) obj;
        return Objects.equals(this.f36400g, ce0Var.f36400g) && Objects.equals(this.f36397d, ce0Var.f36397d) && Objects.equals(this.f36396c, ce0Var.f36396c) && Objects.equals(this.f36394a, ce0Var.f36394a) && Objects.equals(this.f36395b, ce0Var.f36395b) && Objects.equals(this.f36398e, ce0Var.f36398e) && Objects.equals(this.f36399f, ce0Var.f36399f);
    }

    public final int hashCode() {
        return Objects.hash(this.f36394a, this.f36395b, this.f36396c, this.f36397d, this.f36398e, this.f36399f, this.f36400g);
    }

    public ce0() {
        this.f36401h = new boolean[7];
    }

    private ce0(Integer num, String str, Integer num2, Double d2, String str2, String str3, Integer num3, boolean[] zArr) {
        this.f36394a = num;
        this.f36395b = str;
        this.f36396c = num2;
        this.f36397d = d2;
        this.f36398e = str2;
        this.f36399f = str3;
        this.f36400g = num3;
        this.f36401h = zArr;
    }
}
