package t3;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public final class g4 extends View implements s3.y1 {

    /* renamed from: o */
    public static final f4 f116013o = new f4();

    /* renamed from: p */
    public static Method f116014p;

    /* renamed from: q */
    public static Field f116015q;

    /* renamed from: r */
    public static boolean f116016r;

    /* renamed from: s */
    public static boolean f116017s;

    /* renamed from: a */
    public final c0 f116018a;

    /* renamed from: b */
    public final m2 f116019b;

    /* renamed from: c */
    public Function2 f116020c;

    /* renamed from: d */
    public Function0 f116021d;

    /* renamed from: e */
    public final a3 f116022e;

    /* renamed from: f */
    public boolean f116023f;

    /* renamed from: g */
    public Rect f116024g;

    /* renamed from: h */
    public boolean f116025h;

    /* renamed from: i */
    public boolean f116026i;

    /* renamed from: j */
    public final h1.b f116027j;

    /* renamed from: k */
    public final x2 f116028k;

    /* renamed from: l */
    public long f116029l;

    /* renamed from: m */
    public boolean f116030m;

    /* renamed from: n */
    public int f116031n;

    public g4(c0 c0Var, m2 m2Var, p1.p1 p1Var, androidx.activity.a0 a0Var) {
        super(c0Var.getContext());
        this.f116018a = c0Var;
        this.f116019b = m2Var;
        this.f116020c = p1Var;
        this.f116021d = a0Var;
        this.f116022e = new a3();
        this.f116027j = new h1.b(2);
        this.f116028k = new x2(b2.f115857k);
        this.f116029l = b3.b1.f21304b;
        this.f116030m = true;
        setWillNotDraw(false);
        m2Var.addView(this);
        View.generateViewId();
    }

    @Override // s3.y1
    public final void a(float[] fArr) {
        b3.i0.g(fArr, this.f116028k.b(this));
    }

    @Override // s3.y1
    public final void b(p1.p1 p1Var, androidx.activity.a0 a0Var) {
        this.f116019b.addView(this);
        this.f116023f = false;
        this.f116026i = false;
        this.f116029l = b3.b1.f21304b;
        this.f116020c = p1Var;
        this.f116021d = a0Var;
    }

    @Override // s3.y1
    public final long c(long j13, boolean z13) {
        x2 x2Var = this.f116028k;
        if (!z13) {
            return b3.i0.b(j13, x2Var.b(this));
        }
        float[] a13 = x2Var.a(this);
        if (a13 != null) {
            return b3.i0.b(j13, a13);
        }
        return 9187343241974906880L;
    }

    @Override // s3.y1
    public final void d(long j13) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        if (i13 == getWidth() && i14 == getHeight()) {
            return;
        }
        setPivotX(b3.b1.b(this.f116029l) * i13);
        setPivotY(b3.b1.c(this.f116029l) * i14);
        setOutlineProvider(this.f116022e.b() != null ? f116013o : null);
        layout(getLeft(), getTop(), getLeft() + i13, getTop() + i14);
        m();
        this.f116028k.c();
    }

    @Override // s3.y1
    public final void destroy() {
        n(false);
        c0 c0Var = this.f116018a;
        c0Var.f115917y = true;
        this.f116020c = null;
        this.f116021d = null;
        c0Var.E(this);
        this.f116019b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z13;
        h1.b bVar = this.f116027j;
        Object obj = bVar.f66449b;
        Canvas canvas2 = ((b3.d) obj).f21309a;
        ((b3.d) obj).f21309a = canvas;
        b3.d dVar = (b3.d) obj;
        if (l() == null && canvas.isHardwareAccelerated()) {
            z13 = false;
        } else {
            dVar.j();
            this.f116022e.a(dVar);
            z13 = true;
        }
        Function2 function2 = this.f116020c;
        if (function2 != null) {
            function2.invoke(dVar, null);
        }
        if (z13) {
            dVar.restore();
        }
        ((b3.d) bVar.f66449b).f21309a = canvas2;
        n(false);
    }

    @Override // s3.y1
    public final void e(b3.u uVar, e3.d dVar) {
        boolean z13 = getElevation() > 0.0f;
        this.f116026i = z13;
        if (z13) {
            uVar.g();
        }
        this.f116019b.a(uVar, this, getDrawingTime());
        if (this.f116026i) {
            uVar.k();
        }
    }

    @Override // s3.y1
    public final boolean f(long j13) {
        float d2 = a3.c.d(j13);
        float e13 = a3.c.e(j13);
        if (this.f116023f) {
            return 0.0f <= d2 && d2 < ((float) getWidth()) && 0.0f <= e13 && e13 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f116022e.f(j13);
        }
        return true;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // s3.y1
    public final void g(b3.u0 u0Var) {
        Function0 function0;
        int i13 = u0Var.f21354a | this.f116031n;
        if ((i13 & 4096) != 0) {
            long j13 = u0Var.f21367n;
            this.f116029l = j13;
            setPivotX(b3.b1.b(j13) * getWidth());
            setPivotY(b3.b1.c(this.f116029l) * getHeight());
        }
        if ((i13 & 1) != 0) {
            setScaleX(u0Var.f21355b);
        }
        if ((i13 & 2) != 0) {
            setScaleY(u0Var.f21356c);
        }
        if ((i13 & 4) != 0) {
            setAlpha(u0Var.f21357d);
        }
        if ((i13 & 8) != 0) {
            setTranslationX(u0Var.f21358e);
        }
        if ((i13 & 16) != 0) {
            setTranslationY(u0Var.f21359f);
        }
        if ((i13 & 32) != 0) {
            setElevation(u0Var.f21360g);
        }
        if ((i13 & 1024) != 0) {
            setRotation(u0Var.f21365l);
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            setRotationX(u0Var.f21363j);
        }
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
            setRotationY(u0Var.f21364k);
        }
        if ((i13 & 2048) != 0) {
            setCameraDistance(u0Var.f21366m * getResources().getDisplayMetrics().densityDpi);
        }
        boolean z13 = true;
        boolean z14 = l() != null;
        boolean z15 = u0Var.f21369p;
        b3.r0 r0Var = b3.s0.f21349a;
        boolean z16 = z15 && u0Var.f21368o != r0Var;
        if ((i13 & 24576) != 0) {
            this.f116023f = z15 && u0Var.f21368o == r0Var;
            m();
            setClipToOutline(z16);
        }
        boolean g13 = this.f116022e.g(u0Var.f21374u, u0Var.f21357d, z16, u0Var.f21360g, u0Var.f21371r);
        a3 a3Var = this.f116022e;
        if (a3Var.c()) {
            setOutlineProvider(a3Var.b() != null ? f116013o : null);
        }
        boolean z17 = l() != null;
        if (z14 != z17 || (z17 && g13)) {
            invalidate();
        }
        if (!this.f116026i && getElevation() > 0.0f && (function0 = this.f116021d) != null) {
            function0.invoke();
        }
        if ((i13 & 7963) != 0) {
            this.f116028k.c();
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 28) {
            int i15 = i13 & 64;
            i4 i4Var = i4.f116038a;
            if (i15 != 0) {
                i4Var.a(this, androidx.compose.ui.graphics.a.u(u0Var.f21361h));
            }
            if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                i4Var.b(this, androidx.compose.ui.graphics.a.u(u0Var.f21362i));
            }
        }
        if (i14 >= 31 && (131072 & i13) != 0) {
            j4.f116047a.a(this, null);
        }
        if ((i13 & 32768) != 0) {
            int i16 = u0Var.f21370q;
            if (b3.s0.b(i16, 1)) {
                setLayerType(2, null);
            } else if (b3.s0.b(i16, 2)) {
                setLayerType(0, null);
                z13 = false;
            } else {
                setLayerType(0, null);
            }
            this.f116030m = z13;
        }
        this.f116031n = u0Var.f21354a;
    }

    @Override // s3.y1
    public final void h(float[] fArr) {
        float[] a13 = this.f116028k.a(this);
        if (a13 != null) {
            b3.i0.g(fArr, a13);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f116030m;
    }

    @Override // s3.y1
    public final void i(long j13) {
        int i13 = (int) (j13 >> 32);
        int left = getLeft();
        x2 x2Var = this.f116028k;
        if (i13 != left) {
            offsetLeftAndRight(i13 - getLeft());
            x2Var.c();
        }
        int i14 = (int) (j13 & 4294967295L);
        if (i14 != getTop()) {
            offsetTopAndBottom(i14 - getTop());
            x2Var.c();
        }
    }

    @Override // android.view.View, s3.y1
    public final void invalidate() {
        if (this.f116025h) {
            return;
        }
        n(true);
        super.invalidate();
        this.f116018a.invalidate();
    }

    @Override // s3.y1
    public final void j() {
        if (!this.f116025h || f116017s) {
            return;
        }
        e3.b.m(this);
        n(false);
    }

    @Override // s3.y1
    public final void k(a3.b bVar, boolean z13) {
        x2 x2Var = this.f116028k;
        if (!z13) {
            b3.i0.c(x2Var.b(this), bVar);
            return;
        }
        float[] a13 = x2Var.a(this);
        if (a13 != null) {
            b3.i0.c(a13, bVar);
        } else {
            bVar.c();
        }
    }

    public final b3.o0 l() {
        if (getClipToOutline()) {
            a3 a3Var = this.f116022e;
            if (!a3Var.e()) {
                return a3Var.d();
            }
        }
        return null;
    }

    public final void m() {
        Rect rect;
        if (this.f116023f) {
            Rect rect2 = this.f116024g;
            if (rect2 == null) {
                this.f116024g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.f(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f116024g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void n(boolean z13) {
        if (z13 != this.f116025h) {
            this.f116025h = z13;
            this.f116018a.w(this, z13);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }
}
