package ca;

import a.cb;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.r;
import do2.t2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z9.l f27048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f27049b;

    public i(z9.l lVar, k kVar) {
        this.f27048a = lVar;
        this.f27049b = kVar;
    }

    public final void a(Fragment fragment, boolean z13) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        z9.l lVar = this.f27048a;
        ArrayList l03 = CollectionsKt.l0((Iterable) lVar.f141228f.f55726a.getValue(), (Collection) lVar.f141227e.f55726a.getValue());
        ListIterator listIterator = l03.listIterator(l03.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            } else {
                obj2 = listIterator.previous();
                if (Intrinsics.d(((z9.k) obj2).f141215f, fragment.getTag())) {
                    break;
                }
            }
        }
        z9.k kVar = (z9.k) obj2;
        k kVar2 = this.f27049b;
        boolean z14 = z13 && kVar2.f27055g.isEmpty() && fragment.isRemoving();
        Iterator it = kVar2.f27055g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d(((Pair) next).f80346a, fragment.getTag())) {
                obj = next;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            kVar2.f27055g.remove(pair);
        }
        if (!z14 && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + kVar);
        }
        boolean z15 = pair != null && ((Boolean) pair.f80347b).booleanValue();
        if (!z13 && !z15 && kVar == null) {
            throw new IllegalArgumentException(cb.k("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (kVar != null) {
            k.l(fragment, kVar, lVar);
            if (z14) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + kVar + " via system back");
                }
                lVar.f(kVar, false);
            }
        }
    }

    public final void b(Fragment fragment, boolean z13) {
        Object obj;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (z13) {
            z9.l lVar = this.f27048a;
            List list = (List) lVar.f141227e.f55726a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                } else {
                    obj = listIterator.previous();
                    if (Intrinsics.d(((z9.k) obj).f141215f, fragment.getTag())) {
                        break;
                    }
                }
            }
            z9.k entry = (z9.k) obj;
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + entry);
            }
            if (entry != null) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(entry, "entry");
                t2 t2Var = lVar.f141225c;
                t2Var.i(i1.j((Set) t2Var.getValue(), entry));
                if (!lVar.f141230h.f141260g.contains(entry)) {
                    throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                entry.b(r.STARTED);
            }
        }
    }
}
