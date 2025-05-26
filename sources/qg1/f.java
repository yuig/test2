package qg1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    private final int code;
    public static final f SUCCESS_WITH_NO_ATTEMPT = new f("SUCCESS_WITH_NO_ATTEMPT", 0, 1);
    public static final f FAIL_WITH_NO_ATTEMPT = new f("FAIL_WITH_NO_ATTEMPT", 1, 2);
    public static final f CANCEL_WITH_NO_ATTEMPT = new f("CANCEL_WITH_NO_ATTEMPT", 2, 3);
    public static final f ATTEMPT_WITHOUT_PREVIOUS_COMPLETION = new f("ATTEMPT_WITHOUT_PREVIOUS_COMPLETION", 3, 4);
    public static final f RESUME_WITH_PREVIOUS_ATTEMPT = new f("RESUME_WITH_PREVIOUS_ATTEMPT", 4, 5);

    private static final /* synthetic */ f[] $values() {
        return new f[]{SUCCESS_WITH_NO_ATTEMPT, FAIL_WITH_NO_ATTEMPT, CANCEL_WITH_NO_ATTEMPT, ATTEMPT_WITHOUT_PREVIOUS_COMPLETION, RESUME_WITH_PREVIOUS_ATTEMPT};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private f(String str, int i13, int i14) {
        this.code = i14;
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

    public final int getCode() {
        return this.code;
    }
}
