package com.airbnb.lottie;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.c2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class v extends Drawable implements Drawable.Callback, Animatable {
    public static final List N = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor O = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new jc.c());
    public RectF A;
    public xb.a B;
    public Rect C;
    public Rect D;
    public RectF E;
    public RectF F;
    public Matrix G;
    public Matrix H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public a f28445J;
    public final Semaphore K;
    public final androidx.activity.d L;
    public float M;

    /* renamed from: a, reason: collision with root package name */
    public h f28446a;

    /* renamed from: b, reason: collision with root package name */
    public final jc.d f28447b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28448c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28449d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28450e;

    /* renamed from: f, reason: collision with root package name */
    public u f28451f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f28452g;

    /* renamed from: h, reason: collision with root package name */
    public bc.a f28453h;

    /* renamed from: i, reason: collision with root package name */
    public String f28454i;

    /* renamed from: j, reason: collision with root package name */
    public c2 f28455j;

    /* renamed from: k, reason: collision with root package name */
    public Map f28456k;

    /* renamed from: l, reason: collision with root package name */
    public String f28457l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28458m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28459n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f28460o;

    /* renamed from: p, reason: collision with root package name */
    public fc.e f28461p;

    /* renamed from: q, reason: collision with root package name */
    public int f28462q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f28463r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f28464s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28465t;

    /* renamed from: u, reason: collision with root package name */
    public g0 f28466u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f28467v;

    /* renamed from: w, reason: collision with root package name */
    public final Matrix f28468w;

    /* renamed from: x, reason: collision with root package name */
    public Bitmap f28469x;

    /* renamed from: y, reason: collision with root package name */
    public Canvas f28470y;

    /* renamed from: z, reason: collision with root package name */
    public Rect f28471z;

    public v() {
        jc.d dVar = new jc.d();
        this.f28447b = dVar;
        this.f28448c = true;
        this.f28449d = false;
        this.f28450e = false;
        this.f28451f = u.NONE;
        this.f28452g = new ArrayList();
        this.f28459n = false;
        this.f28460o = true;
        this.f28462q = 255;
        this.f28465t = false;
        this.f28466u = g0.AUTOMATIC;
        this.f28467v = false;
        this.f28468w = new Matrix();
        this.I = false;
        p pVar = new p(this, 0);
        this.K = new Semaphore(1);
        this.L = new androidx.activity.d(this, 16);
        this.M = -3.4028235E38f;
        dVar.addUpdateListener(pVar);
    }

    public static void g(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(final cc.f fVar, final Object obj, final androidx.appcompat.app.d dVar) {
        fc.e eVar = this.f28461p;
        if (eVar == null) {
            this.f28452g.add(new t() { // from class: com.airbnb.lottie.r
                @Override // com.airbnb.lottie.t
                public final void run() {
                    v.this.a(fVar, obj, dVar);
                }
            });
            return;
        }
        if (fVar == cc.f.f27433c) {
            eVar.d(dVar, obj);
        } else {
            cc.g gVar = fVar.f27435b;
            if (gVar != null) {
                gVar.d(dVar, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f28461p.g(fVar, 0, arrayList, new cc.f(new String[0]));
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((cc.f) arrayList.get(i13)).f27435b.d(dVar, obj);
                }
                if (!(!arrayList.isEmpty())) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == y.f28504z) {
            v(this.f28447b.h());
        }
    }

    public final boolean b() {
        return this.f28448c || this.f28449d;
    }

    public final void c() {
        h hVar = this.f28446a;
        if (hVar == null) {
            return;
        }
        tb.c cVar = hc.v.f68678a;
        Rect rect = hVar.f28406k;
        fc.e eVar = new fc.e(this, new fc.i(Collections.emptyList(), hVar, "__container", -1L, fc.g.PRE_COMP, -1L, null, Collections.emptyList(), new dc.e(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), fc.h.NONE, null, false, null, null, ec.h.NORMAL), hVar.f28405j, hVar);
        this.f28461p = eVar;
        if (this.f28463r) {
            eVar.s(true);
        }
        this.f28461p.I = this.f28460o;
    }

    public final void d() {
        this.f28452g.clear();
        this.f28447b.cancel();
        if (isVisible()) {
            return;
        }
        this.f28451f = u.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        fc.e eVar = this.f28461p;
        if (eVar == null) {
            return;
        }
        a aVar = this.f28445J;
        if (aVar == null) {
            aVar = b.f28381a;
        }
        boolean z13 = aVar == a.ENABLED;
        ThreadPoolExecutor threadPoolExecutor = O;
        Semaphore semaphore = this.K;
        androidx.activity.d dVar = this.L;
        jc.d dVar2 = this.f28447b;
        if (z13) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                a aVar2 = b.f28381a;
                if (!z13) {
                    return;
                }
                semaphore.release();
                if (eVar.v() == dVar2.h()) {
                    return;
                }
            } catch (Throwable th3) {
                a aVar3 = b.f28381a;
                if (z13) {
                    semaphore.release();
                    if (eVar.v() != dVar2.h()) {
                        threadPoolExecutor.execute(dVar);
                    }
                }
                throw th3;
            }
        }
        a aVar4 = b.f28381a;
        if (z13 && w()) {
            v(dVar2.h());
        }
        if (this.f28450e) {
            try {
                if (this.f28467v) {
                    r(canvas, eVar);
                } else {
                    h(canvas);
                }
            } catch (Throwable unused2) {
                jc.b.b();
            }
        } else if (this.f28467v) {
            r(canvas, eVar);
        } else {
            h(canvas);
        }
        this.I = false;
        a aVar5 = b.f28381a;
        if (z13) {
            semaphore.release();
            if (eVar.v() == dVar2.h()) {
                return;
            }
            threadPoolExecutor.execute(dVar);
        }
    }

    public final void e() {
        jc.d dVar = this.f28447b;
        if (dVar.f75390m) {
            dVar.cancel();
            if (!isVisible()) {
                this.f28451f = u.NONE;
            }
        }
        this.f28446a = null;
        this.f28461p = null;
        this.f28453h = null;
        this.M = -3.4028235E38f;
        dVar.f75389l = null;
        dVar.f75387j = -2.1474836E9f;
        dVar.f75388k = 2.1474836E9f;
        invalidateSelf();
    }

    public final void f() {
        h hVar = this.f28446a;
        if (hVar == null) {
            return;
        }
        this.f28467v = this.f28466u.useSoftwareRendering(Build.VERSION.SDK_INT, hVar.f28410o, hVar.f28411p);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f28462q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        h hVar = this.f28446a;
        if (hVar == null) {
            return -1;
        }
        return hVar.f28406k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        h hVar = this.f28446a;
        if (hVar == null) {
            return -1;
        }
        return hVar.f28406k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(Canvas canvas) {
        fc.e eVar = this.f28461p;
        h hVar = this.f28446a;
        if (eVar == null || hVar == null) {
            return;
        }
        Matrix matrix = this.f28468w;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preScale(r3.width() / hVar.f28406k.width(), r3.height() / hVar.f28406k.height());
            matrix.preTranslate(r3.left, r3.top);
        }
        eVar.f(canvas, matrix, this.f28462q);
    }

    public final c2 i() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f28455j == null) {
            c2 c2Var = new c2(getCallback());
            this.f28455j = c2Var;
            String str = this.f28457l;
            if (str != null) {
                c2Var.f16536g = str;
            }
        }
        return this.f28455j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.I) {
            return;
        }
        this.I = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return o();
    }

    public final cc.i j() {
        cc.i iVar = null;
        for (String str : N) {
            h hVar = this.f28446a;
            int size = hVar.f28402g.size();
            for (int i13 = 0; i13 < size; i13++) {
                cc.i iVar2 = (cc.i) hVar.f28402g.get(i13);
                String str2 = iVar2.f27438a;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    iVar = iVar2;
                    break;
                }
            }
            iVar = null;
            if (iVar != null) {
                break;
            }
        }
        return iVar;
    }

    public final float k() {
        return this.f28447b.i();
    }

    public final float l() {
        return this.f28447b.j();
    }

    public final int m() {
        return this.f28447b.getRepeatCount();
    }

    public final float n() {
        return this.f28447b.f75381d;
    }

    public final boolean o() {
        jc.d dVar = this.f28447b;
        if (dVar == null) {
            return false;
        }
        return dVar.f75390m;
    }

    public final void p() {
        this.f28452g.clear();
        jc.d dVar = this.f28447b;
        dVar.q(true);
        Iterator it = dVar.f75380c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(dVar);
        }
        if (isVisible()) {
            return;
        }
        this.f28451f = u.NONE;
    }

    public final void q() {
        if (this.f28461p == null) {
            this.f28452g.add(new o(this, 1));
            return;
        }
        f();
        boolean b13 = b();
        jc.d dVar = this.f28447b;
        if (b13 || m() == 0) {
            if (isVisible()) {
                dVar.f75390m = true;
                boolean l13 = dVar.l();
                Iterator it = dVar.f75379b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(dVar, l13);
                }
                dVar.w((int) (dVar.l() ? dVar.i() : dVar.j()));
                dVar.f75383f = 0L;
                dVar.f75386i = 0;
                if (dVar.f75390m) {
                    dVar.q(false);
                    Choreographer.getInstance().postFrameCallback(dVar);
                }
                this.f28451f = u.NONE;
            } else {
                this.f28451f = u.PLAY;
            }
        }
        if (b()) {
            return;
        }
        cc.i j13 = j();
        if (j13 != null) {
            u((int) j13.f27439b);
        } else {
            u((int) (n() < 0.0f ? l() : k()));
        }
        dVar.g();
        if (isVisible()) {
            return;
        }
        this.f28451f = u.NONE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e3, code lost:
    
        if ((!((android.view.ViewGroup) r3).getClipChildren()) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(android.graphics.Canvas r10, fc.e r11) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.v.r(android.graphics.Canvas, fc.e):void");
    }

    public final void s() {
        if (this.f28461p == null) {
            this.f28452g.add(new o(this, 0));
            return;
        }
        f();
        boolean b13 = b();
        jc.d dVar = this.f28447b;
        if (b13 || m() == 0) {
            if (isVisible()) {
                dVar.f75390m = true;
                dVar.q(false);
                Choreographer.getInstance().postFrameCallback(dVar);
                dVar.f75383f = 0L;
                if (dVar.l() && dVar.f75385h == dVar.j()) {
                    dVar.w(dVar.i());
                } else if (!dVar.l() && dVar.f75385h == dVar.i()) {
                    dVar.w(dVar.j());
                }
                Iterator it = dVar.f75380c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(dVar);
                }
                this.f28451f = u.NONE;
            } else {
                this.f28451f = u.RESUME;
            }
        }
        if (b()) {
            return;
        }
        u((int) (n() < 0.0f ? l() : k()));
        dVar.g();
        if (isVisible()) {
            return;
        }
        this.f28451f = u.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j13) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f28462q = i13;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        jc.b.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z13, boolean z14) {
        boolean z15 = !isVisible();
        boolean visible = super.setVisible(z13, z14);
        if (z13) {
            u uVar = this.f28451f;
            if (uVar == u.PLAY) {
                q();
            } else if (uVar == u.RESUME) {
                s();
            }
        } else if (this.f28447b.f75390m) {
            p();
            this.f28451f = u.RESUME;
        } else if (!z15) {
            this.f28451f = u.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        q();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f28452g.clear();
        this.f28447b.g();
        if (isVisible()) {
            return;
        }
        this.f28451f = u.NONE;
    }

    public final boolean t(h hVar) {
        if (this.f28446a == hVar) {
            return false;
        }
        this.I = true;
        e();
        this.f28446a = hVar;
        c();
        jc.d dVar = this.f28447b;
        boolean z13 = dVar.f75389l == null;
        dVar.f75389l = hVar;
        if (z13) {
            dVar.y(Math.max(dVar.f75387j, hVar.f28407l), Math.min(dVar.f75388k, hVar.f28408m));
        } else {
            dVar.y((int) hVar.f28407l, (int) hVar.f28408m);
        }
        float f13 = dVar.f75385h;
        dVar.f75385h = 0.0f;
        dVar.f75384g = 0.0f;
        dVar.w((int) f13);
        dVar.n();
        v(dVar.getAnimatedFraction());
        ArrayList arrayList = this.f28452g;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar != null) {
                tVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        hVar.f28396a.d();
        f();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void u(final int i13) {
        if (this.f28446a == null) {
            this.f28452g.add(new t() { // from class: com.airbnb.lottie.s
                @Override // com.airbnb.lottie.t
                public final void run() {
                    v.this.u(i13);
                }
            });
        } else {
            this.f28447b.w(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v(final float f13) {
        h hVar = this.f28446a;
        if (hVar == null) {
            this.f28452g.add(new t() { // from class: com.airbnb.lottie.q
                @Override // com.airbnb.lottie.t
                public final void run() {
                    v.this.v(f13);
                }
            });
            return;
        }
        a aVar = b.f28381a;
        this.f28447b.w(jc.f.e(hVar.f28407l, hVar.f28408m, f13));
    }

    public final boolean w() {
        h hVar = this.f28446a;
        if (hVar == null) {
            return false;
        }
        float f13 = this.M;
        float h10 = this.f28447b.h();
        this.M = h10;
        return Math.abs(h10 - f13) * hVar.b() >= 50.0f;
    }
}
