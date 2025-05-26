package zb;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f141513i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f141514j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f141515k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f141516l;

    /* renamed from: m, reason: collision with root package name */
    public m f141517m;

    public n(List list) {
        super(list);
        this.f141513i = new PointF();
        this.f141514j = new float[2];
        this.f141515k = new float[2];
        this.f141516l = new PathMeasure();
    }

    @Override // zb.e
    public final Object h(kc.a aVar, float f13) {
        m mVar = (m) aVar;
        Path path = mVar.f141511q;
        if (path == null) {
            return (PointF) aVar.f79104b;
        }
        androidx.appcompat.app.d dVar = this.f141498e;
        if (dVar != null) {
            PointF pointF = (PointF) dVar.B(mVar.f79109g, mVar.f79110h.floatValue(), (PointF) mVar.f79104b, (PointF) mVar.f79105c, e(), f13, f());
            if (pointF != null) {
                return pointF;
            }
        }
        m mVar2 = this.f141517m;
        PathMeasure pathMeasure = this.f141516l;
        if (mVar2 != mVar) {
            pathMeasure.setPath(path, false);
            this.f141517m = mVar;
        }
        float length = pathMeasure.getLength();
        float f14 = f13 * length;
        float[] fArr = this.f141514j;
        float[] fArr2 = this.f141515k;
        pathMeasure.getPosTan(f14, fArr, fArr2);
        PointF pointF2 = this.f141513i;
        pointF2.set(fArr[0], fArr[1]);
        if (f14 < 0.0f) {
            pointF2.offset(fArr2[0] * f14, fArr2[1] * f14);
        } else if (f14 > length) {
            float f15 = f14 - length;
            pointF2.offset(fArr2[0] * f15, fArr2[1] * f15);
        }
        return pointF2;
    }
}
