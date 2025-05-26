package wo2;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes2.dex */
public class m implements Serializable, Comparable {

    /* renamed from: d */
    public static final m f130712d = new m(new byte[0]);

    /* renamed from: a */
    public final byte[] f130713a;

    /* renamed from: b */
    public transient int f130714b;

    /* renamed from: c */
    public transient String f130715c;

    public m(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f130713a = data;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        Intrinsics.checkNotNullParameter(objectInputStream, "<this>");
        if (readInt < 0) {
            throw new IllegalArgumentException(a.a.d("byteCount < 0: ", readInt).toString());
        }
        byte[] bArr = new byte[readInt];
        int i13 = 0;
        while (i13 < readInt) {
            int read = objectInputStream.read(bArr, i13, readInt - i13);
            if (read == -1) {
                throw new EOFException();
            }
            i13 += read;
        }
        m mVar = new m(bArr);
        Field declaredField = m.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, mVar.f130713a);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.f130713a.length);
        objectOutputStream.write(this.f130713a);
    }

    public m a(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f130713a, 0, b());
        byte[] digest = messageDigest.digest();
        Intrinsics.f(digest);
        return new m(digest);
    }

    public int b() {
        return this.f130713a.length;
    }

    public String c() {
        byte[] bArr = this.f130713a;
        char[] cArr = new char[bArr.length * 2];
        int i13 = 0;
        for (byte b13 : bArr) {
            int i14 = i13 + 1;
            char[] cArr2 = xo2.b.f135635a;
            cArr[i13] = cArr2[(b13 >> 4) & 15];
            i13 += 2;
            cArr[i14] = cArr2[b13 & 15];
        }
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 < r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L29;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            wo2.m r10 = (wo2.m) r10
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.b()
            int r1 = r10.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L30
            byte r7 = r9.e(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.e(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2a
            int r4 = r4 + 1
            goto L15
        L2a:
            if (r7 >= r8) goto L2e
        L2c:
            r3 = r6
            goto L36
        L2e:
            r3 = r5
            goto L36
        L30:
            if (r0 != r1) goto L33
            goto L36
        L33:
            if (r0 >= r1) goto L2e
            goto L2c
        L36:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.m.compareTo(java.lang.Object):int");
    }

    public byte[] d() {
        return this.f130713a;
    }

    public byte e(int i13) {
        return this.f130713a[i13];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            int b13 = mVar.b();
            byte[] bArr = this.f130713a;
            if (b13 == bArr.length && mVar.f(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i13, int i14, int i15, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i13 >= 0) {
            byte[] bArr = this.f130713a;
            if (i13 <= bArr.length - i15 && i14 >= 0 && i14 <= other.length - i15 && b.a(i13, i14, i15, bArr, other)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(m other, int i13) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.f(0, 0, i13, this.f130713a);
    }

    public m h() {
        int i13 = 0;
        while (true) {
            byte[] bArr = this.f130713a;
            if (i13 >= bArr.length) {
                return this;
            }
            byte b13 = bArr[i13];
            if (b13 >= 65 && b13 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                copyOf[i13] = (byte) (b13 + 32);
                for (int i14 = i13 + 1; i14 < copyOf.length; i14++) {
                    byte b14 = copyOf[i14];
                    if (b14 >= 65 && b14 <= 90) {
                        copyOf[i14] = (byte) (b14 + 32);
                    }
                }
                return new m(copyOf);
            }
            i13++;
        }
    }

    public int hashCode() {
        int i13 = this.f130714b;
        if (i13 != 0) {
            return i13;
        }
        int hashCode = Arrays.hashCode(this.f130713a);
        this.f130714b = hashCode;
        return hashCode;
    }

    public byte[] i() {
        byte[] bArr = this.f130713a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public final String j() {
        String str = this.f130715c;
        if (str != null) {
            return str;
        }
        byte[] d2 = d();
        Intrinsics.checkNotNullParameter(d2, "<this>");
        String str2 = new String(d2, Charsets.UTF_8);
        this.f130715c = str2;
        return str2;
    }

    public void k(j buffer, int i13) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.W(this.f130713a, 0, i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ea, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0124, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ca, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0167, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x016e, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0160, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a1, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a4, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a7, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0134, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01aa, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b8, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007a, code lost:
    
        if (r6 == 64) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f2, code lost:
    
        if (r6 == 64) goto L428;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wo2.m.toString():java.lang.String");
    }
}
