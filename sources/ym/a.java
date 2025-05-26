package ym;

import a.cb;
import ads_mobile_sdk.wb;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f139383g = new a(4201, 4096, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final a f139384h = new a(1033, 1024, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f139385i = new a(67, 64, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f139386j = new a(19, 16, 1);

    /* renamed from: k, reason: collision with root package name */
    public static final a f139387k = new a(285, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 0);

    /* renamed from: l, reason: collision with root package name */
    public static final a f139388l = new a(wb.W0, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f139389a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f139390b;

    /* renamed from: c, reason: collision with root package name */
    public final b f139391c;

    /* renamed from: d, reason: collision with root package name */
    public final int f139392d;

    /* renamed from: e, reason: collision with root package name */
    public final int f139393e;

    /* renamed from: f, reason: collision with root package name */
    public final int f139394f;

    public a(int i13, int i14, int i15) {
        this.f139393e = i13;
        this.f139392d = i14;
        this.f139394f = i15;
        this.f139389a = new int[i14];
        this.f139390b = new int[i14];
        int i16 = 1;
        for (int i17 = 0; i17 < i14; i17++) {
            this.f139389a[i17] = i16;
            i16 <<= 1;
            if (i16 >= i14) {
                i16 = (i16 ^ i13) & (i14 - 1);
            }
        }
        for (int i18 = 0; i18 < i14 - 1; i18++) {
            this.f139390b[this.f139389a[i18]] = i18;
        }
        this.f139391c = new b(this, new int[]{0});
    }

    public final int a(int i13, int i14) {
        if (i13 == 0 || i14 == 0) {
            return 0;
        }
        int[] iArr = this.f139390b;
        return this.f139389a[(iArr[i13] + iArr[i14]) % (this.f139392d - 1)];
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GF(0x");
        sb3.append(Integer.toHexString(this.f139393e));
        sb3.append(',');
        return cb.l(sb3, this.f139392d, ')');
    }
}
