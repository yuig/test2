package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zza extends Thread {
    final /* synthetic */ Map zza;

    public zza(HashMap hashMap) {
        this.zza = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.zza;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(uri).length() + 65);
                    sb3.append("Received non-success response code ");
                    sb3.append(responseCode);
                    sb3.append(" from pinging URL: ");
                    sb3.append(uri);
                    Log.w("HttpUrlPinger", sb3.toString());
                }
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                httpURLConnection.disconnect();
                throw th3;
            }
        } catch (IOException e13) {
            e = e13;
            String message = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
            sb4.append("Error while pinging URL: ");
            sb4.append(uri);
            sb4.append(". ");
            sb4.append(message);
            Log.w("HttpUrlPinger", sb4.toString(), e);
        } catch (IndexOutOfBoundsException e14) {
            String message2 = e14.getMessage();
            StringBuilder sb5 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
            sb5.append("Error while parsing ping URL: ");
            sb5.append(uri);
            sb5.append(". ");
            sb5.append(message2);
            Log.w("HttpUrlPinger", sb5.toString(), e14);
        } catch (RuntimeException e15) {
            e = e15;
            String message3 = e.getMessage();
            StringBuilder sb42 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
            sb42.append("Error while pinging URL: ");
            sb42.append(uri);
            sb42.append(". ");
            sb42.append(message3);
            Log.w("HttpUrlPinger", sb42.toString(), e);
        } finally {
        }
    }
}
