package je;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* loaded from: classes3.dex */
public final class q2 extends c0.s0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75750b = 0;

    /* renamed from: c, reason: collision with root package name */
    public float f75751c;

    /* renamed from: d, reason: collision with root package name */
    public final float f75752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2 f75753e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f75754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(float f13, float f14, Path path, t2 t2Var) {
        super(t2Var);
        this.f75753e = t2Var;
        this.f75751c = f13;
        this.f75752d = f14;
        this.f75754f = path;
    }

    @Override // c0.s0
    public final boolean d(c2 c2Var) {
        switch (this.f75750b) {
            case 0:
                if (!(c2Var instanceof d2)) {
                    break;
                } else {
                    Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                    break;
                }
            default:
                if (!(c2Var instanceof d2)) {
                    break;
                } else {
                    d2 d2Var = (d2) c2Var;
                    p1 g13 = c2Var.f75757a.g(d2Var.f75585n);
                    if (g13 != null) {
                        s0 s0Var = (s0) g13;
                        Path path = (Path) new n2(this.f75753e, s0Var.f75770o).f75714c;
                        Matrix matrix = s0Var.f75638n;
                        if (matrix != null) {
                            path.transform(matrix);
                        }
                        RectF rectF = new RectF();
                        path.computeBounds(rectF, true);
                        ((RectF) this.f75754f).union(rectF);
                        break;
                    } else {
                        t2.o("TextPath path reference '%s' not found", d2Var.f75585n);
                        break;
                    }
                }
        }
        return true;
    }

    @Override // c0.s0
    public final void k(String str) {
        int i13 = this.f75750b;
        t2 t2Var = this.f75753e;
        switch (i13) {
            case 0:
                if (t2Var.W()) {
                    Path path = new Path();
                    t2Var.f75777c.f75762d.getTextPath(str, 0, str.length(), this.f75751c, this.f75752d, path);
                    ((Path) this.f75754f).addPath(path);
                }
                this.f75751c = t2Var.f75777c.f75762d.measureText(str) + this.f75751c;
                break;
            default:
                if (t2Var.W()) {
                    Rect rect = new Rect();
                    t2Var.f75777c.f75762d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.f75751c, this.f75752d);
                    ((RectF) this.f75754f).union(rectF);
                }
                this.f75751c = t2Var.f75777c.f75762d.measureText(str) + this.f75751c;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(t2 t2Var, float f13, float f14) {
        super(t2Var);
        this.f75753e = t2Var;
        this.f75754f = new RectF();
        this.f75751c = f13;
        this.f75752d = f14;
    }
}
