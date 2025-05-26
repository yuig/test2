package pr0;

import ey.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f101157a;

    /* renamed from: b, reason: collision with root package name */
    public int f101158b;

    /* renamed from: c, reason: collision with root package name */
    public int f101159c;

    /* renamed from: d, reason: collision with root package name */
    public int f101160d;

    /* renamed from: e, reason: collision with root package name */
    public ny.f f101161e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f101162f;

    public final void a(int i13) {
        this.f101160d = i13;
    }

    public final void b(int i13) {
        this.f101159c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f101157a == dVar.f101157a && this.f101158b == dVar.f101158b && this.f101159c == dVar.f101159c && this.f101160d == dVar.f101160d && Intrinsics.d(this.f101161e, dVar.f101161e) && Intrinsics.d(this.f101162f, dVar.f101162f);
    }

    public final int hashCode() {
        return this.f101162f.hashCode() + ((this.f101161e.hashCode() + ep.b.b(this.f101160d, ep.b.b(this.f101159c, ep.b.b(this.f101158b, Integer.hashCode(this.f101157a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        int i13 = this.f101157a;
        int i14 = this.f101158b;
        int i15 = this.f101159c;
        int i16 = this.f101160d;
        StringBuilder t13 = a.a.t("PWTImageViewTracker(numPWTImageViewsVisible=", i13, ", numPWTImageViewsDrawn=", i14, ", numPWTVideoViewsVisible=");
        a.a.z(t13, i15, ", numPWTVideoViewsDrawn=", i16, ", feedPinCellTypeCounts=");
        t13.append(this.f101161e);
        t13.append(", feedStoryContainerTypeCounts=");
        t13.append(this.f101162f);
        t13.append(")");
        return t13.toString();
    }
}
