package fs0;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.gridactions.modal.view.PinFeedbackModalContentView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.d1;
import sq0.e0;
import x02.i2;

/* loaded from: classes5.dex */
public final class k extends vq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final String f62859c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f62860d;

    /* renamed from: e, reason: collision with root package name */
    public final x10.b f62861e;

    /* renamed from: f, reason: collision with root package name */
    public final js0.a f62862f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.w f62863g;

    /* renamed from: h, reason: collision with root package name */
    public final wy0 f62864h;

    /* renamed from: i, reason: collision with root package name */
    public final js0.a f62865i;

    /* renamed from: j, reason: collision with root package name */
    public final d1 f62866j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f62867k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String pinId, i2 pinRepository, x10.b pinApiService, uk1.d presenterPinalytics, uj2.q networkStateStream, wy0 wy0Var, js0.a hideRemoteRequest, d1 trackingParamAttacher, HashMap hashMap) {
        super(presenterPinalytics, networkStateStream);
        js0.a pinPfyFeedbackInteractor = new js0.a(pinApiService, 1);
        m60.w eventManager = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(pinPfyFeedbackInteractor, "pinPfyFeedbackInteractor");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(hideRemoteRequest, "hideRemoteRequest");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.f62859c = pinId;
        this.f62860d = pinRepository;
        this.f62861e = pinApiService;
        this.f62862f = pinPfyFeedbackInteractor;
        this.f62863g = eventManager;
        this.f62864h = wy0Var;
        this.f62865i = hideRemoteRequest;
        this.f62866j = trackingParamAttacher;
        this.f62867k = hashMap;
    }

    @Override // vq0.g
    /* renamed from: D3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void r3(cs0.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        PinFeedbackModalContentView pinFeedbackModalContentView = (PinFeedbackModalContentView) view;
        pinFeedbackModalContentView.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        pinFeedbackModalContentView.f45714d = this;
    }

    public final void F3() {
        if (isBound()) {
            i92.k kVar = ((PinFeedbackModalContentView) ((cs0.d) getView())).f45716f;
            if (kVar != null) {
                kVar.h(x0.generic_error);
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        throw new xk2.o("An operation is not implemented: Not yet implemented");
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }
}
