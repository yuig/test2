package wm1;

import com.pinterest.gestalt.listAction.GestaltListAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130274i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltListAction f130275j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f130276k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(GestaltListAction gestaltListAction, c cVar, int i13) {
        super(1);
        this.f130274i = i13;
        this.f130275j = gestaltListAction;
        this.f130276k = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130274i;
        GestaltListAction gestaltListAction = this.f130275j;
        c cVar = this.f130276k;
        switch (i13) {
            case 0:
                c newState = (c) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                yl1.d dVar = GestaltListAction.V;
                gestaltListAction.r0(cVar, newState);
                break;
            default:
                ((Number) obj).intValue();
                gestaltListAction.setId(cVar.f130273g);
                break;
        }
        return Unit.f80348a;
    }
}
