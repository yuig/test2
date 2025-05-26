package la1;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends jc0.b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82531a;

    public j(boolean z13) {
        this.f82531a = z13;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        jc0.n nVar = new jc0.n(context);
        nVar.x(new l(context, this.f82531a));
        nVar.T(false);
        return nVar;
    }
}
