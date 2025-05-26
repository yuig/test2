package rk1;

import nk1.h;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108483a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f108484b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.FOLLOWING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.NOT_FOLLOWING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f108483a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.Small.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[f.Large.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f108484b = iArr2;
    }
}
