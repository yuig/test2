package z9;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public l f141282a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f141283b;

    public abstract z a();

    public final l b() {
        l lVar = this.f141282a;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public z c(z destination, Bundle bundle, g0 g0Var) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void d(List entries, g0 g0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        yn2.h0 p13 = yn2.c0.p(CollectionsKt.K(entries), new e.f(this, g0Var, null, 14));
        Intrinsics.checkNotNullParameter(p13, "<this>");
        yn2.h hVar = new yn2.h(yn2.c0.k(p13, yn2.a0.f139533i));
        while (hVar.hasNext()) {
            b().g((k) hVar.next());
        }
    }

    public void e(l state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f141282a = state;
        this.f141283b = true;
    }

    public void f(k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        z zVar = backStackEntry.f141211b;
        if (!(zVar instanceof z)) {
            zVar = null;
        }
        if (zVar == null) {
            return;
        }
        c(zVar, null, kh2.g0.j0(b.f141157u));
        b().c(backStackEntry);
    }

    public void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    public Bundle h() {
        return null;
    }

    public void i(k popUpTo, boolean z13) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List list = (List) b().f141227e.f55726a.getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        k kVar = null;
        while (j()) {
            kVar = (k) listIterator.previous();
            if (Intrinsics.d(kVar, popUpTo)) {
                break;
            }
        }
        if (kVar != null) {
            b().d(kVar, z13);
        }
    }

    public boolean j() {
        return true;
    }
}
