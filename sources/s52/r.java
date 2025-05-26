package s52;

import ao2.j0;
import h32.i0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function2;
import l82.y;
import o82.i2;
import r52.d0;
import zy.l0;

/* loaded from: classes4.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f111200r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i0 f111201s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f111202t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, i0 i0Var, s sVar, bl2.c cVar) {
        super(2, cVar);
        this.f111200r = pVar;
        this.f111201s = i0Var;
        this.f111202t = sVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r(this.f111200r, this.f111201s, this.f111202t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p pVar = this.f111200r;
        List y03 = CollectionsKt.y0(CollectionsKt.F0(pVar.f111198c), pVar.f111197b);
        l0 l0Var = new l0(this.f111201s, 2);
        String str = pVar.f111196a;
        d0 d0Var = new d0(str, pVar.f111199d, new o82.j0(e0.b(new i2(new q52.a(str), 2))), l0Var, pVar.f111197b, q0.f80391a, y03);
        int length = str.length();
        s sVar = this.f111202t;
        if (length == 0) {
            sVar.f111205e.q(new IllegalArgumentException("ShareBoardPinSelectionSheetViewModel: Board id is empty"), "ShareBoardPinSelectionSheetViewModel: Board id is empty", tb0.p.BOARD_INVITE);
            sVar.f111204d.e("Board id is empty");
        }
        y.i(sVar.f111211k, d0Var, false, new s12.a(sVar, 7), 2);
        return Unit.f80348a;
    }
}
