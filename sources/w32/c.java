package w32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c PHONE_NUMBER = new c("PHONE_NUMBER", 0);
    public static final c SMS_NUMBER = new c("SMS_NUMBER", 1);
    public static final c WEBCHAT_URL = new c("WEBCHAT_URL", 2);
    public static final c WEBSITE = new c("WEBSITE", 3);
    public static final c WHATSAPP_URL = new c("WHATSAPP_URL", 4);
    public static final c APP_LINK = new c("APP_LINK", 5);
    public static final c DEFAULT = new c("DEFAULT", 6);

    private static final /* synthetic */ c[] $values() {
        return new c[]{PHONE_NUMBER, SMS_NUMBER, WEBCHAT_URL, WEBSITE, WHATSAPP_URL, APP_LINK, DEFAULT};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        switch (i13) {
            case 0:
                return PHONE_NUMBER;
            case 1:
                return SMS_NUMBER;
            case 2:
                return WEBCHAT_URL;
            case 3:
                return WEBSITE;
            case 4:
                return WHATSAPP_URL;
            case 5:
                return APP_LINK;
            case 6:
                return DEFAULT;
            default:
                return null;
        }
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        switch (b.f127918a[ordinal()]) {
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
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
