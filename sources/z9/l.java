package z9;

import android.util.Log;
import androidx.lifecycle.t1;
import do2.a2;
import do2.r2;
import do2.t2;
import do2.u2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f141223a;

    /* renamed from: b, reason: collision with root package name */
    public final t2 f141224b;

    /* renamed from: c, reason: collision with root package name */
    public final t2 f141225c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f141226d;

    /* renamed from: e, reason: collision with root package name */
    public final a2 f141227e;

    /* renamed from: f, reason: collision with root package name */
    public final a2 f141228f;

    /* renamed from: g, reason: collision with root package name */
    public final r0 f141229g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f141230h;

    public l(p pVar, r0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f141230h = pVar;
        this.f141223a = new ReentrantLock(true);
        t2 a13 = u2.a(kotlin.collections.q0.f80391a);
        this.f141224b = a13;
        t2 a14 = u2.a(kotlin.collections.s0.f80394a);
        this.f141225c = a14;
        this.f141227e = new a2(a13);
        this.f141228f = new a2(a14);
        this.f141229g = navigator;
    }

    public final void a(k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f141223a;
        reentrantLock.lock();
        try {
            t2 t2Var = this.f141224b;
            t2Var.i(CollectionsKt.m0(backStackEntry, (Collection) t2Var.getValue()));
            Unit unit = Unit.f80348a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(k entry) {
        r rVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        p pVar = this.f141230h;
        boolean d2 = Intrinsics.d(pVar.f141279z.get(entry), Boolean.TRUE);
        Intrinsics.checkNotNullParameter(entry, "entry");
        t2 t2Var = this.f141225c;
        t2Var.i(i1.g((Set) t2Var.getValue(), entry));
        pVar.f141279z.remove(entry);
        kotlin.collections.v vVar = pVar.f141260g;
        boolean contains = vVar.contains(entry);
        t2 t2Var2 = pVar.f141262i;
        if (contains) {
            if (this.f141226d) {
                return;
            }
            pVar.B();
            pVar.f141261h.i(CollectionsKt.H0(vVar));
            t2Var2.i(pVar.v());
            return;
        }
        pVar.A(entry);
        if (entry.f141217h.f18588d.isAtLeast(androidx.lifecycle.r.CREATED)) {
            entry.b(androidx.lifecycle.r.DESTROYED);
        }
        boolean z13 = vVar instanceof Collection;
        String backStackEntryId = entry.f141215f;
        if (!z13 || !vVar.isEmpty()) {
            Iterator it = vVar.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(((k) it.next()).f141215f, backStackEntryId)) {
                    break;
                }
            }
        }
        if (!d2 && (rVar = pVar.f141269p) != null) {
            Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
            t1 t1Var = (t1) rVar.f141281b.remove(backStackEntryId);
            if (t1Var != null) {
                t1Var.a();
            }
        }
        pVar.B();
        t2Var2.i(pVar.v());
    }

    public final void c(k backStackEntry) {
        int i13;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f141223a;
        reentrantLock.lock();
        try {
            ArrayList H0 = CollectionsKt.H0((Collection) this.f141227e.f55726a.getValue());
            ListIterator listIterator = H0.listIterator(H0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i13 = -1;
                    break;
                } else if (Intrinsics.d(((k) listIterator.previous()).f141215f, backStackEntry.f141215f)) {
                    i13 = listIterator.nextIndex();
                    break;
                }
            }
            H0.set(i13, backStackEntry);
            this.f141224b.i(H0);
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void d(k popUpTo, boolean z13) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        p pVar = this.f141230h;
        r0 b13 = pVar.f141275v.b(popUpTo.f141211b.f141322a);
        if (!Intrinsics.d(b13, this.f141229g)) {
            Object obj = pVar.f141276w.get(b13);
            Intrinsics.f(obj);
            ((l) obj).d(popUpTo, z13);
            return;
        }
        Function1 function1 = pVar.f141278y;
        if (function1 != null) {
            function1.invoke(popUpTo);
            e(popUpTo);
            return;
        }
        w1.l0 onComplete = new w1.l0(this, popUpTo, z13, 2);
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        kotlin.collections.v vVar = pVar.f141260g;
        int indexOf = vVar.indexOf(popUpTo);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i13 = indexOf + 1;
        if (i13 != vVar.f80402c) {
            pVar.r(((k) vVar.get(i13)).f141211b.f141329h, true, false);
        }
        p.u(pVar, popUpTo);
        onComplete.invoke();
        pVar.C();
        pVar.b();
    }

    public final void e(k popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f141223a;
        reentrantLock.lock();
        try {
            t2 t2Var = this.f141224b;
            Iterable iterable = (Iterable) t2Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!Intrinsics.d((k) obj, popUpTo))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            t2Var.i(arrayList);
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void f(k popUpTo, boolean z13) {
        Object obj;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        t2 t2Var = this.f141225c;
        Iterable iterable = (Iterable) t2Var.getValue();
        boolean z14 = iterable instanceof Collection;
        a2 a2Var = this.f141227e;
        if (!z14 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((k) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) a2Var.f55726a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((k) it2.next()) == popUpTo) {
                            }
                        }
                    }
                }
            }
        }
        t2Var.i(i1.j((Set) t2Var.getValue(), popUpTo));
        List list = (List) a2Var.f55726a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            k kVar = (k) obj;
            if (!Intrinsics.d(kVar, popUpTo)) {
                r2 r2Var = a2Var.f55726a;
                if (((List) r2Var.getValue()).lastIndexOf(kVar) < ((List) r2Var.getValue()).lastIndexOf(popUpTo)) {
                    break;
                }
            }
        }
        k kVar2 = (k) obj;
        if (kVar2 != null) {
            t2Var.i(i1.j((Set) t2Var.getValue(), kVar2));
        }
        d(popUpTo, z13);
        this.f141230h.f141279z.put(popUpTo, Boolean.valueOf(z13));
    }

    public final void g(k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        p pVar = this.f141230h;
        r0 b13 = pVar.f141275v.b(backStackEntry.f141211b.f141322a);
        if (!Intrinsics.d(b13, this.f141229g)) {
            Object obj = pVar.f141276w.get(b13);
            if (obj == null) {
                throw new IllegalStateException(a.a.p(new StringBuilder("NavigatorBackStack for "), backStackEntry.f141211b.f141322a, " should already be created").toString());
            }
            ((l) obj).g(backStackEntry);
            return;
        }
        Function1 function1 = pVar.f141277x;
        if (function1 != null) {
            function1.invoke(backStackEntry);
            a(backStackEntry);
        } else {
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.f141211b + " outside of the call to navigate(). ");
        }
    }

    public final void h(k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        t2 t2Var = this.f141225c;
        Iterable iterable = (Iterable) t2Var.getValue();
        boolean z13 = iterable instanceof Collection;
        a2 a2Var = this.f141227e;
        if (!z13 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((k) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) a2Var.f55726a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((k) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        k kVar = (k) CollectionsKt.d0((List) a2Var.f55726a.getValue());
        if (kVar != null) {
            t2Var.i(i1.j((Set) t2Var.getValue(), kVar));
        }
        t2Var.i(i1.j((Set) t2Var.getValue(), backStackEntry));
        g(backStackEntry);
    }
}
