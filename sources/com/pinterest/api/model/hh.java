package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class hh {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38436a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("name")
    private String f38437b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("official_user")
    private wy0 f38438c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f38439d;

    public /* synthetic */ hh(String str, String str2, wy0 wy0Var, boolean[] zArr, int i13) {
        this(str, str2, wy0Var, zArr);
    }

    public final wy0 d() {
        return this.f38438c;
    }

    public final eh e() {
        return new eh(this, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hh hhVar = (hh) obj;
        return Objects.equals(this.f38436a, hhVar.f38436a) && Objects.equals(this.f38437b, hhVar.f38437b) && Objects.equals(this.f38438c, hhVar.f38438c);
    }

    public final int hashCode() {
        return Objects.hash(this.f38436a, this.f38437b, this.f38438c);
    }

    public hh() {
        this.f38439d = new boolean[3];
    }

    private hh(@NonNull String str, String str2, wy0 wy0Var, boolean[] zArr) {
        this.f38436a = str;
        this.f38437b = str2;
        this.f38438c = wy0Var;
        this.f38439d = zArr;
    }
}
