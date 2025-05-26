package il2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes2.dex */
public class k extends j {
    public static byte[] a(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i13 = (int) length;
            byte[] bArr = new byte[i13];
            int i14 = i13;
            int i15 = 0;
            while (i14 > 0) {
                int read = fileInputStream.read(bArr, i15, i14);
                if (read < 0) {
                    break;
                }
                i14 -= read;
                i15 += read;
            }
            if (i14 > 0) {
                bArr = Arrays.copyOf(bArr, i15);
                Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    a aVar = new a();
                    aVar.write(read2);
                    bs1.c.K(fileInputStream, aVar, 8192);
                    int size = aVar.size() + i13;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] a13 = aVar.a();
                    bArr = Arrays.copyOf(bArr, size);
                    Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
                    z.f(i13, 0, aVar.size(), a13, bArr);
                }
            }
            dl2.b.J(fileInputStream, null);
            return bArr;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dl2.b.J(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static String b(File file) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String z23 = kh2.j.z2(inputStreamReader);
            dl2.b.J(inputStreamReader, null);
            return z23;
        } finally {
        }
    }

    public static void c(File file, byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.f80348a;
            dl2.b.J(fileOutputStream, null);
        } finally {
        }
    }

    public static void d(File file, String text) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        c(file, bytes);
    }
}
