package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class t80 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42122a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42123b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("dimension_metadata")
    private List<ah> f42124c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("has_checkout_variant")
    private Boolean f42125d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("primary_dimension")
    private String f42126e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("primary_dimension_thumbnail_images")
    private Map<String, i40> f42127f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("variant_reps")
    private List<Integer> f42128g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("variants")
    private List<p80> f42129h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f42130i;

    public /* synthetic */ t80(String str, String str2, List list, Boolean bool, String str3, Map map, List list2, List list3, boolean[] zArr, int i13) {
        this(str, str2, list, bool, str3, map, list2, list3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t80 t80Var = (t80) obj;
        return Objects.equals(this.f42125d, t80Var.f42125d) && Objects.equals(this.f42122a, t80Var.f42122a) && Objects.equals(this.f42123b, t80Var.f42123b) && Objects.equals(this.f42124c, t80Var.f42124c) && Objects.equals(this.f42126e, t80Var.f42126e) && Objects.equals(this.f42127f, t80Var.f42127f) && Objects.equals(this.f42128g, t80Var.f42128g) && Objects.equals(this.f42129h, t80Var.f42129h);
    }

    public final int hashCode() {
        return Objects.hash(this.f42122a, this.f42123b, this.f42124c, this.f42125d, this.f42126e, this.f42127f, this.f42128g, this.f42129h);
    }

    public final List i() {
        return this.f42124c;
    }

    public final List j() {
        return this.f42129h;
    }

    public t80() {
        this.f42130i = new boolean[8];
    }

    private t80(@NonNull String str, String str2, List<ah> list, Boolean bool, String str3, Map<String, i40> map, List<Integer> list2, List<p80> list3, boolean[] zArr) {
        this.f42122a = str;
        this.f42123b = str2;
        this.f42124c = list;
        this.f42125d = bool;
        this.f42126e = str3;
        this.f42127f = map;
        this.f42128g = list2;
        this.f42129h = list3;
        this.f42130i = zArr;
    }
}
