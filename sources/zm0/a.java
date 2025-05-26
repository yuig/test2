package zm0;

import com.pinterest.api.model.v7;
import com.pinterest.ui.imageview.ProportionalImageView;
import f11.b;
import f11.c;
import i11.d;
import kg.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lp.l;
import pk.a0;
import vq0.h;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f142175a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f142176b;

    /* renamed from: c, reason: collision with root package name */
    public final b f142177c;

    /* renamed from: d, reason: collision with root package name */
    public final c f142178d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f142179e;

    public a(boolean z13, b boardCellItemListener, c cVar, d getHeaderForPosition) {
        Intrinsics.checkNotNullParameter(boardCellItemListener, "boardCellItemListener");
        Intrinsics.checkNotNullParameter(getHeaderForPosition, "getHeaderForPosition");
        this.f142175a = z13;
        this.f142176b = false;
        this.f142177c = boardCellItemListener;
        this.f142178d = cVar;
        this.f142179e = getHeaderForPosition;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        l11.c view = (l11.c) nVar;
        v7 model = (v7) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        view.getClass();
        boolean M0 = kh2.d.M0(model);
        t.O(view.f81388f);
        t.O(view.f81386d);
        t.O(view.f81389g);
        view.f81383a.i(new oo0.b(13));
        boolean z13 = false;
        view.f81397o = false;
        ProportionalImageView proportionalImageView = view.f81384b;
        if (proportionalImageView != null) {
            proportionalImageView.setAlpha(1.0f);
        }
        view.f81383a.i(new oo0.b(10));
        view.f81388f.g2(new oo0.b(11));
        view.f81386d.g2(new oo0.b(12));
        a0.p(view.f81383a, "");
        a0.p(view.f81385c, "");
        ProportionalImageView proportionalImageView2 = view.f81384b;
        if (proportionalImageView2 != null) {
            proportionalImageView2.setImageDrawable(null);
        }
        view.f81391i = model.getUid();
        view.f81396n = i13;
        String j13 = model.j1();
        String str = j13 != null ? j13 : "";
        view.f81392j = str;
        a0.p(view.f81385c, str);
        view.e(model.g1().booleanValue(), model.J0().intValue(), model.I0(), model.k1());
        view.f81388f.g2(new bp.d(M0, 5));
        view.a(bp1.h.l(model).f66450a);
        if (this.f142175a && model.q1().intValue() > 0) {
            z13 = true;
        }
        view.g(z13);
        Integer valueOf = Integer.valueOf(i13);
        Function1 tmp0 = this.f142179e;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        String str2 = (String) tmp0.invoke(valueOf);
        if (str2 != null) {
            view.f81383a.i(new l(str2, 8));
        }
        view.f81393k = this.f142178d;
        view.f81394l = this.f142177c;
        if (this.f142176b && M0) {
            view.f81397o = true;
            ProportionalImageView proportionalImageView3 = view.f81384b;
            if (proportionalImageView3 != null) {
                proportionalImageView3.setAlpha(0.5f);
            }
            view.f81385c.i(new oo0.b(7));
            view.f81388f.g2(new oo0.b(8));
            view.f81386d.g2(new oo0.b(9));
            t.O(view.f81389g);
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        v7 model = (v7) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        String j13 = model.j1();
        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
        return j13;
    }
}
