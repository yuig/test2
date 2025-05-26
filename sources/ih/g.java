package ih;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.bugsnag.android.a0;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import jh.z;

/* loaded from: classes.dex */
public final class g implements he.h {

    /* renamed from: c */
    public static g f72265c;

    /* renamed from: a */
    public final Object f72266a;

    /* renamed from: b */
    public volatile Object f72267b;

    public /* synthetic */ g(Object obj) {
        this.f72266a = obj;
    }

    public static g b(Context context) {
        com.bumptech.glide.d.t(context);
        synchronized (g.class) {
            try {
                if (f72265c == null) {
                    l lVar = q.f72282a;
                    synchronized (q.class) {
                        if (q.f72286e == null) {
                            q.f72286e = context.getApplicationContext();
                        } else {
                            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                        }
                    }
                    f72265c = new g(context);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f72265c;
    }

    public static final m d(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i13 = 0; i13 < mVarArr.length; i13++) {
                if (mVarArr[i13].equals(nVar)) {
                    return mVarArr[i13];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            ih.m[] r4 = ih.p.f72281a
            ih.m r4 = d(r2, r4)
            goto L45
        L39:
            ih.m[] r4 = ih.p.f72281a
            r4 = r4[r1]
            ih.m[] r4 = new ih.m[]{r4}
            ih.m r4 = d(r2, r4)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ih.g.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    public final rd.c a() {
        if (((rd.c) this.f72267b) == null) {
            synchronized (this) {
                try {
                    if (((rd.c) this.f72267b) == null) {
                        this.f72267b = ((rd.a) this.f72266a).build();
                    }
                    if (((rd.c) this.f72267b) == null) {
                        this.f72267b = new a0();
                    }
                } finally {
                }
            }
        }
        return (rd.c) this.f72267b;
    }

    public final boolean c(int i13) {
        s b13;
        int length;
        boolean z13;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = ((Context) this.f72266a).getPackageManager().getPackagesForUid(i13);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            b13 = s.b("no pkgs");
        } else {
            int i14 = 0;
            b13 = null;
            while (true) {
                if (i14 >= length) {
                    com.bumptech.glide.d.t(b13);
                    break;
                }
                String str = packagesForUid[i14];
                if (str == null) {
                    b13 = s.b("null pkg");
                } else if (str.equals((String) this.f72267b)) {
                    b13 = s.f72288d;
                } else {
                    l lVar = q.f72282a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            q.b();
                            z13 = ((z) q.f72284c).K();
                        } catch (RemoteException | DynamiteModule$LoadingException e13) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e13);
                            z13 = false;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        if (z13) {
                            boolean a13 = f.a((Context) this.f72266a);
                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                com.bumptech.glide.d.t(q.f72286e);
                                try {
                                    q.b();
                                    try {
                                        zzq I = ((z) q.f72284c).I(new zzo(str, a13, false, new rh.b(q.f72286e), false, true));
                                        if (I.f()) {
                                            b13 = s.e(I.k1());
                                        } else {
                                            String e14 = I.e();
                                            PackageManager.NameNotFoundException nameNotFoundException = I.x1() == 4 ? new PackageManager.NameNotFoundException() : null;
                                            if (e14 == null) {
                                                e14 = "error checking package certificate";
                                            }
                                            b13 = s.f(I.k1(), I.x1(), e14, nameNotFoundException);
                                        }
                                    } catch (RemoteException e15) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e15);
                                        b13 = s.c("module call", e15);
                                    }
                                } catch (DynamiteModule$LoadingException e16) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e16);
                                    b13 = s.c("module init: ".concat(String.valueOf(e16.getMessage())), e16);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        } else {
                            try {
                                PackageInfo packageInfo = ((Context) this.f72266a).getPackageManager().getPackageInfo(str, 64);
                                boolean a14 = f.a((Context) this.f72266a);
                                if (packageInfo == null) {
                                    b13 = s.b("null pkg");
                                } else {
                                    Signature[] signatureArr = packageInfo.signatures;
                                    if (signatureArr == null || signatureArr.length != 1) {
                                        b13 = s.b("single cert required");
                                    } else {
                                        n nVar = new n(packageInfo.signatures[0].toByteArray());
                                        String str2 = packageInfo.packageName;
                                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            s a15 = q.a(str2, nVar, a14, false);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                                            if (a15.f72289a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                try {
                                                    s a16 = q.a(str2, nVar, false, true);
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                    if (a16.f72289a) {
                                                        b13 = s.b("debuggable release cert app rejected");
                                                    }
                                                } finally {
                                                }
                                            }
                                            b13 = a15;
                                        } finally {
                                        }
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e17) {
                                b13 = s.c("no pkg ".concat(str), e17);
                            }
                        }
                        if (b13.f72289a) {
                            this.f72267b = str;
                        }
                    } finally {
                    }
                }
                if (b13.f72289a) {
                    break;
                }
                i14++;
            }
        }
        b13.d();
        return b13.f72289a;
    }

    @Override // he.h
    public final Object get() {
        if (this.f72267b == null) {
            synchronized (this) {
                try {
                    if (this.f72267b == null) {
                        Object obj = ((he.h) this.f72266a).get();
                        d7.b.p(obj, "Argument must not be null");
                        this.f72267b = obj;
                    }
                } finally {
                }
            }
        }
        return this.f72267b;
    }

    public g(Context context) {
        this.f72266a = context.getApplicationContext();
    }
}
