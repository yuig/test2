package androidx.fragment.app;

import a.cb;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class v0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f18446c;

    public /* synthetic */ v0(w0 w0Var, String str, int i13) {
        this.f18444a = i13;
        this.f18446c = w0Var;
        this.f18445b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.t0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        int i13;
        int i14;
        int i15 = this.f18444a;
        String str = this.f18445b;
        w0 w0Var = this.f18446c;
        switch (i15) {
            case 0:
                BackStackState backStackState = (BackStackState) w0Var.f18458j.remove(str);
                if (backStackState == null) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar.f18285t) {
                        Iterator it2 = aVar.f18266a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment = ((g1) it2.next()).f18329b;
                            if (fragment != null) {
                                hashMap.put(fragment.mWho, fragment);
                            }
                        }
                    }
                }
                Iterator it3 = backStackState.a(w0Var, hashMap).iterator();
                boolean z13 = false;
                while (it3.hasNext()) {
                    ((a) it3.next()).a(arrayList, arrayList2);
                    z13 = true;
                }
                return z13;
            default:
                int D = w0Var.D(str, -1, true);
                if (D < 0) {
                    return false;
                }
                for (int i16 = D; i16 < w0Var.f18452d.size(); i16++) {
                    a aVar2 = (a) w0Var.f18452d.get(i16);
                    if (!aVar2.f18281p) {
                        w0Var.k0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar2 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i17 = D; i17 < w0Var.f18452d.size(); i17++) {
                    a aVar3 = (a) w0Var.f18452d.get(i17);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    Iterator it4 = aVar3.f18266a.iterator();
                    while (it4.hasNext()) {
                        g1 g1Var = (g1) it4.next();
                        Fragment fragment2 = g1Var.f18329b;
                        if (fragment2 != null) {
                            if (!g1Var.f18330c || (i14 = g1Var.f18328a) == 1 || i14 == 2 || i14 == 8) {
                                hashSet.add(fragment2);
                                hashSet2.add(fragment2);
                            }
                            int i18 = g1Var.f18328a;
                            if (i18 == 1 || i18 == 2) {
                                hashSet3.add(fragment2);
                            }
                        }
                    }
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder o13 = cb.o("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        o13.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                        o13.append(" in ");
                        o13.append(aVar3);
                        o13.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        w0Var.k0(new IllegalArgumentException(o13.toString()));
                        throw null;
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    Fragment fragment3 = (Fragment) arrayDeque.removeFirst();
                    if (fragment3.mRetainInstance) {
                        StringBuilder o14 = cb.o("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                        o14.append(hashSet.contains(fragment3) ? "direct reference to retained " : "retained child ");
                        o14.append("fragment ");
                        o14.append(fragment3);
                        w0Var.k0(new IllegalArgumentException(o14.toString()));
                        throw null;
                    }
                    Iterator it5 = fragment3.mChildFragmentManager.f18451c.e().iterator();
                    while (it5.hasNext()) {
                        Fragment fragment4 = (Fragment) it5.next();
                        if (fragment4 != null) {
                            arrayDeque.addLast(fragment4);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((Fragment) it6.next()).mWho);
                }
                ArrayList arrayList4 = new ArrayList(w0Var.f18452d.size() - D);
                for (int i19 = D; i19 < w0Var.f18452d.size(); i19++) {
                    arrayList4.add(null);
                }
                BackStackState backStackState2 = new BackStackState(arrayList3, arrayList4);
                int i23 = 1;
                int size = w0Var.f18452d.size() - 1;
                while (size >= D) {
                    a aVar4 = (a) w0Var.f18452d.remove(size);
                    a aVar5 = new a(aVar4);
                    int size2 = aVar5.f18266a.size() - i23;
                    while (size2 >= 0) {
                        g1 g1Var2 = (g1) aVar5.f18266a.get(size2);
                        if (g1Var2.f18330c) {
                            if (g1Var2.f18328a == 8) {
                                g1Var2.f18330c = false;
                                aVar5.f18266a.remove(size2 - 1);
                                size2--;
                            } else {
                                int i24 = g1Var2.f18329b.mContainerId;
                                g1Var2.f18328a = 2;
                                g1Var2.f18330c = false;
                                for (int i25 = size2 - 1; i25 >= 0; i25--) {
                                    g1 g1Var3 = (g1) aVar5.f18266a.get(i25);
                                    if (g1Var3.f18330c && g1Var3.f18329b.mContainerId == i24) {
                                        aVar5.f18266a.remove(i25);
                                        size2--;
                                    }
                                }
                                i13 = -1;
                                size2 += i13;
                            }
                        }
                        i13 = -1;
                        size2 += i13;
                    }
                    arrayList4.set(size - D, new BackStackRecordState(aVar5));
                    aVar4.f18285t = true;
                    arrayList.add(aVar4);
                    arrayList2.add(Boolean.TRUE);
                    size--;
                    i23 = 1;
                }
                boolean z14 = i23;
                w0Var.f18458j.put(str, backStackState2);
                return z14;
        }
    }
}
