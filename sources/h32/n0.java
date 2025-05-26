package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;

    @NotNull
    public static final l0 Companion;
    public static final n0 NONE = new n0("NONE", 0);
    public static final n0 WEB = new n0("WEB", 1);
    public static final n0 PROFILE = new n0("PROFILE", 2);
    public static final n0 BOARD = new n0("BOARD", 3);
    public static final n0 STORY_PIN = new n0("STORY_PIN", 4);
    public static final n0 SAFARI_APP = new n0("SAFARI_APP", 5);
    public static final n0 SVC_UNSUPPORTED = new n0("SVC_UNSUPPORTED", 6);
    public static final n0 MOBILE_DEEP_LINK = new n0("MOBILE_DEEP_LINK", 7);
    public static final n0 NATIVE_BROWSER = new n0("NATIVE_BROWSER", 8);
    public static final n0 NATIVE_WEBVIEW = new n0("NATIVE_WEBVIEW", 9);
    public static final n0 SAFARI_VIEW_CONTROLLER = new n0("SAFARI_VIEW_CONTROLLER", 10);
    public static final n0 CUSTOM_IN_APP_BROWSER = new n0("CUSTOM_IN_APP_BROWSER", 11);

    private static final /* synthetic */ n0[] $values() {
        return new n0[]{NONE, WEB, PROFILE, BOARD, STORY_PIN, SAFARI_APP, SVC_UNSUPPORTED, MOBILE_DEEP_LINK, NATIVE_BROWSER, NATIVE_WEBVIEW, SAFARI_VIEW_CONTROLLER, CUSTOM_IN_APP_BROWSER};
    }

    static {
        n0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new l0();
    }

    private n0(String str, int i13) {
    }

    public static final n0 findByValue(int i13) {
        Companion.getClass();
        return l0.a(i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (m0.f67139a[ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
