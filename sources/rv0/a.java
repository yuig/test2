package rv0;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.component.modal.BaseModalViewWrapper;
import h32.a4;
import h32.d4;
import h32.i0;
import jc0.n;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import nx.m;

/* loaded from: classes5.dex */
public final class a extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final gg1.b f110089a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f110090b;

    public a(gg1.b modalListener, f0 pinalyticsFactory) {
        Intrinsics.checkNotNullParameter(modalListener, "modalListener");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f110089a = modalListener;
        this.f110090b = pinalyticsFactory;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        e eVar = new e(context, this.f110089a, ((m) this.f110090b).a(this));
        n nVar = new n(context);
        nVar.x(eVar);
        return nVar;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.STORY_PIN_SUPPORT_MODAL, a4.STORY_PIN_CREATE, null, null, null, null);
    }
}
