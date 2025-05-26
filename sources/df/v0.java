package df;

import android.util.Log;

/* loaded from: classes.dex */
public final class v0 extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54870b;

    public v0(int i13) {
        this.f54870b = i13;
    }

    @Override // df.x0
    public final String b() {
        switch (this.f54870b) {
            case 0:
            case 2:
                return null;
            case 1:
            default:
                return "com.facebook.katana.ProxyAuth";
        }
    }

    @Override // df.x0
    public final String c() {
        switch (this.f54870b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.facebook.katana";
            case 2:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    @Override // df.x0
    public final void e() {
        switch (this.f54870b) {
            case 1:
                if (le.v.a().getApplicationInfo().targetSdkVersion >= 30) {
                    String str = null;
                    if (!p001if.a.b(y0.class)) {
                        try {
                            str = y0.f54884b;
                        } catch (Throwable th3) {
                            p001if.a.a(y0.class, th3);
                        }
                    }
                    Log.w(str, "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
                    break;
                }
                break;
        }
    }
}
