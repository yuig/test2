package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class xu0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43793a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43794b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("property_scale")
    private bv0 f43795c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("property_translation")
    private fv0 f43796d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("property_type")
    private Integer f43797e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f43798f;

    public /* synthetic */ xu0(String str, String str2, bv0 bv0Var, fv0 fv0Var, Integer num, boolean[] zArr, int i13) {
        this(str, str2, bv0Var, fv0Var, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xu0 xu0Var = (xu0) obj;
        return Objects.equals(this.f43797e, xu0Var.f43797e) && Objects.equals(this.f43793a, xu0Var.f43793a) && Objects.equals(this.f43794b, xu0Var.f43794b) && Objects.equals(this.f43795c, xu0Var.f43795c) && Objects.equals(this.f43796d, xu0Var.f43796d);
    }

    public final bv0 f() {
        return this.f43795c;
    }

    public final fv0 g() {
        return this.f43796d;
    }

    public final int hashCode() {
        return Objects.hash(this.f43793a, this.f43794b, this.f43795c, this.f43796d, this.f43797e);
    }

    public xu0() {
        this.f43798f = new boolean[5];
    }

    private xu0(@NonNull String str, String str2, bv0 bv0Var, fv0 fv0Var, Integer num, boolean[] zArr) {
        this.f43793a = str;
        this.f43794b = str2;
        this.f43795c = bv0Var;
        this.f43796d = fv0Var;
        this.f43797e = num;
        this.f43798f = zArr;
    }
}
