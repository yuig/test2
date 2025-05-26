package v;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public c0.k1 f123540a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.camera.core.impl.o2 f123541b;

    /* renamed from: c, reason: collision with root package name */
    public final l2 f123542c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f123543d;

    /* renamed from: e, reason: collision with root package name */
    public final p f123544e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.camera.core.impl.j2 f123545f;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        r12 = (android.util.Size) r0.get(0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m2(w.l r12, v.x1 r13, v.p r14) {
        /*
            r11 = this;
            r11.<init>()
            z.e r0 = new z.e
            r0.<init>()
            r1 = 0
            r11.f123545f = r1
            v.l2 r2 = new v.l2
            r2.<init>()
            r11.f123542c = r2
            r11.f123544e = r14
            w.y r12 = r12.b()
            r14 = 34
            android.util.Size[] r12 = r12.a(r14)
            java.lang.String r14 = "MeteringRepeating"
            r2 = 0
            if (r12 != 0) goto L2f
            java.lang.String r12 = "Can not get output size list."
            kh2.m0.s(r14, r12)
            android.util.Size r12 = new android.util.Size
            r12.<init>(r2, r2)
            goto Lb3
        L2f:
            androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r0 = r0.f140506a
            if (r0 == 0) goto L6a
            java.lang.String r0 = "Huawei"
            java.lang.String r3 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L6a
            java.lang.String r0 = "mha-l29"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L6a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r3 = r12.length
            r4 = r2
        L4e:
            if (r4 >= r3) goto L62
            r5 = r12[r4]
            e0.f r6 = z.e.f140505c
            android.util.Size r7 = z.e.f140504b
            int r6 = r6.compare(r5, r7)
            if (r6 < 0) goto L5f
            r0.add(r5)
        L5f:
            int r4 = r4 + 1
            goto L4e
        L62:
            android.util.Size[] r12 = new android.util.Size[r2]
            java.lang.Object[] r12 = r0.toArray(r12)
            android.util.Size[] r12 = (android.util.Size[]) r12
        L6a:
            java.util.List r0 = java.util.Arrays.asList(r12)
            v.j2 r3 = new v.j2
            r3.<init>(r2)
            java.util.Collections.sort(r0, r3)
            android.util.Size r13 = r13.e()
            int r3 = r13.getWidth()
            long r3 = (long) r3
            int r13 = r13.getHeight()
            long r5 = (long) r13
            long r3 = r3 * r5
            r5 = 307200(0x4b000, double:1.51777E-318)
            long r3 = java.lang.Math.min(r3, r5)
            int r13 = r12.length
            r5 = r2
        L8e:
            if (r5 >= r13) goto Lad
            r6 = r12[r5]
            int r7 = r6.getWidth()
            long r7 = (long) r7
            int r9 = r6.getHeight()
            long r9 = (long) r9
            long r7 = r7 * r9
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto La3
            r12 = r6
            goto Lb3
        La3:
            if (r7 <= 0) goto La9
            if (r1 == 0) goto Lad
            r12 = r1
            goto Lb3
        La9:
            int r5 = r5 + 1
            r1 = r6
            goto L8e
        Lad:
            java.lang.Object r12 = r0.get(r2)
            android.util.Size r12 = (android.util.Size) r12
        Lb3:
            r11.f123543d = r12
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "MeteringSession SurfaceTexture size: "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            kh2.m0.p(r14, r12)
            androidx.camera.core.impl.o2 r12 = r11.a()
            r11.f123541b = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.m2.<init>(w.l, v.x1, v.p):void");
    }

    public final androidx.camera.core.impl.o2 a() {
        int i13 = 0;
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.f123543d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        androidx.camera.core.impl.i2 d2 = androidx.camera.core.impl.i2.d(size, this.f123542c);
        d2.f16863b.f123384a = 1;
        c0.k1 k1Var = new c0.k1(surface);
        this.f123540a = k1Var;
        g0.m.a(g0.m.f(k1Var.f17009e), new k2(this, surface, surfaceTexture, i13), l3.c.s());
        d2.b(this.f123540a, c0.z.f24401d, -1);
        androidx.camera.core.impl.j2 j2Var = this.f123545f;
        if (j2Var != null) {
            j2Var.b();
        }
        androidx.camera.core.impl.j2 j2Var2 = new androidx.camera.core.impl.j2(new i2(this, i13));
        this.f123545f = j2Var2;
        d2.f16867f = j2Var2;
        return d2.c();
    }
}
