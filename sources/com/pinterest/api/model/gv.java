package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class gv {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("credentials")
    private yu f38155a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @om.b("upload_space")
    private jy0 f38156b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38157c;

    public /* synthetic */ gv(yu yuVar, jy0 jy0Var, boolean[] zArr, int i13) {
        this(yuVar, jy0Var, zArr);
    }

    public final yu c() {
        return this.f38155a;
    }

    public final jy0 d() {
        return this.f38156b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gv gvVar = (gv) obj;
        return Objects.equals(this.f38155a, gvVar.f38155a) && Objects.equals(this.f38156b, gvVar.f38156b);
    }

    public final int hashCode() {
        return Objects.hash(this.f38155a, this.f38156b);
    }

    public gv() {
        this.f38157c = new boolean[2];
    }

    private gv(@NonNull yu yuVar, @NonNull jy0 jy0Var, boolean[] zArr) {
        this.f38155a = yuVar;
        this.f38156b = jy0Var;
        this.f38157c = zArr;
    }
}
