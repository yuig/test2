package tq;

import a.cb;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import kh2.m0;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import m60.r0;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class c0 extends PinCloseupBaseModule {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f118812l = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f118813a;

    /* renamed from: b, reason: collision with root package name */
    public final e11.a f118814b;

    /* renamed from: c, reason: collision with root package name */
    public m60.w f118815c;

    /* renamed from: d, reason: collision with root package name */
    public lh0.a0 f118816d;

    /* renamed from: e, reason: collision with root package name */
    public hs.d f118817e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f118818f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f118819g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f118820h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f118821i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltAvatar f118822j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f118823k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, y pinCloseupMetadataModuleListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinCloseupMetadataModuleListener, "pinCloseupMetadataModuleListener");
        inject();
        this.f118814b = pinCloseupMetadataModuleListener;
        int i13 = 0;
        xk2.v b13 = xk2.m.b(new b0(this, 0));
        xk2.v b14 = xk2.m.b(new b0(this, 1));
        xk2.v b15 = xk2.m.b(new b0(this, 2));
        hs.d dVar = this.f118817e;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        this.f118818f = dVar.b();
        this.f118819g = "";
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context2, (AttributeSet) null);
        gestaltText.i(new a0(this, i13));
        this.f118820h = gestaltText;
        GestaltText gestaltText2 = new GestaltText(6, context, (AttributeSet) null);
        gestaltText2.i(g.f118842p);
        this.f118821i = gestaltText2;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context3, (AttributeSet) null);
        if (hf0.b.q() || !(((Boolean) b13.getValue()).booleanValue() || ((Boolean) b14.getValue()).booleanValue() || ((Boolean) b15.getValue()).booleanValue())) {
            gestaltAvatar.H2(g.f118839m);
        } else {
            gestaltAvatar.H2(g.f118838l);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd((hf0.b.q() || !(((Boolean) b13.getValue()).booleanValue() || ((Boolean) b14.getValue()).booleanValue() || ((Boolean) b15.getValue()).booleanValue())) ? bs1.c.W(gestaltAvatar, eo1.c.space_100) : bs1.c.W(gestaltAvatar, r0.pin_closeup_avatar_margin));
        gestaltAvatar.setLayoutParams(layoutParams);
        this.f118822j = gestaltAvatar;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        GestaltText gestaltText3 = new GestaltText(6, context4, (AttributeSet) null);
        gestaltText3.i(new a0(this, i13));
        this.f118823k = gestaltText3;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new com.google.android.material.navigation.b(this, 8));
        } else {
            pinCloseupMetadataModuleListener.w6(getHeight());
        }
    }

    public final void b(String str, wy0 wy0Var) {
        if (!kotlin.text.z.j(str)) {
            this.f118819g = str;
            this.f118823k.i(new ip.d(4, str));
            if (wy0Var != null) {
                GestaltAvatar gestaltAvatar = this.f118822j;
                m0.V0(gestaltAvatar, wy0Var);
                gestaltAvatar.H2(g.f118840n);
            }
            setOnClickListener(new co.a(16, this, wy0Var));
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void bindData(boolean z13, f30 pin, b11.g config, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        super.bindData(z13, pin, config, pinalytics);
        setFullPinLoaded(z13);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setOrientation(0);
        setGravity(8388611);
        if (hf0.b.n()) {
            n1 n1Var = a11.o.f334a;
            int W = a11.o.b(getPin()) ? bs1.c.W(this, eo1.c.space_400) : bs1.c.W(this, eo1.c.margin_one_and_a_half);
            getPaddingRect().left = W;
            getPaddingRect().right = W;
        } else if (hf0.b.p()) {
            int W2 = bs1.c.W(this, eo1.c.margin);
            getPaddingRect().left = W2;
            getPaddingRect().right = W2;
        } else {
            applyDefaultSidePadding();
        }
        int W3 = bs1.c.W(this, eo1.c.space_400);
        setPaddingRelative(W3, getPaddingTop(), W3, getPaddingBottom());
        setGravity(16);
        addView(this.f118820h);
        addView(this.f118821i);
        addView(this.f118822j);
        addView(this.f118823k);
    }

    public final void e() {
        String Z2;
        f30 pin = getPin();
        wy0 L3 = pin != null ? pin.L3() : null;
        if (L3 == null || (Z2 = L3.Z2()) == null || !(!kotlin.text.z.j(Z2))) {
            return;
        }
        b(Z2, L3);
        g(L3);
    }

    public final void g(wy0 wy0Var) {
        rm1.c cVar = cb.y(wy0Var, "getIsVerifiedMerchant(...)") ? rm1.c.INFO : dl2.b.W1(wy0Var) ? rm1.c.BRAND : null;
        if (cVar != null) {
            this.f118823k.i(new sp.b(cVar, 1));
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return null;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    @Override // rq.k
    public final void inject() {
        if (this.f118813a) {
            return;
        }
        this.f118813a = true;
        jb jbVar = (jb) ((d0) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (uk1.e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (nx.b0) oaVar.R8.get();
        this.f118815c = (m60.w) oaVar.f113885r0.get();
        this.f118816d = s8Var.j5();
        this.f118817e = s8Var.a6();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setFullPinLoaded(boolean r7) {
        /*
            r6 = this;
            super.setFullPinLoaded(r7)
            if (r7 != 0) goto L6
            return
        L6:
            com.pinterest.api.model.f30 r7 = r6.getPin()
            r0 = 0
            if (r7 == 0) goto L12
            com.pinterest.api.model.wy0 r7 = r7.L3()
            goto L13
        L12:
            r7 = r0
        L13:
            com.pinterest.api.model.f30 r1 = r6.getPin()
            if (r1 == 0) goto Lac
            com.pinterest.api.model.oe0 r1 = r1.f6()
            if (r1 == 0) goto Lac
            java.util.List r1 = r1.r()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            com.pinterest.api.model.h80 r1 = (com.pinterest.api.model.h80) r1
            if (r1 == 0) goto Lac
            com.pinterest.api.model.cb r1 = r1.n()
            if (r1 == 0) goto Lac
            java.lang.String r2 = r1.g()
            if (r2 == 0) goto Lac
            boolean r3 = kotlin.text.z.j(r2)
            r3 = r3 ^ 1
            if (r3 == 0) goto Lac
            if (r7 == 0) goto L48
            java.lang.String r3 = r7.Z2()
            goto L49
        L48:
            r3 = r0
        L49:
            java.lang.String r4 = ""
            if (r3 == 0) goto L7e
            boolean r3 = kotlin.text.z.j(r3)
            if (r3 == 0) goto L54
            goto L7e
        L54:
            if (r7 == 0) goto L5b
            java.lang.String r3 = r7.Z2()
            goto L5c
        L5b:
            r3 = r0
        L5c:
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            if (r2 != 0) goto L7e
            boolean[] r2 = r1.f36343f
            int r3 = r2.length
            r5 = 2
            if (r3 <= r5) goto L7e
            boolean r2 = r2[r5]
            if (r2 == 0) goto L7e
            java.lang.Boolean r2 = r1.f()
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L7e
            java.lang.String r1 = r1.g()
            if (r1 != 0) goto L7f
            r1 = r4
            goto L7f
        L7e:
            r1 = r0
        L7f:
            if (r1 == 0) goto La7
            ip.d r2 = new ip.d
            r3 = 5
            r2.<init>(r3, r1)
            com.pinterest.gestalt.text.GestaltText r1 = r6.f118820h
            r1.i(r2)
            tq.g r1 = tq.g.f118841o
            com.pinterest.gestalt.text.GestaltText r2 = r6.f118821i
            r2.i(r1)
            if (r7 == 0) goto L99
            java.lang.String r0 = r7.Z2()
        L99:
            if (r0 != 0) goto L9c
            goto L9d
        L9c:
            r4 = r0
        L9d:
            r6.b(r4, r7)
            if (r7 == 0) goto La5
            r6.g(r7)
        La5:
            kotlin.Unit r0 = kotlin.Unit.f80348a
        La7:
            if (r0 != 0) goto Lac
            r6.e()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tq.c0.setFullPinLoaded(boolean):void");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        super.updatePin(pin);
        if (kotlin.text.z.j(this.f118819g)) {
            e();
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean useAutoVisibility() {
        return false;
    }
}
