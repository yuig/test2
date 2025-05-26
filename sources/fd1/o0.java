package fd1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.f30;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import java.util.HashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import rq.n3;
import so.h5;
import so.s8;

/* loaded from: classes5.dex */
public final class o0 extends yk1.l implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final SendableObject f61966a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61967b;

    /* renamed from: c, reason: collision with root package name */
    public final p32.c f61968c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f61969d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f61970e;

    /* renamed from: f, reason: collision with root package name */
    public final z0 f61971f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f61972g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f61973h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f61974i;

    /* renamed from: j, reason: collision with root package name */
    public final i91.a0 f61975j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f61976k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f61977l;

    /* renamed from: m, reason: collision with root package name */
    public final i91.b f61978m;

    /* renamed from: n, reason: collision with root package name */
    public final e82.h0 f61979n;

    /* renamed from: o, reason: collision with root package name */
    public Context f61980o;

    /* renamed from: p, reason: collision with root package name */
    public y0 f61981p;

    /* renamed from: q, reason: collision with root package name */
    public nx.j0 f61982q;

    /* renamed from: r, reason: collision with root package name */
    public h5 f61983r;

    /* renamed from: s, reason: collision with root package name */
    public ed1.f0 f61984s;

    public o0(SendableObject sendableObject, int i13, p32.c inviteCategory, boolean z13, boolean z14, z0 z0Var, boolean z15, f1 f1Var, boolean z16, i91.a0 a0Var, boolean z17, i91.b bVar, e82.h0 socialUtils, int i14) {
        boolean z18 = (i14 & 8) != 0 ? false : z13;
        boolean z19 = (i14 & 16) != 0 ? false : z14;
        z0 viewOptions = (i14 & 32) != 0 ? z0.DEFAULT : z0Var;
        boolean z23 = (i14 & 64) != 0 ? false : z15;
        f1 upsellTypes = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? f1.NONE : f1Var;
        i91.a0 sendShareState = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? new i91.a0() : a0Var;
        boolean z24 = (i14 & 1024) != 0 ? false : z17;
        i91.b boardPreviewState = (i14 & 4096) != 0 ? i91.b.f71797d : bVar;
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(viewOptions, "viewOptions");
        Intrinsics.checkNotNullParameter(upsellTypes, "upsellTypes");
        Intrinsics.checkNotNullParameter(sendShareState, "sendShareState");
        Intrinsics.checkNotNullParameter(boardPreviewState, "boardPreviewState");
        Intrinsics.checkNotNullParameter(socialUtils, "socialUtils");
        this.f61966a = sendableObject;
        this.f61967b = i13;
        this.f61968c = inviteCategory;
        this.f61969d = z18;
        this.f61970e = z19;
        this.f61971f = viewOptions;
        this.f61972g = z23;
        this.f61973h = upsellTypes;
        this.f61974i = z16;
        this.f61975j = sendShareState;
        this.f61976k = z24;
        this.f61977l = false;
        this.f61978m = boardPreviewState;
        this.f61979n = socialUtils;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        GestaltText gestaltText;
        Intrinsics.checkNotNullParameter(context, "context");
        jc0.n nVar = new jc0.n(context);
        this.f61982q = ((nx.m) nVar.C()).a(this);
        this.f61980o = context;
        y0 y0Var = new y0(context, this.f61966a, this.f61968c, this.f61967b, nVar, this.f61971f, b1.SHARESHEET_MODAL, this.f61972g, this.f61974i, this.f61976k, this.f61973h, this.f61978m);
        this.f61981p = y0Var;
        nVar.x(y0Var);
        s8 s8Var = (s8) ((m0) me.o.a(bs1.c.k0(context), m0.class));
        Intrinsics.checkNotNullParameter(s8Var.y5(), "<set-?>");
        h5 h5Var = (h5) s8Var.Dd.get();
        Intrinsics.checkNotNullParameter(h5Var, "<set-?>");
        this.f61983r = h5Var;
        p32.c cVar = p32.c.GROUP_BOARD;
        z0 z0Var = this.f61971f;
        f1 f1Var = this.f61973h;
        p32.c cVar2 = this.f61968c;
        if (cVar2 == cVar || !(z0Var == z0.DEFAULT || z0Var == z0.APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL)) {
            if (f1Var != f1.SHARE) {
                if (cVar2 == cVar) {
                    nVar.l(m60.x0.invite_collaborators_literal);
                    GestaltText gestaltText2 = nVar.f44750b;
                    if (gestaltText2 != null) {
                        gestaltText2.i(i.f61941x);
                        ViewGroup.LayoutParams layoutParams = gestaltText2.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        Context context2 = this.f61980o;
                        if (context2 == null) {
                            Intrinsics.r("context");
                            throw null;
                        }
                        marginLayoutParams.setMarginEnd(context2.getResources().getDimensionPixelSize(m60.r0.margin_triple));
                        gestaltText2.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    Context context3 = this.f61980o;
                    if (context3 == null) {
                        Intrinsics.r("context");
                        throw null;
                    }
                    this.f61979n.getClass();
                    nVar.p(e82.h0.g(context3, this.f61966a));
                }
                nVar.q(true);
            }
            p32.c cVar3 = p32.c.MESSAGE;
            boolean z13 = this.f61977l;
            if (cVar2 == cVar3 && !z13) {
                nVar.q(false);
            }
            GestaltText gestaltText3 = nVar.f44750b;
            if (gestaltText3 != null) {
                gestaltText3.i(i.f61942y);
            }
            ViewGroup viewGroup = nVar.f44753e;
            if (viewGroup != null) {
                Context context4 = this.f61980o;
                if (context4 == null) {
                    Intrinsics.r("context");
                    throw null;
                }
                int i13 = eo1.d.lego_modal_bg;
                Object obj = d5.a.f53679a;
                Drawable drawable = context4.getDrawable(i13);
                Intrinsics.f(drawable);
                viewGroup.setBackground(drawable);
            }
            GestaltText gestaltText4 = nVar.f44750b;
            if (gestaltText4 != null) {
                pp2.a.k(gestaltText4, i.f61943z);
            }
            GestaltText gestaltText5 = nVar.f44750b;
            if (gestaltText5 != null) {
                gestaltText5.sendAccessibilityEvent(65536);
            }
            nVar.T(false);
            GestaltIconButton gestaltIconButton = nVar.f44749a;
            if (gestaltIconButton != null) {
                Context context5 = this.f61980o;
                if (context5 == null) {
                    Intrinsics.r("context");
                    throw null;
                }
                int dimensionPixelSize = context5.getResources().getDimensionPixelSize(m60.r0.button_height_large);
                ViewGroup.LayoutParams layoutParams2 = gestaltIconButton.getLayoutParams();
                gestaltIconButton.t(i.B);
                layoutParams2.height = dimensionPixelSize;
                layoutParams2.width = dimensionPixelSize;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                Context context6 = this.f61980o;
                if (context6 == null) {
                    Intrinsics.r("context");
                    throw null;
                }
                com.bumptech.glide.c.a1(layoutParams3, context6.getResources().getDimensionPixelSize(m60.r0.share_sheet_padding), 0, 0, 0);
                gestaltIconButton.u(new n3(14));
            }
            if (z0Var == z0.APP_LIST_ONLY_FOR_CONTEXTUAL_MENU) {
                int i14 = f1Var.isDownloadOrScreenshot() ? a62.e.save_or_share : z13 ? b62.d.share_an_invite_link : a62.e.save_or_send;
                if (z13 && (gestaltText = nVar.f44750b) != null) {
                    gestaltText.i(i.A);
                }
                nVar.l(i14);
            }
        } else {
            int i15 = (z0Var == z0.APP_LIST_AND_CONTACT_SUGGESTIONS_FOR_UPSELL && f1Var.isDownloadOrScreenshot()) ? a62.e.save_or_share : this.f61978m.f71798a ? a62.e.sharesheet_board_video_header : m60.x0.share;
            nVar.q(true);
            nVar.l(i15);
            GestaltText gestaltText6 = nVar.f44750b;
            if (gestaltText6 != null) {
                gestaltText6.i(i.f61940w);
                ViewGroup.LayoutParams layoutParams4 = gestaltText6.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                Context context7 = this.f61980o;
                if (context7 == null) {
                    Intrinsics.r("context");
                    throw null;
                }
                marginLayoutParams2.setMarginEnd(context7.getResources().getDimensionPixelSize(m60.r0.margin_triple));
                gestaltText6.setLayoutParams(marginLayoutParams2);
            }
            nVar.T(false);
        }
        int i16 = n0.f61955a[z0Var.ordinal()];
        if (i16 == 1) {
            t0 t0Var = y0Var.f62029m;
            if (t0Var != null) {
                t0Var.setVisibility(8);
            }
        } else if (i16 == 2) {
            y0Var.a().setVisibility(8);
        }
        nVar.Z(0, 0, 0, 0);
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        h5 h5Var = this.f61983r;
        if (h5Var == null) {
            Intrinsics.r("sharesheetModalPresenterFactory");
            throw null;
        }
        Context context = this.f61980o;
        if (context == null) {
            Intrinsics.r("context");
            throw null;
        }
        nx.j0 j0Var = this.f61982q;
        if (j0Var == null) {
            Intrinsics.r("pinalytics");
            throw null;
        }
        b1 b1Var = b1.SHARESHEET_MODAL;
        i91.a0 a0Var = this.f61975j;
        ed1.f0 a13 = h5Var.a(context, j0Var, this.f61968c, this.f61966a, b1Var, this.f61971f, this.f61969d, this.f61970e, this.f61967b, a0Var, this.f61978m);
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        this.f61984s = a13;
        return a13;
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(getViewType(), this.f61971f == z0.CONTACT_LIST_ONLY ? a4.SEND_SHARE_SEARCH : a4.SEND_SHARE_MAIN, null, null, null, null);
    }

    @Override // jc0.a0
    public final String getPinId() {
        SendableObject sendableObject = this.f61966a;
        if (sendableObject.g()) {
            return sendableObject.d();
        }
        return null;
    }

    @Override // yk1.l
    public final yk1.n getView() {
        y0 y0Var = this.f61981p;
        if (y0Var != null) {
            return y0Var;
        }
        Intrinsics.r("sharesheetView");
        throw null;
    }

    @Override // jc0.a0
    public final d4 getViewType() {
        SendableObject sendableObject = this.f61966a;
        return (sendableObject.g() && sendableObject.h()) ? d4.MODAL_SEND : d4.SEND_SHARE;
    }

    @Override // yk1.l, jc0.a0
    public final void onAboutToDismiss() {
        String str;
        z0 z0Var;
        f30 f30Var;
        ed1.f0 f0Var = this.f61984s;
        if (f0Var == null) {
            Intrinsics.r("sharesheetModalPresenter");
            throw null;
        }
        int i13 = e0.t.f56747e;
        f30 f30Var2 = f0Var.I;
        String uid = f30Var2 != null ? f30Var2.getUid() : null;
        if (uid == null) {
            uid = "";
        }
        pg0.j0 j0Var = new pg0.j0(i13, uid);
        m60.w wVar = f0Var.f58593n;
        wVar.d(j0Var);
        boolean z13 = e0.t.f56753k;
        boolean z14 = e0.t.f56752j;
        boolean z15 = e0.t.f56754l;
        if (!f0Var.f58579J || z14 || z13 || z15) {
            HashMap hashMap = new HashMap();
            hashMap.put("sharesheet_repinned", String.valueOf(z15));
            hashMap.put("sharesheet_sharedinternal", String.valueOf(z13));
            hashMap.put("sharesheet_sharedexternal", String.valueOf(z14));
            y32.f.Companion.getClass();
            y32.f a13 = y32.d.a(f0Var.f58588i);
            if (a13 == null || (str = a13.name()) == null) {
                str = "unknown";
            }
            hashMap.put("source", str);
            SendableObject sendableObject = f0Var.f58583d;
            boolean g13 = sendableObject.g();
            z0 z0Var2 = f0Var.f58585f;
            if (!g13 || (f30Var = f0Var.I) == null) {
                z0Var = z0Var2;
                nx.d0 d0Var = f0Var.f58581b;
                if (z14 || z13) {
                    d0Var.g(h32.f1.SHARE_SHEET_DISMISS_WITH_SEND, null, hashMap, false);
                } else {
                    d0Var.g(h32.f1.SHARE_SHEET_DISMISS_NO_SEND, null, hashMap, false);
                }
            } else {
                String b13 = f0Var.f58604y.b(f30Var);
                hashMap.put("invite_object", String.valueOf(sendableObject.b().value()));
                h32.v0 v0Var = new h32.v0();
                v0Var.G = b13;
                h32.g0 contextLoggingComponentType = z0Var2.getContextLoggingComponentType();
                h32.f1 f1Var = (z14 || z13) ? h32.f1.SHARE_SHEET_DISMISS_WITH_SEND : h32.f1.SHARE_SHEET_DISMISS_NO_SEND;
                h32.u0 u0Var = h32.u0.SEND_SHARE_DISMISS_BUTTON;
                String d2 = sendableObject.d();
                z0Var = z0Var2;
                f0Var.f58581b.h0((r18 & 1) != 0 ? h32.f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : contextLoggingComponentType, (r18 & 8) != 0 ? null : d2, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            }
            wVar.d(new i91.e());
            ig1.b.s0(wVar, f0Var.G);
            e0.t.f56747e = -1;
            if (z13) {
                z0 z0Var3 = z0.DEFAULT;
                i91.a0 a0Var = f0Var.f58589j;
                if ((z0Var == z0Var3 && !a0Var.f71796b) || z0Var == z0.CONTACT_LIST_ONLY) {
                    wVar.d(new pg0.i0(CollectionsKt.F0(a0Var.f71795a)));
                }
            }
        }
        super.onAboutToDismiss();
    }
}
