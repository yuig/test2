package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class v90 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("question_field_type")
    private Integer f42795a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("question_label")
    private String f42796b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("question_options")
    private List<String> f42797c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("question_type")
    private Integer f42798d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42799e;

    public /* synthetic */ v90(Integer num, String str, List list, Integer num2, boolean[] zArr, int i13) {
        this(num, str, list, num2, zArr);
    }

    public final Integer e() {
        Integer num = this.f42795a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v90 v90Var = (v90) obj;
        return Objects.equals(this.f42798d, v90Var.f42798d) && Objects.equals(this.f42795a, v90Var.f42795a) && Objects.equals(this.f42796b, v90Var.f42796b) && Objects.equals(this.f42797c, v90Var.f42797c);
    }

    public final String f() {
        return this.f42796b;
    }

    public final List g() {
        return this.f42797c;
    }

    public final Integer h() {
        Integer num = this.f42798d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f42795a, this.f42796b, this.f42797c, this.f42798d);
    }

    public v90() {
        this.f42799e = new boolean[4];
    }

    private v90(Integer num, String str, List<String> list, Integer num2, boolean[] zArr) {
        this.f42795a = num;
        this.f42796b = str;
        this.f42797c = list;
        this.f42798d = num2;
        this.f42799e = zArr;
    }
}
