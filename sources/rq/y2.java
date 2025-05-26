package rq;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class y2 extends PinCloseupBaseModule {

    /* renamed from: a, reason: collision with root package name */
    public boolean f109668a;

    /* renamed from: b, reason: collision with root package name */
    public final b11.n0 f109669b;

    /* renamed from: c, reason: collision with root package name */
    public final e11.a f109670c;

    /* renamed from: d, reason: collision with root package name */
    public b11.j0 f109671d;

    /* renamed from: e, reason: collision with root package name */
    public String f109672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(Context context, b11.n0 secondaryActionBarType, e11.a pinCloseupMetadataModuleListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(secondaryActionBarType, "secondaryActionBarType");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataModuleListener, "pinCloseupMetadataModuleListener");
        inject();
        this.f109669b = secondaryActionBarType;
        this.f109670c = pinCloseupMetadataModuleListener;
        setClipChildren(false);
        setOrientation(0);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 6));
        } else {
            pinCloseupMetadataModuleListener.w6(getHeight());
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        updateHorizontalPadding();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        b11.j0 j0Var = new b11.j0(context, kh2.n3.E(getViewPinalytics(), tb0.p.CLOSEUP), this.f109669b);
        j0Var.f21044v = getProductTagParentPinId();
        j0Var.C = this.f109672e;
        f30 pin = getPin();
        if (pin != null) {
            j0Var.t0(pin);
        }
        this.f109671d = j0Var;
        androidx.coordinatorlayout.widget.c cVar = new androidx.coordinatorlayout.widget.c(-1, -2);
        cVar.f17902c = 81;
        j0Var.setLayoutParams(cVar);
        addView(this.f109671d);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_ACTION;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f109668a) {
            return;
        }
        this.f109668a = true;
        jb jbVar = (jb) ((z2) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
    }

    @Override // android.view.View
    public final void setVisibility(int i13) {
        super.setVisibility(i13);
        if (i13 == 0) {
            b11.j0 j0Var = this.f109671d;
            if (j0Var != null) {
                bs1.c.U1(j0Var.f21038p);
                return;
            }
            return;
        }
        b11.j0 j0Var2 = this.f109671d;
        if (j0Var2 != null) {
            pk.a0.l0(j0Var2.f21038p);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return false;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateActive(boolean z13) {
        super.updateActive(z13);
        b11.j0 j0Var = this.f109671d;
        if (j0Var != null) {
            j0Var.F = z13;
            j0Var.g0();
            if (j0Var.F && j0Var.V) {
                int dimensionPixelSize = j0Var.getResources().getDimensionPixelSize(p80.a.secondary_action_bar_icon_size);
                rm1.i iVar = rm1.i.MD;
                int G0 = (dimensionPixelSize - dl2.b.G0(j0Var, iVar.getDimenAttrRes())) / 2;
                Context context = j0Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                s71.l lVar = new s71.l(context, s71.b.LEFT, false, vn1.g.BODY_200, 0, G0, true, 0L, 0, rm1.q.ANDROID_SHARE, iVar, null, null, false, false, false, false, null, false, Integer.valueOf(p80.b.gray_icon_button_round), 8362768);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.height = dimensionPixelSize;
                lVar.setOnClickListener(new b11.d0(j0Var, 0));
                String b23 = bs1.c.b2(m60.x0.share);
                Intrinsics.checkNotNullExpressionValue(b23, "string(...)");
                lVar.g(b23, false);
                j0Var.f21034l.addView(lVar, layoutParams);
                s71.l.a(lVar, s71.a.EXPAND, 1000L, 10);
                is1.a0 a0Var = j0Var.R;
                if (a0Var == null) {
                    Intrinsics.r("shareAnimationEligibilityUtils");
                    throw null;
                }
                int a13 = a0Var.a() + 1;
                lb0.q qVar = a0Var.f73571a;
                qVar.i("PREF_CLOSEUP_EXPANDING_SHARE_ANIMATION_SEEN_LAST_24H_COUNT", a13);
                qVar.c("PREF_CLOSEUP_EXPANDING_SHARE_ANIMATION_LAST_SEEN_AT_MS", new Date().getTime());
                j0Var.V = false;
            }
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        b11.j0 j0Var = this.f109671d;
        if (j0Var != null) {
            j0Var.t0(pin);
        }
        super.updatePin(pin);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePinSpamParams(c82.a aVar) {
        super.updatePinSpamParams(aVar);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        b11.j0 j0Var;
        super.updateView();
        f30 pin = getPin();
        if (pin == null || (j0Var = this.f109671d) == null) {
            return;
        }
        j0Var.t0(pin);
    }
}
