package y1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import b4.m0;
import b4.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f136518a;

    /* renamed from: b, reason: collision with root package name */
    public final w f136519b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f136521d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f136522e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f136523f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f136524g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f136525h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f136526i;

    /* renamed from: j, reason: collision with root package name */
    public h4.f0 f136527j;

    /* renamed from: k, reason: collision with root package name */
    public m0 f136528k;

    /* renamed from: l, reason: collision with root package name */
    public h4.y f136529l;

    /* renamed from: m, reason: collision with root package name */
    public a3.d f136530m;

    /* renamed from: n, reason: collision with root package name */
    public a3.d f136531n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f136520c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f136532o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f136533p = b3.i0.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f136534q = new Matrix();

    public a0(d dVar, x xVar) {
        this.f136518a = dVar;
        this.f136519b = xVar;
    }

    public final void a() {
        CursorAnchorInfo.Builder builder;
        x xVar = (x) this.f136519b;
        if (!xVar.a().isActive(xVar.f136605a) || this.f136527j == null || this.f136529l == null || this.f136528k == null || this.f136530m == null || this.f136531n == null) {
            return;
        }
        float[] fArr = this.f136533p;
        b3.i0.d(fArr);
        this.f136518a.invoke(new b3.i0(fArr));
        a3.d dVar = this.f136531n;
        Intrinsics.f(dVar);
        float f13 = -dVar.f484a;
        a3.d dVar2 = this.f136531n;
        Intrinsics.f(dVar2);
        b3.i0.h(fArr, f13, -dVar2.f485b, 0.0f);
        Matrix matrix = this.f136534q;
        androidx.compose.ui.graphics.a.r(matrix, fArr);
        h4.f0 f0Var = this.f136527j;
        Intrinsics.f(f0Var);
        h4.y yVar = this.f136529l;
        Intrinsics.f(yVar);
        m0 m0Var = this.f136528k;
        Intrinsics.f(m0Var);
        a3.d dVar3 = this.f136530m;
        Intrinsics.f(dVar3);
        a3.d dVar4 = this.f136531n;
        Intrinsics.f(dVar4);
        boolean z13 = this.f136523f;
        boolean z14 = this.f136524g;
        boolean z15 = this.f136525h;
        boolean z16 = this.f136526i;
        CursorAnchorInfo.Builder builder2 = this.f136532o;
        builder2.reset();
        builder2.setMatrix(matrix);
        long j13 = f0Var.f67560b;
        int e13 = p0.e(j13);
        builder2.setSelectionRange(e13, p0.d(j13));
        if (!z13 || e13 < 0) {
            builder = builder2;
        } else {
            int b13 = yVar.b(e13);
            a3.d c13 = m0Var.c(b13);
            float f14 = ql2.s.f(c13.f484a, 0.0f, (int) (m0Var.f21617c >> 32));
            boolean d2 = androidx.compose.foundation.text.input.internal.a.d(dVar3, f14, c13.f485b);
            boolean d13 = androidx.compose.foundation.text.input.internal.a.d(dVar3, f14, c13.f487d);
            boolean z17 = m0Var.a(b13) == m4.h.Rtl;
            int i13 = (d2 || d13) ? 1 : 0;
            if (!d2 || !d13) {
                i13 |= 2;
            }
            int i14 = z17 ? i13 | 4 : i13;
            float f15 = c13.f485b;
            float f16 = c13.f487d;
            builder = builder2;
            builder2.setInsertionMarkerLocation(f14, f15, f16, f16, i14);
        }
        if (z14) {
            p0 p0Var = f0Var.f67561c;
            int e14 = p0Var != null ? p0.e(p0Var.f21641a) : -1;
            int d14 = p0Var != null ? p0.d(p0Var.f21641a) : -1;
            if (e14 >= 0 && e14 < d14) {
                builder.setComposingText(e14, f0Var.f67559a.f21571a.subSequence(e14, d14));
                int b14 = yVar.b(e14);
                int b15 = yVar.b(d14);
                float[] fArr2 = new float[(b15 - b14) * 4];
                m0Var.f21616b.a(b7.c.h(b14, b15), fArr2);
                int i15 = e14;
                while (i15 < d14) {
                    int b16 = yVar.b(i15);
                    int i16 = (b16 - b14) * 4;
                    float f17 = fArr2[i16];
                    int i17 = b14;
                    float f18 = fArr2[i16 + 1];
                    int i18 = d14;
                    float f19 = fArr2[i16 + 2];
                    float f23 = fArr2[i16 + 3];
                    h4.y yVar2 = yVar;
                    int i19 = (dVar3.f486c <= f17 || f19 <= dVar3.f484a || dVar3.f487d <= f18 || f23 <= dVar3.f485b) ? 0 : 1;
                    if (!androidx.compose.foundation.text.input.internal.a.d(dVar3, f17, f18) || !androidx.compose.foundation.text.input.internal.a.d(dVar3, f19, f23)) {
                        i19 |= 2;
                    }
                    if (m0Var.a(b16) == m4.h.Rtl) {
                        i19 |= 4;
                    }
                    builder.addCharacterBounds(i15, f17, f18, f19, f23, i19);
                    i15++;
                    b14 = i17;
                    d14 = i18;
                    yVar = yVar2;
                    fArr2 = fArr2;
                }
            }
        }
        int i23 = Build.VERSION.SDK_INT;
        if (i23 >= 33 && z15) {
            j.a(builder, dVar4);
        }
        if (i23 >= 34 && z16) {
            k.a(builder, m0Var, dVar3);
        }
        xVar.a().updateCursorAnchorInfo(xVar.f136605a, builder.build());
        this.f136522e = false;
    }
}
