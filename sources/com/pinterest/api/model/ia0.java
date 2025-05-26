package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ia0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38710a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38711b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_color")
    private String f38712c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("dimensional_output")
    private cb0 f38713d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("dimensions")
    private List<qa0> f38714e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("intro_data")
    private ya0 f38715f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("questions")
    private List<cc0> f38716g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("title")
    private String f38717h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f38718i;

    public /* synthetic */ ia0(String str, String str2, String str3, cb0 cb0Var, List list, ya0 ya0Var, List list2, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, cb0Var, list, ya0Var, list2, str4, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f38710a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ia0 ia0Var = (ia0) obj;
        return Objects.equals(this.f38710a, ia0Var.f38710a) && Objects.equals(this.f38711b, ia0Var.f38711b) && Objects.equals(this.f38712c, ia0Var.f38712c) && Objects.equals(this.f38713d, ia0Var.f38713d) && Objects.equals(this.f38714e, ia0Var.f38714e) && Objects.equals(this.f38715f, ia0Var.f38715f) && Objects.equals(this.f38716g, ia0Var.f38716g) && Objects.equals(this.f38717h, ia0Var.f38717h);
    }

    public final int hashCode() {
        return Objects.hash(this.f38710a, this.f38711b, this.f38712c, this.f38713d, this.f38714e, this.f38715f, this.f38716g, this.f38717h);
    }

    public final ya0 n() {
        return this.f38715f;
    }

    @Override // dl1.s
    public final String o() {
        return this.f38711b;
    }

    public final List q() {
        return this.f38716g;
    }

    public final String s() {
        return this.f38717h;
    }

    public ia0() {
        this.f38718i = new boolean[8];
    }

    private ia0(@NonNull String str, String str2, String str3, cb0 cb0Var, List<qa0> list, ya0 ya0Var, List<cc0> list2, String str4, boolean[] zArr) {
        this.f38710a = str;
        this.f38711b = str2;
        this.f38712c = str3;
        this.f38713d = cb0Var;
        this.f38714e = list;
        this.f38715f = ya0Var;
        this.f38716g = list2;
        this.f38717h = str4;
        this.f38718i = zArr;
    }
}
