package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class s50 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("bbox_height")
    private Double f41783a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("bbox_width")
    private Double f41784b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("pin_tag_key")
    private String f41785c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("pins")
    private List<f30> f41786d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("visible_in_grid")
    private Boolean f41787e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("x_percent")
    private Double f41788f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("y_percent")
    private Double f41789g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f41790h;

    public /* synthetic */ s50(Double d2, Double d13, String str, List list, Boolean bool, Double d14, Double d15, boolean[] zArr, int i13) {
        this(d2, d13, str, list, bool, d14, d15, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s50 s50Var = (s50) obj;
        return Objects.equals(this.f41789g, s50Var.f41789g) && Objects.equals(this.f41788f, s50Var.f41788f) && Objects.equals(this.f41787e, s50Var.f41787e) && Objects.equals(this.f41784b, s50Var.f41784b) && Objects.equals(this.f41783a, s50Var.f41783a) && Objects.equals(this.f41785c, s50Var.f41785c) && Objects.equals(this.f41786d, s50Var.f41786d);
    }

    public final int hashCode() {
        return Objects.hash(this.f41783a, this.f41784b, this.f41785c, this.f41786d, this.f41787e, this.f41788f, this.f41789g);
    }

    public s50() {
        this.f41790h = new boolean[7];
    }

    private s50(Double d2, Double d13, String str, List<f30> list, Boolean bool, Double d14, Double d15, boolean[] zArr) {
        this.f41783a = d2;
        this.f41784b = d13;
        this.f41785c = str;
        this.f41786d = list;
        this.f41787e = bool;
        this.f41788f = d14;
        this.f41789g = d15;
        this.f41790h = zArr;
    }
}
