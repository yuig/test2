package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class v1 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42693a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42694b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("metrics")
    private List<r1> f42695c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("relatedPinPromotions")
    private Map<String, d2> f42696d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("relatedPins")
    private Map<String, z1> f42697e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42698f;

    public /* synthetic */ v1(String str, String str2, List list, Map map, Map map2, boolean[] zArr, int i13) {
        this(str, str2, list, map, map2, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f42693a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Objects.equals(this.f42693a, v1Var.f42693a) && Objects.equals(this.f42694b, v1Var.f42694b) && Objects.equals(this.f42695c, v1Var.f42695c) && Objects.equals(this.f42696d, v1Var.f42696d) && Objects.equals(this.f42697e, v1Var.f42697e);
    }

    public final int hashCode() {
        return Objects.hash(this.f42693a, this.f42694b, this.f42695c, this.f42696d, this.f42697e);
    }

    @Override // dl1.s
    public final String o() {
        return this.f42694b;
    }

    public v1() {
        this.f42698f = new boolean[5];
    }

    private v1(@NonNull String str, String str2, List<r1> list, Map<String, d2> map, Map<String, z1> map2, boolean[] zArr) {
        this.f42693a = str;
        this.f42694b = str2;
        this.f42695c = list;
        this.f42696d = map;
        this.f42697e = map2;
        this.f42698f = zArr;
    }
}
