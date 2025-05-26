package jz0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f77766a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77767b;

    public g(String quizId, String str) {
        Intrinsics.checkNotNullParameter(quizId, "quizId");
        this.f77766a = quizId;
        this.f77767b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f77766a, gVar.f77766a) && Intrinsics.d(this.f77767b, gVar.f77767b);
    }

    public final int hashCode() {
        int hashCode = this.f77766a.hashCode() * 31;
        String str = this.f77767b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PearQuizOutputPinFeedLoaderArgs(quizId=");
        sb3.append(this.f77766a);
        sb3.append(", outputKey=");
        return a.a.p(sb3, this.f77767b, ")");
    }
}
