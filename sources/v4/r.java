package v4;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.c3;
import org.chromium.net.y;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: f, reason: collision with root package name */
    public static int f124011f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f124012a;

    /* renamed from: b, reason: collision with root package name */
    public int f124013b;

    /* renamed from: c, reason: collision with root package name */
    public int f124014c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f124015d;

    /* renamed from: e, reason: collision with root package name */
    public int f124016e;

    public final void a(ArrayList arrayList) {
        int size = this.f124012a.size();
        if (this.f124016e != -1 && size > 0) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                r rVar = (r) arrayList.get(i13);
                if (this.f124016e == rVar.f124013b) {
                    c(this.f124014c, rVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(s4.d dVar, int i13) {
        int q13;
        int q14;
        ArrayList arrayList = this.f124012a;
        if (arrayList.size() == 0) {
            return 0;
        }
        u4.i iVar = (u4.i) ((u4.h) arrayList.get(0)).V;
        dVar.w();
        iVar.c(dVar, false);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((u4.h) arrayList.get(i14)).c(dVar, false);
        }
        if (i13 == 0 && iVar.E0 > 0) {
            c3.k(iVar, dVar, arrayList, 0);
        }
        if (i13 == 1 && iVar.F0 > 0) {
            c3.k(iVar, dVar, arrayList, 1);
        }
        try {
            dVar.s();
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        this.f124015d = new ArrayList();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            u4.h hVar = (u4.h) arrayList.get(i15);
            y yVar = new y();
            new WeakReference(hVar);
            s4.d.q(hVar.f120195J);
            s4.d.q(hVar.K);
            s4.d.q(hVar.L);
            s4.d.q(hVar.M);
            s4.d.q(hVar.N);
            this.f124015d.add(yVar);
        }
        if (i13 == 0) {
            q13 = s4.d.q(iVar.f120195J);
            q14 = s4.d.q(iVar.L);
            dVar.w();
        } else {
            q13 = s4.d.q(iVar.K);
            q14 = s4.d.q(iVar.M);
            dVar.w();
        }
        return q14 - q13;
    }

    public final void c(int i13, r rVar) {
        Iterator it = this.f124012a.iterator();
        while (it.hasNext()) {
            u4.h hVar = (u4.h) it.next();
            ArrayList arrayList = rVar.f124012a;
            if (!arrayList.contains(hVar)) {
                arrayList.add(hVar);
            }
            int i14 = rVar.f124013b;
            if (i13 == 0) {
                hVar.f120235t0 = i14;
            } else {
                hVar.f120237u0 = i14;
            }
        }
        this.f124016e = rVar.f124013b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        int i13 = this.f124014c;
        sb3.append(i13 == 0 ? "Horizontal" : i13 == 1 ? "Vertical" : i13 == 2 ? "Both" : "Unknown");
        sb3.append(" [");
        String n13 = a.a.n(sb3, this.f124013b, "] <");
        Iterator it = this.f124012a.iterator();
        while (it.hasNext()) {
            u4.h hVar = (u4.h) it.next();
            StringBuilder D = ep.b.D(n13, " ");
            D.append(hVar.f120217k0);
            n13 = D.toString();
        }
        return a.a.C(n13, " >");
    }
}
