package zb;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141518i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f141519j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List list, int i13) {
        super(list);
        this.f141518i = i13;
        if (i13 != 1) {
            this.f141519j = new PointF();
        } else {
            super(list);
            this.f141519j = new kc.c();
        }
    }

    @Override // zb.e
    public final Object h(kc.a aVar, float f13) {
        Object obj;
        switch (this.f141518i) {
            case 0:
                return m(aVar, f13, f13, f13);
            default:
                Object obj2 = aVar.f79104b;
                if (obj2 == null || (obj = aVar.f79105c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                kc.c cVar = (kc.c) obj2;
                kc.c cVar2 = (kc.c) obj;
                androidx.appcompat.app.d dVar = this.f141498e;
                if (dVar != null) {
                    kc.c cVar3 = (kc.c) dVar.B(aVar.f79109g, aVar.f79110h.floatValue(), cVar, cVar2, f13, e(), this.f141497d);
                    if (cVar3 != null) {
                        return cVar3;
                    }
                }
                kc.c cVar4 = (kc.c) this.f141519j;
                float e13 = jc.f.e(cVar.f79126a, cVar2.f79126a, f13);
                float e14 = jc.f.e(cVar.f79127b, cVar2.f79127b, f13);
                cVar4.f79126a = e13;
                cVar4.f79127b = e14;
                return cVar4;
        }
    }

    @Override // zb.e
    public final /* bridge */ /* synthetic */ Object i(kc.a aVar, float f13, float f14, float f15) {
        switch (this.f141518i) {
            case 0:
                return m(aVar, f13, f14, f15);
            default:
                super.i(aVar, f13, f14, f15);
                throw null;
        }
    }

    public final PointF m(kc.a aVar, float f13, float f14, float f15) {
        Object obj;
        Object obj2 = aVar.f79104b;
        if (obj2 == null || (obj = aVar.f79105c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        androidx.appcompat.app.d dVar = this.f141498e;
        if (dVar != null) {
            PointF pointF3 = (PointF) dVar.B(aVar.f79109g, aVar.f79110h.floatValue(), pointF, pointF2, f13, e(), f());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.f141519j;
        float f16 = pointF.x;
        float a13 = ep.b.a(pointF2.x, f16, f14, f16);
        float f17 = pointF.y;
        pointF4.set(a13, ep.b.a(pointF2.y, f17, f15, f17));
        return pointF4;
    }
}
