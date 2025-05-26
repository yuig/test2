package e82;

import com.pinterest.typeahead.ClientCacheWorker;
import com.pinterest.ui.grid.videopin.PinVideoGridCell;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.w1;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57881i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f57882j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, int i13) {
        super(1);
        this.f57881i = i13;
        this.f57882j = obj;
    }

    public final pn2.b0 b(am2.d0 module) {
        int i13 = this.f57881i;
        Object obj = this.f57882j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(module, "module");
                pn2.h0 g13 = module.f().g(((xl2.l) obj).v(), w1.INVARIANT);
                Intrinsics.checkNotNullExpressionValue(g13, "getArrayType(...)");
                return g13;
            default:
                Intrinsics.checkNotNullParameter(module, "it");
                return (pn2.b0) obj;
        }
    }

    public final void e(String it) {
        int i13 = this.f57881i;
        Object obj = this.f57882j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                r5.e eVar = (r5.e) ((WeakReference) obj).get();
                if (eVar != null) {
                    eVar.v(it);
                    break;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                ((PinVideoGridCell) obj).setContentDescription(it);
                break;
            default:
                dc2.i iVar = (dc2.i) obj;
                if (Intrinsics.d(it, "\u0000")) {
                    it = null;
                }
                iVar.f54414a = it;
                break;
        }
    }

    public final void f(Throwable th3) {
        int i13 = this.f57881i;
        Object obj = this.f57882j;
        switch (i13) {
            case 1:
                ClientCacheWorker clientCacheWorker = (ClientCacheWorker) obj;
                if (clientCacheWorker.f52200i) {
                    tb0.k kVar = new tb0.k();
                    kVar.c("status", "failure");
                    ArrayList arrayList = kVar.f117102a;
                    tb0.h hVar = clientCacheWorker.f52198g;
                    hVar.k("search_typeahead_db_installation", arrayList);
                    tb0.k kVar2 = new tb0.k();
                    String simpleName = th3.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    kVar2.c("exception", simpleName);
                    hVar.k("search_typeahead_db_installation", kVar2.f117102a);
                    break;
                }
                break;
            case 7:
                Objects.toString(th3);
                boolean z13 = cc2.b.C;
                ((cc2.b) obj).getClass();
                break;
            default:
                ((pq2.i) obj).cancel();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x061c, code lost:
    
        if (r1.equals("hashCode") == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0674, code lost:
    
        if (((java.util.ArrayList) r0.f()).isEmpty() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x065e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.b(), "java.lang.Object") != false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0668, code lost:
    
        if (r1.equals("toString") != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x07e5, code lost:
    
        if (r0.length == 0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x07ff, code lost:
    
        if (java.util.Arrays.equals(r0.getParameterTypes(), new java.lang.Class[]{java.lang.String.class}) != false) goto L257;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 2706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e82.l.invoke(java.lang.Object):java.lang.Object");
    }
}
