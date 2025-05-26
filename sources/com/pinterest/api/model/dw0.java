package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class dw0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36978a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36979b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("header")
    private String f36980c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("text")
    private String f36981d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36982e;

    public /* synthetic */ dw0(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f36980c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dw0 dw0Var = (dw0) obj;
        return Objects.equals(this.f36978a, dw0Var.f36978a) && Objects.equals(this.f36979b, dw0Var.f36979b) && Objects.equals(this.f36980c, dw0Var.f36980c) && Objects.equals(this.f36981d, dw0Var.f36981d);
    }

    public final String f() {
        return this.f36981d;
    }

    public final int hashCode() {
        return Objects.hash(this.f36978a, this.f36979b, this.f36980c, this.f36981d);
    }

    public dw0() {
        this.f36982e = new boolean[4];
    }

    private dw0(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f36978a = str;
        this.f36979b = str2;
        this.f36980c = str3;
        this.f36981d = str4;
        this.f36982e = zArr;
    }
}
