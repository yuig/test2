package xl2;

import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class t {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t UBYTEARRAY;
    public static final t UINTARRAY;
    public static final t ULONGARRAY;
    public static final t USHORTARRAY;

    @NotNull
    private final ym2.b classId;

    @NotNull
    private final ym2.g typeName;

    private static final /* synthetic */ t[] $values() {
        return new t[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        ym2.b e13 = ym2.b.e("kotlin/UByteArray", false);
        Intrinsics.checkNotNullExpressionValue(e13, "fromString(...)");
        UBYTEARRAY = new t("UBYTEARRAY", 0, e13);
        ym2.b e14 = ym2.b.e("kotlin/UShortArray", false);
        Intrinsics.checkNotNullExpressionValue(e14, "fromString(...)");
        USHORTARRAY = new t("USHORTARRAY", 1, e14);
        ym2.b e15 = ym2.b.e("kotlin/UIntArray", false);
        Intrinsics.checkNotNullExpressionValue(e15, "fromString(...)");
        UINTARRAY = new t("UINTARRAY", 2, e15);
        ym2.b e16 = ym2.b.e("kotlin/ULongArray", false);
        Intrinsics.checkNotNullExpressionValue(e16, "fromString(...)");
        ULONGARRAY = new t("ULONGARRAY", 3, e16);
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private t(String str, int i13, ym2.b bVar) {
        this.classId = bVar;
        ym2.g i14 = bVar.i();
        Intrinsics.checkNotNullExpressionValue(i14, "getShortClassName(...)");
        this.typeName = i14;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    @NotNull
    public final ym2.g getTypeName() {
        return this.typeName;
    }
}
