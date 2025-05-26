package f8;

import e8.b;
import e8.c;
import g7.i;
import h7.e;
import java.util.ArrayList;
import z7.n;
import z7.s;
import z7.u;

/* loaded from: classes3.dex */
public final class a extends u {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(a7.i0 r4, h7.d r5, java.util.concurrent.Executor r6) {
        /*
            r3 = this;
            a7.v r0 = r4.a()
            a7.d0 r4 = r4.f1073b
            r4.getClass()
            android.net.Uri r4 = r4.f969a
            java.lang.String r1 = r4.getPath()
            if (r1 != 0) goto L12
            goto L2b
        L12:
            java.util.regex.Pattern r2 = d7.n0.f53873h
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 == 0) goto L2b
            r2 = 1
            java.lang.String r1 = r1.group(r2)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "Manifest"
            android.net.Uri r4 = android.net.Uri.withAppendedPath(r4, r1)
        L2b:
            r0.f1218b = r4
            a7.i0 r4 = r0.a()
            t5.e r0 = new t5.e
            r1 = 11
            r0.<init>(r1)
            r3.<init>(r4, r0, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.a.<init>(a7.i0, h7.d, java.util.concurrent.Executor):void");
    }

    @Override // z7.u
    public final ArrayList e(e eVar, n nVar, boolean z13) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : ((c) nVar).f57722f) {
            for (int i13 = 0; i13 < bVar.f57710j.length; i13++) {
                for (int i14 = 0; i14 < bVar.f57711k; i14++) {
                    arrayList.add(new s(bVar.f57715o[i14], new i(bVar.a(i13, i14))));
                }
            }
        }
        return arrayList;
    }
}
