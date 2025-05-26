package cy;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    private final String ext;
    public static final h PATH_JPG = new h("PATH_JPG", 0, "jpg");
    public static final h PATH_GIF = new h("PATH_GIF", 1, "gif");
    public static final h PATH_PNG = new h("PATH_PNG", 2, "png");
    public static final h PATH_MP4 = new h("PATH_MP4", 3, "mp4");
    public static final h PATH_MPD = new h("PATH_MPD", 4, "mpd");
    public static final h PATH_M3U8 = new h("PATH_M3U8", 5, "m3u8");
    public static final h PATH_CMFA = new h("PATH_CMFA", 6, "cmfa");
    public static final h PATH_CMFV = new h("PATH_CMFV", 7, "cmfv");
    public static final h PATH_TS = new h("PATH_TS", 8, "ts");
    public static final h PATH_VTT = new h("PATH_VTT", 9, "vtt");

    private static final /* synthetic */ h[] $values() {
        return new h[]{PATH_JPG, PATH_GIF, PATH_PNG, PATH_MP4, PATH_MPD, PATH_M3U8, PATH_CMFA, PATH_CMFV, PATH_TS, PATH_VTT};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13, String str2) {
        this.ext = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @NotNull
    public final String getExt() {
        return this.ext;
    }
}
