package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class z1 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44166a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f44167b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("domain")
    private String f44168c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("grid_description")
    private String f44169d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("grid_title")
    private String f44170e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("image_large_url")
    private String f44171f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("image_medium_url")
    private String f44172g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("title")
    private String f44173h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f44174i;

    public /* synthetic */ z1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, str7, str8, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f44166a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return Objects.equals(this.f44166a, z1Var.f44166a) && Objects.equals(this.f44167b, z1Var.f44167b) && Objects.equals(this.f44168c, z1Var.f44168c) && Objects.equals(this.f44169d, z1Var.f44169d) && Objects.equals(this.f44170e, z1Var.f44170e) && Objects.equals(this.f44171f, z1Var.f44171f) && Objects.equals(this.f44172g, z1Var.f44172g) && Objects.equals(this.f44173h, z1Var.f44173h);
    }

    public final int hashCode() {
        return Objects.hash(this.f44166a, this.f44167b, this.f44168c, this.f44169d, this.f44170e, this.f44171f, this.f44172g, this.f44173h);
    }

    @Override // dl1.s
    public final String o() {
        return this.f44167b;
    }

    public z1() {
        this.f44174i = new boolean[8];
    }

    private z1(@NonNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean[] zArr) {
        this.f44166a = str;
        this.f44167b = str2;
        this.f44168c = str3;
        this.f44169d = str4;
        this.f44170e = str5;
        this.f44171f = str6;
        this.f44172g = str7;
        this.f44173h = str8;
        this.f44174i = zArr;
    }
}
