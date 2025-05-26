package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p1 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f92133a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92134b;

    public p1(n1 questionId, int i13) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        this.f92133a = questionId;
        this.f92134b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.d(this.f92133a, p1Var.f92133a) && this.f92134b == p1Var.f92134b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92134b) + (this.f92133a.hashCode() * 31);
    }

    public final String toString() {
        return "QuestionErrorDisplayState(questionId=" + this.f92133a + ", errorMessage=" + this.f92134b + ")";
    }
}
