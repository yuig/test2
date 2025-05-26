package ap2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20331a = 0;

    static {
        char c13 = File.separatorChar;
        bp2.b bVar = new bp2.b(0);
        PrintWriter printWriter = new PrintWriter(bVar);
        printWriter.println();
        bVar.toString();
        printWriter.close();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(InputStream inputStream) {
        bp2.a aVar = new bp2.a();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return aVar.c();
            }
            aVar.write(bArr, 0, read);
        }
    }
}
