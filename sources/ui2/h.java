package ui2;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes4.dex */
public final class h implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final h f122310c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f122311d;

    /* renamed from: a, reason: collision with root package name */
    public final String f122312a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f122313b;

    static {
        h[] hVarArr = new h[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        for (int i13 = 0; i13 < 256; i13++) {
            hVarArr[i13] = new h((byte) i13);
        }
        f122310c = hVarArr[0];
        f122311d = hVarArr[1];
    }

    public h(byte b13) {
        char[] cArr = new char[2];
        ri2.f.a(b13, cArr, 0);
        this.f122312a = new String(cArr);
        this.f122313b = b13;
    }

    public final String toString() {
        return this.f122312a;
    }
}
