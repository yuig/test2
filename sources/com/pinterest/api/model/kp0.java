package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class kp0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f39507a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("block_style")
    private zk0 f39508b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("style")
    private iq0 f39509c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("text")
    private String f39510d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("type")
    private String f39511e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39512f;

    public /* synthetic */ kp0(Integer num, zk0 zk0Var, iq0 iq0Var, String str, String str2, boolean[] zArr, int i13) {
        this(num, zk0Var, iq0Var, str, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kp0 kp0Var = (kp0) obj;
        return Objects.equals(this.f39507a, kp0Var.f39507a) && Objects.equals(this.f39508b, kp0Var.f39508b) && Objects.equals(this.f39509c, kp0Var.f39509c) && Objects.equals(this.f39510d, kp0Var.f39510d) && Objects.equals(this.f39511e, kp0Var.f39511e);
    }

    public final zk0 f() {
        return this.f39508b;
    }

    public final iq0 g() {
        return this.f39509c;
    }

    public final String h() {
        return this.f39510d;
    }

    public final int hashCode() {
        return Objects.hash(this.f39507a, this.f39508b, this.f39509c, this.f39510d, this.f39511e);
    }

    public kp0() {
        this.f39512f = new boolean[5];
    }

    private kp0(Integer num, zk0 zk0Var, iq0 iq0Var, @NonNull String str, String str2, boolean[] zArr) {
        this.f39507a = num;
        this.f39508b = zk0Var;
        this.f39509c = iq0Var;
        this.f39510d = str;
        this.f39511e = str2;
        this.f39512f = zArr;
    }
}
