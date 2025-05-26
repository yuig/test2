package gb0;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c HTTPS_PROXY_TO_MOBILE_DEEP_LINK = new c("HTTPS_PROXY_TO_MOBILE_DEEP_LINK", 0);
    public static final c UNIVERSAL_DEEP_LINK = new c("UNIVERSAL_DEEP_LINK", 1);
    public static final c MOBILE_DEEP_LINK = new c("MOBILE_DEEP_LINK", 2);

    private static final /* synthetic */ c[] $values() {
        return new c[]{HTTPS_PROXY_TO_MOBILE_DEEP_LINK, UNIVERSAL_DEEP_LINK, MOBILE_DEEP_LINK};
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
        if (i13 == 0) {
            return HTTPS_PROXY_TO_MOBILE_DEEP_LINK;
        }
        if (i13 == 1) {
            return UNIVERSAL_DEEP_LINK;
        }
        if (i13 != 2) {
            return null;
        }
        return MOBILE_DEEP_LINK;
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
        int i13 = b.f64676a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
