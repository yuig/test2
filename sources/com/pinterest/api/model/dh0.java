package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class dh0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36822a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36823b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("display")
    private String f36824c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_urls")
    private List<String> f36825d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("swatch_hex_colors")
    private List<String> f36826e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("term")
    private String f36827f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36828g;

    public /* synthetic */ dh0(String str, String str2, String str3, List list, List list2, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, list, list2, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dh0 dh0Var = (dh0) obj;
        return Objects.equals(this.f36822a, dh0Var.f36822a) && Objects.equals(this.f36823b, dh0Var.f36823b) && Objects.equals(this.f36824c, dh0Var.f36824c) && Objects.equals(this.f36825d, dh0Var.f36825d) && Objects.equals(this.f36826e, dh0Var.f36826e) && Objects.equals(this.f36827f, dh0Var.f36827f);
    }

    public final String g() {
        return this.f36824c;
    }

    public final List h() {
        return this.f36825d;
    }

    public final int hashCode() {
        return Objects.hash(this.f36822a, this.f36823b, this.f36824c, this.f36825d, this.f36826e, this.f36827f);
    }

    public final String i() {
        return this.f36827f;
    }

    public dh0() {
        this.f36828g = new boolean[6];
    }

    private dh0(@NonNull String str, String str2, String str3, List<String> list, List<String> list2, String str4, boolean[] zArr) {
        this.f36822a = str;
        this.f36823b = str2;
        this.f36824c = str3;
        this.f36825d = list;
        this.f36826e = list2;
        this.f36827f = str4;
        this.f36828g = zArr;
    }
}
