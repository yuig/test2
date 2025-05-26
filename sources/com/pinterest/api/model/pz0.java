package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class pz0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41144a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("official_user")
    private wy0 f41145b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41146c;

    public /* synthetic */ pz0(String str, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, wy0Var, zArr);
    }

    public final wy0 c() {
        return this.f41145b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        return Objects.equals(this.f41144a, pz0Var.f41144a) && Objects.equals(this.f41145b, pz0Var.f41145b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41144a, this.f41145b);
    }

    public pz0() {
        this.f41146c = new boolean[2];
    }

    private pz0(@NonNull String str, wy0 wy0Var, boolean[] zArr) {
        this.f41144a = str;
        this.f41145b = wy0Var;
        this.f41146c = zArr;
    }
}
