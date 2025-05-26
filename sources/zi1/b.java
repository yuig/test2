package zi1;

import android.graphics.Canvas;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import hs1.q;
import kotlin.jvm.internal.Intrinsics;
import ua2.d1;
import ua2.i0;
import ua2.z0;
import ui1.m;
import wa2.l;

/* loaded from: classes2.dex */
public final class b extends d1 implements i0, wi1.a, ui1.a {

    /* renamed from: h, reason: collision with root package name */
    public final q f142000h;

    /* renamed from: i, reason: collision with root package name */
    public int f142001i;

    /* renamed from: j, reason: collision with root package name */
    public d f142002j;

    /* renamed from: k, reason: collision with root package name */
    public float f142003k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SbaPinRep pinRepView, q imageCache) {
        super(pinRepView);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.f142000h = imageCache;
        this.f142003k = 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0, r7.getClass()) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(zi1.c r9) {
        /*
            r8 = this;
            java.lang.String r0 = "displayState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            zi1.d r0 = r8.f142002j
            r1 = 0
            java.lang.String r2 = "pinChipsDrawable"
            r3 = 3
            r4 = 2
            r5 = 1
            android.view.View r6 = r8.f121492a
            if (r0 == 0) goto L3f
            cs.c r0 = r9.f142006c
            int[] r7 = zi1.a.f141999a
            int r0 = r0.ordinal()
            r0 = r7[r0]
            if (r0 == r5) goto L2a
            if (r0 == r4) goto L27
            if (r0 == r3) goto L24
            java.lang.Class<zi1.d> r0 = zi1.d.class
            goto L2c
        L24:
            java.lang.Class<zi1.g> r0 = zi1.g.class
            goto L2c
        L27:
            java.lang.Class<zi1.h> r0 = zi1.h.class
            goto L2c
        L2a:
            java.lang.Class<zi1.f> r0 = zi1.f.class
        L2c:
            zi1.d r7 = r8.f142002j
            if (r7 == 0) goto L3b
            java.lang.Class r7 = r7.getClass()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r7)
            if (r0 != 0) goto L6a
            goto L3f
        L3b:
            kotlin.jvm.internal.Intrinsics.r(r2)
            throw r1
        L3f:
            cs.c r0 = r9.f142006c
            int[] r7 = zi1.a.f141999a
            int r0 = r0.ordinal()
            r0 = r7[r0]
            hs1.q r7 = r8.f142000h
            if (r0 == r5) goto L63
            if (r0 == r4) goto L5d
            if (r0 == r3) goto L57
            zi1.d r0 = new zi1.d
            r0.<init>(r6, r7)
            goto L68
        L57:
            zi1.g r0 = new zi1.g
            r0.<init>(r6, r7)
            goto L68
        L5d:
            zi1.h r0 = new zi1.h
            r0.<init>(r6, r7)
            goto L68
        L63:
            zi1.f r0 = new zi1.f
            r0.<init>(r6, r7)
        L68:
            r8.f142002j = r0
        L6a:
            float r0 = r9.f142007d
            r8.f142003k = r0
            zi1.d r0 = r8.f142002j
            if (r0 == 0) goto L84
            zi1.e r1 = r9.f142005b
            r0.h(r1)
            android.content.res.Resources r0 = r6.getResources()
            int r9 = r9.f142004a
            int r9 = r0.getDimensionPixelSize(r9)
            r8.f142001i = r9
            return
        L84:
            kotlin.jvm.internal.Intrinsics.r(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zi1.b.A(zi1.c):void");
    }

    @Override // ui1.a
    public final ui1.c d(int i13, int i14) {
        d dVar = this.f142002j;
        if (dVar == null) {
            Intrinsics.r("pinChipsDrawable");
            throw null;
        }
        if (!dVar.o(i13, i14)) {
            return ui1.b.f122290a;
        }
        d dVar2 = this.f142002j;
        if (dVar2 == null) {
            Intrinsics.r("pinChipsDrawable");
            throw null;
        }
        dVar2.n(i13, i14);
        d dVar3 = this.f142002j;
        if (dVar3 != null) {
            return new m(dVar3.i());
        }
        Intrinsics.r("pinChipsDrawable");
        throw null;
    }

    @Override // ua2.f1
    public final l k() {
        d dVar = this.f142002j;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("pinChipsDrawable");
        throw null;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        d dVar = this.f142002j;
        if (dVar == null) {
            Intrinsics.r("pinChipsDrawable");
            throw null;
        }
        dVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        d dVar = this.f142002j;
        if (dVar == null) {
            Intrinsics.r("pinChipsDrawable");
            throw null;
        }
        dVar.l(this.f142001i);
        d dVar2 = this.f142002j;
        if (dVar2 == null) {
            Intrinsics.r("pinChipsDrawable");
            throw null;
        }
        dVar2.m(i14, this.f142003k, i13);
        d dVar3 = this.f142002j;
        if (dVar3 == null) {
            Intrinsics.r("pinChipsDrawable");
            throw null;
        }
        dVar3.k();
        d dVar4 = this.f142002j;
        if (dVar4 != null) {
            return new z0(i13, dVar4.b());
        }
        Intrinsics.r("pinChipsDrawable");
        throw null;
    }
}
