package pw0;

import android.content.Context;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.yb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends wt1.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final WeakReference f101500h;

    /* renamed from: i, reason: collision with root package name */
    public final nx.d0 f101501i;

    /* renamed from: j, reason: collision with root package name */
    public final sw0.y f101502j;

    /* renamed from: k, reason: collision with root package name */
    public final x f101503k;

    /* renamed from: l, reason: collision with root package name */
    public final Function0 f101504l;

    /* renamed from: m, reason: collision with root package name */
    public final Function0 f101505m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f101506n;

    /* renamed from: o, reason: collision with root package name */
    public final List f101507o;

    /* renamed from: p, reason: collision with root package name */
    public final Function1 f101508p;

    /* renamed from: q, reason: collision with root package name */
    public final Function1 f101509q;

    /* renamed from: r, reason: collision with root package name */
    public final Function1 f101510r;

    /* renamed from: s, reason: collision with root package name */
    public xj2.c f101511s;

    public c0(WeakReference context, nx.d0 pinalytics, sw0.y mediaUtil, x type, qw0.f directoryPath, qw0.f currentTabType, boolean z13, ArrayList actionItems, qw0.g onItemsUpdate, qw0.g onItemsComplete, qw0.g errorHandler, y videoInteractionListener, r imageInteractionListener, o buttonInteractionListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(mediaUtil, "mediaUtil");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(directoryPath, "directoryPath");
        Intrinsics.checkNotNullParameter(currentTabType, "currentTabType");
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        Intrinsics.checkNotNullParameter(onItemsUpdate, "onItemsUpdate");
        Intrinsics.checkNotNullParameter(onItemsComplete, "onItemsComplete");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(videoInteractionListener, "videoInteractionListener");
        Intrinsics.checkNotNullParameter(imageInteractionListener, "imageInteractionListener");
        Intrinsics.checkNotNullParameter(buttonInteractionListener, "buttonInteractionListener");
        this.f101500h = context;
        this.f101501i = pinalytics;
        this.f101502j = mediaUtil;
        this.f101503k = type;
        this.f101504l = directoryPath;
        this.f101505m = currentTabType;
        this.f101506n = z13;
        this.f101507o = actionItems;
        this.f101508p = onItemsUpdate;
        this.f101509q = onItemsComplete;
        this.f101510r = errorHandler;
        boolean z14 = false;
        c(new int[]{RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID}, new sw0.d(imageInteractionListener, u() && !hf0.b.q()));
        int[] iArr = {RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER};
        if (u() && !hf0.b.q()) {
            z14 = true;
        }
        c(iArr, new sw0.e(videoInteractionListener, z14, u()));
        o(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, new sw0.c(buttonInteractionListener, sm1.b.ic_camera_gestalt));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        pu puVar = (pu) getItem(i13);
        if (puVar instanceof yb) {
            return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE;
        }
        if (puVar instanceof k01) {
            return u() ? RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER : RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
        }
        if (puVar instanceof d30) {
            return u() ? RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID : RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
        }
        return 100;
    }

    @Override // wt1.e0, wt1.b
    public final void n() {
        clear();
        super.n();
        n nVar = (n) this.f101505m.invoke();
        Context context = (Context) this.f101500h.get();
        if (context != null) {
            xj2.c cVar = this.f101511s;
            if (cVar != null) {
                cVar.dispose();
            }
            ol1.d w13 = uj2.q.w(this.f101507o);
            String str = (String) this.f101504l.invoke();
            boolean z13 = nVar != n.Videos;
            boolean z14 = nVar == n.Photos ? false : this.f101506n;
            xk2.v vVar = sw0.y.f115589f;
            this.f101511s = uj2.q.j(w13, this.f101502j.d(context, str, z13, z14, this.f101506n, this.f101501i, -1)).H(tk2.e.f118017c).A(wj2.c.a()).F(new gw0.a(10, new b0(this, 0)), new gw0.a(11, new b0(this, 1)), new cp.b0(this, 21), ck2.i.f27924d);
        }
    }

    public final boolean u() {
        x type = this.f101503k;
        Intrinsics.checkNotNullParameter(type, "type");
        return type == x.IdeaPinPageAdd || type == x.IdeaPinAddMediaClip || type == x.IdeaPinImageSticker;
    }
}
