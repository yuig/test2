package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class nv0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40508a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40509b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("prefilled_value")
    private String f40510c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("scale_policy")
    private Integer f40511d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("supported_types")
    private List<Integer> f40512e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40513f;

    public /* synthetic */ nv0(String str, String str2, String str3, Integer num, List list, boolean[] zArr, int i13) {
        this(str, str2, str3, num, list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        return Objects.equals(this.f40511d, nv0Var.f40511d) && Objects.equals(this.f40508a, nv0Var.f40508a) && Objects.equals(this.f40509b, nv0Var.f40509b) && Objects.equals(this.f40510c, nv0Var.f40510c) && Objects.equals(this.f40512e, nv0Var.f40512e);
    }

    public final String f() {
        return this.f40510c;
    }

    public final int hashCode() {
        return Objects.hash(this.f40508a, this.f40509b, this.f40510c, this.f40511d, this.f40512e);
    }

    public nv0() {
        this.f40513f = new boolean[5];
    }

    private nv0(@NonNull String str, String str2, String str3, Integer num, @NonNull List<Integer> list, boolean[] zArr) {
        this.f40508a = str;
        this.f40509b = str2;
        this.f40510c = str3;
        this.f40511d = num;
        this.f40512e = list;
        this.f40513f = zArr;
    }
}
