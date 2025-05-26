package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ae {

    /* renamed from: a, reason: collision with root package name */
    @om.b("data")
    private String f35708a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f35709b;

    public /* synthetic */ ae(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final String b() {
        return this.f35708a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f35708a, ((ae) obj).f35708a);
    }

    public final int hashCode() {
        return Objects.hash(this.f35708a);
    }

    public ae() {
        this.f35709b = new boolean[1];
    }

    private ae(String str, boolean[] zArr) {
        this.f35708a = str;
        this.f35709b = zArr;
    }
}
