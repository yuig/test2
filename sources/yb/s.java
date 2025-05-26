package yb;

import java.util.List;

/* loaded from: classes3.dex */
public final class s implements u, zb.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.airbnb.lottie.v f138450a;

    /* renamed from: b, reason: collision with root package name */
    public final zb.e f138451b;

    /* renamed from: c, reason: collision with root package name */
    public ec.q f138452c;

    public s(com.airbnb.lottie.v vVar, fc.c cVar, ec.p pVar) {
        this.f138450a = vVar;
        pVar.getClass();
        zb.e a13 = pVar.f58333a.a();
        this.f138451b = a13;
        cVar.e(a13);
        a13.a(this);
    }

    public static int d(int i13, int i14) {
        int i15 = i13 / i14;
        if ((i13 ^ i14) < 0 && i15 * i14 != i13) {
            i15--;
        }
        return i13 - (i15 * i14);
    }

    @Override // zb.a
    public final void a() {
        this.f138450a.invalidateSelf();
    }

    @Override // yb.c
    public final void b(List list, List list2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        if (r7 == (r2.size() - 1)) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ec.q e(ec.q r20) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.s.e(ec.q):ec.q");
    }
}
