package gb0;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    public static final d Companion;
    public static final f NONE = new f("NONE", 0);
    public static final f AMAZON_HANDSHAKE = new f("AMAZON_HANDSHAKE", 1);
    public static final f TARGET_HANDSHAKE = new f("TARGET_HANDSHAKE", 2);

    private static final /* synthetic */ f[] $values() {
        return new f[]{NONE, AMAZON_HANDSHAKE, TARGET_HANDSHAKE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new d();
    }

    private f(String str, int i13) {
    }

    public static final f findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return NONE;
        }
        if (i13 == 1) {
            return AMAZON_HANDSHAKE;
        }
        if (i13 != 2) {
            return null;
        }
        return TARGET_HANDSHAKE;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = e.f64677a[ordinal()];
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
