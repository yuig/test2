package com.pinterest.gestalt.bannerOverlay;

import al1.n;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.google.firebase.messaging.q;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import eo1.a;
import gm1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rm1.c;
import rm1.i;
import u50.o;
import wl1.e;
import wl1.f;
import wl1.g;
import wl1.h;
import wl1.k;
import wl1.s;
import wl1.u;
import xk2.m;
import xk2.v;
import yj1.d;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002:\u0003\f\u0003\rB'\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/pinterest/gestalt/bannerOverlay/GestaltBannerOverlay;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lgm1/b;", "Lwl1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/n", "wl1/h", "bannerOverlay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltBannerOverlay extends ConstraintLayout implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final n f49304m = new n(7, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final c f49305n = c.DEFAULT;

    /* renamed from: o, reason: collision with root package name */
    public static final fm1.c f49306o = fm1.c.VISIBLE;

    /* renamed from: a, reason: collision with root package name */
    public final q f49307a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f49308b;

    /* renamed from: c, reason: collision with root package name */
    public int f49309c;

    /* renamed from: d, reason: collision with root package name */
    public final v f49310d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltIcon f49311e;

    /* renamed from: f, reason: collision with root package name */
    public int f49312f;

    /* renamed from: g, reason: collision with root package name */
    public WebImageView f49313g;

    /* renamed from: h, reason: collision with root package name */
    public int f49314h;

    /* renamed from: i, reason: collision with root package name */
    public GestaltButtonGroup f49315i;

    /* renamed from: j, reason: collision with root package name */
    public int f49316j;

    /* renamed from: k, reason: collision with root package name */
    public GestaltIconButton f49317k;

    /* renamed from: l, reason: collision with root package name */
    public int f49318l;

    static {
        rm1.q icon = rm1.q.FILL_TRANSPARENT;
        i size = i.SM;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(size, "size");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltBannerOverlay(Context context, wl1.c displayState) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f49310d = m.b(new d(this, 8));
        this.f49307a = new q(this, displayState);
        X();
    }

    public final wl1.c L() {
        return (wl1.c) ((o) this.f49307a.f33803a);
    }

    public final GestaltText T() {
        return (GestaltText) this.f49310d.getValue();
    }

    public final void X() {
        addView(T());
        int G0 = dl2.b.G0(this, a.comp_banneroverlay_corner_padding);
        setPadding(G0, G0, G0, G0);
        setElevation(dl2.b.G0(this, a.comp_banneroverlay_elevation));
        Z(null, L());
    }

    public final void Z(wl1.c cVar, wl1.c cVar2) {
        om1.c w13;
        cm1.d d2;
        rn1.a l13;
        om1.c w14;
        rn1.a l14;
        j1.v(cVar, cVar2, wl1.m.f130199l, new k(this, cVar2, 4));
        j1.v(cVar, cVar2, wl1.m.f130200m, new k(this, cVar2, 5));
        j1.v(cVar, cVar2, wl1.m.f130201n, new k(this, cVar2, 6));
        j1.v(cVar, cVar2, wl1.m.f130202o, new k(this, cVar2, 7));
        int i13 = 2;
        j1.v(cVar, cVar2, wl1.m.f130203p, new k(this, cVar2, i13));
        j1.v(cVar, cVar2, wl1.m.f130197j, new k(this, cVar2, 3));
        j1.v(cVar, cVar2, wl1.m.f130198k, new wl1.b(this, i13));
        p pVar = new p();
        pVar.j(this);
        GestaltText gestaltText = this.f49308b;
        fm1.c cVar3 = null;
        fm1.c cVar4 = (gestaltText == null || (l14 = gestaltText.l()) == null) ? null : l14.f108855m;
        fm1.c cVar5 = fm1.c.VISIBLE;
        int i14 = cVar4 == cVar5 ? this.f49309c : 0;
        h hVar = L().f130182d;
        if (hVar instanceof e) {
            pVar.l(this.f49314h, 6, 0, 6);
            pVar.l(this.f49314h, 3, i14, 3);
            pVar.K(this.f49314h, 0);
            pVar.K(this.f49312f, 8);
        } else if ((hVar instanceof wl1.d) || Intrinsics.d(hVar, f.f130189a)) {
            pVar.K(this.f49314h, 8);
            pVar.l(this.f49312f, 6, 0, 6);
            pVar.l(this.f49312f, 3, i14, 3);
            pVar.K(this.f49312f, 0);
        } else if (hVar instanceof g) {
            pVar.K(this.f49312f, 8);
            pVar.K(this.f49314h, 8);
        }
        int i15 = L().f130182d instanceof e ? this.f49314h : this.f49312f;
        GestaltIconButton gestaltIconButton = this.f49317k;
        fm1.c cVar6 = (gestaltIconButton == null || (w14 = gestaltIconButton.w()) == null) ? null : w14.f96642d;
        if (cVar6 != null && wl1.i.f130191a[cVar6.ordinal()] == 1) {
            pVar.l(this.f49309c, 7, this.f49318l, 6);
        } else {
            pVar.l(this.f49309c, 7, 0, 7);
        }
        pVar.l(this.f49309c, 3, 0, 3);
        if (i15 == 0) {
            pVar.l(this.f49309c, 6, 0, 6);
        } else {
            pVar.l(this.f49309c, 6, i15, 7);
            pVar.I(this.f49309c, 6, bs1.c.b0(this, eo1.c.space_200));
        }
        pVar.I(this.f49309c, 7, bs1.c.b0(this, eo1.c.space_200));
        pVar.E(this.f49309c, 7, 0);
        pVar.E(this.f49309c, 6, 0);
        pVar.K(this.f49309c, L().f130179a.f108855m.getVisibility());
        pVar.q(this.f49309c);
        pVar.H(this.f49309c, 0.0f);
        int i16 = L().f130182d instanceof e ? this.f49314h : this.f49312f;
        GestaltText gestaltText2 = this.f49308b;
        if (((gestaltText2 == null || (l13 = gestaltText2.l()) == null) ? null : l13.f108855m) == cVar5) {
            pVar.l(T().getId(), 3, this.f49309c, 4);
            pVar.I(T().getId(), 3, bs1.c.b0(this, eo1.c.space_50));
        } else {
            pVar.l(T().getId(), 3, 0, 3);
        }
        GestaltButtonGroup gestaltButtonGroup = this.f49315i;
        if (((gestaltButtonGroup == null || (d2 = gestaltButtonGroup.d()) == null) ? null : d2.f28017f) == cVar5) {
            pVar.l(T().getId(), 4, this.f49316j, 3);
            pVar.I(T().getId(), 4, bs1.c.b0(this, eo1.c.space_400));
        } else {
            pVar.l(T().getId(), 4, 0, 4);
        }
        GestaltIconButton gestaltIconButton2 = this.f49317k;
        if (gestaltIconButton2 != null && (w13 = gestaltIconButton2.w()) != null) {
            cVar3 = w13.f96642d;
        }
        if (cVar3 == cVar5) {
            pVar.l(T().getId(), 7, this.f49318l, 6);
            pVar.I(T().getId(), 7, bs1.c.b0(this, eo1.c.space_200));
        } else {
            pVar.l(T().getId(), 7, 0, 7);
        }
        if (i16 == 0) {
            pVar.l(T().getId(), 6, 0, 6);
        } else {
            pVar.l(T().getId(), 6, i16, 7);
            pVar.I(T().getId(), 6, bs1.c.b0(this, eo1.c.space_200));
        }
        pVar.q(T().getId());
        pVar.H(T().getId(), 0.0f);
        pVar.E(T().getId(), 7, 0);
        pVar.E(T().getId(), 3, 0);
        pVar.E(T().getId(), 6, 0);
        pVar.E(T().getId(), 4, 0);
        pVar.J(T().getId(), 0.0f);
        pVar.l(this.f49318l, 3, 0, 3);
        pVar.l(this.f49318l, 7, 0, 7);
        pVar.K(this.f49318l, L().f130183e.f96642d.getVisibility());
        pVar.l(this.f49316j, 7, 0, 7);
        pVar.l(this.f49316j, 4, 0, 4);
        pVar.b(this);
        setBackgroundResource(s.banner_overlay_background);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltBannerOverlay(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestaltBannerOverlay(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f49310d = m.b(new d(this, 8));
        int[] GestaltBannerOverlay = u.GestaltBannerOverlay;
        Intrinsics.checkNotNullExpressionValue(GestaltBannerOverlay, "GestaltBannerOverlay");
        this.f49307a = new q(this, attributeSet, i13, GestaltBannerOverlay, new wl1.b(this, 0));
        X();
    }
}
