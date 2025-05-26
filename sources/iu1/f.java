package iu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f73698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73699b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73700c;

    /* renamed from: d, reason: collision with root package name */
    public final e f73701d;

    public f(int i13, int i14, int i15, e user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f73698a = i13;
        this.f73699b = i14;
        this.f73700c = i15;
        this.f73701d = user;
    }

    public static f e(f fVar, e user) {
        int i13 = fVar.f73698a;
        int i14 = fVar.f73699b;
        int i15 = fVar.f73700c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        return new f(i13, i14, i15, user);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f73698a == fVar.f73698a && this.f73699b == fVar.f73699b && this.f73700c == fVar.f73700c && Intrinsics.d(this.f73701d, fVar.f73701d);
    }

    public final int hashCode() {
        return this.f73701d.hashCode() + ep.b.b(this.f73700c, ep.b.b(this.f73699b, Integer.hashCode(this.f73698a) * 31, 31), 31);
    }

    public final String toString() {
        return "NavDemoTwoDisplayState(title=" + this.f73698a + ", description=" + this.f73699b + ", buttonLabel=" + this.f73700c + ", user=" + this.f73701d + ")";
    }
}
