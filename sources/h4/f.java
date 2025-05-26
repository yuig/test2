package h4;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.d1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n3.d0 f67541a;

    /* renamed from: b, reason: collision with root package name */
    public final p f67542b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f67544d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f67545e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f67546f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f67547g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f67548h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f67549i;

    /* renamed from: j, reason: collision with root package name */
    public f0 f67550j;

    /* renamed from: k, reason: collision with root package name */
    public b4.m0 f67551k;

    /* renamed from: l, reason: collision with root package name */
    public y f67552l;

    /* renamed from: n, reason: collision with root package name */
    public a3.d f67554n;

    /* renamed from: o, reason: collision with root package name */
    public a3.d f67555o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f67543c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public Function1 f67553m = e.f67535j;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f67556p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f67557q = b3.i0.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f67558r = new Matrix();

    public f(n3.d0 d0Var, q qVar) {
        this.f67541a = d0Var;
        this.f67542b = qVar;
    }

    public final void a() {
        q qVar = (q) this.f67542b;
        if (((InputMethodManager) qVar.f67606b.getValue()).isActive(qVar.f67605a)) {
            Function1 function1 = this.f67553m;
            float[] fArr = this.f67557q;
            function1.invoke(new b3.i0(fArr));
            t3.c0 c0Var = (t3.c0) this.f67541a;
            c0Var.D();
            b3.i0.g(fArr, c0Var.L);
            float d2 = a3.c.d(c0Var.P);
            float e13 = a3.c.e(c0Var.P);
            float[] fArr2 = c0Var.K;
            b3.i0.d(fArr2);
            b3.i0.h(fArr2, d2, e13, 0.0f);
            d1.c(fArr, fArr2);
            Matrix matrix = this.f67558r;
            androidx.compose.ui.graphics.a.r(matrix, fArr);
            f0 f0Var = this.f67550j;
            Intrinsics.f(f0Var);
            y yVar = this.f67552l;
            Intrinsics.f(yVar);
            b4.m0 m0Var = this.f67551k;
            Intrinsics.f(m0Var);
            a3.d dVar = this.f67554n;
            Intrinsics.f(dVar);
            a3.d dVar2 = this.f67555o;
            Intrinsics.f(dVar2);
            ((InputMethodManager) qVar.f67606b.getValue()).updateCursorAnchorInfo(qVar.f67605a, kh2.m0.h(this.f67556p, f0Var, yVar, m0Var, matrix, dVar, dVar2, this.f67546f, this.f67547g, this.f67548h, this.f67549i));
            this.f67545e = false;
        }
    }
}
