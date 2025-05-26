package rq;

import android.content.Context;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v0 extends l implements b82.l {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f109582x = 0;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.z f109583c;

    /* renamed from: d, reason: collision with root package name */
    public final f30 f109584d;

    /* renamed from: e, reason: collision with root package name */
    public final String f109585e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f109586f;

    /* renamed from: g, reason: collision with root package name */
    public final x02.i2 f109587g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.d0 f109588h;

    /* renamed from: i, reason: collision with root package name */
    public m60.w f109589i;

    /* renamed from: j, reason: collision with root package name */
    public lh0.a0 f109590j;

    /* renamed from: k, reason: collision with root package name */
    public lh0.z0 f109591k;

    /* renamed from: l, reason: collision with root package name */
    public gs0.k f109592l;

    /* renamed from: m, reason: collision with root package name */
    public yb2.c f109593m;

    /* renamed from: n, reason: collision with root package name */
    public hs.d f109594n;

    /* renamed from: o, reason: collision with root package name */
    public es.a f109595o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f109596p;

    /* renamed from: q, reason: collision with root package name */
    public pq.d f109597q;

    /* renamed from: r, reason: collision with root package name */
    public s71.l f109598r;

    /* renamed from: s, reason: collision with root package name */
    public b82.k f109599s;

    /* renamed from: t, reason: collision with root package name */
    public ek2.j f109600t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f109601u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f109602v;

    /* renamed from: w, reason: collision with root package name */
    public final xj2.b f109603w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, androidx.lifecycle.z lifecycleOwner, f30 f30Var, String navigationSource, boolean z13, x02.i2 pinRepository, nx.d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        inject();
        this.f109583c = lifecycleOwner;
        this.f109584d = f30Var;
        this.f109585e = navigationSource;
        this.f109586f = z13;
        this.f109587g = pinRepository;
        this.f109588h = pinalytics;
        hs.d dVar = this.f109594n;
        if (dVar == null) {
            Intrinsics.r("moduleViewabilityHelper");
            throw null;
        }
        this.f109596p = dVar.a();
        es.a aVar = this.f109595o;
        if (aVar == null) {
            Intrinsics.r("adFormats");
            throw null;
        }
        this.f109601u = ((es.c) aVar).x(f30Var);
        this.f109602v = new HashMap();
        this.f109603w = new xj2.b();
    }

    public static s71.l e(v0 v0Var, int i13, String str, s71.a aVar, Integer num, s71.v vVar, Function0 function0, int i14) {
        Integer num2 = (i14 & 8) != 0 ? null : num;
        s71.v vVar2 = (i14 & 16) != 0 ? null : vVar;
        Context context = v0Var.getContext();
        s71.b bVar = s71.b.LEFT;
        int W = bs1.c.W(v0Var, eo1.c.space_100);
        int W2 = bs1.c.W(v0Var, eo1.c.space_100);
        rm1.q qVar = rm1.q.COLLAGE;
        rm1.i iVar = rm1.i.XL;
        Intrinsics.f(context);
        s71.l lVar = new s71.l(context, bVar, false, null, W2, W, false, 0L, 0, qVar, iVar, vVar2, num2, true, false, false, false, null, false, null, 16519064);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, bs1.c.W(lVar, sm1.a.button_size_lg), 8388691);
        int i15 = 0;
        layoutParams.setMargins(bs1.c.W(lVar, eo1.c.space_200), 0, 0, bs1.c.W(lVar, eo1.c.space_400));
        lVar.setLayoutParams(layoutParams);
        lVar.setId(i13);
        lVar.setContentDescription(str);
        s71.a aVar2 = s71.a.COLLAPSE;
        if (aVar == aVar2) {
            lVar.g(str, true);
            s71.l.a(lVar, aVar2, 0L, 14);
        } else {
            lVar.g(str, false);
            s71.l.a(lVar, s71.a.EXPAND, 0L, 8);
        }
        lVar.setOnClickListener(new t0(i15, function0));
        return lVar;
    }

    public final void b(f30 f30Var, String str, String str2, String str3) {
        np0.g closeupActionController = getCloseupActionController();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String D = com.bumptech.glide.c.D(f30Var);
        h32.c1 B = kh2.g3.B(str2, str3, str);
        boolean z13 = this.f109601u;
        if (!z13) {
            B = null;
        }
        h32.c1 c1Var = B;
        Boolean bool = Boolean.FALSE;
        HashMap hashMap = this.f109602v;
        closeupActionController.a(context, f30Var, D, "pin", this.f109588h, null, this.f109603w, c1Var, bool, hashMap, z13);
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void createView() {
        boolean z13 = this.f109596p;
        if (!z13) {
            int W = bs1.c.W(this, eo1.c.space_100);
            setPaddingRelative(W, getPaddingTop(), W, getPaddingBottom());
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int E = com.bumptech.glide.c.E(this);
        b82.k kVar = new b82.k(context, this.f109583c, this.f109584d, E, this.f109588h, this);
        setUpGradientAndMaybeCreateOverflowButton$closeup_release(kVar, true, true, this.f109596p, this.f109601u);
        addView(kVar);
        f30 f30Var = this.f109584d;
        if (f30Var != null && b40.b1(f30Var)) {
            s71.l e13 = e(this, m60.t0.shuffles_closeup_button, bs1.c.f2(this, n80.f.shuffles_closeup_made_with_shuffles), s71.a.COLLAPSE, Integer.valueOf(n80.b.ic_shuffles_with_bg), null, new db.m(this, 13), 16);
            kVar.addView(e13);
            this.f109598r = e13;
        }
        m60.w wVar = this.f109589i;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        h32.g0 g0Var = h32.g0.PIN_CLOSEUP_IMAGE;
        Context context2 = getContext();
        lh0.a0 a0Var = this.f109590j;
        if (a0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        boolean S = a0Var.S();
        Intrinsics.f(context2);
        pq.d dVar = new pq.d(wVar, this.f109588h, g0Var, true, S, false, false, context2, 864);
        kVar.addView(dVar);
        this.f109597q = dVar;
        this.f109599s = kVar;
        if (!z13) {
            kVar.setBackground(sq.i.a(bs1.c.H1(kVar, eo1.a.comp_iconbutton_xl_rounding)));
            kVar.setClipToOutline(true);
        }
        ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        setGravity(1);
        kVar.setLayoutParams(layoutParams);
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

    @Override // jq.a
    public final void openPinOverflowMenuModal(boolean z13) {
        if (b40.L0(getPin())) {
            lh0.z0 z0Var = this.f109591k;
            if (z0Var == null) {
                Intrinsics.r("experimentsActivator");
                throw null;
            }
            ((lh0.g1) z0Var).d("android_pin_overflow_show_remix_item");
        }
        gs0.k kVar = this.f109592l;
        if (kVar != null) {
            r1.openPinOverflowMenuModal$closeup_release$default(this, kVar, this.f109585e, this.f109586f, null, false, 24, null);
        } else {
            Intrinsics.r("pinOverflowMenuModalProvider");
            throw null;
        }
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final boolean shouldShowForPin() {
        return b40.O0(getPin()) || this.f109601u;
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
        b82.k kVar = this.f109599s;
        if (kVar != null) {
            int b03 = c0.d.b0(kVar.f22217y, i13);
            TextureView k13 = kVar.f22214v.k();
            ViewGroup.LayoutParams layoutParams = k13.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i13;
            layoutParams.width = b03;
            k13.setLayoutParams(layoutParams);
            ImageView imageView = kVar.f22213u;
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = i13;
            layoutParams2.width = b03;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updatePin(com.pinterest.api.model.f30 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            super.updatePin(r12)
            boolean r0 = com.pinterest.api.model.b40.b1(r12)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L20
            com.pinterest.api.model.fi0 r0 = r12.r6()
            if (r0 == 0) goto L1b
            com.pinterest.api.model.fi0 r0 = r0.O()
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto L20
            r0 = r1
            goto L21
        L20:
            r0 = 0
        L21:
            b82.k r3 = r11.f109599s
            if (r3 == 0) goto L28
            r3.k(r12)
        L28:
            pq.d r3 = r11.f109597q
            if (r3 == 0) goto L34
            zp.v0 r4 = new zp.v0
            r4.<init>(r1, r12, r0)
            r3.a(r4)
        L34:
            if (r0 == 0) goto Laf
            s71.l r0 = r11.f109598r
            if (r0 != 0) goto Laf
            com.pinterest.api.model.fi0 r12 = r12.r6()
            if (r12 == 0) goto Laf
            com.pinterest.api.model.fi0 r12 = r12.O()
            if (r12 == 0) goto Laf
            com.pinterest.api.model.wy0 r0 = r12.S()
            if (r0 == 0) goto L50
            java.lang.String r2 = r0.Z2()
        L50:
            java.lang.String r0 = ""
            if (r2 != 0) goto L55
            r2 = r0
        L55:
            as1.b r1 = as1.b.a()
            java.lang.String r3 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r3)
            java.lang.String r3 = "resolutionProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = r1.c()
            java.lang.String r1 = r1.f()
            com.pinterest.api.model.sr r1 = kh2.j.b0(r12, r3, r1)
            java.lang.String r1 = bs1.c.D0(r1)
            if (r1 != 0) goto L7b
            goto L7c
        L7b:
            r0 = r1
        L7c:
            int r4 = m60.t0.collages_remix_attribution_button
            int r1 = n80.f.collage_closeup_remix_attribution
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = bs1.c.g2(r11, r1, r2)
            s71.a r6 = s71.a.EXPAND
            s71.v r8 = new s71.v
            android.util.Size r1 = new android.util.Size
            r2 = 56
            r3 = 100
            r1.<init>(r2, r3)
            r8.<init>(r0, r1)
            zp.j0 r9 = new zp.j0
            r0 = 3
            r9.<init>(r0, r11, r12)
            r7 = 0
            r10 = 8
            r3 = r11
            s71.l r12 = e(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f109598r = r12
            b82.k r0 = r11.f109599s
            if (r0 == 0) goto Laf
            r0.addView(r12)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rq.v0.updatePin(com.pinterest.api.model.f30):void");
    }

    @Override // com.pinterest.activity.pin.view.modules.PinCloseupBaseModule
    public final void updateView() {
        GestaltIconButton upGradientAndMaybeCreateOverflowButton$closeup_release;
        super.updateView();
        b82.k kVar = this.f109599s;
        if (kVar == null || (upGradientAndMaybeCreateOverflowButton$closeup_release = setUpGradientAndMaybeCreateOverflowButton$closeup_release(kVar, true, true, this.f109596p, this.f109601u)) == null) {
            return;
        }
        gs0.k kVar2 = this.f109592l;
        if (kVar2 != null) {
            r1.updatePinOverflowMenuModal$closeup_release$default(this, upGradientAndMaybeCreateOverflowButton$closeup_release, kVar2, this.f109585e, this.f109586f, null, 16, null);
        } else {
            Intrinsics.r("pinOverflowMenuModalProvider");
            throw null;
        }
    }
}
