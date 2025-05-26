package gb1;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f64742a;

    /* renamed from: b, reason: collision with root package name */
    public final com.pinterest.feature.settings.notifications.f f64743b;

    public x(int i13, m turnOffAllNotifsListener) {
        Intrinsics.checkNotNullParameter(turnOffAllNotifsListener, "turnOffAllNotifsListener");
        this.f64742a = i13;
        this.f64743b = turnOffAllNotifsListener;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.q(false);
        modalViewWrapper.t(new w(context, this.f64742a, this.f64743b));
        return modalViewWrapper;
    }
}
