package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class l20 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39627a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39628b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("cover_image_urls")
    private List<String> f39629c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("query")
    private String f39630d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("short_description")
    private String f39631e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("title")
    private String f39632f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39633g;

    public /* synthetic */ l20(String str, String str2, List list, String str3, String str4, String str5, boolean[] zArr, int i13) {
        this(str, str2, list, str3, str4, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l20 l20Var = (l20) obj;
        return Objects.equals(this.f39627a, l20Var.f39627a) && Objects.equals(this.f39628b, l20Var.f39628b) && Objects.equals(this.f39629c, l20Var.f39629c) && Objects.equals(this.f39630d, l20Var.f39630d) && Objects.equals(this.f39631e, l20Var.f39631e) && Objects.equals(this.f39632f, l20Var.f39632f);
    }

    public final List g() {
        return this.f39629c;
    }

    public final String h() {
        return this.f39630d;
    }

    public final int hashCode() {
        return Objects.hash(this.f39627a, this.f39628b, this.f39629c, this.f39630d, this.f39631e, this.f39632f);
    }

    public final String i() {
        return this.f39631e;
    }

    public final String j() {
        return this.f39632f;
    }

    public final String k() {
        return this.f39627a;
    }

    public l20() {
        this.f39633g = new boolean[6];
    }

    private l20(@NonNull String str, String str2, List<String> list, String str3, String str4, String str5, boolean[] zArr) {
        this.f39627a = str;
        this.f39628b = str2;
        this.f39629c = list;
        this.f39630d = str3;
        this.f39631e = str4;
        this.f39632f = str5;
        this.f39633g = zArr;
    }
}
