package w01;

import a.z0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import rq.l2;
import rq.z4;

/* loaded from: classes5.dex */
public final class r0 extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f127103a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f127104b;

    /* renamed from: c, reason: collision with root package name */
    public List f127105c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(uk1.d taggedProductsPresenterPinalytics, uj2.q networkStateStream, String pinId) {
        super(taggedProductsPresenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(taggedProductsPresenterPinalytics, "taggedProductsPresenterPinalytics");
        this.f127103a = pinId;
        m60.w wVar = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f127104b = wVar;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        i01.d0 view = (i01.d0) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3(this.f127105c);
    }

    public final void q3(List list) {
        if (isBound()) {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z4 z4Var = (z4) ((i01.d0) getView());
                z4Var.getClass();
                bs1.c.X0(z4Var);
                z4Var.setPaddingRelative(0, 0, 0, 0);
                return;
            }
            z4 z4Var2 = (z4) ((i01.d0) getView());
            z4Var2.getClass();
            bs1.c.U1(z4Var2);
            z4Var2.a();
            i01.d0 d0Var = (i01.d0) getView();
            int i13 = vc2.f.story_pin_product_tagging;
            z4 z4Var3 = (z4) d0Var;
            if (z4Var3.f109687b == null) {
                String f23 = bs1.c.f2(z4Var3, i13);
                Context context = z4Var3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
                gestaltText.i(new l2(f23, 4));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                com.bumptech.glide.c.a1(layoutParams, bs1.c.W(gestaltText, eo1.c.space_200), bs1.c.W(gestaltText, eo1.c.space_600), 0, bs1.c.Z(gestaltText, m60.r0.margin));
                gestaltText.setLayoutParams(layoutParams);
                dl2.b.y2(gestaltText);
                z4Var3.f109687b = gestaltText;
                z4Var3.setContentDescription(bs1.c.g2(z4Var3, i82.f.closeup_shop_module_description, f23));
                z4Var3.addView(z4Var3.f109687b);
            }
            z0 z0Var = new z0(this, 6);
            List y03 = CollectionsKt.y0(list, 20);
            Intrinsics.checkNotNullParameter(y03, "<this>");
            boolean z13 = true;
            int i14 = 0;
            for (Object obj : CollectionsKt.L0(y03, 2, 2, true)) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                i01.d0 d0Var2 = (i01.d0) getView();
                o21.g viewModel = new o21.g(this.f127103a, (List) obj, z0Var, getPresenterPinalytics(), getNetworkStateStream(), new o21.e(1.0d, true, new ze1.a(false, z13, z13), null, true, null, false, 3826), null, true, 352);
                z4 z4Var4 = (z4) d0Var2;
                z4Var4.getClass();
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                HashMap hashMap = z4Var4.f109688c;
                Integer valueOf = Integer.valueOf(i14);
                Object obj2 = hashMap.get(valueOf);
                if (obj2 == null) {
                    p21.g gVar = new p21.g(viewModel);
                    Context context2 = z4Var4.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    q21.h hVar = new q21.h(context2, "medium");
                    yk1.j.a().d(hVar, gVar);
                    hashMap.put(valueOf, hVar);
                    obj2 = hVar;
                }
                q21.h hVar2 = (q21.h) obj2;
                if (hVar2.getParent() == null) {
                    z4Var4.addView(hVar2);
                }
                i14 = i15;
                z13 = true;
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        i01.d0 view = (i01.d0) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3(this.f127105c);
    }
}
