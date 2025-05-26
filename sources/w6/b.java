package w6;

import android.content.Context;
import androidx.appcompat.app.v;
import bk.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final AbstractMap f128107a;

    /* renamed from: b */
    public volatile boolean f128108b;

    /* renamed from: c */
    public final Object f128109c;

    /* renamed from: d */
    public final Object f128110d;

    public b(Context context, ExecutorService executorService) {
        this.f128107a = new ConcurrentHashMap();
        this.f128108b = false;
        this.f128109c = context.getDir("com.livefront.bridge", 0);
        this.f128110d = executorService.submit(new v(this, 13));
    }

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e13) {
                throw new RuntimeException(e13);
            }
        }
    }

    public final void b(String str) {
        File[] listFiles = ((File) this.f128109c).listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (str == null || str.equals(file.getName())) {
                file.delete();
            }
        }
    }

    public final byte[] c(String str) {
        File file;
        AbstractMap abstractMap = this.f128107a;
        byte[] bArr = (byte[]) abstractMap.get(str);
        if (bArr != null) {
            return bArr;
        }
        File[] listFiles = ((File) this.f128109c).listFiles();
        byte[] bArr2 = null;
        if (listFiles != null) {
            int length = listFiles.length;
            for (int i13 = 0; i13 < length; i13++) {
                file = listFiles[i13];
                if (str.equals(file.getName())) {
                    break;
                }
            }
        }
        file = null;
        if (file != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr3 = new byte[(int) file.length()];
                try {
                    fileInputStream.read(bArr3);
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                    bArr2 = bArr3;
                } catch (IOException unused2) {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                    throw th3;
                }
            } catch (FileNotFoundException | IOException unused4) {
            }
        }
        if (bArr2 != null) {
            abstractMap.put(str, bArr2);
        }
        return bArr2;
    }

    public b() {
        this.f128109c = new f();
        this.f128107a = new LinkedHashMap();
        this.f128110d = new LinkedHashSet();
    }
}
