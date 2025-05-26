package fz0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f63143a;

    public n(String quizId) {
        Intrinsics.checkNotNullParameter(quizId, "quizId");
        this.f63143a = quizId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f63143a, ((n) obj).f63143a);
    }

    public final int hashCode() {
        return this.f63143a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadQuiz(quizId="), this.f63143a, ")");
    }
}
