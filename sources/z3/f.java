package z3;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final f f140666d = new f(0.0f, new ql2.g(0.0f, 0.0f), 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f140667a;

    /* renamed from: b, reason: collision with root package name */
    public final ql2.h f140668b;

    /* renamed from: c, reason: collision with root package name */
    public final int f140669c;

    public f(float f13, ql2.h hVar, int i13) {
        this.f140667a = f13;
        this.f140668b = hVar;
        this.f140669c = i13;
        if (!(!Float.isNaN(f13))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final float a() {
        return this.f140667a;
    }

    public final ql2.h b() {
        return this.f140668b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f140667a == fVar.f140667a && Intrinsics.d(this.f140668b, fVar.f140668b) && this.f140669c == fVar.f140669c;
    }

    public final int hashCode() {
        return ((this.f140668b.hashCode() + (Float.hashCode(this.f140667a) * 31)) * 31) + this.f140669c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb3.append(this.f140667a);
        sb3.append(", range=");
        sb3.append(this.f140668b);
        sb3.append(", steps=");
        return cb.l(sb3, this.f140669c, ')');
    }
}
