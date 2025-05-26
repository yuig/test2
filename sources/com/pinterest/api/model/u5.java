package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class u5 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42408a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42409b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("canonicalized")
    private Boolean f42410c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("in_profile")
    private Boolean f42411d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("in_profile_list")
    private List<Boolean> f42412e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("paid")
    private Boolean f42413f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("paid_list")
    private List<Boolean> f42414g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("pin_format_list")
    private List<String> f42415h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f42416i;

    public /* synthetic */ u5(String str, String str2, Boolean bool, Boolean bool2, List list, Boolean bool3, List list2, List list3, boolean[] zArr, int i13) {
        this(str, str2, bool, bool2, list, bool3, list2, list3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return Objects.equals(this.f42413f, u5Var.f42413f) && Objects.equals(this.f42411d, u5Var.f42411d) && Objects.equals(this.f42410c, u5Var.f42410c) && Objects.equals(this.f42408a, u5Var.f42408a) && Objects.equals(this.f42409b, u5Var.f42409b) && Objects.equals(this.f42412e, u5Var.f42412e) && Objects.equals(this.f42414g, u5Var.f42414g) && Objects.equals(this.f42415h, u5Var.f42415h);
    }

    public final int hashCode() {
        return Objects.hash(this.f42408a, this.f42409b, this.f42410c, this.f42411d, this.f42412e, this.f42413f, this.f42414g, this.f42415h);
    }

    public final List i() {
        return this.f42412e;
    }

    public final List j() {
        return this.f42414g;
    }

    public u5() {
        this.f42416i = new boolean[8];
    }

    private u5(@NonNull String str, String str2, Boolean bool, Boolean bool2, List<Boolean> list, Boolean bool3, List<Boolean> list2, List<String> list3, boolean[] zArr) {
        this.f42408a = str;
        this.f42409b = str2;
        this.f42410c = bool;
        this.f42411d = bool2;
        this.f42412e = list;
        this.f42413f = bool3;
        this.f42414g = list2;
        this.f42415h = list3;
        this.f42416i = zArr;
    }
}
