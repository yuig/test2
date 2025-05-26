package a32;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c CAMERA_SNAP = new c("CAMERA_SNAP", 0);
    public static final c CAMERA_GALLERY = new c("CAMERA_GALLERY", 1);
    public static final c CAMERA_HISTORY = new c("CAMERA_HISTORY", 2);
    public static final c GENERATED_CONTENT = new c("GENERATED_CONTENT", 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{CAMERA_SNAP, CAMERA_GALLERY, CAMERA_HISTORY, GENERATED_CONTENT};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
    }

    private c(String str, int i13) {
    }

    public static final c findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return CAMERA_SNAP;
        }
        if (i13 == 1) {
            return CAMERA_GALLERY;
        }
        if (i13 == 2) {
            return CAMERA_HISTORY;
        }
        if (i13 != 3) {
            return null;
        }
        return GENERATED_CONTENT;
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
        return value();
    }

    public final int value() {
        int i13 = b.f524a[ordinal()];
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
