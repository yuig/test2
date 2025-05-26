package rq;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y0 extends j implements i01.s {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f109656m = 0;

    /* renamed from: c, reason: collision with root package name */
    public final e11.a f109657c;

    /* renamed from: d, reason: collision with root package name */
    public m60.w f109658d;

    /* renamed from: e, reason: collision with root package name */
    public lh0.a0 f109659e;

    /* renamed from: f, reason: collision with root package name */
    public hs.d f109660f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f109661g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltAvatar f109662h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f109663i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f109664j;

    /* renamed from: k, reason: collision with root package name */
    public wy0 f109665k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltText f109666l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, e11.a pinCloseupMetadataModuleListener) {
        super(context, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataModuleListener, "pinCloseupMetadataModuleListener");
        this.f109657c = pinCloseupMetadataModuleListener;
        xk2.v b13 = xk2.m.b(new x0(this, 0));
        xk2.v b14 = xk2.m.b(new x0(this, 1));
        xk2.v b15 = xk2.m.b(new x0(this, 2));
        hs.d dVar = this.f109660f;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        boolean b16 = dVar.b();
        this.f109661g = b16;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context2, (AttributeSet) null);
        if (hf0.b.q() || !(((Boolean) b13.getValue()).booleanValue() || ((Boolean) b14.getValue()).booleanValue() || ((Boolean) b15.getValue()).booleanValue())) {
            gestaltAvatar.H2(o.f109419z);
        } else {
            gestaltAvatar.H2(o.f109418y);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd((hf0.b.q() || !(((Boolean) b13.getValue()).booleanValue() || ((Boolean) b14.getValue()).booleanValue() || ((Boolean) b15.getValue()).booleanValue())) ? bs1.c.W(gestaltAvatar, eo1.c.space_100) : bs1.c.W(gestaltAvatar, m60.r0.pin_closeup_avatar_margin));
        gestaltAvatar.setLayoutParams(layoutParams);
        bs1.c.X0(gestaltAvatar);
        this.f109662h = gestaltAvatar;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context3, (AttributeSet) null);
        gestaltText.i(new z3.m(this, 23));
        bs1.c.X0(gestaltText);
        this.f109663i = gestaltText;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(gestaltAvatar);
        linearLayout.addView(gestaltText);
        this.f109664j = linearLayout;
        setOrientation(1);
        setGravity(16);
        int W = bs1.c.W(this, eo1.c.space_400);
        Rect paddingRect = getPaddingRect();
        lh0.a0 a0Var = this.f109659e;
        if (a0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        lh0.z3 z3Var = lh0.a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) a0Var.f83294a;
        if (g1Var.o("closeup_redesign_tablet_android", "enabled", z3Var) || g1Var.l("closeup_redesign_tablet_android")) {
            paddingRect.top = bs1.c.W(this, eo1.c.space_200);
        }
        paddingRect.left = W;
        paddingRect.bottom = b16 ? 0 : bs1.c.W(this, eo1.c.space_100);
        paddingRect.right = W;
        addView(linearLayout);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 4));
        } else {
            pinCloseupMetadataModuleListener.w6(getHeight());
        }
    }

    public final void b(String str) {
        nx.d0 viewPinalytics = getViewPinalytics();
        if (viewPinalytics != null) {
            h32.u0 u0Var = h32.u0.CREATOR_MODULE;
            h32.g0 g0Var = h32.g0.MODAL_PIN;
            HashMap hashMap = new HashMap();
            f30 pin = getPin();
            if (pin != null) {
            }
            hashMap.put("user_id", str);
            Unit unit = Unit.f80348a;
            viewPinalytics.h(g0Var, u0Var, hashMap);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        this.f109664j.setOnClickListener(new a.l2(this, 24));
    }

    public final void e(String domain) {
        wy0 I5;
        Intrinsics.checkNotNullParameter(domain, "domain");
        f30 pin = getPin();
        String str = null;
        String w13 = pin != null ? kh2.g0.w(pin, domain, true, this.f109665k) : null;
        if (w13 == null || w13.length() == 0) {
            f30 pin2 = getPin();
            if ((pin2 != null ? pin2.I5() : null) != null) {
                Resources resources = getResources();
                int i13 = m60.x0.link_module_title_uploaded_lego;
                Object[] objArr = new Object[1];
                f30 pin3 = getPin();
                if (pin3 != null && (I5 = pin3.I5()) != null) {
                    str = I5.Z2();
                }
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                w13 = resources.getString(i13, objArr);
            } else {
                w13 = getResources().getString(m60.x0.link_module_title_uploaded_lego_v4);
            }
        }
        GestaltText gestaltText = this.f109663i;
        pk.a0.p(gestaltText, w13);
        bs1.c.U1(gestaltText);
        wy0 wy0Var = this.f109665k;
        if (wy0Var != null) {
            GestaltAvatar gestaltAvatar = this.f109662h;
            kh2.m0.V0(gestaltAvatar, wy0Var);
            bs1.c.U1(gestaltAvatar);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_LINK;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return this.f109665k != null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        String h43;
        super.updateView();
        f30 pin = getPin();
        if (pin == null || (h43 = pin.h4()) == null) {
            return;
        }
        e(h43);
    }
}
