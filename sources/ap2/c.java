package ap2;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20329a = 0;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf)))));
        valueOf.multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    public static boolean a(File file) {
        File canonicalFile;
        File parentFile;
        File[] listFiles;
        if (f.f20332a) {
            try {
                return ((Boolean) f.f20333b.invoke(null, f.f20334c.invoke(file, new Object[0]))).booleanValue();
            } catch (IllegalAccessException e13) {
                throw new RuntimeException(e13);
            } catch (InvocationTargetException e14) {
                throw new RuntimeException(e14);
            }
        }
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (d.f20330a == '\\') {
            return false;
        }
        File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
        if (file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
            return (file.exists() || (parentFile = (canonicalFile = file.getCanonicalFile()).getParentFile()) == null || !parentFile.exists() || (listFiles = parentFile.listFiles(new b(canonicalFile, 0))) == null || listFiles.length <= 0) ? false : true;
        }
        return true;
    }

    public static long b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        long j13 = 0;
        for (File file2 : listFiles) {
            try {
                if (!a(file2)) {
                    j13 += file2.isDirectory() ? b(file2) : file2.length();
                    if (j13 < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException unused) {
            }
        }
        return j13;
    }
}
