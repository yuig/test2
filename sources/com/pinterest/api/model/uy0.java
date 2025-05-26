package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class uy0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42675a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42676b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("keys")
    private List<String> f42677c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("recommendation_type")
    private Integer f42678d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f42679e;

    public /* synthetic */ uy0(String str, String str2, List list, Integer num, boolean[] zArr, int i13) {
        this(str, str2, list, num, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uy0 uy0Var = (uy0) obj;
        return Objects.equals(this.f42678d, uy0Var.f42678d) && Objects.equals(this.f42675a, uy0Var.f42675a) && Objects.equals(this.f42676b, uy0Var.f42676b) && Objects.equals(this.f42677c, uy0Var.f42677c);
    }

    public final int hashCode() {
        return Objects.hash(this.f42675a, this.f42676b, this.f42677c, this.f42678d);
    }

    public uy0() {
        this.f42679e = new boolean[4];
    }

    private uy0(@NonNull String str, String str2, List<String> list, Integer num, boolean[] zArr) {
        this.f42675a = str;
        this.f42676b = str2;
        this.f42677c = list;
        this.f42678d = num;
        this.f42679e = zArr;
    }
}
