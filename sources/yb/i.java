package yb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.y;

/* loaded from: classes3.dex */
public final class i extends b {
    public final zb.e A;
    public zb.u B;

    /* renamed from: r, reason: collision with root package name */
    public final String f138395r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f138396s;

    /* renamed from: t, reason: collision with root package name */
    public final g1.p f138397t;

    /* renamed from: u, reason: collision with root package name */
    public final g1.p f138398u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f138399v;

    /* renamed from: w, reason: collision with root package name */
    public final ec.f f138400w;

    /* renamed from: x, reason: collision with root package name */
    public final int f138401x;

    /* renamed from: y, reason: collision with root package name */
    public final zb.l f138402y;

    /* renamed from: z, reason: collision with root package name */
    public final zb.e f138403z;

    public i(com.airbnb.lottie.v vVar, fc.c cVar, ec.e eVar) {
        super(vVar, cVar, eVar.f58303h.toPaintCap(), eVar.f58304i.toPaintJoin(), eVar.f58305j, eVar.f58299d, eVar.f58302g, eVar.f58306k, eVar.f58307l);
        this.f138397t = new g1.p((Object) null);
        this.f138398u = new g1.p((Object) null);
        this.f138399v = new RectF();
        this.f138395r = eVar.f58296a;
        this.f138400w = eVar.f58297b;
        this.f138396s = eVar.f58308m;
        this.f138401x = (int) (vVar.f28446a.b() / 32.0f);
        zb.e a13 = eVar.f58298c.a();
        this.f138402y = (zb.l) a13;
        a13.a(this);
        cVar.e(a13);
        zb.e a14 = eVar.f58300e.a();
        this.f138403z = a14;
        a14.a(this);
        cVar.e(a14);
        zb.e a15 = eVar.f58301f.a();
        this.A = a15;
        a15.a(this);
        cVar.e(a15);
    }

    @Override // yb.b, cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        super.d(dVar, obj);
        if (obj == y.G) {
            zb.u uVar = this.B;
            fc.c cVar = this.f138330f;
            if (uVar != null) {
                cVar.p(uVar);
            }
            if (dVar == null) {
                this.B = null;
                return;
            }
            zb.u uVar2 = new zb.u(dVar, null);
            this.B = uVar2;
            uVar2.a(this);
            cVar.e(this.B);
        }
    }

    @Override // yb.b, yb.e
    public final void f(Canvas canvas, Matrix matrix, int i13) {
        Shader shader;
        if (this.f138396s) {
            return;
        }
        c(this.f138399v, matrix, false);
        ec.f fVar = ec.f.LINEAR;
        ec.f fVar2 = this.f138400w;
        zb.l lVar = this.f138402y;
        zb.e eVar = this.A;
        zb.e eVar2 = this.f138403z;
        if (fVar2 == fVar) {
            long j13 = j();
            g1.p pVar = this.f138397t;
            shader = (LinearGradient) pVar.c(j13);
            if (shader == null) {
                PointF pointF = (PointF) eVar2.g();
                PointF pointF2 = (PointF) eVar.g();
                ec.c cVar = (ec.c) lVar.g();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i(cVar.f58287b), cVar.f58286a, Shader.TileMode.CLAMP);
                pVar.j(j13, shader);
            }
        } else {
            long j14 = j();
            g1.p pVar2 = this.f138398u;
            shader = (RadialGradient) pVar2.c(j14);
            if (shader == null) {
                PointF pointF3 = (PointF) eVar2.g();
                PointF pointF4 = (PointF) eVar.g();
                ec.c cVar2 = (ec.c) lVar.g();
                int[] i14 = i(cVar2.f58287b);
                RadialGradient radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), i14, cVar2.f58286a, Shader.TileMode.CLAMP);
                pVar2.j(j14, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.f138333i.setShader(shader);
        super.f(canvas, matrix, i13);
    }

    @Override // yb.c
    public final String getName() {
        return this.f138395r;
    }

    public final int[] i(int[] iArr) {
        zb.u uVar = this.B;
        if (uVar != null) {
            Integer[] numArr = (Integer[]) uVar.g();
            int i13 = 0;
            if (iArr.length == numArr.length) {
                while (i13 < iArr.length) {
                    iArr[i13] = numArr[i13].intValue();
                    i13++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i13 < numArr.length) {
                    iArr[i13] = numArr[i13].intValue();
                    i13++;
                }
            }
        }
        return iArr;
    }

    public final int j() {
        float f13 = this.f138403z.f141497d;
        float f14 = this.f138401x;
        int round = Math.round(f13 * f14);
        int round2 = Math.round(this.A.f141497d * f14);
        int round3 = Math.round(this.f138402y.f141497d * f14);
        int i13 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i13 = i13 * 31 * round2;
        }
        return round3 != 0 ? i13 * 31 * round3 : i13;
    }
}
