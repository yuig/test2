package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class q30 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41201a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41202b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("names")
    private List<String> f41203c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("pin_count")
    private Integer f41204d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("pin_types")
    private List<Integer> f41205e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("thumbnails")
    private List<Map<String, sr>> f41206f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f41207g;

    public /* synthetic */ q30(String str, String str2, List list, Integer num, List list2, List list3, boolean[] zArr, int i13) {
        this(str, str2, list, num, list2, list3, zArr);
    }

    @Override // dl1.s
    public final String b() {
        return this.f41201a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q30 q30Var = (q30) obj;
        return Objects.equals(this.f41204d, q30Var.f41204d) && Objects.equals(this.f41201a, q30Var.f41201a) && Objects.equals(this.f41202b, q30Var.f41202b) && Objects.equals(this.f41203c, q30Var.f41203c) && Objects.equals(this.f41205e, q30Var.f41205e) && Objects.equals(this.f41206f, q30Var.f41206f);
    }

    public final int hashCode() {
        return Objects.hash(this.f41201a, this.f41202b, this.f41203c, this.f41204d, this.f41205e, this.f41206f);
    }

    public final List k() {
        return this.f41203c;
    }

    public final Integer l() {
        Integer num = this.f41204d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List n() {
        return this.f41205e;
    }

    @Override // dl1.s
    public final String o() {
        return this.f41202b;
    }

    public final List q() {
        return this.f41206f;
    }

    public q30() {
        this.f41207g = new boolean[6];
    }

    private q30(@NonNull String str, String str2, List<String> list, Integer num, List<Integer> list2, List<Map<String, sr>> list3, boolean[] zArr) {
        this.f41201a = str;
        this.f41202b = str2;
        this.f41203c = list;
        this.f41204d = num;
        this.f41205e = list2;
        this.f41206f = list3;
        this.f41207g = zArr;
    }
}
