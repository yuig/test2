package t7;

import a7.m0;
import a7.n0;
import androidx.media3.common.DrmInitData;
import g8.a1;
import java.util.Map;
import q8.j0;

/* loaded from: classes3.dex */
public final class s extends a1 {
    public final Map H;
    public DrmInitData I;

    public s(l8.m mVar, s7.q qVar, s7.m mVar2, Map map) {
        super(mVar, qVar, mVar2);
        this.H = map;
    }

    @Override // g8.a1, q8.k0
    public final void a(long j13, int i13, int i14, int i15, j0 j0Var) {
        super.a(j13, i13, i14, i15, j0Var);
    }

    @Override // g8.a1
    public final androidx.media3.common.b o(androidx.media3.common.b bVar) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.I;
        if (drmInitData2 == null) {
            drmInitData2 = bVar.f18769s;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.H.get(drmInitData2.f18736c)) != null) {
            drmInitData2 = drmInitData;
        }
        n0 n0Var = bVar.f18762l;
        n0 n0Var2 = null;
        if (n0Var != null) {
            m0[] m0VarArr = n0Var.f1152a;
            int length = m0VarArr.length;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    i14 = -1;
                    break;
                }
                m0 m0Var = m0VarArr[i14];
                if ((m0Var instanceof d9.n) && "com.apple.streaming.transportStreamTimestamp".equals(((d9.n) m0Var).f54035b)) {
                    break;
                }
                i14++;
            }
            if (i14 != -1) {
                if (length != 1) {
                    m0[] m0VarArr2 = new m0[length - 1];
                    while (i13 < length) {
                        if (i13 != i14) {
                            m0VarArr2[i13 < i14 ? i13 : i13 - 1] = m0VarArr[i13];
                        }
                        i13++;
                    }
                    n0Var2 = new n0(m0VarArr2);
                }
            }
            if (drmInitData2 == bVar.f18769s || n0Var != bVar.f18762l) {
                a7.q a13 = bVar.a();
                a13.f1185r = drmInitData2;
                a13.f1178k = n0Var;
                bVar = a13.a();
            }
            return super.o(bVar);
        }
        n0Var = n0Var2;
        if (drmInitData2 == bVar.f18769s) {
        }
        a7.q a132 = bVar.a();
        a132.f1185r = drmInitData2;
        a132.f1178k = n0Var;
        bVar = a132.a();
        return super.o(bVar);
    }
}
