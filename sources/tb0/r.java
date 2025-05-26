package tb0;

import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r ALPHA = new r("ALPHA", 0);
    public static final r OTA = new r("OTA", 1);
    public static final r PRODUCTION = new r("PRODUCTION", 2);
    public static final r DEBUG = new r("DEBUG", 3);

    private static final /* synthetic */ r[] $values() {
        return new r[]{ALPHA, OTA, PRODUCTION, DEBUG};
    }

    static {
        r[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private r(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    @NotNull
    public final String getNamespace() {
        String name = name();
        Locale locale = Locale.ENGLISH;
        return ep.b.l(locale, "ENGLISH", name, locale, "toLowerCase(...)");
    }

    @NotNull
    public final String getNamespaceFormatted() {
        int i13 = q.f117118a[ordinal()];
        if (i13 == 1) {
            return "Alpha";
        }
        if (i13 == 2) {
            return "OTA";
        }
        if (i13 == 3) {
            return "Production";
        }
        if (i13 == 4) {
            return "Local Development";
        }
        throw new NoWhenBranchMatchedException();
    }
}
