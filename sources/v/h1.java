package v;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class h1 implements androidx.camera.core.impl.c3 {

    /* renamed from: b, reason: collision with root package name */
    public final x1 f123499b;

    public h1(Context context) {
        this.f123499b = x1.b(context);
    }

    @Override // androidx.camera.core.impl.c3
    public final androidx.camera.core.impl.v0 a(androidx.camera.core.impl.b3 b3Var, int i13) {
        int i14;
        androidx.camera.core.impl.q1 c13 = androidx.camera.core.impl.q1.c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c1 c1Var = new c1();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int[] iArr = x2.f123743a;
        int i15 = iArr[b3Var.ordinal()];
        int i16 = 3;
        if (i15 != 1) {
            if (i15 == 2) {
                i14 = 3;
            }
            i14 = 1;
        } else {
            if (i13 == 2) {
                i14 = 5;
            }
            i14 = 1;
        }
        c1Var.f123384a = i14;
        c13.s(androidx.camera.core.impl.z2.f17016nn, new androidx.camera.core.impl.o2(new ArrayList(linkedHashSet), new ArrayList(arrayList), new ArrayList(arrayList2), new ArrayList(arrayList3), c1Var.e(), null, null, 0, null));
        c13.s(androidx.camera.core.impl.z2.f17018pn, g1.f123465a);
        c1 c1Var2 = new c1();
        int i17 = iArr[b3Var.ordinal()];
        if (i17 == 1) {
            i16 = i13 != 2 ? 2 : 5;
        } else if (i17 != 2) {
            i16 = 1;
        }
        c1Var2.f123384a = i16;
        c13.s(androidx.camera.core.impl.z2.f17017on, c1Var2.e());
        c13.s(androidx.camera.core.impl.z2.f17019qn, b3Var == androidx.camera.core.impl.b3.IMAGE_CAPTURE ? h2.f123500c : k0.f123525a);
        androidx.camera.core.impl.b3 b3Var2 = androidx.camera.core.impl.b3.PREVIEW;
        x1 x1Var = this.f123499b;
        if (b3Var == b3Var2) {
            c13.s(androidx.camera.core.impl.j1.f16886jn, x1Var.e());
        }
        c13.s(androidx.camera.core.impl.j1.f16881dn, Integer.valueOf(x1Var.c(true).getRotation()));
        if (b3Var == androidx.camera.core.impl.b3.VIDEO_CAPTURE || b3Var == androidx.camera.core.impl.b3.STREAM_SHARING) {
            c13.s(androidx.camera.core.impl.z2.f17022tn, Boolean.TRUE);
        }
        return androidx.camera.core.impl.v1.b(c13);
    }
}
