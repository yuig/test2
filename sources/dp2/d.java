package dp2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final SharedPreferences f56043a;

    static {
        j d2 = j.d();
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(so.a.f113317a);
            d2.close();
            f56043a = defaultSharedPreferences;
        } catch (Throwable th3) {
            try {
                d2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
