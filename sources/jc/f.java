package jc;

import android.graphics.Path;
import android.graphics.PointF;
import ec.q;
import java.util.ArrayList;
import yb.k;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f75393a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f13, float f14, float f15) {
        return Math.max(f14, Math.min(f15, f13));
    }

    public static int c(float f13, float f14) {
        int i13 = (int) f13;
        int i14 = (int) f14;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (!((i13 ^ i14) >= 0) && i16 != 0) {
            i15--;
        }
        return i13 - (i14 * i15);
    }

    public static void d(q qVar, Path path) {
        path.reset();
        PointF pointF = qVar.f58335b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = f75393a;
        pointF2.set(pointF.x, pointF.y);
        int i13 = 0;
        while (true) {
            ArrayList arrayList = qVar.f58334a;
            if (i13 >= arrayList.size()) {
                break;
            }
            cc.a aVar = (cc.a) arrayList.get(i13);
            PointF pointF3 = aVar.f27408a;
            boolean equals = pointF3.equals(pointF2);
            PointF pointF4 = aVar.f27409b;
            PointF pointF5 = aVar.f27410c;
            if (equals && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i13++;
        }
        if (qVar.f58336c) {
            path.close();
        }
    }

    public static float e(float f13, float f14, float f15) {
        return ep.b.a(f14, f13, f15, f13);
    }

    public static void f(cc.f fVar, int i13, ArrayList arrayList, cc.f fVar2, k kVar) {
        if (fVar.b(i13, kVar.getName())) {
            arrayList.add(fVar2.a(kVar.getName()).f(kVar));
        }
    }
}
