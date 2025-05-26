package vt;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lu.b0;

/* loaded from: classes3.dex */
public final class n extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f126619a;

    /* renamed from: b, reason: collision with root package name */
    public final List f126620b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126621c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f126622d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f126623e;

    public n(int i13, ArrayList listOfQuestions, String promotedByString, boolean z13, b0 bottomSheetState) {
        Intrinsics.checkNotNullParameter(listOfQuestions, "listOfQuestions");
        Intrinsics.checkNotNullParameter(promotedByString, "promotedByString");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        this.f126619a = i13;
        this.f126620b = listOfQuestions;
        this.f126621c = promotedByString;
        this.f126622d = z13;
        this.f126623e = bottomSheetState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f126619a == nVar.f126619a && Intrinsics.d(this.f126620b, nVar.f126620b) && Intrinsics.d(this.f126621c, nVar.f126621c) && this.f126622d == nVar.f126622d && this.f126623e == nVar.f126623e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f126623e.hashCode() + ep.b.e(this.f126622d, cb.d(this.f126621c, ep.b.c(this.f126620b, Integer.hashCode(this.f126619a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "Initial(currColor=" + this.f126619a + ", listOfQuestions=" + this.f126620b + ", promotedByString=" + this.f126621c + ", userManuallyPaused=" + this.f126622d + ", bottomSheetState=" + this.f126623e + ", scrollingModuleInBackground=false)";
    }
}
