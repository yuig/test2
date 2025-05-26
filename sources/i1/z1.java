package i1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f70946a;

    /* renamed from: b, reason: collision with root package name */
    public final w1 f70947b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f70948c;

    /* renamed from: d, reason: collision with root package name */
    public final t1 f70949d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f70950e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f70951f;

    public /* synthetic */ z1(p1 p1Var, w1 w1Var, p0 p0Var, t1 t1Var, boolean z13, LinkedHashMap linkedHashMap, int i13) {
        this((i13 & 1) != 0 ? null : p1Var, (i13 & 2) != 0 ? null : w1Var, (i13 & 4) != 0 ? null : p0Var, (i13 & 8) == 0 ? t1Var : null, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? kotlin.collections.z0.d() : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return Intrinsics.d(this.f70946a, z1Var.f70946a) && Intrinsics.d(this.f70947b, z1Var.f70947b) && Intrinsics.d(this.f70948c, z1Var.f70948c) && Intrinsics.d(this.f70949d, z1Var.f70949d) && this.f70950e == z1Var.f70950e && Intrinsics.d(this.f70951f, z1Var.f70951f);
    }

    public final int hashCode() {
        p1 p1Var = this.f70946a;
        int hashCode = (p1Var == null ? 0 : p1Var.hashCode()) * 31;
        w1 w1Var = this.f70947b;
        int hashCode2 = (hashCode + (w1Var == null ? 0 : w1Var.hashCode())) * 31;
        p0 p0Var = this.f70948c;
        int hashCode3 = (hashCode2 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        t1 t1Var = this.f70949d;
        return this.f70951f.hashCode() + ep.b.e(this.f70950e, (hashCode3 + (t1Var != null ? t1Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f70946a + ", slide=" + this.f70947b + ", changeSize=" + this.f70948c + ", scale=" + this.f70949d + ", hold=" + this.f70950e + ", effectsMap=" + this.f70951f + ')';
    }

    public z1(p1 p1Var, w1 w1Var, p0 p0Var, t1 t1Var, boolean z13, Map map) {
        this.f70946a = p1Var;
        this.f70947b = w1Var;
        this.f70948c = p0Var;
        this.f70949d = t1Var;
        this.f70950e = z13;
        this.f70951f = map;
    }
}
