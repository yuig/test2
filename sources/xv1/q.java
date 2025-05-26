package xv1;

import android.view.View;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.o00;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import t3.s1;

/* loaded from: classes4.dex */
public final class q extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final ov1.a f136104a;

    /* renamed from: b, reason: collision with root package name */
    public final z61.b f136105b;

    /* renamed from: c, reason: collision with root package name */
    public final uk1.d f136106c;

    /* renamed from: d, reason: collision with root package name */
    public final w f136107d;

    /* renamed from: e, reason: collision with root package name */
    public final int f136108e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f136109f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f136110g;

    /* renamed from: h, reason: collision with root package name */
    public Function0 f136111h;

    public q(pv1.c internalModuleListener, z61.b bVar, uk1.d presenterPinalytics, w eventManager, int i13, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(internalModuleListener, "internalModuleListener");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f136104a = internalModuleListener;
        this.f136105b = bVar;
        this.f136106c = presenterPinalytics;
        this.f136107d = eventManager;
        this.f136108e = i13;
        this.f136109f = num;
        this.f136110g = num2;
        this.f136111h = d.f136034n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        l lVar;
        Integer num;
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
            Function0 function0 = this.f136111h;
            Intrinsics.checkNotNullParameter(function0, "<set-?>");
            lVar.f136084f = function0;
            o00 v13 = model.v();
            if (v13 != null) {
                if (v13.q()) {
                    String p13 = v13.p();
                    if (p13 == null) {
                        p13 = "";
                    }
                    view.l0(p13);
                    view.i1(p13);
                }
                List o13 = v13.o();
                List y13 = v13.y();
                if (o13 != null && y13 != null) {
                    view.G3(o13, y13);
                }
                int i14 = ga2.b.lego_button_small_side_padding;
                view.F4(Integer.valueOf(i14), Integer.valueOf(i14));
            }
            o00 v14 = model.v();
            view.H6(com.bumptech.glide.d.o0(v14 != null ? v14.v() : null));
            Integer num2 = this.f136109f;
            if (num2 == null || (num = this.f136110g) == null) {
                return;
            }
            view.Z4(Integer.valueOf(num2.intValue()), Integer.valueOf(num.intValue()));
        }
    }

    @Override // vq0.h
    public final yk1.m f() {
        return new p(this.f136104a, this.f136105b, this.f136106c, this.f136107d, false, this.f136108e);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        g00 model = (g00) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
