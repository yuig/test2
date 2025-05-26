package gb1;

import com.pinterest.api.model.kz;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f64678a;

    static {
        int[] iArr = new int[kz.values().length];
        try {
            iArr[kz.NOTIFICATION_SETTING_TYPE_PUSH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kz.NOTIFICATION_SETTING_TYPE_EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f64678a = iArr;
    }
}
