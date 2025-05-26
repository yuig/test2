package z51;

import android.content.Context;
import com.pinterest.feature.scheduledpins.view.ScheduledPinCellView;
import java.text.SimpleDateFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import qv0.d0;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140866i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f140867j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(0);
        this.f140866i = i13;
        this.f140867j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f140866i;
        e eVar = this.f140867j;
        switch (i13) {
            case 0:
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                ScheduledPinCellView scheduledPinCellView = new ScheduledPinCellView(requireContext);
                c listener = new c(eVar);
                Intrinsics.checkNotNullParameter(listener, "listener");
                scheduledPinCellView.setOnClickListener(new d0(19, listener, scheduledPinCellView));
                return scheduledPinCellView;
            default:
                SimpleDateFormat simpleDateFormat = e.f140868a1;
                eVar.getClass();
                Context requireContext2 = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new h(requireContext2, new c(eVar));
        }
    }
}
