package h7;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final e f67898a;

    /* renamed from: b, reason: collision with root package name */
    public final a f67899b;

    /* renamed from: c, reason: collision with root package name */
    public final g7.i f67900c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67901d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f67902e;

    /* renamed from: f, reason: collision with root package name */
    public final k f67903f;

    /* renamed from: g, reason: collision with root package name */
    public long f67904g;

    /* renamed from: h, reason: collision with root package name */
    public long f67905h;

    /* renamed from: i, reason: collision with root package name */
    public long f67906i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f67907j;

    public l(e eVar, g7.i iVar, byte[] bArr, k kVar) {
        this.f67898a = eVar;
        this.f67899b = eVar.f67867a;
        this.f67900c = iVar;
        this.f67902e = bArr == null ? new byte[131072] : bArr;
        this.f67903f = kVar;
        this.f67901d = ((c3.e) eVar.f67871e).k(iVar);
        this.f67904g = iVar.f63791f;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9 A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:58:0x00e2, B:61:0x00e9, B:63:0x00ef, B:71:0x0103, B:73:0x0107, B:76:0x0110, B:78:0x011a, B:79:0x012c, B:85:0x0132, B:86:0x0137, B:91:0x013b, B:94:0x0144, B:96:0x014a), top: B:57:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103 A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:58:0x00e2, B:61:0x00e9, B:63:0x00ef, B:71:0x0103, B:73:0x0107, B:76:0x0110, B:78:0x011a, B:79:0x012c, B:85:0x0132, B:86:0x0137, B:91:0x013b, B:94:0x0144, B:96:0x014a), top: B:57:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013b A[Catch: Exception -> 0x0130, TryCatch #0 {Exception -> 0x0130, blocks: (B:58:0x00e2, B:61:0x00e9, B:63:0x00ef, B:71:0x0103, B:73:0x0107, B:76:0x0110, B:78:0x011a, B:79:0x012c, B:85:0x0132, B:86:0x0137, B:91:0x013b, B:94:0x0144, B:96:0x014a), top: B:57:0x00e2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.l.a():void");
    }

    public final long b() {
        long j13 = this.f67905h;
        if (j13 == -1) {
            return -1L;
        }
        return j13 - this.f67900c.f63791f;
    }
}
