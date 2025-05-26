package n10;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d VERIFIED_USER = new d("VERIFIED_USER", 0);
    public static final d VERIFIED_MERCHANT = new d("VERIFIED_MERCHANT", 1);
    public static final d VERIFIED_DOMAIN = new d("VERIFIED_DOMAIN", 2);
    public static final d NOT_VERIFIED = new d("NOT_VERIFIED", 3);

    private static final /* synthetic */ d[] $values() {
        return new d[]{VERIFIED_USER, VERIFIED_MERCHANT, VERIFIED_DOMAIN, NOT_VERIFIED};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
