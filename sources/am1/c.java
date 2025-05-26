package am1;

import lb.l0;
import org.jetbrains.annotations.NotNull;
import u50.g0;
import u50.i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CONTINUE = new c("CONTINUE", 0, g0.b(new String[0], j.button_social_continue_label));
    public static final c LOGIN = new c("LOGIN", 1, g0.b(new String[0], j.button_social_login_label));
    public static final c SIGNUP = new c("SIGNUP", 2, g0.b(new String[0], j.button_social_signup_label));

    @NotNull
    private final i0 text;

    private static final /* synthetic */ c[] $values() {
        return new c[]{CONTINUE, LOGIN, SIGNUP};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private c(String str, int i13, i0 i0Var) {
        this.text = i0Var;
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

    @NotNull
    public final i0 getText() {
        return this.text;
    }
}
