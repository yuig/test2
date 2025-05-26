package gz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f66337a;

    /* renamed from: b, reason: collision with root package name */
    public final u f66338b;

    public e(String questionId, u params) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f66337a = questionId;
        this.f66338b = params;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f66337a, eVar.f66337a) && Intrinsics.d(this.f66338b, eVar.f66338b);
    }

    public final int hashCode() {
        return this.f66338b.hashCode() + (this.f66337a.hashCode() * 31);
    }

    public final String toString() {
        return "AnswerSelected(questionId=" + this.f66337a + ", params=" + this.f66338b + ")";
    }
}
