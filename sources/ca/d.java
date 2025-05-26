package ca;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a1;
import androidx.fragment.app.q;
import androidx.fragment.app.w0;
import androidx.lifecycle.s;
import do2.t2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;
import z9.g0;
import z9.q0;
import z9.r0;
import z9.z;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lca/d;", "Lz9/r0;", "Lca/b;", "g4/u", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@q0("dialog")
/* loaded from: classes3.dex */
public final class d extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f27036c;

    /* renamed from: d, reason: collision with root package name */
    public final w0 f27037d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f27038e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.e f27039f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f27040g;

    public d(Context context, w0 fragmentManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f27036c = context;
        this.f27037d = fragmentManager;
        this.f27038e = new LinkedHashSet();
        this.f27039f = new androidx.lifecycle.e(this, 2);
        this.f27040g = new LinkedHashMap();
    }

    @Override // z9.r0
    public final z a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new b(this);
    }

    @Override // z9.r0
    public final void d(List entries, g0 g0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        w0 w0Var = this.f27037d;
        if (w0Var.Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            z9.k kVar = (z9.k) it.next();
            k(kVar).S6(w0Var, kVar.f141215f);
            z9.k kVar2 = (z9.k) CollectionsKt.d0((List) b().f141227e.f55726a.getValue());
            boolean L = CollectionsKt.L((Iterable) b().f141228f.f55726a.getValue(), kVar2);
            b().h(kVar);
            if (kVar2 != null && !L) {
                b().b(kVar2);
            }
        }
    }

    @Override // z9.r0
    public final void e(z9.l state) {
        s lifecycle;
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        Iterator it = ((List) state.f141227e.f55726a.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            w0 w0Var = this.f27037d;
            if (!hasNext) {
                w0Var.f18463o.add(new a1() { // from class: ca.a
                    @Override // androidx.fragment.app.a1
                    public final void a(w0 w0Var2, Fragment childFragment) {
                        d this$0 = d.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(w0Var2, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(childFragment, "childFragment");
                        LinkedHashSet linkedHashSet = this$0.f27038e;
                        if (dl2.b.s(linkedHashSet).remove(childFragment.getTag())) {
                            childFragment.getLifecycle().a(this$0.f27039f);
                        }
                        LinkedHashMap linkedHashMap = this$0.f27040g;
                        dl2.b.u(linkedHashMap).remove(childFragment.getTag());
                    }
                });
                return;
            }
            z9.k kVar = (z9.k) it.next();
            q qVar = (q) w0Var.F(kVar.f141215f);
            if (qVar == null || (lifecycle = qVar.getLifecycle()) == null) {
                this.f27038e.add(kVar.f141215f);
            } else {
                lifecycle.a(this.f27039f);
            }
        }
    }

    @Override // z9.r0
    public final void f(z9.k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        w0 w0Var = this.f27037d;
        if (w0Var.Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.f27040g;
        String str = backStackEntry.f141215f;
        q qVar = (q) linkedHashMap.get(str);
        if (qVar == null) {
            Fragment F = w0Var.F(str);
            qVar = F instanceof q ? (q) F : null;
        }
        if (qVar != null) {
            qVar.getLifecycle().b(this.f27039f);
            qVar.dismiss();
        }
        k(backStackEntry).S6(w0Var, str);
        z9.l b13 = b();
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List list = (List) b13.f141227e.f55726a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            z9.k kVar = (z9.k) listIterator.previous();
            if (Intrinsics.d(kVar.f141215f, str)) {
                t2 t2Var = b13.f141225c;
                t2Var.i(i1.j(i1.j((Set) t2Var.getValue(), kVar), backStackEntry));
                b13.c(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // z9.r0
    public final void i(z9.k popUpTo, boolean z13) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        w0 w0Var = this.f27037d;
        if (w0Var.Q()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f141227e.f55726a.getValue();
        int indexOf = list.indexOf(popUpTo);
        Iterator it = CollectionsKt.q0(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment F = w0Var.F(((z9.k) it.next()).f141215f);
            if (F != null) {
                ((q) F).dismiss();
            }
        }
        l(indexOf, popUpTo, z13);
    }

    public final q k(z9.k kVar) {
        z zVar = kVar.f141211b;
        Intrinsics.g(zVar, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) zVar;
        String str = bVar.f27034k;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }
        char charAt = str.charAt(0);
        Context context = this.f27036c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        Fragment a13 = this.f27037d.J().a(context.getClassLoader(), str);
        Intrinsics.checkNotNullExpressionValue(a13, "fragmentManager.fragment…ader, className\n        )");
        if (q.class.isAssignableFrom(a13.getClass())) {
            q qVar = (q) a13;
            qVar.setArguments(kVar.a());
            qVar.getLifecycle().a(this.f27039f);
            this.f27040g.put(kVar.f141215f, qVar);
            return qVar;
        }
        StringBuilder sb3 = new StringBuilder("Dialog destination ");
        String str2 = bVar.f27034k;
        if (str2 != null) {
            throw new IllegalArgumentException(a.a.p(sb3, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set".toString());
    }

    public final void l(int i13, z9.k kVar, boolean z13) {
        z9.k kVar2 = (z9.k) CollectionsKt.U(i13 - 1, (List) b().f141227e.f55726a.getValue());
        boolean L = CollectionsKt.L((Iterable) b().f141228f.f55726a.getValue(), kVar2);
        b().f(kVar, z13);
        if (kVar2 == null || L) {
            return;
        }
        b().b(kVar2);
    }
}
