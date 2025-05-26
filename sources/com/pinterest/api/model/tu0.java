package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class tu0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42303a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42304b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("begin_frame")
    private Integer f42305c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("curve")
    private Integer f42306d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("custom_timing")
    private lu0 f42307e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("end_frame")
    private Integer f42308f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    @om.b("property")
    private xu0 f42309g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f42310h;

    public /* synthetic */ tu0(String str, String str2, Integer num, Integer num2, lu0 lu0Var, Integer num3, xu0 xu0Var, boolean[] zArr, int i13) {
        this(str, str2, num, num2, lu0Var, num3, xu0Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tu0 tu0Var = (tu0) obj;
        return Objects.equals(this.f42308f, tu0Var.f42308f) && Objects.equals(this.f42306d, tu0Var.f42306d) && Objects.equals(this.f42305c, tu0Var.f42305c) && Objects.equals(this.f42303a, tu0Var.f42303a) && Objects.equals(this.f42304b, tu0Var.f42304b) && Objects.equals(this.f42307e, tu0Var.f42307e) && Objects.equals(this.f42309g, tu0Var.f42309g);
    }

    public final Integer h() {
        Integer num = this.f42305c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f42303a, this.f42304b, this.f42305c, this.f42306d, this.f42307e, this.f42308f, this.f42309g);
    }

    public final Integer i() {
        Integer num = this.f42308f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final xu0 j() {
        return this.f42309g;
    }

    public tu0() {
        this.f42310h = new boolean[7];
    }

    private tu0(@NonNull String str, String str2, Integer num, Integer num2, lu0 lu0Var, Integer num3, @NonNull xu0 xu0Var, boolean[] zArr) {
        this.f42303a = str;
        this.f42304b = str2;
        this.f42305c = num;
        this.f42306d = num2;
        this.f42307e = lu0Var;
        this.f42308f = num3;
        this.f42309g = xu0Var;
        this.f42310h = zArr;
    }
}
