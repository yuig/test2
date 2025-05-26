package w90;

import android.view.View;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f128571r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f128572s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f128572s = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f128572s, cVar);
        nVar.f128571r = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f128571r;
        int i13 = p.V0;
        p pVar = this.f128572s;
        pVar.getClass();
        pVar.P0 = bVar.f128522c;
        if (bVar.f128520a) {
            View view = pVar.N0;
            if (view == null) {
                Intrinsics.r("savingOverlay");
                throw null;
            }
            if (view.getVisibility() != 0) {
                View view2 = pVar.N0;
                if (view2 == null) {
                    Intrinsics.r("savingOverlay");
                    throw null;
                }
                kg.a.s(view2, 0L, null, 6);
                GestaltSpinner gestaltSpinner = pVar.O0;
                if (gestaltSpinner == null) {
                    Intrinsics.r("savingOverlayLoadingView");
                    throw null;
                }
                s0.w(gestaltSpinner, l.f128563l);
            }
        } else {
            View view3 = pVar.N0;
            if (view3 == null) {
                Intrinsics.r("savingOverlay");
                throw null;
            }
            if (view3.getVisibility() == 0) {
                View view4 = pVar.N0;
                if (view4 == null) {
                    Intrinsics.r("savingOverlay");
                    throw null;
                }
                bs1.c.X0(view4);
                GestaltSpinner gestaltSpinner2 = pVar.O0;
                if (gestaltSpinner2 == null) {
                    Intrinsics.r("savingOverlayLoadingView");
                    throw null;
                }
                s0.w(gestaltSpinner2, l.f128564m);
            }
        }
        return Unit.f80348a;
    }
}
