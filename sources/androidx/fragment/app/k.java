package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18361a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18362b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18363c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18364d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18365e;

    public k(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(container, "container");
        this.f18361a = container;
        this.f18362b = new ArrayList();
        this.f18363c = new ArrayList();
    }

    public static void a(z1 z1Var) {
        View view = z1Var.f18510c.mView;
        x1 x1Var = z1Var.f18508a;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        x1Var.applyState(view);
    }

    public static void b(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View child = viewGroup.getChildAt(i13);
            if (child.getVisibility() == 0) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                b(child, arrayList);
            }
        }
    }

    public static void j(g1.g gVar, View view) {
        WeakHashMap weakHashMap = q5.v0.f102521a;
        String f13 = q5.m0.f(view);
        if (f13 != null) {
            gVar.put(f13, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View child = viewGroup.getChildAt(i13);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    j(gVar, child);
                }
            }
        }
    }

    public static final k m(ViewGroup container, w0 fragmentManager) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        l0 factory = fragmentManager.K();
        Intrinsics.checkNotNullExpressionValue(factory, "fragmentManager.specialEffectsControllerFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object tag = container.getTag(l6.b.special_effects_controller_view_tag);
        if (tag instanceof k) {
            return (k) tag;
        }
        factory.getClass();
        k kVar = new k(container);
        Intrinsics.checkNotNullExpressionValue(kVar, "factory.createController(container)");
        container.setTag(l6.b.special_effects_controller_view_tag, kVar);
        return kVar;
    }

    public static void o(g1.g gVar, Collection collection) {
        Set entries = gVar.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        m2.b predicate = new m2.b(2, collection);
        Intrinsics.checkNotNullParameter(entries, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        kotlin.collections.k0.x(entries, predicate, false);
    }

    public final void c(x1 x1Var, u1 u1Var, d1 d1Var) {
        synchronized (this.f18362b) {
            j5.d dVar = new j5.d();
            Fragment fragment = d1Var.f18305c;
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            z1 k13 = k(fragment);
            if (k13 != null) {
                k13.c(x1Var, u1Var);
                return;
            }
            final t1 t1Var = new t1(x1Var, u1Var, d1Var, dVar);
            this.f18362b.add(t1Var);
            final int i13 = 0;
            Runnable listener = new Runnable(this) { // from class: androidx.fragment.app.s1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f18433b;

                {
                    this.f18433b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i14 = i13;
                    t1 operation = t1Var;
                    k this$0 = this.f18433b;
                    switch (i14) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            if (this$0.f18362b.contains(operation)) {
                                x1 x1Var2 = operation.f18508a;
                                View view = operation.f18510c.mView;
                                Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                x1Var2.applyState(view);
                                break;
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            this$0.f18362b.remove(operation);
                            this$0.f18363c.remove(operation);
                            break;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener, "listener");
            t1Var.f18511d.add(listener);
            final int i14 = 1;
            Runnable listener2 = new Runnable(this) { // from class: androidx.fragment.app.s1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f18433b;

                {
                    this.f18433b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i142 = i14;
                    t1 operation = t1Var;
                    k this$0 = this.f18433b;
                    switch (i142) {
                        case 0:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            if (this$0.f18362b.contains(operation)) {
                                x1 x1Var2 = operation.f18508a;
                                View view = operation.f18510c.mView;
                                Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                                x1Var2.applyState(view);
                                break;
                            }
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(operation, "$operation");
                            this$0.f18362b.remove(operation);
                            this$0.f18363c.remove(operation);
                            break;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(listener2, "listener");
            t1Var.f18511d.add(listener2);
            Unit unit = Unit.f80348a;
        }
    }

    public final void d(x1 finalState, d1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.f18305c);
        }
        c(finalState, u1.ADDING, fragmentStateManager);
    }

    public final void e(d1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.f18305c);
        }
        c(x1.GONE, u1.NONE, fragmentStateManager);
    }

    public final void f(d1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.f18305c);
        }
        c(x1.REMOVED, u1.REMOVING, fragmentStateManager);
    }

    public final void g(d1 fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.f18305c);
        }
        c(x1.VISIBLE, u1.NONE, fragmentStateManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:263:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x053a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0526 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0518  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.util.ArrayList r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 2189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.h(java.util.ArrayList, boolean):void");
    }

    public final void i() {
        if (this.f18365e) {
            return;
        }
        ViewGroup viewGroup = this.f18361a;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        if (!viewGroup.isAttachedToWindow()) {
            l();
            this.f18364d = false;
            return;
        }
        synchronized (this.f18362b) {
            try {
                if (!this.f18362b.isEmpty()) {
                    ArrayList H0 = CollectionsKt.H0(this.f18363c);
                    this.f18363c.clear();
                    Iterator it = H0.iterator();
                    while (it.hasNext()) {
                        z1 z1Var = (z1) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + z1Var);
                        }
                        z1Var.a();
                        if (!z1Var.f18514g) {
                            this.f18363c.add(z1Var);
                        }
                    }
                    p();
                    ArrayList H02 = CollectionsKt.H0(this.f18362b);
                    this.f18362b.clear();
                    this.f18363c.addAll(H02);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = H02.iterator();
                    while (it2.hasNext()) {
                        ((z1) it2.next()).d();
                    }
                    h(H02, this.f18364d);
                    this.f18364d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final z1 k(Fragment fragment) {
        Object obj;
        Iterator it = this.f18362b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            z1 z1Var = (z1) obj;
            if (Intrinsics.d(z1Var.f18510c, fragment) && !z1Var.f18513f) {
                break;
            }
        }
        return (z1) obj;
    }

    public final void l() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f18361a;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f18362b) {
            try {
                p();
                Iterator it = this.f18362b.iterator();
                while (it.hasNext()) {
                    ((z1) it.next()).d();
                }
                Iterator it2 = CollectionsKt.H0(this.f18363c).iterator();
                while (it2.hasNext()) {
                    z1 z1Var = (z1) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f18361a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + z1Var);
                    }
                    z1Var.a();
                }
                Iterator it3 = CollectionsKt.H0(this.f18362b).iterator();
                while (it3.hasNext()) {
                    z1 z1Var2 = (z1) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f18361a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + z1Var2);
                    }
                    z1Var2.a();
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void n() {
        Object obj;
        synchronized (this.f18362b) {
            try {
                p();
                ArrayList arrayList = this.f18362b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    z1 z1Var = (z1) obj;
                    v1 v1Var = x1.Companion;
                    View view = z1Var.f18510c.mView;
                    Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                    v1Var.getClass();
                    x1 a13 = v1.a(view);
                    x1 x1Var = z1Var.f18508a;
                    x1 x1Var2 = x1.VISIBLE;
                    if (x1Var == x1Var2 && a13 != x1Var2) {
                        break;
                    }
                }
                z1 z1Var2 = (z1) obj;
                Fragment fragment = z1Var2 != null ? z1Var2.f18510c : null;
                this.f18365e = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p() {
        Iterator it = this.f18362b.iterator();
        while (it.hasNext()) {
            z1 z1Var = (z1) it.next();
            if (z1Var.f18509b == u1.ADDING) {
                View requireView = z1Var.f18510c.requireView();
                Intrinsics.checkNotNullExpressionValue(requireView, "fragment.requireView()");
                v1 v1Var = x1.Companion;
                int visibility = requireView.getVisibility();
                v1Var.getClass();
                z1Var.c(v1.b(visibility), u1.NONE);
            }
        }
    }
}
