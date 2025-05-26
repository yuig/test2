package of2;

import java.lang.Thread;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f94439a;

    static {
        int[] iArr = new int[Thread.State.values().length];
        try {
            iArr[Thread.State.NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Thread.State.RUNNABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Thread.State.BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Thread.State.WAITING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Thread.State.TIMED_WAITING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Thread.State.TERMINATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f94439a = iArr;
    }
}
