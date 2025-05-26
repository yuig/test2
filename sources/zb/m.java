package zb;

import android.graphics.Path;
import android.graphics.PointF;
import t3.n1;

/* loaded from: classes.dex */
public final class m extends kc.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f141511q;

    /* renamed from: r, reason: collision with root package name */
    public final kc.a f141512r;

    public m(com.airbnb.lottie.h hVar, kc.a aVar) {
        super(hVar, (PointF) aVar.f79104b, (PointF) aVar.f79105c, aVar.f79106d, aVar.f79107e, aVar.f79108f, aVar.f79109g, aVar.f79110h);
        this.f141512r = aVar;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.f79105c;
        Object obj3 = this.f79104b;
        boolean z13 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f79105c) == null || z13) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        kc.a aVar = this.f141512r;
        PointF pointF3 = aVar.f79117o;
        PointF pointF4 = aVar.f79118p;
        n1 n1Var = jc.g.f75394a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f13 = pointF3.x + pointF.x;
            float f14 = pointF.y + pointF3.y;
            float f15 = pointF2.x;
            float f16 = f15 + pointF4.x;
            float f17 = pointF2.y;
            path.cubicTo(f13, f14, f16, f17 + pointF4.y, f15, f17);
        }
        this.f141511q = path;
    }
}
