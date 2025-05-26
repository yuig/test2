package aw0;

import com.pinterest.api.model.go;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20574a;

    static {
        int[] iArr = new int[go.values().length];
        try {
            iArr[go.DOTTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[go.MARKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[go.GLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[go.ARROW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[go.ERASER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f20574a = iArr;
    }
}
