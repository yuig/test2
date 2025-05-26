package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f21652a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21653b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21654c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21655d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21656e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21657f;

    /* renamed from: g, reason: collision with root package name */
    public final float f21658g;

    public s(b bVar, int i13, int i14, int i15, int i16, float f13, float f14) {
        this.f21652a = bVar;
        this.f21653b = i13;
        this.f21654c = i14;
        this.f21655d = i15;
        this.f21656e = i16;
        this.f21657f = f13;
        this.f21658g = f14;
    }

    public final long a(long j13, boolean z13) {
        if (z13) {
            int i13 = p0.f21640c;
            long j14 = p0.f21639b;
            if (p0.a(j13, j14)) {
                return j14;
            }
        }
        int i14 = p0.f21640c;
        int i15 = (int) (j13 >> 32);
        int i16 = this.f21653b;
        return b7.c.h(i15 + i16, ((int) (j13 & 4294967295L)) + i16);
    }

    public final int b(int i13) {
        int i14 = this.f21654c;
        int i15 = this.f21653b;
        return ql2.s.g(i13, i15, i14) - i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f21652a, sVar.f21652a) && this.f21653b == sVar.f21653b && this.f21654c == sVar.f21654c && this.f21655d == sVar.f21655d && this.f21656e == sVar.f21656e && Float.compare(this.f21657f, sVar.f21657f) == 0 && Float.compare(this.f21658g, sVar.f21658g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f21658g) + a.a.a(this.f21657f, ep.b.b(this.f21656e, ep.b.b(this.f21655d, ep.b.b(this.f21654c, ep.b.b(this.f21653b, this.f21652a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ParagraphInfo(paragraph=");
        sb3.append(this.f21652a);
        sb3.append(", startIndex=");
        sb3.append(this.f21653b);
        sb3.append(", endIndex=");
        sb3.append(this.f21654c);
        sb3.append(", startLineIndex=");
        sb3.append(this.f21655d);
        sb3.append(", endLineIndex=");
        sb3.append(this.f21656e);
        sb3.append(", top=");
        sb3.append(this.f21657f);
        sb3.append(", bottom=");
        return d7.g.h(sb3, this.f21658g, ')');
    }
}
