package db1;

import com.pinterest.api.model.jz;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54296a;

    static {
        int[] iArr = new int[jz.c.values().length];
        try {
            iArr[jz.c.NOTIFICATION_SETTING_STYLE_RADIO_GROUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jz.c.NOTIFICATION_SETTING_STYLE_TOGGLE_GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jz.c.NOTIFICATION_SETTING_STYLE_TWO_LEVEL_SECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jz.c.NOTIFICATION_SETTING_STYLE_BUTTON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f54296a = iArr;
    }
}
