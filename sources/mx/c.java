package mx;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import c92.n;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pk.a0;
import pp1.k;
import pp1.l;
import pp1.m;
import u50.h0;

/* loaded from: classes3.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88447i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f88448j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f88449k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h hVar, k kVar, int i13) {
        super(0);
        this.f88447i = i13;
        this.f88448j = hVar;
        this.f88449k = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f88447i) {
            case 0:
                m191invoke();
                break;
            case 1:
                m191invoke();
                break;
            default:
                m191invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m191invoke() {
        FrameLayout.LayoutParams layoutParams;
        int i13 = this.f88447i;
        k kVar = this.f88449k;
        h hVar = this.f88448j;
        switch (i13) {
            case 0:
                int i14 = h.f88457l0;
                pp1.f Y7 = hVar.Y7();
                n content = ((pp1.i) kVar).f100927a;
                Y7.getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                boolean z13 = content.f27018a;
                if (z13) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                }
                ConstraintLayout constraintLayout = Y7.f100924f;
                constraintLayout.setLayoutParams(layoutParams);
                if (!z13) {
                    p pVar = new p();
                    pVar.j(constraintLayout);
                    pVar.n(sp1.c.handshake_bottom_sheet_content, -2);
                    pVar.b(constraintLayout);
                }
                boolean z14 = content instanceof l;
                FrameLayout frameLayout = Y7.f100925g;
                if (z14) {
                    l lVar = (l) content;
                    frameLayout.removeAllViews();
                    View inflate = View.inflate(Y7.getContext(), lVar.f100929b, null);
                    View findViewById = inflate.findViewById(sp1.c.variant_1_title);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    View findViewById2 = inflate.findViewById(sp1.c.variant_1_benefit1);
                    Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                    View findViewById3 = inflate.findViewById(sp1.c.variant_1_benefit2);
                    Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                    View findViewById4 = inflate.findViewById(sp1.c.handshake_disclosure);
                    Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                    a0.q((GestaltText) findViewById, lVar.f100930c);
                    int i15 = 24;
                    ((GestaltText) findViewById2).i(new an1.i(lVar.f100931d, i15));
                    ((GestaltText) findViewById3).i(new an1.i(lVar.f100932e, i15));
                    a0.q((GestaltText) findViewById4, lVar.f100933f);
                    frameLayout.addView(inflate);
                } else if (content instanceof m) {
                    m mVar = (m) content;
                    frameLayout.removeAllViews();
                    View inflate2 = View.inflate(Y7.getContext(), mVar.f100934b, null);
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate2.findViewById(sp1.c.scroll_content);
                    for (pp1.b bVar : mVar.f100935c) {
                        Intrinsics.f(linearLayoutCompat);
                        bVar.getClass();
                        h0 h0Var = h0.f120562a;
                        Context context = Y7.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                        gestaltText.i(new fx.e(17, h0Var));
                        gestaltText.setPaddingRelative(0, gestaltText.getResources().getDimensionPixelSize(sp1.b.space_benefit_section), 0, 0);
                        linearLayoutCompat.addView(gestaltText);
                        Context context2 = Y7.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
                        gestaltText2.i(new fx.e(16, h0Var));
                        linearLayoutCompat.addView(gestaltText2);
                    }
                    frameLayout.addView(inflate2);
                }
                ViewGroup.LayoutParams layoutParams2 = Y7.getLayoutParams();
                androidx.coordinatorlayout.widget.c cVar = layoutParams2 instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams2 : null;
                if (cVar != null) {
                    cVar.d(Y7.f100926h);
                    break;
                }
                break;
            case 1:
                int i16 = h.f88457l0;
                pp1.f Y72 = hVar.Y7();
                pp1.g expandAction = (pp1.g) kVar;
                Y72.getClass();
                Intrinsics.checkNotNullParameter(expandAction, "expandAction");
                Y72.post(new a11.p(21, Y72, expandAction));
                break;
            default:
                int i17 = h.f88457l0;
                pp1.f Y73 = hVar.Y7();
                pp1.h expandAction2 = (pp1.h) kVar;
                Y73.getClass();
                Intrinsics.checkNotNullParameter(expandAction2, "expandAction");
                Y73.setVisibility(0);
                Y73.f100926h.W(Y73.getHeight());
                Y73.post(new a11.p(20, Y73, expandAction2));
                break;
        }
    }
}
