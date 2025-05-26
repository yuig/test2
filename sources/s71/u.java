package s71;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    private final int value;
    public static final u VISUAL_SOURCE_CAMERA = new u("VISUAL_SOURCE_CAMERA", 0, 1);
    public static final u VISUAL_SOURCE_EXTENSION = new u("VISUAL_SOURCE_EXTENSION", 1, 3);
    public static final u VISUAL_SOURCE_UNKNOWN = new u("VISUAL_SOURCE_UNKNOWN", 2, 4);
    public static final u VISUAL_SOURCE_LENS_MY_LOOK = new u("VISUAL_SOURCE_LENS_MY_LOOK", 3, 6);
    public static final u VISUAL_SOURCE_TEXT_VISUAL_SEARCH = new u("VISUAL_SOURCE_TEXT_VISUAL_SEARCH", 4, 8);
    public static final u VISUAL_SOURCE_FLASHLIGHT = new u("VISUAL_SOURCE_FLASHLIGHT", 5, 9);
    public static final u VISUAL_SOURCE_PINCH_TO_ZOOM = new u("VISUAL_SOURCE_PINCH_TO_ZOOM", 6, 12);

    private static final /* synthetic */ u[] $values() {
        return new u[]{VISUAL_SOURCE_CAMERA, VISUAL_SOURCE_EXTENSION, VISUAL_SOURCE_UNKNOWN, VISUAL_SOURCE_LENS_MY_LOOK, VISUAL_SOURCE_TEXT_VISUAL_SEARCH, VISUAL_SOURCE_FLASHLIGHT, VISUAL_SOURCE_PINCH_TO_ZOOM};
    }

    static {
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private u(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
