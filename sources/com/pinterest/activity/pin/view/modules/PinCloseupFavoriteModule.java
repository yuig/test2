package com.pinterest.activity.pin.view.modules;

import a.l2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import b11.g;
import b11.m0;
import bs1.c;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.repository.pin.PinService;
import h32.g0;
import hs.d;
import i92.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import n80.f;
import nx.b0;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rq.c1;
import rq.e1;
import rq.f1;
import so.jb;
import so.oa;
import so.s8;
import uk1.e;
import x02.i2;
import x02.x0;
import xj2.b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/pin/view/modules/PinCloseupFavoriteModule;", "Lcom/pinterest/activity/pin/view/modules/PinCloseupBaseModule;", "Lb11/m0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PinCloseupFavoriteModule extends PinCloseupBaseModule implements m0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f34993s = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f34994a;

    /* renamed from: b, reason: collision with root package name */
    public b f34995b;

    /* renamed from: c, reason: collision with root package name */
    public x0 f34996c;

    /* renamed from: d, reason: collision with root package name */
    public i2 f34997d;

    /* renamed from: e, reason: collision with root package name */
    public PinService f34998e;

    /* renamed from: f, reason: collision with root package name */
    public w f34999f;

    /* renamed from: g, reason: collision with root package name */
    public k f35000g;

    /* renamed from: h, reason: collision with root package name */
    public d f35001h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f35002i;

    /* renamed from: j, reason: collision with root package name */
    public ConstraintLayout f35003j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f35004k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltText f35005l;

    /* renamed from: m, reason: collision with root package name */
    public GestaltIcon f35006m;

    /* renamed from: n, reason: collision with root package name */
    public FrameLayout f35007n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35008o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35009p;

    /* renamed from: q, reason: collision with root package name */
    public hk2.b f35010q;

    /* renamed from: r, reason: collision with root package name */
    public final qc2.d f35011r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCloseupFavoriteModule(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, b11.m0
    public final void a(int i13) {
        if (getSentViewEvent()) {
            return;
        }
        Object parent = getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        if (this.f35011r.d(this, (View) parent, null) > 0.95f) {
            checkForBeginView(i13);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void bindData(boolean z13, f30 pin, g config, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        super.bindData(z13, pin, config, pinalytics);
        c.U1(this);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        View.inflate(getContext(), n80.d.pin_closeup_favorite_module, this);
        View findViewById = findViewById(n80.c.note_and_favorite_module_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35003j = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(n80.c.module_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.f35004k = frameLayout;
        if (frameLayout == null) {
            Intrinsics.r("moduleWrapper");
            throw null;
        }
        frameLayout.setBackground(this.f35002i ? null : c.f0(this, r80.b.pin_closeup_redesign_module_background, null, null, 6));
        FrameLayout frameLayout2 = this.f35004k;
        if (frameLayout2 == null) {
            Intrinsics.r("moduleWrapper");
            throw null;
        }
        maybeUpdateLayoutForTabletPortrait(frameLayout2);
        if (hf0.b.q()) {
            ConstraintLayout constraintLayout = this.f35003j;
            if (constraintLayout == null) {
                Intrinsics.r("containerView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = c.W(this, eo1.c.space_400);
            marginLayoutParams.bottomMargin = c.W(this, eo1.c.space_400);
            constraintLayout.setLayoutParams(marginLayoutParams);
        }
        View findViewById3 = findViewById(n80.c.pin_favorite_module_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f35005l = (GestaltText) findViewById3;
        View findViewById4 = findViewById(n80.c.pin_favorite_module_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f35006m = (GestaltIcon) findViewById4;
        View findViewById5 = findViewById(n80.c.pin_favorite_module_icon_touch_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f35007n = (FrameLayout) findViewById5;
        f30 pin = getPin();
        int intValue = (pin != null ? pin.n4() : 0).intValue();
        FrameLayout frameLayout3 = this.f35007n;
        if (frameLayout3 == null) {
            Intrinsics.r("favoriteIconTouchWrapper");
            throw null;
        }
        frameLayout3.setOnClickListener(new l2(this, 25));
        GestaltText gestaltText = this.f35005l;
        if (gestaltText == null) {
            Intrinsics.r("favoriteTitle");
            throw null;
        }
        gestaltText.j(new c1(intValue, this));
        c.X0(this);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final g0 getComponentType() {
        return g0.PIN_CLOSEUP_BOARD_FAVORITE_MODULE;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return c.o1(this);
    }

    @Override // rq.k
    public final void inject() {
        if (this.f34994a) {
            return;
        }
        this.f34994a = true;
        jb jbVar = (jb) ((f1) generatedComponent());
        oa oaVar = jbVar.f113483a;
        this.clickThroughHelperFactory = (a11.d) oaVar.f113668ec.get();
        this.presenterPinalyticsFactory = (e) oaVar.f113702ga.get();
        s8 s8Var = jbVar.f113485c;
        this.closeupActionController = s8Var.h5();
        this.bidiFormatter = a02.e.I1();
        this.baseCloseupLibraryExperiments = s8Var.k5();
        this.pinAuxHelper = (b0) oaVar.R8.get();
        this.f34996c = (x0) oaVar.f113765k3.get();
        this.f34997d = (i2) oaVar.F3.get();
        this.f34998e = (PinService) oaVar.f113713h3.get();
        this.f34999f = (w) oaVar.f113885r0.get();
        this.f35000g = (k) oaVar.f113921t1.get();
        this.f35001h = s8Var.a6();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b bVar;
        b bVar2 = this.f34995b;
        if (bVar2 != null && !bVar2.f135163b && (bVar = this.f34995b) != null) {
            bVar.dispose();
        }
        this.f34995b = null;
        super.onDetachedFromWindow();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldSendPinCardView() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return true;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldUpdateView() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updatePin(com.pinterest.api.model.f30 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean[] r0 = r8.f37485h3
            int r1 = r0.length
            r2 = 0
            r3 = 1
            r4 = 57
            if (r1 <= r4) goto L23
            boolean r0 = r0[r4]
            if (r0 == 0) goto L23
            java.lang.Boolean r0 = r8.o4()
            java.lang.String r1 = "getFavoritedByMe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L23
            r0 = r3
            goto L24
        L23:
            r0 = r2
        L24:
            r7.f35008o = r0
            super.updatePin(r8)
            com.pinterest.api.model.v7 r8 = r8.D3()
            r0 = 0
            if (r8 == 0) goto L7b
            xj2.b r1 = r7.f34995b
            if (r1 != 0) goto L3b
            xj2.b r1 = new xj2.b
            r1.<init>()
            r7.f34995b = r1
        L3b:
            xj2.b r1 = r7.f34995b
            if (r1 == 0) goto L7e
            x02.x0 r4 = r7.f34996c
            if (r4 == 0) goto L75
            java.lang.String r5 = r8.getUid()
            java.lang.String r6 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            jk2.e0 r4 = r4.M(r5)
            ba.s r5 = new ba.s
            r6 = 19
            r5.<init>(r6, r7, r8)
            rq.d1 r8 = new rq.d1
            r8.<init>(r2, r5)
            rq.e1 r2 = new rq.e1
            r5 = 4
            r2.<init>(r5, r7)
            rq.d1 r5 = new rq.d1
            r5.<init>(r3, r2)
            ck2.c r2 = ck2.i.f27923c
            hk2.b r3 = new hk2.b
            r3.<init>(r8, r5, r2)
            r4.f(r3)
            r1.a(r3)
            goto L7e
        L75:
            java.lang.String r8 = "boardRepository"
            kotlin.jvm.internal.Intrinsics.r(r8)
            throw r0
        L7b:
            bs1.c.X0(r7)
        L7e:
            boolean r8 = r7.shouldRenderLandscapeConfiguration()
            if (r8 == 0) goto Lc9
            int r8 = eo1.c.space_600
            int r8 = bs1.c.W(r7, r8)
            android.widget.FrameLayout r1 = r7.f35007n
            if (r1 == 0) goto Lc3
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r2 == 0) goto Lbd
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.setMarginEnd(r8)
            r1.setLayoutParams(r2)
            com.pinterest.gestalt.text.GestaltText r1 = r7.f35005l
            if (r1 == 0) goto Lb7
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto Lb1
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.setMarginStart(r8)
            r1.setLayoutParams(r0)
            goto Lc9
        Lb1:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r3)
            throw r8
        Lb7:
            java.lang.String r8 = "favoriteTitle"
            kotlin.jvm.internal.Intrinsics.r(r8)
            throw r0
        Lbd:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r3)
            throw r8
        Lc3:
            java.lang.String r8 = "favoriteIconTouchWrapper"
            kotlin.jvm.internal.Intrinsics.r(r8)
            throw r0
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule.updatePin(com.pinterest.api.model.f30):void");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        String string;
        super.updateView();
        GestaltText gestaltText = this.f35005l;
        if (gestaltText == null) {
            Intrinsics.r("favoriteTitle");
            throw null;
        }
        f30 pin = getPin();
        int intValue = (pin != null ? pin.n4() : 0).intValue();
        f30 pin2 = getPin();
        boolean d2 = pin2 != null ? Intrinsics.d(pin2.o4(), Boolean.TRUE) : false;
        if (d2 && intValue == 1) {
            string = getResources().getString(f.added_to_favorites);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else if (d2 && intValue > 1) {
            int i13 = intValue - 1;
            string = getResources().getQuantityString(n80.e.added_to_favorites_by_you_and_others, i13, Integer.valueOf(i13));
            Intrinsics.checkNotNullExpressionValue(string, "getQuantityString(...)");
        } else if (d2 || intValue <= 0) {
            string = getResources().getString(f.add_to_favorites);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = getResources().getQuantityString(n80.e.added_to_favorites_by_others, intValue, Integer.valueOf(intValue));
            Intrinsics.checkNotNullExpressionValue(string, "getQuantityString(...)");
        }
        a0.p(gestaltText, string);
        GestaltIcon gestaltIcon = this.f35006m;
        if (gestaltIcon != null) {
            dl2.b.z(gestaltIcon, new e1(6, this));
        } else {
            Intrinsics.r("favoriteIcon");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean useAutoVisibility() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupFavoriteModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        d dVar = this.f35001h;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        this.f35002i = dVar.b();
        this.f35009p = true;
        this.f35011r = new qc2.d();
    }

    public /* synthetic */ PinCloseupFavoriteModule(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }
}
