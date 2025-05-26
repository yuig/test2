package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class p0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f64070a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64071b;

    static {
        p0 p0Var = new p0();
        f64070a = p0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.Float2x2ValueConfig", p0Var, 2);
        y0Var.k("float2x2", false);
        y0Var.k("values", true);
        f64071b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64071b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4, new float[]{r5, r3, r10[0], r10[1]}) == false) goto L7;
     */
    @Override // no2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(po2.d r9, java.lang.Object r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            g72.u0 r10 = (g72.u0) r10
            java.lang.String r2 = "encoder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            java.lang.String r2 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r2)
            qo2.y0 r2 = g72.p0.f64071b
            po2.b r9 = r9.b(r2)
            g72.r0 r3 = g72.r0.f64091a
            g72.t0 r4 = r10.f64121a
            r9.u(r2, r1, r3, r4)
            boolean r3 = r9.j(r2)
            float[] r4 = r10.f64122b
            if (r3 == 0) goto L24
            goto L45
        L24:
            g72.t0 r10 = r10.f64121a
            float[] r3 = r10.f64110a
            r5 = r3[r1]
            r3 = r3[r0]
            float[] r10 = r10.f64111b
            r6 = r10[r1]
            r10 = r10[r0]
            r7 = 4
            float[] r7 = new float[r7]
            r7[r1] = r5
            r7[r0] = r3
            r1 = 2
            r7[r1] = r6
            r1 = 3
            r7[r1] = r10
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r10 != 0) goto L4a
        L45:
            qo2.y r10 = qo2.y.f104655c
            r9.u(r2, r0, r10, r4)
        L4a:
            r9.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g72.p0.c(po2.d, java.lang.Object):void");
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{r0.f64091a, qo2.y.f104655c};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64071b;
        po2.a b13 = decoder.b(y0Var);
        t0 t0Var = null;
        boolean z13 = true;
        float[] fArr = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                t0Var = (t0) b13.C(y0Var, 0, r0.f64091a, t0Var);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                fArr = (float[]) b13.C(y0Var, 1, qo2.y.f104655c, fArr);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new u0(i13, t0Var, fArr);
    }
}
