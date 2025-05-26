package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class ke {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39418a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("sender")
    private wy0 f39419b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39420c;

    public /* synthetic */ ke(String str, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, wy0Var, zArr);
    }

    public final wy0 c() {
        return this.f39419b;
    }

    public final String d() {
        return this.f39418a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ke keVar = (ke) obj;
        return Objects.equals(this.f39418a, keVar.f39418a) && Objects.equals(this.f39419b, keVar.f39419b);
    }

    public final int hashCode() {
        return Objects.hash(this.f39418a, this.f39419b);
    }

    public ke() {
        this.f39420c = new boolean[2];
    }

    private ke(@NonNull String str, wy0 wy0Var, boolean[] zArr) {
        this.f39418a = str;
        this.f39419b = wy0Var;
        this.f39420c = zArr;
    }
}
