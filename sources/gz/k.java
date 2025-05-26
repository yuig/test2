package gz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f66347a;

    /* renamed from: b, reason: collision with root package name */
    public final cz.b f66348b;

    public k(String questionId, cz.b bVar) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        this.f66347a = questionId;
        this.f66348b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f66347a, kVar.f66347a) && Intrinsics.d(this.f66348b, kVar.f66348b);
    }

    public final int hashCode() {
        int hashCode = this.f66347a.hashCode() * 31;
        cz.b bVar = this.f66348b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "RecordAnswer(questionId=" + this.f66347a + ", answerValues=" + this.f66348b + ")";
    }
}
