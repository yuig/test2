package ih;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import jh.a0;
import jh.b0;
import jh.z;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final l f72282a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f72283b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile b0 f72284c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f72285d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f72286e;

    static {
        new l(m.D("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new l(m.D("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f72282a = new l(m.D("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f72283b = new l(m.D("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
        f72285d = new Object();
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [ih.k] */
    public static s a(final String str, final m mVar, final boolean z13, boolean z14) {
        try {
            b();
            com.bumptech.glide.d.t(f72286e);
            try {
                return ((z) f72284c).J(new zzs(str, mVar, z13, z14), new rh.b(f72286e.getPackageManager())) ? s.f72288d : new r(new Callable() { // from class: ih.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        MessageDigest messageDigest;
                        boolean z15 = z13;
                        String str2 = str;
                        m mVar2 = mVar;
                        String str3 = (z15 || !q.a(str2, mVar2, true, false).f72289a) ? "not allowed" : "debug cert rejected";
                        int i13 = 0;
                        while (true) {
                            if (i13 >= 2) {
                                messageDigest = null;
                                break;
                            }
                            try {
                                messageDigest = MessageDigest.getInstance("SHA-256");
                            } catch (NoSuchAlgorithmException unused) {
                            }
                            if (messageDigest != null) {
                                break;
                            }
                            i13++;
                        }
                        com.bumptech.glide.d.t(messageDigest);
                        byte[] digest = messageDigest.digest(mVar2.E());
                        int length = digest.length;
                        char[] cArr = new char[length + length];
                        int i14 = 0;
                        for (byte b13 : digest) {
                            char[] cArr2 = oh.c.f94456b;
                            cArr[i14] = cArr2[(b13 & 255) >>> 4];
                            cArr[i14 + 1] = cArr2[b13 & 15];
                            i14 += 2;
                        }
                        return str3 + ": pkg=" + str2 + ", sha256=" + new String(cArr) + ", atk=" + z15 + ", ver=12451000.false";
                    }
                });
            } catch (RemoteException e13) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e13);
                return s.c("module call", e13);
            }
        } catch (DynamiteModule$LoadingException e14) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e14);
            return s.c("module init: ".concat(String.valueOf(e14.getMessage())), e14);
        }
    }

    public static void b() {
        if (f72284c != null) {
            return;
        }
        com.bumptech.glide.d.t(f72286e);
        synchronized (f72285d) {
            try {
                if (f72284c == null) {
                    f72284c = a0.D(sh.d.c(f72286e, sh.d.f112893d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
