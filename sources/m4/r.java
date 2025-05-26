package m4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final r f85812c = new r(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final r f85813d = new r(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f85814a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85815b;

    public r(int i13, boolean z13) {
        this.f85814a = i13;
        this.f85815b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f85814a == rVar.f85814a && this.f85815b == rVar.f85815b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85815b) + (Integer.hashCode(this.f85814a) * 31);
    }

    public final String toString() {
        return Intrinsics.d(this, f85812c) ? "TextMotion.Static" : Intrinsics.d(this, f85813d) ? "TextMotion.Animated" : "Invalid";
    }
}
