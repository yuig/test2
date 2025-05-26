package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class gn {

    /* renamed from: a, reason: collision with root package name */
    @om.b("dominant_color")
    private String f38092a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("height")
    private Double f38093b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("src")
    private String f38094c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("type")
    private String f38095d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("width")
    private Double f38096e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f38097f;

    public /* synthetic */ gn(String str, Double d2, String str2, String str3, Double d13, boolean[] zArr, int i13) {
        this(str, d2, str2, str3, d13, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gn gnVar = (gn) obj;
        return Objects.equals(this.f38096e, gnVar.f38096e) && Objects.equals(this.f38093b, gnVar.f38093b) && Objects.equals(this.f38092a, gnVar.f38092a) && Objects.equals(this.f38094c, gnVar.f38094c) && Objects.equals(this.f38095d, gnVar.f38095d);
    }

    public final String f() {
        return this.f38094c;
    }

    public final String g() {
        return this.f38095d;
    }

    public final int hashCode() {
        return Objects.hash(this.f38092a, this.f38093b, this.f38094c, this.f38095d, this.f38096e);
    }

    public gn() {
        this.f38097f = new boolean[5];
    }

    private gn(String str, Double d2, String str2, String str3, Double d13, boolean[] zArr) {
        this.f38092a = str;
        this.f38093b = d2;
        this.f38094c = str2;
        this.f38095d = str3;
        this.f38096e = d13;
        this.f38097f = zArr;
    }
}
