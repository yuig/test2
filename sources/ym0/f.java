package ym0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f139403e = new f(null, null, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final wk1.e f139404a;

    /* renamed from: b, reason: collision with root package name */
    public final wk1.e f139405b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139406c;

    /* renamed from: d, reason: collision with root package name */
    public final int f139407d;

    public f(wk1.e eVar, wk1.e eVar2, int i13, int i14) {
        this.f139404a = eVar;
        this.f139405b = eVar2;
        this.f139406c = i13;
        this.f139407d = i14;
    }

    public final boolean a() {
        if (!Intrinsics.d(this, f139403e)) {
            wk1.e eVar = this.f139404a;
            wk1.e eVar2 = this.f139405b;
            if (Intrinsics.d(eVar, eVar2)) {
                int i13 = this.f139406c;
                int i14 = this.f139407d;
                if (i13 != i14 && eVar2 != null && i14 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f139404a, fVar.f139404a) && Intrinsics.d(this.f139405b, fVar.f139405b) && this.f139406c == fVar.f139406c && this.f139407d == fVar.f139407d;
    }

    public final int hashCode() {
        wk1.e eVar = this.f139404a;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        wk1.e eVar2 = this.f139405b;
        return Integer.hashCode(this.f139407d) + ep.b.b(this.f139406c, (hashCode + (eVar2 != null ? eVar2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReorderResults(oldDataSource=");
        sb3.append(this.f139404a);
        sb3.append(", newDataSource=");
        sb3.append(this.f139405b);
        sb3.append(", oldPosition=");
        sb3.append(this.f139406c);
        sb3.append(", newPosition=");
        return a.a.n(sb3, this.f139407d, ")");
    }
}
