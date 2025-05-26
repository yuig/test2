package lp1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    private final String value;
    public static final a REGISTRATION = new a("REGISTRATION", 0, "registration");
    public static final a SETTINGS = new a("SETTINGS", 1, "settings");
    public static final a GOOGLE_PEOPLE_API = new a("GOOGLE_PEOPLE_API", 2, "google_people_api");
    public static final a HOLISTIC_PROFILE_PROMPT = new a("HOLISTIC_PROFILE_PROMPT", 3, "holistic_profile_prompt");
    public static final a IN_APP_BIRTHDAY_PROMPT = new a("IN_APP_BIRTHDAY_PROMPT", 4, "in_app_birthday_prompt");
    public static final a FIX_EMAIL_PROMPT = new a("FIX_EMAIL_PROMPT", 5, "fix_email_prompt");
    public static final a NUX = new a("NUX", 6, "nux");
    public static final a UNKNOWN = new a("UNKNOWN", 7, "unknown");

    private static final /* synthetic */ a[] $values() {
        return new a[]{REGISTRATION, SETTINGS, GOOGLE_PEOPLE_API, HOLISTIC_PROFILE_PROMPT, IN_APP_BIRTHDAY_PROMPT, FIX_EMAIL_PROMPT, NUX, UNKNOWN};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, String str2) {
        this.value = str2;
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

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
