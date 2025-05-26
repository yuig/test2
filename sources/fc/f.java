package fc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.v;
import com.airbnb.lottie.w;
import com.airbnb.lottie.y;
import zb.u;

/* loaded from: classes.dex */
public final class f extends c {
    public final xb.a C;
    public final Rect D;
    public final Rect E;
    public final w F;
    public u G;
    public u H;

    public f(v vVar, i iVar) {
        super(vVar, iVar);
        this.C = new xb.a(3);
        this.D = new Rect();
        this.E = new Rect();
        com.airbnb.lottie.h hVar = vVar.f28446a;
        this.F = hVar == null ? null : (w) hVar.c().get(iVar.f61654g);
    }

    @Override // fc.c, yb.e
    public final void c(RectF rectF, Matrix matrix, boolean z13) {
        super.c(rectF, matrix, z13);
        if (this.F != null) {
            float c13 = jc.g.c();
            rectF.set(0.0f, 0.0f, r3.f28472a * c13, r3.f28473b * c13);
            this.f61634n.mapRect(rectF);
        }
    }

    @Override // fc.c, cc.g
    public final void d(androidx.appcompat.app.d dVar, Object obj) {
        super.d(dVar, obj);
        if (obj == y.F) {
            if (dVar == null) {
                this.G = null;
                return;
            } else {
                this.G = new u(dVar, null);
                return;
            }
        }
        if (obj == y.I) {
            if (dVar == null) {
                this.H = null;
            } else {
                this.H = new u(dVar, null);
            }
        }
    }

    @Override // fc.c
    public final void k(Canvas canvas, Matrix matrix, int i13) {
        Bitmap a13;
        u uVar = this.H;
        v vVar = this.f61635o;
        w wVar = this.F;
        if (uVar == null || (a13 = (Bitmap) uVar.g()) == null) {
            String str = this.f61636p.f61654g;
            bc.a aVar = vVar.f28453h;
            if (aVar != null) {
                Drawable.Callback callback = vVar.getCallback();
                if (!aVar.b((callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null)) {
                    vVar.f28453h = null;
                }
            }
            if (vVar.f28453h == null) {
                vVar.f28453h = new bc.a(vVar.getCallback(), vVar.f28454i, vVar.f28446a.c());
            }
            bc.a aVar2 = vVar.f28453h;
            a13 = aVar2 != null ? aVar2.a(str) : null;
            if (a13 == null) {
                a13 = wVar != null ? wVar.f28477f : null;
            }
        }
        if (a13 == null || a13.isRecycled() || wVar == null) {
            return;
        }
        float c13 = jc.g.c();
        xb.a aVar3 = this.C;
        aVar3.setAlpha(i13);
        u uVar2 = this.G;
        if (uVar2 != null) {
            aVar3.setColorFilter((ColorFilter) uVar2.g());
        }
        canvas.save();
        canvas.concat(matrix);
        int width = a13.getWidth();
        int height = a13.getHeight();
        Rect rect = this.D;
        rect.set(0, 0, width, height);
        boolean z13 = vVar.f28459n;
        Rect rect2 = this.E;
        if (z13) {
            rect2.set(0, 0, (int) (wVar.f28472a * c13), (int) (wVar.f28473b * c13));
        } else {
            rect2.set(0, 0, (int) (a13.getWidth() * c13), (int) (a13.getHeight() * c13));
        }
        canvas.drawBitmap(a13, rect, rect2, aVar3);
        canvas.restore();
    }
}
