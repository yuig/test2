package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3665a = new byte[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];

    public c(byte[] bArr) {
        for (int i13 = 0; i13 < 256; i13++) {
            this.f3665a[i13] = (byte) i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 256; i15++) {
            byte[] bArr2 = this.f3665a;
            byte b13 = bArr2[i15];
            i14 = (i14 + b13 + bArr[i15 % bArr.length]) & 255;
            bArr2[i15] = bArr2[i14];
            bArr2[i14] = b13;
        }
    }
}
