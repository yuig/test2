package ad2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;

/* loaded from: classes4.dex */
public final class t implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2114a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2115b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f2116c;

    public t(int i13, List boards, j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f2114a = i13;
        this.f2115b = boards;
        this.f2116c = multiSectionVMState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static t b(t tVar, ArrayList arrayList, j0 multiSectionVMState, int i13) {
        int i14 = tVar.f2114a;
        ArrayList boards = arrayList;
        if ((i13 & 2) != 0) {
            boards = tVar.f2115b;
        }
        if ((i13 & 4) != 0) {
            multiSectionVMState = tVar.f2116c;
        }
        tVar.getClass();
        Intrinsics.checkNotNullParameter(boards, "boards");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        return new t(i14, boards, multiSectionVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2114a == tVar.f2114a && Intrinsics.d(this.f2115b, tVar.f2115b) && Intrinsics.d(this.f2116c, tVar.f2116c);
    }

    public final int hashCode() {
        return this.f2116c.f93634a.hashCode() + ep.b.c(this.f2115b, Integer.hashCode(this.f2114a) * 31, 31);
    }

    public final String toString() {
        return "WidgetBoardSelectionVMState(appWidgetId=" + this.f2114a + ", boards=" + this.f2115b + ", multiSectionVMState=" + this.f2116c + ")";
    }
}
