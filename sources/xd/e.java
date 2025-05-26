package xd;

import android.content.Context;
import android.net.Uri;
import nd.k;
import nd.l;
import nd.n;
import pd.g0;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final k f134594b = new k("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, k.f90417e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f134595a;

    public e(Context context) {
        this.f134595a = context.getApplicationContext();
    }

    @Override // nd.n
    public final boolean a(Object obj, l lVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // nd.n
    public final /* bridge */ /* synthetic */ g0 b(Object obj, int i13, int i14, l lVar) {
        return c((Uri) obj, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pd.g0 c(android.net.Uri r9, nd.l r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lc9
            android.content.Context r1 = r8.f134595a
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L19
        L17:
            r2 = r1
            goto L2a
        L19:
            android.content.Context r2 = r1.createPackageContext(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1e
            goto L2a
        L1e:
            r2 = move-exception
            java.lang.String r4 = r1.getPackageName()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lbd
            goto L17
        L2a:
            java.util.List r4 = r9.getPathSegments()
            int r5 = r4.size()
            r6 = 2
            r7 = 1
            if (r5 != r6) goto L6d
            java.util.List r4 = r9.getPathSegments()
            java.lang.String r5 = r9.getAuthority()
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            android.content.res.Resources r6 = r2.getResources()
            int r5 = r6.getIdentifier(r4, r3, r5)
            if (r5 != 0) goto L5e
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            java.lang.String r6 = "android"
            int r5 = r5.getIdentifier(r4, r3, r6)
        L5e:
            if (r5 == 0) goto L61
            goto L83
        L61:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed to find resource id for: "
            java.lang.String r9 = a.c.g(r0, r9)
            r10.<init>(r9)
            throw r10
        L6d:
            int r4 = r4.size()
            java.lang.String r5 = "Unrecognized Uri format: "
            if (r4 != r7) goto Lb3
            java.util.List r4 = r9.getPathSegments()
            java.lang.Object r3 = r4.get(r3)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> La8
            int r5 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> La8
        L83:
            java.lang.String r9 = r1.getPackageName()
            boolean r9 = r0.equals(r9)
            r0 = 0
            if (r9 == 0) goto L97
            nd.k r9 = xd.e.f134594b
            java.lang.Object r9 = r10.c(r9)
            android.content.res.Resources$Theme r9 = (android.content.res.Resources.Theme) r9
            goto L98
        L97:
            r9 = r0
        L98:
            if (r9 != 0) goto L9f
            android.graphics.drawable.Drawable r9 = kh2.a1.C(r1, r2, r5, r0)
            goto La3
        L9f:
            android.graphics.drawable.Drawable r9 = kh2.a1.C(r1, r1, r5, r9)
        La3:
            xd.d r9 = xd.d.e(r9)
            return r9
        La8:
            r10 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = a.c.g(r5, r9)
            r0.<init>(r9, r10)
            throw r0
        Lb3:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = a.c.g(r5, r9)
            r10.<init>(r9)
            throw r10
        Lbd:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed to obtain context or unrecognized Uri format for: "
            java.lang.String r9 = a.c.g(r0, r9)
            r10.<init>(r9, r2)
            throw r10
        Lc9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Package name for "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " is null or empty"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.e.c(android.net.Uri, nd.l):pd.g0");
    }
}
