package b4;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final u f21659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21661c;

    public t(j4.d dVar, int i13, int i14) {
        this.f21659a = dVar;
        this.f21660b = i13;
        this.f21661c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f21659a, tVar.f21659a) && this.f21660b == tVar.f21660b && this.f21661c == tVar.f21661c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21661c) + ep.b.b(this.f21660b, this.f21659a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb3.append(this.f21659a);
        sb3.append(", startIndex=");
        sb3.append(this.f21660b);
        sb3.append(", endIndex=");
        return cb.l(sb3, this.f21661c, ')');
    }
}
