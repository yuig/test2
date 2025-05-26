package mw;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class a {
    public static String a(String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 2)));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read == -1) {
                        Unit unit = Unit.f80348a;
                        dl2.b.J(gZIPInputStream, null);
                        return byteArrayOutputStream.toString();
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
