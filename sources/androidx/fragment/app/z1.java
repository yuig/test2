package androidx.fragment.app;

import a.cb;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public x1 f18508a;

    /* renamed from: b, reason: collision with root package name */
    public u1 f18509b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f18510c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18511d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f18512e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18513f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18514g;

    public z1(x1 finalState, u1 lifecycleImpact, Fragment fragment, j5.d cancellationSignal) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        this.f18508a = finalState;
        this.f18509b = lifecycleImpact;
        this.f18510c = fragment;
        this.f18511d = new ArrayList();
        this.f18512e = new LinkedHashSet();
        cancellationSignal.b(new com.google.firebase.messaging.a0(this, 1));
    }

    public final void a() {
        if (this.f18513f) {
            return;
        }
        this.f18513f = true;
        LinkedHashSet linkedHashSet = this.f18512e;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = CollectionsKt.I0(linkedHashSet).iterator();
        while (it.hasNext()) {
            ((j5.d) it.next()).a();
        }
    }

    public abstract void b();

    public final void c(x1 finalState, u1 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int i13 = y1.f18500a[lifecycleImpact.ordinal()];
        Fragment fragment = this.f18510c;
        if (i13 == 1) {
            if (this.f18508a == x1.REMOVED) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f18509b + " to ADDING.");
                }
                this.f18508a = x1.VISIBLE;
                this.f18509b = u1.ADDING;
                return;
            }
            return;
        }
        if (i13 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f18508a + " -> REMOVED. mLifecycleImpact  = " + this.f18509b + " to REMOVING.");
            }
            this.f18508a = x1.REMOVED;
            this.f18509b = u1.REMOVING;
            return;
        }
        if (i13 == 3 && this.f18508a != x1.REMOVED) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f18508a + " -> " + finalState + '.');
            }
            this.f18508a = finalState;
        }
    }

    public abstract void d();

    public final String toString() {
        StringBuilder o13 = cb.o("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        o13.append(this.f18508a);
        o13.append(" lifecycleImpact = ");
        o13.append(this.f18509b);
        o13.append(" fragment = ");
        o13.append(this.f18510c);
        o13.append('}');
        return o13.toString();
    }
}
