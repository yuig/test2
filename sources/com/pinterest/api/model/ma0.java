package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ma0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40043a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40044b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("answer_string")
    private String f40045c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("cover_image_urls")
    private List<String> f40046d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f40047e;

    public /* synthetic */ ma0(String str, String str2, String str3, List list, boolean[] zArr, int i13) {
        this(str, str2, str3, list, zArr);
    }

    public final String e() {
        return this.f40045c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ma0 ma0Var = (ma0) obj;
        return Objects.equals(this.f40043a, ma0Var.f40043a) && Objects.equals(this.f40044b, ma0Var.f40044b) && Objects.equals(this.f40045c, ma0Var.f40045c) && Objects.equals(this.f40046d, ma0Var.f40046d);
    }

    public final List f() {
        return this.f40046d;
    }

    public final int hashCode() {
        return Objects.hash(this.f40043a, this.f40044b, this.f40045c, this.f40046d);
    }

    public ma0() {
        this.f40047e = new boolean[4];
    }

    private ma0(@NonNull String str, String str2, String str3, List<String> list, boolean[] zArr) {
        this.f40043a = str;
        this.f40044b = str2;
        this.f40045c = str3;
        this.f40046d = list;
        this.f40047e = zArr;
    }
}
