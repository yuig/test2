package fh;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final k0.a f62135c = new k0.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f62136a;

    /* renamed from: b, reason: collision with root package name */
    public final p f62137b;

    public c(String str) {
        com.bumptech.glide.d.o(str);
        this.f62136a = str;
        this.f62137b = new p(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k0.a aVar = f62135c;
        Status status = Status.f30748l;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f62136a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f30746j;
            } else {
                Log.e((String) aVar.f77778b, ((String) aVar.f77779c).concat("Unable to revoke access!"));
            }
            aVar.d("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e13) {
            Log.e((String) aVar.f77778b, ((String) aVar.f77779c).concat("IOException when revoking access: ".concat(String.valueOf(e13.toString()))));
        } catch (Exception e14) {
            Log.e((String) aVar.f77778b, ((String) aVar.f77779c).concat("Exception when revoking access: ".concat(String.valueOf(e14.toString()))));
        }
        this.f62137b.C0(status);
    }
}
