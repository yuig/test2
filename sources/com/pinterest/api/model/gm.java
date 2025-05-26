package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes3.dex */
public class gm implements gp0.a {

    /* renamed from: a, reason: collision with root package name */
    @om.b("content")
    private String f38083a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("type")
    private String f38084b;

    public gm() {
    }

    public final String a() {
        return this.f38083a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gm gmVar = (gm) obj;
        return Objects.equals(this.f38083a, gmVar.f38083a) && Objects.equals(this.f38084b, gmVar.f38084b);
    }

    public final int hashCode() {
        return Objects.hash(this.f38083a, this.f38084b);
    }

    private gm(String str, String str2, boolean[] zArr) {
        this.f38083a = str;
        this.f38084b = str2;
    }
}
