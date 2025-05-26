package on0;

import nn0.d;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f96700a;

    static {
        int[] iArr = new int[d.values().length];
        f96700a = iArr;
        try {
            iArr[d.BOARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f96700a[d.BOARD_SECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
