package pk0;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bp.j;
import bs1.c;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gb;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import com.pinterest.feature.board.detail.contenttab.view.BoardIdeasPreviewDetailedView;
import com.pinterest.feature.bubbles.view.BubbleContentSeparatorCellView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d70.g;
import dl1.s;
import fe1.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import vq0.h;
import yk1.n;
import zd1.e;
import zp.c0;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100533a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f100534b;

    public a(int i13, Function0 titleQueryParameter) {
        this.f100533a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(titleQueryParameter, "titleQueryParameter");
            this.f100534b = titleQueryParameter;
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(titleQueryParameter, "isEligibleToDisplayView");
            this.f100534b = titleQueryParameter;
        } else {
            Intrinsics.checkNotNullParameter(titleQueryParameter, "getRules");
            this.f100534b = titleQueryParameter;
        }
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        String B0;
        String e13;
        Unit unit = null;
        switch (this.f100533a) {
            case 0:
                BoardIdeasPreviewDetailedView view = (BoardIdeasPreviewDetailedView) nVar;
                vh story = (vh) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(story, "story");
                if (!((Boolean) this.f100534b.invoke()).booleanValue()) {
                    c.X0(view);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.width = 0;
                    layoutParams.height = 0;
                    view.setLayoutParams(layoutParams);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (s sVar : story.f42865w) {
                    if ((sVar instanceof f30) && (B0 = c.B0((f30) sVar)) != null && B0.length() != 0) {
                        arrayList.add(B0);
                    }
                }
                dl0.b state = new dl0.b(arrayList);
                view.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                String string = view.getResources().getString(g.find_more_ideas);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                GestaltText gestaltText = view.f45193b;
                a0.p(gestaltText, string);
                view.f45194c.d(new ok0.a(state, 0));
                List y03 = CollectionsKt.y0(arrayList, 3);
                List list = view.f45195d;
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (i14 < 0 || i14 >= y03.size()) {
                        ((WebImageView) list.get(i14)).setVisibility(8);
                    } else {
                        ((WebImageView) list.get(i14)).loadUrl((String) y03.get(i14));
                        ((WebImageView) list.get(i14)).setVisibility(0);
                    }
                }
                if (state.f55195g != null) {
                    gestaltText.i(new ok0.a(state, 1));
                }
                Integer num = state.f55192d;
                if (num != null) {
                    int intValue = num.intValue();
                    LinearLayout linearLayout = view.f45192a;
                    ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.bottomMargin = c.b0(view, intValue);
                    linearLayout.setLayoutParams(marginLayoutParams);
                }
                Integer num2 = state.f55193e;
                Integer num3 = state.f55194f;
                if (num3 == null && num2 == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams3 = gestaltText.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (num3 != null) {
                    marginLayoutParams2.setMarginStart(c.b0(view, num3.intValue()));
                }
                if (num2 != null) {
                    marginLayoutParams2.bottomMargin = c.b0(view, num2.intValue());
                }
                gestaltText.setLayoutParams(marginLayoutParams2);
                return;
            case 1:
                BubbleContentSeparatorCellView view2 = (BubbleContentSeparatorCellView) nVar;
                gb model = (gb) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f38015a;
                if (str != null) {
                    GestaltText gestaltText2 = view2.f45414c;
                    if (gestaltText2 == null) {
                        Intrinsics.r("bubbleTextSeparatorTextview");
                        throw null;
                    }
                    gestaltText2.i(new kl0.c(str, 13));
                }
                ih ihVar = model.f38018d;
                if (ihVar != null && (e13 = ihVar.e()) != null) {
                    Uri parse = Uri.parse(e13);
                    String str2 = (String) this.f100534b.invoke();
                    if (!parse.getQueryParameterNames().contains("title") && str2 != null && str2.length() != 0) {
                        parse = parse.buildUpon().appendQueryParameter("title", str2).build();
                    }
                    ih ihVar2 = model.f38018d;
                    if (ihVar2 != null) {
                        ihVar2.x(parse.toString());
                    }
                }
                ih ihVar3 = model.f38018d;
                String g13 = ihVar3 != null ? ihVar3.g() : null;
                ih ihVar4 = model.f38018d;
                String e14 = ihVar4 != null ? ihVar4.e() : null;
                view2.getClass();
                boolean z13 = !(g13 == null || g13.length() == 0);
                boolean z14 = !(e14 == null || e14.length() == 0);
                GestaltButton gestaltButton = view2.f45415d;
                if (gestaltButton == null) {
                    Intrinsics.r("actionButton");
                    throw null;
                }
                gestaltButton.d(new c0(2, z13, z14));
                if (z13 && z14) {
                    GestaltButton gestaltButton2 = view2.f45415d;
                    if (gestaltButton2 == null) {
                        Intrinsics.r("actionButton");
                        throw null;
                    }
                    gestaltButton2.d(new kl0.c(g13, 12));
                    GestaltButton gestaltButton3 = view2.f45415d;
                    if (gestaltButton3 != null) {
                        gestaltButton3.e(new j(27, view2, e14));
                        return;
                    } else {
                        Intrinsics.r("actionButton");
                        throw null;
                    }
                }
                return;
            default:
                d view3 = (d) nVar;
                e model2 = (e) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                List list2 = (List) this.f100534b.invoke();
                if (list2 != null) {
                    c.R1(view3, list2.size() > 1 && CollectionsKt.L(list2, model2.f141704a));
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    c.R1(view3, false);
                    return;
                }
                return;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f100533a) {
            case 0:
                vh model = (vh) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            case 1:
                gb model2 = (gb) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
            default:
                e model3 = (e) obj;
                Intrinsics.checkNotNullParameter(model3, "model");
                break;
        }
        return null;
    }
}
