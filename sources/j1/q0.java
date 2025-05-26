package j1;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.navigation.fragment.NavHostFragment;
import e0.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z9.e0;

/* loaded from: classes2.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74201i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74202j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, int i13) {
        super(0);
        this.f74201i = i13;
        this.f74202j = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00fa, code lost:
    
        if (r0.M0().f140635a != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00ca, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0069, code lost:
    
        if (r0.M0().f140635a != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006b, code lost:
    
        r0 = androidx.compose.ui.focus.a.E(r0);
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.q0.invoke():java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f74201i;
        Object obj = this.f74202j;
        switch (i13) {
            case 0:
                return Float.valueOf(e.n(((ao2.j0) obj).getCoroutineContext()));
            case 1:
                m158invoke();
                return Unit.f80348a;
            case 2:
                return invoke();
            case 3:
                return invoke();
            case 4:
                return invoke();
            case 5:
            default:
                final NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context context = navHostFragment.getContext();
                if (context != null) {
                    Intrinsics.checkNotNullExpressionValue(context, "checkNotNull(context) {\n…nt is attached\"\n        }");
                    Intrinsics.checkNotNullParameter(context, "context");
                    final z9.e0 navController = new z9.e0(context);
                    navController.D(navHostFragment);
                    androidx.lifecycle.t1 viewModelStore = navHostFragment.getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                    navController.E(viewModelStore);
                    Intrinsics.checkNotNullParameter(navController, "navHostController");
                    Intrinsics.checkNotNullParameter(navController, "navController");
                    z9.s0 s0Var = navController.f141275v;
                    Context requireContext = navHostFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                    androidx.fragment.app.w0 childFragmentManager = navHostFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
                    s0Var.a(new ca.d(requireContext, childFragmentManager));
                    Context requireContext2 = navHostFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
                    androidx.fragment.app.w0 childFragmentManager2 = navHostFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
                    int id3 = navHostFragment.getId();
                    if (id3 == 0 || id3 == -1) {
                        id3 = ca.m.nav_host_fragment_container;
                    }
                    navController.f141275v.a(new ca.k(requireContext2, childFragmentManager2, id3));
                    Bundle a13 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
                    if (a13 != null) {
                        navController.w(a13);
                    }
                    navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new ma.f() { // from class: ca.l
                        @Override // ma.f
                        public final Bundle a() {
                            int i14 = r2;
                            Object obj2 = navController;
                            switch (i14) {
                                case 0:
                                    e0 this_apply = (e0) obj2;
                                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                                    Bundle y13 = this_apply.y();
                                    if (y13 != null) {
                                        return y13;
                                    }
                                    Bundle EMPTY = Bundle.EMPTY;
                                    Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                                    return EMPTY;
                                default:
                                    NavHostFragment this$0 = (NavHostFragment) obj2;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    int i15 = this$0.f19152c;
                                    if (i15 != 0) {
                                        return t.j(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i15)));
                                    }
                                    Bundle bundle = Bundle.EMPTY;
                                    Intrinsics.checkNotNullExpressionValue(bundle, "{\n                    Bu…e.EMPTY\n                }");
                                    return bundle;
                            }
                        }
                    });
                    Bundle a14 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
                    if (a14 != null) {
                        navHostFragment.f19152c = a14.getInt("android-support-nav:fragment:graphId");
                    }
                    final int i14 = 1;
                    navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new ma.f() { // from class: ca.l
                        @Override // ma.f
                        public final Bundle a() {
                            int i142 = i14;
                            Object obj2 = navHostFragment;
                            switch (i142) {
                                case 0:
                                    e0 this_apply = (e0) obj2;
                                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                                    Bundle y13 = this_apply.y();
                                    if (y13 != null) {
                                        return y13;
                                    }
                                    Bundle EMPTY = Bundle.EMPTY;
                                    Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                                    return EMPTY;
                                default:
                                    NavHostFragment this$0 = (NavHostFragment) obj2;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    int i15 = this$0.f19152c;
                                    if (i15 != 0) {
                                        return t.j(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i15)));
                                    }
                                    Bundle bundle = Bundle.EMPTY;
                                    Intrinsics.checkNotNullExpressionValue(bundle, "{\n                    Bu…e.EMPTY\n                }");
                                    return bundle;
                            }
                        }
                    });
                    int i15 = navHostFragment.f19152c;
                    xk2.v vVar = navController.C;
                    if (i15 != 0) {
                        navController.z(((z9.f0) vVar.getValue()).b(i15), null);
                    } else {
                        Bundle arguments = navHostFragment.getArguments();
                        r1 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                        Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                        if (r1 != 0) {
                            navController.z(((z9.f0) vVar.getValue()).b(r1), bundle);
                        }
                    }
                    return navController;
                }
                throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
            case 6:
                return new androidx.compose.foundation.lazy.layout.v0((r2.k) obj, kotlin.collections.z0.d());
            case 7:
                m158invoke();
                return Unit.f80348a;
            case 8:
                i2.q1 q1Var = (i2.q1) obj;
                if (q1Var != null) {
                    return (List) q1Var.getValue();
                }
                return null;
            case 9:
                return (b4.g) obj;
            case 10:
                m158invoke();
                return Unit.f80348a;
            case 11:
                return ((w1.l1) obj).d();
            case 12:
                return new w1.p2((m1.f1) obj, 0.0f);
            case 13:
                return new n4.h(((n4.i) obj).a());
            case 14:
                Object systemService = ((y1.x) obj).f136605a.getContext().getSystemService("input_method");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 15:
                return new BaseInputConnection(((y1.g0) obj).f136559a, false);
            case 16:
                return invoke();
            case 17:
                return invoke();
            case 18:
                m158invoke();
                return Unit.f80348a;
            case 19:
                m158invoke();
                return Unit.f80348a;
            case 20:
                m158invoke();
                return Unit.f80348a;
            case 21:
                y2.c cVar = (y2.c) obj;
                y2.j jVar = cVar.f136662p;
                if (jVar == null) {
                    jVar = new y2.j();
                    cVar.f136662p = jVar;
                }
                if (jVar.f136680b == null) {
                    t3.c0 c0Var = (t3.c0) com.bumptech.glide.c.V0(cVar);
                    jVar.c();
                    jVar.f136680b = c0Var.f115897o;
                }
                return jVar;
            case 22:
                m158invoke();
                return Unit.f80348a;
            case 23:
                m158invoke();
                return Unit.f80348a;
            case 24:
                l4.b bVar = (l4.b) obj;
                if (((a3.f) bVar.f81530c.getValue()).f497a == y2.h.f136670b) {
                    return null;
                }
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = bVar.f81530c;
                if (a3.f.e(((a3.f) parcelableSnapshotMutableState.getValue()).f497a)) {
                    return null;
                }
                return bVar.f81528a.b(((a3.f) parcelableSnapshotMutableState.getValue()).f497a);
            case 25:
                m158invoke();
                return Unit.f80348a;
            case 26:
                return invoke();
            case 27:
                z9.p pVar = (z9.p) obj;
                pVar.getClass();
                return new z9.f0(pVar.f141254a, pVar.f141275v);
            case 28:
                m158invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m158invoke() {
        Function0 function0;
        int i13 = this.f74201i;
        int i14 = 0;
        Object obj = this.f74202j;
        switch (i13) {
            case 1:
                ((o) obj).f74173f = false;
                break;
            case 7:
                ((u1.e) obj).I.invoke(Boolean.valueOf(!r2.H));
                break;
            case 10:
                ((l1.o) obj).f81353a.setValue(l1.l.f81351a);
                break;
            case 18:
                ((e2.a) obj).f56828j.setValue(Boolean.valueOf(!((Boolean) r2.f56828j.getValue()).booleanValue()));
                break;
            case 19:
                com.bumptech.glide.c.k0((e2.b) obj);
                break;
            case 20:
                f2.e0 e0Var = (f2.e0) obj;
                if (!((Boolean) e0Var.f60844k.getValue()).booleanValue() && (function0 = e0Var.f60835b) != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 22:
                r3.e eVar = (r3.e) obj;
                eVar.f106076f = false;
                HashSet hashSet = new HashSet();
                k2.e eVar2 = eVar.f106074d;
                int i15 = eVar2.f78184c;
                k2.e eVar3 = eVar.f106075e;
                if (i15 > 0) {
                    Object[] objArr = eVar2.f78182a;
                    int i16 = 0;
                    do {
                        s3.k0 k0Var = (s3.k0) objArr[i16];
                        r3.c cVar = (r3.c) eVar3.f78182a[i16];
                        u2.p pVar = k0Var.f110837y.f110808e;
                        if (pVar.f120054m) {
                            r3.e.b(pVar, cVar, hashSet);
                        }
                        i16++;
                    } while (i16 < i15);
                }
                eVar2.h();
                eVar3.h();
                k2.e eVar4 = eVar.f106072b;
                int i17 = eVar4.f78184c;
                k2.e eVar5 = eVar.f106073c;
                if (i17 > 0) {
                    Object[] objArr2 = eVar4.f78182a;
                    do {
                        s3.d dVar = (s3.d) objArr2[i14];
                        r3.c cVar2 = (r3.c) eVar5.f78182a[i14];
                        if (dVar.f120054m) {
                            r3.e.b(dVar, cVar2, hashSet);
                        }
                        i14++;
                    } while (i14 < i17);
                }
                eVar4.h();
                eVar5.h();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((s3.d) it.next()).P0();
                }
                break;
            case 23:
                dl2.b.E(((t3.k1) obj).f116052c, null);
                break;
            case 25:
                p4.t tVar = (p4.t) obj;
                tVar.A.invoke(tVar.f98840x);
                break;
            default:
                ((z9.e0) obj).p();
                break;
        }
    }
}
