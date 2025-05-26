package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class s01 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("makeup_eyeshadow")
    private List<uw> f41747a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("makeup_lipstick")
    private uw f41748b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("product_metadata")
    private r70 f41749c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f41750d;

    public /* synthetic */ s01(List list, uw uwVar, r70 r70Var, boolean[] zArr, int i13) {
        this(list, uwVar, r70Var, zArr);
    }

    public final List d() {
        return this.f41747a;
    }

    public final uw e() {
        return this.f41748b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s01 s01Var = (s01) obj;
        return Objects.equals(this.f41747a, s01Var.f41747a) && Objects.equals(this.f41748b, s01Var.f41748b) && Objects.equals(this.f41749c, s01Var.f41749c);
    }

    public final r70 f() {
        return this.f41749c;
    }

    public final int hashCode() {
        return Objects.hash(this.f41747a, this.f41748b, this.f41749c);
    }

    public s01() {
        this.f41750d = new boolean[3];
    }

    private s01(List<uw> list, uw uwVar, r70 r70Var, boolean[] zArr) {
        this.f41747a = list;
        this.f41748b = uwVar;
        this.f41749c = r70Var;
        this.f41750d = zArr;
    }
}
