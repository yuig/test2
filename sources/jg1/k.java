package jg1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    private final String format;
    public static final k HEVC = new k("HEVC", 0, "video/hevc");
    public static final k AVC = new k("AVC", 1, "video/avc");
    public static final k MPEG4 = new k("MPEG4", 2, "video/mp4v-es");
    public static final k H263 = new k("H263", 3, "video/3gpp");
    public static final k AUTO = new k("AUTO", 4, "");

    private static final /* synthetic */ k[] $values() {
        return new k[]{HEVC, AVC, MPEG4, H263, AUTO};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private k(String str, int i13, String str2) {
        this.format = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    @NotNull
    public final String getFormat() {
        return this.format;
    }
}
