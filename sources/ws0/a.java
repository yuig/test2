package ws0;

import b60.b;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;
import lh0.r1;
import uk1.d;
import wk1.i;
import wk1.q;
import xk1.e;
import xs0.l;
import yk1.r;
import yk1.u;

/* loaded from: classes5.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    public final b f131078a;

    /* renamed from: b, reason: collision with root package name */
    public final ss0.a f131079b;

    /* renamed from: c, reason: collision with root package name */
    public final e f131080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d pinalytics, uj2.q networkStateStream, r1 experiments, b userManager, l boardToggleSettingViewBinder) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(boardToggleSettingViewBinder, "boardToggleSettingViewBinder");
        this.f131078a = userManager;
        this.f131079b = new ss0.a(userManager, experiments, boardToggleSettingViewBinder);
        e eVar = new e();
        eVar.u(RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION);
        this.f131080c = eVar;
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        wy0 f13 = ((b60.d) this.f131078a).f();
        if (f13 != null && Intrinsics.d(f13.K2(), Boolean.TRUE)) {
            ((i) dataSources).b(this.f131080c);
        }
        ((i) dataSources).b(this.f131079b);
    }

    @Override // yk1.t, yk1.p
    public final void bindPinalytics(r rVar) {
        rs0.a view = (rs0.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        getPresenterPinalytics().c(a4.HOMEFEED_CONTROL_BOARDS, d4.HOMEFEED_CONTROL, null);
    }

    @Override // wk1.q, yk1.b
    public final void onActivate() {
        wy0 f13 = ((b60.d) this.f131078a).f();
        if (f13 != null && Intrinsics.d(f13.K2(), Boolean.FALSE) && isBound()) {
            this.f131080c.y();
            ss0.a aVar = this.f131079b;
            aVar.Z();
            aVar.i2();
        }
        p3();
    }

    @Override // yk1.t, yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }

    @Override // yk1.t
    public final void bindPinalytics(u uVar) {
        rs0.a view = (rs0.a) uVar;
        Intrinsics.checkNotNullParameter(view, "view");
        getPresenterPinalytics().c(a4.HOMEFEED_CONTROL_BOARDS, d4.HOMEFEED_CONTROL, null);
    }
}
