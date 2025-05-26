package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class cn implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36471a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36472b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("image_signature")
    private String f36473c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_url")
    private String f36474d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36475e;

    public /* synthetic */ cn(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f36471a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cn cnVar = (cn) obj;
        return Objects.equals(this.f36471a, cnVar.f36471a) && Objects.equals(this.f36472b, cnVar.f36472b) && Objects.equals(this.f36473c, cnVar.f36473c) && Objects.equals(this.f36474d, cnVar.f36474d);
    }

    public final String h() {
        return this.f36473c;
    }

    public final int hashCode() {
        return Objects.hash(this.f36471a, this.f36472b, this.f36473c, this.f36474d);
    }

    public final String j() {
        return this.f36474d;
    }

    @Override // dl1.s
    public final String o() {
        return this.f36472b;
    }

    public cn() {
        this.f36475e = new boolean[4];
    }

    private cn(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f36471a = str;
        this.f36472b = str2;
        this.f36473c = str3;
        this.f36474d = str4;
        this.f36475e = zArr;
    }
}
