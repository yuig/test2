package xl2;

import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u UBYTE;
    public static final u UINT;
    public static final u ULONG;
    public static final u USHORT;

    @NotNull
    private final ym2.b arrayClassId;

    @NotNull
    private final ym2.b classId;

    @NotNull
    private final ym2.g typeName;

    private static final /* synthetic */ u[] $values() {
        return new u[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        ym2.b e13 = ym2.b.e("kotlin/UByte", false);
        Intrinsics.checkNotNullExpressionValue(e13, "fromString(...)");
        UBYTE = new u("UBYTE", 0, e13);
        ym2.b e14 = ym2.b.e("kotlin/UShort", false);
        Intrinsics.checkNotNullExpressionValue(e14, "fromString(...)");
        USHORT = new u("USHORT", 1, e14);
        ym2.b e15 = ym2.b.e("kotlin/UInt", false);
        Intrinsics.checkNotNullExpressionValue(e15, "fromString(...)");
        UINT = new u("UINT", 2, e15);
        ym2.b e16 = ym2.b.e("kotlin/ULong", false);
        Intrinsics.checkNotNullExpressionValue(e16, "fromString(...)");
        ULONG = new u("ULONG", 3, e16);
        u[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private u(String str, int i13, ym2.b bVar) {
        this.classId = bVar;
        ym2.g i14 = bVar.i();
        Intrinsics.checkNotNullExpressionValue(i14, "getShortClassName(...)");
        this.typeName = i14;
        this.arrayClassId = new ym2.b(bVar.g(), ym2.g.e(i14.b() + "Array"));
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    @NotNull
    public final ym2.b getArrayClassId() {
        return this.arrayClassId;
    }

    @NotNull
    public final ym2.b getClassId() {
        return this.classId;
    }

    @NotNull
    public final ym2.g getTypeName() {
        return this.typeName;
    }
}
