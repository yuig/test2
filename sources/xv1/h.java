package xv1;

import android.view.View;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.o00;
import java.util.List;
import kh2.g3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.k2;
import m60.w;
import t3.s1;

/* loaded from: classes4.dex */
public final class h extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final ov1.a f136053a;

    /* renamed from: b, reason: collision with root package name */
    public final z61.b f136054b;

    /* renamed from: c, reason: collision with root package name */
    public final uk1.d f136055c;

    /* renamed from: d, reason: collision with root package name */
    public final w f136056d;

    /* renamed from: e, reason: collision with root package name */
    public final int f136057e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f136058f;

    /* renamed from: g, reason: collision with root package name */
    public final k2 f136059g;

    /* renamed from: h, reason: collision with root package name */
    public Function0 f136060h;

    public h(g00 g00Var, ov1.a internalModuleListener, z61.b bVar, uk1.d presenterPinalytics, w eventManager, int i13, boolean z13, k2 oneBarLibraryExperiments) {
        Intrinsics.checkNotNullParameter(internalModuleListener, "internalModuleListener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(oneBarLibraryExperiments, "oneBarLibraryExperiments");
        this.f136053a = internalModuleListener;
        this.f136054b = bVar;
        this.f136055c = presenterPinalytics;
        this.f136056d = eventManager;
        this.f136057e = i13;
        this.f136058f = z13;
        this.f136059g = oneBarLibraryExperiments;
        this.f136060h = d.f136030j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        l lVar;
        Boolean bool;
        vv1.i view = (vv1.i) nVar;
        g00 model = (g00) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        View view2 = view instanceof View ? (View) view : null;
        if (view2 != null) {
            yk1.m j13 = s1.j(view2);
            if (!(j13 instanceof l)) {
                j13 = null;
            }
            lVar = (l) j13;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            lVar.u3(model);
            lVar.v3(i13);
            Function0 function0 = this.f136060h;
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            lVar.f136084f = function0;
            o00 v13 = model.v();
            if (v13 != null) {
                q42.a aVar = q42.c.Companion;
                Integer r13 = v13.r();
                Intrinsics.checkNotNullExpressionValue(r13, "getIcon(...)");
                int intValue = r13.intValue();
                aVar.getClass();
                q42.c a13 = q42.a.a(intValue);
                int g03 = g3.g0(a13);
                if (v13.q()) {
                    String p13 = v13.p();
                    if (p13 == null) {
                        p13 = "";
                    }
                    view.l0(p13);
                    if (p13.length() == 0) {
                        view.K4(a13);
                    } else {
                        view.i1(p13);
                    }
                }
                List o13 = v13.o();
                List y13 = v13.y();
                if (o13 != null && y13 != null) {
                    view.G3(o13, y13);
                }
                vv1.i.E5(view, g03, a13, false, 12);
                view.F(v13.t());
                String t13 = v13.t();
                view.F4(Integer.valueOf((t13 == null || t13.length() == 0) ^ true ? m42.a.one_bar_module_cover_image_padding : ga2.b.lego_button_small_side_padding), Integer.valueOf(ga2.b.lego_button_small_side_padding));
                view.l4();
            }
            if (!(view instanceof yv1.j)) {
                o00 v14 = model.v();
                view.H6(com.bumptech.glide.d.o0(v14 != null ? v14.v() : null));
                return;
            }
            q42.d dVar = q42.f.Companion;
            Integer w13 = model.w();
            Intrinsics.checkNotNullExpressionValue(w13, "getModuleType(...)");
            int intValue2 = w13.intValue();
            dVar.getClass();
            view.B2(q42.d.a(intValue2) == q42.f.SEARCH_FOR_YOU);
            o00 v15 = model.v();
            if (v15 == null || (bool = v15.v()) == null) {
                bool = Boolean.FALSE;
            }
            view.s3(bool.booleanValue(), true);
        }
    }

    @Override // vq0.h
    public final yk1.m f() {
        return new g(this.f136053a, this.f136054b, this.f136055c, this.f136056d, this.f136058f, this.f136057e, this.f136059g);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        g00 model = (g00) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
