package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class km0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f39492a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("block_style")
    private zk0 f39493b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("image")
    private om0 f39494c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("image_signature")
    private String f39495d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("type")
    private String f39496e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f39497f;

    public /* synthetic */ km0(Integer num, zk0 zk0Var, om0 om0Var, String str, String str2, boolean[] zArr, int i13) {
        this(num, zk0Var, om0Var, str, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        km0 km0Var = (km0) obj;
        return Objects.equals(this.f39492a, km0Var.f39492a) && Objects.equals(this.f39493b, km0Var.f39493b) && Objects.equals(this.f39494c, km0Var.f39494c) && Objects.equals(this.f39495d, km0Var.f39495d) && Objects.equals(this.f39496e, km0Var.f39496e);
    }

    public final zk0 f() {
        return this.f39493b;
    }

    public final om0 g() {
        return this.f39494c;
    }

    public final int hashCode() {
        return Objects.hash(this.f39492a, this.f39493b, this.f39494c, this.f39495d, this.f39496e);
    }

    public km0() {
        this.f39497f = new boolean[5];
    }

    private km0(Integer num, zk0 zk0Var, om0 om0Var, @NonNull String str, String str2, boolean[] zArr) {
        this.f39492a = num;
        this.f39493b = zk0Var;
        this.f39494c = om0Var;
        this.f39495d = str;
        this.f39496e = str2;
        this.f39497f = zArr;
    }
}
