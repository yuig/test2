package t3;

import android.graphics.Canvas;
import android.os.Build;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class l3 implements s3.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f116076a;

    /* renamed from: b, reason: collision with root package name */
    public Function2 f116077b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f116078c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f116079d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f116081f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f116082g;

    /* renamed from: h, reason: collision with root package name */
    public b3.i f116083h;

    /* renamed from: l, reason: collision with root package name */
    public final i2 f116087l;

    /* renamed from: m, reason: collision with root package name */
    public int f116088m;

    /* renamed from: e, reason: collision with root package name */
    public final a3 f116080e = new a3();

    /* renamed from: i, reason: collision with root package name */
    public final x2 f116084i = new x2(u0.f116204k);

    /* renamed from: j, reason: collision with root package name */
    public final h1.b f116085j = new h1.b(2);

    /* renamed from: k, reason: collision with root package name */
    public long f116086k = b3.b1.f21304b;

    public l3(c0 c0Var, p1.p1 p1Var, androidx.activity.a0 a0Var) {
        this.f116076a = c0Var;
        this.f116077b = p1Var;
        this.f116078c = a0Var;
        i2 i3Var = Build.VERSION.SDK_INT >= 29 ? new i3() : new g3(c0Var);
        i3Var.w();
        i3Var.r(false);
        this.f116087l = i3Var;
    }

    @Override // s3.y1
    public final void a(float[] fArr) {
        b3.i0.g(fArr, this.f116084i.b(this.f116087l));
    }

    @Override // s3.y1
    public final void b(p1.p1 p1Var, androidx.activity.a0 a0Var) {
        l(false);
        this.f116081f = false;
        this.f116082g = false;
        this.f116086k = b3.b1.f21304b;
        this.f116077b = p1Var;
        this.f116078c = a0Var;
    }

    @Override // s3.y1
    public final long c(long j13, boolean z13) {
        i2 i2Var = this.f116087l;
        x2 x2Var = this.f116084i;
        if (!z13) {
            return b3.i0.b(j13, x2Var.b(i2Var));
        }
        float[] a13 = x2Var.a(i2Var);
        if (a13 != null) {
            return b3.i0.b(j13, a13);
        }
        return 9187343241974906880L;
    }

    @Override // s3.y1
    public final void d(long j13) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        float b13 = b3.b1.b(this.f116086k) * i13;
        i2 i2Var = this.f116087l;
        i2Var.E(b13);
        i2Var.F(b3.b1.c(this.f116086k) * i14);
        if (i2Var.s(i2Var.q(), i2Var.y(), i2Var.q() + i13, i2Var.y() + i14)) {
            i2Var.G(this.f116080e.b());
            if (!this.f116079d && !this.f116081f) {
                this.f116076a.invalidate();
                l(true);
            }
            this.f116084i.c();
        }
    }

    @Override // s3.y1
    public final void destroy() {
        i2 i2Var = this.f116087l;
        if (i2Var.d()) {
            i2Var.c();
        }
        this.f116077b = null;
        this.f116078c = null;
        this.f116081f = true;
        l(false);
        c0 c0Var = this.f116076a;
        c0Var.f115917y = true;
        c0Var.E(this);
    }

    @Override // s3.y1
    public final void e(b3.u uVar, e3.d dVar) {
        Canvas b13 = b3.e.b(uVar);
        boolean isHardwareAccelerated = b13.isHardwareAccelerated();
        i2 i2Var = this.f116087l;
        if (isHardwareAccelerated) {
            j();
            boolean z13 = i2Var.L() > 0.0f;
            this.f116082g = z13;
            if (z13) {
                uVar.g();
            }
            i2Var.p(b13);
            if (this.f116082g) {
                uVar.k();
                return;
            }
            return;
        }
        float q13 = i2Var.q();
        float y13 = i2Var.y();
        float I = i2Var.I();
        float D = i2Var.D();
        if (i2Var.a() < 1.0f) {
            b3.i iVar = this.f116083h;
            if (iVar == null) {
                iVar = androidx.compose.ui.graphics.a.g();
                this.f116083h = iVar;
            }
            iVar.c(i2Var.a());
            b13.saveLayer(q13, y13, I, D, iVar.f21325a);
        } else {
            uVar.j();
        }
        uVar.f(q13, y13);
        uVar.l(this.f116084i.b(i2Var));
        if (i2Var.z() || i2Var.x()) {
            this.f116080e.a(uVar);
        }
        Function2 function2 = this.f116077b;
        if (function2 != null) {
            function2.invoke(uVar, null);
        }
        uVar.restore();
        l(false);
    }

    @Override // s3.y1
    public final boolean f(long j13) {
        float d2 = a3.c.d(j13);
        float e13 = a3.c.e(j13);
        i2 i2Var = this.f116087l;
        if (i2Var.x()) {
            return 0.0f <= d2 && d2 < ((float) i2Var.j()) && 0.0f <= e13 && e13 < ((float) i2Var.i());
        }
        if (i2Var.z()) {
            return this.f116080e.f(j13);
        }
        return true;
    }

    @Override // s3.y1
    public final void g(b3.u0 u0Var) {
        Function0 function0;
        int i13 = u0Var.f21354a | this.f116088m;
        int i14 = i13 & 4096;
        if (i14 != 0) {
            this.f116086k = u0Var.f21367n;
        }
        i2 i2Var = this.f116087l;
        boolean z13 = i2Var.z();
        a3 a3Var = this.f116080e;
        boolean z14 = false;
        boolean z15 = z13 && !(a3Var.f115838g ^ true);
        if ((i13 & 1) != 0) {
            i2Var.e(u0Var.f21355b);
        }
        if ((i13 & 2) != 0) {
            i2Var.m(u0Var.f21356c);
        }
        if ((i13 & 4) != 0) {
            i2Var.n(u0Var.f21357d);
        }
        if ((i13 & 8) != 0) {
            i2Var.o(u0Var.f21358e);
        }
        if ((i13 & 16) != 0) {
            i2Var.b(u0Var.f21359f);
        }
        if ((i13 & 32) != 0) {
            i2Var.t(u0Var.f21360g);
        }
        if ((i13 & 64) != 0) {
            i2Var.H(androidx.compose.ui.graphics.a.u(u0Var.f21361h));
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            i2Var.K(androidx.compose.ui.graphics.a.u(u0Var.f21362i));
        }
        if ((i13 & 1024) != 0) {
            i2Var.l(u0Var.f21365l);
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            i2Var.g(u0Var.f21363j);
        }
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
            i2Var.h(u0Var.f21364k);
        }
        if ((i13 & 2048) != 0) {
            i2Var.f(u0Var.f21366m);
        }
        if (i14 != 0) {
            i2Var.E(b3.b1.b(this.f116086k) * i2Var.j());
            i2Var.F(b3.b1.c(this.f116086k) * i2Var.i());
        }
        boolean z16 = u0Var.f21369p;
        b3.r0 r0Var = b3.s0.f21349a;
        boolean z17 = z16 && u0Var.f21368o != r0Var;
        if ((i13 & 24576) != 0) {
            i2Var.J(z17);
            i2Var.r(u0Var.f21369p && u0Var.f21368o == r0Var);
        }
        if ((131072 & i13) != 0) {
            i2Var.k();
        }
        if ((32768 & i13) != 0) {
            i2Var.v(u0Var.f21370q);
        }
        boolean g13 = this.f116080e.g(u0Var.f21374u, u0Var.f21357d, z17, u0Var.f21360g, u0Var.f21371r);
        if (a3Var.f115837f) {
            i2Var.G(a3Var.b());
        }
        if (z17 && !(!a3Var.f115838g)) {
            z14 = true;
        }
        c0 c0Var = this.f116076a;
        if (z15 == z14 && (!z14 || !g13)) {
            e5.f115973a.a(c0Var);
        } else if (!this.f116079d && !this.f116081f) {
            c0Var.invalidate();
            l(true);
        }
        if (!this.f116082g && i2Var.L() > 0.0f && (function0 = this.f116078c) != null) {
            function0.invoke();
        }
        if ((i13 & 7963) != 0) {
            this.f116084i.c();
        }
        this.f116088m = u0Var.f21354a;
    }

    @Override // s3.y1
    public final void h(float[] fArr) {
        float[] a13 = this.f116084i.a(this.f116087l);
        if (a13 != null) {
            b3.i0.g(fArr, a13);
        }
    }

    @Override // s3.y1
    public final void i(long j13) {
        i2 i2Var = this.f116087l;
        int q13 = i2Var.q();
        int y13 = i2Var.y();
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        if (q13 == i13 && y13 == i14) {
            return;
        }
        if (q13 != i13) {
            i2Var.B(i13 - q13);
        }
        if (y13 != i14) {
            i2Var.u(i14 - y13);
        }
        e5.f115973a.a(this.f116076a);
        this.f116084i.c();
    }

    @Override // s3.y1
    public final void invalidate() {
        if (this.f116079d || this.f116081f) {
            return;
        }
        this.f116076a.invalidate();
        l(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    @Override // s3.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r6 = this;
            boolean r0 = r6.f116079d
            t3.i2 r1 = r6.f116087l
            if (r0 != 0) goto Lc
            boolean r0 = r1.d()
            if (r0 != 0) goto L33
        Lc:
            boolean r0 = r1.z()
            if (r0 == 0) goto L20
            t3.a3 r0 = r6.f116080e
            boolean r2 = r0.f115838g
            r2 = r2 ^ 1
            if (r2 != 0) goto L20
            r0.h()
            b3.o0 r0 = r0.f115836e
            goto L21
        L20:
            r0 = 0
        L21:
            kotlin.jvm.functions.Function2 r2 = r6.f116077b
            r3 = 0
            if (r2 == 0) goto L30
            h1.b r4 = r6.f116085j
            t3.k3 r5 = new t3.k3
            r5.<init>(r3, r2)
            r1.C(r4, r0, r5)
        L30:
            r6.l(r3)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.l3.j():void");
    }

    @Override // s3.y1
    public final void k(a3.b bVar, boolean z13) {
        i2 i2Var = this.f116087l;
        x2 x2Var = this.f116084i;
        if (!z13) {
            b3.i0.c(x2Var.b(i2Var), bVar);
            return;
        }
        float[] a13 = x2Var.a(i2Var);
        if (a13 == null) {
            bVar.c();
        } else {
            b3.i0.c(a13, bVar);
        }
    }

    public final void l(boolean z13) {
        if (z13 != this.f116079d) {
            this.f116079d = z13;
            this.f116076a.w(this, z13);
        }
    }
}
