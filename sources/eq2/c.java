package eq2;

/* loaded from: classes4.dex */
public final class c extends yp2.b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59932a;

    /* renamed from: b, reason: collision with root package name */
    public final hq2.f f59933b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f59934c;

    /* renamed from: d, reason: collision with root package name */
    public Object f59935d;

    public c(hq2.f fVar, byte[] bArr, int i13) {
        this.f59932a = i13;
        byte[] bArr2 = null;
        if (i13 == 1) {
            this.f59933b = fVar;
            if (bArr != null) {
                bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
            this.f59934c = new yp2.g(bArr2);
            return;
        }
        this.f59935d = null;
        this.f59933b = fVar;
        this.f59934c = bArr;
        if (fVar.f69944a.a() == 1) {
            this.f59935d = g.Rn;
            return;
        }
        mq2.a aVar = this.f59933b.f69944a;
        if (aVar.a() <= 1 || !aVar.b().equals(hq2.a.f69935c) || !(aVar instanceof mq2.d)) {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        this.f59935d = g.Sn;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    @Override // yp2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yp2.e b() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eq2.c.b():yp2.e");
    }
}
