package a8;

import androidx.media3.common.ParserException;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import pk.c1;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1323a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f1324b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f1325c;

    public static byte[] b(byte b13, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b13, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public final c1 a(byte[] bArr) {
        long j13;
        bf.b.i(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, i0.f1362g);
        ArrayList arrayList = this.f1323a;
        arrayList.add(str);
        int i13 = this.f1324b;
        if (i13 == 1) {
            if (!j0.f1371a.matcher(str).matches() && !j0.f1372b.matcher(str).matches()) {
                return null;
            }
            this.f1324b = 2;
            return null;
        }
        if (i13 != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = j0.f1373c.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                j13 = Long.parseLong(group);
            } else {
                j13 = -1;
            }
            if (j13 != -1) {
                this.f1325c = j13;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f1325c > 0) {
                this.f1324b = 3;
                return null;
            }
            c1 r13 = c1.r(arrayList);
            arrayList.clear();
            this.f1324b = 1;
            this.f1325c = 0L;
            return r13;
        } catch (NumberFormatException e13) {
            throw ParserException.b(str, e13);
        }
    }
}
