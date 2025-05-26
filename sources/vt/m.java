package vt;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import lu.b0;

/* loaded from: classes3.dex */
public final class m extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f126615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126616b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f126617c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f126618d;

    public m(int i13, String promotedByString, boolean z13, b0 bottomSheetState) {
        Intrinsics.checkNotNullParameter(promotedByString, "promotedByString");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        this.f126615a = i13;
        this.f126616b = promotedByString;
        this.f126617c = z13;
        this.f126618d = bottomSheetState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f126615a == mVar.f126615a && Intrinsics.d(this.f126616b, mVar.f126616b) && this.f126617c == mVar.f126617c && this.f126618d == mVar.f126618d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f126618d.hashCode() + ep.b.e(this.f126617c, cb.d(this.f126616b, Integer.hashCode(this.f126615a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "FallbackResults(numberOfQuestions=" + this.f126615a + ", promotedByString=" + this.f126616b + ", userManuallyPaused=" + this.f126617c + ", bottomSheetState=" + this.f126618d + ", scrollingModuleInBackground=false)";
    }
}
