package fa0;

import com.pinterest.api.model.f30;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f61529r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f61530s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f61530s = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f61530s, cVar);
        rVar.f61529r = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((l) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        l lVar = (l) this.f61529r;
        int i13 = t.V0;
        t tVar = this.f61530s;
        tVar.getClass();
        tVar.T0 = lVar.f61511f;
        GestaltButton gestaltButton = tVar.O0;
        if (gestaltButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        bs1.c.s(gestaltButton, new p90.n0(lVar, 18));
        z zVar = lVar.f61508c;
        if (zVar instanceof n0) {
            f30 f30Var = ((n0) zVar).f61516a;
            k11.p pVar = tVar.L0;
            if (pVar == null) {
                Intrinsics.r("repinner");
                throw null;
            }
            k11.p.a(pVar, f30Var, false, false, false, null, false, null, tVar.s7(), null, null, new b10.z(10, tVar, f30Var), 3580);
            tVar.m9(p0.f61523a);
        } else {
            boolean z13 = zVar instanceof i;
        }
        y yVar = lVar.f61509d;
        if (yVar instanceof t0) {
            FullBleedGestaltSpinner fullBleedGestaltSpinner = tVar.P0;
            if (fullBleedGestaltSpinner == null) {
                Intrinsics.r("progressOverlay");
                throw null;
            }
            fullBleedGestaltSpinner.showLoadingSpinner(true);
        } else if (yVar instanceof c) {
            FullBleedGestaltSpinner fullBleedGestaltSpinner2 = tVar.P0;
            if (fullBleedGestaltSpinner2 == null) {
                Intrinsics.r("progressOverlay");
                throw null;
            }
            fullBleedGestaltSpinner2.showLoadingSpinner(false);
        }
        return Unit.f80348a;
    }
}
