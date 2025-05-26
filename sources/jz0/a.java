package jz0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f77747a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77748b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77749c;

    public a(String quizId, String answerString, String str) {
        Intrinsics.checkNotNullParameter(quizId, "quizId");
        Intrinsics.checkNotNullParameter(answerString, "answerString");
        this.f77747a = quizId;
        this.f77748b = answerString;
        this.f77749c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f77747a, aVar.f77747a) && Intrinsics.d(this.f77748b, aVar.f77748b) && Intrinsics.d(this.f77749c, aVar.f77749c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f77748b, this.f77747a.hashCode() * 31, 31);
        String str = this.f77749c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PearQuizOutputLoaderArgs(quizId=");
        sb3.append(this.f77747a);
        sb3.append(", answerString=");
        sb3.append(this.f77748b);
        sb3.append(", outputKey=");
        return a.a.p(sb3, this.f77749c, ")");
    }
}
