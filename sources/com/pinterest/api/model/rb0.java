package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class rb0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41534a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41535b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("layout_type")
    private Integer f41536c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("num_columns")
    private Integer f41537d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("objects")
    private List<ob0> f41538e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41539f;

    public /* synthetic */ rb0(String str, String str2, Integer num, Integer num2, List list, boolean[] zArr, int i13) {
        this(str, str2, num, num2, list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        return Objects.equals(this.f41537d, rb0Var.f41537d) && Objects.equals(this.f41536c, rb0Var.f41536c) && Objects.equals(this.f41534a, rb0Var.f41534a) && Objects.equals(this.f41535b, rb0Var.f41535b) && Objects.equals(this.f41538e, rb0Var.f41538e);
    }

    public final Integer f() {
        Integer num = this.f41536c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer g() {
        Integer num = this.f41537d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List h() {
        return this.f41538e;
    }

    public final int hashCode() {
        return Objects.hash(this.f41534a, this.f41535b, this.f41536c, this.f41537d, this.f41538e);
    }

    public rb0() {
        this.f41539f = new boolean[5];
    }

    private rb0(@NonNull String str, String str2, Integer num, Integer num2, List<ob0> list, boolean[] zArr) {
        this.f41534a = str;
        this.f41535b = str2;
        this.f41536c = num;
        this.f41537d = num2;
        this.f41538e = list;
        this.f41539f = zArr;
    }
}
