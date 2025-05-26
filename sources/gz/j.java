package gz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f66346a;

    public j(String questionId) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        this.f66346a = questionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f66346a, ((j) obj).f66346a);
    }

    public final int hashCode() {
        return this.f66346a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadQuestion(questionId="), this.f66346a, ")");
    }
}
