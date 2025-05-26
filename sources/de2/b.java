package de2;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54677a;

    static {
        int[] iArr = new int[xd2.c.values().length];
        try {
            iArr[xd2.c.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xd2.c.BAD_SURFACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xd2.c.CONTEXT_LOST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xd2.c.OTHER_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f54677a = iArr;
    }
}
