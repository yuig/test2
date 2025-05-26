package zf;

import android.graphics.Canvas;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class g extends h {

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f141829f;

    /* renamed from: g, reason: collision with root package name */
    public WeakReference f141830g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f141831h;

    @Override // zf.h
    public final void q(Canvas canvas) {
        Iterator it = this.f141829f.iterator();
        while (it.hasNext()) {
            ((h) it.next()).q(canvas);
        }
    }

    @Override // zf.h
    public final void r(Canvas canvas) {
        Iterator it = this.f141829f.iterator();
        while (it.hasNext()) {
            ((h) it.next()).r(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[SYNTHETIC] */
    @Override // zf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(android.graphics.Canvas r10, vf.c[] r11) {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.f141830g
            java.lang.Object r0 = r0.get()
            com.github.mikephil.charting.charts.Chart r0 = (com.github.mikephil.charting.charts.Chart) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.ArrayList r1 = r9.f141829f
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L91
            java.lang.Object r2 = r1.next()
            zf.h r2 = (zf.h) r2
            boolean r3 = r2 instanceof zf.b
            r4 = 0
            if (r3 == 0) goto L2c
            r3 = r2
            zf.b r3 = (zf.b) r3
            wf.a r3 = r3.f141824g
            r3.f()
        L2a:
            r3 = r4
            goto L61
        L2c:
            boolean r3 = r2 instanceof zf.n
            if (r3 == 0) goto L3a
            r3 = r2
            zf.n r3 = (zf.n) r3
            wf.g r3 = r3.f141851h
            tf.g r3 = r3.e()
            goto L61
        L3a:
            boolean r3 = r2 instanceof zf.e
            if (r3 == 0) goto L47
            r3 = r2
            zf.e r3 = (zf.e) r3
            wf.d r3 = r3.f141827h
            r3.g()
            goto L2a
        L47:
            boolean r3 = r2 instanceof zf.s
            if (r3 == 0) goto L54
            r3 = r2
            zf.s r3 = (zf.s) r3
            wf.h r3 = r3.f141879h
            r3.b()
            goto L2a
        L54:
            boolean r3 = r2 instanceof zf.d
            if (r3 == 0) goto L2a
            r3 = r2
            zf.d r3 = (zf.d) r3
            wf.c r3 = r3.f141826g
            r3.a()
            goto L2a
        L61:
            if (r3 != 0) goto L8b
            java.util.ArrayList r3 = r9.f141831h
            r3.clear()
            int r4 = r11.length
            r5 = 0
        L6a:
            if (r5 >= r4) goto L7b
            r6 = r11[r5]
            int r7 = r6.f125769e
            r8 = -1
            if (r7 == r8) goto L75
            if (r7 != r8) goto L78
        L75:
            r3.add(r6)
        L78:
            int r5 = r5 + 1
            goto L6a
        L7b:
            int r4 = r3.size()
            vf.c[] r4 = new vf.c[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            vf.c[] r3 = (vf.c[]) r3
            r2.s(r10, r3)
            goto L11
        L8b:
            tf.c r10 = r0.f30149a
            pk2.f.q(r10)
            throw r4
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zf.g.s(android.graphics.Canvas, vf.c[]):void");
    }

    @Override // zf.h
    public final void t(Canvas canvas) {
        Iterator it = this.f141829f.iterator();
        while (it.hasNext()) {
            ((h) it.next()).t(canvas);
        }
    }

    @Override // zf.h
    public final void u() {
        Iterator it = this.f141829f.iterator();
        while (it.hasNext()) {
            ((h) it.next()).u();
        }
    }
}
