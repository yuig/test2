package ad0;

import androidx.lifecycle.q;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2082a;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f2082a = iArr;
    }
}
