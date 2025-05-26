package ez0;

import a.z0;
import android.content.Context;
import android.widget.FrameLayout;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import i91.u;
import kotlin.jvm.internal.Intrinsics;
import mq.w;
import ni1.a2;
import ni1.b1;
import ni1.o2;
import ni1.t2;
import ni1.y2;
import nx.d0;
import nx.v;
import qa2.h0;
import so.ba;
import wa2.m;

/* loaded from: classes5.dex */
public final class h extends FrameLayout implements v, bz0.c, y92.g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f60677j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f60678a;

    /* renamed from: b, reason: collision with root package name */
    public final ni1.d0 f60679b;

    /* renamed from: c, reason: collision with root package name */
    public final es.a f60680c;

    /* renamed from: d, reason: collision with root package name */
    public final SbaPinRep f60681d;

    /* renamed from: e, reason: collision with root package name */
    public final o2 f60682e;

    /* renamed from: f, reason: collision with root package name */
    public final m f60683f;

    /* renamed from: g, reason: collision with root package name */
    public bz0.a f60684g;

    /* renamed from: h, reason: collision with root package name */
    public final c f60685h;

    /* renamed from: i, reason: collision with root package name */
    public final SbaPinRep f60686i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, j0 scope, d0 pinalytics, qa2.j0 pinGridCellFactory, ni1.d0 vmStateConverterFactory, t2 pinRepViewModelFactory, u style, es.a adFormats) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinGridCellFactory, "pinGridCellFactory");
        Intrinsics.checkNotNullParameter(vmStateConverterFactory, "vmStateConverterFactory");
        Intrinsics.checkNotNullParameter(pinRepViewModelFactory, "pinRepViewModelFactory");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f60678a = pinalytics;
        this.f60679b = vmStateConverterFactory;
        this.f60680c = adFormats;
        m a13 = a2.a();
        this.f60683f = a13;
        c cVar = new c(context, style);
        this.f60685h = cVar;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) pinGridCellFactory).a(context2, true);
        o2 a14 = t2.a(pinRepViewModelFactory, scope, null, 14);
        sbaPinRep.setPinalytics(pinalytics);
        sbaPinRep.applyUnMigratedPFCFields(a13.f128875n0, a13.f128861g0, a13.f128855d0, a13.f128879p0, a13.M);
        sbaPinRep.setEventIntake(a14.c());
        kotlin.jvm.internal.j.z(scope, null, null, new g(a14, sbaPinRep, null), 3);
        this.f60681d = sbaPinRep;
        this.f60682e = a14;
        addView(sbaPinRep);
        addView(cVar);
        this.f60686i = sbaPinRep;
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f60686i;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f60681d.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f60681d.markImpressionStart();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        SbaPinRep sbaPinRep = this.f60681d;
        this.f60685h.g(sbaPinRep.getImageEdges().f139142d, sbaPinRep.getImageEdges().f139141c);
    }

    @Override // y92.g
    public final boolean resizable() {
        f30 S = com.bumptech.glide.d.S(this.f60686i);
        if (S != null) {
            return bs1.c.m1(S, this.f60680c);
        }
        return false;
    }

    @Override // bz0.b
    public final void setOneTapButtonClickListener(bz0.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f60684g = listener;
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        y2 a13 = ((ba) this.f60679b).a(this.f60683f, new w(this, 8), new z0(this, 4)).a(i13, pin);
        o2 o2Var = this.f60682e;
        this.f60681d.bindDisplayState(o2Var.b(a13, false));
        o2Var.c().a(b1.f90598a);
        qv0.d0 d0Var = new qv0.d0(9, this, pin);
        c cVar = this.f60685h;
        cVar.setOnClickListener(d0Var);
        cVar.j(i13);
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        return this.f60686i.getPinUid();
    }
}
