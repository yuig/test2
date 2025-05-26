package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ps0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41078a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41079b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("fps")
    private Integer f41080c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("frames_amount")
    private Integer f41081d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("timeline_objects")
    private List<pu0> f41082e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41083f;

    public /* synthetic */ ps0(String str, String str2, Integer num, Integer num2, List list, boolean[] zArr, int i13) {
        this(str, str2, num, num2, list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ps0 ps0Var = (ps0) obj;
        return Objects.equals(this.f41081d, ps0Var.f41081d) && Objects.equals(this.f41080c, ps0Var.f41080c) && Objects.equals(this.f41078a, ps0Var.f41078a) && Objects.equals(this.f41079b, ps0Var.f41079b) && Objects.equals(this.f41082e, ps0Var.f41082e);
    }

    public final Integer f() {
        Integer num = this.f41080c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer g() {
        Integer num = this.f41081d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List h() {
        return this.f41082e;
    }

    public final int hashCode() {
        return Objects.hash(this.f41078a, this.f41079b, this.f41080c, this.f41081d, this.f41082e);
    }

    public ps0() {
        this.f41083f = new boolean[5];
    }

    private ps0(@NonNull String str, String str2, Integer num, Integer num2, @NonNull List<pu0> list, boolean[] zArr) {
        this.f41078a = str;
        this.f41079b = str2;
        this.f41080c = num;
        this.f41081d = num2;
        this.f41082e = list;
        this.f41083f = zArr;
    }
}
