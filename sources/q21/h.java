package q21;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pincells.fixedsize.view.FixedSizePinOverlayView;
import h32.u0;
import java.util.ArrayList;
import java.util.List;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import nx.v;
import qa2.d0;
import uj2.q;

/* loaded from: classes5.dex */
public final class h extends LinearLayout implements o21.f, v {

    /* renamed from: a, reason: collision with root package name */
    public final String f102156a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102157b;

    /* renamed from: c, reason: collision with root package name */
    public p21.g f102158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String pinImageSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinImageSize, "pinImageSize");
        this.f102156a = pinImageSize;
        this.f102157b = getResources().getDimensionPixelSize(r0.margin_three_quarter);
        setOrientation(0);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!Intrinsics.d(childAt.getTag(), "action_overlay")) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final /* bridge */ /* synthetic */ Object markImpressionStart() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        p21.g gVar;
        String str;
        k21.b overlayActionListener;
        super.onSizeChanged(i13, i14, i15, i16);
        if (i13 == i15 || (gVar = this.f102158c) == null || !gVar.isBound()) {
            return;
        }
        List list = gVar.f98719b;
        int size = list.size();
        int size2 = list.size();
        int i17 = 1;
        int i18 = this.f102157b;
        o21.e eVar = gVar.f98720c;
        int i19 = 0;
        int max = (size2 == 1 && eVar.f92828i) ? Math.max(0, ml2.c.c(((i13 / 2) - ((size - 1) * i18)) / size)) : Math.max(0, ml2.c.c((i13 - ((size - 1) * i18)) / size));
        int b13 = ml2.c.b(max * eVar.f92820a);
        h hVar = (h) ((o21.f) gVar.getView());
        int childCount = hVar.getChildCount();
        int i23 = 0;
        while (true) {
            if (i23 >= childCount) {
                break;
            }
            View childAt = hVar.getChildAt(i23);
            a aVar = childAt instanceof a ? (a) childAt : null;
            if (aVar != null) {
                ((d) aVar).g(max, b13);
            }
            i23++;
        }
        int size3 = list.size();
        int i24 = 0;
        while (i24 < size3) {
            int i25 = i24 == list.size() - i17 ? i17 : i19;
            boolean z13 = eVar.f92821b;
            int i26 = (!z13 || i25 == 0) ? i19 : i17;
            ze1.a aVar2 = eVar.f92823d;
            ze1.b f03 = aVar2 != null ? g3.f0((f30) list.get(i24), aVar2) : null;
            f30 f30Var = (f30) list.get(i24);
            int i27 = i25 != 0 ? i19 : i18;
            boolean z14 = (eVar.f92822c && i26 == 0) ? 1 : i19;
            o21.g gVar2 = gVar.f98718a;
            d0 d0Var = gVar2.f92834j;
            List list2 = list;
            nx.d0 d0Var2 = gVar2.f92835k.f122379a;
            int i28 = size3;
            Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
            u0 u0Var = i26 != 0 ? eVar.f92827h : eVar.f92826g;
            boolean z15 = eVar.f92831l;
            q qVar = gVar2.f92836l;
            int i29 = i27;
            int i33 = i18;
            int i34 = i24;
            o21.c viewModel = new o21.c(f30Var, max, b13, i24, i29, z14, d0Var, d0Var2, qVar, eVar.f92824e, gVar2.f92837m, eVar.f92825f, gVar2.f92839o, eVar.f92823d, f03, u0Var, null, gVar2.f92840p, gVar2.f92832h, eVar.f92829j, eVar.f92830k, z15, 131072);
            boolean z16 = z13 && i25 != 0;
            h hVar2 = (h) ((o21.f) gVar.getView());
            hVar2.getClass();
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Context context = hVar2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            d dVar = new d(context, d0Var2, qVar, hVar2.f102156a, 0, null, null, null, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            p21.g gVar3 = gVar;
            o21.e eVar2 = eVar;
            int i35 = max;
            int i36 = b13;
            d.b(dVar, f30Var, i34, viewModel.f92812s, viewModel.f92816w, d0Var, z14, viewModel.f92814u, viewModel.f92813t, viewModel.f92817x, null, viewModel.f92818y, viewModel.f92819z, viewModel.B, viewModel.C, 1024);
            dVar.e(f30Var, z14, viewModel.f92815v, viewModel.B);
            g gVar4 = dVar.f102137l;
            ic0.a aVar3 = viewModel.A;
            if (aVar3 != null) {
                ic0.b bVar = dVar.f102140o;
                if ((bVar != null ? bVar.getParent() : null) != null) {
                    gVar4.removeView(dVar.f102140o);
                }
                Context context2 = dVar.getContext();
                str = "getContext(...)";
                Intrinsics.checkNotNullExpressionValue(context2, str);
                dVar.f102140o = new ic0.b(context2, aVar3);
                Context context3 = dVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, str);
                ic0.b bVar2 = new ic0.b(context3, aVar3);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                int b03 = bs1.c.b0(dVar, eo1.c.space_200);
                Intrinsics.checkNotNullParameter(layoutParams, "<this>");
                com.bumptech.glide.c.a1(layoutParams, b03, b03, b03, b03);
                Unit unit = Unit.f80348a;
                gVar4.addView(bVar2, layoutParams);
            } else {
                str = "getContext(...)";
            }
            ViewGroup.LayoutParams layoutParams2 = dVar.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            com.bumptech.glide.c.a1((LinearLayout.LayoutParams) layoutParams2, 0, 0, i29, 0);
            max = i35;
            dVar.g(max, i36);
            if (z16 && (overlayActionListener = viewModel.f92811r) != null) {
                Intrinsics.checkNotNullParameter(overlayActionListener, "overlayActionListener");
                if (dVar.f102142q == null) {
                    Context context4 = dVar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, str);
                    FixedSizePinOverlayView overlay = new FixedSizePinOverlayView(context4);
                    String messageText = overlay.getContext().getString(viewModel.f92810q);
                    Intrinsics.checkNotNullExpressionValue(messageText, "getString(...)");
                    Intrinsics.checkNotNullParameter(messageText, "messageText");
                    overlay.f47438b.setText(messageText);
                    overlay.a(overlayActionListener);
                    Intrinsics.checkNotNullParameter(overlay, "overlay");
                    if (dVar.f102142q == null) {
                        dVar.f102142q = overlay;
                        gVar4.addView(overlay);
                    }
                }
                dVar.setTag("action_overlay");
            }
            hVar2.addView(dVar);
            i24 = i34 + 1;
            size3 = i28;
            i19 = 0;
            b13 = i36;
            gVar = gVar3;
            eVar = eVar2;
            i18 = i33;
            i17 = 1;
            list = list2;
        }
    }
}
