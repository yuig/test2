package zg0;

import a11.y;
import ah0.d;
import bc2.k;
import bc2.q;
import ck2.i;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import dl2.b;
import h32.a4;
import h32.d4;
import h32.i0;
import i32.d0;
import i32.g0;
import i32.h1;
import i32.k1;
import i32.n1;
import i32.q1;
import jc0.l;
import jk2.m;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import ra0.l0;
import rg0.n;
import vn1.e;
import vn1.g;
import x02.a2;
import yk1.c;
import yk1.r;

/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public vh f141952a;

    /* renamed from: b, reason: collision with root package name */
    public n f141953b;

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(yg0.a view) {
        ih ihVar;
        String url;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        d dVar = (d) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        dVar.f15186j = this;
        r3(this.f141952a);
        vh vhVar = this.f141952a;
        if (vhVar == null || (ihVar = vhVar.f42857o) == null || (url = ihVar.e()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        y yVar = dVar.f15190n;
        if (yVar == null) {
            Intrinsics.r("urlInfoHelper");
            throw null;
        }
        m a13 = yVar.a(url, null);
        a2 a2Var = i.f27924d;
        xj2.c F = a13.F(a2Var, a2Var, i.f27923c, a2Var);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void r3(vh vhVar) {
        vn1.c cVar;
        String completeButtonText;
        String titleText;
        if (!isBound() || vhVar == null) {
            return;
        }
        d dVar = (d) ((yg0.a) getView());
        a0.l0(dVar.f15182f);
        Intrinsics.checkNotNullParameter("", "titleText");
        a0.p(dVar.f15184h, "");
        dVar.f15183g.clear();
        bs1.c.X0(dVar.f15185i);
        ((d) ((yg0.a) getView())).f15180d = vhVar.getUid();
        ((d) ((yg0.a) getView())).f15181e = vhVar.u();
        kj kjVar = vhVar.f42855m;
        if (kjVar != null && (titleText = kjVar.a()) != null) {
            d dVar2 = (d) ((yg0.a) getView());
            dVar2.getClass();
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            a0.p(dVar2.f15184h, titleText);
        }
        ih ihVar = vhVar.f42857o;
        int i13 = 11;
        if (ihVar != null && (completeButtonText = ihVar.g()) != null) {
            d dVar3 = (d) ((yg0.a) getView());
            dVar3.getClass();
            Intrinsics.checkNotNullParameter(completeButtonText, "completeButtonText");
            dVar3.f15182f.d(new l(completeButtonText, i13));
        }
        String str = vhVar.D;
        if (str != null) {
            ProportionalImageView proportionalImageView = ((d) ((yg0.a) getView())).f15183g;
            if (!Intrinsics.d(str, proportionalImageView.f52563o)) {
                proportionalImageView.loadUrl(str);
            }
        }
        float f13 = ((d) ((yg0.a) getView())).f15179c ? 1.0f : 0.6666667f;
        Boolean k13 = vhVar.k();
        Intrinsics.checkNotNullExpressionValue(k13, "getIsPromoted(...)");
        boolean booleanValue = k13.booleanValue();
        Intrinsics.checkNotNullParameter(vhVar, "<this>");
        String str2 = vhVar.E;
        q videoTracks = str2 == null ? null : b.n1(f13, str2, vhVar.F, booleanValue);
        if (videoTracks != null) {
            i0 p13 = getPinalytics().p();
            yg0.a aVar = (yg0.a) getView();
            String uid = vhVar.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            d4 d4Var = p13 != null ? p13.f67081a : null;
            a4 a4Var = p13 != null ? p13.f67082b : null;
            d dVar4 = (d) aVar;
            dVar4.getClass();
            Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
            Intrinsics.checkNotNullParameter(uid, "videoUId");
            PinterestVideoView pinterestVideoView = dVar4.f15185i;
            bs1.c.U1(pinterestVideoView);
            Intrinsics.checkNotNullParameter(uid, "uid");
            Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
            oc2.i.g(pinterestVideoView, new k(uid, videoTracks.a(), d4Var, a4Var, videoTracks, null), null, 6);
        }
        String str3 = vhVar.F;
        if (str3 != null) {
            ((d) ((yg0.a) getView())).f15185i.K0.V1(str3, (r18 & 2) != 0 ? true : true, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null);
        }
        g0 titleTextColor = vhVar.G;
        if (titleTextColor != null) {
            d dVar5 = (d) ((yg0.a) getView());
            dVar5.getClass();
            Intrinsics.checkNotNullParameter(titleTextColor, "titleTextColor");
            switch (ah0.b.f15170a[titleTextColor.ordinal()]) {
                case 1:
                    cVar = vn1.c.DEFAULT;
                    break;
                case 2:
                    cVar = vn1.c.SUBTLE;
                    break;
                case 3:
                    cVar = vn1.c.SUCCESS;
                    break;
                case 4:
                    cVar = vn1.c.ERROR;
                    break;
                case 5:
                    cVar = vn1.c.WARNING;
                    break;
                case 6:
                    cVar = vn1.c.INVERSE;
                    break;
                case 7:
                    cVar = vn1.c.DARK;
                    break;
                case 8:
                    cVar = vn1.c.LIGHT;
                    break;
                case 9:
                    cVar = vn1.c.SHOPPING;
                    break;
                default:
                    cVar = vn1.c.LIGHT;
                    break;
            }
            dVar5.f15184h.i(new sp.a(3, cVar));
        }
        h1 titleTextSize = vhVar.I;
        if (titleTextSize != null) {
            d dVar6 = (d) ((yg0.a) getView());
            dVar6.getClass();
            Intrinsics.checkNotNullParameter(titleTextSize, "titleTextSize");
            int i14 = ah0.b.f15171b[titleTextSize.ordinal()];
            dVar6.f15184h.i(new mp.m(i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? g.BODY_300 : g.BODY_200 : g.BODY_300 : g.HEADING_400 : g.HEADING_400, 1));
        }
        q1 horizontalAlignment = vhVar.H;
        if (horizontalAlignment != null) {
            d dVar7 = (d) ((yg0.a) getView());
            dVar7.getClass();
            Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
            int i15 = ah0.b.f15172c[horizontalAlignment.ordinal()];
            dVar7.f15184h.i(new yb0.m(i15 != 1 ? i15 != 2 ? i15 != 3 ? vn1.b.START : vn1.b.END : vn1.b.CENTER : vn1.b.START, 3));
        }
        d0 buttonStyle = vhVar.P;
        if (buttonStyle != null) {
            d dVar8 = (d) ((yg0.a) getView());
            dVar8.getClass();
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            dVar8.f15182f.d(new l0(buttonStyle, 28));
        }
        Boolean bool = vhVar.Q;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        yg0.a aVar2 = (yg0.a) getView();
        boolean booleanValue2 = bool.booleanValue();
        GestaltButton gestaltButton = ((d) aVar2).f15182f;
        if (booleanValue2) {
            a0.l0(gestaltButton);
        } else {
            a0.v1(gestaltButton);
        }
        if (vhVar.f42842J != null && vhVar.K != null) {
            yg0.a aVar3 = (yg0.a) getView();
            k1 titleTextStyle = vhVar.f42842J;
            Intrinsics.f(titleTextStyle);
            n1 titleTextWeight = vhVar.K;
            Intrinsics.f(titleTextWeight);
            d dVar9 = (d) aVar3;
            dVar9.getClass();
            Intrinsics.checkNotNullParameter(titleTextStyle, "titleTextStyle");
            Intrinsics.checkNotNullParameter(titleTextWeight, "titleTextWeight");
            int i16 = ah0.b.f15173d[titleTextStyle.ordinal()];
            e eVar = i16 != 1 ? i16 != 2 ? e.REGULAR : e.REGULAR : e.ITALIC;
            int i17 = ah0.b.f15174e[titleTextWeight.ordinal()];
            dVar9.f15184h.i(new gd0.c(i13, eVar, i17 != 1 ? i17 != 2 ? e.REGULAR : e.REGULAR : e.BOLD));
        }
        String str4 = vhVar.f42853k;
        n f14 = str4 != null ? n.f(new vd0.c(str4)) : null;
        Intrinsics.checkNotNullParameter(vhVar, "<this>");
        if (f14 != null && !vhVar.f42866x) {
            vhVar.f42866x = true;
            f14.g();
        }
        this.f141953b = f14;
        d dVar10 = (d) ((yg0.a) getView());
        dVar10.getClass();
        bs1.c.R1(dVar10, true);
    }
}
