package lb;

import am2.c1;
import am2.d1;
import am2.e1;
import am2.f1;
import android.R;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase;
import com.apollographql.apollo3.exception.CacheMissException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.search.SearchBar;
import com.google.android.material.textfield.TextInputLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import do2.a3;
import do2.j2;
import do2.p1;
import do2.q2;
import do2.r2;
import do2.t2;
import do2.u2;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jk2.a2;
import kh2.g2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import oi.u6;
import pn2.g1;
import pn2.l1;
import pn2.t1;
import pn2.v1;
import pn2.w1;
import ul2.i1;
import ul2.o1;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a */
    public static boolean f82618a;

    /* renamed from: b */
    public static volatile ak2.e f82619b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean A(ArrayList arrayList) {
        Collection collection;
        long j13;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            collection = kotlin.collections.q0.f80391a;
        } else {
            collection = new ArrayList();
            Object obj = arrayList.get(0);
            int i13 = kotlin.collections.f0.i(arrayList);
            int i14 = 0;
            while (i14 < i13) {
                i14++;
                Object obj2 = arrayList.get(i14);
                z3.q qVar = (z3.q) obj2;
                z3.q qVar2 = (z3.q) obj;
                collection.add(new a3.c(com.bumptech.glide.c.d(Math.abs(a3.c.d(qVar2.f().b()) - a3.c.d(qVar.f().b())), Math.abs(a3.c.e(qVar2.f().b()) - a3.c.e(qVar.f().b())))));
                obj = obj2;
            }
        }
        if (collection.size() == 1) {
            j13 = ((a3.c) CollectionsKt.S(collection)).f482a;
        } else {
            if (collection.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object S = CollectionsKt.S(collection);
            int i15 = kotlin.collections.f0.i(collection);
            if (1 <= i15) {
                int i16 = 1;
                while (true) {
                    S = new a3.c(a3.c.h(((a3.c) S).f482a, ((a3.c) collection.get(i16)).f482a));
                    if (i16 == i15) {
                        break;
                    }
                    i16++;
                }
            }
            j13 = ((a3.c) S).f482a;
        }
        return a3.c.e(j13) < a3.c.d(j13);
    }

    public static int A0(int i13) {
        return i13 & 7;
    }

    public static boolean A1(uj2.t tVar, uj2.v vVar, ak2.f fVar) {
        if (!(tVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) tVar).call();
            if (call == null) {
                bk2.d.complete(vVar);
                return true;
            }
            try {
                Object apply = fVar.apply(call);
                ck2.i.b(apply, "The mapper returned a null ObservableSource");
                uj2.t tVar2 = (uj2.t) apply;
                if (tVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) tVar2).call();
                        if (call2 == null) {
                            bk2.d.complete(vVar);
                            return true;
                        }
                        a2 a2Var = new a2(call2, vVar);
                        vVar.b(a2Var);
                        a2Var.run();
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        bk2.d.error(th3, vVar);
                        return true;
                    }
                } else {
                    tVar2.d(vVar);
                }
                return true;
            } catch (Throwable th4) {
                bp1.h.H(th4);
                bk2.d.error(th4, vVar);
                return true;
            }
        } catch (Throwable th5) {
            bp1.h.H(th5);
            bk2.d.error(th5, vVar);
            return true;
        }
    }

    public static Rect B(View view, SearchBar searchBar) {
        int[] iArr = new int[2];
        searchBar.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i15 = i13 - iArr2[0];
        int i16 = i14 - iArr2[1];
        return new Rect(i15, i16, searchBar.getWidth() + i15, searchBar.getHeight() + i16);
    }

    public static final Object B0(on2.s sVar, rl2.u p13) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(p13, "p");
        return sVar.invoke();
    }

    public static final tm2.s0 B1(tm2.a1 a1Var, vm2.i typeTable) {
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i13 = a1Var.f118166c;
        if ((i13 & 4) == 4) {
            tm2.s0 s0Var = a1Var.f118169f;
            Intrinsics.checkNotNullExpressionValue(s0Var, "getType(...)");
            return s0Var;
        }
        if ((i13 & 8) == 8) {
            return typeTable.a(a1Var.f118170g);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    public static uj2.a0 C(wj2.a aVar) {
        try {
            Object call = aVar.call();
            ck2.i.b(call, "Scheduler Callable result can't be null");
            return (uj2.a0) call;
        } catch (Throwable th3) {
            throw pk2.h.d(th3);
        }
    }

    public static boolean C0(am2.d callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (!im2.i.f72747d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (!CollectionsKt.L(im2.i.f72746c, fn2.d.c(callableMemberDescriptor)) || !callableMemberDescriptor.x().isEmpty()) {
            if (!xl2.l.B(callableMemberDescriptor)) {
                return false;
            }
            Collection h10 = callableMemberDescriptor.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getOverriddenDescriptors(...)");
            Collection<am2.d> collection = h10;
            if (collection.isEmpty()) {
                return false;
            }
            for (am2.d dVar : collection) {
                Intrinsics.f(dVar);
                if (C0(dVar)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable C1(Drawable drawable) {
        if (!(drawable instanceof g5.c)) {
            return drawable;
        }
        ((g5.d) ((g5.c) drawable)).getClass();
        return null;
    }

    public static final do2.c D(Function2 function2) {
        return new do2.c(function2, kotlin.coroutines.j.f80412a, -2, co2.a.SUSPEND);
    }

    public static final int D0(int i13, int i14) {
        return (i13 >> i14) & 31;
    }

    public static final pn2.h0 D1(pn2.h0 h0Var, pn2.h0 abbreviatedType) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return ao2.m0.U(h0Var) ? h0Var : new pn2.a(h0Var, abbreviatedType);
    }

    public static final String E(String str) {
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'a' > (charAt = str.charAt(0)) || charAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return upperCase + substring;
    }

    public static final void E0(ao2.m mVar, ao2.l lVar) {
        if (!(mVar instanceof ao2.o)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((ao2.o) mVar).y(lVar);
    }

    public static l1 E1(l1 l1Var) {
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        if (!(l1Var instanceof pn2.y)) {
            return new cn2.d(l1Var, true);
        }
        pn2.y yVar = (pn2.y) l1Var;
        c1[] c1VarArr = yVar.f100856b;
        ArrayList h03 = kotlin.collections.c0.h0(yVar.f100857c, c1VarArr);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(h03, 10));
        Iterator it = h03.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(P((g1) pair.f80346a, (c1) pair.f80347b));
        }
        return new pn2.y(c1VarArr, (g1[]) arrayList.toArray(new g1[0]), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable F(bl2.c r4, do2.i r5, do2.j r6) {
        /*
            boolean r0 = r4 instanceof do2.k0
            if (r0 == 0) goto L13
            r0 = r4
            do2.k0 r0 = (do2.k0) r0
            int r1 = r0.f55836t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55836t = r1
            goto L18
        L13:
            do2.k0 r0 = new do2.k0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f55835s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55836t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.internal.j0 r5 = r0.f55834r
            ue.c.H(r4)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r4 = move-exception
            r1 = r4
            goto L51
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            ue.c.H(r4)
            kotlin.jvm.internal.j0 r4 = new kotlin.jvm.internal.j0
            r4.<init>()
            do2.m0 r2 = new do2.m0     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L4e
            r0.f55834r = r4     // Catch: java.lang.Throwable -> L4e
            r0.f55836t = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r5.collect(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r4 != r1) goto L4c
            goto L82
        L4c:
            r1 = 0
            goto L82
        L4e:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L51:
            java.lang.Object r4 = r5.f80434a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5d
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r4, r1)
            if (r5 != 0) goto L7f
        L5d:
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            ao2.g0 r6 = ao2.g0.f20154b
            kotlin.coroutines.CoroutineContext$Element r5 = r5.get(r6)
            ao2.o1 r5 = (ao2.o1) r5
            if (r5 == 0) goto L80
            boolean r6 = r5.isCancelled()
            if (r6 != 0) goto L72
            goto L80
        L72:
            java.util.concurrent.CancellationException r5 = r5.getCancellationException()
            if (r5 == 0) goto L80
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r5 != 0) goto L7f
            goto L80
        L7f:
            throw r1
        L80:
            if (r4 != 0) goto L83
        L82:
            return r1
        L83:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L8b
            xk2.f.a(r4, r1)
            throw r4
        L8b:
            xk2.f.a(r1, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.l0.F(bl2.c, do2.i, do2.j):java.io.Serializable");
    }

    public static final boolean F0(Object obj) {
        return obj == ho2.a.f69743a;
    }

    public static final tb.s F1(List schedulers, tb.s workSpec) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        boolean j13 = workSpec.f117020e.j("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean j14 = workSpec.f117020e.j("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean j15 = workSpec.f117020e.j("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (j13 || !j14 || !j15) {
            return workSpec;
        }
        ja.c0 c0Var = new ja.c0(1);
        c0Var.f(workSpec.f117020e);
        c0Var.j("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.f117018c);
        return tb.s.b(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", c0Var.b(), 0, 0L, 0, 0, 0L, 0, 16777195);
    }

    public static final void G(WorkDatabase workDatabase, kb.d configuration, b0 continuation) {
        int i13;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        ArrayList l13 = kotlin.collections.f0.l(continuation);
        int i14 = 0;
        while (!l13.isEmpty()) {
            b0 b0Var = (b0) kotlin.collections.k0.B(l13);
            List list = b0Var.f82577e;
            Intrinsics.checkNotNullExpressionValue(list, "current.work");
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i13 = 0;
            } else {
                Iterator it = list2.iterator();
                i13 = 0;
                while (it.hasNext()) {
                    if (((kb.y0) it.next()).f79055b.f117025j.f() && (i13 = i13 + 1) < 0) {
                        kotlin.collections.f0.o();
                        throw null;
                    }
                }
            }
            i14 += i13;
            List list3 = b0Var.f82580h;
            if (list3 != null) {
                l13.addAll(list3);
            }
        }
        if (i14 == 0) {
            return;
        }
        tb.y y13 = workDatabase.y();
        y13.getClass();
        ja.f0 d2 = ja.f0.d(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        ja.d0 d0Var = y13.f117050a;
        d0Var.b();
        Cursor m03 = d7.b.m0(d0Var, d2, false);
        try {
            int i15 = m03.moveToFirst() ? m03.getInt(0) : 0;
            m03.close();
            d2.e();
            int i16 = configuration.f78979j;
            if (i15 + i14 > i16) {
                throw new IllegalArgumentException(a.a.n(a.a.t("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i16, ";\nalready enqueued count: ", i15, ";\ncurrent enqueue operation count: "), i14, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
            }
        } catch (Throwable th3) {
            m03.close();
            d2.e();
            throw th3;
        }
    }

    public static final boolean G0(am2.r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.getGetter() == null;
    }

    public static void H(g7.f fVar) {
        if (fVar != null) {
            try {
                fVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean H0(View view) {
        WeakHashMap weakHashMap = q5.v0.f102521a;
        return view.getLayoutDirection() == 1;
    }

    public static final Object I(do2.i iVar, Function2 function2, bl2.c cVar) {
        int i13 = do2.b1.f55739a;
        Object collect = y(new eo2.r(new d10.f(function2, null), iVar, kotlin.coroutines.j.f80412a, -2, co2.a.SUSPEND), 0).collect(eo2.i0.f59780a, cVar);
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (collect != aVar) {
            collect = Unit.f80348a;
        }
        return collect == aVar ? collect : Unit.f80348a;
    }

    public static final boolean I0(String str, int i13) {
        char charAt = str.charAt(i13);
        return 'A' <= charAt && charAt < '[';
    }

    public static final byte[] J(String str) {
        int i13;
        char charAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i14 = 0;
        while (i14 < length) {
            char charAt2 = str.charAt(i14);
            if (Intrinsics.i(charAt2, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) >= 0) {
                int length2 = str.length();
                int i15 = i14;
                while (i14 < length2) {
                    char charAt3 = str.charAt(i14);
                    if (Intrinsics.i(charAt3, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) < 0) {
                        int i16 = i15 + 1;
                        bArr[i15] = (byte) charAt3;
                        i14++;
                        while (true) {
                            i15 = i16;
                            if (i14 < length2 && Intrinsics.i(str.charAt(i14), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) < 0) {
                                i16 = i15 + 1;
                                bArr[i15] = (byte) str.charAt(i14);
                                i14++;
                            }
                        }
                    } else {
                        if (Intrinsics.i(charAt3, 2048) < 0) {
                            bArr[i15] = (byte) ((charAt3 >> 6) | RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
                            i15 += 2;
                            bArr[i15 + 1] = (byte) ((charAt3 & '?') | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                        } else if (55296 > charAt3 || charAt3 >= 57344) {
                            bArr[i15] = (byte) ((charAt3 >> '\f') | RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
                            bArr[i15 + 1] = (byte) (((charAt3 >> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                            i15 += 3;
                            bArr[i15 + 2] = (byte) ((charAt3 & '?') | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                        } else if (Intrinsics.i(charAt3, 56319) > 0 || length2 <= (i13 = i14 + 1) || 56320 > (charAt = str.charAt(i13)) || charAt >= 57344) {
                            bArr[i15] = 63;
                            i14++;
                            i15++;
                        } else {
                            int charAt4 = (str.charAt(i13) + (charAt3 << '\n')) - 56613888;
                            bArr[i15] = (byte) ((charAt4 >> 18) | RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
                            bArr[i15 + 1] = (byte) (((charAt4 >> 12) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                            bArr[i15 + 2] = (byte) (((charAt4 >> 6) & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                            i15 += 4;
                            bArr[i15 + 3] = (byte) ((charAt4 & 63) | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                            i14 += 2;
                        }
                        i14++;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i15);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                return copyOf;
            }
            bArr[i14] = (byte) charAt2;
            i14++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        return copyOf2;
    }

    public static final void J0(do2.i iVar, ao2.j0 j0Var) {
        kotlin.jvm.internal.j.z(j0Var, null, null, new do2.n(iVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        if (xm2.j.d(((nn2.s) r0).B) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (bn2.e.p(r1, am2.h.ANNOTATION_CLASS) == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final vl2.y K(ul2.i1 r4, boolean r5, java.lang.reflect.Field r6) {
        /*
            ul2.o1 r0 = r4.v()
            am2.r0 r0 = r0.n()
            am2.m r1 = r0.g()
            java.lang.String r2 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            boolean r2 = bn2.e.n(r1)
            r3 = 0
            if (r2 != 0) goto L19
            goto L3c
        L19:
            am2.m r1 = r1.g()
            am2.h r2 = am2.h.INTERFACE
            boolean r2 = bn2.e.p(r1, r2)
            if (r2 != 0) goto L2d
            am2.h r2 = am2.h.ANNOTATION_CLASS
            boolean r1 = bn2.e.p(r1, r2)
            if (r1 == 0) goto L46
        L2d:
            boolean r1 = r0 instanceof nn2.s
            if (r1 == 0) goto L3c
            nn2.s r0 = (nn2.s) r0
            tm2.i0 r0 = r0.B
            boolean r0 = xm2.j.d(r0)
            if (r0 == 0) goto L3c
            goto L46
        L3c:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L7e
        L46:
            if (r5 == 0) goto L60
            boolean r5 = r4.t()
            if (r5 == 0) goto L59
            vl2.j r5 = new vl2.j
            java.lang.Object r4 = p0(r4)
            r5.<init>(r6, r4)
            goto Ldc
        L59:
            vl2.l r5 = new vl2.l
            r5.<init>(r6, r3)
            goto Ldc
        L60:
            boolean r5 = r4.t()
            if (r5 == 0) goto L74
            vl2.n r5 = new vl2.n
            boolean r0 = L(r4)
            java.lang.Object r4 = p0(r4)
            r5.<init>(r6, r0, r4)
            goto Ldc
        L74:
            vl2.p r5 = new vl2.p
            boolean r4 = L(r4)
            r5.<init>(r6, r4, r3)
            goto Ldc
        L7e:
            ul2.o1 r0 = r4.v()
            am2.r0 r0 = r0.n()
            bm2.i r0 = r0.getAnnotations()
            ym2.c r1 = ul2.c2.f122505a
            boolean r0 = r0.Q(r1)
            if (r0 == 0) goto Lca
            r0 = 1
            java.lang.String r1 = "field"
            if (r5 == 0) goto Lad
            boolean r4 = r4.t()
            if (r4 == 0) goto La7
            vl2.k r4 = new vl2.k
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            r4.<init>(r6, r3)
        La5:
            r5 = r4
            goto Ldc
        La7:
            vl2.l r4 = new vl2.l
            r4.<init>(r6, r0)
            goto La5
        Lad:
            boolean r5 = r4.t()
            if (r5 == 0) goto Lc0
            vl2.o r5 = new vl2.o
            boolean r4 = L(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            r5.<init>(r6, r4, r3)
            goto Ldc
        Lc0:
            vl2.p r5 = new vl2.p
            boolean r4 = L(r4)
            r5.<init>(r6, r4, r0)
            goto Ldc
        Lca:
            r0 = 2
            if (r5 == 0) goto Ld3
            vl2.l r5 = new vl2.l
            r5.<init>(r6, r0)
            goto Ldc
        Ld3:
            vl2.p r5 = new vl2.p
            boolean r4 = L(r4)
            r5.<init>(r6, r4, r0)
        Ldc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.l0.K(ul2.i1, boolean, java.lang.reflect.Field):vl2.y");
    }

    public static final v1 K0(v1 v1Var, boolean z13) {
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        int i13 = pn2.r.f100835d;
        pn2.r k13 = rm2.i0.k(v1Var, z13);
        if (k13 != null) {
            return k13;
        }
        pn2.h0 L0 = L0(v1Var);
        return L0 != null ? L0 : v1Var.A0(false);
    }

    public static final boolean L(i1 i1Var) {
        return !t1.g(i1Var.v().n().getType());
    }

    public static final pn2.h0 L0(pn2.b0 b0Var) {
        pn2.a0 a0Var;
        pn2.b1 w03 = b0Var.w0();
        pn2.a0 a0Var2 = w03 instanceof pn2.a0 ? (pn2.a0) w03 : null;
        if (a0Var2 == null) {
            return null;
        }
        LinkedHashSet<pn2.b0> linkedHashSet = a0Var2.f100761b;
        ArrayList typesToIntersect = new ArrayList(kotlin.collections.g0.q(linkedHashSet, 10));
        boolean z13 = false;
        for (pn2.b0 b0Var2 : linkedHashSet) {
            if (t1.g(b0Var2)) {
                b0Var2 = K0(b0Var2.z0(), false);
                z13 = true;
            }
            typesToIntersect.add(b0Var2);
        }
        if (z13) {
            pn2.b0 b0Var3 = a0Var2.f100760a;
            if (b0Var3 == null) {
                b0Var3 = null;
            } else if (t1.g(b0Var3)) {
                b0Var3 = K0(b0Var3.z0(), false);
            }
            Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
            typesToIntersect.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(typesToIntersect);
            linkedHashSet2.hashCode();
            a0Var = new pn2.a0(linkedHashSet2);
            a0Var.f100760a = b0Var3;
        } else {
            a0Var = null;
        }
        if (a0Var == null) {
            return null;
        }
        return a0Var.g();
    }

    public static final List M(am2.k kVar) {
        List list;
        Object obj;
        pn2.b1 e13;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        List k13 = kVar.k();
        Intrinsics.checkNotNullExpressionValue(k13, "getDeclaredTypeParameters(...)");
        if (!kVar.q() && !(kVar.g() instanceof am2.b)) {
            return k13;
        }
        List t13 = yn2.c0.t(yn2.c0.m(yn2.c0.j(yn2.c0.s(fn2.d.k(kVar), d1.f15544i), e1.f15550i), f1.f15553i));
        Iterator it = fn2.d.k(kVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof am2.g) {
                break;
            }
        }
        am2.g gVar = (am2.g) obj;
        if (gVar != null && (e13 = gVar.e()) != null) {
            list = e13.getParameters();
        }
        if (list == null) {
            list = kotlin.collections.q0.f80391a;
        }
        if (t13.isEmpty() && list.isEmpty()) {
            List k14 = kVar.k();
            Intrinsics.checkNotNullExpressionValue(k14, "getDeclaredTypeParameters(...)");
            return k14;
        }
        ArrayList<c1> l03 = CollectionsKt.l0(list, t13);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(l03, 10));
        for (c1 c1Var : l03) {
            Intrinsics.f(c1Var);
            arrayList.add(new am2.e(c1Var, kVar, k13.size()));
        }
        return CollectionsKt.l0(arrayList, k13);
    }

    public static String M0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb3 = new StringBuilder(str2.length() + str.length());
        for (int i13 = 0; i13 < str.length(); i13++) {
            sb3.append(str.charAt(i13));
            if (str2.length() > i13) {
                sb3.append(str2.charAt(i13));
            }
        }
        return sb3.toString();
    }

    public static ImageView.ScaleType N(int i13) {
        return i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 5 ? i13 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final Map N0(pc.o0 o0Var, pc.n0 data, pc.v customScalarAdapters, wc.d cacheKeyGenerator) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(cacheKeyGenerator, "cacheKeyGenerator");
        String rootKey = wc.c.f129078b.f129079a;
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(cacheKeyGenerator, "cacheKeyGenerator");
        Intrinsics.checkNotNullParameter(rootKey, "rootKey");
        tc.m mVar = new tc.m();
        o0Var.b().d(mVar, customScalarAdapters, data);
        ja.c0 variables = d7.b.G0(o0Var, customScalarAdapters);
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(rootKey, "rootKey");
        Intrinsics.checkNotNullParameter(cacheKeyGenerator, "cacheKeyGenerator");
        com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q();
        qVar.f33804b = variables;
        qVar.f33803a = rootKey;
        qVar.f33805c = cacheKeyGenerator;
        qVar.f33806d = new LinkedHashMap();
        Object c13 = mVar.c();
        Intrinsics.g(c13, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        Map map = (Map) c13;
        List selections = o0Var.d().f99587f;
        String parentType = o0Var.d().f99583b.L().f99598g;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(selections, "selections");
        Intrinsics.checkNotNullParameter(parentType, "parentType");
        qVar.h(map, (String) qVar.f33803a, selections, parentType);
        return (Map) qVar.f33806d;
    }

    public static final int O(int i13) {
        switch (i13) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final g1 P(g1 typeProjection, c1 c1Var) {
        if (c1Var == null || typeProjection.c() == w1.INVARIANT) {
            return typeProjection;
        }
        if (c1Var.r() != typeProjection.c()) {
            Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
            cn2.c cVar = new cn2.c(typeProjection);
            pn2.u0.f100848b.getClass();
            return new pn2.i1(new cn2.a(typeProjection, cVar, false, pn2.u0.f100849c));
        }
        if (!typeProjection.b()) {
            return new pn2.i1(typeProjection.getType());
        }
        on2.c NO_LOCKS = on2.q.f96785e;
        Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        return new pn2.i1(new pn2.d0(NO_LOCKS, new g2(typeProjection, 17)));
    }

    public static final g4.f Q(Context context) {
        return new g4.f(new bk.f(context), new g4.a(Build.VERSION.SDK_INT >= 31 ? g4.m.f63475a.a(context) : 0));
    }

    public static final do2.s0 Q0(Function2 function2, do2.i iVar) {
        return new do2.s0(1, function2, iVar);
    }

    public static final j0 R(Context context, kb.d configuration) {
        ja.a0 a13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        vb.b workTaskExecutor = new vb.b(configuration.f78972c);
        final Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
        ub.j executor = workTaskExecutor.f125444a;
        Intrinsics.checkNotNullExpressionValue(executor, "workTaskExecutor.serialTaskExecutor");
        boolean z13 = context.getResources().getBoolean(kb.p0.workmanager_test_configuration);
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(executor, "queryExecutor");
        bk.f clock = configuration.f78973d;
        Intrinsics.checkNotNullParameter(clock, "clock");
        if (z13) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            a13 = new ja.a0(context2, WorkDatabase.class, null);
            a13.f75161j = true;
        } else {
            a13 = se.l.a(context2, WorkDatabase.class, "androidx.work.workdb");
            a13.f75160i = new oa.e() { // from class: lb.c0
                @Override // oa.e
                public final oa.f q(oa.d configuration2) {
                    Intrinsics.checkNotNullParameter(configuration2, "configuration");
                    Context context3 = context2;
                    Intrinsics.checkNotNullParameter(context3, "context");
                    Intrinsics.checkNotNullParameter(context3, "context");
                    oa.c callback = configuration2.f93838c;
                    Intrinsics.checkNotNullParameter(callback, "callback");
                    if (callback == null) {
                        throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                    }
                    String str = configuration2.f93837b;
                    if (str == null || str.length() == 0) {
                        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                    }
                    Intrinsics.checkNotNullParameter(new oa.d(context3, str, callback, true, true), "configuration");
                    return new pa.i(context3, str, callback, true, true);
                }
            };
        }
        Intrinsics.checkNotNullParameter(executor, "executor");
        a13.f75158g = executor;
        a callback = new a(clock);
        Intrinsics.checkNotNullParameter(callback, "callback");
        a13.f75155d.add(callback);
        a13.a(h.f82595c);
        a13.a(new p(context2, 2, 3));
        a13.a(i.f82598c);
        a13.a(j.f82601c);
        a13.a(new p(context2, 5, 6));
        a13.a(k.f82615c);
        a13.a(l.f82617c);
        a13.a(m.f82620c);
        a13.a(new p(context2));
        a13.a(new p(context2, 10, 11));
        a13.a(d.f82585c);
        a13.a(e.f82587c);
        a13.a(f.f82590c);
        a13.a(g.f82592c);
        a13.a(new p(context2, 21, 22));
        a13.f75163l = false;
        a13.f75164m = true;
        WorkDatabase workDatabase = (WorkDatabase) a13.b();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        rb.l trackers = new rb.l(applicationContext, workTaskExecutor);
        o processor = new o(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase);
        k0 schedulersCreator = k0.f82616a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new j0(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.g(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static void R0(Throwable th3) {
        ak2.e eVar = f82619b;
        if (th3 == null) {
            th3 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th3 instanceof OnErrorNotImplementedException) && !(th3 instanceof MissingBackpressureException) && !(th3 instanceof IllegalStateException) && !(th3 instanceof NullPointerException) && !(th3 instanceof IllegalArgumentException) && !(th3 instanceof CompositeException)) {
            th3 = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th3, th3);
        }
        if (eVar != null) {
            try {
                eVar.accept(th3);
                return;
            } catch (Throwable th4) {
                th4.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th4);
            }
        }
        th3.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th3);
    }

    public static final Object S(long j13, bl2.c frame) {
        if (j13 <= 0) {
            return Unit.f80348a;
        }
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        if (j13 < Long.MAX_VALUE) {
            s0(oVar.f20185e).f(j13, oVar);
        }
        Object u13 = oVar.u();
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13 == aVar ? u13 : Unit.f80348a;
    }

    public static final tm2.s0 S0(tm2.s0 s0Var, vm2.i typeTable) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i13 = s0Var.f118453c;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            return s0Var.f118463m;
        }
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            return typeTable.a(s0Var.f118464n);
        }
        return null;
    }

    public static final Object T(long j13, bl2.c cVar) {
        Object S = S(w1(j13), cVar);
        return S == cl2.a.COROUTINE_SUSPENDED ? S : Unit.f80348a;
    }

    public static PorterDuff.Mode T0(int i13, PorterDuff.Mode mode) {
        if (i13 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i13 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i13 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i13) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final Set U(Collection collection) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                kotlin.collections.k0.u(((wc.m) it.next()).b(), arrayList);
            }
            Set J0 = CollectionsKt.J0(arrayList);
            if (J0 != null) {
                return J0;
            }
        }
        return kotlin.collections.s0.f80394a;
    }

    public static final pc.n0 U0(pc.o0 o0Var, pc.v customScalarAdapters, wc.l cache, wc.e cacheResolver, wc.a cacheHeaders) {
        List list;
        Pair pair;
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(cacheResolver, "cacheResolver");
        Intrinsics.checkNotNullParameter(cacheHeaders, "cacheHeaders");
        wc.c cVar = wc.c.f129078b;
        ja.c0 G0 = d7.b.G0(o0Var, customScalarAdapters);
        String str = cVar.f129079a;
        List list2 = o0Var.d().f99587f;
        String str2 = o0Var.d().f99583b.L().f99598g;
        p0 p0Var = new p0(cache, str, G0, cacheResolver, cacheHeaders, list2, str2);
        ((List) p0Var.f82660i).add(new xc.a(str, kotlin.collections.q0.f80391a, list2, str2));
        while (true) {
            boolean z13 = !((List) p0Var.f82660i).isEmpty();
            Object obj = p0Var.f82659h;
            if (!z13) {
                kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
                Object f13 = p0Var.f(((Map) obj).get(q0Var), q0Var);
                Intrinsics.g(f13, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                return (pc.n0) o0Var.b().f(new tc.i(q0Var, (Map) f13), customScalarAdapters);
            }
            wc.l lVar = (wc.l) p0Var.f82653b;
            List list3 = (List) p0Var.f82660i;
            int i13 = 10;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((xc.a) it.next()).f134533a);
            }
            ArrayList b13 = lVar.b(arrayList, (wc.a) p0Var.f82657f);
            int a13 = kotlin.collections.y0.a(kotlin.collections.g0.q(b13, 10));
            if (a13 < 16) {
                a13 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
            for (Object obj2 : b13) {
                linkedHashMap.put(((wc.m) obj2).f129093a, obj2);
            }
            List F0 = CollectionsKt.F0((List) p0Var.f82660i);
            ((List) p0Var.f82660i).clear();
            Iterator it2 = F0.iterator();
            while (it2.hasNext()) {
                xc.a aVar = (xc.a) it2.next();
                Object obj3 = linkedHashMap.get(aVar.f134533a);
                if (obj3 == null) {
                    String str3 = wc.c.f129078b.f129079a;
                    String str4 = aVar.f134533a;
                    if (!Intrinsics.d(str4, str3)) {
                        throw new CacheMissException(str4, null, false);
                    }
                    obj3 = new wc.m(str4, kotlin.collections.z0.d(), null);
                }
                wc.m mVar = (wc.m) obj3;
                Object obj4 = mVar.get("__typename");
                String str5 = obj4 instanceof String ? (String) obj4 : null;
                i2.a2 a2Var = new i2.a2(3);
                p0.c(aVar.f134535c, aVar.f134536d, str5, a2Var);
                List list4 = a2Var.f71073a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj5 : list4) {
                    pc.m mVar2 = (pc.m) obj5;
                    String str6 = mVar2.f99584c;
                    if (str6 == null) {
                        str6 = mVar2.f99582a;
                    }
                    Pair pair2 = new Pair(str6, mVar2.f99585d);
                    Object obj6 = linkedHashMap2.get(pair2);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap2.put(pair2, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                Collection<List> values = linkedHashMap2.values();
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(values, i13));
                for (List list5 : values) {
                    pc.l b14 = ((pc.m) CollectionsKt.S(list5)).b();
                    ArrayList selections = new ArrayList();
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        kotlin.collections.k0.u(((pc.m) it3.next()).f99587f, selections);
                    }
                    Intrinsics.checkNotNullParameter(selections, "selections");
                    b14.f99579f = selections;
                    arrayList2.add(new pc.m(b14.f99574a, b14.f99575b, b14.f99576c, b14.f99577d, b14.f99578e, selections));
                    it2 = it2;
                }
                Iterator it4 = it2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it5.hasNext();
                    list = aVar.f134534b;
                    if (hasNext) {
                        pc.m mVar3 = (pc.m) it5.next();
                        ja.c0 c0Var = (ja.c0) p0Var.f82655d;
                        if (tb.f.h0(mVar3, c0Var.f75176a)) {
                            pair = null;
                        } else {
                            Object k13 = ((wc.e) p0Var.f82656e).k(mVar3, c0Var, (Map) obj3, mVar.f129093a);
                            List list6 = list;
                            String str7 = mVar3.f99582a;
                            String str8 = mVar3.f99584c;
                            p0Var.e(k13, CollectionsKt.m0(str8 == null ? str7 : str8, list6), mVar3.f99587f, mVar3.f99583b.L().f99598g);
                            if (str8 != null) {
                                str7 = str8;
                            }
                            pair = new Pair(str7, k13);
                        }
                        if (pair != null) {
                            arrayList3.add(pair);
                        }
                    }
                }
                ((Map) obj).put(list, kotlin.collections.z0.m(arrayList3));
                i13 = 10;
                it2 = it4;
            }
        }
    }

    public static final do2.i V(do2.i iVar) {
        return iVar instanceof r2 ? iVar : do2.c0.a(iVar, do2.c0.f55741a);
    }

    public static final tm2.s0 V0(tm2.a0 a0Var, vm2.i typeTable) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (a0Var.t()) {
            return a0Var.f118152j;
        }
        if ((a0Var.f118145c & 64) == 64) {
            return typeTable.a(a0Var.f118153k);
        }
        return null;
    }

    public static void W(View view, com.google.android.material.internal.h0 h0Var) {
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.m0.n(view, new com.google.android.gms.internal.measurement.x(8, h0Var, new l8.p(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        if (view.isAttachedToWindow()) {
            q5.k0.c(view);
        } else {
            view.addOnAttachStateChangeListener(new com.google.android.material.internal.g0());
        }
    }

    public static void W0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static float X(Context context, int i13) {
        return TypedValue.applyDimension(1, i13, context.getResources().getDisplayMetrics());
    }

    public static final pn2.h0 X0(pn2.h0 h0Var, List newArguments, pn2.u0 newAttributes) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == h0Var.v0()) {
            return h0Var;
        }
        if (newArguments.isEmpty()) {
            return h0Var.C0(newAttributes);
        }
        if (!(h0Var instanceof rn2.j)) {
            return pn2.g.q(newAttributes, h0Var.w0(), newArguments, h0Var.x0());
        }
        rn2.j jVar = (rn2.j) h0Var;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        String[] strArr = jVar.f108922g;
        return new rn2.j(jVar.f108917b, jVar.f108918c, jVar.f108919d, newArguments, jVar.f108921f, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final do2.q0 Y(t2 t2Var) {
        return new do2.q0(t2Var, 0);
    }

    public static pn2.b0 Y0(pn2.b0 b0Var, List newArgumentsForUpperBound, bm2.i newAnnotations, int i13) {
        if ((i13 & 2) != 0) {
            newAnnotations = b0Var.getAnnotations();
        }
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArgumentsForUpperBound.isEmpty() || newArgumentsForUpperBound == b0Var.u0()) && newAnnotations == b0Var.getAnnotations()) {
            return b0Var;
        }
        pn2.u0 v03 = b0Var.v0();
        if ((newAnnotations instanceof bm2.m) && newAnnotations.isEmpty()) {
            newAnnotations = bm2.h.f23540a;
        }
        pn2.u0 L1 = bs1.c.L1(v03, newAnnotations);
        v1 z03 = b0Var.z0();
        if (z03 instanceof pn2.v) {
            pn2.v vVar = (pn2.v) z03;
            return pn2.g.i(X0(vVar.f100850b, newArgumentsForUpperBound, L1), X0(vVar.f100851c, newArgumentsForUpperBound, L1));
        }
        if (z03 instanceof pn2.h0) {
            return X0((pn2.h0) z03, newArgumentsForUpperBound, L1);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Object Z(bl2.c cVar, do2.i iVar, do2.j jVar) {
        a0(jVar);
        Object collect = iVar.collect(jVar, cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }

    public static /* synthetic */ pn2.h0 Z0(pn2.h0 h0Var, List list, pn2.u0 u0Var, int i13) {
        if ((i13 & 1) != 0) {
            list = h0Var.u0();
        }
        if ((i13 & 2) != 0) {
            u0Var = h0Var.v0();
        }
        return X0(h0Var, list, u0Var);
    }

    public static /* synthetic */ void a(int i13) {
        String str = i13 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 18 ? 3 : 2];
        switch (i13) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i13 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i13) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i13 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static final void a0(do2.j jVar) {
        if (jVar instanceof a3) {
            throw ((a3) jVar).f55727a;
        }
    }

    public static final void a1(int i13, int i14, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        while (i13 < i14) {
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            objArr[i13] = null;
            i13++;
        }
    }

    public static co2.m b(int i13, co2.a aVar, int i14) {
        co2.m wVar;
        if ((i14 & 1) != 0) {
            i13 = 0;
        }
        if ((i14 & 2) != 0) {
            aVar = co2.a.SUSPEND;
        }
        if (i13 != -2) {
            if (i13 == -1) {
                if (aVar == co2.a.SUSPEND) {
                    return new co2.w(1, co2.a.DROP_OLDEST, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i13 != 0) {
                return i13 != Integer.MAX_VALUE ? aVar == co2.a.SUSPEND ? new co2.m(i13, null) : new co2.w(i13, aVar, null) : new co2.m(Integer.MAX_VALUE, null);
            }
            wVar = aVar == co2.a.SUSPEND ? new co2.m(0, null) : new co2.w(1, aVar, null);
        } else if (aVar == co2.a.SUSPEND) {
            co2.q.Dn.getClass();
            wVar = new co2.m(co2.p.f28345b, null);
        } else {
            wVar = new co2.w(1, aVar, null);
        }
        return wVar;
    }

    public static final el2.b b0(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new el2.b(entries);
    }

    public static LinkedHashSet b1(ym2.g gVar, Collection collection, Collection collection2, am2.g gVar2, ln2.u uVar, bn2.o oVar, boolean z13) {
        if (gVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (collection2 == null) {
            a(14);
            throw null;
        }
        if (gVar2 == null) {
            a(15);
            throw null;
        }
        if (uVar == null) {
            a(16);
            throw null;
        }
        if (oVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        oVar.i(gVar, collection, collection2, gVar2, new jm2.a(uVar, linkedHashSet, z13));
        return linkedHashSet;
    }

    public static final long c(float f13, float f14) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
        int i13 = a3.a.f477b;
        return floatToRawIntBits;
    }

    public static final am2.g c0(am2.d0 d0Var, ym2.b classId) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        am2.j d03 = d0(d0Var, classId);
        if (d03 instanceof am2.g) {
            return (am2.g) d03;
        }
        return null;
    }

    public static LinkedHashSet c1(ym2.g gVar, AbstractCollection abstractCollection, Collection collection, am2.g gVar2, ln2.u uVar, bn2.o oVar) {
        if (gVar == null) {
            a(0);
            throw null;
        }
        if (collection == null) {
            a(2);
            throw null;
        }
        if (gVar2 == null) {
            a(3);
            throw null;
        }
        if (uVar == null) {
            a(4);
            throw null;
        }
        if (oVar != null) {
            return b1(gVar, abstractCollection, collection, gVar2, uVar, oVar, false);
        }
        a(5);
        throw null;
    }

    public static final long d(int i13, int i14) {
        return (i14 & 4294967295L) | (i13 << 32);
    }

    public static final am2.j d0(am2.d0 d0Var, ym2.b classId) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        fi.b bVar = bn2.q.f23596a;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        ep.b.A(d0Var.g0(bn2.q.f23596a));
        ym2.c g13 = classId.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getPackageFqName(...)");
        am2.o0 H = d0Var.H(g13);
        List e13 = classId.h().f139467a.e();
        Intrinsics.checkNotNullExpressionValue(e13, "pathSegments(...)");
        in2.j jVar = ((dm2.c0) H).f55405g;
        Object S = CollectionsKt.S(e13);
        Intrinsics.checkNotNullExpressionValue(S, "first(...)");
        am2.j e14 = jVar.e((ym2.g) S, hm2.e.FROM_DESERIALIZATION);
        if (e14 == null) {
            return null;
        }
        for (ym2.g gVar : e13.subList(1, e13.size())) {
            if (!(e14 instanceof am2.g)) {
                return null;
            }
            in2.n I = ((am2.g) e14).I();
            Intrinsics.f(gVar);
            am2.j e15 = I.e(gVar, hm2.e.FROM_DESERIALIZATION);
            e14 = e15 instanceof am2.g ? (am2.g) e15 : null;
            if (e14 == null) {
                return null;
            }
        }
        return e14;
    }

    public static LinkedHashSet d1(ym2.g gVar, Collection collection, AbstractCollection abstractCollection, km2.c cVar, ln2.u uVar, bn2.o oVar) {
        if (gVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (cVar == null) {
            a(9);
            throw null;
        }
        if (uVar == null) {
            a(10);
            throw null;
        }
        if (oVar != null) {
            return b1(gVar, collection, abstractCollection, cVar, uVar, oVar, true);
        }
        a(11);
        throw null;
    }

    public static final ym2.c e(String str, ym2.c cVar) {
        ym2.c c13 = cVar.c(ym2.g.e(str));
        Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
        return c13;
    }

    public static final am2.g e0(am2.d0 d0Var, ym2.b classId, com.google.firebase.messaging.q notFoundClasses) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        am2.g c03 = c0(d0Var, classId);
        return c03 != null ? c03 : notFoundClasses.m(classId, yn2.c0.t(yn2.c0.p(yn2.x.e(classId, am2.u.f15592a), am2.v.f15601i)));
    }

    public static final do2.p0 e1(pb.k kVar, Function2 function2) {
        return new do2.p0(kVar, new do2.n0(1L, function2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final vl2.g f(ul2.i1 r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.l0.f(ul2.i1, boolean):vl2.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f0(do2.i r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof do2.f1
            if (r0 == 0) goto L13
            r0 = r5
            do2.f1 r0 = (do2.f1) r0
            int r1 = r0.f55783u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55783u = r1
            goto L18
        L13:
            do2.f1 r0 = new do2.f1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f55782t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55783u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            do2.c1 r4 = r0.f55781s
            kotlin.jvm.internal.j0 r0 = r0.f55780r
            ue.c.H(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5d
        L2b:
            r5 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ue.c.H(r5)
            kotlin.jvm.internal.j0 r5 = new kotlin.jvm.internal.j0
            r5.<init>()
            fi.b r2 = eo2.j0.f59783a
            r5.f80434a = r2
            do2.c1 r2 = new do2.c1
            r2.<init>(r5)
            r0.f55780r = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f55781s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f55783u = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            if (r4 != r1) goto L53
            goto L63
        L53:
            r0 = r5
            goto L5d
        L55:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L59:
            java.lang.Object r1 = r5.f80509a
            if (r1 != r4) goto L6c
        L5d:
            java.lang.Object r1 = r0.f80434a
            fi.b r4 = eo2.j0.f59783a
            if (r1 == r4) goto L64
        L63:
            return r1
        L64:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L6c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.l0.f0(do2.i, bl2.c):java.lang.Object");
    }

    public static final tm2.s0 f1(tm2.a0 a0Var, vm2.i typeTable) {
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i13 = a0Var.f118145c;
        if ((i13 & 8) == 8) {
            tm2.s0 s0Var = a0Var.f118149g;
            Intrinsics.checkNotNullExpressionValue(s0Var, "getReturnType(...)");
            return s0Var;
        }
        if ((i13 & 16) == 16) {
            return typeTable.a(a0Var.f118150h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    public static final boolean g(int[] iArr, int i13) {
        return (iArr[(i13 * 5) + 1] & 67108864) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g0(do2.i r4, kotlin.jvm.functions.Function2 r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof do2.g1
            if (r0 == 0) goto L13
            r0 = r6
            do2.g1 r0 = (do2.g1) r0
            int r1 = r0.f55805v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55805v = r1
            goto L18
        L13:
            do2.g1 r0 = new do2.g1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f55804u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55805v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            do2.e1 r4 = r0.f55803t
            kotlin.jvm.internal.j0 r5 = r0.f55802s
            kotlin.jvm.functions.Function2 r0 = r0.f55801r
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            ue.c.H(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2f
            goto L65
        L2f:
            r6 = move-exception
            goto L61
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            ue.c.H(r6)
            kotlin.jvm.internal.j0 r6 = new kotlin.jvm.internal.j0
            r6.<init>()
            fi.b r2 = eo2.j0.f59783a
            r6.f80434a = r2
            do2.e1 r2 = new do2.e1
            r2.<init>(r5, r6)
            r0.f55801r = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            r0.f55802s = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            r0.f55803t = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            r0.f55805v = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5c
            if (r4 != r1) goto L59
            goto L6b
        L59:
            r0 = r5
            r5 = r6
            goto L65
        L5c:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L61:
            java.lang.Object r1 = r6.f80509a
            if (r1 != r4) goto L80
        L65:
            java.lang.Object r1 = r5.f80434a
            fi.b r4 = eo2.j0.f59783a
            if (r1 == r4) goto L6c
        L6b:
            return r1
        L6c:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.l0.g0(do2.i, kotlin.jvm.functions.Function2, bl2.c):java.lang.Object");
    }

    public static final tm2.s0 g1(tm2.i0 i0Var, vm2.i typeTable) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i13 = i0Var.f118325c;
        if ((i13 & 8) == 8) {
            tm2.s0 s0Var = i0Var.f118329g;
            Intrinsics.checkNotNullExpressionValue(s0Var, "getReturnType(...)");
            return s0Var;
        }
        if ((i13 & 16) == 16) {
            return typeTable.a(i0Var.f118330h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    public static final int h(int[] iArr, int i13) {
        return iArr[(i13 * 5) + 4];
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h0(do2.i r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof do2.i1
            if (r0 == 0) goto L13
            r0 = r5
            do2.i1 r0 = (do2.i1) r0
            int r1 = r0.f55821u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55821u = r1
            goto L18
        L13:
            do2.i1 r0 = new do2.i1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f55820t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55821u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            do2.h1 r4 = r0.f55819s
            kotlin.jvm.internal.j0 r0 = r0.f55818r
            ue.c.H(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L59
        L2b:
            r5 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ue.c.H(r5)
            kotlin.jvm.internal.j0 r5 = new kotlin.jvm.internal.j0
            r5.<init>()
            do2.h1 r2 = new do2.h1
            r2.<init>(r5)
            r0.f55818r = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.f55819s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            r0.f55821u = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L51
            if (r4 != r1) goto L4f
            goto L5b
        L4f:
            r0 = r5
            goto L59
        L51:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L55:
            java.lang.Object r1 = r5.f80509a
            if (r1 != r4) goto L5c
        L59:
            java.lang.Object r1 = r0.f80434a
        L5b:
            return r1
        L5c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.l0.h0(do2.i, bl2.c):java.lang.Object");
    }

    public static final int h1(ArrayList arrayList, int i13, int i14) {
        int size = arrayList.size() - 1;
        int i15 = 0;
        while (i15 <= size) {
            int i16 = (i15 + size) >>> 1;
            int i17 = ((i2.d) arrayList.get(i16)).f71087a;
            if (i17 < 0) {
                i17 += i14;
            }
            int i18 = Intrinsics.i(i17, i13);
            if (i18 < 0) {
                i15 = i16 + 1;
            } else {
                if (i18 <= 0) {
                    return i16;
                }
                size = i16 - 1;
            }
        }
        return -(i15 + 1);
    }

    public static final int i(int[] iArr, int i13) {
        return iArr[(i13 * 5) + 3];
    }

    public static final do2.l i0(Object obj) {
        return new do2.l(obj, 1);
    }

    public static final void i1(View view, ma.i iVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(ma.a.view_tree_saved_state_registry_owner, iVar);
    }

    public static final boolean j(int[] iArr, int i13) {
        return (iArr[(i13 * 5) + 1] & 268435456) != 0;
    }

    public static final do2.i j0(do2.i iVar, ao2.f0 f0Var) {
        if (f0Var.get(ao2.g0.f20154b) == null) {
            return Intrinsics.d(f0Var, kotlin.coroutines.j.f80412a) ? iVar : iVar instanceof eo2.g0 ? com.bumptech.glide.c.A((eo2.g0) iVar, f0Var, 0, null, 6) : new eo2.m(iVar, f0Var, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + f0Var).toString());
    }

    public static void j1(Window window, boolean z13) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 35) {
            window.setDecorFitsSystemWindows(z13);
        } else {
            if (i13 >= 30) {
                e0.g.d(window, z13);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z13 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final boolean k(int[] iArr, int i13) {
        return (iArr[(i13 * 5) + 1] & 536870912) != 0;
    }

    public static Object k0(Context context, Class cls) {
        ComponentCallbacks2 C = com.bumptech.glide.c.C(context);
        d7.b.q(C instanceof af2.c, "Expected application to implement GeneratedComponentManagerHolder. Check that you're passing in an application context that uses Hilt. Application class found: %s", C.getClass());
        ((af2.c) C).componentManager();
        return j1.b0(cls, C);
    }

    public static void k1(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = q5.v0.f102521a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z13 = onLongClickListener != null;
        boolean z14 = hasOnClickListeners || z13;
        checkableImageButton.setFocusable(z14);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.f32665f = hasOnClickListeners;
        checkableImageButton.setLongClickable(z13);
        checkableImageButton.setImportantForAccessibility(z14 ? 1 : 2);
    }

    public static final Object[] l(Object[] objArr, int i13, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        kotlin.collections.z.l(objArr, objArr2, 0, i13, 6);
        kotlin.collections.z.h(i13 + 2, i13, objArr.length, objArr, objArr2);
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        return objArr2;
    }

    public static final ma.i l0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (ma.i) yn2.c0.l(yn2.c0.q(yn2.x.e(view, ma.j.f86762j), ma.j.f86763k));
    }

    public static void l1(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.f30751f <= 0) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(tb.f.L(status));
        }
    }

    public static final boolean m(int[] iArr, int i13) {
        return (iArr[(i13 * 5) + 1] & 1073741824) != 0;
    }

    public static final rl2.d m0(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Intrinsics.checkNotNullExpressionValue(annotationType, "annotationType(...)");
        rl2.d w03 = w0(annotationType);
        Intrinsics.g(w03, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return w03;
    }

    public static void m1(Drawable drawable, int i13) {
        drawable.setTint(i13);
    }

    public static final int n(ArrayList arrayList, int i13, int i14) {
        int h13 = h1(arrayList, i13, i14);
        return h13 >= 0 ? h13 : -(h13 + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static am2.i1 n0(ym2.g gVar, am2.g gVar2) {
        if (gVar == null) {
            a(19);
            throw null;
        }
        if (gVar2 == null) {
            a(20);
            throw null;
        }
        Collection n13 = gVar2.n();
        if (n13.size() != 1) {
            return null;
        }
        for (am2.i1 i1Var : ((dm2.z) ((am2.f) n13.iterator().next())).x()) {
            if (((dm2.o) i1Var).getName().equals(gVar)) {
                return i1Var;
            }
        }
        return null;
    }

    public static void n1(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static final int o(int[] iArr, int i13) {
        return iArr[(i13 * 5) + 1] & 67108863;
    }

    public static final int o0(vl2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.a().size();
    }

    public static void o1(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static final int p(int[] iArr, int i13) {
        return iArr[(i13 * 5) + 2];
    }

    public static final Object p0(i1 i1Var) {
        Intrinsics.checkNotNullParameter(i1Var, "<this>");
        o1 v13 = i1Var.v();
        return com.bumptech.glide.c.r(v13.f122570j, v13.n());
    }

    public static final String p1(am2.g classDescriptor, String jvmDescriptor) {
        String internalName;
        Intrinsics.checkNotNullParameter(rm2.t.f108791e, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        String str = zl2.d.f142106a;
        ym2.e i13 = fn2.d.g(classDescriptor).i();
        Intrinsics.checkNotNullExpressionValue(i13, "toUnsafe(...)");
        ym2.b g13 = zl2.d.g(i13);
        if (g13 != null) {
            internalName = gn2.b.b(g13).f();
            Intrinsics.checkNotNullExpressionValue(internalName, "getInternalName(...)");
        } else {
            internalName = ue.c.j(classDescriptor, rm2.t.f108792f);
        }
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }

    public static final Object[] q(int i13, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        kotlin.collections.z.l(objArr, objArr2, 0, i13, 6);
        kotlin.collections.z.h(i13, i13 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static ViewGroup q0(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q1(do2.i r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof do2.j1
            if (r0 == 0) goto L13
            r0 = r6
            do2.j1 r0 = (do2.j1) r0
            int r1 = r0.f55826t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55826t = r1
            goto L18
        L13:
            do2.j1 r0 = new do2.j1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f55825s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55826t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.j0 r5 = r0.f55824r
            ue.c.H(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r6)
            kotlin.jvm.internal.j0 r6 = new kotlin.jvm.internal.j0
            r6.<init>()
            fi.b r2 = eo2.j0.f59783a
            r6.f80434a = r2
            y1.b r2 = new y1.b
            r4 = 22
            r2.<init>(r6, r4)
            r0.f55824r = r6
            r0.f55826t = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L4f
            goto L56
        L4f:
            r5 = r6
        L50:
            java.lang.Object r1 = r5.f80434a
            fi.b r5 = eo2.j0.f59783a
            if (r1 == r5) goto L57
        L56:
            return r1
        L57:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Flow is empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.l0.q1(do2.i, bl2.c):java.lang.Object");
    }

    public static final Object[] r(int i13, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        kotlin.collections.z.l(objArr, objArr2, 0, i13, 6);
        kotlin.collections.z.h(i13, i13 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static u6 r0(View view) {
        ViewGroup q03 = q0(view);
        if (q03 == null) {
            return null;
        }
        return new u6(q03);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r1(do2.j0 r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof do2.l1
            if (r0 == 0) goto L13
            r0 = r5
            do2.l1 r0 = (do2.l1) r0
            int r1 = r0.f55847u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55847u = r1
            goto L18
        L13:
            do2.l1 r0 = new do2.l1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f55846t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55847u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            do2.k1 r4 = r0.f55845s
            kotlin.jvm.internal.j0 r0 = r0.f55844r
            ue.c.H(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5d
        L2b:
            r5 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ue.c.H(r5)
            kotlin.jvm.internal.j0 r5 = new kotlin.jvm.internal.j0
            r5.<init>()
            fi.b r2 = eo2.j0.f59783a
            r5.f80434a = r2
            do2.k1 r2 = new do2.k1
            r2.<init>(r5)
            r0.f55844r = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f55845s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            r0.f55847u = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L55
            if (r4 != r1) goto L53
            goto L65
        L53:
            r0 = r5
            goto L5d
        L55:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L59:
            java.lang.Object r1 = r5.f80509a
            if (r1 != r4) goto L66
        L5d:
            java.lang.Object r4 = r0.f80434a
            fi.b r5 = eo2.j0.f59783a
            if (r4 != r5) goto L64
            r4 = 0
        L64:
            r1 = r4
        L65:
            return r1
        L66:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.l0.r1(do2.j0, bl2.c):java.lang.Object");
    }

    public static final int s(int[] iArr, int i13) {
        int i14 = i13 * 5;
        return O(iArr[i14 + 1] >> 28) + iArr[i14 + 4];
    }

    public static final ao2.r0 s0(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.f.Ho);
        ao2.r0 r0Var = element instanceof ao2.r0 ? (ao2.r0) element : null;
        return r0Var == null ? ao2.o0.f20186a : r0Var;
    }

    public static final void s1(Function2 function2, Object obj, bl2.c cVar) {
        try {
            bl2.c b13 = cl2.h.b(cl2.h.a(function2, obj, cVar));
            xk2.q qVar = xk2.s.f135225b;
            ho2.f.a(Unit.f80348a, b13);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            cVar.resumeWith(ue.c.m(th3));
            throw th3;
        }
    }

    public static final void t(int i13, int i14, int[] iArr) {
        i2.u.o(i14 >= 0);
        iArr[(i13 * 5) + 3] = i14;
    }

    public static final Class t0(rl2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class c13 = ((kotlin.jvm.internal.g) dVar).c();
        Intrinsics.g(c13, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return c13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final do2.a2 t1(pb.k kVar, ho2.c cVar, q2 q2Var, Float f13) {
        hh.k kVar2;
        eo2.f fVar;
        do2.i f14;
        co2.q.Dn.getClass();
        int i13 = co2.p.f28345b;
        if (1 >= i13) {
            i13 = 1;
        }
        int i14 = i13 - 1;
        if (!(kVar instanceof eo2.f) || (f14 = (fVar = (eo2.f) kVar).f()) == null) {
            kVar2 = new hh.k(i14, kotlin.coroutines.j.f80412a, co2.a.SUSPEND, kVar);
        } else {
            co2.a aVar = fVar.f59760c;
            int i15 = fVar.f59759b;
            if (i15 != -3 && i15 != -2 && i15 != 0) {
                i14 = i15;
            } else if (aVar != co2.a.SUSPEND || i15 == 0) {
                i14 = 0;
            }
            kVar2 = new hh.k(i14, fVar.f59758a, aVar, f14);
        }
        t2 a13 = u2.a(f13);
        kotlin.jvm.internal.j.y(cVar, (CoroutineContext) kVar2.f69126d, Intrinsics.d(q2Var, j2.f55827a) ? ao2.l0.DEFAULT : ao2.l0.UNDISPATCHED, new p1(q2Var, (do2.i) kVar2.f69124b, a13, f13, null));
        return new do2.a2(a13);
    }

    public static final void u(int i13, int i14, int[] iArr) {
        i2.u.o(i14 >= 0 && i14 < 67108863);
        int i15 = (i13 * 5) + 1;
        iArr[i15] = i14 | (iArr[i15] & (-67108864));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class u0(rl2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class c13 = ((kotlin.jvm.internal.g) dVar).c();
        if (!c13.isPrimitive()) {
            return c13;
        }
        String name = c13.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return c13;
    }

    public static final ym2.c u1(ym2.c cVar, ym2.c packageName) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "prefix");
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!Intrinsics.d(cVar, packageName) && !packageName.d()) {
            String b13 = cVar.b();
            Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
            String b14 = packageName.b();
            Intrinsics.checkNotNullExpressionValue(b14, "asString(...)");
            if (!kotlin.text.z.p(b13, b14, false) || b13.charAt(b14.length()) != '.') {
                return cVar;
            }
        }
        if (packageName.d()) {
            return cVar;
        }
        if (Intrinsics.d(cVar, packageName)) {
            ym2.c ROOT = ym2.c.f139466c;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            return ROOT;
        }
        String b15 = cVar.b();
        Intrinsics.checkNotNullExpressionValue(b15, "asString(...)");
        String substring = b15.substring(packageName.b().length() + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return new ym2.c(substring);
    }

    public static void v(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Class v0(rl2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Class c13 = ((kotlin.jvm.internal.g) dVar).c();
        if (c13.isPrimitive()) {
            return c13;
        }
        String name = c13.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object v1(w41.g0 r4, java.util.Collection r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof do2.o
            if (r0 == 0) goto L13
            r0 = r6
            do2.o r0 = (do2.o) r0
            int r1 = r0.f55874t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55874t = r1
            goto L18
        L13:
            do2.o r0 = new do2.o
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f55873s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55874t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.util.Collection r4 = r0.f55872r
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            ue.c.H(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            ue.c.H(r6)
            y1.b r6 = new y1.b
            r2 = 21
            r6.<init>(r5, r2)
            r2 = r5
            java.util.Collection r2 = (java.util.Collection) r2
            r0.f55872r = r2
            r0.f55874t = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L4c
            goto L4d
        L4c:
            r1 = r5
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.l0.v1(w41.g0, java.util.Collection, bl2.c):java.lang.Object");
    }

    public static void w(String str, ip2.t tVar, HashMap hashMap) {
        df.b0 b0Var;
        com.google.protobuf.l jVar;
        if (str.startsWith("ChromiumBaseFeature_")) {
            String substring = str.substring(20);
            df.b0 b0Var2 = new df.b0();
            int indexOf = substring.indexOf("_PARAM_");
            if (indexOf < 0) {
                b0Var2.f54715a = substring;
            } else {
                b0Var2.f54715a = substring.substring(0, indexOf);
                b0Var2.f54716b = substring.substring(indexOf + 7);
            }
            b0Var = b0Var2;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            return;
        }
        ip2.d dVar = (ip2.d) hashMap.get(b0Var.f54715a);
        if (dVar == null) {
            dVar = ip2.f.i();
            hashMap.put(b0Var.f54715a, dVar);
        }
        String str2 = b0Var.f54716b;
        if (str2 == null) {
            ip2.s d2 = tVar.d();
            ip2.s sVar = ip2.s.BOOL;
            if (d2 == sVar) {
                tVar.b(sVar);
                dVar.c(((Boolean) tVar.f73384a).booleanValue());
                return;
            } else {
                throw new IllegalArgumentException("HTTP flag has type " + d2 + ", but only boolean flags are supported as base::Feature overrides");
            }
        }
        ip2.s d13 = tVar.d();
        int i13 = ip2.a.f73376a[d13.ordinal()];
        Serializable serializable = tVar.f73384a;
        if (i13 == 1) {
            tVar.b(ip2.s.BOOL);
            String str3 = ((Boolean) serializable).booleanValue() ? "true" : "false";
            Charset charset = StandardCharsets.UTF_8;
            com.google.protobuf.j jVar2 = com.google.protobuf.l.f33922b;
            jVar = new com.google.protobuf.j(str3.getBytes(charset));
        } else if (i13 == 2) {
            tVar.b(ip2.s.INT);
            String l13 = Long.toString(((Long) serializable).longValue(), 10);
            Charset charset2 = StandardCharsets.UTF_8;
            com.google.protobuf.j jVar3 = com.google.protobuf.l.f33922b;
            jVar = new com.google.protobuf.j(l13.getBytes(charset2));
        } else if (i13 == 3) {
            tVar.b(ip2.s.FLOAT);
            String f13 = Float.toString(((Float) serializable).floatValue());
            Charset charset3 = StandardCharsets.UTF_8;
            com.google.protobuf.j jVar4 = com.google.protobuf.l.f33922b;
            jVar = new com.google.protobuf.j(f13.getBytes(charset3));
        } else if (i13 == 4) {
            String c13 = tVar.c();
            Charset charset4 = StandardCharsets.UTF_8;
            com.google.protobuf.j jVar5 = com.google.protobuf.l.f33922b;
            jVar = new com.google.protobuf.j(c13.getBytes(charset4));
        } else {
            if (i13 != 5) {
                throw new UnsupportedOperationException("Unsupported HTTP flag value type for base::Feature param `" + str2 + "`: " + d13);
            }
            tVar.b(ip2.s.BYTES);
            jVar = (com.google.protobuf.l) serializable;
        }
        dVar.b(str2, jVar);
    }

    public static final rl2.d w0(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return kotlin.jvm.internal.k0.f80436a.b(cls);
    }

    public static final long w1(long j13) {
        zn2.a aVar = zn2.b.f142311b;
        boolean z13 = j13 > 0;
        if (z13) {
            return zn2.b.e(zn2.b.k(j13, dl2.b.Q2(999999L, zn2.d.NANOSECONDS)));
        }
        if (z13) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }

    public static final pn2.h0 x(pn2.b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        v1 z03 = b0Var.z0();
        pn2.h0 h0Var = z03 instanceof pn2.h0 ? (pn2.h0) z03 : null;
        if (h0Var != null) {
            return h0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + b0Var).toString());
    }

    public static final ao2.o x0(bl2.c cVar) {
        ao2.o oVar;
        ao2.o oVar2;
        if (!(cVar instanceof ho2.e)) {
            return new ao2.o(1, cVar);
        }
        ho2.e eVar = (ho2.e) cVar;
        eVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ho2.e.f69753h;
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            oVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(eVar, ho2.f.f69759b);
                oVar2 = null;
                break;
            }
            if (obj instanceof ao2.o) {
                fi.b bVar = ho2.f.f69759b;
                while (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, bVar)) {
                    if (atomicReferenceFieldUpdater.get(eVar) != obj) {
                        break;
                    }
                }
                oVar2 = (ao2.o) obj;
                break loop0;
            }
            if (obj != ho2.f.f69759b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (oVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ao2.o.f20182g;
            Object obj2 = atomicReferenceFieldUpdater2.get(oVar2);
            if (!(obj2 instanceof ao2.y) || ((ao2.y) obj2).f20236d == null) {
                ao2.o.f20181f.set(oVar2, 536870911);
                atomicReferenceFieldUpdater2.set(oVar2, ao2.b.f20113a);
                oVar = oVar2;
            } else {
                oVar2.r();
            }
            if (oVar != null) {
                return oVar;
            }
        }
        return new ao2.o(2, cVar);
    }

    public static final String x1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb3 = new StringBuilder(str.length());
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char charAt = str.charAt(i13);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb3.append(charAt);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static do2.i y(do2.i iVar, int i13) {
        co2.a aVar = co2.a.SUSPEND;
        if (i13 < 0 && i13 != -2 && i13 != -1) {
            throw new IllegalArgumentException(a.a.d("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i13).toString());
        }
        if (i13 == -1) {
            aVar = co2.a.DROP_OLDEST;
            i13 = 0;
        }
        int i14 = i13;
        co2.a aVar2 = aVar;
        return iVar instanceof eo2.g0 ? com.bumptech.glide.c.A((eo2.g0) iVar, null, i14, aVar2, 1) : new eo2.m(iVar, null, i14, aVar2, 2);
    }

    public static final ho2.v y0(Object obj) {
        if (obj == ho2.a.f69743a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (ho2.v) obj;
    }

    public static final long y1(long j13) {
        return bs1.c.c((int) (j13 >> 32), (int) (j13 & 4294967295L));
    }

    public static final kv0.p z(pn2.h0 h0Var, am2.k kVar, int i13) {
        if (kVar == null || rn2.m.g(kVar)) {
            return null;
        }
        int size = kVar.k().size() + i13;
        if (kVar.q()) {
            List subList = h0Var.u0().subList(i13, size);
            am2.m g13 = kVar.g();
            return new kv0.p(kVar, subList, z(h0Var, g13 instanceof am2.k ? (am2.k) g13 : null, size));
        }
        if (size != h0Var.u0().size()) {
            bn2.e.q(kVar);
        }
        return new kv0.p(kVar, h0Var.u0().subList(i13, h0Var.u0().size()), (kv0.p) null);
    }

    public static int z0(int i13) {
        return i13 >>> 3;
    }

    public static final Class z1(ClassLoader classLoader, String fqName) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public abstract void O0();

    public abstract void P0(Bitmap bitmap, hs1.x xVar);
}
