package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class e8 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37196a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37197b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("cropping_info")
    private i8 f37198c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("image_signature")
    private String f37199d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("large_image_url")
    private String f37200e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("pin_id")
    private String f37201f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    @om.b("root_pin_id")
    private String f37202g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    @om.b("xlarge_image_url")
    private String f37203h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f37204i;

    public /* synthetic */ e8(String str, String str2, i8 i8Var, String str3, String str4, String str5, String str6, String str7, boolean[] zArr, int i13) {
        this(str, str2, i8Var, str3, str4, str5, str6, str7, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return Objects.equals(this.f37196a, e8Var.f37196a) && Objects.equals(this.f37197b, e8Var.f37197b) && Objects.equals(this.f37198c, e8Var.f37198c) && Objects.equals(this.f37199d, e8Var.f37199d) && Objects.equals(this.f37200e, e8Var.f37200e) && Objects.equals(this.f37201f, e8Var.f37201f) && Objects.equals(this.f37202g, e8Var.f37202g) && Objects.equals(this.f37203h, e8Var.f37203h);
    }

    public final int hashCode() {
        return Objects.hash(this.f37196a, this.f37197b, this.f37198c, this.f37199d, this.f37200e, this.f37201f, this.f37202g, this.f37203h);
    }

    public final i8 i() {
        return this.f37198c;
    }

    public final String j() {
        return this.f37200e;
    }

    public final String k() {
        return this.f37201f;
    }

    public final String l() {
        return this.f37202g;
    }

    public final String m() {
        return this.f37203h;
    }

    public e8() {
        this.f37204i = new boolean[8];
    }

    private e8(@NonNull String str, String str2, @NonNull i8 i8Var, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, boolean[] zArr) {
        this.f37196a = str;
        this.f37197b = str2;
        this.f37198c = i8Var;
        this.f37199d = str3;
        this.f37200e = str4;
        this.f37201f = str5;
        this.f37202g = str6;
        this.f37203h = str7;
        this.f37204i = zArr;
    }
}
