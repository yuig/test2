package an0;

import kotlin.jvm.internal.Intrinsics;
import r72.l1;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final float f15628a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15629b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f15630c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15631d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15632e;

    public a(float f13, float f14, l1 origin, int i13, int i14) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f15628a = f13;
        this.f15629b = f14;
        this.f15630c = origin;
        this.f15631d = i13;
        this.f15632e = i14;
    }

    @Override // an0.c
    public final int a() {
        return this.f15631d;
    }

    @Override // an0.c
    public final int b() {
        return this.f15632e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f15628a, aVar.f15628a) == 0 && Float.compare(this.f15629b, aVar.f15629b) == 0 && Intrinsics.d(this.f15630c, aVar.f15630c) && this.f15631d == aVar.f15631d && this.f15632e == aVar.f15632e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15632e) + ep.b.b(this.f15631d, (this.f15630c.hashCode() + a.a.a(this.f15629b, Float.hashCode(this.f15628a) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Scale(from=");
        sb3.append(this.f15628a);
        sb3.append(", to=");
        sb3.append(this.f15629b);
        sb3.append(", origin=");
        sb3.append(this.f15630c);
        sb3.append(", beginFrame=");
        sb3.append(this.f15631d);
        sb3.append(", endFrame=");
        return a.a.n(sb3, this.f15632e, ")");
    }
}
