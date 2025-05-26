package oj2;

import io.opentelemetry.api.trace.StatusCode;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f95408a;

    static {
        int[] iArr = new int[StatusCode.values().length];
        f95408a = iArr;
        try {
            iArr[StatusCode.UNSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f95408a[StatusCode.OK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f95408a[StatusCode.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
