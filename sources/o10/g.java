package o10;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.oc0;
import com.pinterest.api.model.ow;
import com.pinterest.api.model.wy0;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final g f92772a = new g();

    private g() {
    }

    @Override // o10.e
    public final void a(s sVar, ow modelStorage) {
        s h10;
        s i13;
        s g13;
        f30 model = (f30) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        modelStorage.a(model);
        s D3 = model.D3();
        if (D3 != null) {
            modelStorage.a(D3);
        }
        s j63 = model.j6();
        if (j63 != null) {
            modelStorage.a(j63);
        }
        oc0 d63 = model.d6();
        if (d63 != null && (g13 = d63.g()) != null) {
            modelStorage.a(g13);
        }
        oc0 d64 = model.d6();
        if (d64 != null && (i13 = d64.i()) != null) {
            modelStorage.a(i13);
        }
        oc0 d65 = model.d6();
        if (d65 != null && (h10 = d65.h()) != null) {
            modelStorage.a(h10);
        }
        s I5 = model.I5();
        if (I5 != null) {
            modelStorage.a(I5);
        }
        s C5 = model.C5();
        if (C5 != null) {
            modelStorage.a(C5);
        }
        s z53 = model.z5();
        if (z53 != null) {
            modelStorage.a(z53);
        }
        s y63 = model.y6();
        if (y63 != null) {
            modelStorage.a(y63);
        }
        Intrinsics.checkNotNullParameter(model, "<this>");
        wy0 a63 = model.a6();
        if (a63 == null) {
            a63 = null;
        } else if (a63.Z2() == null && model.I5() != null) {
            a63 = model.I5();
        }
        if (a63 != null) {
            modelStorage.a(a63);
        }
        s J6 = model.J6();
        if (J6 != null) {
            modelStorage.a(J6);
        }
        s t63 = model.t6();
        if (t63 != null) {
            modelStorage.a(t63);
        }
        s z33 = model.z3();
        if (z33 != null) {
            modelStorage.a(z33);
        }
    }
}
