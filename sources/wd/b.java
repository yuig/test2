package wd;

/* loaded from: classes.dex */
public final class b implements nd.o {

    /* renamed from: b, reason: collision with root package name */
    public static final nd.k f129153b = nd.k.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c, reason: collision with root package name */
    public static final nd.k f129154c = new nd.k("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, nd.k.f90417e);

    /* renamed from: a, reason: collision with root package name */
    public final qd.i f129155a;

    public b(qd.i iVar) {
        this.f129155a = iVar;
    }

    @Override // nd.o
    public final nd.c e(nd.l lVar) {
        return nd.c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    @Override // nd.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.Object r9, java.io.File r10, nd.l r11) {
        /*
            r8 = this;
            pd.g0 r9 = (pd.g0) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            nd.k r1 = wd.b.f129154c
            java.lang.Object r2 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = he.i.f68949b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            nd.k r5 = wd.b.f129153b
            java.lang.Object r5 = r11.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            qd.i r10 = r8.f129155a
            if (r10 == 0) goto L51
            com.bumptech.glide.load.data.c r6 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L4f
            goto L52
        L48:
            r6 = r7
            goto Lbe
        L4b:
            r6 = r7
            goto L63
        L4d:
            r9 = move-exception
            goto L48
        L4f:
            r10 = move-exception
            goto L4b
        L51:
            r6 = r7
        L52:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r6.close()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            goto L5e
        L5c:
            r9 = move-exception
            goto Lc4
        L5e:
            r10 = 1
            goto L75
        L60:
            r9 = move-exception
            goto Lbe
        L62:
            r10 = move-exception
        L63:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L6f
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L60
        L6f:
            if (r6 == 0) goto L74
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L74
        L74:
            r10 = 0
        L75:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lbd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = he.n.c(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = he.i.a(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.c(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        Lbd:
            return r10
        Lbe:
            if (r6 == 0) goto Lc5
            r6.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> Lc5
            goto Lc5
        Lc4:
            throw r9
        Lc5:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.b.l(java.lang.Object, java.io.File, nd.l):boolean");
    }
}
