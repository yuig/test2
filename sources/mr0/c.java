package mr0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;
    private final int value;
    public static final c UNDEFINED_PARENT = new c("UNDEFINED_PARENT", 0, -1);
    public static final c DID_IT_PARENT = new c("DID_IT_PARENT", 1, 0);
    public static final c COMMENT_PARENT = new c("COMMENT_PARENT", 2, 1);
    public static final c COMMUNITY_POST_PARENT = new c("COMMUNITY_POST_PARENT", 3, 2);
    public static final c COMMUNITY_COMMENT_PARENT = new c("COMMUNITY_COMMENT_PARENT", 4, 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{UNDEFINED_PARENT, DID_IT_PARENT, COMMENT_PARENT, COMMUNITY_POST_PARENT, COMMUNITY_COMMENT_PARENT};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new b();
    }

    private c(String str, int i13, int i14) {
        this.value = i14;
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
        return this.value;
    }
}
