package u41;

import bm1.m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final m f120483a;

    /* renamed from: b, reason: collision with root package name */
    public final g f120484b;

    public e(m pill, g tap) {
        Intrinsics.checkNotNullParameter(pill, "pill");
        Intrinsics.checkNotNullParameter(tap, "tap");
        this.f120483a = pill;
        this.f120484b = tap;
    }

    public static e a(e eVar, m pill, g tap, int i13) {
        if ((i13 & 1) != 0) {
            pill = eVar.f120483a;
        }
        if ((i13 & 2) != 0) {
            tap = eVar.f120484b;
        }
        Intrinsics.checkNotNullParameter(pill, "pill");
        Intrinsics.checkNotNullParameter(tap, "tap");
        return new e(pill, tap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f120483a, eVar.f120483a) && Intrinsics.d(this.f120484b, eVar.f120484b);
    }

    public final int hashCode() {
        return this.f120484b.hashCode() + (this.f120483a.hashCode() * 31);
    }

    public final String toString() {
        return "PillDisplayState(pill=" + this.f120483a + ", tap=" + this.f120484b + ")";
    }

    public /* synthetic */ e(m mVar) {
        this(mVar, new g(0, 3));
    }
}
