package bk;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final z[] f23110a = new z[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f23111b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f23112c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f23113d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f23114e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f23115f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final z f23116g = new z();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f23117h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f23118i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f23119j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f23120k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23121l = true;

    public r() {
        for (int i13 = 0; i13 < 4; i13++) {
            this.f23110a[i13] = new z();
            this.f23111b[i13] = new Matrix();
            this.f23112c[i13] = new Matrix();
        }
    }

    public final void a(o oVar, float f13, RectF rectF, rd.j jVar, Path path) {
        int i13;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        z[] zVarArr;
        Path path2;
        Path path3;
        r rVar = this;
        o oVar2 = oVar;
        rd.j jVar2 = jVar;
        path.rewind();
        Path path4 = rVar.f23114e;
        path4.rewind();
        Path path5 = rVar.f23115f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i14 = 0;
        while (true) {
            matrixArr = rVar.f23112c;
            fArr = rVar.f23117h;
            matrixArr2 = rVar.f23111b;
            zVarArr = rVar.f23110a;
            if (i14 >= 4) {
                break;
            }
            d dVar = i14 != 1 ? i14 != 2 ? i14 != 3 ? oVar2.f23096f : oVar2.f23095e : oVar2.f23098h : oVar2.f23097g;
            bs1.c cVar = i14 != 1 ? i14 != 2 ? i14 != 3 ? oVar2.f23092b : oVar2.f23091a : oVar2.f23094d : oVar2.f23093c;
            z zVar = zVarArr[i14];
            cVar.getClass();
            cVar.t0(f13, dVar.a(rectF), zVar);
            int i15 = i14 + 1;
            float f14 = (i15 % 4) * 90;
            matrixArr2[i14].reset();
            PointF pointF = rVar.f23113d;
            if (i14 == 1) {
                path3 = path4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i14 == 2) {
                path3 = path4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i14 != 3) {
                path3 = path4;
                pointF.set(rectF.right, rectF.top);
            } else {
                path3 = path4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i14].setTranslate(pointF.x, pointF.y);
            matrixArr2[i14].preRotate(f14);
            z zVar2 = zVarArr[i14];
            fArr[0] = zVar2.f23142c;
            fArr[1] = zVar2.f23143d;
            matrixArr2[i14].mapPoints(fArr);
            matrixArr[i14].reset();
            matrixArr[i14].setTranslate(fArr[0], fArr[1]);
            matrixArr[i14].preRotate(f14);
            i14 = i15;
            path4 = path3;
        }
        Path path6 = path4;
        int i16 = 0;
        for (i13 = 4; i16 < i13; i13 = 4) {
            z zVar3 = zVarArr[i16];
            fArr[0] = zVar3.f23140a;
            fArr[1] = zVar3.f23141b;
            matrixArr2[i16].mapPoints(fArr);
            if (i16 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            zVarArr[i16].c(matrixArr2[i16], path);
            if (jVar2 != null) {
                z zVar4 = zVarArr[i16];
                Matrix matrix = matrixArr2[i16];
                i iVar = (i) jVar2.f107506b;
                BitSet bitSet = iVar.f23055d;
                zVar4.getClass();
                bitSet.set(i16, false);
                zVar4.b(zVar4.f23145f);
                iVar.f23053b[i16] = new s(new ArrayList(zVar4.f23147h), new Matrix(matrix));
            }
            int i17 = i16 + 1;
            int i18 = i17 % 4;
            z zVar5 = zVarArr[i16];
            fArr[0] = zVar5.f23142c;
            fArr[1] = zVar5.f23143d;
            matrixArr2[i16].mapPoints(fArr);
            z zVar6 = zVarArr[i18];
            float f15 = zVar6.f23140a;
            float[] fArr2 = rVar.f23118i;
            fArr2[0] = f15;
            fArr2[1] = zVar6.f23141b;
            matrixArr2[i18].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            z zVar7 = zVarArr[i16];
            fArr[0] = zVar7.f23142c;
            fArr[1] = zVar7.f23143d;
            matrixArr2[i16].mapPoints(fArr);
            float abs = (i16 == 1 || i16 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            z zVar8 = rVar.f23116g;
            zVar8.e(0.0f, 0.0f, 270.0f, 0.0f);
            f fVar = i16 != 1 ? i16 != 2 ? i16 != 3 ? oVar2.f23100j : oVar2.f23099i : oVar2.f23102l : oVar2.f23101k;
            fVar.Q(max, abs, f13, zVar8);
            Path path7 = rVar.f23119j;
            path7.reset();
            zVar8.c(matrixArr[i16], path7);
            if (rVar.f23121l && (fVar.J() || rVar.b(path7, i16) || rVar.b(path7, i18))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = zVar8.f23140a;
                fArr[1] = zVar8.f23141b;
                matrixArr[i16].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                zVar8.c(matrixArr[i16], path2);
            } else {
                path2 = path6;
                zVar8.c(matrixArr[i16], path);
            }
            if (jVar != null) {
                Matrix matrix2 = matrixArr[i16];
                i iVar2 = (i) jVar.f107506b;
                iVar2.f23055d.set(i16 + 4, false);
                zVar8.b(zVar8.f23145f);
                iVar2.f23054c[i16] = new s(new ArrayList(zVar8.f23147h), new Matrix(matrix2));
            }
            rVar = this;
            oVar2 = oVar;
            jVar2 = jVar;
            path6 = path2;
            i16 = i17;
        }
        Path path8 = path6;
        path.close();
        path8.close();
        if (path8.isEmpty()) {
            return;
        }
        path.op(path8, Path.Op.UNION);
    }

    public final boolean b(Path path, int i13) {
        Path path2 = this.f23120k;
        path2.reset();
        this.f23110a[i13].c(this.f23111b[i13], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
