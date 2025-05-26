package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.media.ImageReader;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.s0;
import androidx.camera.core.impl.u2;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import b4.q0;
import c0.b0;
import c0.d1;
import c0.n0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import rl2.g0;
import v.z1;

/* loaded from: classes2.dex */
public final class o implements androidx.camera.core.impl.z, c1, e0.e {

    /* renamed from: a */
    public final /* synthetic */ int f53536a;

    public /* synthetic */ o(int i13) {
        this.f53536a = i13;
    }

    public static final float[] e() {
        float[] fArr = j1.v.f74256s;
        float[] fArr2 = j1.v.f74256s;
        if (fArr2 != null) {
            return fArr2;
        }
        float[] fArr3 = new float[91];
        j1.v.f74256s = fArr3;
        return fArr3;
    }

    public static a2.b i(a2.b bVar, n4.k kVar, q0 q0Var, n4.b bVar2, g4.d dVar) {
        if (bVar != null && kVar == bVar.f379a && Intrinsics.d(q0Var, bVar.f380b) && bVar2.b() == bVar.f381c.b() && dVar == bVar.f382d) {
            return bVar;
        }
        a2.b bVar3 = a2.b.f378h;
        if (bVar3 != null && kVar == bVar3.f379a && Intrinsics.d(q0Var, bVar3.f380b) && bVar2.b() == bVar3.f381c.b() && dVar == bVar3.f382d) {
            return bVar3;
        }
        a2.b bVar4 = new a2.b(kVar, g0.f0(q0Var, kVar), new n4.c(bVar2.b(), bVar2.j0()), dVar);
        a2.b.f378h = bVar4;
        return bVar4;
    }

    public static long j() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    @Override // androidx.camera.core.impl.z
    public final androidx.camera.core.impl.t C() {
        return androidx.camera.core.impl.t.UNKNOWN;
    }

    @Override // e0.e
    public final void a(String str) {
    }

    @Override // androidx.camera.core.impl.c1
    public final boolean b(int i13) {
        return false;
    }

    @Override // e0.e
    public final void close() {
    }

    @Override // e0.e
    public final void d() {
    }

    @Override // androidx.camera.core.impl.z
    public final u2 f() {
        return u2.f16976b;
    }

    public final Object g(Object obj) {
        e0.h hVar;
        switch (this.f53536a) {
            case 0:
                l0.b bVar = (l0.b) obj;
                c0.c1 c1Var = new c0.c1(new z1(ImageReader.newInstance(bVar.f81197d.getWidth(), bVar.f81197d.getHeight(), RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 2)));
                n0 a13 = ImageProcessingUtil.a(c1Var, (byte[]) bVar.f81194a);
                c1Var.a();
                Objects.requireNonNull(a13);
                e0.h hVar2 = bVar.f81195b;
                Objects.requireNonNull(hVar2);
                Matrix matrix = bVar.f81200g;
                androidx.camera.core.impl.z zVar = bVar.f81201h;
                Rect rect = bVar.f81198e;
                int i13 = bVar.f81199f;
                b0 b0Var = (b0) a13;
                Size size = new Size(b0Var.j(), b0Var.i());
                b0Var.S0();
                return new l0.b(a13, hVar2, b0Var.S0(), size, rect, i13, matrix, zVar);
            case 1:
                l0.b bVar2 = (l0.b) obj;
                n0 n0Var = (n0) bVar2.f81194a;
                d1 d1Var = new d1(n0Var, bVar2.f81197d, new c0.g(n0Var.H1().f(), n0Var.H1().h(), bVar2.f81199f, bVar2.f81200g));
                d1Var.c(bVar2.f81198e);
                return d1Var;
            default:
                f fVar = (f) obj;
                n0 n0Var2 = fVar.f53511b;
                s sVar = fVar.f53510a;
                if (bp1.h.u(n0Var2.S0())) {
                    try {
                        a.g gVar = e0.h.f56702b;
                        ByteBuffer l13 = n0Var2.W0()[0].l();
                        l13.rewind();
                        byte[] bArr = new byte[l13.capacity()];
                        l13.get(bArr);
                        hVar = new e0.h(new k6.g(new ByteArrayInputStream(bArr)));
                        n0Var2.W0()[0].l().rewind();
                    } catch (IOException e13) {
                        throw new ImageCaptureException("Failed to extract EXIF data.", e13);
                    }
                } else {
                    hVar = null;
                }
                if (((ImageCaptureRotationOptionQuirk) i0.a.f70646a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                    androidx.camera.core.impl.c cVar = s0.f16964i;
                } else if (bp1.h.u(n0Var2.S0())) {
                    com.bumptech.glide.d.s(hVar, "JPEG image must have exif.");
                    Size size2 = new Size(n0Var2.j(), n0Var2.i());
                    int d2 = sVar.f53557d - hVar.d();
                    Size size3 = e0.u.c(e0.u.h(d2)) ? new Size(size2.getHeight(), size2.getWidth()) : size2;
                    Matrix a14 = e0.u.a(d2, new RectF(0.0f, 0.0f, size2.getWidth(), size2.getHeight()), new RectF(0.0f, 0.0f, size3.getWidth(), size3.getHeight()), false);
                    RectF rectF = new RectF(sVar.f53556c);
                    a14.mapRect(rectF);
                    rectF.sort();
                    Rect rect2 = new Rect();
                    rectF.round(rect2);
                    int d13 = hVar.d();
                    Matrix matrix2 = new Matrix(sVar.f53559f);
                    matrix2.postConcat(a14);
                    androidx.camera.core.impl.z oVar = n0Var2.H1() instanceof h0.c ? ((h0.c) n0Var2.H1()).f66375a : new o(3);
                    n0Var2.S0();
                    return new l0.b(n0Var2, hVar, n0Var2.S0(), size3, rect2, d13, matrix2, oVar);
                }
                Rect rect3 = sVar.f53556c;
                androidx.camera.core.impl.z oVar2 = n0Var2.H1() instanceof h0.c ? ((h0.c) n0Var2.H1()).f66375a : new o(3);
                int i14 = sVar.f53557d;
                Matrix matrix3 = sVar.f53559f;
                Size size4 = new Size(n0Var2.j(), n0Var2.i());
                if (bp1.h.u(n0Var2.S0())) {
                    com.bumptech.glide.d.s(hVar, "JPEG image must have Exif.");
                }
                return new l0.b(n0Var2, hVar, n0Var2.S0(), size4, rect3, i14, matrix3, oVar2);
        }
    }

    @Override // androidx.camera.core.impl.z
    public final long h() {
        return -1L;
    }

    @Override // androidx.camera.core.impl.c1
    public final androidx.camera.core.impl.d1 k(int i13) {
        return null;
    }

    @Override // androidx.camera.core.impl.z
    public final androidx.camera.core.impl.y p() {
        return androidx.camera.core.impl.y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    public final CaptureResult r() {
        return null;
    }

    @Override // androidx.camera.core.impl.z
    public final androidx.camera.core.impl.v t() {
        return androidx.camera.core.impl.v.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.z
    public final androidx.camera.core.impl.x y() {
        return androidx.camera.core.impl.x.UNKNOWN;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13, int i14) {
        this(6);
        this.f53536a = i13;
        switch (i13) {
            case 8:
                this(8);
                break;
            case 9:
            default:
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
