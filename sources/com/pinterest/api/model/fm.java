package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes3.dex */
public class fm implements gp0.a {

    /* renamed from: a, reason: collision with root package name */
    @om.b("content")
    private String f37722a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("type")
    private String f37723b;

    public fm() {
    }

    public final String a() {
        return this.f37722a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fm fmVar = (fm) obj;
        return Objects.equals(this.f37722a, fmVar.f37722a) && Objects.equals(this.f37723b, fmVar.f37723b);
    }

    public final int hashCode() {
        return Objects.hash(this.f37722a, this.f37723b);
    }

    private fm(String str, String str2, boolean[] zArr) {
        this.f37722a = str;
        this.f37723b = str2;
    }
}
