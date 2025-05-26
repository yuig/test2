package b4;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import b3.v0;
import b3.w0;
import b3.z0;
import java.util.ArrayList;
import java.util.List;
import kh2.k3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final q f21625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21626b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21627c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21628d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21629e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21630f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f21631g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f21632h;

    public o(q qVar, long j13, int i13, boolean z13) {
        boolean z14;
        int g13;
        this.f21625a = qVar;
        this.f21626b = i13;
        if (n4.a.j(j13) != 0 || n4.a.i(j13) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = qVar.f21646e;
        int size = arrayList2.size();
        int i14 = 0;
        int i15 = 0;
        float f13 = 0.0f;
        while (i14 < size) {
            t tVar = (t) arrayList2.get(i14);
            u uVar = tVar.f21659a;
            int h10 = n4.a.h(j13);
            if (n4.a.c(j13)) {
                g13 = n4.a.g(j13) - ((int) Math.ceil(f13));
                if (g13 < 0) {
                    g13 = 0;
                }
            } else {
                g13 = n4.a.g(j13);
            }
            long b13 = bs1.c.b(h10, g13, 5);
            int i16 = this.f21626b - i15;
            Intrinsics.g(uVar, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
            b bVar = new b((j4.d) uVar, i16, z13, b13);
            float b14 = bVar.b() + f13;
            c4.z zVar = bVar.f21510d;
            int i17 = i15 + zVar.f25691g;
            arrayList.add(new s(bVar, tVar.f21660b, tVar.f21661c, i15, i17, f13, b14));
            if (zVar.f25688d) {
                i15 = i17;
            } else {
                i15 = i17;
                if (i15 != this.f21626b || i14 == kotlin.collections.f0.i(this.f21625a.f21646e)) {
                    i14++;
                    f13 = b14;
                }
            }
            z14 = true;
            f13 = b14;
            break;
        }
        z14 = false;
        this.f21629e = f13;
        this.f21630f = i15;
        this.f21627c = z14;
        this.f21632h = arrayList;
        this.f21628d = n4.a.h(j13);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i18 = 0; i18 < size2; i18++) {
            s sVar = (s) arrayList.get(i18);
            List list = ((b) sVar.f21652a).f21512f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i19 = 0; i19 < size3; i19++) {
                a3.d dVar = (a3.d) list.get(i19);
                arrayList4.add(dVar != null ? dVar.h(com.bumptech.glide.c.d(0.0f, sVar.f21657f)) : null);
            }
            kotlin.collections.k0.u(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.f21625a.f21643b.size()) {
            int size4 = this.f21625a.f21643b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i23 = 0; i23 < size4; i23++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.l0(arrayList5, arrayList3);
        }
        this.f21631g = arrayList3;
    }

    public static void g(o oVar, b3.u uVar, long j13, w0 w0Var, m4.k kVar, d3.i iVar) {
        d3.h.Qn.getClass();
        int i13 = d3.g.f53658b;
        oVar.getClass();
        uVar.j();
        ArrayList arrayList = oVar.f21632h;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            s sVar = (s) arrayList.get(i14);
            ((b) sVar.f21652a).f(uVar, j13, w0Var, kVar, iVar, i13);
            uVar.f(0.0f, ((b) sVar.f21652a).b());
        }
        uVar.restore();
    }

    public static void h(o oVar, b3.u uVar, b3.s sVar, float f13, w0 w0Var, m4.k kVar, d3.i iVar) {
        d3.h.Qn.getClass();
        int i13 = d3.g.f53658b;
        oVar.getClass();
        uVar.j();
        ArrayList arrayList = oVar.f21632h;
        if (arrayList.size() <= 1) {
            rl2.g0.u(oVar, uVar, sVar, f13, w0Var, kVar, iVar, i13);
        } else if (sVar instanceof z0) {
            rl2.g0.u(oVar, uVar, sVar, f13, w0Var, kVar, iVar, i13);
        } else if (sVar instanceof v0) {
            int size = arrayList.size();
            float f14 = 0.0f;
            float f15 = 0.0f;
            for (int i14 = 0; i14 < size; i14++) {
                s sVar2 = (s) arrayList.get(i14);
                f15 += ((b) sVar2.f21652a).b();
                f14 = Math.max(f14, ((b) sVar2.f21652a).d());
            }
            Shader b13 = ((v0) sVar).b(bs1.c.c(f14, f15));
            Matrix matrix = new Matrix();
            b13.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i15 = 0; i15 < size2; i15++) {
                s sVar3 = (s) arrayList.get(i15);
                ((b) sVar3.f21652a).g(uVar, new b3.t(b13), f13, w0Var, kVar, iVar, i13);
                b bVar = (b) sVar3.f21652a;
                uVar.f(0.0f, bVar.b());
                matrix.setTranslate(0.0f, -bVar.b());
                b13.setLocalMatrix(matrix);
            }
        }
        uVar.restore();
    }

    public final void a(long j13, float[] fArr) {
        i(p0.e(j13));
        j(p0.d(j13));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f80426a = 0;
        k3.V(this.f21632h, j13, new k1.v(j13, fArr, h0Var, new kotlin.jvm.internal.g0()));
    }

    public final float b(int i13) {
        k(i13);
        ArrayList arrayList = this.f21632h;
        s sVar = (s) arrayList.get(k3.T(i13, arrayList));
        r rVar = sVar.f21652a;
        return ((b) rVar).f21510d.e(i13 - sVar.f21655d) + sVar.f21657f;
    }

    public final int c(float f13) {
        ArrayList arrayList = this.f21632h;
        s sVar = (s) arrayList.get(k3.U(arrayList, f13));
        int i13 = sVar.f21654c - sVar.f21653b;
        int i14 = sVar.f21655d;
        if (i13 == 0) {
            return i14;
        }
        float f14 = f13 - sVar.f21657f;
        c4.z zVar = ((b) sVar.f21652a).f21510d;
        return i14 + zVar.f25690f.getLineForVertical(((int) f14) - zVar.f25692h);
    }

    public final float d(int i13) {
        k(i13);
        ArrayList arrayList = this.f21632h;
        s sVar = (s) arrayList.get(k3.T(i13, arrayList));
        r rVar = sVar.f21652a;
        return ((b) rVar).f21510d.g(i13 - sVar.f21655d) + sVar.f21657f;
    }

    public final int e(long j13) {
        ArrayList arrayList = this.f21632h;
        s sVar = (s) arrayList.get(k3.U(arrayList, a3.c.e(j13)));
        int i13 = sVar.f21654c;
        int i14 = sVar.f21653b;
        if (i13 - i14 == 0) {
            return i14;
        }
        long d2 = com.bumptech.glide.c.d(a3.c.d(j13), a3.c.e(j13) - sVar.f21657f);
        b bVar = (b) sVar.f21652a;
        bVar.getClass();
        int e13 = (int) a3.c.e(d2);
        c4.z zVar = bVar.f21510d;
        int i15 = e13 - zVar.f25692h;
        Layout layout = zVar.f25690f;
        int lineForVertical = layout.getLineForVertical(i15);
        return i14 + layout.getOffsetForHorizontal(lineForVertical, (zVar.b(lineForVertical) * (-1)) + a3.c.d(d2));
    }

    public final long f(a3.d dVar, int i13, a.e eVar) {
        long j13;
        long j14;
        ArrayList arrayList = this.f21632h;
        int U = k3.U(arrayList, dVar.f485b);
        float f13 = ((s) arrayList.get(U)).f21658g;
        float f14 = dVar.f487d;
        if (f13 >= f14 || U == kotlin.collections.f0.i(arrayList)) {
            s sVar = (s) arrayList.get(U);
            return sVar.a(((b) sVar.f21652a).c(dVar.h(com.bumptech.glide.c.d(0.0f, -sVar.f21657f)), i13, eVar), true);
        }
        int U2 = k3.U(arrayList, f14);
        long j15 = p0.f21639b;
        while (true) {
            j13 = p0.f21639b;
            if (!p0.a(j15, j13) || U > U2) {
                break;
            }
            s sVar2 = (s) arrayList.get(U);
            j15 = sVar2.a(((b) sVar2.f21652a).c(dVar.h(com.bumptech.glide.c.d(0.0f, -sVar2.f21657f)), i13, eVar), true);
            U++;
        }
        if (p0.a(j15, j13)) {
            return j13;
        }
        while (true) {
            j14 = p0.f21639b;
            if (!p0.a(j13, j14) || U > U2) {
                break;
            }
            s sVar3 = (s) arrayList.get(U2);
            j13 = sVar3.a(((b) sVar3.f21652a).c(dVar.h(com.bumptech.glide.c.d(0.0f, -sVar3.f21657f)), i13, eVar), true);
            U2--;
        }
        return p0.a(j13, j14) ? j15 : b7.c.h((int) (j15 >> 32), (int) (4294967295L & j13));
    }

    public final void i(int i13) {
        q qVar = this.f21625a;
        if (i13 < 0 || i13 >= qVar.f21642a.f21571a.length()) {
            StringBuilder s13 = a.a.s("offset(", i13, ") is out of bounds [0, ");
            s13.append(qVar.f21642a.f21571a.length());
            s13.append(')');
            throw new IllegalArgumentException(s13.toString().toString());
        }
    }

    public final void j(int i13) {
        q qVar = this.f21625a;
        if (i13 < 0 || i13 > qVar.f21642a.f21571a.length()) {
            StringBuilder s13 = a.a.s("offset(", i13, ") is out of bounds [0, ");
            s13.append(qVar.f21642a.f21571a.length());
            s13.append(']');
            throw new IllegalArgumentException(s13.toString().toString());
        }
    }

    public final void k(int i13) {
        int i14 = this.f21630f;
        if (i13 < 0 || i13 >= i14) {
            throw new IllegalArgumentException(("lineIndex(" + i13 + ") is out of bounds [0, " + i14 + ')').toString());
        }
    }
}
