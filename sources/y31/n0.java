package y31;

import com.pinterest.api.model.b90;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import y01.p1;

/* loaded from: classes5.dex */
public final class n0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.d f136822b;

    public n0(lt.j pinalyticsTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsTransformer, "pinalyticsTransformer");
        this.f136822b = pinalyticsTransformer;
    }

    public static void g(l82.e eVar) {
        wy0 wy0Var = ((o0) eVar.f82219b).f136828c;
        b90 f43 = wy0Var != null ? wy0Var.f4() : null;
        String f13 = f43 != null ? f43.f() : null;
        Object obj = h41.a.f67627b;
        if (wy0Var != null && ((o0) eVar.f82219b).f136826a == r41.e.Business) {
            Boolean u43 = wy0Var.u4();
            Intrinsics.checkNotNullExpressionValue(u43, "getShowCreatorProfile(...)");
            if (u43.booleanValue() && f43 != null && f13 != null && f13.length() != 0 && kotlin.text.z.i("image", f13, true)) {
                String O = el.a.O(f43);
                if (O == null) {
                    O = "";
                }
                obj = new h41.c(null, O);
            }
        }
        eVar.f(new p1(obj, 21));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        o0 vmState = (o0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        zy.l0 l0Var = vmState.f136831f;
        return l82.d.d(new r(d0.f136782c, d0.f136781b, d0.f136783d, d0.f136780a, null, kotlin.collections.q0.f80391a), o0.b(vmState, null, (zy.l0) this.f136822b.c(zy.l0.b(l0Var, h32.i0.a(l0Var.f143086a, d4.USER, vmState.f136830e ? a4.USER_SELF : a4.USER_OTHERS, h32.g0.PROFILE_HEADER, null, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW))).f82213b, 31)).e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a4, code lost:
    
        if ((r5 != null ? r5.P2() : 0).intValue() > 0) goto L56;
     */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r22, u50.o r23, l82.i0 r24, l82.e r25) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y31.n0.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
