package hd2;

import a.cb;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f68916a;

    /* renamed from: b, reason: collision with root package name */
    public final float f68917b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f68918c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68919d;

    public /* synthetic */ c(float f13, int i13) {
        this(0, (i13 & 2) != 0 ? 0.0f : f13, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f68916a == cVar.f68916a && Float.compare(this.f68917b, cVar.f68917b) == 0 && this.f68918c == cVar.f68918c && this.f68919d == cVar.f68919d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68919d) + ep.b.e(this.f68918c, a.a.a(this.f68917b, Integer.hashCode(this.f68916a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Options(backgroundColor=");
        sb3.append(this.f68916a);
        sb3.append(", maxJitter=");
        sb3.append(this.f68917b);
        sb3.append(", enableBorder=");
        sb3.append(this.f68918c);
        sb3.append(", useGrayThreshold=");
        return cb.m(sb3, this.f68919d, ')');
    }

    public c(int i13, float f13, boolean z13, boolean z14) {
        this.f68916a = i13;
        this.f68917b = f13;
        this.f68918c = z13;
        this.f68919d = z14;
    }
}
