package lq0;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ue;
import com.pinterest.feature.conversation.view.ConversationQuickRepliesContainer;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84347i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f84348j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(o0 o0Var, int i13) {
        super(1);
        this.f84347i = i13;
        this.f84348j = o0Var;
    }

    public final void b(f30 f30Var) {
        String category;
        int i13 = this.f84347i;
        category = "";
        o0 o0Var = this.f84348j;
        switch (i13) {
            case 2:
                ConversationQuickRepliesContainer c93 = o0Var.c9();
                String K3 = f30Var.K3();
                category = K3 != null ? K3 : "";
                Intrinsics.checkNotNullParameter(category, "category");
                c93.f45618c = category;
                String K32 = f30Var.K3();
                if (K32 != null && K32.length() != 0) {
                    o0Var.c9().removeAllViews();
                    o0Var.c9().a();
                }
                k3.R1(o0Var.c9(), true);
                HorizontalScrollView horizontalScrollView = o0Var.D1;
                if (horizontalScrollView == null) {
                    Intrinsics.r("quickReplyHScrollView");
                    throw null;
                }
                k3.R1(horizontalScrollView, true);
                ConversationQuickRepliesContainer c94 = o0Var.c9();
                String id3 = o0Var.U0;
                if (id3 == null) {
                    Intrinsics.r("conversationId");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(id3, "id");
                c94.f45616a = id3;
                o0Var.c9().f45617b = o0Var.N0;
                return;
            default:
                GestaltText gestaltText = o0Var.I1;
                if (gestaltText == null) {
                    Intrinsics.r("repliesContainerInfoText");
                    throw null;
                }
                gestaltText.i(d.H);
                GestaltText gestaltText2 = o0Var.H1;
                if (gestaltText2 == null) {
                    Intrinsics.r("repliesContainerText");
                    throw null;
                }
                Intrinsics.f(f30Var);
                String z63 = f30Var.z6();
                if (z63 == null || z63.length() == 0) {
                    String r43 = f30Var.r4();
                    if (r43 == null || r43.length() == 0) {
                        String c43 = f30Var.c4();
                        if (c43 == null || c43.length() == 0) {
                            String N3 = f30Var.N3();
                            if (N3 != null && N3.length() != 0) {
                                category = String.valueOf(f30Var.N3());
                            }
                        } else {
                            category = String.valueOf(f30Var.c4());
                        }
                    } else {
                        category = String.valueOf(f30Var.r4());
                    }
                } else {
                    category = String.valueOf(f30Var.z6());
                }
                pk.a0.p(gestaltText2, category);
                WebImageView webImageView = o0Var.G1;
                if (webImageView == null) {
                    Intrinsics.r("repliesContainerPinImage");
                    throw null;
                }
                webImageView.U1(eo1.c.lego_corner_radius_small);
                webImageView.setBackgroundColor(bs1.c.B(webImageView, eo1.b.color_themed_light_gray));
                webImageView.M1(kh2.d.p(1));
                webImageView.a2(true);
                webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                webImageView.o0(bs1.c.B(webImageView, eo1.b.color_white_0));
                GestaltIconButton gestaltIconButton = o0Var.F1;
                if (gestaltIconButton == null) {
                    Intrinsics.r("repliesContainerCloseButton");
                    throw null;
                }
                gestaltIconButton.u(new h0(o0Var, 2));
                WebImageView webImageView2 = o0Var.G1;
                if (webImageView2 == null) {
                    Intrinsics.r("repliesContainerPinImage");
                    throw null;
                }
                webImageView2.loadUrl(bs1.c.p0(f30Var));
                if (o0Var.W8().b()) {
                    o0Var.f9().X(d.I);
                    k3.R1(o0Var.d9(), true);
                    return;
                } else {
                    o0Var.b9().X(d.f84268J);
                    k3.R1(o0Var.d9(), true);
                    o0Var.q9();
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        aq0.h hVar;
        nm.s v13;
        List j13;
        h1 h1Var;
        int i13 = this.f84347i;
        o0 o0Var = this.f84348j;
        switch (i13) {
            case 0:
                tt1.a aVar = (tt1.a) obj;
                nm.u uVar = (nm.u) aVar.c();
                String a13 = aVar.a();
                Intrinsics.checkNotNullExpressionValue(a13, "getBookmark(...)");
                int i14 = o0.R1;
                o0Var.getClass();
                b1 b1Var = o0Var.W0;
                vd0.c cVar = null;
                if (b1Var == null) {
                    Intrinsics.r("conversationThreadViewState");
                    throw null;
                }
                v1 v1Var = b1Var instanceof v1 ? (v1) b1Var : null;
                if ((v1Var == null || (str = v1Var.f84446a) == null) && (str = o0Var.U0) == null) {
                    Intrinsics.r("conversationId");
                    throw null;
                }
                if (uVar != null && (v13 = uVar.v(str)) != null && (v13 instanceof nm.u)) {
                    cVar = new vd0.c((nm.u) v13);
                }
                if (cVar != null) {
                    int j14 = cVar.j(0, "wait") * 1000;
                    r0 = j14 > 0 ? j14 : 1000;
                    Boolean h10 = cVar.h("fetch", Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
                    if (h10.booleanValue() && (hVar = o0Var.P0) != null) {
                        ((dq0.p) hVar).N3();
                    }
                }
                o0Var.f84389l1 = a13;
                o0Var.R0.postDelayed(o0Var.P1, r0);
                return Unit.f80348a;
            case 1:
                ue it = (ue) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                h32.l1 l1Var = h32.l1.UNREAD_MESSAGE_OPEN;
                int i15 = o0.R1;
                o0Var.o9(l1Var);
                return Unit.f80348a;
            case 2:
                b((f30) obj);
                return Unit.f80348a;
            case 3:
                om1.c state = (om1.c) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return om1.c.e(state, null, null, null, null, null, df.j1.U0(o0Var.f9().t0()), 0, 991);
            case 4:
                b((f30) obj);
                return Unit.f80348a;
            case 5:
                xn1.j event = (xn1.j) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xn1.i) {
                    o0Var.m9(((xn1.i) event).f135454c);
                }
                return Unit.f80348a;
            case 6:
                o0Var.V0 = (z40.n) obj;
                fo1.a i73 = o0Var.i7();
                if (i73 != null) {
                    o0Var.S7(i73);
                }
                z40.n nVar = o0Var.V0;
                if (nVar != null && (j13 = kh2.d.j1(nVar)) != null && (!j13.isEmpty()) && (h1Var = o0Var.f84402y1) != null) {
                    h1Var.a(j13);
                }
                return Unit.f80348a;
            default:
                Intrinsics.checkNotNullParameter((View) obj, "<anonymous parameter 0>");
                r41.k kVar = r41.k.f106176a;
                String str2 = (String) CollectionsKt.firstOrNull(o0Var.f84385h1);
                if (str2 == null) {
                    str2 = "";
                }
                kVar.d(str2, r41.b.ConversationMessages);
                return Unit.f80348a;
        }
    }
}
