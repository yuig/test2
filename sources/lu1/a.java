package lu1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PINTEREST_ACTIVITY = new a("PINTEREST_ACTIVITY", 0);
    public static final a MAIN_ACTIVITY = new a("MAIN_ACTIVITY", 1);
    public static final a WEB_HOOK_ACTIVITY = new a("WEB_HOOK_ACTIVITY", 2);
    public static final a WEB_VIEW_ACTIVITY = new a("WEB_VIEW_ACTIVITY", 3);
    public static final a AUTHENTICATION_ACTIVITY = new a("AUTHENTICATION_ACTIVITY", 4);
    public static final a NUX_ACTIVITY = new a("NUX_ACTIVITY", 5);
    public static final a AUTHENTICATOR_ACTIVITY = new a("AUTHENTICATOR_ACTIVITY", 6);
    public static final a SEND_SHARE_ACTIVITY = new a("SEND_SHARE_ACTIVITY", 7);
    public static final a COMMENT_ACTIVITY = new a("COMMENT_ACTIVITY", 8);
    public static final a CAMERA_ACTIVITY = new a("CAMERA_ACTIVITY", 9);
    public static final a CREATION_ACTIVITY = new a("CREATION_ACTIVITY", 10);
    public static final a PIN_IT_ACTIVITY = new a("PIN_IT_ACTIVITY", 11);
    public static final a CREATE_ACTIVITY = new a("CREATE_ACTIVITY", 12);
    public static final a PIN_MARKLET_ACTIVITY = new a("PIN_MARKLET_ACTIVITY", 13);
    public static final a USER_SET_ACTIVITY = new a("USER_SET_ACTIVITY", 14);
    public static final a MEDIA_GALLERY_ACTIVITY = new a("MEDIA_GALLERY_ACTIVITY", 15);
    public static final a REPIN_ACTIVITY = new a("REPIN_ACTIVITY", 16);
    public static final a PINTEREST_OAUTH_ACTIVITY = new a("PINTEREST_OAUTH_ACTIVITY", 17);
    public static final a EXPERIMENTS_RELOADER_ACTIVITY = new a("EXPERIMENTS_RELOADER_ACTIVITY", 18);
    public static final a COMPONENT_BROWSER_ACTIVITY = new a("COMPONENT_BROWSER_ACTIVITY", 19);
    public static final a SHELL_ACTIVITY = new a("SHELL_ACTIVITY", 20);
    public static final a SSO_ACTIVITY = new a("SSO_ACTIVITY", 21);
    public static final a WIDGET_CONFIGURATION_ACTIVITY = new a("WIDGET_CONFIGURATION_ACTIVITY", 22);

    private static final /* synthetic */ a[] $values() {
        return new a[]{PINTEREST_ACTIVITY, MAIN_ACTIVITY, WEB_HOOK_ACTIVITY, WEB_VIEW_ACTIVITY, AUTHENTICATION_ACTIVITY, NUX_ACTIVITY, AUTHENTICATOR_ACTIVITY, SEND_SHARE_ACTIVITY, COMMENT_ACTIVITY, CAMERA_ACTIVITY, CREATION_ACTIVITY, PIN_IT_ACTIVITY, CREATE_ACTIVITY, PIN_MARKLET_ACTIVITY, USER_SET_ACTIVITY, MEDIA_GALLERY_ACTIVITY, REPIN_ACTIVITY, PINTEREST_OAUTH_ACTIVITY, EXPERIMENTS_RELOADER_ACTIVITY, COMPONENT_BROWSER_ACTIVITY, SHELL_ACTIVITY, SSO_ACTIVITY, WIDGET_CONFIGURATION_ACTIVITY};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
