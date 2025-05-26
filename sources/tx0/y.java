package tx0;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;

/* loaded from: classes5.dex */
public final class y implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f119680a;

    /* renamed from: b, reason: collision with root package name */
    public final w12.a f119681b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f119682c;

    public y(boolean z13, w12.a newsType, j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(newsType, "newsType");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f119680a = z13;
        this.f119681b = newsType;
        this.f119682c = multiSectionVMState;
    }

    public static y b(y yVar, boolean z13, w12.a newsType, j0 multiSectionVMState, int i13) {
        if ((i13 & 1) != 0) {
            z13 = yVar.f119680a;
        }
        if ((i13 & 2) != 0) {
            newsType = yVar.f119681b;
        }
        if ((i13 & 4) != 0) {
            multiSectionVMState = yVar.f119682c;
        }
        yVar.getClass();
        Intrinsics.checkNotNullParameter(newsType, "newsType");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        return new y(z13, newsType, multiSectionVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f119680a == yVar.f119680a && this.f119681b == yVar.f119681b && Intrinsics.d(this.f119682c, yVar.f119682c);
    }

    public final int hashCode() {
        return this.f119682c.f93634a.hashCode() + ((this.f119681b.hashCode() + (Boolean.hashCode(this.f119680a) * 31)) * 31);
    }

    public final String toString() {
        return "NewsHubFeedVMState(hasAttemptedEducation=" + this.f119680a + ", newsType=" + this.f119681b + ", multiSectionVMState=" + this.f119682c + ")";
    }
}
