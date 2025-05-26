package hl0;

import com.pinterest.api.model.la;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.w;
import kl0.z;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import x40.f7;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69485i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v7 f69486j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f69487k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v7 v7Var, v vVar) {
        super(1);
        this.f69486j = v7Var;
        this.f69487k = vVar;
    }

    public final void b(List boardTools) {
        Object obj;
        int i13 = this.f69485i;
        v vVar = this.f69487k;
        v7 v7Var = this.f69486j;
        f7 f7Var = null;
        switch (i13) {
            case 0:
                vVar.L = boardTools;
                boolean z13 = v7Var != null && w.i0(v7Var);
                lh0.r rVar = vVar.f69543r;
                if (!z13) {
                    if (vVar.L3()) {
                        rVar.getClass();
                        z3 z3Var = a4.f83297a;
                        g1 g1Var = (g1) rVar.f83466a;
                        if (g1Var.o("android_presence_other_board_more_ideas_board_handler", "enabled", z3Var) || g1Var.l("android_presence_other_board_more_ideas_board_handler")) {
                            return;
                        }
                        ((xk1.e) vVar.f69536n0.getValue()).t();
                        return;
                    }
                    return;
                }
                Intrinsics.f(boardTools);
                Integer s13 = v7Var.s1();
                Intrinsics.checkNotNullExpressionValue(s13, "getSectionlessPinCount(...)");
                int intValue = s13.intValue();
                Integer l13 = v7Var.l1();
                Intrinsics.checkNotNullExpressionValue(l13, "getPinCount(...)");
                int intValue2 = l13.intValue();
                Integer q13 = v7Var.q1();
                Intrinsics.checkNotNullExpressionValue(q13, "getSectionCount(...)");
                int intValue3 = q13.intValue();
                rk0.j jVar = vVar.G;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(boardTools, "boardTools");
                jVar.g(new sk0.f(intValue, intValue2, intValue3, boardTools));
                Iterator it = boardTools.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((la) obj).q().intValue() == z22.c.MESSAGE_GROUP.getValue()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                boolean z14 = obj != null;
                com.pinterest.feature.board.detail.a aVar = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                if (aVar != null) {
                    GestaltIconButton gestaltIconButton = ((z) aVar).G1;
                    if (gestaltIconButton == null) {
                        Intrinsics.r("messageButton");
                        throw null;
                    }
                    gestaltIconButton.t(new jc0.m(z14, 15));
                }
                if (v7Var.J0().intValue() == 1 && z14) {
                    rVar.getClass();
                    z3 z3Var2 = a4.f83298b;
                    g1 g1Var2 = (g1) rVar.f83466a;
                    if (g1Var2.o("sg_android_message_reply_entrypoint_gb_closeup", "enabled", z3Var2)) {
                        return;
                    }
                    g1Var2.l("sg_android_message_reply_entrypoint_gb_closeup");
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(boardTools, "collaborators");
                wy0 k13 = v7Var.k1();
                if (k13 != null) {
                    vVar.N.getClass();
                    f7Var = lk0.d.b(k13);
                }
                ArrayList l03 = CollectionsKt.l0(boardTools, f0.k(f7Var));
                vVar.getClass();
                oo1.j jVar2 = oo1.j.f96854a;
                xj2.c o13 = oo1.j.t(l03, vVar.f69550y).l(wj2.c.a()).o(new zk0.b(14, new e(vVar, 13)), new zk0.b(15, new e(vVar, 14)));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                vVar.addDisposable(o13);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f69485i) {
            case 0:
                b((List) obj);
                break;
            default:
                b((List) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v vVar, v7 v7Var) {
        super(1);
        this.f69487k = vVar;
        this.f69486j = v7Var;
    }
}
