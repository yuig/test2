package u51;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.cd0;
import com.pinterest.api.model.kd0;
import com.pinterest.api.model.zc0;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.d4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import sq0.c0;
import x02.i2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu51/i;", "Lyq0/b0;", "", "<init>", "()V", "didit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i extends a<Object> implements c0 {
    public static final /* synthetic */ int L0 = 0;
    public uk1.e A0;
    public a12.d B0;
    public i2 C0;
    public i92.k D0;
    public a11.n E0;
    public String F0;
    public String G0;
    public String H0;
    public String I0;
    public boolean J0;
    public final d4 K0 = d4.PIN_COMMENTS;

    /* renamed from: z0, reason: collision with root package name */
    public a11.d f120629z0;

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(1, new b01.c(21, this, requireContext));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Drawable drawable;
        Drawable drawable2;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.space_600);
        BitmapDrawable bitmapDrawable = null;
        if (this.J0) {
            rm1.q qVar = rm1.q.ARROW_BACK;
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
            Context context = gestaltToolbarImpl.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Context context2 = gestaltToolbarImpl.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            qVar.drawableRes(context, dl2.b.f1(context2));
            Context context3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
            int i13 = sm1.b.ic_arrow_back_gestalt;
            int i14 = eo1.b.color_themed_text_default;
            Intrinsics.checkNotNullParameter(context3, "context");
            Object obj = d5.a.f53679a;
            Drawable drawable3 = context3.getDrawable(i13);
            Intrinsics.checkNotNullParameter(context3, "context");
            if (drawable3 != null) {
                drawable2 = sh.f.d(i14 == 0 ? context3.getColor(df0.a.f54892a) : context3.getColor(i14), context3, drawable3);
            } else {
                drawable2 = null;
            }
            if (drawable2 != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                bitmapDrawable = d7.b.p0(drawable2, resources, dimensionPixelSize, dimensionPixelSize);
            }
            String string = getString(x0.back);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            gestaltToolbarImpl.T(bitmapDrawable, string);
        } else {
            rm1.q qVar2 = rm1.q.CANCEL;
            GestaltToolbarImpl gestaltToolbarImpl2 = (GestaltToolbarImpl) toolbar;
            Context context4 = gestaltToolbarImpl2.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            Context context5 = gestaltToolbarImpl2.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            int drawableRes = qVar2.drawableRes(context4, dl2.b.f1(context5));
            Context context6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(context6, "requireContext(...)");
            int i15 = eo1.b.color_themed_text_default;
            Intrinsics.checkNotNullParameter(context6, "context");
            Object obj2 = d5.a.f53679a;
            Drawable drawable4 = context6.getDrawable(drawableRes);
            Intrinsics.checkNotNullParameter(context6, "context");
            if (drawable4 != null) {
                drawable = sh.f.d(i15 == 0 ? context6.getColor(df0.a.f54892a) : context6.getColor(i15), context6, drawable4);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                bitmapDrawable = d7.b.p0(drawable, resources2, dimensionPixelSize, dimensionPixelSize);
            }
            String string2 = getString(x0.cancel);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            gestaltToolbarImpl2.T(bitmapDrawable, string2);
        }
        GestaltToolbarImpl toolbar2 = (GestaltToolbarImpl) toolbar;
        toolbar2.o();
        toolbar2.Y(qf0.c.activity_display_report_comment);
        toolbar2.a0(getString(qf0.c.activity_display_report_comment));
        toolbar2.m();
        Intrinsics.checkNotNullParameter(toolbar2, "toolbar");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        if (navigation == null) {
            throw new IllegalArgumentException("Null navigation in ReportAggregatedCommentOptionsFragment");
        }
        String f49940b = navigation.getF49940b();
        this.F0 = f49940b;
        vb0.j.f125466a.N(f49940b, "a valid AggregatedComment id must be passed through the navigation object", new Object[0]);
        Object i03 = navigation.i0("com.pinterest.EXTRA_COMMENT_REPORT_REASON");
        cd0 cd0Var = i03 instanceof cd0 ? (cd0) i03 : null;
        ?? r13 = q0.f80391a;
        if (cd0Var != null) {
            this.J0 = true;
            List I = cd0Var.I();
            Intrinsics.checkNotNullExpressionValue(I, "getSecondaryReasons(...)");
            List<kd0> list = I;
            r13 = new ArrayList(g0.q(list, 10));
            for (kd0 kd0Var : list) {
                zc0 y13 = cd0.y();
                y13.l(q0.f80391a);
                y13.i(kd0Var.v());
                y13.h(kd0Var.u());
                y13.k(kd0Var.x());
                y13.m(kd0Var.y());
                y13.c(kd0Var.p());
                y13.b(kd0Var.o());
                y13.f(kd0Var.s());
                y13.g(kd0Var.t());
                y13.d(kd0Var.q());
                y13.e(kd0Var.r());
                y13.j(kd0Var.w());
                r13.add(y13.a());
            }
        }
        List list2 = r13;
        uk1.e eVar = this.A0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        a12.d dVar = this.B0;
        if (dVar == null) {
            Intrinsics.r("aggregatedCommentService");
            throw null;
        }
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_COMMENT_TYPE") : null;
        String str = v03 == null ? "" : v03;
        String str2 = this.F0;
        Intrinsics.f(str2);
        return new ql0.a(g13, p73, dVar, str, str2, list2);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getT0() {
        return this.K0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(qf0.b.fragment_report_aggregated_comment_reason_items, qf0.a.p_recycler_view);
        eVar.f979c = qf0.a.empty_state_container;
        eVar.b(qf0.a.loading_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a11.d dVar = this.f120629z0;
        if (dVar != null) {
            this.E0 = dVar.a(s7());
        } else {
            Intrinsics.r("clickThroughHelperFactory");
            throw null;
        }
    }

    @Override // yq0.t, yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("com.pinterest.EXTRA_PIN_ID", this.H0);
        String str = this.I0;
        if (str != null) {
            outState.putString("com.pinterest.EXTRA_USERNAME", str);
        }
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        int i13 = 1;
        v13.setClickable(true);
        v13.setBackground(bs1.c.f0(v13, eo1.d.lego_card_rounded_top_and_bottom, null, null, 6));
        int W = bs1.c.W(v13, eo1.c.lego_spacing_horizontal_small);
        int i14 = 0;
        v13.setPaddingRelative(W, 0, W, 0);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.D(requireActivity);
        Navigation navigation = this.I;
        if (navigation == null) {
            throw new IllegalArgumentException("Null navigation in ReportAggregatedCommentOptionsFragment");
        }
        if (bundle == null) {
            Object i03 = navigation.i0("com.pinterest.EXTRA_PIN_ID");
            Intrinsics.g(i03, "null cannot be cast to non-null type kotlin.String");
            string = (String) i03;
        } else {
            string = bundle.getString("com.pinterest.EXTRA_PIN_ID", "");
        }
        this.H0 = string;
        this.I0 = bundle == null ? (String) navigation.i0("com.pinterest.EXTRA_USERNAME") : bundle.getString("com.pinterest.EXTRA_USERNAME", "");
        String str = this.H0;
        if (str == null || str.length() == 0) {
            return;
        }
        i2 i2Var = this.C0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        String str2 = this.H0;
        Intrinsics.f(str2);
        xj2.c F = i2Var.P(str2).H(tk2.e.f118017c).A(wj2.c.a()).F(new b(4, new g(this, i14)), new b(5, new g(this, i13)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        R6(F);
    }
}
