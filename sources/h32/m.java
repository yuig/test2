package h32;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;

    @NotNull
    public static final k Companion;
    public static final m WEB = new m("WEB", 0);
    public static final m ANDROID_MOBILE = new m("ANDROID_MOBILE", 1);
    public static final m ANDROID_TABLET = new m("ANDROID_TABLET", 2);
    public static final m ANDROID_LITE = new m("ANDROID_LITE", 3);

    private static final /* synthetic */ m[] $values() {
        return new m[]{WEB, ANDROID_MOBILE, ANDROID_TABLET, ANDROID_LITE};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new k();
    }

    private m(String str, int i13) {
    }

    public static final m findByValue(int i13) {
        Companion.getClass();
        if (i13 == 0) {
            return WEB;
        }
        if (i13 == 10) {
            return ANDROID_LITE;
        }
        if (i13 == 3) {
            return ANDROID_MOBILE;
        }
        if (i13 != 4) {
            return null;
        }
        return ANDROID_TABLET;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final int getValue() {
        return value();
    }

    public final int value() {
        int i13 = l.f67136a[ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 3;
        }
        if (i13 == 3) {
            return 4;
        }
        if (i13 == 4) {
            return 10;
        }
        throw new NoWhenBranchMatchedException();
    }
}
