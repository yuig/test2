package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class nt0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40479a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40480b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("homefeed")
    private List<String> f40481c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("related_pins")
    private List<String> f40482d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("search")
    private List<String> f40483e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40484f;

    public /* synthetic */ nt0(String str, String str2, List list, List list2, List list3, boolean[] zArr, int i13) {
        this(str, str2, list, list2, list3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        nt0 nt0Var = (nt0) obj;
        return Objects.equals(this.f40479a, nt0Var.f40479a) && Objects.equals(this.f40480b, nt0Var.f40480b) && Objects.equals(this.f40481c, nt0Var.f40481c) && Objects.equals(this.f40482d, nt0Var.f40482d) && Objects.equals(this.f40483e, nt0Var.f40483e);
    }

    public final List f() {
        return this.f40481c;
    }

    public final List g() {
        return this.f40482d;
    }

    public final List h() {
        return this.f40483e;
    }

    public final int hashCode() {
        return Objects.hash(this.f40479a, this.f40480b, this.f40481c, this.f40482d, this.f40483e);
    }

    public nt0() {
        this.f40484f = new boolean[5];
    }

    private nt0(@NonNull String str, String str2, List<String> list, List<String> list2, List<String> list3, boolean[] zArr) {
        this.f40479a = str;
        this.f40480b = str2;
        this.f40481c = list;
        this.f40482d = list2;
        this.f40483e = list3;
        this.f40484f = zArr;
    }
}
