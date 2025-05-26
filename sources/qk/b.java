package qk;

import com.google.common.io.BaseEncoding$DecodingException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final class b extends d {

    /* renamed from: g, reason: collision with root package name */
    public final char[] f104036g;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f104036g = new char[BitmapUtils.BITMAP_TO_JPEG_SIZE];
        char[] cArr = aVar.f104028b;
        bf.b.k(cArr.length == 16);
        for (int i13 = 0; i13 < 256; i13++) {
            char[] cArr2 = this.f104036g;
            cArr2[i13] = cArr[i13 >>> 4];
            cArr2[i13 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER] = cArr[i13 & 15];
        }
    }

    @Override // qk.d
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new BaseEncoding$DecodingException("Invalid input length " + charSequence.length());
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < charSequence.length()) {
            char charAt = charSequence.charAt(i13);
            a aVar = this.f104040a;
            bArr[i14] = (byte) ((aVar.a(charAt) << 4) | aVar.a(charSequence.charAt(i13 + 1)));
            i13 += 2;
            i14++;
        }
        return i14;
    }

    @Override // qk.d
    public final void e(StringBuilder sb3, byte[] bArr, int i13) {
        bf.b.r(0, i13, bArr.length);
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = bArr[i14] & 255;
            char[] cArr = this.f104036g;
            sb3.append(cArr[i15]);
            sb3.append(cArr[i15 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER]);
        }
    }

    @Override // qk.d
    public final d g(a aVar, Character ch3) {
        return new b(aVar);
    }
}
