package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class i10 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38591a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38592b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("cover_image_url")
    private String f38593c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("style")
    private String f38594d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f38595e;

    public /* synthetic */ i10(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f38593c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return Objects.equals(this.f38591a, i10Var.f38591a) && Objects.equals(this.f38592b, i10Var.f38592b) && Objects.equals(this.f38593c, i10Var.f38593c) && Objects.equals(this.f38594d, i10Var.f38594d);
    }

    public final String f() {
        return this.f38594d;
    }

    public final int hashCode() {
        return Objects.hash(this.f38591a, this.f38592b, this.f38593c, this.f38594d);
    }

    public i10() {
        this.f38595e = new boolean[4];
    }

    private i10(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f38591a = str;
        this.f38592b = str2;
        this.f38593c = str3;
        this.f38594d = str4;
        this.f38595e = zArr;
    }
}
