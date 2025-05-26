package wm1;

import com.pinterest.gestalt.listAction.GestaltListAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130297i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f130298j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltListAction f130299k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(z zVar, GestaltListAction gestaltListAction, int i13) {
        super(1);
        this.f130297i = i13;
        this.f130298j = zVar;
        this.f130299k = gestaltListAction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130297i;
        GestaltListAction gestaltListAction = this.f130299k;
        z zVar = this.f130298j;
        switch (i13) {
            case 0:
                rm1.l standard = (rm1.l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(((y) zVar).f130341b);
                p pVar = gestaltListAction.M;
                if (pVar != null) {
                    standard.b(pVar.getValue());
                    return Unit.f80348a;
                }
                Intrinsics.r("iconSize");
                throw null;
            default:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new g0(zVar, gestaltListAction, 0));
                bind.a(rm1.c.DEFAULT);
                bind.f108712d = ho1.b.list_action_start_icon;
                return Unit.f80348a;
        }
    }
}
