package t7;

import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import d7.n0;
import g8.b1;
import g8.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f116563a;

    /* renamed from: b, reason: collision with root package name */
    public final t f116564b;

    /* renamed from: c, reason: collision with root package name */
    public int f116565c = -1;

    public p(t tVar, int i13) {
        this.f116564b = tVar;
        this.f116563a = i13;
    }

    public final void a() {
        bf.b.i(this.f116565c == -1);
        t tVar = this.f116564b;
        tVar.i();
        tVar.K.getClass();
        int[] iArr = tVar.K;
        int i13 = this.f116563a;
        int i14 = iArr[i13];
        if (i14 == -1) {
            if (tVar.f116576J.contains(tVar.I.a(i13))) {
                i14 = -3;
            }
            i14 = -2;
        } else {
            boolean[] zArr = tVar.N;
            if (!zArr[i14]) {
                zArr[i14] = true;
            }
            i14 = -2;
        }
        this.f116565c = i14;
    }

    @Override // g8.b1
    public final void b() {
        int i13 = this.f116565c;
        t tVar = this.f116564b;
        if (i13 == -2) {
            tVar.i();
            throw new SampleQueueMappingException(a.a.k("Unable to bind a sample queue to TrackGroup with MIME type ", tVar.I.a(this.f116563a).f967d[0].f18765o, "."));
        }
        if (i13 == -1) {
            tVar.F();
        } else if (i13 != -3) {
            tVar.F();
            tVar.f116598v[i13].z();
        }
    }

    public final boolean c() {
        int i13 = this.f116565c;
        return (i13 == -1 || i13 == -3 || i13 == -2) ? false : true;
    }

    @Override // g8.b1
    public final int i(qq2.c cVar, k7.e eVar, int i13) {
        t tVar;
        androidx.media3.common.b bVar;
        androidx.media3.common.b bVar2;
        if (this.f116565c == -3) {
            eVar.e(4);
            return -4;
        }
        if (c()) {
            int i14 = this.f116565c;
            t tVar2 = this.f116564b;
            if (tVar2.C()) {
                return -3;
            }
            ArrayList arrayList = tVar2.f116590n;
            int i15 = 0;
            if (arrayList.isEmpty()) {
                tVar = tVar2;
            } else {
                int i16 = 0;
                loop0: while (i16 < arrayList.size() - 1) {
                    int i17 = ((l) arrayList.get(i16)).f116506k;
                    int length = tVar2.f116598v.length;
                    for (int i18 = 0; i18 < length; i18++) {
                        if (tVar2.N[i18] && tVar2.f116598v[i18].B() == i17) {
                            break loop0;
                        }
                    }
                    i16++;
                }
                n0.d0(0, i16, arrayList);
                l lVar = (l) arrayList.get(0);
                androidx.media3.common.b bVar3 = lVar.f68026d;
                if (bVar3.equals(tVar2.G)) {
                    bVar2 = bVar3;
                    tVar = tVar2;
                } else {
                    int i19 = tVar2.f116578b;
                    int i23 = lVar.f68027e;
                    h0 h0Var = tVar2.f116587k;
                    Object obj = lVar.f68028f;
                    long j13 = lVar.f68029g;
                    bVar2 = bVar3;
                    h0Var.b(i19, bVar3, i23, obj, j13);
                    tVar = tVar2;
                }
                tVar.G = bVar2;
            }
            if (arrayList.isEmpty() || ((l) arrayList.get(0)).L) {
                int C = tVar.f116598v[i14].C(cVar, eVar, i13, tVar.T);
                if (C == -5) {
                    androidx.media3.common.b bVar4 = (androidx.media3.common.b) cVar.f104884c;
                    bVar4.getClass();
                    if (i14 == tVar.B) {
                        int r13 = d7.b.r(tVar.f116598v[i14].B());
                        while (i15 < arrayList.size() && ((l) arrayList.get(i15)).f116506k != r13) {
                            i15++;
                        }
                        if (i15 < arrayList.size()) {
                            bVar = ((l) arrayList.get(i15)).f68026d;
                        } else {
                            bVar = tVar.F;
                            bVar.getClass();
                        }
                        bVar4 = bVar4.e(bVar);
                    }
                    cVar.f104884c = bVar4;
                }
                return C;
            }
        }
        return -3;
    }

    @Override // g8.b1
    public final boolean j() {
        if (this.f116565c != -3) {
            if (c()) {
                int i13 = this.f116565c;
                t tVar = this.f116564b;
                if (tVar.C() || !tVar.f116598v[i13].x(tVar.T)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // g8.b1
    public final int o(long j13) {
        if (!c()) {
            return 0;
        }
        int i13 = this.f116565c;
        t tVar = this.f116564b;
        if (tVar.C()) {
            return 0;
        }
        s sVar = tVar.f116598v[i13];
        int t13 = sVar.t(j13, tVar.T);
        ArrayList arrayList = tVar.f116590n;
        Object obj = null;
        if (!(arrayList instanceof Collection)) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    obj = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            obj = ep.b.h(arrayList, 1);
        }
        l lVar = (l) obj;
        if (lVar != null && !lVar.L) {
            t13 = Math.min(t13, lVar.e(i13) - sVar.r());
        }
        sVar.H(t13);
        return t13;
    }
}
