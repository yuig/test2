package f21;

import gp1.k;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f60952a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.CLOSEUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.RELATED_PINS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.HOME_FEED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.BOARD_FEED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k.SEARCH_RESULTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f60952a = iArr;
    }
}
