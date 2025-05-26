package rq;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.activity.pin.view.modules.PinCloseupBaseModule;
import com.pinterest.activity.pin.view.modules.util.AvatarWithTitleAndSubtitleView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.following.view.lego.CreatorFollowButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.NavigationImpl;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r3 extends j implements i01.c0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f109509t = 0;

    /* renamed from: c, reason: collision with root package name */
    public zf0.f f109510c;

    /* renamed from: d, reason: collision with root package name */
    public x02.x2 f109511d;

    /* renamed from: e, reason: collision with root package name */
    public m60.w f109512e;

    /* renamed from: f, reason: collision with root package name */
    public lh0.a0 f109513f;

    /* renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f109514g;

    /* renamed from: h, reason: collision with root package name */
    public final AvatarWithTitleAndSubtitleView f109515h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltText f109516i;

    /* renamed from: j, reason: collision with root package name */
    public CreatorFollowButton f109517j;

    /* renamed from: k, reason: collision with root package name */
    public String f109518k;

    /* renamed from: l, reason: collision with root package name */
    public m3 f109519l;

    /* renamed from: m, reason: collision with root package name */
    public xj2.b f109520m;

    /* renamed from: n, reason: collision with root package name */
    public wy0 f109521n;

    /* renamed from: o, reason: collision with root package name */
    public final m3 f109522o;

    /* renamed from: p, reason: collision with root package name */
    public final int f109523p;

    /* renamed from: q, reason: collision with root package name */
    public int f109524q;

    /* renamed from: r, reason: collision with root package name */
    public final p3 f109525r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f109526s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(Context context) {
        super(context, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109522o = new m3(this, 0);
        this.f109523p = n80.f.link_module_title_default_lego;
        this.f109524q = wy1.f.promoted_by;
        this.f109525r = new p3(context, this);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        constraintLayout.setId(View.generateViewId());
        this.f109514g = constraintLayout;
        AvatarWithTitleAndSubtitleView avatarWithTitleAndSubtitleView = new AvatarWithTitleAndSubtitleView(context, null, 0, 14);
        avatarWithTitleAndSubtitleView.setId(n80.c.pin_closeup_avatar_with_right_text);
        avatarWithTitleAndSubtitleView.setBackgroundResource(bo1.a.touch_clear_bg);
        vn1.c color = vn1.c.DEFAULT;
        Intrinsics.checkNotNullParameter(color, "color");
        avatarWithTitleAndSubtitleView.f35045f.i(new sp.a(2, color));
        Intrinsics.checkNotNullParameter(color, "color");
        avatarWithTitleAndSubtitleView.f35046g.i(new sp.a(1, color));
        this.f109515h = avatarWithTitleAndSubtitleView;
        this.f109526s = xk2.m.b(new zp.j0(5, context, this));
    }

    public final boolean b() {
        f30 pin = getPin();
        if (pin != null) {
            return Intrinsics.d(pin.d5(), Boolean.TRUE);
        }
        return false;
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        setId(n80.c.pin_closeup_source_attribution_pinner_avatar);
        Rect paddingRect = getPaddingRect();
        paddingRect.bottom = bs1.c.W(this, n80.a.lego_closeup_module_bottom_padding);
        paddingRect.top = bs1.c.W(this, n80.a.lego_closeup_avatar_module_top_padding);
        updateHorizontalPadding();
        k(null);
        AvatarWithTitleAndSubtitleView avatarWithTitleAndSubtitleView = this.f109515h;
        m3 clickListener = this.f109522o;
        avatarWithTitleAndSubtitleView.getClass();
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        avatarWithTitleAndSubtitleView.f35043d.setOnClickListener(clickListener);
        if (b()) {
            avatarWithTitleAndSubtitleView.setOnClickListener(clickListener);
            avatarWithTitleAndSubtitleView.f35045f.j(new xo.k(this, 12));
        }
        this.f109519l = new m3(this, 1);
        ConstraintLayout constraintLayout = this.f109514g;
        constraintLayout.addView(avatarWithTitleAndSubtitleView, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        l();
        addView(constraintLayout);
    }

    public final void e(String str) {
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

    public final void g() {
        wy0 wy0Var = this.f109521n;
        if (wy0Var == null) {
            f30 pin = getPin();
            wy0Var = pin != null ? pin.C5() : null;
            if (wy0Var == null) {
                f30 pin2 = getPin();
                wy0Var = pin2 != null ? pin2.I5() : null;
                if (wy0Var == null) {
                    return;
                }
            }
        }
        nx.d0 viewPinalytics = getViewPinalytics();
        if (viewPinalytics != null) {
            viewPinalytics.b0(h32.u0.PIN_USER, h32.g0.CLOSEUP_LINK_MODULE, wy0Var.getUid(), false);
        }
        String uid = wy0Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        e(uid);
        NavigationImpl x13 = pe.i.x1(getPin(), wy0Var, r41.b.PinCloseupSourceWithAvatarModule);
        if (x13 != null) {
            m60.w wVar = this.f109512e;
            if (wVar != null) {
                wVar.d(x13);
            } else {
                Intrinsics.r("eventManager");
                throw null;
            }
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final h32.g0 getComponentType() {
        return h32.g0.PIN_CLOSEUP_LINK;
    }

    @Override // rq.j, com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean hasContent() {
        return true;
    }

    public final void i() {
        wy0 wy0Var = this.f109521n;
        if (wy0Var == null) {
            return;
        }
        nx.d0 viewPinalytics = getViewPinalytics();
        if (viewPinalytics != null) {
            viewPinalytics.b0(h32.u0.PIN_LINK_MODULE_DOMAIN_OWNER_PROFILE, h32.g0.MODAL_PIN, wy0Var.getUid(), false);
        }
        String uid = wy0Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        e(uid);
        NavigationImpl x13 = pe.i.x1(getPin(), wy0Var, r41.b.PinCloseupSourceWithAvatarModule);
        if (x13 != null) {
            m60.w wVar = this.f109512e;
            if (wVar != null) {
                wVar.d(x13);
            } else {
                Intrinsics.r("eventManager");
                throw null;
            }
        }
    }

    public final void j() {
        f30 pin = getPin();
        if (pin != null) {
            nx.d0 viewPinalytics = getViewPinalytics();
            if (viewPinalytics != null) {
                viewPinalytics.f0(h32.u0.WEBSITE_BUTTON, h32.g0.MODAL_PIN, pin.getUid(), getPinAuxHelper().m(pin), false);
            }
            if (pin.U4().booleanValue()) {
                return;
            }
            PinCloseupBaseModule.handleWebsiteClicked$default(this, this.f109518k, null, null, 6, null);
        }
    }

    public final void k(wy0 wy0Var) {
        boolean n13 = hf0.b.n();
        AvatarWithTitleAndSubtitleView avatarWithTitleAndSubtitleView = this.f109515h;
        if (wy0Var == null) {
            avatarWithTitleAndSubtitleView.setGravity(n13 ? 8388611 : 1);
            bs1.c.R1(avatarWithTitleAndSubtitleView.f35043d, false);
        } else {
            avatarWithTitleAndSubtitleView.setGravity(8388611);
            avatarWithTitleAndSubtitleView.b(wy0Var);
            bs1.c.R1(avatarWithTitleAndSubtitleView.f35043d, true);
        }
    }

    public final void l() {
        f30 pin;
        wy0 wy0Var = this.f109521n;
        if (wy0Var != null && (pin = getPin()) != null && sq.i.c(pin, wy0Var.getUid()) && this.f109517j == null) {
            setOrientation(0);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rk1.f fVar = rk1.f.Small;
            nk1.g gVar = new nk1.g(null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
            gVar.f91127a = getViewPinalytics();
            HashMap hashMap = new HashMap();
            f30 pin2 = getPin();
            if (pin2 != null) {
                hashMap.put("pin_id", pin2.getUid());
                String z43 = pin2.z4();
                if (z43 != null && !kotlin.text.z.j(z43)) {
                    hashMap.put("image_signature", z43);
                }
            }
            gVar.f91130d = hashMap;
            Unit unit = Unit.f80348a;
            CreatorFollowButton creatorFollowButton = new CreatorFollowButton(context, fVar, gVar, new zp.j0(6, this, wy0Var), 4);
            nk1.h followState = nk1.h.NOT_FOLLOWING;
            yl1.g colorPalette = yl1.d.SECONDARY.getColorPalette();
            Intrinsics.checkNotNullParameter(followState, "followState");
            Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
            int i13 = rk1.c.f108483a[followState.ordinal()];
            if (i13 == 1) {
                creatorFollowButton.f49063e = yl1.b.f(creatorFollowButton.f49063e, null, false, null, null, colorPalette, null, null, null, 0, null, 1007);
            } else if (i13 == 2) {
                creatorFollowButton.f49061c = yl1.b.f(creatorFollowButton.f49061c, null, false, null, null, colorPalette, null, null, null, 0, null, 1007);
            } else if (i13 == 3) {
                creatorFollowButton.f49062d = yl1.b.f(creatorFollowButton.f49062d, null, false, null, null, colorPalette, null, null, null, 0, null, 1007);
            }
            CreatorFollowButton.f(creatorFollowButton, wy0Var);
            creatorFollowButton.setId(m60.t0.closeup_source_follow_button);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(bs1.c.W(this, eo1.c.space_100));
            layoutParams.f17693v = 0;
            ConstraintLayout constraintLayout = this.f109514g;
            constraintLayout.addView(creatorFollowButton, layoutParams);
            androidx.constraintlayout.widget.p pVar = new androidx.constraintlayout.widget.p();
            pVar.j(constraintLayout);
            AvatarWithTitleAndSubtitleView avatarWithTitleAndSubtitleView = this.f109515h;
            pVar.o(avatarWithTitleAndSubtitleView.getId(), 0);
            pVar.m(avatarWithTitleAndSubtitleView.getId(), 6, constraintLayout.getId(), 6, 0);
            pVar.m(avatarWithTitleAndSubtitleView.getId(), 7, creatorFollowButton.getId(), 6, 0);
            pVar.b(constraintLayout);
            this.f109517j = creatorFollowButton;
        }
    }

    public final void m(wy0 wy0Var) {
        CreatorFollowButton creatorFollowButton = this.f109517j;
        if (creatorFollowButton != null) {
            CreatorFollowButton.f(creatorFollowButton, wy0Var);
        }
        if (this.f109521n != null) {
            o(wy0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0040, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.r3.n(java.lang.String):void");
    }

    public final void o(wy0 wy0Var) {
        wy0 I5;
        f30 pin = getPin();
        String Z2 = (pin == null || (I5 = pin.I5()) == null) ? null : I5.Z2();
        boolean b13 = b();
        AvatarWithTitleAndSubtitleView avatarWithTitleAndSubtitleView = this.f109515h;
        if (b13 && Z2 != null && Z2.length() != 0) {
            avatarWithTitleAndSubtitleView.a(Z2);
            return;
        }
        Integer V2 = wy0Var != null ? wy0Var.V2() : null;
        int intValue = V2 == null ? 0 : V2.intValue();
        String quantityString = intValue > 0 ? getResources().getQuantityString(m60.w0.follower_count, intValue, qb0.j.b(intValue)) : "";
        Intrinsics.f(quantityString);
        String a13 = qb0.j.a(quantityString);
        avatarWithTitleAndSubtitleView.a(quantityString);
        avatarWithTitleAndSubtitleView.setContentDescription((wy0Var != null ? wy0Var.Z2() : null) + a13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m60.w wVar = this.f109512e;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.h(this.f109525r);
        if (this.f109520m == null) {
            this.f109520m = new xj2.b();
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m60.w wVar = this.f109512e;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f109525r);
        xj2.b bVar = this.f109520m;
        if (bVar != null) {
            bVar.dispose();
            this.f109520m = null;
        }
        super.onDetachedFromWindow();
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
        f30 pin = getPin();
        this.f109518k = pin != null ? com.bumptech.glide.c.D(pin) : null;
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
        n(h43);
    }
}
