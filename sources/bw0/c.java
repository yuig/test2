package bw0;

import android.content.Context;
import java.util.List;
import kb.f0;
import kb.u0;
import kb.w0;
import kh2.k3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lb.j0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final kb.g f23969a = com.pinterest.feature.video.model.g.f49009a;

    /* renamed from: b, reason: collision with root package name */
    public static final IntRange f23970b = new IntRange(2401, 2500, 1);

    public static so.a a(kb.q workPolicy, List workRequests, so.a aVar) {
        Intrinsics.checkNotNullParameter(workPolicy, "workPolicy");
        Intrinsics.checkNotNullParameter(workRequests, "workRequests");
        if (workRequests.isEmpty()) {
            return aVar;
        }
        if (aVar == null) {
            return b("STORY_PIN_UPLOAD_WORK", workPolicy, workRequests);
        }
        so.a k13 = aVar.k((f0) workRequests.get(0));
        Intrinsics.checkNotNullExpressionValue(k13, "then(...)");
        int size = workRequests.size();
        for (int i13 = 1; i13 < size; i13++) {
            k13 = k13.k((f0) workRequests.get(i13));
            Intrinsics.checkNotNullExpressionValue(k13, "then(...)");
        }
        return k13;
    }

    public static so.a b(String uniqueWorkName, kb.q workPolicy, List workRequests) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(workPolicy, "workPolicy");
        Intrinsics.checkNotNullParameter(workRequests, "workRequests");
        u0 u0Var = w0.f79048a;
        Context context = kb0.a.f79058b;
        so.a a13 = u0Var.a(m60.f0.j0()).a(uniqueWorkName, workPolicy, (f0) workRequests.get(0));
        int size = workRequests.size();
        for (int i13 = 1; i13 < size; i13++) {
            a13 = a13.k((f0) workRequests.get(i13));
            Intrinsics.checkNotNullExpressionValue(a13, "then(...)");
        }
        return a13;
    }

    public static List c() {
        try {
            u0 u0Var = w0.f79048a;
            Context context = kb0.a.f79058b;
            j0 j0Var = (j0) u0Var.a(m60.f0.j0());
            Object obj = k3.Z(j0Var.f82607d, j0Var.f82608e, "STORY_PIN_UPLOAD_WORK").f106128b.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return CollectionsKt.F0((Iterable) obj);
        } catch (Exception e13) {
            vb0.j.f125466a.I(e13, "Failed to get work info list. Exception: " + e13, tb0.p.IDEA_PINS_CREATION);
            return q0.f80391a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0015, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(java.util.List r4, java.util.List r5, java.util.Set r6) {
        /*
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L11
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L5b
        L11:
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r4.next()
            kb.t0 r0 = (kb.t0) r0
            java.util.Set r2 = r0.f79032c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L33
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L33
            goto L15
        L33:
            java.util.Iterator r2 = r2.iterator()
        L37:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L15
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L37
            kb.s0 r0 = r0.f79031b
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L15
            int r1 = r1 + 1
            if (r1 < 0) goto L56
            goto L15
        L56:
            kotlin.collections.f0.o()
            r4 = 0
            throw r4
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bw0.c.d(java.util.List, java.util.List, java.util.Set):int");
    }
}
