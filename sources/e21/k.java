package e21;

import android.content.Context;
import com.pinterest.feature.pin.reactions.view.PinReactionIconButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

/* loaded from: classes5.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable p03 = (Throwable) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        PinReactionIconButton pinReactionIconButton = (PinReactionIconButton) this.receiver;
        int i13 = PinReactionIconButton.f47261z;
        pinReactionIconButton.getClass();
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().i(p03.getLocalizedMessage());
        return Unit.f80348a;
    }
}
