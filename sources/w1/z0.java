package w1;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.pinterest.api.model.AggregatedCommentFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127587i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f127588j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f127589k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f127590l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f127591m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i13, List list, List list2, List list3) {
        super(1);
        this.f127587i = 6;
        this.f127588j = list;
        this.f127590l = i13;
        this.f127591m = list2;
        this.f127589k = list3;
    }

    public final Boolean b(q3.g gVar) {
        int i13 = this.f127587i;
        int i14 = this.f127590l;
        Object obj = this.f127589k;
        Object obj2 = this.f127591m;
        Object obj3 = this.f127588j;
        switch (i13) {
            case 2:
                boolean J2 = androidx.compose.ui.focus.a.J((z2.z) obj3, (z2.z) obj2, i14, (Function1) obj);
                Boolean valueOf = Boolean.valueOf(J2);
                if (J2 || !gVar.a()) {
                    return valueOf;
                }
                return null;
            default:
                boolean I = androidx.compose.ui.focus.a.I(i14, (z2.z) obj3, (a3.d) obj2, (Function1) obj);
                Boolean valueOf2 = Boolean.valueOf(I);
                if (I || !gVar.a()) {
                    return valueOf2;
                }
                return null;
        }
    }

    public final void e(q3.b1 b1Var) {
        int i13 = this.f127587i;
        int i14 = this.f127590l;
        Object obj = this.f127589k;
        Object obj2 = this.f127591m;
        Object obj3 = this.f127588j;
        switch (i13) {
            case 0:
                q3.r0 r0Var = (q3.r0) obj3;
                a1 a1Var = (a1) obj2;
                int i15 = a1Var.f127147c;
                r2 r2Var = (r2) a1Var.f127149e.invoke();
                q3.c1 c1Var = (q3.c1) obj;
                a3.d j13 = g1.j(r0Var, i15, a1Var.f127148d, r2Var != null ? r2Var.f127471a : null, r0Var.getLayoutDirection() == n4.k.Rtl, c1Var.f102178a);
                m1.f1 f1Var = m1.f1.Horizontal;
                int i16 = c1Var.f102178a;
                p2 p2Var = a1Var.f127146b;
                p2Var.a(f1Var, j13, i14, i16);
                q3.b1.f(b1Var, c1Var, Math.round(-p2Var.f127443a.h()), 0);
                break;
            default:
                q3.r0 r0Var2 = (q3.r0) obj3;
                a3 a3Var = (a3) obj2;
                int i17 = a3Var.f127152c;
                r2 r2Var2 = (r2) a3Var.f127154e.invoke();
                q3.c1 c1Var2 = (q3.c1) obj;
                a3.d j14 = g1.j(r0Var2, i17, a3Var.f127153d, r2Var2 != null ? r2Var2.f127471a : null, false, c1Var2.f102178a);
                m1.f1 f1Var2 = m1.f1.Vertical;
                int i18 = c1Var2.f102179b;
                p2 p2Var2 = a3Var.f127151b;
                p2Var2.a(f1Var2, j14, i14, i18);
                q3.b1.f(b1Var, c1Var2, 0, Math.round(-p2Var2.f127443a.h()));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127587i;
        int i14 = this.f127590l;
        Object obj2 = this.f127589k;
        Object obj3 = this.f127591m;
        Object obj4 = this.f127588j;
        switch (i13) {
            case 0:
                e((q3.b1) obj);
                return Unit.f80348a;
            case 1:
                e((q3.b1) obj);
                return Unit.f80348a;
            case 2:
                return b((q3.g) obj);
            case 3:
                return b((q3.g) obj);
            case 4:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = rq.p2.f109460t;
                SpannableStringBuilder string = ((rq.p2) obj4).b((String) obj3, i14, (String) obj2, true);
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 5:
                Integer num = (Integer) obj;
                Intrinsics.f(num);
                if (num.intValue() > 0) {
                    lu.n nVar = (lu.n) obj4;
                    if (nVar.f84920j.getLayoutParams().height != num.intValue()) {
                        ViewPager2 viewPager2 = nVar.f84920j;
                        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
                        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.height = num.intValue();
                        viewPager2.setLayoutParams(layoutParams2);
                        ((View) obj3).requestLayout();
                        ((vt.h) obj2).f126599a.f126589p.c(Integer.valueOf(i14));
                    }
                }
                return Unit.f80348a;
            case 6:
                b3.d0 graphicsLayer = (b3.d0) obj;
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                b3.u0 u0Var = (b3.u0) graphicsLayer;
                u0Var.j(((Number) ((List) obj4).get(i14)).floatValue());
                u0Var.E(u0Var.f21372s.b() * ((n4.e) ((List) obj3).get(i14)).f89175a);
                u0Var.F(u0Var.f21372s.b() * ((n4.e) ((List) obj2).get(i14)).f89175a);
                return Unit.f80348a;
            case 7:
                AggregatedCommentFeed aggregatedCommentFeed = (AggregatedCommentFeed) obj;
                Intrinsics.f(aggregatedCommentFeed);
                ((kl2.m) obj4).c(aggregatedCommentFeed, (rp0.d) obj3, Integer.valueOf(i14), (com.pinterest.api.model.z2) obj2);
                return Unit.f80348a;
            default:
                o82.y0 it2 = (o82.y0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                o82.h2 h2Var = (o82.h2) obj4;
                List list = ((o82.y0) obj3).f93756a;
                h2Var.getClass();
                ArrayList H0 = CollectionsKt.H0(o82.h2.h(list));
                H0.add(i14, ((o82.e1) ((o82.q1) obj2)).f93568a);
                Unit unit = Unit.f80348a;
                return o82.y0.f(it2, o82.h2.g(h2Var, H0), o82.t.f93712e, 4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj, Object obj2, int i13, Object obj3, int i14) {
        super(1);
        this.f127587i = i14;
        this.f127588j = obj;
        this.f127591m = obj2;
        this.f127590l = i13;
        this.f127589k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj, Object obj2, Object obj3, int i13, int i14) {
        super(1);
        this.f127587i = i14;
        this.f127588j = obj;
        this.f127591m = obj2;
        this.f127589k = obj3;
        this.f127590l = i13;
    }
}
