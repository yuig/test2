package dy0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final ob0.a f56596b;

    /* renamed from: c, reason: collision with root package name */
    public final l82.h0 f56597c;

    public m0(lt.j pinalyticsTransformer, ob0.a crashReporter) {
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        this.f56596b = crashReporter;
        this.f56597c = b(pinalyticsTransformer, new kotlin.jvm.internal.d0() { // from class: dy0.j0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((e) obj).f56561f;
            }
        }, new kotlin.jvm.internal.d0() { // from class: dy0.k0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((n0) obj).f56601b;
            }
        }, l0.f56593i);
    }

    public static void g(l82.e eVar, f1 f1Var) {
        eVar.a(new v(new zy.e0(new zy.a(((n0) eVar.f82219b).f56601b.f143086a, f1Var, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN))));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        n0 vmState = (n0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        e eVar = new e(true, 62);
        u[] elements = new u[4];
        elements[0] = r.f56612a;
        elements[1] = new q(5000);
        elements[2] = t.f56614a;
        s sVar = new s(vmState.f56601b.f143086a.f67082b);
        if (!vmState.f56600a) {
            sVar = null;
        }
        elements[3] = sVar;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new l82.c0(eVar, vmState, kotlin.collections.c0.A(elements));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        r0 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r0.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        r2 = (java.util.Iterator) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if (r2.hasNext() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        r6.add(r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (r6.size() < 3) goto L71;
     */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r5, u50.o r6, l82.i0 r7, l82.e r8) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dy0.m0.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
