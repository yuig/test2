package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class yn0 {

    /* renamed from: c, reason: collision with root package name */
    public static yn0 f14340c;

    /* renamed from: a, reason: collision with root package name */
    public final String f14341a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f14342b;

    public yn0(Context context) {
        this.f14341a = context.getPackageName();
        this.f14342b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public final void a(Object obj, String str) {
        boolean commit;
        if (obj instanceof String) {
            commit = this.f14342b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = this.f14342b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = this.f14342b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                Log.e("GpidLifecycleSPHandler", "Unexpected object class " + obj.getClass() + " for app " + this.f14341a);
                StringBuilder o13 = a.cb.o("Failed to store ", str, " for app ");
                o13.append(this.f14341a);
                throw new IOException(o13.toString());
            }
            commit = this.f14342b.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        StringBuilder o132 = a.cb.o("Failed to store ", str, " for app ");
        o132.append(this.f14341a);
        throw new IOException(o132.toString());
    }

    public final void a(String str) {
        if (this.f14342b.edit().remove(str).commit()) {
            return;
        }
        StringBuilder o13 = a.cb.o("Failed to remove ", str, " for app ");
        o13.append(this.f14341a);
        throw new IOException(o13.toString());
    }

    public static yn0 a(Context context) {
        if (f14340c == null) {
            f14340c = new yn0(context);
        }
        return f14340c;
    }
}
