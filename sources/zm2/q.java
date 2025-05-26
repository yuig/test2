package zm2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class q extends t {

    /* renamed from: a, reason: collision with root package name */
    public final m f142245a;

    public q() {
        this.f142245a = new m();
    }

    public final boolean h() {
        int i13 = 0;
        while (true) {
            e0 e0Var = this.f142245a.f142238a;
            if (i13 >= e0Var.f142197b.size()) {
                Iterator it = e0Var.g().iterator();
                while (it.hasNext()) {
                    if (!m.e((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m.e((Map.Entry) e0Var.f142197b.get(i13))) {
                return false;
            }
            i13++;
        }
    }

    public final int i() {
        e0 e0Var;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            e0Var = this.f142245a.f142238a;
            if (i13 >= e0Var.f142197b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) e0Var.f142197b.get(i13);
            i14 += m.d((r) entry.getKey(), entry.getValue());
            i13++;
        }
        for (Map.Entry entry2 : e0Var.g()) {
            i14 += m.d((r) entry2.getKey(), entry2.getValue());
        }
        return i14;
    }

    public final Object j(s sVar) {
        o(sVar);
        e0 e0Var = this.f142245a.f142238a;
        r rVar = sVar.f142254d;
        Object obj = e0Var.get(rVar);
        if (obj == null) {
            return sVar.f142252b;
        }
        if (!rVar.f142249d) {
            return sVar.a(obj);
        }
        if (rVar.f142248c.getJavaType() != r0.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(sVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean k(s sVar) {
        o(sVar);
        m mVar = this.f142245a;
        mVar.getClass();
        r rVar = sVar.f142254d;
        if (rVar.f142249d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return mVar.f142238a.get(rVar) != null;
    }

    public final void l() {
        this.f142245a.f();
    }

    public final m7.c m() {
        return new m7.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(zm2.h r9, zm2.i r10, zm2.k r11, int r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zm2.q.n(zm2.h, zm2.i, zm2.k, int):boolean");
    }

    public final void o(s sVar) {
        if (sVar.f142251a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public q(p pVar) {
        this.f142245a = p.g(pVar);
    }
}
