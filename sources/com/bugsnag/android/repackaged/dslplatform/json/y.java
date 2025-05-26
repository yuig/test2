package com.bugsnag.android.repackaged.dslplatform.json;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final b f29624a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f29625b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f29626c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f29627d;

    static {
        new UUID(0L, 0L);
        f29624a = new b(28);
        f29625b = new c(19);
        f29626c = new char[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        f29627d = new byte[55];
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = (i13 >> 4) & 15;
            int i15 = i13 & 15;
            f29626c[i13] = (char) (((i14 < 10 ? i14 + 48 : i14 + 87) << 8) + (i15 < 10 ? i15 + 48 : i15 + 87));
        }
        for (char c13 = '0'; c13 <= '9'; c13 = (char) (c13 + 1)) {
            int i16 = c13 - '0';
            f29627d[i16] = (byte) i16;
        }
        for (char c14 = 'a'; c14 <= 'f'; c14 = (char) (c14 + 1)) {
            f29627d[c14 - '0'] = (byte) (c14 - 'W');
        }
        for (char c15 = 'A'; c15 <= 'F'; c15 = (char) (c15 + 1)) {
            f29627d[c15 - '0'] = (byte) (c15 - '7');
        }
    }
}
