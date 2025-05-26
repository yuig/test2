package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class gm0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f38085a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("block_style")
    private zk0 f38086b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("level")
    private Integer f38087c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("style")
    private iq0 f38088d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("text")
    private String f38089e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("type")
    private String f38090f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38091g;

    public /* synthetic */ gm0(Integer num, zk0 zk0Var, Integer num2, iq0 iq0Var, String str, String str2, boolean[] zArr, int i13) {
        this(num, zk0Var, num2, iq0Var, str, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gm0 gm0Var = (gm0) obj;
        return Objects.equals(this.f38087c, gm0Var.f38087c) && Objects.equals(this.f38085a, gm0Var.f38085a) && Objects.equals(this.f38086b, gm0Var.f38086b) && Objects.equals(this.f38088d, gm0Var.f38088d) && Objects.equals(this.f38089e, gm0Var.f38089e) && Objects.equals(this.f38090f, gm0Var.f38090f);
    }

    public final zk0 g() {
        return this.f38086b;
    }

    public final iq0 h() {
        return this.f38088d;
    }

    public final int hashCode() {
        return Objects.hash(this.f38085a, this.f38086b, this.f38087c, this.f38088d, this.f38089e, this.f38090f);
    }

    public final String i() {
        return this.f38089e;
    }

    public gm0() {
        this.f38091g = new boolean[6];
    }

    private gm0(Integer num, zk0 zk0Var, Integer num2, iq0 iq0Var, @NonNull String str, String str2, boolean[] zArr) {
        this.f38085a = num;
        this.f38086b = zk0Var;
        this.f38087c = num2;
        this.f38088d = iq0Var;
        this.f38089e = str;
        this.f38090f = str2;
        this.f38091g = zArr;
    }
}
