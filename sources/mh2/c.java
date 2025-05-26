package mh2;

import io.embrace.android.embracesdk.Severity;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f87170a;

    static {
        int[] iArr = new int[Severity.values().length];
        try {
            iArr[Severity.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Severity.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f87170a = iArr;
    }
}
