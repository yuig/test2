package ji0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f76270a;

    /* renamed from: b, reason: collision with root package name */
    public View.OnClickListener f76271b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnClickListener f76272c;

    public k(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f76270a = email;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.q(false);
        m mVar = new m(context, this.f76270a);
        mVar.f76279h = this.f76271b;
        mVar.f76280i = this.f76272c;
        modalViewWrapper.t(mVar);
        return modalViewWrapper;
    }
}
