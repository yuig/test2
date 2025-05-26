package ur0;

import i32.b1;
import i32.y0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f123066a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f123067b;

    static {
        int[] iArr = new int[b1.values().length];
        try {
            iArr[b1.ANDROID_PIN_REACTION_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b1.ANDROID_PIN_IT_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b1.ANDROID_PIN_SEND_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b1.ANDROID_PROFILE_SETTINGS_ICON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f123066a = iArr;
        int[] iArr2 = new int[y0.values().length];
        try {
            iArr2[y0.ANDROID_SEARCH_PIN_RESULTS_TAKEOVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f123067b = iArr2;
    }
}
