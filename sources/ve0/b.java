package ve0;

import java.util.Set;
import kotlin.collections.h1;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BOTTOM_CENTER;
    public static final b BOTTOM_LEFT;
    public static final b BOTTOM_RIGHT;

    @NotNull
    public static final a Companion;

    @NotNull
    public static final Set<b> HORIZONTAL_ANCHOR_POSITIONS;
    public static final b LEFT_CENTER;
    public static final b NONE = new b("NONE", 0, 0);
    public static final b RIGHT_CENTER;
    public static final b TOP_CENTER;
    public static final b TOP_LEFT;
    public static final b TOP_RIGHT;

    @NotNull
    public static final Set<b> VERTICAL_ANCHOR_POSITIONS;
    private final int value;

    private static final /* synthetic */ b[] $values() {
        return new b[]{NONE, TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, TOP_CENTER, BOTTOM_CENTER, LEFT_CENTER, RIGHT_CENTER};
    }

    static {
        b bVar = new b("TOP_LEFT", 1, 1);
        TOP_LEFT = bVar;
        b bVar2 = new b("TOP_RIGHT", 2, 2);
        TOP_RIGHT = bVar2;
        b bVar3 = new b("BOTTOM_LEFT", 3, 3);
        BOTTOM_LEFT = bVar3;
        b bVar4 = new b("BOTTOM_RIGHT", 4, 4);
        BOTTOM_RIGHT = bVar4;
        b bVar5 = new b("TOP_CENTER", 5, 5);
        TOP_CENTER = bVar5;
        b bVar6 = new b("BOTTOM_CENTER", 6, 6);
        BOTTOM_CENTER = bVar6;
        b bVar7 = new b("LEFT_CENTER", 7, 7);
        LEFT_CENTER = bVar7;
        b bVar8 = new b("RIGHT_CENTER", 8, 8);
        RIGHT_CENTER = bVar8;
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        HORIZONTAL_ANCHOR_POSITIONS = h1.c(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
        VERTICAL_ANCHOR_POSITIONS = h1.c(bVar7, bVar8);
    }

    private b(String str, int i13, int i14) {
        this.value = i14;
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
