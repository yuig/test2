package yd;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.l;
import com.bumptech.glide.o;
import he.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import nd.p;
import pd.r;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ld.a f138731a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f138732b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f138733c;

    /* renamed from: d, reason: collision with root package name */
    public final o f138734d;

    /* renamed from: e, reason: collision with root package name */
    public final qd.d f138735e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f138736f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f138737g;

    /* renamed from: h, reason: collision with root package name */
    public l f138738h;

    /* renamed from: i, reason: collision with root package name */
    public e f138739i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f138740j;

    /* renamed from: k, reason: collision with root package name */
    public e f138741k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f138742l;

    /* renamed from: m, reason: collision with root package name */
    public e f138743m;

    /* renamed from: n, reason: collision with root package name */
    public int f138744n;

    /* renamed from: o, reason: collision with root package name */
    public int f138745o;

    /* renamed from: p, reason: collision with root package name */
    public int f138746p;

    public h(com.bumptech.glide.b bVar, ld.e eVar, int i13, int i14, vd.c cVar, Bitmap bitmap) {
        qd.d dVar = bVar.f29741b;
        com.bumptech.glide.f fVar = bVar.f29743d;
        o f13 = com.bumptech.glide.b.f(fVar.getBaseContext());
        l a13 = com.bumptech.glide.b.f(fVar.getBaseContext()).c().a(((de.h) ((de.h) ((de.h) new de.h().h(r.f99744a)).A()).u()).m(i13, i14));
        this.f138733c = new ArrayList();
        this.f138734d = f13;
        Handler handler = new Handler(Looper.getMainLooper(), new g(this, 0));
        this.f138735e = dVar;
        this.f138732b = handler;
        this.f138738h = a13;
        this.f138731a = eVar;
        l(cVar, bitmap);
    }

    public final void a() {
        qd.i iVar;
        qd.i iVar2;
        qd.i iVar3;
        this.f138733c.clear();
        Bitmap bitmap = this.f138742l;
        if (bitmap != null) {
            this.f138735e.b(bitmap);
            this.f138742l = null;
        }
        this.f138736f = false;
        e eVar = this.f138739i;
        o oVar = this.f138734d;
        if (eVar != null) {
            oVar.e(eVar);
            this.f138739i = null;
        }
        e eVar2 = this.f138741k;
        if (eVar2 != null) {
            oVar.e(eVar2);
            this.f138741k = null;
        }
        e eVar3 = this.f138743m;
        if (eVar3 != null) {
            oVar.e(eVar3);
            this.f138743m = null;
        }
        ld.e eVar4 = (ld.e) this.f138731a;
        eVar4.f82941l = null;
        byte[] bArr = eVar4.f82938i;
        tb.e eVar5 = eVar4.f82932c;
        if (bArr != null && (iVar3 = (qd.i) eVar5.f116964b) != null) {
            iVar3.h(bArr);
        }
        int[] iArr = eVar4.f82939j;
        if (iArr != null && (iVar2 = (qd.i) eVar5.f116964b) != null) {
            iVar2.h(iArr);
        }
        Bitmap bitmap2 = eVar4.f82942m;
        if (bitmap2 != null) {
            ((qd.d) eVar5.f116963a).b(bitmap2);
        }
        eVar4.f82942m = null;
        eVar4.f82933d = null;
        eVar4.f82948s = null;
        byte[] bArr2 = eVar4.f82934e;
        if (bArr2 != null && (iVar = (qd.i) eVar5.f116964b) != null) {
            iVar.h(bArr2);
        }
        this.f138740j = true;
    }

    public final ByteBuffer b() {
        return ((ld.e) this.f138731a).f82933d.asReadOnlyBuffer();
    }

    public final Bitmap c() {
        e eVar = this.f138739i;
        return eVar != null ? eVar.f138728g : this.f138742l;
    }

    public final int d() {
        e eVar = this.f138739i;
        if (eVar != null) {
            return eVar.f138726e;
        }
        return -1;
    }

    public final Bitmap e() {
        return this.f138742l;
    }

    public final int f() {
        return ((ld.e) this.f138731a).f82941l.f82917c;
    }

    public final int g() {
        return this.f138746p;
    }

    public final int h() {
        ld.e eVar = (ld.e) this.f138731a;
        return (eVar.f82939j.length * 4) + eVar.f82933d.limit() + eVar.f82938i.length + this.f138744n;
    }

    public final int i() {
        return this.f138745o;
    }

    public final void j() {
        int i13;
        if (!this.f138736f || this.f138737g) {
            return;
        }
        e eVar = this.f138743m;
        if (eVar != null) {
            this.f138743m = null;
            k(eVar);
            return;
        }
        this.f138737g = true;
        ld.a aVar = this.f138731a;
        ld.e eVar2 = (ld.e) aVar;
        int i14 = eVar2.f82941l.f82917c;
        long uptimeMillis = SystemClock.uptimeMillis() + ((i14 <= 0 || (i13 = eVar2.f82940k) < 0) ? 0 : (i13 < 0 || i13 >= i14) ? -1 : ((ld.b) r3.f82919e.get(i13)).f82912i);
        int i15 = (eVar2.f82940k + 1) % eVar2.f82941l.f82917c;
        eVar2.f82940k = i15;
        this.f138741k = new e(this.f138732b, i15, uptimeMillis);
        this.f138738h.a((de.h) new de.h().t(new ge.d(Double.valueOf(Math.random())))).K(aVar).H(this.f138741k);
    }

    public final void k(e eVar) {
        this.f138737g = false;
        boolean z13 = this.f138740j;
        Handler handler = this.f138732b;
        if (z13) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f138736f) {
            this.f138743m = eVar;
            return;
        }
        if (eVar.f138728g != null) {
            Bitmap bitmap = this.f138742l;
            if (bitmap != null) {
                this.f138735e.b(bitmap);
                this.f138742l = null;
            }
            e eVar2 = this.f138739i;
            this.f138739i = eVar;
            ArrayList arrayList = this.f138733c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    if (cVar.f138714a.f138713a.d() == r5.f138713a.f() - 1) {
                        cVar.f138719f++;
                    }
                    int i13 = cVar.f138720g;
                    if (i13 != -1 && cVar.f138719f >= i13) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        j();
    }

    public final void l(p pVar, Bitmap bitmap) {
        d7.b.p(pVar, "Argument must not be null");
        d7.b.p(bitmap, "Argument must not be null");
        this.f138742l = bitmap;
        this.f138738h = this.f138738h.a(new de.h().x(pVar, true));
        this.f138744n = n.c(bitmap);
        this.f138745o = bitmap.getWidth();
        this.f138746p = bitmap.getHeight();
    }

    public final void m(f fVar) {
        if (this.f138740j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = this.f138733c;
        if (arrayList.contains(fVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(fVar);
        if (!isEmpty || this.f138736f) {
            return;
        }
        this.f138736f = true;
        this.f138740j = false;
        j();
    }

    public final void n(f fVar) {
        ArrayList arrayList = this.f138733c;
        arrayList.remove(fVar);
        if (arrayList.isEmpty()) {
            this.f138736f = false;
        }
    }
}
