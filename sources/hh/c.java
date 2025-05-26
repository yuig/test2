package hh;

import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;

/* loaded from: classes3.dex */
public final class c extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z13) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z13);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return zzd.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return zzd.class;
    }
}
