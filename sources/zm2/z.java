package zm2;

import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class z extends g {

    /* renamed from: b */
    public final byte[] f142259b;

    /* renamed from: c */
    public int f142260c = 0;

    public z(byte[] bArr) {
        this.f142259b = bArr;
    }

    @Override // zm2.g
    public void e(int i13, int i14, int i15, byte[] bArr) {
        System.arraycopy(this.f142259b, i13, bArr, i14, i15);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof z) {
            return w((z) obj, 0, size());
        }
        if (obj instanceof d0) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(a.a.p(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    @Override // zm2.g
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int i13 = this.f142260c;
        if (i13 == 0) {
            int size = size();
            i13 = n(size, 0, size);
            if (i13 == 0) {
                i13 = 1;
            }
            this.f142260c = i13;
        }
        return i13;
    }

    @Override // zm2.g
    public final boolean i() {
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new e(this, 0);
    }

    @Override // zm2.g
    public final boolean j() {
        byte[] bArr = this.f142259b;
        return com.bumptech.glide.c.O0(bArr, 0, bArr.length) == 0;
    }

    @Override // zm2.g
    public final int n(int i13, int i14, int i15) {
        for (int i16 = i14; i16 < i14 + i15; i16++) {
            i13 = (i13 * 31) + this.f142259b[i16];
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if (r0[r9] > (-65)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
    
        if (r0[r8] > (-65)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r0[r9] > (-65)) goto L78;
     */
    @Override // zm2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f142259b
            if (r8 == 0) goto L98
            if (r9 < r10) goto L9
            goto L9c
        L9:
            byte r1 = (byte) r8
            r2 = -65
            r3 = -1
            r4 = -32
            if (r1 >= r4) goto L22
            r8 = -62
            if (r1 < r8) goto L1f
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r2) goto L1c
            goto L1f
        L1c:
            r9 = r8
            goto L98
        L1f:
            r8 = r3
            goto L9c
        L22:
            r5 = -16
            if (r1 >= r5) goto L50
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L3b
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L38
            int r8 = com.bumptech.glide.c.f0(r1, r9)
            goto L9c
        L38:
            r6 = r9
            r9 = r8
            r8 = r6
        L3b:
            if (r8 > r2) goto L1f
            r5 = -96
            if (r1 != r4) goto L43
            if (r8 < r5) goto L1f
        L43:
            r4 = -19
            if (r1 != r4) goto L49
            if (r8 >= r5) goto L1f
        L49:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r2) goto L1c
            goto L1f
        L50:
            int r4 = r8 >> 8
            int r4 = ~r4
            byte r4 = (byte) r4
            if (r4 != 0) goto L63
            int r8 = r9 + 1
            r4 = r0[r9]
            if (r8 < r10) goto L61
            int r8 = com.bumptech.glide.c.f0(r1, r4)
            goto L9c
        L61:
            r9 = 0
            goto L69
        L63:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L69:
            if (r9 != 0) goto L84
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L81
            r9 = -12
            if (r1 > r9) goto L1f
            if (r4 > r2) goto L1f
            if (r8 <= r2) goto L7a
            goto L1f
        L7a:
            int r9 = r4 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            goto L9c
        L81:
            r6 = r9
            r9 = r8
            r8 = r6
        L84:
            if (r4 > r2) goto L1f
            int r1 = r1 << 28
            int r4 = r4 + 112
            int r4 = r4 + r1
            int r1 = r4 >> 30
            if (r1 != 0) goto L1f
            if (r9 > r2) goto L1f
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r2) goto L98
            goto L1f
        L98:
            int r8 = com.bumptech.glide.c.O0(r0, r9, r10)
        L9c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zm2.z.p(int, int, int):int");
    }

    @Override // zm2.g
    public final int r() {
        return this.f142260c;
    }

    @Override // zm2.g
    public final String s() {
        byte[] bArr = this.f142259b;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // zm2.g
    public int size() {
        return this.f142259b.length;
    }

    @Override // zm2.g
    public final void v(OutputStream outputStream, int i13, int i14) {
        outputStream.write(this.f142259b, i13, i14);
    }

    public final boolean w(z zVar, int i13, int i14) {
        byte[] bArr = zVar.f142259b;
        int length = bArr.length;
        byte[] bArr2 = this.f142259b;
        if (i14 > length) {
            int length2 = bArr2.length;
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Length too large: ");
            sb3.append(i14);
            sb3.append(length2);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i15 = i13 + i14;
        int length3 = bArr.length;
        byte[] bArr3 = zVar.f142259b;
        if (i15 <= length3) {
            int i16 = 0;
            while (i16 < i14) {
                if (bArr2[i16] != bArr3[i13]) {
                    return false;
                }
                i16++;
                i13++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb4 = new StringBuilder(59);
        sb4.append("Ran off end of other: ");
        sb4.append(i13);
        sb4.append(", ");
        sb4.append(i14);
        sb4.append(", ");
        sb4.append(length4);
        throw new IllegalArgumentException(sb4.toString());
    }
}
