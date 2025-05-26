package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class vi0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42880a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42881b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("user")
    private wy0 f42882c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f42883d;

    public /* synthetic */ vi0(String str, String str2, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, str2, wy0Var, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        return this.f42880a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vi0 vi0Var = (vi0) obj;
        return Objects.equals(this.f42880a, vi0Var.f42880a) && Objects.equals(this.f42881b, vi0Var.f42881b) && Objects.equals(this.f42882c, vi0Var.f42882c);
    }

    public final wy0 g() {
        return this.f42882c;
    }

    public final int hashCode() {
        return Objects.hash(this.f42880a, this.f42881b, this.f42882c);
    }

    @Override // dl1.s
    public final String o() {
        return this.f42881b;
    }

    public vi0() {
        this.f42883d = new boolean[3];
    }

    private vi0(@NonNull String str, String str2, wy0 wy0Var, boolean[] zArr) {
        this.f42880a = str;
        this.f42881b = str2;
        this.f42882c = wy0Var;
        this.f42883d = zArr;
    }
}
