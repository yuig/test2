package iz0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;

/* loaded from: classes5.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f73900a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73901b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73902c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f73903d;

    public c0(String quizId, String answerString, String str, j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(quizId, "quizId");
        Intrinsics.checkNotNullParameter(answerString, "answerString");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f73900a = quizId;
        this.f73901b = answerString;
        this.f73902c = str;
        this.f73903d = multiSectionVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f73900a, c0Var.f73900a) && Intrinsics.d(this.f73901b, c0Var.f73901b) && Intrinsics.d(this.f73902c, c0Var.f73902c) && Intrinsics.d(this.f73903d, c0Var.f73903d);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f73901b, this.f73900a.hashCode() * 31, 31);
        String str = this.f73902c;
        return this.f73903d.f93634a.hashCode() + ((d2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PearQuizResultVMState(quizId=" + this.f73900a + ", answerString=" + this.f73901b + ", outputKey=" + this.f73902c + ", multiSectionVMState=" + this.f73903d + ")";
    }
}
