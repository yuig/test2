package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class u3 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42397a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42398b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("date")
    private String f42399c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("metrics")
    private y3 f42400d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("overall_data_status")
    private String f42401e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42402f;

    public /* synthetic */ u3(String str, String str2, String str3, y3 y3Var, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, y3Var, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return Objects.equals(this.f42397a, u3Var.f42397a) && Objects.equals(this.f42398b, u3Var.f42398b) && Objects.equals(this.f42399c, u3Var.f42399c) && Objects.equals(this.f42400d, u3Var.f42400d) && Objects.equals(this.f42401e, u3Var.f42401e);
    }

    public final String f() {
        return this.f42399c;
    }

    public final y3 g() {
        return this.f42400d;
    }

    public final int hashCode() {
        return Objects.hash(this.f42397a, this.f42398b, this.f42399c, this.f42400d, this.f42401e);
    }

    public u3() {
        this.f42402f = new boolean[5];
    }

    private u3(@NonNull String str, String str2, String str3, y3 y3Var, String str4, boolean[] zArr) {
        this.f42397a = str;
        this.f42398b = str2;
        this.f42399c = str3;
        this.f42400d = y3Var;
        this.f42401e = str4;
        this.f42402f = zArr;
    }
}
