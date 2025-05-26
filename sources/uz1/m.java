package uz1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f123304a;

    /* renamed from: b, reason: collision with root package name */
    public final List f123305b;

    public m(ArrayList bitmaps, List interestNames) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(interestNames, "interestNames");
        this.f123304a = bitmaps;
        this.f123305b = interestNames;
    }

    @Override // uz1.t
    public final List a() {
        return this.f123304a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f123304a, mVar.f123304a) && Intrinsics.d(this.f123305b, mVar.f123305b);
    }

    public final int hashCode() {
        return this.f123305b.hashCode() + (this.f123304a.hashCode() * 31);
    }

    public final String toString() {
        return "InterestGridExpandedView(bitmaps=" + this.f123304a + ", interestNames=" + this.f123305b + ")";
    }
}
