package rq;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class a1 extends r1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f109078b;

    /* renamed from: c, reason: collision with root package name */
    public final f30 f109079c;

    /* renamed from: d, reason: collision with root package name */
    public final String f109080d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f109081e;

    /* renamed from: f, reason: collision with root package name */
    public gs0.k f109082f;

    /* renamed from: g, reason: collision with root package name */
    public hs.d f109083g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f109084h;

    /* renamed from: i, reason: collision with root package name */
    public b82.n f109085i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context, f30 f30Var, String navigationSource, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        inject();
        this.f109079c = f30Var;
        this.f109080d = navigationSource;
        this.f109081e = z13;
        hs.d dVar = this.f109083g;
        if (dVar != null) {
            this.f109084h = dVar.a();
        } else {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b82.n nVar = new b82.n(context, this.f109079c);
        r1.setUpGradientAndMaybeCreateOverflowButton$closeup_release$default(this, nVar, true, true, this.f109084h, false, 16, null);
        addView(nVar);
        this.f109085i = nVar;
        setBackgroundColor(bs1.c.B(this, eo1.b.color_background_default));
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_IMAGE;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109078b) {
            return;
        }
        this.f109078b = true;
        jb jbVar = (jb) ((b1) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f109082f = oaVar.w2();
        this.f109083g = s8Var.a6();
    }

    @Override // jq.a
    public final void openPinOverflowMenuModal(boolean z13) {
        gs0.k kVar = this.f109082f;
        if (kVar != null) {
            r1.openPinOverflowMenuModal$closeup_release$default(this, kVar, this.f109080d, this.f109081e, null, false, 24, null);
        } else {
            Intrinsics.r("pinOverflowMenuModalProvider");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return b40.s0(getPin());
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // jq.a
    public final void showLoadingSpinner(boolean z13) {
    }

    @Override // rq.r1
    public final void updateMediaViewSize(int i13) {
        int b03 = c0.d.b0(1.0f, i13);
        b82.n nVar = this.f109085i;
        if (nVar != null) {
            ImageView imageView = nVar.f22221c;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i13;
            layoutParams.width = b03;
            imageView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
        b82.n nVar = this.f109085i;
        if (nVar != null) {
            nVar.a(pin);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        GestaltIconButton upGradientAndMaybeCreateOverflowButton$closeup_release$default;
        super.updateView();
        b82.n nVar = this.f109085i;
        if (nVar == null || (upGradientAndMaybeCreateOverflowButton$closeup_release$default = r1.setUpGradientAndMaybeCreateOverflowButton$closeup_release$default(this, nVar, true, true, this.f109084h, false, 16, null)) == null) {
            return;
        }
        gs0.k kVar = this.f109082f;
        if (kVar != null) {
            r1.updatePinOverflowMenuModal$closeup_release$default(this, upGradientAndMaybeCreateOverflowButton$closeup_release$default, kVar, this.f109080d, this.f109081e, null, 16, null);
        } else {
            Intrinsics.r("pinOverflowMenuModalProvider");
            throw null;
        }
    }
}
