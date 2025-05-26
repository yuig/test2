package ot;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f97511a;

    /* renamed from: b, reason: collision with root package name */
    public final String f97512b;

    public a(ArrayList optionsText, String questionText) {
        Intrinsics.checkNotNullParameter(optionsText, "optionsText");
        Intrinsics.checkNotNullParameter(questionText, "questionText");
        this.f97511a = optionsText;
        this.f97512b = questionText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f97511a, aVar.f97511a) && Intrinsics.d(this.f97512b, aVar.f97512b);
    }

    public final int hashCode() {
        return this.f97512b.hashCode() + (this.f97511a.hashCode() * 31);
    }

    public final String toString() {
        return "QuizViewPagerQuestionOptions(optionsText=" + this.f97511a + ", questionText=" + this.f97512b + ")";
    }
}
