package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class xc0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43648a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43649b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("color_hex")
    private String f43650c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f43651d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43652e;

    public /* synthetic */ xc0(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f43648a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xc0 xc0Var = (xc0) obj;
        return Objects.equals(this.f43648a, xc0Var.f43648a) && Objects.equals(this.f43649b, xc0Var.f43649b) && Objects.equals(this.f43650c, xc0Var.f43650c) && Objects.equals(this.f43651d, xc0Var.f43651d);
    }

    public final String h() {
        return this.f43650c;
    }

    public final int hashCode() {
        return Objects.hash(this.f43648a, this.f43649b, this.f43650c, this.f43651d);
    }

    public final String j() {
        return this.f43651d;
    }

    @Override // dl1.s
    public final String o() {
        return this.f43649b;
    }

    public xc0() {
        this.f43652e = new boolean[4];
    }

    private xc0(@NonNull String str, String str2, String str3, @NonNull String str4, boolean[] zArr) {
        this.f43648a = str;
        this.f43649b = str2;
        this.f43650c = str3;
        this.f43651d = str4;
        this.f43652e = zArr;
    }
}
