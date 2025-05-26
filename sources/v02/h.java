package v02;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f123791i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wy0 f123792j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, wy0 wy0Var) {
        super(1);
        this.f123791i = jVar;
        this.f123792j = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        on1.r bind = (on1.r) obj;
        Intrinsics.checkNotNullParameter(bind, "$this$bind");
        bind.getClass();
        bind.f96757d = fm1.c.VISIBLE;
        j jVar = this.f123791i;
        String label = jVar.getResources().getString(p60.d.block_user_message_alt);
        Intrinsics.checkNotNullExpressionValue(label, "getString(...)");
        Intrinsics.checkNotNullParameter(label, "label");
        bind.f96755b = new f0(label);
        GestaltSwitchWithLabel gestaltSwitchWithLabel = jVar.f123807v0;
        if (gestaltSwitchWithLabel == null) {
            Intrinsics.r("blockCreatorSwitch");
            throw null;
        }
        on1.b bVar = gestaltSwitchWithLabel.Z().f96740a;
        Boolean s22 = this.f123792j.s2();
        Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
        on1.b e13 = on1.b.e(bVar, s22.booleanValue(), false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
        Intrinsics.checkNotNullParameter(e13, "switch");
        bind.f96754a = e13;
        return Unit.f80348a;
    }
}
