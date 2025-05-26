package ob;

import kb.c0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f93966a;

    static {
        int[] iArr = new int[c0.values().length];
        f93966a = iArr;
        try {
            iArr[c0.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f93966a[c0.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f93966a[c0.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f93966a[c0.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f93966a[c0.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
