package ua;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121337a = 2;

    /* renamed from: b, reason: collision with root package name */
    public Object f121338b;

    public p(int i13) {
        this(new com.pinterest.shuffles.scene.composer.a(1.0f, false, new PointF(), new hd2.a(0.0d), new ke2.a(0.0f, 0.0f), 0.0f));
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f13, Object obj, Object obj2) {
        switch (this.f121337a) {
            case 0:
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                float[] fArr3 = (float[]) this.f121338b;
                if (fArr3 == null) {
                    fArr3 = new float[fArr.length];
                }
                for (int i13 = 0; i13 < fArr3.length; i13++) {
                    float f14 = fArr[i13];
                    fArr3[i13] = ep.b.a(fArr2[i13], f14, f13, f14);
                }
                return fArr3;
            case 1:
                f5.h[] hVarArr = (f5.h[]) obj;
                f5.h[] hVarArr2 = (f5.h[]) obj2;
                if (!k3.D(hVarArr, hVarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!k3.D((f5.h[]) this.f121338b, hVarArr)) {
                    this.f121338b = k3.O(hVarArr);
                }
                for (int i14 = 0; i14 < hVarArr.length; i14++) {
                    f5.h hVar = ((f5.h[]) this.f121338b)[i14];
                    f5.h hVar2 = hVarArr[i14];
                    f5.h hVar3 = hVarArr2[i14];
                    hVar.getClass();
                    hVar.f61088a = hVar2.f61088a;
                    int i15 = 0;
                    while (true) {
                        float[] fArr4 = hVar2.f61089b;
                        if (i15 < fArr4.length) {
                            hVar.f61089b[i15] = (hVar3.f61089b[i15] * f13) + ((1.0f - f13) * fArr4[i15]);
                            i15++;
                        }
                    }
                }
                return (f5.h[]) this.f121338b;
            default:
                com.pinterest.shuffles.scene.composer.a startValue = (com.pinterest.shuffles.scene.composer.a) obj;
                com.pinterest.shuffles.scene.composer.a endValue = (com.pinterest.shuffles.scene.composer.a) obj2;
                Intrinsics.checkNotNullParameter(startValue, "startValue");
                Intrinsics.checkNotNullParameter(endValue, "endValue");
                com.pinterest.shuffles.scene.composer.a aVar = (com.pinterest.shuffles.scene.composer.a) this.f121338b;
                float f15 = startValue.f51998a;
                aVar.f51998a = ep.b.a(endValue.f51998a, f15, f13, f15);
                aVar.f51999b = endValue.f51999b;
                PointF pointF = startValue.f52000c;
                float f16 = pointF.x;
                PointF pointF2 = endValue.f52000c;
                float a13 = ep.b.a(pointF2.x, f16, f13, f16);
                float f17 = pointF.y;
                PointF pointF3 = new PointF(a13, ep.b.a(pointF2.y, f17, f13, f17));
                Intrinsics.checkNotNullParameter(pointF3, "<set-?>");
                aVar.f52000c = pointF3;
                hd2.a other = startValue.f52001d;
                hd2.a aVar2 = endValue.f52001d;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(other, "other");
                hd2.a b13 = other.b(new hd2.a((aVar2.f68913a - other.f68913a) * f13));
                Intrinsics.checkNotNullParameter(b13, "<set-?>");
                aVar.f52001d = b13;
                ke2.a aVar3 = startValue.f52002e;
                float f18 = aVar3.f79302a;
                ke2.a aVar4 = endValue.f52002e;
                float a14 = ep.b.a(aVar4.f79302a, f18, f13, f18);
                float f19 = aVar3.f79303b;
                ke2.a aVar5 = new ke2.a(a14, ep.b.a(aVar4.f79303b, f19, f13, f19));
                Intrinsics.checkNotNullParameter(aVar5, "<set-?>");
                aVar.f52002e = aVar5;
                float f23 = startValue.f52003f;
                aVar.f52003f = ep.b.a(endValue.f52003f, f23, f13, f23);
                return aVar;
        }
    }

    public p(float[] fArr) {
        this.f121338b = fArr;
    }

    public p(com.pinterest.shuffles.scene.composer.a reuse) {
        Intrinsics.checkNotNullParameter(reuse, "reuse");
        this.f121338b = reuse;
    }
}
