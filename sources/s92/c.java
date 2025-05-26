package s92;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c UNKNOWN = new c("UNKNOWN", 0);
    public static final c LOCAL_MEMORY = new c("LOCAL_MEMORY", 1);
    public static final c LOCAL_DISK = new c("LOCAL_DISK", 2);
    public static final c CDN_CACHE_HIT = new c("CDN_CACHE_HIT", 3);
    public static final c CDN_CACHE_MISS = new c("CDN_CACHE_MISS", 4);

    private static final /* synthetic */ c[] $values() {
        return new c[]{UNKNOWN, LOCAL_MEMORY, LOCAL_DISK, CDN_CACHE_HIT, CDN_CACHE_MISS};
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
            return UNKNOWN;
        }
        if (i13 == 1) {
            return LOCAL_MEMORY;
        }
        if (i13 == 2) {
            return LOCAL_DISK;
        }
        if (i13 == 3) {
            return CDN_CACHE_HIT;
        }
        if (i13 != 4) {
            return null;
        }
        return CDN_CACHE_MISS;
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
        int i13 = b.f112108a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 == 2) {
            return 1;
        }
        if (i13 != 3) {
            i14 = 4;
            if (i13 == 4) {
                return 3;
            }
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return i14;
    }
}
