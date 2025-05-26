package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.LinearLayout;
import b60.b;
import ba.s;
import bs1.c;
import c0.d;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.r40;
import com.pinterest.feature.pin.reactions.view.PinReactionIconButton;
import com.pinterest.feature.sharesheet.view.AnimatedSendShareButton;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import es.a;
import h32.u0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.j0;
import lh0.c0;
import m60.w;
import m60.x0;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import pb0.g;
import pk.a0;
import rl2.g0;
import rq.j;
import rq.n1;
import rq.o;
import rq.o1;
import rq.p1;
import t10.f;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/activity/pin/view/modules/PinCloseupLegoActionButtonModule;", "Lcom/pinterest/activity/pin/view/modules/PinCloseupBaseModule;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "closeupLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PinCloseupLegoActionButtonModule extends j {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public String B;
    public final o1 C;
    public final n1 D;
    public long E;
    public final p1 F;

    /* renamed from: c, reason: collision with root package name */
    public a f35012c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f35013d;

    /* renamed from: e, reason: collision with root package name */
    public w f35014e;

    /* renamed from: f, reason: collision with root package name */
    public wk2.a f35015f;

    /* renamed from: g, reason: collision with root package name */
    public b f35016g;

    /* renamed from: h, reason: collision with root package name */
    public LinearLayout f35017h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltButton f35018i;

    /* renamed from: j, reason: collision with root package name */
    public GestaltButton f35019j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltButton f35020k;

    /* renamed from: l, reason: collision with root package name */
    public GestaltIconButton f35021l;

    /* renamed from: m, reason: collision with root package name */
    public GestaltIconButton f35022m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f35023n;

    /* renamed from: o, reason: collision with root package name */
    public ViewStub f35024o;

    /* renamed from: p, reason: collision with root package name */
    public PinReactionIconButton f35025p;

    /* renamed from: q, reason: collision with root package name */
    public GestaltText f35026q;

    /* renamed from: r, reason: collision with root package name */
    public AnimatedSendShareButton f35027r;

    /* renamed from: s, reason: collision with root package name */
    public AnimatedSendShareButton f35028s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f35029t;

    /* renamed from: u, reason: collision with root package name */
    public String f35030u;

    /* renamed from: v, reason: collision with root package name */
    public String f35031v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35032w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35033x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f35034y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f35035z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupLegoActionButtonModule(Context context) {
        super(context, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35029t = true;
        this.C = new o1(this);
        this.D = new n1(this);
        this.F = new p1(this);
    }

    public static boolean g(f30 f30Var) {
        return b40.c(f30Var) || (b40.b(f30Var) && !b40.P0(f30Var));
    }

    public final w b() {
        w wVar = this.f35014e;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d0  */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void createView() {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule.createView():void");
    }

    public final void e() {
        f30 pin = getPin();
        if (pin != null && Intrinsics.d(pin.T5(), Boolean.TRUE)) {
            GestaltButton gestaltButton = this.f35018i;
            if (gestaltButton != null) {
                a0.l0(gestaltButton);
                return;
            }
            return;
        }
        f30 pin2 = getPin();
        if (pin2 == null || !g0.U(pin2)) {
            GestaltButton gestaltButton2 = this.f35018i;
            if (gestaltButton2 != null) {
                gestaltButton2.d(o.C);
                return;
            }
            return;
        }
        GestaltButton gestaltButton3 = this.f35018i;
        if (gestaltButton3 != null) {
            gestaltButton3.d(o.B);
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_ACTION;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    public final boolean i() {
        f30 pin;
        boolean z13 = (getPin() == null || (pin = getPin()) == null || !Intrinsics.d(pin.d5(), Boolean.FALSE)) ? false : true;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ig1.b.e1(c.k0(context)) && z13;
    }

    public final void j() {
        f30 pin = getPin();
        if (pin == null) {
            return;
        }
        d0 viewPinalytics = getViewPinalytics();
        if (viewPinalytics != null) {
            viewPinalytics.f0(u0.WEBSITE_BUTTON, h32.g0.MODAL_PIN, pin.getId(), getPinAuxHelper().m(pin), false);
        }
        wk2.a aVar = this.f35015f;
        if (aVar == null) {
            Intrinsics.r("clock");
            throw null;
        }
        this.E = ((g) ((pb0.a) aVar.get())).a();
        PinCloseupBaseModule.handleWebsiteClicked$default(this, this.f35031v, null, null, 6, null);
    }

    public final void k(String str) {
        this.f35030u = str;
    }

    public final void l(String str) {
        this.B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0054, code lost:
    
        if (dl2.b.O1(r0, false) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.pinterest.api.model.f30 r7) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L5
            return
        L5:
            com.pinterest.gestalt.iconbutton.GestaltIconButton r0 = r6.f35022m
            if (r0 != 0) goto La
            return
        La:
            com.pinterest.gestalt.iconbutton.GestaltIconButton r0 = r6.f35021l
            if (r0 == 0) goto L11
            com.bumptech.glide.c.d0(r0)
        L11:
            boolean r0 = r6.f35029t
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L60
            java.lang.Boolean r0 = r7.G4()
            java.lang.String r3 = "getIsEligibleForAggregatedComments(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L60
            boolean r0 = r6.f35033x
            if (r0 != 0) goto L60
            b60.b r0 = r6.f35016g
            java.lang.String r3 = "activeUserManager"
            if (r0 == 0) goto L5c
            b60.d r0 = (b60.d) r0
            com.pinterest.api.model.wy0 r0 = r0.f()
            if (r0 == 0) goto L44
            java.lang.Boolean r0 = r0.G3()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r4)
            if (r0 != 0) goto L56
        L44:
            b60.b r0 = r6.f35016g
            if (r0 == 0) goto L58
            b60.d r0 = (b60.d) r0
            com.pinterest.api.model.wy0 r0 = r0.f()
            if (r0 == 0) goto L60
            boolean r0 = dl2.b.O1(r0, r1)
            if (r0 != 0) goto L60
        L56:
            r0 = 1
            goto L61
        L58:
            kotlin.jvm.internal.Intrinsics.r(r3)
            throw r2
        L5c:
            kotlin.jvm.internal.Intrinsics.r(r3)
            throw r2
        L60:
            r0 = r1
        L61:
            com.pinterest.gestalt.iconbutton.GestaltIconButton r3 = r6.f35022m
            if (r3 == 0) goto L77
            cp.t r4 = new cp.t
            r5 = 3
            r4.<init>(r0, r5)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r0 = r3.t(r4)
            rq.m1 r4 = new rq.m1
            r4.<init>(r7, r6, r3, r1)
            r0.u(r4)
        L77:
            android.widget.LinearLayout r7 = r6.f35017h
            if (r7 == 0) goto Lb5
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            kotlin.jvm.internal.Intrinsics.g(r7, r0)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r7 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r7
            int r7 = r7.f17691t
            r0 = -1
            if (r7 == r0) goto Lb4
            com.pinterest.feature.sharesheet.view.AnimatedSendShareButton r7 = r6.f35027r
            if (r7 == 0) goto Lae
            r0 = 8
            r7.setVisibility(r0)
            com.pinterest.feature.sharesheet.view.AnimatedSendShareButton r7 = r6.f35028s
            if (r7 != 0) goto L99
            goto L9c
        L99:
            r7.setVisibility(r1)
        L9c:
            com.pinterest.feature.sharesheet.view.AnimatedSendShareButton r7 = r6.f35028s
            kotlin.jvm.internal.Intrinsics.f(r7)
            r6.f35027r = r7
            a.l2 r0 = new a.l2
            r1 = 26
            r0.<init>(r6, r1)
            r7.setOnClickListener(r0)
            goto Lb4
        Lae:
            java.lang.String r7 = "sendIconButton"
            kotlin.jvm.internal.Intrinsics.r(r7)
            throw r2
        Lb4:
            return
        Lb5:
            java.lang.String r7 = "actionButtonCenterLayout"
            kotlin.jvm.internal.Intrinsics.r(r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule.m(com.pinterest.api.model.f30):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r5 = this;
            r0 = 1
            r5.f35034y = r0
            com.pinterest.api.model.f30 r1 = r5.getPin()
            if (r1 == 0) goto L57
            boolean r1 = com.pinterest.api.model.b40.H0(r1)
            if (r1 != r0) goto L57
            boolean r0 = r5.f35034y
            if (r0 == 0) goto L57
            boolean r0 = r5.f35032w
            if (r0 == 0) goto L57
            lh0.c0 r0 = r5.f35013d
            r1 = 0
            if (r0 == 0) goto L51
            lh0.z3 r2 = lh0.a4.f83297a
            java.lang.String r3 = "group"
            java.lang.String r4 = "enabled"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "activate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            lh0.z0 r0 = r0.f83311a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r3 = "android_closeup_button_consistency_video_pin"
            boolean r0 = r0.k(r3, r4, r2)
            if (r0 != 0) goto L57
            com.pinterest.gestalt.button.view.GestaltButton r0 = r5.f35019j
            if (r0 == 0) goto L3d
            pk.a0.l0(r0)
        L3d:
            java.util.ArrayList r0 = r5.f35035z
            if (r0 == 0) goto L4b
            int r1 = le0.d.menu_clickthrough
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L6a
        L4b:
            java.lang.String r0 = "additionalOverflow"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        L51:
            java.lang.String r0 = "experiments"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        L57:
            com.pinterest.gestalt.button.view.GestaltButton r0 = r5.f35019j
            if (r0 == 0) goto L6a
            com.pinterest.gestalt.button.view.GestaltButton r0 = pk.a0.v1(r0)
            if (r0 == 0) goto L6a
            rq.l1 r1 = new rq.l1
            r2 = 2
            r1.<init>(r5, r2)
            r0.e(r1)
        L6a:
            com.pinterest.gestalt.button.view.GestaltButton r0 = r5.f35020k
            if (r0 == 0) goto L71
            pk.a0.l0(r0)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule.n():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b().h(this.C);
        b().h(this.F);
        b().h(this.D);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b().j(this.C);
        b().j(this.F);
        b().j(this.D);
        super.onDetachedFromWindow();
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
    public final void updatePin(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f35031v = com.bumptech.glide.c.D(pin);
        super.updatePin(pin);
        boolean z13 = false;
        if (b40.P0(pin)) {
            this.A = false;
        }
        this.f35033x = g(pin) && !i();
        if (g(pin) && !i()) {
            z13 = true;
        }
        this.f35033x = z13;
        if (this.f35025p == null) {
            ViewStub viewStub = this.f35024o;
            PinReactionIconButton pinReactionIconButton = (PinReactionIconButton) (viewStub != null ? viewStub.inflate() : null);
            this.f35025p = pinReactionIconButton;
            if (pinReactionIconButton != null) {
                pinReactionIconButton.f47282a = true;
            }
        }
        PinReactionIconButton pinReactionIconButton2 = this.f35025p;
        if (pinReactionIconButton2 != null) {
            c.R1(pinReactionIconButton2, this.f35033x);
        }
        c.R1(this.f35023n, this.f35033x);
        PinReactionIconButton pinReactionIconButton3 = this.f35025p;
        if (pinReactionIconButton3 != null) {
            String id3 = pin.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            pinReactionIconButton3.k2(id3);
        }
        GestaltText gestaltText = this.f35026q;
        if (gestaltText != null) {
            a0.k0(gestaltText);
        }
        AnimatedSendShareButton animatedSendShareButton = this.f35027r;
        if (animatedSendShareButton == null) {
            Intrinsics.r("sendIconButton");
            throw null;
        }
        c.R1(animatedSendShareButton, !this.f35033x);
        m(pin);
        if (this.f35033x) {
            this.f35032w = true;
            AnimatedSendShareButton animatedSendShareButton2 = this.f35027r;
            if (animatedSendShareButton2 == null) {
                Intrinsics.r("sendIconButton");
                throw null;
            }
            c.U1(animatedSendShareButton2);
            ArrayList arrayList = this.f35035z;
            if (arrayList == null) {
                Intrinsics.r("additionalOverflow");
                throw null;
            }
            arrayList.remove(Integer.valueOf(zy1.a.menu_send));
        } else {
            Boolean T5 = pin.T5();
            Intrinsics.checkNotNullExpressionValue(T5, "getPromotedIsRemovable(...)");
            if (T5.booleanValue()) {
                AnimatedSendShareButton animatedSendShareButton3 = this.f35027r;
                if (animatedSendShareButton3 == null) {
                    Intrinsics.r("sendIconButton");
                    throw null;
                }
                c.X0(animatedSendShareButton3);
            }
        }
        n();
        e();
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        f30 pin;
        f30 pin2;
        super.updateView();
        f30 pin3 = getPin();
        String h43 = pin3 != null ? pin3.h4() : null;
        h0 h0Var = new h0();
        h0Var.f80426a = x0.pin_action_uploaded;
        j0 j0Var = new j0();
        if (j1.d1(h43) && (pin = getPin()) != null && !c.h1(pin) && (pin2 = getPin()) != null) {
            a aVar = this.f35012c;
            if (aVar == null) {
                Intrinsics.r("adFormats");
                throw null;
            }
            if (!d.c2(pin2, aVar)) {
                h0Var.f80426a = x0.pin_action_default;
            }
        }
        if (getPinMetadata() != null) {
            if (getPinMetadata() instanceof f) {
                r40 pinMetadata = getPinMetadata();
                Intrinsics.g(pinMetadata, "null cannot be cast to non-null type com.pinterest.api.model.metadata.recipe.Recipe");
                if (!((f) pinMetadata).f115777i) {
                    h0Var.f80426a = x0.pin_action_recipe;
                }
            }
            if (getPinMetadata() instanceof r10.a) {
                h0Var.f80426a = x0.pin_action_article;
            }
        }
        if (b40.q0(getPin())) {
            h0Var.f80426a = x0.pin_action_install;
        }
        f30 pin4 = getPin();
        if (pin4 != null) {
            a aVar2 = this.f35012c;
            if (aVar2 == null) {
                Intrinsics.r("adFormats");
                throw null;
            }
            if (((es.c) aVar2).C(pin4)) {
                a aVar3 = this.f35012c;
                if (aVar3 == null) {
                    Intrinsics.r("adFormats");
                    throw null;
                }
                String h10 = ((es.c) aVar3).h(getPin());
                if (h10 == null || h10.length() == 0) {
                    h0Var.f80426a = x0.open_app;
                } else {
                    h0Var.f80426a = 0;
                    j0Var.f80434a = h10;
                }
            }
        }
        GestaltButton gestaltButton = this.f35019j;
        if (gestaltButton != null) {
            gestaltButton.d(new s(20, j0Var, h0Var));
        }
        n();
        e();
        f30 pin5 = getPin();
        if (pin5 != null) {
            m(pin5);
        }
        if (this.A) {
            GestaltIconButton gestaltIconButton = this.f35021l;
            if (gestaltIconButton != null) {
                com.bumptech.glide.c.u1(gestaltIconButton);
                return;
            }
            return;
        }
        GestaltIconButton gestaltIconButton2 = this.f35021l;
        if (gestaltIconButton2 != null) {
            com.bumptech.glide.c.d0(gestaltIconButton2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupLegoActionButtonModule(Context context, boolean z13) {
        super(context, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35029t = true;
        this.C = new o1(this);
        this.D = new n1(this);
        this.F = new p1(this);
        this.A = true ^ z13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupLegoActionButtonModule(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f35029t = true;
        this.C = new o1(this);
        this.D = new n1(this);
        this.F = new p1(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinCloseupLegoActionButtonModule(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f35029t = true;
        this.C = new o1(this);
        this.D = new n1(this);
        this.F = new p1(this);
    }
}
