package mh1;

import com.pinterest.api.model.az0;
import com.pinterest.api.model.ge;
import com.pinterest.api.model.hx0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z2;
import kotlin.jvm.internal.Intrinsics;
import ob2.f;
import rh1.z;
import vq0.h;
import yk1.n;

/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f87164b;

    public c(d dVar, int i13) {
        this.f87163a = i13;
        this.f87164b = dVar;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        int i14 = this.f87163a;
        d dVar = this.f87164b;
        switch (i14) {
            case 0:
                z view = (z) nVar;
                z2 model = (z2) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                d.e0(dVar, view, new rp0.b(model), i13);
                break;
            case 1:
                z view2 = (z) nVar;
                az0 model2 = (az0) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                d.e0(dVar, view2, new rp0.c(model2), i13);
                break;
            case 2:
                z view3 = (z) nVar;
                hx0 model3 = (hx0) obj;
                Intrinsics.checkNotNullParameter(view3, "view");
                Intrinsics.checkNotNullParameter(model3, "model");
                dVar.getClass();
                view3.K(model3);
                break;
            default:
                z view4 = (z) nVar;
                ge model4 = (ge) obj;
                Intrinsics.checkNotNullParameter(view4, "view");
                Intrinsics.checkNotNullParameter(model4, "model");
                dVar.getClass();
                view4.Q(model4);
                break;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        int i14 = this.f87163a;
        d dVar = this.f87164b;
        switch (i14) {
            case 0:
                z2 model = (z2) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                wy0 b03 = model.b0();
                if (b03 == null) {
                    return null;
                }
                dVar.getClass();
                return ((yk1.a) dVar.N).f139224a.getString(f.content_description_comment_by_user, dl2.b.j1(b03));
            case 1:
                az0 model2 = (az0) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                wy0 U = model2.U();
                if (U == null) {
                    return null;
                }
                dVar.getClass();
                return ((yk1.a) dVar.N).f139224a.getString(f.content_description_comment_by_user, dl2.b.j1(U));
            case 2:
                Intrinsics.checkNotNullParameter((hx0) obj, "model");
                return "comment header count";
            default:
                Intrinsics.checkNotNullParameter((ge) obj, "model");
                return "community insight header";
        }
    }
}
