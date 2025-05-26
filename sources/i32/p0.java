package i32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;

    @NotNull
    public static final n0 Companion;
    public static final p0 VIDEO_TITLE_DESC_PRIMARY = new p0("VIDEO_TITLE_DESC_PRIMARY", 0);
    public static final p0 VIDEO_TITLE_DESC_SECONDARY = new p0("VIDEO_TITLE_DESC_SECONDARY", 1);
    public static final p0 IMAGE_TITLE_DESC_PRIMARY = new p0("IMAGE_TITLE_DESC_PRIMARY", 2);
    public static final p0 IMAGE_TITLE_DESC_SECONDARY = new p0("IMAGE_TITLE_DESC_SECONDARY", 3);

    private static final /* synthetic */ p0[] $values() {
        return new p0[]{VIDEO_TITLE_DESC_PRIMARY, VIDEO_TITLE_DESC_SECONDARY, IMAGE_TITLE_DESC_PRIMARY, IMAGE_TITLE_DESC_SECONDARY};
    }

    static {
        p0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new n0();
    }

    private p0(String str, int i13) {
    }

    public static final p0 findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return VIDEO_TITLE_DESC_PRIMARY;
        }
        if (i13 == 1) {
            return VIDEO_TITLE_DESC_SECONDARY;
        }
        if (i13 == 2) {
            return IMAGE_TITLE_DESC_PRIMARY;
        }
        if (i13 != 3) {
            return null;
        }
        return IMAGE_TITLE_DESC_SECONDARY;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = o0.f71488a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        if (i13 == 3) {
            return 2;
        }
        if (i13 == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
