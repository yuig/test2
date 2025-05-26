package w82;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import c92.k;
import c92.l;
import c92.m;
import c92.n;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pk.a0;
import u50.h0;

/* loaded from: classes4.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128464i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f128465j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f128466k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i iVar, k kVar, int i13) {
        super(0);
        this.f128464i = i13;
        this.f128465j = iVar;
        this.f128466k = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f128464i) {
            case 0:
                m279invoke();
                break;
            case 1:
                m279invoke();
                break;
            default:
                m279invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m279invoke() {
        FrameLayout.LayoutParams layoutParams;
        int i13 = this.f128464i;
        k kVar = this.f128466k;
        i iVar = this.f128465j;
        switch (i13) {
            case 0:
                int i14 = i.f128474l0;
                c92.f Y7 = iVar.Y7();
                n content = ((c92.i) kVar).f27009a;
                Y7.getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                boolean z13 = content.f27018a;
                if (z13) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                }
                ConstraintLayout constraintLayout = Y7.f27006f;
                constraintLayout.setLayoutParams(layoutParams);
                if (!z13) {
                    p pVar = new p();
                    pVar.j(constraintLayout);
                    pVar.n(x82.c.handshake_bottom_sheet_content, -2);
                    pVar.b(constraintLayout);
                }
                boolean z14 = content instanceof l;
                FrameLayout frameLayout = Y7.f27007g;
                if (z14) {
                    l lVar = (l) content;
                    frameLayout.removeAllViews();
                    View inflate = View.inflate(Y7.getContext(), lVar.f27011b, null);
                    View findViewById = inflate.findViewById(x82.c.variant_1_title);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                    View findViewById2 = inflate.findViewById(x82.c.variant_1_benefit1);
                    Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                    View findViewById3 = inflate.findViewById(x82.c.variant_1_benefit2);
                    Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                    View findViewById4 = inflate.findViewById(x82.c.handshake_disclosure);
                    Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
                    a0.q((GestaltText) findViewById, lVar.f27012c);
                    int i15 = 25;
                    ((GestaltText) findViewById2).i(new s12.a(lVar.f27013d, i15));
                    ((GestaltText) findViewById3).i(new s12.a(lVar.f27014e, i15));
                    a0.q((GestaltText) findViewById4, lVar.f27015f);
                    frameLayout.addView(inflate);
                } else if (content instanceof m) {
                    m mVar = (m) content;
                    frameLayout.removeAllViews();
                    View inflate2 = View.inflate(Y7.getContext(), mVar.f27016b, null);
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate2.findViewById(x82.c.scroll_content);
                    for (c92.b bVar : mVar.f27017c) {
                        Intrinsics.f(linearLayoutCompat);
                        bVar.getClass();
                        h0 h0Var = h0.f120562a;
                        Context context = Y7.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                        gestaltText.i(new fx.e(20, h0Var));
                        gestaltText.setPaddingRelative(0, gestaltText.getResources().getDimensionPixelSize(x82.b.space_benefit_section), 0, 0);
                        linearLayoutCompat.addView(gestaltText);
                        Context context2 = Y7.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        GestaltText gestaltText2 = new GestaltText(6, context2, (AttributeSet) null);
                        gestaltText2.i(new fx.e(19, h0Var));
                        linearLayoutCompat.addView(gestaltText2);
                    }
                    frameLayout.addView(inflate2);
                }
                ViewGroup.LayoutParams layoutParams2 = Y7.getLayoutParams();
                androidx.coordinatorlayout.widget.c cVar = layoutParams2 instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams2 : null;
                if (cVar != null) {
                    cVar.d(Y7.f27008h);
                    break;
                }
                break;
            case 1:
                int i16 = i.f128474l0;
                c92.f Y72 = iVar.Y7();
                c92.g expandAction = (c92.g) kVar;
                Y72.getClass();
                Intrinsics.checkNotNullParameter(expandAction, "expandAction");
                Y72.post(new a11.p(27, Y72, expandAction));
                break;
            default:
                int i17 = i.f128474l0;
                c92.f Y73 = iVar.Y7();
                c92.h expandAction2 = (c92.h) kVar;
                Y73.getClass();
                Intrinsics.checkNotNullParameter(expandAction2, "expandAction");
                Y73.setVisibility(0);
                Y73.f27008h.W(Y73.getHeight());
                Y73.post(new a11.p(26, Y73, expandAction2));
                break;
        }
    }
}
