package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class i40 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("canonical_images")
    private Map<String, sr> f38644a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("image_signature")
    private String f38645b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38646c;

    public /* synthetic */ i40(Map map, String str, boolean[] zArr, int i13) {
        this(map, str, zArr);
    }

    public final Map c() {
        return this.f38644a;
    }

    public final String d() {
        return this.f38645b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i40 i40Var = (i40) obj;
        return Objects.equals(this.f38644a, i40Var.f38644a) && Objects.equals(this.f38645b, i40Var.f38645b);
    }

    public final int hashCode() {
        return Objects.hash(this.f38644a, this.f38645b);
    }

    public i40() {
        this.f38646c = new boolean[2];
    }

    private i40(Map<String, sr> map, String str, boolean[] zArr) {
        this.f38644a = map;
        this.f38645b = str;
        this.f38646c = zArr;
    }
}
