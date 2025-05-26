package ol0;

import android.content.Context;
import com.google.android.material.card.MaterialCardView;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import ni1.c0;
import ni1.o2;
import ni1.t2;
import qa2.d0;
import qa2.f0;
import qa2.h0;
import qa2.j0;

/* loaded from: classes5.dex */
public final class i extends MaterialCardView implements f0, s42.k, d0 {

    /* renamed from: p, reason: collision with root package name */
    public final wa2.m f96388p;

    /* renamed from: q, reason: collision with root package name */
    public final SbaPinRep f96389q;

    /* renamed from: r, reason: collision with root package name */
    public final o2 f96390r;

    /* renamed from: s, reason: collision with root package name */
    public nr0.b f96391s;

    /* renamed from: t, reason: collision with root package name */
    public final xk2.v f96392t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, nx.d0 pinalytics, wa2.m pinFeatureConfig, androidx.lifecycle.u scope, j0 pinGridCellFactory, t2 pinRepViewModelFactory, ni1.d0 vmStateConverterFactory) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinGridCellFactory, "pinGridCellFactory");
        Intrinsics.checkNotNullParameter(pinRepViewModelFactory, "pinRepViewModelFactory");
        Intrinsics.checkNotNullParameter(vmStateConverterFactory, "vmStateConverterFactory");
        this.f96388p = pinFeatureConfig;
        this.f96392t = xk2.m.b(new k1.q(vmStateConverterFactory, this, pinalytics, 21));
        bk.l lVar = new bk.l();
        bk.l lVar2 = new bk.l();
        bk.l lVar3 = new bk.l();
        bk.l lVar4 = new bk.l();
        bk.a aVar = new bk.a(0.0f);
        bk.a aVar2 = new bk.a(0.0f);
        bk.a aVar3 = new bk.a(0.0f);
        bk.a aVar4 = new bk.a(0.0f);
        bk.f fVar = new bk.f();
        bk.f fVar2 = new bk.f();
        bk.f fVar3 = new bk.f();
        bk.f fVar4 = new bk.f();
        float W = bs1.c.W(this, eo1.c.image_corner_radius_xl);
        bk.m mVar = new bk.m();
        mVar.f23078a = lVar;
        mVar.f23079b = lVar2;
        mVar.f23080c = lVar3;
        mVar.f23081d = lVar4;
        mVar.f23082e = aVar;
        mVar.f23083f = aVar2;
        mVar.f23084g = aVar3;
        mVar.f23085h = aVar4;
        mVar.f23086i = fVar;
        mVar.f23087j = fVar2;
        mVar.f23088k = fVar3;
        mVar.f23089l = fVar4;
        mVar.c(W);
        Y0(mVar.a());
        l(0.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) pinGridCellFactory).a(context2, true);
        o2 a13 = t2.a(pinRepViewModelFactory, scope, new zw.a(this), 6);
        l3.c.m(sbaPinRep, pinFeatureConfig, pinalytics, a13, scope);
        this.f96389q = sbaPinRep;
        this.f96390r = a13;
        sbaPinRep.addToView(this);
        X(bs1.c.W(this, s42.g.pin_selected_border_width));
        int W2 = bs1.c.W(this, s42.g.lego_board_pin_select_elevation);
        Intrinsics.checkNotNullParameter(this, "<this>");
        s(W2, W2, W2, W2);
    }

    @Override // s42.k
    public final boolean H0(f30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        throw new xk2.o("An operation is not implemented: Not yet implemented");
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f96389q;
    }

    @Override // qa2.d0
    public final void onOpenPinCloseup(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        nr0.b bVar = this.f96391s;
        if (bVar != null) {
            bVar.onOpenPinCloseup(pin);
        }
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f96389q.bindDisplayState(this.f96390r.b(((c0) this.f96392t.getValue()).a(i13, pin), false));
    }

    @Override // s42.k
    public final void z0(f30 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        H0(model);
        throw null;
    }
}
