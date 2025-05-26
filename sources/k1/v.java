package k1;

import android.text.Layout;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78048i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f78049j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f78050k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Serializable f78051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f78052m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j13, float[] fArr, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.g0 g0Var) {
        super(1);
        this.f78049j = j13;
        this.f78050k = fArr;
        this.f78051l = h0Var;
        this.f78052m = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f13;
        b3.f0 f0Var;
        int i13;
        boolean z13;
        boolean z14;
        float a13;
        float a14;
        int i14 = this.f78048i;
        Object obj2 = this.f78052m;
        Serializable serializable = this.f78051l;
        Object obj3 = this.f78050k;
        switch (i14) {
            case 0:
                s3.m0 m0Var = (s3.m0) ((d3.e) obj);
                m0Var.a();
                a3.d dVar = (a3.d) obj3;
                float f14 = dVar.f484a;
                kotlin.jvm.internal.j0 j0Var = (kotlin.jvm.internal.j0) serializable;
                long j13 = this.f78049j;
                b3.p pVar = (b3.p) obj2;
                d3.c cVar = m0Var.f110840a;
                d3.d dVar2 = cVar.f53652b.f53648a;
                float f15 = dVar.f485b;
                dVar2.d(f14, f15);
                try {
                    f0Var = (b3.f0) j0Var.f80434a;
                    f13 = f14;
                } catch (Throwable th3) {
                    th = th3;
                    f13 = f14;
                }
                try {
                    d3.h.k(m0Var, f0Var, 0L, j13, 0L, 0.0f, pVar, 0, 890);
                    cVar.f53652b.f53648a.d(-f13, -f15);
                    return Unit.f80348a;
                } catch (Throwable th4) {
                    th = th4;
                    cVar.f53652b.f53648a.d(-f13, -f15);
                    throw th;
                }
            default:
                b4.s sVar = (b4.s) obj;
                float[] fArr = (float[]) obj3;
                kotlin.jvm.internal.h0 h0Var = (kotlin.jvm.internal.h0) serializable;
                kotlin.jvm.internal.g0 g0Var = (kotlin.jvm.internal.g0) obj2;
                int i15 = sVar.f21653b;
                long j14 = this.f78049j;
                int e13 = i15 > b4.p0.e(j14) ? sVar.f21653b : b4.p0.e(j14);
                int d2 = b4.p0.d(j14);
                int i16 = sVar.f21654c;
                if (i16 >= d2) {
                    i16 = b4.p0.d(j14);
                }
                long h10 = b7.c.h(sVar.b(e13), sVar.b(i16));
                int i17 = h0Var.f80426a;
                b4.b bVar = (b4.b) sVar.f21652a;
                bVar.getClass();
                int e14 = b4.p0.e(h10);
                int d13 = b4.p0.d(h10);
                c4.z zVar = bVar.f21510d;
                Layout layout = zVar.f25690f;
                int length = layout.getText().length();
                if (e14 < 0) {
                    throw new IllegalArgumentException("startOffset must be > 0".toString());
                }
                if (e14 >= length) {
                    throw new IllegalArgumentException("startOffset must be less than text length".toString());
                }
                if (d13 <= e14) {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                }
                if (d13 > length) {
                    throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                }
                if (fArr.length - i17 < (d13 - e14) * 4) {
                    throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                }
                int lineForOffset = layout.getLineForOffset(e14);
                int lineForOffset2 = layout.getLineForOffset(d13 - 1);
                c4.k kVar = new c4.k(zVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int i18 = i17;
                        int f16 = zVar.f(lineForOffset);
                        int max = Math.max(e14, lineStart);
                        int min = Math.min(d13, f16);
                        float g13 = zVar.g(lineForOffset);
                        float e15 = zVar.e(lineForOffset);
                        int i19 = e14;
                        int i23 = d13;
                        c4.z zVar2 = zVar;
                        boolean z15 = false;
                        boolean z16 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean z17 = !z16;
                        int i24 = max;
                        int i25 = i18;
                        while (i24 < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(i24);
                            if (!z16 || isRtlCharAt) {
                                i13 = min;
                                if (z16 && isRtlCharAt) {
                                    z14 = false;
                                    float a15 = kVar.a(i24, false, false, false);
                                    z13 = z16;
                                    a13 = kVar.a(i24 + 1, true, true, false);
                                    a14 = a15;
                                } else {
                                    z13 = z16;
                                    z14 = false;
                                    if (z17 && isRtlCharAt) {
                                        a14 = kVar.a(i24, false, false, true);
                                        a13 = kVar.a(i24 + 1, true, true, true);
                                        z14 = false;
                                    } else {
                                        a13 = kVar.a(i24, false, false, false);
                                        a14 = kVar.a(i24 + 1, true, true, false);
                                    }
                                }
                            } else {
                                i13 = min;
                                a13 = kVar.a(i24, z15, z15, true);
                                z13 = z16;
                                a14 = kVar.a(i24 + 1, true, true, true);
                                z14 = false;
                            }
                            fArr[i25] = a13;
                            fArr[i25 + 1] = g13;
                            fArr[i25 + 2] = a14;
                            fArr[i25 + 3] = e15;
                            i25 += 4;
                            i24++;
                            z15 = z14;
                            min = i13;
                            z16 = z13;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i17 = i25;
                            e14 = i19;
                            d13 = i23;
                            zVar = zVar2;
                        }
                    }
                }
                int c13 = (b4.p0.c(h10) * 4) + h0Var.f80426a;
                for (int i26 = h0Var.f80426a; i26 < c13; i26 += 4) {
                    int i27 = i26 + 1;
                    float f17 = fArr[i27];
                    float f18 = g0Var.f80425a;
                    fArr[i27] = f17 + f18;
                    int i28 = i26 + 3;
                    fArr[i28] = fArr[i28] + f18;
                }
                h0Var.f80426a = c13;
                g0Var.f80425a = bVar.b() + g0Var.f80425a;
                return Unit.f80348a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a3.d dVar, kotlin.jvm.internal.j0 j0Var, long j13, b3.p pVar) {
        super(1);
        this.f78050k = dVar;
        this.f78051l = j0Var;
        this.f78049j = j13;
        this.f78052m = pVar;
    }
}
