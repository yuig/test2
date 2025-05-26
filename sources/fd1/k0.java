package fd1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k0 extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 LINK = new k0("LINK", 0);
    public static final k0 IMAGE = new k0("IMAGE", 1);
    public static final k0 VIDEO = new k0("VIDEO", 2);
    public static final k0 BOARD_VIDEO = new k0("BOARD_VIDEO", 3);

    private static final /* synthetic */ k0[] $values() {
        return new k0[]{LINK, IMAGE, VIDEO, BOARD_VIDEO};
    }

    static {
        k0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private k0(String str, int i13) {
        super(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
