package ny0;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92617r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f92618s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f92618s = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f92618s, cVar);
        rVar.f92617r = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((f) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f fVar = (f) this.f92617r;
        v vVar = this.f92618s;
        GestaltButton gestaltButton = vVar.N0;
        if (gestaltButton == null) {
            Intrinsics.r("cta");
            throw null;
        }
        gestaltButton.d(new dx0.d(fVar, 10));
        vVar.P0 = fVar.f92585c;
        vVar.getClass();
        Integer f13 = fVar.f();
        if (f13 != null) {
            int intValue = f13.intValue();
            RecyclerView g83 = vVar.g8();
            Object obj2 = g83 != null ? g83.f19242n : null;
            LinearLayoutManager linearLayoutManager = obj2 instanceof LinearLayoutManager ? (LinearLayoutManager) obj2 : null;
            if (linearLayoutManager != null) {
                tq.s sVar = new tq.s(vVar.requireContext(), 2);
                sVar.f19651a = intValue;
                linearLayoutManager.X0(sVar);
            }
            kh2.j.x2(vVar.l9(), g.f92593a);
        }
        return Unit.f80348a;
    }
}
