package dm1;

import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.callout.GestaltCallout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gm1.a p03 = (gm1.a) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        GestaltCallout gestaltCallout = (GestaltCallout) this.receiver;
        GestaltButtonGroup gestaltButtonGroup = gestaltCallout.f49352e;
        if (gestaltButtonGroup != null) {
            gestaltButtonGroup.b(new a(gestaltCallout, p03));
        }
        GestaltIconButton gestaltIconButton = gestaltCallout.f49353f;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new a(p03, gestaltCallout));
        }
        return Unit.f80348a;
    }
}
