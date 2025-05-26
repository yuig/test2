package ct0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f53145a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.a0 f53146b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53147c;

    /* renamed from: d, reason: collision with root package name */
    public final int f53148d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53149e;

    /* renamed from: f, reason: collision with root package name */
    public final int f53150f;

    /* renamed from: g, reason: collision with root package name */
    public final int f53151g;

    public h(int i13, o82.a0 multiSectionDisplayState, int i14, int i15, int i16, int i17, int i18) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f53145a = i13;
        this.f53146b = multiSectionDisplayState;
        this.f53147c = i14;
        this.f53148d = i15;
        this.f53149e = i16;
        this.f53150f = i17;
        this.f53151g = i18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f53145a == hVar.f53145a && Intrinsics.d(this.f53146b, hVar.f53146b) && this.f53147c == hVar.f53147c && this.f53148d == hVar.f53148d && this.f53149e == hVar.f53149e && this.f53150f == hVar.f53150f && this.f53151g == hVar.f53151g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53151g) + ep.b.b(this.f53150f, ep.b.b(this.f53149e, ep.b.b(this.f53148d, ep.b.b(this.f53147c, ep.b.c(this.f53146b.f93524a, Integer.hashCode(this.f53145a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SbaHftInterestsTabDisplayState(colNumber=");
        sb3.append(this.f53145a);
        sb3.append(", multiSectionDisplayState=");
        sb3.append(this.f53146b);
        sb3.append(", emptyStateString=");
        sb3.append(this.f53147c);
        sb3.append(", verticalPadding=");
        sb3.append(this.f53148d);
        sb3.append(", horizontalPadding=");
        sb3.append(this.f53149e);
        sb3.append(", followDrawable=");
        sb3.append(this.f53150f);
        sb3.append(", notFollowingDrawable=");
        return a.a.n(sb3, this.f53151g, ")");
    }
}
