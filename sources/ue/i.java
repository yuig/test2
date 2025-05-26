package ue;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final String f121954a;

    /* renamed from: b, reason: collision with root package name */
    public final File f121955b;

    /* renamed from: c, reason: collision with root package name */
    public final h f121956c;

    public i(String uriStr, File destFile, h onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.f121954a = uriStr;
        this.f121955b = destFile;
        this.f121956c = onSuccess;
    }

    public final Boolean a(String... args) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            if (p001if.a.b(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(args, "args");
                try {
                    URL url = new URL(this.f121954a);
                    int contentLength = url.openConnection().getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f121955b));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
                return null;
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            if (p001if.a.b(this)) {
                return null;
            }
            try {
                return a((String[]) objArr);
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
                return null;
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (p001if.a.b(this)) {
                    return;
                }
                try {
                    if (!p001if.a.b(this) && booleanValue) {
                        try {
                            this.f121956c.a(this.f121955b);
                        } catch (Throwable th3) {
                            p001if.a.a(this, th3);
                        }
                    }
                } catch (Throwable th4) {
                    p001if.a.a(this, th4);
                }
            } catch (Throwable th5) {
                p001if.a.a(this, th5);
            }
        } catch (Throwable th6) {
            p001if.a.a(this, th6);
        }
    }
}
