package o8;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import d7.d0;
import d7.j0;
import d7.n;
import d7.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import n8.v;
import rl2.g0;
import s7.z;

/* loaded from: classes3.dex */
public final class i implements v, a {

    /* renamed from: i, reason: collision with root package name */
    public int f93454i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f93455j;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f93457l;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f93446a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f93447b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f93448c = new g();

    /* renamed from: d, reason: collision with root package name */
    public final z f93449d = new z(1);

    /* renamed from: e, reason: collision with root package name */
    public final j0 f93450e = new j0();

    /* renamed from: f, reason: collision with root package name */
    public final j0 f93451f = new j0();

    /* renamed from: g, reason: collision with root package name */
    public final float[] f93452g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f93453h = new float[16];

    /* renamed from: k, reason: collision with root package name */
    public int f93456k = -1;

    @Override // o8.a
    public final void a(long j13, float[] fArr) {
        ((j0) this.f93449d.f111348d).a(j13, fArr);
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            n.d();
            this.f93448c.a();
            n.d();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            n.d();
            int i13 = iArr[0];
            n.b(36197, i13, 9729);
            this.f93454i = i13;
        } catch (GlUtil$GlException e13) {
            u.d("SceneRenderer", "Failed to initialize the renderer", e13);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f93454i);
        this.f93455j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: o8.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f93446a.set(true);
            }
        });
        return this.f93455j;
    }

    @Override // o8.a
    public final void c() {
        this.f93450e.c();
        z zVar = this.f93449d;
        ((j0) zVar.f111348d).c();
        zVar.f111345a = false;
        this.f93447b.set(true);
    }

    @Override // n8.v
    public final void d(long j13, long j14, androidx.media3.common.b bVar, MediaFormat mediaFormat) {
        int i13;
        int i14;
        float[] fArr;
        ArrayList arrayList;
        int k13;
        i iVar = this;
        iVar.f93450e.a(j14, Long.valueOf(j13));
        byte[] bArr = bVar.A;
        byte[] bArr2 = iVar.f93457l;
        int i15 = iVar.f93456k;
        iVar.f93457l = bArr;
        int i16 = bVar.B;
        if (i16 == -1) {
            i16 = 0;
        }
        iVar.f93456k = i16;
        if (i15 == i16 && Arrays.equals(bArr2, bArr)) {
            return;
        }
        byte[] bArr3 = iVar.f93457l;
        f fVar = null;
        if (bArr3 != null) {
            int i17 = iVar.f93456k;
            d0 d0Var = new d0(bArr3);
            try {
                d0Var.L(4);
                k13 = d0Var.k();
                d0Var.K(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (k13 == 1886547818) {
                d0Var.L(8);
                int i18 = d0Var.f53807b;
                int i19 = d0Var.f53808c;
                while (i18 < i19) {
                    int k14 = d0Var.k() + i18;
                    if (k14 <= i18 || k14 > i19) {
                        break;
                    }
                    int k15 = d0Var.k();
                    if (k15 != 2037673328 && k15 != 1836279920) {
                        d0Var.K(k14);
                        i18 = k14;
                    }
                    d0Var.J(k14);
                    arrayList = g0.b0(d0Var);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = g0.b0(d0Var);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    e eVar = (e) arrayList.get(0);
                    fVar = new f(eVar, eVar, i17);
                } else if (size == 2) {
                    fVar = new f((e) arrayList.get(0), (e) arrayList.get(1), i17);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i23 = iVar.f93456k;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f13 = radians / 36;
            float f14 = radians2 / 72;
            float[] fArr2 = new float[15984];
            float[] fArr3 = new float[10656];
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            for (int i27 = 36; i24 < i27; i27 = 36) {
                float f15 = radians / 2.0f;
                float f16 = (i24 * f13) - f15;
                int i28 = i24 + 1;
                float f17 = (i28 * f13) - f15;
                int i29 = 0;
                while (i29 < 73) {
                    float f18 = f17;
                    int i33 = i28;
                    float f19 = f16;
                    int i34 = i25;
                    int i35 = i26;
                    int i36 = 2;
                    int i37 = 0;
                    while (i37 < i36) {
                        float f23 = i29 * f14;
                        float f24 = f14;
                        int i38 = i29;
                        double d2 = 50.0f;
                        int i39 = i23;
                        double d13 = (3.1415927f + f23) - (radians2 / 2.0f);
                        int i43 = i37;
                        double d14 = i37 == 0 ? f19 : f18;
                        float[] fArr4 = fArr3;
                        int i44 = i24;
                        fArr2[i34] = -((float) (Math.cos(d14) * Math.sin(d13) * d2));
                        fArr2[i34 + 1] = (float) (Math.sin(d14) * d2);
                        int i45 = i34 + 3;
                        fArr2[i34 + 2] = (float) (Math.cos(d14) * Math.cos(d13) * d2);
                        fArr4[i35] = f23 / radians2;
                        int i46 = i35 + 2;
                        fArr4[i35 + 1] = ((i44 + i43) * f13) / radians;
                        if (i38 == 0 && i43 == 0) {
                            i14 = i43;
                            i13 = i38;
                        } else {
                            i13 = i38;
                            i14 = i43;
                            if (i13 != 72 || i14 != 1) {
                                fArr = fArr4;
                                i36 = 2;
                                i34 = i45;
                                i35 = i46;
                                i37 = i14 + 1;
                                fArr3 = fArr;
                                f14 = f24;
                                i24 = i44;
                                i29 = i13;
                                i23 = i39;
                            }
                        }
                        System.arraycopy(fArr2, i34, fArr2, i45, 3);
                        i34 += 6;
                        fArr = fArr4;
                        i36 = 2;
                        System.arraycopy(fArr, i35, fArr, i46, 2);
                        i35 += 4;
                        i37 = i14 + 1;
                        fArr3 = fArr;
                        f14 = f24;
                        i24 = i44;
                        i29 = i13;
                        i23 = i39;
                    }
                    i25 = i34;
                    i26 = i35;
                    f17 = f18;
                    i28 = i33;
                    f16 = f19;
                    i23 = i23;
                    i29++;
                }
                i24 = i28;
            }
            e eVar2 = new e(new g.i(0, 1, fArr2, fArr3));
            fVar = new f(eVar2, eVar2, i23);
            iVar = this;
        }
        iVar.f93451f.a(j14, fVar);
    }
}
