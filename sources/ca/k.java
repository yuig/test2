package ca;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a1;
import androidx.fragment.app.u0;
import androidx.fragment.app.v0;
import androidx.fragment.app.w0;
import androidx.lifecycle.t1;
import e0.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import k1.j1;
import k1.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import t3.d4;
import yn2.c0;
import yn2.h0;
import z9.g0;
import z9.q0;
import z9.r0;
import z9.z;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lca/k;", "Lz9/r0;", "Lca/g;", "ca/f", "g4/u", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@q0("fragment")
/* loaded from: classes3.dex */
public class k extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f27051c;

    /* renamed from: d, reason: collision with root package name */
    public final w0 f27052d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27053e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f27054f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f27055g;

    /* renamed from: h, reason: collision with root package name */
    public final d4 f27056h;

    /* renamed from: i, reason: collision with root package name */
    public final z3.m f27057i;

    public k(Context context, w0 fragmentManager, int i13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f27051c = context;
        this.f27052d = fragmentManager;
        this.f27053e = i13;
        this.f27054f = new LinkedHashSet();
        this.f27055g = new ArrayList();
        this.f27056h = new d4(this, 2);
        this.f27057i = new z3.m(this, 4);
    }

    public static void k(k kVar, String str, boolean z13, int i13) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        boolean z14 = (i13 & 4) != 0;
        ArrayList arrayList = kVar.f27055g;
        if (z14) {
            k0.y(arrayList, new j1(str, 3));
        }
        arrayList.add(new Pair(str, Boolean.valueOf(z13)));
    }

    public static void l(Fragment fragment, z9.k entry, z9.l state) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        t1 store = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(store, "fragment.viewModelStore");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h initializer = h.f27045j;
        rl2.d clazz = kotlin.jvm.internal.k0.f80436a.b(f.class);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        if (!(!linkedHashMap.containsKey(clazz))) {
            StringBuilder sb3 = new StringBuilder("A `initializer` with the same `clazz` has already been added: ");
            Intrinsics.checkNotNullParameter(clazz, "<this>");
            sb3.append(clazz.e());
            sb3.append('.');
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        linkedHashMap.put(clazz, new u6.g(clazz));
        Collection initializers = linkedHashMap.values();
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        u6.g[] gVarArr = (u6.g[]) initializers.toArray(new u6.g[0]);
        u6.d factory = new u6.d((u6.g[]) Arrays.copyOf(gVarArr, gVarArr.length));
        u6.a defaultCreationExtras = u6.a.f120754b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x92.b bVar = new x92.b(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(f.class, "modelClass");
        rl2.d modelClass = l0.w0(f.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String e13 = modelClass.e();
        if (e13 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        f fVar = (f) bVar.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e13), modelClass);
        WeakReference weakReference = new WeakReference(new q(entry, state, fragment, 6));
        fVar.getClass();
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        fVar.f27043b = weakReference;
    }

    @Override // z9.r0
    public final z a() {
        Intrinsics.checkNotNullParameter(this, "fragmentNavigator");
        return new g(this);
    }

    @Override // z9.r0
    public final void d(List entries, g0 g0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        w0 w0Var = this.f27052d;
        if (w0Var.Q()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            z9.k kVar = (z9.k) it.next();
            boolean isEmpty = ((List) b().f141227e.f55726a.getValue()).isEmpty();
            int i13 = 0;
            if (g0Var == null || isEmpty || !g0Var.f141189b || !this.f27054f.remove(kVar.f141215f)) {
                androidx.fragment.app.a m13 = m(kVar, g0Var);
                if (!isEmpty) {
                    z9.k kVar2 = (z9.k) CollectionsKt.d0((List) b().f141227e.f55726a.getValue());
                    if (kVar2 != null) {
                        k(this, kVar2.f141215f, false, 6);
                    }
                    String str = kVar.f141215f;
                    k(this, str, false, 6);
                    m13.c(str);
                }
                m13.e(false);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + kVar);
                }
                b().h(kVar);
            } else {
                w0Var.y(new v0(w0Var, kVar.f141215f, i13), false);
                b().h(kVar);
            }
        }
    }

    @Override // z9.r0
    public final void e(final z9.l state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        a1 a1Var = new a1() { // from class: ca.e
            @Override // androidx.fragment.app.a1
            public final void a(w0 w0Var, Fragment fragment) {
                Object obj;
                z9.l state2 = z9.l.this;
                Intrinsics.checkNotNullParameter(state2, "$state");
                k this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(w0Var, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                List list = (List) state2.f141227e.f55726a.getValue();
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
                z9.k kVar = (z9.k) obj;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + kVar + " to FragmentManager " + this$0.f27052d);
                }
                if (kVar != null) {
                    this$0.getClass();
                    fragment.getViewLifecycleOwnerLiveData().e(fragment, new j(new e.f(this$0, fragment, kVar, 16)));
                    fragment.getLifecycle().a(this$0.f27056h);
                    k.l(fragment, kVar, state2);
                }
            }
        };
        w0 w0Var = this.f27052d;
        w0Var.f18463o.add(a1Var);
        i iVar = new i(state, this);
        if (w0Var.f18461m == null) {
            w0Var.f18461m = new ArrayList();
        }
        w0Var.f18461m.add(iVar);
    }

    @Override // z9.r0
    public final void f(z9.k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        w0 w0Var = this.f27052d;
        if (w0Var.Q()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.a m13 = m(backStackEntry, null);
        List list = (List) b().f141227e.f55726a.getValue();
        if (list.size() > 1) {
            z9.k kVar = (z9.k) CollectionsKt.U(f0.i(list) - 1, list);
            if (kVar != null) {
                k(this, kVar.f141215f, false, 6);
            }
            String str = backStackEntry.f141215f;
            k(this, str, true, 4);
            w0Var.y(new u0(w0Var, str, -1, 1), false);
            k(this, str, false, 2);
            m13.c(str);
        }
        m13.e(false);
        b().c(backStackEntry);
    }

    @Override // z9.r0
    public final void g(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f27054f;
            linkedHashSet.clear();
            k0.u(stringArrayList, linkedHashSet);
        }
    }

    @Override // z9.r0
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f27054f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return t.j(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // z9.r0
    public final void i(z9.k popUpTo, boolean z13) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        w0 w0Var = this.f27052d;
        if (w0Var.Q()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().f141227e.f55726a.getValue();
        int indexOf = list.indexOf(popUpTo);
        List subList = list.subList(indexOf, list.size());
        z9.k kVar = (z9.k) CollectionsKt.S(list);
        int i13 = 1;
        if (z13) {
            for (z9.k kVar2 : CollectionsKt.q0(subList)) {
                if (Intrinsics.d(kVar2, kVar)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + kVar2);
                } else {
                    w0Var.y(new v0(w0Var, kVar2.f141215f, i13), false);
                    this.f27054f.add(kVar2.f141215f);
                }
            }
        } else {
            w0Var.y(new u0(w0Var, popUpTo.f141215f, -1, 1), false);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + z13);
        }
        z9.k kVar3 = (z9.k) CollectionsKt.U(indexOf - 1, list);
        if (kVar3 != null) {
            k(this, kVar3.f141215f, false, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subList) {
            z9.k kVar4 = (z9.k) obj;
            h0 p13 = c0.p(CollectionsKt.K(this.f27055g), h.f27046k);
            String str = kVar4.f141215f;
            Intrinsics.checkNotNullParameter(p13, "<this>");
            Intrinsics.checkNotNullParameter(p13, "<this>");
            Iterator it = p13.f139564a.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object invoke = p13.f139565b.invoke(it.next());
                if (i14 < 0) {
                    f0.p();
                    throw null;
                }
                if (!Intrinsics.d(str, invoke)) {
                    i14++;
                } else if (i14 >= 0) {
                }
            }
            if (!Intrinsics.d(kVar4.f141215f, kVar.f141215f)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k(this, ((z9.k) it2.next()).f141215f, true, 4);
        }
        b().f(popUpTo, z13);
    }

    public final androidx.fragment.app.a m(z9.k kVar, g0 g0Var) {
        z zVar = kVar.f141211b;
        Intrinsics.g(zVar, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle a13 = kVar.a();
        String str = ((g) zVar).f27044k;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set".toString());
        }
        char charAt = str.charAt(0);
        Context context = this.f27051c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        w0 w0Var = this.f27052d;
        Fragment a14 = w0Var.J().a(context.getClassLoader(), str);
        Intrinsics.checkNotNullExpressionValue(a14, "fragmentManager.fragment…t.classLoader, className)");
        a14.setArguments(a13);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(w0Var);
        Intrinsics.checkNotNullExpressionValue(aVar, "fragmentManager.beginTransaction()");
        int i13 = g0Var != null ? g0Var.f141193f : -1;
        int i14 = g0Var != null ? g0Var.f141194g : -1;
        int i15 = g0Var != null ? g0Var.f141195h : -1;
        int i16 = g0Var != null ? g0Var.f141196i : -1;
        if (i13 != -1 || i14 != -1 || i15 != -1 || i16 != -1) {
            if (i13 == -1) {
                i13 = 0;
            }
            if (i14 == -1) {
                i14 = 0;
            }
            if (i15 == -1) {
                i15 = 0;
            }
            aVar.m(i13, i14, i15, i16 != -1 ? i16 : 0);
        }
        aVar.l(this.f27053e, a14, kVar.f141215f);
        aVar.o(a14);
        aVar.f18281p = true;
        return aVar;
    }
}
