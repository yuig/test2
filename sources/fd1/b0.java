package fd1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.f30;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.w3;
import rq.n3;
import so.d5;
import so.e5;
import so.f5;
import so.oa;
import so.r8;
import so.s8;
import x02.i2;

/* loaded from: classes5.dex */
public final class b0 extends yk1.l implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f61859a;

    /* renamed from: b, reason: collision with root package name */
    public final SendableObject f61860b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61861c;

    /* renamed from: d, reason: collision with root package name */
    public final p32.c f61862d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f61863e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f61864f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f61865g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f61866h;

    /* renamed from: i, reason: collision with root package name */
    public final f1 f61867i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f61868j;

    /* renamed from: k, reason: collision with root package name */
    public final i91.a0 f61869k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f61870l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f61871m;

    /* renamed from: n, reason: collision with root package name */
    public final i91.b f61872n;

    /* renamed from: o, reason: collision with root package name */
    public final e82.h0 f61873o;

    /* renamed from: p, reason: collision with root package name */
    public Context f61874p;

    /* renamed from: q, reason: collision with root package name */
    public d0 f61875q;

    /* renamed from: r, reason: collision with root package name */
    public nx.j0 f61876r;

    /* renamed from: s, reason: collision with root package name */
    public d5 f61877s;

    /* renamed from: t, reason: collision with root package name */
    public ed1.q f61878t;

    public b0(ArrayList shareConfigs, SendableObject sendableObject, int i13, p32.c inviteCategory, boolean z13, f1 upsellTypes, i91.b boardPreviewState, e82.h0 socialUtils) {
        z0 viewOptions = z0.DEFAULT;
        i91.a0 sendShareState = new i91.a0();
        Intrinsics.checkNotNullParameter(shareConfigs, "shareConfigs");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(viewOptions, "viewOptions");
        Intrinsics.checkNotNullParameter(upsellTypes, "upsellTypes");
        Intrinsics.checkNotNullParameter(sendShareState, "sendShareState");
        Intrinsics.checkNotNullParameter(boardPreviewState, "boardPreviewState");
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        this.f61859a = shareConfigs;
        this.f61860b = sendableObject;
        this.f61861c = i13;
        this.f61862d = inviteCategory;
        this.f61863e = z13;
        this.f61864f = false;
        this.f61865g = viewOptions;
        this.f61866h = false;
        this.f61867i = upsellTypes;
        this.f61868j = false;
        this.f61869k = sendShareState;
        this.f61870l = false;
        this.f61871m = false;
        this.f61872n = boardPreviewState;
        this.f61873o = socialUtils;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        GestaltText gestaltText;
        Intrinsics.checkNotNullParameter(context, "context");
        jc0.n nVar = new jc0.n(context);
        this.f61876r = ((nx.m) nVar.C()).a(this);
        this.f61874p = context;
        d0 d0Var = new d0(context, this.f61860b, this.f61862d, this.f61861c, nVar, this.f61865g, b1.SHARESHEET_MODAL, this.f61866h, this.f61868j, this.f61870l, this.f61867i, this.f61872n);
        this.f61875q = d0Var;
        nVar.x(d0Var);
        s8 s8Var = (s8) ((z) me.o.a(bs1.c.k0(context), z.class));
        Intrinsics.checkNotNullParameter(s8Var.y5(), "<set-?>");
        d5 d5Var = (d5) s8Var.Ad.get();
        Intrinsics.checkNotNullParameter(d5Var, "<set-?>");
        this.f61877s = d5Var;
        p32.c cVar = p32.c.GROUP_BOARD;
        z0 z0Var = this.f61865g;
        f1 f1Var = this.f61867i;
        p32.c cVar2 = this.f61862d;
        if (cVar2 == cVar || !(z0Var == z0.DEFAULT || z0Var == z0.APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL)) {
            if (f1Var != f1.SHARE) {
                if (cVar2 == cVar) {
                    nVar.l(m60.x0.invite_collaborators_literal);
                    GestaltText gestaltText2 = nVar.f44750b;
                    if (gestaltText2 != null) {
                        gestaltText2.i(i.f61933p);
                        gestaltText2.setPaddingRelative(0, 0, gestaltText2.getContext().getResources().getDimensionPixelSize(m60.r0.margin_triple), 0);
                    }
                } else {
                    Context context2 = this.f61874p;
                    if (context2 == null) {
                        Intrinsics.r("context");
                        throw null;
                    }
                    this.f61873o.getClass();
                    nVar.p(e82.h0.g(context2, this.f61860b));
                }
                nVar.q(true);
            }
            p32.c cVar3 = p32.c.MESSAGE;
            boolean z13 = this.f61871m;
            if (cVar2 == cVar3 && !z13) {
                nVar.q(false);
            }
            GestaltText gestaltText3 = nVar.f44750b;
            if (gestaltText3 != null) {
                gestaltText3.i(i.f61934q);
            }
            ViewGroup viewGroup = nVar.f44753e;
            if (viewGroup != null) {
                Context context3 = this.f61874p;
                if (context3 == null) {
                    Intrinsics.r("context");
                    throw null;
                }
                int i13 = eo1.d.lego_modal_bg;
                Object obj = d5.a.f53679a;
                Drawable drawable = context3.getDrawable(i13);
                Intrinsics.f(drawable);
                viewGroup.setBackground(drawable);
            }
            GestaltText gestaltText4 = nVar.f44750b;
            if (gestaltText4 != null) {
                gestaltText4.setImportantForAccessibility(4);
            }
            GestaltText gestaltText5 = nVar.f44750b;
            if (gestaltText5 != null) {
                gestaltText5.sendAccessibilityEvent(65536);
            }
            nVar.T(false);
            GestaltIconButton gestaltIconButton = nVar.f44749a;
            if (gestaltIconButton != null) {
                Context context4 = this.f61874p;
                if (context4 == null) {
                    Intrinsics.r("context");
                    throw null;
                }
                int dimensionPixelSize = context4.getResources().getDimensionPixelSize(m60.r0.button_height_large);
                ViewGroup.LayoutParams layoutParams = gestaltIconButton.getLayoutParams();
                gestaltIconButton.t(i.f61936s);
                layoutParams.height = dimensionPixelSize;
                layoutParams.width = dimensionPixelSize;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                Context context5 = this.f61874p;
                if (context5 == null) {
                    Intrinsics.r("context");
                    throw null;
                }
                com.bumptech.glide.c.a1(layoutParams2, context5.getResources().getDimensionPixelSize(m60.r0.share_sheet_padding), 0, 0, 0);
                gestaltIconButton.u(new n3(13));
            }
            if (z0Var == z0.APP_LIST_ONLY_FOR_CONTEXTUAL_MENU) {
                int i14 = f1Var.isDownloadOrScreenshot() ? a62.e.save_or_share : z13 ? b62.d.share_an_invite_link : a62.e.save_or_send;
                if (z13 && (gestaltText = nVar.f44750b) != null) {
                    gestaltText.i(i.f61935r);
                }
                nVar.l(i14);
            }
        } else {
            int i15 = (z0Var == z0.APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL && f1Var.isDownloadOrScreenshot()) ? a62.e.save_or_share : this.f61872n.f71798a ? a62.e.sharesheet_board_video_header : m60.x0.share;
            nVar.q(true);
            nVar.l(i15);
            GestaltText gestaltText6 = nVar.f44750b;
            if (gestaltText6 != null) {
                gestaltText6.i(i.f61932o);
                gestaltText6.setPaddingRelative(0, 0, gestaltText6.getContext().getResources().getDimensionPixelSize(m60.r0.margin_triple), 0);
            }
            nVar.T(false);
        }
        int i16 = a0.f61857a[z0Var.ordinal()];
        if (i16 == 1) {
            t0 t0Var = d0Var.f61898n;
            if (t0Var != null) {
                t0Var.setVisibility(8);
            }
        } else if (i16 == 2) {
            d0Var.a().setVisibility(8);
        }
        nVar.Z(0, 0, 0, 0);
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        d5 d5Var = this.f61877s;
        if (d5Var == null) {
            Intrinsics.r("previewSharesheetModalPresenterFactory");
            throw null;
        }
        Context context = this.f61874p;
        if (context == null) {
            Intrinsics.r("context");
            throw null;
        }
        nx.j0 j0Var = this.f61876r;
        if (j0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        b1 b1Var = b1.SHARESHEET_MODAL;
        r8 r8Var = d5Var.f113383a;
        yk1.j jVar = (yk1.j) r8Var.f114090a.Qc.get();
        oa oaVar = r8Var.f114090a;
        w3 B2 = oaVar.B2();
        m60.w wVar = (m60.w) oaVar.f113885r0.get();
        s8 s8Var = r8Var.f114091b;
        ap.o oVar = (ap.o) s8Var.I0.get();
        gi.m x53 = s8Var.x5();
        i92.k kVar = (i92.k) oaVar.f113921t1.get();
        uk1.e eVar = (uk1.e) oaVar.f113702ga.get();
        bf2.d dVar = oaVar.f113947u9;
        bf2.d dVar2 = s8Var.f114387m;
        lu1.b bVar = (lu1.b) oaVar.f113961v5.get();
        u20.d dVar3 = (u20.d) oaVar.Y5.get();
        i2 i2Var = (i2) oaVar.F3.get();
        x02.x0 x0Var = (x02.x0) oaVar.f113765k3.get();
        nx.d1 d1Var = (nx.d1) oaVar.f113730i2.get();
        no1.e C5 = s8Var.C5();
        qz.a aVar = (qz.a) oaVar.X5.get();
        e5 e5Var = (e5) s8Var.f114505td.get();
        f5 f5Var = (f5) s8Var.f114595zd.get();
        gs1.a aVar2 = (gs1.a) s8Var.f114230b4.get();
        c2 D6 = s8Var.D6();
        e82.h0 b33 = oaVar.b3();
        lz1.c H1 = oa.H1(oaVar);
        lb0.q qVar = (lb0.q) oaVar.O0.get();
        ed1.q qVar2 = new ed1.q(context, j0Var, this.f61862d, this.f61859a, this.f61860b, b1Var, this.f61865g, this.f61863e, this.f61864f, this.f61861c, this.f61869k, this.f61872n, jVar, B2, wVar, oVar, x53, kVar, eVar, dVar, dVar2, bVar, dVar3, i2Var, x0Var, d1Var, C5, aVar, e5Var, f5Var, aVar2, D6, b33, H1, qVar);
        Intrinsics.checkNotNullParameter(qVar2, "<set-?>");
        this.f61878t = qVar2;
        return qVar2;
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(getViewType(), this.f61865g == z0.CONTACT_LIST_ONLY ? a4.SEND_SHARE_SEARCH : a4.SEND_SHARE_MAIN, null, null, null, null);
    }

    @Override // jc0.a0
    public final String getPinId() {
        SendableObject sendableObject = this.f61860b;
        if (sendableObject.g()) {
            return sendableObject.d();
        }
        return null;
    }

    @Override // yk1.l
    public final yk1.n getView() {
        d0 d0Var = this.f61875q;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.r("sharesheetView");
        throw null;
    }

    @Override // jc0.a0
    public final d4 getViewType() {
        SendableObject sendableObject = this.f61860b;
        return (sendableObject.g() && sendableObject.h()) ? d4.MODAL_SEND : d4.SEND_SHARE;
    }

    @Override // yk1.l, jc0.a0
    public final void onAboutToDismiss() {
        String str;
        z0 z0Var;
        f30 f30Var;
        ed1.q qVar = this.f61878t;
        if (qVar == null) {
            Intrinsics.r("previewSharesheetModalPresenter");
            throw null;
        }
        boolean z13 = e0.t.f56753k;
        boolean z14 = e0.t.f56752j;
        boolean z15 = e0.t.f56754l;
        if (!qVar.M || z14 || z13 || z15) {
            HashMap hashMap = new HashMap();
            hashMap.put("sharesheet_repinned", String.valueOf(z15));
            hashMap.put("sharesheet_sharedinternal", String.valueOf(z13));
            hashMap.put("sharesheet_sharedexternal", String.valueOf(z14));
            y32.f.Companion.getClass();
            y32.f a13 = y32.d.a(qVar.f58682j);
            if (a13 == null || (str = a13.name()) == null) {
                str = "unknown";
            }
            hashMap.put("source", str);
            SendableObject sendableObject = qVar.f58677e;
            boolean g13 = sendableObject.g();
            z0 z0Var2 = qVar.f58679g;
            if (!g13 || (f30Var = qVar.K) == null) {
                z0Var = z0Var2;
                nx.d0 d0Var = qVar.f58674b;
                if (z14 || z13) {
                    d0Var.g(h32.f1.SHARE_SHEET_DISMISS_WITH_SEND, null, hashMap, false);
                } else {
                    d0Var.g(h32.f1.SHARE_SHEET_DISMISS_NO_SEND, null, hashMap, false);
                }
            } else {
                String b13 = qVar.f58698z.b(f30Var);
                hashMap.put("invite_object", String.valueOf(sendableObject.b().value()));
                h32.v0 v0Var = new h32.v0();
                v0Var.G = b13;
                h32.g0 contextLoggingComponentType = z0Var2.getContextLoggingComponentType();
                h32.f1 f1Var = (z14 || z13) ? h32.f1.SHARE_SHEET_DISMISS_WITH_SEND : h32.f1.SHARE_SHEET_DISMISS_NO_SEND;
                h32.u0 u0Var = h32.u0.SEND_SHARE_DISMISS_BUTTON;
                String d2 = sendableObject.d();
                z0Var = z0Var2;
                qVar.f58674b.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : contextLoggingComponentType, (r18 & 8) != 0 ? null : d2, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
            i91.e eVar = new i91.e();
            m60.w wVar = qVar.f58687o;
            wVar.d(eVar);
            ig1.b.s0(wVar, qVar.H);
            e0.t.f56747e = -1;
            if (z13) {
                z0 z0Var3 = z0.DEFAULT;
                i91.a0 a0Var = qVar.f58683k;
                if ((z0Var == z0Var3 && !a0Var.f71796b) || z0Var == z0.CONTACT_LIST_ONLY) {
                    wVar.d(new pg0.i0(CollectionsKt.F0(a0Var.f71795a)));
                }
            }
        }
        super.onAboutToDismiss();
    }
}
