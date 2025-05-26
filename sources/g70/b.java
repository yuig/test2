package g70;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.u;
import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NONE = new b("NONE", 0);
    public static final b BOARD_LANDING = new b("BOARD_LANDING", 1);
    public static final b PUBLIC_BOARD = new b("PUBLIC_BOARD", 2);
    public static final b AUTOMAGICAL_BOARD = new b("AUTOMAGICAL_BOARD", 3);

    private static final /* synthetic */ b[] $values() {
        return new b[]{NONE, BOARD_LANDING, PUBLIC_BOARD, AUTOMAGICAL_BOARD};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13) {
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final ScreenLocation getScreenLocation() {
        int i13 = a.f63859a[ordinal()];
        if (i13 == 1) {
            return u.b();
        }
        if (i13 == 2) {
            return u.a();
        }
        if (i13 == 3) {
            return u.c();
        }
        if (i13 == 4) {
            return u.b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
