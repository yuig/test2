package xx1;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends jc0.b {
    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.k();
        int i13 = eo1.d.lego_modal_bg;
        Object obj = d5.a.f53679a;
        modalViewWrapper.setBackground(context.getDrawable(i13));
        modalViewWrapper.l(com.pinterest.partnerAnalytics.g.pin_stats_metric_modal_info);
        modalViewWrapper.s(com.pinterest.partnerAnalytics.e.pin_stats_metrics_info);
        return modalViewWrapper;
    }
}
