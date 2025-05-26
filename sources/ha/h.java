package ha;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kh2.k3;
import n60.o;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f68341a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f68342b = {112, 114, 109, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f68343c = {48, 49, 53, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f68344d = {48, 49, 48, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f68345e = {48, 48, 57, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f68346f = {48, 48, 53, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f68347g = {48, 48, 49, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f68348h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f68349i = {48, 48, 50, 0};

    public static byte[] a(b[] bVarArr, byte[] bArr) {
        int i13 = 0;
        int i14 = 0;
        for (b bVar : bVarArr) {
            i14 += ((((bVar.f68333g * 2) + 7) & (-8)) / 8) + (bVar.f68331e * 2) + b(bArr, bVar.f68327a, bVar.f68328b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f68332f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i14);
        if (Arrays.equals(bArr, f68345e)) {
            int length = bVarArr.length;
            while (i13 < length) {
                b bVar2 = bVarArr[i13];
                l(byteArrayOutputStream, bVar2, b(bArr, bVar2.f68327a, bVar2.f68328b));
                k(byteArrayOutputStream, bVar2);
                i13++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                l(byteArrayOutputStream, bVar3, b(bArr, bVar3.f68327a, bVar3.f68328b));
            }
            int length2 = bVarArr.length;
            while (i13 < length2) {
                k(byteArrayOutputStream, bVarArr[i13]);
                i13++;
            }
        }
        if (byteArrayOutputStream.size() == i14) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i14);
    }

    public static String b(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f68347g;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f68346f;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return a.a.p(o.i(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static int c(int i13, int i14, int i15) {
        if (i13 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i13 == 2) {
            return i14;
        }
        if (i13 == 4) {
            return i14 + i15;
        }
        throw new IllegalStateException(a.a.d("Unexpected flag: ", i13));
    }

    public static int[] d(int i13, ByteArrayInputStream byteArrayInputStream) {
        int[] iArr = new int[i13];
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            i14 += (int) k3.I1(2, byteArrayInputStream);
            iArr[i15] = i14;
        }
        return iArr;
    }

    public static b[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f68348h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f68349i)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int I1 = (int) k3.I1(2, fileInputStream);
            byte[] H1 = k3.H1(fileInputStream, (int) k3.I1(4, fileInputStream), (int) k3.I1(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(H1);
            try {
                b[] g13 = g(byteArrayInputStream, bArr2, I1, bVarArr);
                byteArrayInputStream.close();
                return g13;
            } catch (Throwable th3) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (Arrays.equals(f68343c, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int I12 = (int) k3.I1(1, fileInputStream);
        byte[] H12 = k3.H1(fileInputStream, (int) k3.I1(4, fileInputStream), (int) k3.I1(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(H12);
        try {
            b[] f13 = f(byteArrayInputStream2, I12, bVarArr);
            byteArrayInputStream2.close();
            return f13;
        } catch (Throwable th5) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public static b[] f(ByteArrayInputStream byteArrayInputStream, int i13, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i13 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i13];
        int[] iArr = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int I1 = (int) k3.I1(2, byteArrayInputStream);
            iArr[i14] = (int) k3.I1(2, byteArrayInputStream);
            strArr[i14] = new String(k3.G1(I1, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            b bVar = bVarArr[i15];
            if (!bVar.f68328b.equals(strArr[i15])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i16 = iArr[i15];
            bVar.f68331e = i16;
            bVar.f68334h = d(i16, byteArrayInputStream);
        }
        return bVarArr;
    }

    public static b[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i13, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i13 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            k3.I1(2, byteArrayInputStream);
            String str = new String(k3.G1((int) k3.I1(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long I1 = k3.I1(4, byteArrayInputStream);
            int I12 = (int) k3.I1(2, byteArrayInputStream);
            b bVar = null;
            if (bVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i15 = 0;
                while (true) {
                    if (i15 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i15].f68328b.equals(substring)) {
                        bVar = bVarArr[i15];
                        break;
                    }
                    i15++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f68330d = I1;
            int[] d2 = d(I12, byteArrayInputStream);
            if (Arrays.equals(bArr, f68347g)) {
                bVar.f68331e = I12;
                bVar.f68334h = d2;
            }
        }
        return bVarArr;
    }

    public static b[] h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f68344d)) {
            throw new IllegalStateException("Unsupported version");
        }
        int I1 = (int) k3.I1(1, fileInputStream);
        byte[] H1 = k3.H1(fileInputStream, (int) k3.I1(4, fileInputStream), (int) k3.I1(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(H1);
        try {
            b[] i13 = i(byteArrayInputStream, str, I1);
            byteArrayInputStream.close();
            return i13;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b[] i(ByteArrayInputStream byteArrayInputStream, String str, int i13) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int I1 = (int) k3.I1(2, byteArrayInputStream);
            int I12 = (int) k3.I1(2, byteArrayInputStream);
            bVarArr[i14] = new b(str, new String(k3.G1(I1, byteArrayInputStream), StandardCharsets.UTF_8), k3.I1(4, byteArrayInputStream), I12, (int) k3.I1(4, byteArrayInputStream), (int) k3.I1(4, byteArrayInputStream), new int[I12], new TreeMap());
        }
        for (int i15 = 0; i15 < i13; i15++) {
            b bVar = bVarArr[i15];
            int available = byteArrayInputStream.available() - bVar.f68332f;
            int i16 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f68335i;
                if (available2 <= available) {
                    break;
                }
                i16 += (int) k3.I1(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i16), 1);
                for (int I13 = (int) k3.I1(2, byteArrayInputStream); I13 > 0; I13--) {
                    k3.I1(2, byteArrayInputStream);
                    int I14 = (int) k3.I1(1, byteArrayInputStream);
                    if (I14 != 6 && I14 != 7) {
                        while (I14 > 0) {
                            k3.I1(1, byteArrayInputStream);
                            for (int I15 = (int) k3.I1(1, byteArrayInputStream); I15 > 0; I15--) {
                                k3.I1(2, byteArrayInputStream);
                            }
                            I14--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f68334h = d(bVar.f68331e, byteArrayInputStream);
            int i17 = bVar.f68333g;
            BitSet valueOf = BitSet.valueOf(k3.G1((((i17 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = valueOf.get(c(2, i18, i17)) ? 2 : 0;
                if (valueOf.get(c(4, i18, i17))) {
                    i19 |= 4;
                }
                if (i19 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i18));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i18), Integer.valueOf(i19 | num.intValue()));
                }
            }
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f68343c;
        int i13 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f68344d;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] a13 = a(bVarArr, bArr3);
                k3.b2(byteArrayOutputStream, bVarArr.length, 1);
                k3.b2(byteArrayOutputStream, a13.length, 4);
                byte[] F = k3.F(a13);
                k3.b2(byteArrayOutputStream, F.length, 4);
                byteArrayOutputStream.write(F);
                return true;
            }
            byte[] bArr4 = f68346f;
            if (Arrays.equals(bArr, bArr4)) {
                k3.b2(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f68335i.size() * 4;
                    String b13 = b(bArr4, bVar.f68327a, bVar.f68328b);
                    Charset charset = StandardCharsets.UTF_8;
                    k3.c2(byteArrayOutputStream, b13.getBytes(charset).length);
                    k3.c2(byteArrayOutputStream, bVar.f68334h.length);
                    k3.b2(byteArrayOutputStream, size, 4);
                    k3.b2(byteArrayOutputStream, bVar.f68329c, 4);
                    byteArrayOutputStream.write(b13.getBytes(charset));
                    Iterator it = bVar.f68335i.keySet().iterator();
                    while (it.hasNext()) {
                        k3.c2(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        k3.c2(byteArrayOutputStream, 0);
                    }
                    for (int i14 : bVar.f68334h) {
                        k3.c2(byteArrayOutputStream, i14);
                    }
                }
                return true;
            }
            byte[] bArr5 = f68345e;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] a14 = a(bVarArr, bArr5);
                k3.b2(byteArrayOutputStream, bVarArr.length, 1);
                k3.b2(byteArrayOutputStream, a14.length, 4);
                byte[] F2 = k3.F(a14);
                k3.b2(byteArrayOutputStream, F2.length, 4);
                byteArrayOutputStream.write(F2);
                return true;
            }
            byte[] bArr6 = f68347g;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            k3.c2(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String b14 = b(bArr6, bVar2.f68327a, bVar2.f68328b);
                Charset charset2 = StandardCharsets.UTF_8;
                k3.c2(byteArrayOutputStream, b14.getBytes(charset2).length);
                TreeMap treeMap = bVar2.f68335i;
                k3.c2(byteArrayOutputStream, treeMap.size());
                k3.c2(byteArrayOutputStream, bVar2.f68334h.length);
                k3.b2(byteArrayOutputStream, bVar2.f68329c, 4);
                byteArrayOutputStream.write(b14.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    k3.c2(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i15 : bVar2.f68334h) {
                    k3.c2(byteArrayOutputStream, i15);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            k3.c2(byteArrayOutputStream2, bVarArr.length);
            int i16 = 2;
            int i17 = 2;
            for (b bVar3 : bVarArr) {
                k3.b2(byteArrayOutputStream2, bVar3.f68329c, 4);
                k3.b2(byteArrayOutputStream2, bVar3.f68330d, 4);
                k3.b2(byteArrayOutputStream2, bVar3.f68333g, 4);
                String b15 = b(bArr2, bVar3.f68327a, bVar3.f68328b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = b15.getBytes(charset3).length;
                k3.c2(byteArrayOutputStream2, length2);
                i17 = i17 + 14 + length2;
                byteArrayOutputStream2.write(b15.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i17 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray.length);
            }
            m mVar = new m(c.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(mVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i18 = 0;
            int i19 = 0;
            while (i18 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i18];
                    k3.c2(byteArrayOutputStream3, i18);
                    k3.c2(byteArrayOutputStream3, bVar4.f68331e);
                    i19 = i19 + 4 + (bVar4.f68331e * 2);
                    int[] iArr = bVar4.f68334h;
                    int length3 = iArr.length;
                    int i23 = i13;
                    int i24 = i23;
                    while (i23 < length3) {
                        int i25 = iArr[i23];
                        k3.c2(byteArrayOutputStream3, i25 - i24);
                        i23++;
                        i24 = i25;
                    }
                    i18++;
                    i13 = 0;
                } catch (Throwable th3) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i19 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray2.length);
            }
            m mVar2 = new m(c.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i26 = 0;
            int i27 = 0;
            while (i26 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i26];
                    Iterator it3 = bVar5.f68335i.entrySet().iterator();
                    int i28 = 0;
                    while (it3.hasNext()) {
                        i28 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m(byteArrayOutputStream4, i28, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            n(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            k3.c2(byteArrayOutputStream3, i26);
                            int length4 = byteArray3.length + i16 + byteArray4.length;
                            int i29 = i27 + 6;
                            ArrayList arrayList4 = arrayList3;
                            k3.b2(byteArrayOutputStream3, length4, 4);
                            k3.c2(byteArrayOutputStream3, i28);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i27 = i29 + length4;
                            i26++;
                            arrayList3 = arrayList4;
                            i16 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i27 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i27 + ", does not match actual size " + byteArray5.length);
            }
            m mVar3 = new m(c.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(mVar3);
            long j13 = 4;
            long size2 = j13 + j13 + 4 + (arrayList2.size() * 16);
            k3.b2(byteArrayOutputStream, arrayList2.size(), 4);
            int i33 = 0;
            while (i33 < arrayList2.size()) {
                m mVar4 = (m) arrayList2.get(i33);
                k3.b2(byteArrayOutputStream, mVar4.f68358a.getValue(), 4);
                k3.b2(byteArrayOutputStream, size2, 4);
                boolean z13 = mVar4.f68360c;
                byte[] bArr7 = mVar4.f68359b;
                if (z13) {
                    long length5 = bArr7.length;
                    byte[] F3 = k3.F(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(F3);
                    k3.b2(byteArrayOutputStream, F3.length, 4);
                    k3.b2(byteArrayOutputStream, length5, 4);
                    length = F3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    k3.b2(byteArrayOutputStream, bArr7.length, 4);
                    k3.b2(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i33++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i34 = 0; i34 < arrayList6.size(); i34++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i34));
            }
            return true;
        } catch (Throwable th5) {
            try {
                byteArrayOutputStream2.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        n(byteArrayOutputStream, bVar);
        int[] iArr = bVar.f68334h;
        int length = iArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int i15 = iArr[i13];
            k3.c2(byteArrayOutputStream, i15 - i14);
            i13++;
            i14 = i15;
        }
        int i16 = bVar.f68333g;
        byte[] bArr = new byte[(((i16 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f68335i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int c13 = c(2, intValue, i16);
                int i17 = c13 / 8;
                bArr[i17] = (byte) ((1 << (c13 % 8)) | bArr[i17]);
            }
            if ((intValue2 & 4) != 0) {
                int c14 = c(4, intValue, i16);
                int i18 = c14 / 8;
                bArr[i18] = (byte) ((1 << (c14 % 8)) | bArr[i18]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        k3.c2(byteArrayOutputStream, str.getBytes(charset).length);
        k3.c2(byteArrayOutputStream, bVar.f68331e);
        k3.b2(byteArrayOutputStream, bVar.f68332f, 4);
        k3.b2(byteArrayOutputStream, bVar.f68329c, 4);
        k3.b2(byteArrayOutputStream, bVar.f68333g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, int i13, b bVar) {
        int bitCount = Integer.bitCount(i13 & (-2));
        int i14 = bVar.f68333g;
        byte[] bArr = new byte[(((bitCount * i14) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f68335i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i15 = 0;
            for (int i16 = 1; i16 <= 4; i16 <<= 1) {
                if (i16 != 1 && (i16 & i13) != 0) {
                    if ((i16 & intValue2) == i16) {
                        int i17 = (i15 * i14) + intValue;
                        int i18 = i17 / 8;
                        bArr[i18] = (byte) ((1 << (i17 % 8)) | bArr[i18]);
                    }
                    i15++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i13 = 0;
        for (Map.Entry entry : bVar.f68335i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                k3.c2(byteArrayOutputStream, intValue - i13);
                k3.c2(byteArrayOutputStream, 0);
                i13 = intValue;
            }
        }
    }
}
