package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class sm0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f41938a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("amt")
    private String f41939b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f41940c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("type")
    private String f41941d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("unit")
    private String f41942e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41943f;

    public /* synthetic */ sm0(Integer num, String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(num, str, str2, str3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sm0 sm0Var = (sm0) obj;
        return Objects.equals(this.f41938a, sm0Var.f41938a) && Objects.equals(this.f41939b, sm0Var.f41939b) && Objects.equals(this.f41940c, sm0Var.f41940c) && Objects.equals(this.f41941d, sm0Var.f41941d) && Objects.equals(this.f41942e, sm0Var.f41942e);
    }

    public final String f() {
        return this.f41939b;
    }

    public final String g() {
        return this.f41940c;
    }

    public final String h() {
        return this.f41942e;
    }

    public final int hashCode() {
        return Objects.hash(this.f41938a, this.f41939b, this.f41940c, this.f41941d, this.f41942e);
    }

    public sm0() {
        this.f41943f = new boolean[5];
    }

    private sm0(Integer num, String str, @NonNull String str2, String str3, String str4, boolean[] zArr) {
        this.f41938a = num;
        this.f41939b = str;
        this.f41940c = str2;
        this.f41941d = str3;
        this.f41942e = str4;
        this.f41943f = zArr;
    }
}
