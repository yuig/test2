package kn1;

import hn1.m;
import hn1.p;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f80244a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f80245b;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.PARTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f80244a = iArr;
        int[] iArr2 = new int[p.values().length];
        try {
            iArr2[p.DISMISS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[p.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[p.LEFT_ARROW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f80245b = iArr2;
    }
}
