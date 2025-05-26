package sa0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;

    @NotNull
    public static final c0 Companion;
    private final int value;
    public static final d0 Camera = new d0("Camera", 0, 2);
    public static final d0 Gallery = new d0("Gallery", 1, 1);

    private static final /* synthetic */ d0[] $values() {
        return new d0[]{Camera, Gallery};
    }

    static {
        d0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new c0();
    }

    private d0(String str, int i13, int i14) {
        this.value = i14;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
