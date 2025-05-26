package sw0;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f115517k;

    /* renamed from: l, reason: collision with root package name */
    public final nx.d0 f115518l;

    /* renamed from: m, reason: collision with root package name */
    public final yk1.v f115519m;

    /* renamed from: n, reason: collision with root package name */
    public final y f115520n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f115521o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(WeakReference context, nx.d0 pinalytics, yk1.a viewResources, y mediaUtil, boolean z13, pw0.k listener) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(mediaUtil, "mediaUtil");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f115517k = context;
        this.f115518l = pinalytics;
        this.f115519m = viewResources;
        this.f115520n = mediaUtil;
        this.f115521o = z13;
        o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, new h90.m(listener));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
    }

    @Override // xk1.c
    public final uj2.q k() {
        Context context = (Context) this.f115517k.get();
        uj2.q u13 = context != null ? this.f115520n.a(this.f115518l, context, this.f115521o, this.f115519m).H(tk2.e.f118016b).O().u() : null;
        if (u13 != null) {
            return u13;
        }
        jk2.h0 h0Var = jk2.h0.f76488a;
        Intrinsics.checkNotNullExpressionValue(h0Var, "empty(...)");
        return h0Var;
    }
}
