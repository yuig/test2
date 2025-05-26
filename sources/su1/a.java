package su1;

import android.content.SharedPreferences;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import pk.a0;

/* loaded from: classes2.dex */
public final class a implements Interceptor, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final String f115227a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f115228b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("unauthId == null");
        }
        this.f115227a = str;
        this.f115228b = str2;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        vb0.b.f125448a.a();
        Request.Builder b13 = chain.d().b();
        b13.a("X-Pinterest-Unauth-ID", this.f115227a);
        String str = this.f115228b;
        if (str != null) {
            b13.a("X-Pinterest-Auth-ID", str);
        }
        return chain.b(b13.b());
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (a0.N(str, "PREF_MY_ID")) {
            String string = sharedPreferences.getString("PREF_MY_ID", "");
            if (string.equals("\u0000")) {
                this.f115228b = null;
            } else if (a0.D0(string)) {
                this.f115228b = string;
            }
        }
    }
}
