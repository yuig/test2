package b4;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import b3.w0;
import java.util.List;
import kh2.n3;

/* loaded from: classes3.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final j4.d f21507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21508b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21509c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.z f21510d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f21511e;

    /* renamed from: f, reason: collision with root package name */
    public final List f21512f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022c  */
    /* JADX WARN: Type inference failed for: r0v36, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(j4.d r25, int r26, boolean r27, long r28) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.b.<init>(j4.d, int, boolean, long):void");
    }

    public final c4.z a(int i13, int i14, TextUtils.TruncateAt truncateAt, int i15, int i16, int i17, int i18, int i19) {
        x xVar;
        float d2 = d();
        j4.d dVar = this.f21507a;
        j4.e eVar = dVar.f74565g;
        j4.a aVar = j4.b.f74556a;
        z zVar = dVar.f74560b.f21650c;
        return new c4.z(this.f21511e, d2, eVar, i13, truncateAt, dVar.f74570l, (zVar == null || (xVar = zVar.f21680b) == null) ? false : xVar.f21676a, i15, i17, i18, i19, i16, i14, dVar.f74567i);
    }

    public final float b() {
        return this.f21510d.a();
    }

    public final long c(a3.d dVar, int i13, a.e eVar) {
        d4.f dVar2;
        int i14;
        char c13;
        int[] iArr;
        RectF N0 = n3.N0(dVar);
        int i15 = (!(i13 == 0) && i13 == 1) ? 1 : 0;
        i1.j jVar = new i1.j(eVar, 7);
        int i16 = Build.VERSION.SDK_INT;
        c4.z zVar = this.f21510d;
        if (i16 >= 34) {
            zVar.getClass();
            iArr = c4.b.f25631a.a(zVar, N0, i15, jVar);
            c13 = 1;
        } else {
            c4.n c14 = zVar.c();
            Layout layout = zVar.f25690f;
            if (i15 == 1) {
                dVar2 = new d4.h(layout.getText(), zVar.j());
            } else {
                CharSequence text = layout.getText();
                dVar2 = i16 >= 29 ? new d4.d(zVar.f25685a, text) : new d4.e(text);
            }
            d4.f fVar = dVar2;
            int lineForVertical = layout.getLineForVertical((int) N0.top);
            if (N0.top <= zVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < zVar.f25691g) {
                int i17 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) N0.bottom);
                if (lineForVertical2 != 0 || N0.bottom >= zVar.g(0)) {
                    int K = l3.c.K(zVar, layout, c14, i17, N0, fVar, jVar, true);
                    while (true) {
                        i14 = i17;
                        if (K != -1 || i14 >= lineForVertical2) {
                            break;
                        }
                        i17 = i14 + 1;
                        K = l3.c.K(zVar, layout, c14, i17, N0, fVar, jVar, true);
                    }
                    if (K != -1) {
                        int i18 = i14;
                        int i19 = K;
                        int K2 = l3.c.K(zVar, layout, c14, lineForVertical2, N0, fVar, jVar, false);
                        int i23 = lineForVertical2;
                        while (K2 == -1) {
                            int i24 = i18;
                            if (i24 >= i23) {
                                break;
                            }
                            int i25 = i23 - 1;
                            K2 = l3.c.K(zVar, layout, c14, i25, N0, fVar, jVar, false);
                            i18 = i24;
                            i23 = i25;
                        }
                        if (K2 == -1) {
                            iArr = null;
                            c13 = 1;
                        } else {
                            c13 = 1;
                            iArr = new int[]{fVar.b(i19 + 1), fVar.c(K2 - 1)};
                        }
                    }
                }
            }
            c13 = 1;
            iArr = null;
        }
        return iArr == null ? p0.f21639b : b7.c.h(iArr[0], iArr[c13]);
    }

    public final float d() {
        return n4.a.h(this.f21509c);
    }

    public final void e(b3.u uVar) {
        Canvas b13 = b3.e.b(uVar);
        c4.z zVar = this.f21510d;
        if (zVar.f25688d) {
            b13.save();
            b13.clipRect(0.0f, 0.0f, d(), b());
        }
        if (b13.getClipBounds(zVar.f25700p)) {
            int i13 = zVar.f25692h;
            if (i13 != 0) {
                b13.translate(0.0f, i13);
            }
            c4.y yVar = c4.a0.f25629a;
            yVar.f25684a = b13;
            zVar.f25690f.draw(yVar);
            if (i13 != 0) {
                b13.translate(0.0f, (-1) * i13);
            }
        }
        if (zVar.f25688d) {
            b13.restore();
        }
    }

    public final void f(b3.u uVar, long j13, w0 w0Var, m4.k kVar, d3.i iVar, int i13) {
        j4.d dVar = this.f21507a;
        j4.e eVar = dVar.f74565g;
        int i14 = eVar.f74573c;
        eVar.d(j13);
        eVar.f(w0Var);
        eVar.g(kVar);
        eVar.e(iVar);
        eVar.b(i13);
        e(uVar);
        dVar.f74565g.b(i14);
    }

    public final void g(b3.u uVar, b3.s sVar, float f13, w0 w0Var, m4.k kVar, d3.i iVar, int i13) {
        j4.d dVar = this.f21507a;
        j4.e eVar = dVar.f74565g;
        int i14 = eVar.f74573c;
        eVar.c(sVar, bs1.c.c(d(), b()), f13);
        eVar.f(w0Var);
        eVar.g(kVar);
        eVar.e(iVar);
        eVar.b(i13);
        e(uVar);
        dVar.f74565g.b(i14);
    }
}
