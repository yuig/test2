package r0;

/* loaded from: classes2.dex */
public final /* synthetic */ class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f105505a;

    public /* synthetic */ d0(q qVar) {
        this.f105505a = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((r1.exists() ? r1.isDirectory() : r1.mkdirs()) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.MediaMuxer a(int r4, l0.v r5) {
        /*
            r3 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            r0.q r0 = r3.f105505a
            boolean r1 = r0 instanceof r0.p
            if (r1 == 0) goto L4e
            r0.p r0 = (r0.p) r0
            r0.d r0 = r0.f105617b
            java.io.File r0 = r0.f105504d
            java.io.File r1 = r0.getParentFile()
            if (r1 != 0) goto L15
            goto L26
        L15:
            boolean r2 = r1.exists()
            if (r2 == 0) goto L20
            boolean r1 = r1.isDirectory()
            goto L24
        L20:
            boolean r1 = r1.mkdirs()
        L24:
            if (r1 != 0) goto L3d
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to create folder for "
            r1.<init>(r2)
            java.lang.String r2 = r0.getAbsolutePath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Recorder"
            kh2.m0.X0(r2, r1)
        L3d:
            android.media.MediaMuxer r1 = new android.media.MediaMuxer
            java.lang.String r2 = r0.getAbsolutePath()
            r1.<init>(r2, r4)
            android.net.Uri r4 = android.net.Uri.fromFile(r0)
            r5.accept(r4)
            return r1
        L4e:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r0 = "Invalid output options type: "
            java.lang.String r5 = r0.concat(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.d0.a(int, l0.v):android.media.MediaMuxer");
    }
}
