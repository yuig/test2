package dt0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f56219a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56221c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.a0 f56222d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56223e;

    public a(int i13, int i14, int i15, o82.a0 multiSectionDisplayState, boolean z13) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f56219a = i13;
        this.f56220b = i14;
        this.f56221c = i15;
        this.f56222d = multiSectionDisplayState;
        this.f56223e = z13;
    }

    public static a e(a aVar, int i13, int i14, o82.a0 a0Var, boolean z13, int i15) {
        if ((i15 & 1) != 0) {
            i13 = aVar.f56219a;
        }
        int i16 = i13;
        if ((i15 & 2) != 0) {
            i14 = aVar.f56220b;
        }
        int i17 = i14;
        int i18 = aVar.f56221c;
        if ((i15 & 8) != 0) {
            a0Var = aVar.f56222d;
        }
        o82.a0 multiSectionDisplayState = a0Var;
        if ((i15 & 16) != 0) {
            z13 = aVar.f56223e;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        return new a(i16, i17, i18, multiSectionDisplayState, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f56219a == aVar.f56219a && this.f56220b == aVar.f56220b && this.f56221c == aVar.f56221c && Intrinsics.d(this.f56222d, aVar.f56222d) && this.f56223e == aVar.f56223e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56223e) + ep.b.c(this.f56222d.f93524a, ep.b.b(this.f56221c, ep.b.b(this.f56220b, Integer.hashCode(this.f56219a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HftPinsTabDisplayState(filterTitle=");
        sb3.append(this.f56219a);
        sb3.append(", filterSubtitle=");
        sb3.append(this.f56220b);
        sb3.append(", emptyFeedText=");
        sb3.append(this.f56221c);
        sb3.append(", multiSectionDisplayState=");
        sb3.append(this.f56222d);
        sb3.append(", shouldReloadFeed=");
        return a.a.r(sb3, this.f56223e, ")");
    }
}
