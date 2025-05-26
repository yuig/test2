package gc;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f64762a;

    public a(HttpURLConnection httpURLConnection) {
        this.f64762a = httpURLConnection;
    }

    public final String a() {
        HttpURLConnection httpURLConnection = this.f64762a;
        try {
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                return null;
            }
        } catch (IOException unused) {
        }
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to fetch ");
            sb3.append(httpURLConnection.getURL());
            sb3.append(". Failed with ");
            sb3.append(httpURLConnection.getResponseCode());
            sb3.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb4 = new StringBuilder();
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb4.append(readLine);
                        sb4.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                }
            }
            sb3.append(sb4.toString());
            return sb3.toString();
        } catch (IOException e13) {
            jc.b.d("get error failed ", e13);
            return e13.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f64762a.disconnect();
    }
}
