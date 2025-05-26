package fz0;

import a.cb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class t implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f63150a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63151b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f63152c;

    /* renamed from: d, reason: collision with root package name */
    public final String f63153d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f63154e;

    public t(String quizId, boolean z13, String referrer, l0 pinalyticsVMState) {
        LinkedHashMap answers = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(quizId, "quizId");
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f63150a = quizId;
        this.f63151b = z13;
        this.f63152c = answers;
        this.f63153d = referrer;
        this.f63154e = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f63150a, tVar.f63150a) && this.f63151b == tVar.f63151b && Intrinsics.d(this.f63152c, tVar.f63152c) && Intrinsics.d(this.f63153d, tVar.f63153d) && Intrinsics.d(this.f63154e, tVar.f63154e);
    }

    public final int hashCode() {
        return this.f63154e.hashCode() + cb.d(this.f63153d, a.c.e(this.f63152c, ep.b.e(this.f63151b, this.f63150a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "QuizVMState(quizId=" + this.f63150a + ", skipNux=" + this.f63151b + ", answers=" + this.f63152c + ", referrer=" + this.f63153d + ", pinalyticsVMState=" + this.f63154e + ")";
    }
}
