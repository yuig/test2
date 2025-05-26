package ih;

import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: d, reason: collision with root package name */
    public static final s f72288d = new s(true, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f72289a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72290b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f72291c;

    public s(boolean z13, String str, Exception exc) {
        this.f72289a = z13;
        this.f72290b = str;
        this.f72291c = exc;
    }

    public static s b(String str) {
        return new s(false, str, null);
    }

    public static s c(String str, Exception exc) {
        return new s(false, str, exc);
    }

    public static s e(int i13) {
        return new s(true, null, null);
    }

    public static s f(int i13, int i14, String str, PackageManager.NameNotFoundException nameNotFoundException) {
        return new s(false, str, nameNotFoundException);
    }

    public String a() {
        return this.f72290b;
    }

    public final void d() {
        if (this.f72289a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th3 = this.f72291c;
        if (th3 != null) {
            Log.d("GoogleCertificatesRslt", a(), th3);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
