package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ya0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43988a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43989b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_images")
    private List<String> f43990c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("button_title")
    private String f43991d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("icons")
    private List<Integer> f43992e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("instructions")
    private List<String> f43993f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f43994g;

    public /* synthetic */ ya0(String str, String str2, List list, String str3, List list2, List list3, boolean[] zArr, int i13) {
        this(str, str2, list, str3, list2, list3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ya0 ya0Var = (ya0) obj;
        return Objects.equals(this.f43988a, ya0Var.f43988a) && Objects.equals(this.f43989b, ya0Var.f43989b) && Objects.equals(this.f43990c, ya0Var.f43990c) && Objects.equals(this.f43991d, ya0Var.f43991d) && Objects.equals(this.f43992e, ya0Var.f43992e) && Objects.equals(this.f43993f, ya0Var.f43993f);
    }

    public final List g() {
        return this.f43990c;
    }

    public final String h() {
        return this.f43991d;
    }

    public final int hashCode() {
        return Objects.hash(this.f43988a, this.f43989b, this.f43990c, this.f43991d, this.f43992e, this.f43993f);
    }

    public final List i() {
        return this.f43992e;
    }

    public final List j() {
        return this.f43993f;
    }

    public ya0() {
        this.f43994g = new boolean[6];
    }

    private ya0(@NonNull String str, String str2, List<String> list, String str3, List<Integer> list2, List<String> list3, boolean[] zArr) {
        this.f43988a = str;
        this.f43989b = str2;
        this.f43990c = list;
        this.f43991d = str3;
        this.f43992e = list2;
        this.f43993f = list3;
        this.f43994g = zArr;
    }
}
