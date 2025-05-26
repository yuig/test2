package ms0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c PERMISSION_DENIED_BY_USER = new c("PERMISSION_DENIED_BY_USER", 0);
    public static final c PIN_OR_URL_NULL = new c("PIN_OR_URL_NULL", 1);
    public static final c NETWORK_REQUEST_FAILURE = new c("NETWORK_REQUEST_FAILURE", 2);
    public static final c EXTERNAL_STORAGE_MEDIA_NOT_MOUNTED = new c("EXTERNAL_STORAGE_MEDIA_NOT_MOUNTED", 3);
    public static final c EXTERNAL_STORAGE_DIRECTORY_CAN_NOT_BE_CREATED = new c("EXTERNAL_STORAGE_DIRECTORY_CAN_NOT_BE_CREATED", 4);
    public static final c EXTERNAL_STORAGE_SPACE_NOT_AVAILABLE = new c("EXTERNAL_STORAGE_SPACE_NOT_AVAILABLE", 5);
    public static final c SAVE_TO_STORAGE_FAILED = new c("SAVE_TO_STORAGE_FAILED", 6);

    private static final /* synthetic */ c[] $values() {
        return new c[]{PERMISSION_DENIED_BY_USER, PIN_OR_URL_NULL, NETWORK_REQUEST_FAILURE, EXTERNAL_STORAGE_MEDIA_NOT_MOUNTED, EXTERNAL_STORAGE_DIRECTORY_CAN_NOT_BE_CREATED, EXTERNAL_STORAGE_SPACE_NOT_AVAILABLE, SAVE_TO_STORAGE_FAILED};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13) {
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
}
