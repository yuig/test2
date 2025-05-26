package en0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int defaultBitrate;
    private final int frameArea;
    private final int highFrameRateBitrate;
    private final int longDimension;
    private final int shortDimension;
    public static final b Q_4K = new b("Q_4K", 0, 3840, 2160, 45000000, 68000000);
    public static final b FULL_HD = new b("FULL_HD", 1, 1920, 1080, 8000000, 12000000);
    public static final b HDR = new b("HDR", 2, 1280, 720, 6000000, 7500000);
    public static final b HD = new b("HD", 3, 960, 540, 4000000, 5000000);
    public static final b SD = new b("SD", 4, 720, 480, 2000000, 3000000);
    public static final b INVALID = new b("INVALID", 5, -1, -1, -1, -1);

    private static final /* synthetic */ b[] $values() {
        return new b[]{Q_4K, FULL_HD, HDR, HD, SD, INVALID};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14, int i15, int i16, int i17) {
        this.longDimension = i14;
        this.shortDimension = i15;
        this.defaultBitrate = i16;
        this.highFrameRateBitrate = i17;
        this.frameArea = i14 * i15;
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

    public final int getDefaultBitrate() {
        return this.defaultBitrate;
    }

    public final int getFrameArea() {
        return this.frameArea;
    }

    public final int getHighFrameRateBitrate() {
        return this.highFrameRateBitrate;
    }

    public final int getLongDimension() {
        return this.longDimension;
    }

    public final int getShortDimension() {
        return this.shortDimension;
    }
}
