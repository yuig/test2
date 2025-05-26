package vt;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lu.b0;

/* loaded from: classes3.dex */
public final class p extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f126625a;

    /* renamed from: b, reason: collision with root package name */
    public final List f126626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f126627c;

    /* renamed from: d, reason: collision with root package name */
    public final String f126628d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f126629e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f126630f;

    public p(int i13, ArrayList listOfQuestions, int i14, String promotedByString, boolean z13, b0 bottomSheetState) {
        Intrinsics.checkNotNullParameter(listOfQuestions, "listOfQuestions");
        Intrinsics.checkNotNullParameter(promotedByString, "promotedByString");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        this.f126625a = i13;
        this.f126626b = listOfQuestions;
        this.f126627c = i14;
        this.f126628d = promotedByString;
        this.f126629e = z13;
        this.f126630f = bottomSheetState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f126625a == pVar.f126625a && Intrinsics.d(this.f126626b, pVar.f126626b) && this.f126627c == pVar.f126627c && Intrinsics.d(this.f126628d, pVar.f126628d) && this.f126629e == pVar.f126629e && this.f126630f == pVar.f126630f;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f126630f.hashCode() + ep.b.e(this.f126629e, cb.d(this.f126628d, ep.b.b(this.f126627c, ep.b.c(this.f126626b, Integer.hashCode(this.f126625a) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "QuizInProgress(numberOfQuestions=" + this.f126625a + ", listOfQuestions=" + this.f126626b + ", currentQuestion=" + this.f126627c + ", promotedByString=" + this.f126628d + ", userManuallyPaused=" + this.f126629e + ", bottomSheetState=" + this.f126630f + ", scrollingModuleInBackground=false)";
    }
}
