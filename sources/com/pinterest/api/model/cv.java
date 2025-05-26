package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class cv {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("credentials")
    private yu f36535a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f36536b;

    public /* synthetic */ cv(yu yuVar, boolean[] zArr, int i13) {
        this(yuVar, zArr);
    }

    public final yu b() {
        return this.f36535a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f36535a, ((cv) obj).f36535a);
    }

    public final int hashCode() {
        return Objects.hash(this.f36535a);
    }

    public cv() {
        this.f36536b = new boolean[1];
    }

    private cv(@NonNull yu yuVar, boolean[] zArr) {
        this.f36535a = yuVar;
        this.f36536b = zArr;
    }
}
