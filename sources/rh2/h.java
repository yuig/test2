package rh2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public final class h {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        for (int i13 = 0; i13 < bArr.length; i13++) {
            bArr3[i13] = bArr[i13];
        }
        for (int i14 = 0; i14 < bArr2.length; i14++) {
            bArr3[bArr.length + i14] = bArr2[i14];
        }
        return bArr3;
    }

    public static byte[] b(Cipher cipher, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[bArr.length > 245 ? 245 : bArr.length];
        for (int i13 = 0; i13 < bArr.length; i13++) {
            if (i13 > 0 && i13 % RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP == 0) {
                bArr2 = a(bArr2, cipher.doFinal(bArr3));
                bArr3 = new byte[i13 + RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP > bArr.length ? bArr.length - i13 : 245];
            }
            bArr3[i13 % RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP] = bArr[i13];
        }
        return a(bArr2, cipher.doFinal(bArr3));
    }
}
