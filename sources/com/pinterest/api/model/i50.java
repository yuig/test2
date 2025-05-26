package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class i50 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38673a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38674b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("image_url")
    private String f38675c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("pin_id")
    private String f38676d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f38677e;

    public /* synthetic */ i50(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f38675c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i50 i50Var = (i50) obj;
        return Objects.equals(this.f38673a, i50Var.f38673a) && Objects.equals(this.f38674b, i50Var.f38674b) && Objects.equals(this.f38675c, i50Var.f38675c) && Objects.equals(this.f38676d, i50Var.f38676d);
    }

    public final String f() {
        return this.f38676d;
    }

    public final int hashCode() {
        return Objects.hash(this.f38673a, this.f38674b, this.f38675c, this.f38676d);
    }

    public i50() {
        this.f38677e = new boolean[4];
    }

    private i50(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f38673a = str;
        this.f38674b = str2;
        this.f38675c = str3;
        this.f38676d = str4;
        this.f38677e = zArr;
    }
}
