package e7;

import a.cb;
import a7.m0;
import d7.d0;
import d7.n0;
import java.util.ArrayList;
import java.util.Arrays;
import t3.s1;

/* loaded from: classes3.dex */
public final class a implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57520a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f57521b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57522c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57523d;

    public a(String str, byte[] bArr, int i13, int i14) {
        boolean z13;
        byte b13;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i14 == 23 && bArr.length == 4) {
                    z13 = true;
                }
                bf.b.i(z13);
                break;
            case "auxiliary.tracks.interleaved":
                if (i14 == 75 && bArr.length == 1 && ((b13 = bArr[0]) == 0 || b13 == 1)) {
                    z13 = true;
                }
                bf.b.i(z13);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i14 == 78 && bArr.length == 8) {
                    z13 = true;
                }
                bf.b.i(z13);
                break;
            case "auxiliary.tracks.map":
                bf.b.i(i14 == 0);
                break;
        }
        this.f57520a = str;
        this.f57521b = bArr;
        this.f57522c = i13;
        this.f57523d = i14;
    }

    public final ArrayList d() {
        bf.b.s("Metadata is not an auxiliary tracks map", this.f57520a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f57521b;
        byte b13 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < b13; i13++) {
            arrayList.add(Integer.valueOf(bArr[i13 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f57520a.equals(aVar.f57520a) && Arrays.equals(this.f57521b, aVar.f57521b) && this.f57522c == aVar.f57522c && this.f57523d == aVar.f57523d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f57521b) + cb.d(this.f57520a, 527, 31)) * 31) + this.f57522c) * 31) + this.f57523d;
    }

    public final String toString() {
        String sb3;
        String str = this.f57520a;
        byte[] bArr = this.f57521b;
        int i13 = this.f57523d;
        if (i13 == 0) {
            if (str.equals("auxiliary.tracks.map")) {
                ArrayList d2 = d();
                StringBuilder i14 = n60.o.i("track types = ");
                z.a.m().f(i14, d2.iterator());
                sb3 = i14.toString();
            }
            sb3 = n0.n0(bArr);
        } else if (i13 == 1) {
            sb3 = n0.q(bArr);
        } else if (i13 == 23) {
            boolean z13 = bArr.length >= 4;
            int length = bArr.length;
            if (!z13) {
                throw new IllegalArgumentException(bs1.c.q1("array too small: %s < %s", Integer.valueOf(length), 4));
            }
            sb3 = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)));
        } else if (i13 == 67) {
            boolean z14 = bArr.length >= 4;
            int length2 = bArr.length;
            if (!z14) {
                throw new IllegalArgumentException(bs1.c.q1("array too small: %s < %s", Integer.valueOf(length2), 4));
            }
            sb3 = String.valueOf((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8));
        } else if (i13 != 75) {
            if (i13 == 78) {
                sb3 = String.valueOf(new d0(bArr).D());
            }
            sb3 = n0.n0(bArr);
        } else {
            sb3 = String.valueOf(Byte.toUnsignedInt(bArr[0]));
        }
        return s1.c("mdta: key=", str, ", value=", sb3);
    }
}
