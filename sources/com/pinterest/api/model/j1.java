package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("api_key")
    private String f38920a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f38921b;

    public /* synthetic */ j1(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final String b() {
        return this.f38920a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f38920a, ((j1) obj).f38920a);
    }

    public final int hashCode() {
        return Objects.hash(this.f38920a);
    }

    public j1() {
        this.f38921b = new boolean[1];
    }

    private j1(String str, boolean[] zArr) {
        this.f38920a = str;
        this.f38921b = zArr;
    }
}
