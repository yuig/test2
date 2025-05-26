package g41;

import android.content.Context;
import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wy0 p03 = (wy0) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        m mVar = (m) this.receiver;
        int i13 = m.H0;
        Context requireContext = mVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        l3.c.U0(mVar, ve.h.i(requireContext, dl2.b.i1(p03), new b01.c(12, mVar, p03)));
        return Unit.f80348a;
    }
}
