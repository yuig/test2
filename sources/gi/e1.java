package gi;

import java.util.Comparator;

/* loaded from: classes3.dex */
public enum e1 implements Comparator {
    INSTANCE;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i13 = 0; i13 < min; i13++) {
            int i14 = (bArr[i13] & 255) - (bArr2[i13] & 255);
            if (i14 != 0) {
                return i14;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
