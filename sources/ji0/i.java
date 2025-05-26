package ji0;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends jc0.b {
    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.t(new j(context));
        modalViewWrapper.q(false);
        return modalViewWrapper;
    }

    @Override // jc0.a0
    public final boolean isDismissible() {
        return false;
    }
}
