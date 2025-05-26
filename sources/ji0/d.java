package ji0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f76245a;

    /* renamed from: b, reason: collision with root package name */
    public View.OnClickListener f76246b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnClickListener f76247c;

    public d(String emailAddress) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        this.f76245a = emailAddress;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.f76246b = onClickListener;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.q(false);
        g gVar = new g(context, this.f76245a);
        gVar.f76266j = this.f76246b;
        gVar.f76267k = this.f76247c;
        modalViewWrapper.t(gVar);
        return modalViewWrapper;
    }

    public final void g(View.OnClickListener onClickListener) {
        this.f76247c = onClickListener;
    }
}
