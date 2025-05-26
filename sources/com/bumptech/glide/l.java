package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.appcompat.app.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class l extends de.a {
    public final Context A;
    public final o B;
    public final Class C;
    public final f D;
    public p E;
    public Object F;
    public ArrayList G;
    public l H;
    public l I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f29792J = true;
    public boolean K;
    public boolean L;

    static {
    }

    public l(b bVar, o oVar, Class cls, Context context) {
        de.h hVar;
        this.B = oVar;
        this.C = cls;
        this.A = context;
        Map map = oVar.f29830a.f29743d.f29772f;
        p pVar = (p) map.get(cls);
        if (pVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    pVar = (p) entry.getValue();
                }
            }
        }
        this.E = pVar == null ? f.f29766k : pVar;
        this.D = bVar.f29743d;
        Iterator it = oVar.f29838i.iterator();
        while (it.hasNext()) {
            B((de.g) it.next());
        }
        synchronized (oVar) {
            hVar = oVar.f29839j;
        }
        a(hVar);
    }

    public final l B(de.g gVar) {
        if (this.f54496v) {
            return c().B(gVar);
        }
        if (gVar != null) {
            if (this.G == null) {
                this.G = new ArrayList();
            }
            this.G.add(gVar);
        }
        r();
        return this;
    }

    @Override // de.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final l a(de.a aVar) {
        d7.b.o(aVar);
        return (l) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final de.c D(int i13, int i14, h hVar, p pVar, de.a aVar, de.e eVar, de.f fVar, ee.i iVar, Object obj, s sVar) {
        de.e eVar2;
        de.e eVar3;
        de.e eVar4;
        de.k kVar;
        int i15;
        h hVar2;
        int i16;
        int i17;
        if (this.I != null) {
            eVar3 = new de.b(obj, eVar);
            eVar2 = eVar3;
        } else {
            eVar2 = null;
            eVar3 = eVar;
        }
        l lVar = this.H;
        if (lVar == null) {
            eVar4 = eVar2;
            Object obj2 = this.F;
            ArrayList arrayList = this.G;
            f fVar2 = this.D;
            kVar = new de.k(this.A, fVar2, obj, obj2, this.C, aVar, i13, i14, hVar, iVar, fVar, arrayList, eVar3, fVar2.f29773g, pVar.f29840a, sVar);
        } else {
            if (this.L) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            p pVar2 = lVar.f29792J ? pVar : lVar.E;
            if (de.a.k(lVar.f54475a, 8)) {
                hVar2 = this.H.f54478d;
            } else {
                int i18 = k.f29791b[hVar.ordinal()];
                if (i18 == 1) {
                    hVar2 = h.NORMAL;
                } else if (i18 == 2) {
                    hVar2 = h.HIGH;
                } else {
                    if (i18 != 3 && i18 != 4) {
                        throw new IllegalArgumentException("unknown priority: " + this.f54478d);
                    }
                    hVar2 = h.IMMEDIATE;
                }
            }
            h hVar3 = hVar2;
            l lVar2 = this.H;
            int i19 = lVar2.f54485k;
            int i23 = lVar2.f54484j;
            if (he.n.j(i13, i14)) {
                l lVar3 = this.H;
                if (!he.n.j(lVar3.f54485k, lVar3.f54484j)) {
                    i17 = aVar.f54485k;
                    i16 = aVar.f54484j;
                    de.l lVar4 = new de.l(obj, eVar3);
                    Object obj3 = this.F;
                    ArrayList arrayList2 = this.G;
                    f fVar3 = this.D;
                    eVar4 = eVar2;
                    de.k kVar2 = new de.k(this.A, fVar3, obj, obj3, this.C, aVar, i13, i14, hVar, iVar, fVar, arrayList2, lVar4, fVar3.f29773g, pVar.f29840a, sVar);
                    this.L = true;
                    l lVar5 = this.H;
                    de.c D = lVar5.D(i17, i16, hVar3, pVar2, lVar5, lVar4, fVar, iVar, obj, sVar);
                    this.L = false;
                    lVar4.f54543c = kVar2;
                    lVar4.f54544d = D;
                    kVar = lVar4;
                }
            }
            i16 = i23;
            i17 = i19;
            de.l lVar42 = new de.l(obj, eVar3);
            Object obj32 = this.F;
            ArrayList arrayList22 = this.G;
            f fVar32 = this.D;
            eVar4 = eVar2;
            de.k kVar22 = new de.k(this.A, fVar32, obj, obj32, this.C, aVar, i13, i14, hVar, iVar, fVar, arrayList22, lVar42, fVar32.f29773g, pVar.f29840a, sVar);
            this.L = true;
            l lVar52 = this.H;
            de.c D2 = lVar52.D(i17, i16, hVar3, pVar2, lVar52, lVar42, fVar, iVar, obj, sVar);
            this.L = false;
            lVar42.f54543c = kVar22;
            lVar42.f54544d = D2;
            kVar = lVar42;
        }
        de.b bVar = eVar4;
        if (bVar == 0) {
            return kVar;
        }
        l lVar6 = this.I;
        int i24 = lVar6.f54485k;
        int i25 = lVar6.f54484j;
        if (he.n.j(i13, i14)) {
            l lVar7 = this.I;
            if (!he.n.j(lVar7.f54485k, lVar7.f54484j)) {
                int i26 = aVar.f54485k;
                i15 = aVar.f54484j;
                i24 = i26;
                l lVar8 = this.I;
                de.c D3 = lVar8.D(i24, i15, lVar8.f54478d, lVar8.E, lVar8, bVar, fVar, iVar, obj, sVar);
                bVar.f54503c = kVar;
                bVar.f54504d = D3;
                return bVar;
            }
        }
        i15 = i25;
        l lVar82 = this.I;
        de.c D32 = lVar82.D(i24, i15, lVar82.f54478d, lVar82.E, lVar82, bVar, fVar, iVar, obj, sVar);
        bVar.f54503c = kVar;
        bVar.f54504d = D32;
        return bVar;
    }

    @Override // de.a
    /* renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final l clone() {
        l lVar = (l) super.clone();
        lVar.E = lVar.E.clone();
        if (lVar.G != null) {
            lVar.G = new ArrayList(lVar.G);
        }
        l lVar2 = lVar.H;
        if (lVar2 != null) {
            lVar.H = lVar2.c();
        }
        l lVar3 = lVar.I;
        if (lVar3 != null) {
            lVar.I = lVar3.c();
        }
        return lVar;
    }

    public final ee.i F(ee.i iVar, de.f fVar, de.a aVar, s sVar) {
        d7.b.o(iVar);
        if (!this.K) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object obj = new Object();
        p pVar = this.E;
        de.c D = D(aVar.f54485k, aVar.f54484j, aVar.f54478d, pVar, aVar, null, fVar, iVar, obj, sVar);
        de.c f44637j = iVar.getF44637j();
        if (D.c(f44637j) && (aVar.f54483i || !f44637j.i())) {
            d7.b.p(f44637j, "Argument must not be null");
            if (!f44637j.isRunning()) {
                f44637j.j();
            }
            return iVar;
        }
        this.B.e(iVar);
        iVar.Z(D);
        o oVar = this.B;
        synchronized (oVar) {
            oVar.f29835f.f15035a.add(iVar);
            ae.s sVar2 = oVar.f29833d;
            ((Set) sVar2.f15034d).add(D);
            if (sVar2.f15032b) {
                D.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((Set) sVar2.f15033c).add(D);
            } else {
                D.j();
            }
        }
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(android.widget.ImageView r5) {
        /*
            r4 = this;
            he.n.a()
            d7.b.o(r5)
            int r0 = r4.f54475a
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = de.a.k(r0, r1)
            r1 = 0
            if (r0 != 0) goto L6b
            boolean r0 = r4.f54488n
            if (r0 == 0) goto L6b
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L6b
            int[] r0 = com.bumptech.glide.k.f29790a
            android.widget.ImageView$ScaleType r2 = r5.getScaleType()
            int r2 = r2.ordinal()
            r0 = r0[r2]
            switch(r0) {
                case 1: goto L5b;
                case 2: goto L4b;
                case 3: goto L3b;
                case 4: goto L3b;
                case 5: goto L3b;
                case 6: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L6b
        L2b:
            com.bumptech.glide.l r0 = r4.c()
            wd.k r2 = wd.m.f129184b
            wd.h r3 = new wd.h
            r3.<init>()
            de.a r0 = r0.q(r2, r3, r1)
            goto L6c
        L3b:
            com.bumptech.glide.l r0 = r4.c()
            wd.k r2 = wd.m.f129183a
            wd.t r3 = new wd.t
            r3.<init>()
            de.a r0 = r0.q(r2, r3, r1)
            goto L6c
        L4b:
            com.bumptech.glide.l r0 = r4.c()
            wd.k r2 = wd.m.f129184b
            wd.h r3 = new wd.h
            r3.<init>()
            de.a r0 = r0.q(r2, r3, r1)
            goto L6c
        L5b:
            com.bumptech.glide.l r0 = r4.c()
            wd.k r2 = wd.m.f129185c
            wd.g r3 = new wd.g
            r3.<init>()
            de.a r0 = r0.l(r2, r3)
            goto L6c
        L6b:
            r0 = r4
        L6c:
            com.bumptech.glide.f r2 = r4.D
            wc.j r2 = r2.f29769c
            r2.getClass()
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.Class r3 = r4.C
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L83
            ee.b r2 = new ee.b
            r2.<init>(r5, r1)
            goto L91
        L83:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L98
            ee.b r2 = new ee.b
            r1 = 1
            r2.<init>(r5, r1)
        L91:
            androidx.appcompat.app.s r5 = he.g.f68946a
            r1 = 0
            r4.F(r2, r1, r0, r5)
            return
        L98:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.G(android.widget.ImageView):void");
    }

    public final ee.i H(ee.i iVar) {
        F(iVar, null, this, he.g.f68946a);
        return iVar;
    }

    public final l I(de.g gVar) {
        if (this.f54496v) {
            return c().I(gVar);
        }
        this.G = null;
        return B(gVar);
    }

    public final l J(Uri uri) {
        l K = K(uri);
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return K;
        }
        Context context = this.A;
        return (l) ((l) K.v(context.getTheme())).t(ge.a.c(context));
    }

    public final l K(Object obj) {
        if (this.f54496v) {
            return c().K(obj);
        }
        this.F = obj;
        this.K = true;
        r();
        return this;
    }

    public final de.f L(int i13, int i14) {
        de.f fVar = new de.f(i13, i14);
        F(fVar, fVar, this, he.g.f68947b);
        return fVar;
    }

    @Override // de.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (super.equals(lVar)) {
            return Objects.equals(this.C, lVar.C) && this.E.equals(lVar.E) && Objects.equals(this.F, lVar.F) && Objects.equals(this.G, lVar.G) && Objects.equals(this.H, lVar.H) && Objects.equals(this.I, lVar.I) && this.f29792J == lVar.f29792J && this.K == lVar.K;
        }
        return false;
    }

    @Override // de.a
    public final int hashCode() {
        return he.n.i(he.n.i(he.n.h(he.n.h(he.n.h(he.n.h(he.n.h(he.n.h(he.n.h(super.hashCode(), this.C), this.E), this.F), this.G), this.H), this.I), null), this.f29792J), this.K);
    }
}
