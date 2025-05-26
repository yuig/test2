package zp;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.api.model.v7;
import com.pinterest.component.modal.BaseModalViewWrapper;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142446a = 0;

    /* renamed from: b, reason: collision with root package name */
    public nx.j0 f142447b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f142448c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f142449d;

    public l(v7 board, nx.f0 pinalyticsFactory) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f142448c = board;
        this.f142449d = pinalyticsFactory;
        this.f142447b = ((nx.m) pinalyticsFactory).a(this);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        int i13 = this.f142446a;
        Object obj = this.f142448c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar = new jc0.n(context);
                nVar.T(false);
                nVar.q(true);
                nVar.addView(new p(context, (v7) obj, this.f142447b));
                return nVar;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                jc0.n nVar2 = new jc0.n(context);
                this.f142447b = ((nx.m) nVar2.C()).a(this);
                nVar2.x(new lq0.i(context, (String) obj, (lq0.b1) this.f142449d));
                nVar2.T(false);
                return nVar2;
        }
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        switch (this.f142446a) {
            case 0:
                return new h32.i0(d4.BOARD, null, null, null, null, null);
            default:
                return new h32.i0(null, a4.CONVERSATION_THREAD, null, null, null, null);
        }
    }

    public l(String messageId, lq0.b1 b1Var) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.f142448c = messageId;
        this.f142449d = b1Var;
    }
}
