package sf2;

import io.embrace.android.embracesdk.LogType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112812a;

    static {
        int[] iArr = new int[LogType.values().length];
        try {
            iArr[LogType.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogType.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f112812a = iArr;
    }
}
