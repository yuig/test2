package c3;

import ao2.m0;
import b3.w;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends i {

    /* renamed from: e, reason: collision with root package name */
    public final s f25513e;

    /* renamed from: f, reason: collision with root package name */
    public final s f25514f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f25515g;

    public h(s sVar, s sVar2, int i13) {
        super(sVar2, sVar, sVar2, null);
        float[] a03;
        this.f25513e = sVar;
        this.f25514f = sVar2;
        u uVar = sVar2.f25539d;
        u uVar2 = sVar.f25539d;
        boolean o13 = m0.o(uVar2, uVar);
        float[] fArr = sVar.f25544i;
        float[] fArr2 = sVar2.f25545j;
        if (o13) {
            a03 = m0.a0(fArr2, fArr);
        } else {
            float[] a13 = uVar2.a();
            u uVar3 = sVar2.f25539d;
            float[] a14 = uVar3.a();
            u uVar4 = l.f25522b;
            boolean o14 = m0.o(uVar2, uVar4);
            float[] fArr3 = l.f25525e;
            float[] fArr4 = b.f25481b.f25482a;
            if (!o14) {
                float[] copyOf = Arrays.copyOf(fArr3, 3);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                fArr = m0.a0(m0.n(fArr4, a13, copyOf), fArr);
            }
            if (!m0.o(uVar3, uVar4)) {
                float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                fArr2 = m0.P(m0.a0(m0.n(fArr4, a14, copyOf2), sVar2.f25544i));
            }
            a03 = m0.a0(fArr2, i13 == 3 ? m0.b0(new float[]{a13[0] / a14[0], a13[1] / a14[1], a13[2] / a14[2]}, fArr) : fArr);
        }
        this.f25515g = a03;
    }

    @Override // c3.i
    public final long a(long j13) {
        float h10 = w.h(j13);
        float g13 = w.g(j13);
        float e13 = w.e(j13);
        float d2 = w.d(j13);
        s sVar = this.f25513e;
        float i13 = (float) sVar.f25551p.i(h10);
        o oVar = sVar.f25551p;
        float i14 = (float) oVar.i(g13);
        float i15 = (float) oVar.i(e13);
        float[] fArr = this.f25515g;
        float f13 = (fArr[6] * i15) + (fArr[3] * i14) + (fArr[0] * i13);
        float f14 = (fArr[7] * i15) + (fArr[4] * i14) + (fArr[1] * i13);
        float f15 = (fArr[8] * i15) + (fArr[5] * i14) + (fArr[2] * i13);
        s sVar2 = this.f25514f;
        float i16 = (float) sVar2.f25548m.i(f13);
        double d13 = f14;
        o oVar2 = sVar2.f25548m;
        return androidx.compose.ui.graphics.a.b(i16, (float) oVar2.i(d13), (float) oVar2.i(f15), d2, sVar2);
    }
}
