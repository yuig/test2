package gi;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final class a1 extends c1 {

    /* renamed from: e, reason: collision with root package name */
    public final char[] f65045e;

    public a1(z0 z0Var) {
        super(z0Var, (Character) null);
        this.f65045e = new char[BitmapUtils.BITMAP_TO_JPEG_SIZE];
        char[] cArr = z0Var.f65144b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i13 = 0; i13 < 256; i13++) {
            char[] cArr2 = this.f65045e;
            cArr2[i13] = cArr[i13 >>> 4];
            cArr2[i13 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER] = cArr[i13 & 15];
        }
    }

    @Override // gi.c1
    public final void a(StringBuilder sb3, byte[] bArr, int i13) {
        kh2.b0.g2(0, i13, bArr.length);
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = bArr[i14] & 255;
            char[] cArr = this.f65045e;
            sb3.append(cArr[i15]);
            sb3.append(cArr[i15 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER]);
        }
    }
}
