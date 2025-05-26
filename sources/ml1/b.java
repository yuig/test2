package ml1;

import java.util.NoSuchElementException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    private final int value;
    public static final b UNSPECIFIED_TRANSITION = new b("UNSPECIFIED_TRANSITION", 0, -1);
    public static final b DEFAULT_TRANSITION = new b("DEFAULT_TRANSITION", 1, 0);
    public static final b MODAL_TRANSITION = new b("MODAL_TRANSITION", 2, 1);
    public static final b NO_TRANSITION = new b("NO_TRANSITION", 3, 3);
    public static final b DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION = new b("DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION", 4, 4);
    public static final b VERTICAL_TRANSITION = new b("VERTICAL_TRANSITION", 5, 5);
    public static final b CROSS_FADE_TRANSITION = new b("CROSS_FADE_TRANSITION", 6, 6);

    private static final /* synthetic */ b[] $values() {
        return new b[]{UNSPECIFIED_TRANSITION, DEFAULT_TRANSITION, MODAL_TRANSITION, NO_TRANSITION, DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION, VERTICAL_TRANSITION, CROSS_FADE_TRANSITION};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private b(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static final b fromInt$framework_screens_release(int i13) {
        Companion.getClass();
        for (b bVar : values()) {
            if (bVar.getValue() == i13) {
                return bVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
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

    public final int getValue() {
        return this.value;
    }
}
