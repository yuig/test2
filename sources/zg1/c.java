package zg1;

import a.z0;
import a11.p;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.components.users.LegoUserRep;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.d0;
import nx.v;
import oa2.t;
import q21.d;
import rl1.n;
import uj2.q;
import vn1.g;
import we1.a2;

/* loaded from: classes5.dex */
public final class c extends ConstraintLayout implements v {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f141957d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final f30 f141958a;

    /* renamed from: b, reason: collision with root package name */
    public final d f141959b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f141960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, f30 f30Var, a dimension, d0 pinalytics, q networkStateStream) {
        super(context);
        int i13;
        Integer num;
        int i14;
        LegoUserRep legoUserRep;
        f30 f30Var2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dimension, "dimension");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f141958a = f30Var;
        d dVar = new d(context, pinalytics, networkStateStream, null, eo1.c.lego_image_corner_radius, null, null, null, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM);
        this.f141959b = dVar;
        View.inflate(context, o92.c.article_section_single_pin, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(o92.b.article_section_single_pin_holder);
        FrameLayout frameLayout = (FrameLayout) findViewById;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).G = dimension.getRatio();
        frameLayout.addView(dVar, new FrameLayout.LayoutParams(-1, -1));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f141960c = frameLayout;
        View findViewById2 = findViewById(o92.b.article_section_single_pin_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        View findViewById3 = findViewById(o92.b.article_section_single_pin_user_rep);
        LegoUserRep legoUserRep2 = (LegoUserRep) findViewById3;
        legoUserRep2.y1(ze0.a.List);
        legoUserRep2.M1(g.BODY_100);
        legoUserRep2.r0(false);
        legoUserRep2.t0(false);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        if (f30Var != null) {
            String imageUrl = bs1.c.y0(f30Var);
            if (imageUrl == null || imageUrl.length() == 0) {
                i13 = 1;
                num = null;
                i14 = 0;
                legoUserRep = legoUserRep2;
                f30Var2 = f30Var;
            } else {
                String i43 = f30Var.i4();
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                dVar.f102137l.e4(imageUrl, i43);
                legoUserRep = legoUserRep2;
                d.b(dVar, f30Var, 0, null, null, new z0(f30Var, 13), false, null, null, null, null, false, null, false, false, 32736);
                f30Var2 = f30Var;
                i14 = 0;
                num = null;
                i13 = 1;
                dVar.e(f30Var2, true, null, false);
                String r43 = f30Var.r4();
                if (r43 != null && !z.j(r43)) {
                    gestaltText.i(new qf1.z(r43, 15));
                }
                if (dimension == a.NATURAL) {
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    Intrinsics.g(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ((ConstraintLayout.LayoutParams) layoutParams2).G = bs1.c.z0(f30Var) + ":" + bs1.c.x0(f30Var);
                }
                frameLayout.post(new p(17, dVar, this));
            }
            wy0 n13 = b40.n(f30Var);
            if (n13 != null) {
                String Z2 = n13.Z2();
                LegoUserRep legoUserRep3 = legoUserRep;
                t.i4(legoUserRep3, Z2 == null ? "" : Z2, i14, num, 14);
                Context context2 = legoUserRep3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                rl1.g h10 = n.h(context2);
                String l33 = n13.l3();
                l33 = l33 == null ? "" : l33;
                String U2 = n13.U2();
                legoUserRep3.H0(n.c(h10, l33, U2 != null ? U2 : "", dl2.b.W1(n13)));
                legoUserRep3.setVisibility(i14);
                legoUserRep3.I0(new b(f30Var2, n13, i14));
                legoUserRep3.J1(new b(f30Var2, n13, i13));
            }
        }
        setOnClickListener(new a2(this, 11));
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return e0.b(this.f141959b);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }
}
