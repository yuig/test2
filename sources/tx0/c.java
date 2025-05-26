package tx0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f119646a;

    /* renamed from: b, reason: collision with root package name */
    public final a f119647b;

    /* renamed from: c, reason: collision with root package name */
    public final o82.a0 f119648c;

    public c(boolean z13, a emptyStateDisplayState, o82.a0 multiSectionDisplayState) {
        Intrinsics.checkNotNullParameter(emptyStateDisplayState, "emptyStateDisplayState");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        this.f119646a = z13;
        this.f119647b = emptyStateDisplayState;
        this.f119648c = multiSectionDisplayState;
    }

    public static c e(c cVar, boolean z13, a emptyStateDisplayState, o82.a0 multiSectionDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            z13 = cVar.f119646a;
        }
        if ((i13 & 2) != 0) {
            emptyStateDisplayState = cVar.f119647b;
        }
        if ((i13 & 4) != 0) {
            multiSectionDisplayState = cVar.f119648c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(emptyStateDisplayState, "emptyStateDisplayState");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        return new c(z13, emptyStateDisplayState, multiSectionDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f119646a == cVar.f119646a && Intrinsics.d(this.f119647b, cVar.f119647b) && Intrinsics.d(this.f119648c, cVar.f119648c);
    }

    public final int hashCode() {
        return this.f119648c.f93524a.hashCode() + ((this.f119647b.f119637a.hashCode() + (Boolean.hashCode(this.f119646a) * 31)) * 31);
    }

    public final String toString() {
        return "NewsHubFeedDisplayState(showEducationIfEligible=" + this.f119646a + ", emptyStateDisplayState=" + this.f119647b + ", multiSectionDisplayState=" + this.f119648c + ")";
    }
}
