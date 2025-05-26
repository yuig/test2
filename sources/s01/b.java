package s01;

import com.pinterest.api.model.f30;
import h32.n0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110293a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f110294b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f110295c;

    static {
        int[] iArr = new int[n0.values().length];
        try {
            iArr[n0.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n0.BOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n0.PROFILE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n0.STORY_PIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f110293a = iArr;
        int[] iArr2 = new int[f30.c.values().length];
        try {
            iArr2[f30.c.LINK_HAS_BEEN_REPLACED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f30.c.LINK_HAS_NOT_BEEN_REPLACED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f110294b = iArr2;
        int[] iArr3 = new int[a.values().length];
        try {
            iArr3[a.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[a.INT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[a.LONG.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[a.SHORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[a.BOOLEAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[a.DOUBLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[a.FLOAT.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        f110295c = iArr3;
    }
}
