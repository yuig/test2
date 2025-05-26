package xv1;

import android.view.View;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.o00;
import df.j1;
import java.util.Iterator;
import java.util.List;
import kh2.g3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import t3.s1;

/* loaded from: classes4.dex */
public final class n extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final ov1.a f136090a;

    /* renamed from: b, reason: collision with root package name */
    public final uk1.d f136091b;

    /* renamed from: c, reason: collision with root package name */
    public final w f136092c;

    /* renamed from: d, reason: collision with root package name */
    public final ov1.e f136093d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f136094e;

    /* renamed from: f, reason: collision with root package name */
    public Function0 f136095f;

    public n(pv1.c oneBarInternalListener, uk1.d presenterPinalytics, w eventManager, ov1.e oneBarContainerSelectionMode) {
        Intrinsics.checkNotNullParameter(oneBarInternalListener, "oneBarInternalListener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(oneBarContainerSelectionMode, "oneBarContainerSelectionMode");
        this.f136090a = oneBarInternalListener;
        this.f136091b = presenterPinalytics;
        this.f136092c = eventManager;
        this.f136093d = oneBarContainerSelectionMode;
        this.f136094e = false;
        this.f136095f = d.f136033m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        m mVar;
        String str;
        List p13;
        Object obj2;
        o00 v13;
        vv1.i view = (vv1.i) nVar;
        g00 model = (g00) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        String str2 = null;
        View view2 = view instanceof View ? (View) view : null;
        if (view2 != null) {
            yk1.m j13 = s1.j(view2);
            if (!(j13 instanceof m)) {
                j13 = null;
            }
            mVar = (m) j13;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            mVar.u3(model);
            mVar.v3(i13);
            Function0 function0 = this.f136095f;
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            mVar.f136084f = function0;
            k00 q13 = model.q();
            if (q13 != null && (p13 = q13.p()) != null) {
                Iterator it = p13.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    o00 v14 = ((g00) obj2).v();
                    if (com.bumptech.glide.d.o0(v14 != null ? v14.v() : null)) {
                        break;
                    }
                }
                g00 g00Var = (g00) obj2;
                if (g00Var != null && (v13 = g00Var.v()) != null) {
                    str2 = v13.p();
                }
            }
            o00 v15 = model.v();
            if (v15 != null) {
                q42.a aVar = q42.c.Companion;
                Integer r13 = v15.r();
                Intrinsics.checkNotNullExpressionValue(r13, "getIcon(...)");
                int intValue = r13.intValue();
                aVar.getClass();
                q42.c a13 = q42.a.a(intValue);
                int g03 = g3.g0(a13);
                if (v15.q()) {
                    if (str2 == null) {
                        str = v15.p();
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = str2;
                    }
                    view.l0(str);
                    if (str.length() == 0) {
                        view.K4(a13);
                    } else {
                        view.i1(str);
                    }
                }
                List o13 = v15.o();
                List y13 = v15.y();
                if (o13 != null && y13 != null) {
                    view.G3(o13, y13);
                }
                vv1.i.E5(view, g03, a13, false, 12);
                view.F(v15.t());
                String t13 = v15.t();
                view.F4(Integer.valueOf((t13 == null || t13.length() == 0) ^ true ? m42.a.one_bar_module_cover_image_padding : ga2.b.lego_button_small_side_padding), Integer.valueOf(ga2.b.lego_button_small_side_padding));
                view.l4();
                if (!(view instanceof yv1.j)) {
                    view.H6(j1.U0(str2));
                } else {
                    view.B2(j1.U0(str2));
                    view.s3(j1.U0(str2), true);
                }
            }
        }
    }

    @Override // vq0.h
    public final yk1.m f() {
        return new m(this.f136090a, this.f136091b, this.f136092c, this.f136093d, this.f136094e);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        g00 model = (g00) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
