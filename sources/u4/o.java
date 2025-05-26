package u4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kh2.g3;

/* loaded from: classes.dex */
public class o extends h implements n {

    /* renamed from: v0, reason: collision with root package name */
    public h[] f120278v0 = new h[4];

    /* renamed from: w0, reason: collision with root package name */
    public int f120279w0 = 0;

    @Override // u4.n
    public void a() {
    }

    public final void f0(h hVar) {
        if (hVar == this || hVar == null) {
            return;
        }
        int i13 = this.f120279w0 + 1;
        h[] hVarArr = this.f120278v0;
        if (i13 > hVarArr.length) {
            this.f120278v0 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
        }
        h[] hVarArr2 = this.f120278v0;
        int i14 = this.f120279w0;
        hVarArr2[i14] = hVar;
        this.f120279w0 = i14 + 1;
    }

    public final void g0(int i13, v4.r rVar, ArrayList arrayList) {
        for (int i14 = 0; i14 < this.f120279w0; i14++) {
            h hVar = this.f120278v0[i14];
            ArrayList arrayList2 = rVar.f124012a;
            if (!arrayList2.contains(hVar)) {
                arrayList2.add(hVar);
            }
        }
        for (int i15 = 0; i15 < this.f120279w0; i15++) {
            g3.W(this.f120278v0[i15], i13, arrayList, rVar);
        }
    }

    @Override // u4.h
    public void i(h hVar, HashMap hashMap) {
        super.i(hVar, hashMap);
        o oVar = (o) hVar;
        this.f120279w0 = 0;
        int i13 = oVar.f120279w0;
        for (int i14 = 0; i14 < i13; i14++) {
            f0((h) hashMap.get(oVar.f120278v0[i14]));
        }
    }
}
