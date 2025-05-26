package sf1;

import android.graphics.PointF;
import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e1 f112788a;

    public /* synthetic */ w0(e1 e1Var) {
        this.f112788a = e1Var;
    }

    public void a() {
        e1 e1Var = this.f112788a;
        lh0.v1 a03 = e1Var.a0();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) a03.f83491a;
        if (g1Var.o("android_ads_mrc_btr_1px1s", "enabled", z3Var) || g1Var.l("android_ads_mrc_btr_1px1s")) {
            j1 j1Var = e1Var.G;
            boolean z13 = false;
            if (j1Var != null) {
                rf1.p0 p0Var = (rf1.p0) j1Var;
                f30 f30Var = p0Var.Z;
                if (f30Var != null ? ro1.c.f108967f.i(f30Var, p0Var.E, p0Var.B) : false) {
                    z13 = true;
                }
            }
            e1Var.K = z13;
        }
    }

    public void b(float f13, float f14, int i13, int i14) {
        float f15 = f14 + i13;
        e1 e1Var = this.f112788a;
        List list = (List) e1Var.L.get(Integer.valueOf(i14));
        if (list == null) {
            list = new ArrayList();
        }
        list.add(new PointF(f13, f15));
        e1Var.L.put(Integer.valueOf(i14), list);
    }

    public void c(qf1.x sticker) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        j1 j1Var = this.f112788a.G;
        if (j1Var != null) {
            rf1.p0 p0Var = (rf1.p0) j1Var;
            Intrinsics.checkNotNullParameter(sticker, "sticker");
            p0Var.Y3(sticker.f103776b);
            p0Var.d4(sticker);
        }
    }
}
