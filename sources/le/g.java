package le;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum g {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);

    private final boolean canExtendToken;

    g(boolean z13) {
        this.canExtendToken = z13;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static g[] valuesCustom() {
        g[] valuesCustom = values();
        return (g[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean canExtendToken() {
        return this.canExtendToken;
    }

    public final boolean fromInstagram() {
        int i13 = f.f83048a[ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3;
    }
}
