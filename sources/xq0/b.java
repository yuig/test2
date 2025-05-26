package xq0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import dl1.s;
import es.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final es.a f135655a;

    /* renamed from: b, reason: collision with root package name */
    public final h f135656b;

    public b(es.a adFormats, h hVar) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f135655a = adFormats;
        this.f135656b = hVar;
    }

    public static u22.c c(f30 f30Var) {
        Boolean bool;
        Boolean bool2;
        if (f30Var.d5().booleanValue()) {
            g t33 = f30Var.t3();
            if (t33 == null || (bool = t33.l0()) == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            g t34 = f30Var.t3();
            if (t34 == null || (bool2 = t34.m0()) == null) {
                bool2 = Boolean.FALSE;
            }
            boolean booleanValue2 = bool2.booleanValue();
            u22.a aVar = u22.c.Companion;
            g t35 = f30Var.t3();
            int intValue = (t35 != null ? t35.M() : 0).intValue();
            aVar.getClass();
            u22.c a13 = u22.a.a(intValue);
            if (a13 == null) {
                a13 = u22.c.DEFAULT;
            }
            if (booleanValue || booleanValue2 || a13 != u22.c.DEFAULT) {
                g t36 = f30Var.t3();
                u22.c a14 = u22.a.a((t36 != null ? t36.M() : 0).intValue());
                return a14 == null ? u22.c.DEFAULT : a14;
            }
        }
        return u22.c.DEFAULT;
    }

    @Override // xq0.d
    public final boolean a(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return model instanceof f30;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0178, code lost:
    
        if ((!kotlin.text.z.j(r2)) == false) goto L97;
     */
    @Override // xq0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b(dl1.s r9) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xq0.b.b(dl1.s):java.util.List");
    }
}
