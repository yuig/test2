package z80;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t Background = new t("Background", 0, "5322296201660386126", "https://i.pinimg.com/736x/2d/05/ca/2d05ca2b2e41681298478c651edadd70.jpg", "1013591459868168115");
    public static final t Foreground = new t("Foreground", 1, "5321208678227959689", "https://i.pinimg.com/736x/7c/81/67/7c816734ac5b7348519c8cd8b7ce73ed.jpg", "1013591459868168229");

    @NotNull
    private final String imageUrl;

    @NotNull
    private final String pinId;

    @NotNull
    private final String shuffleItemImageId;

    private static final /* synthetic */ t[] $values() {
        return new t[]{Background, Foreground};
    }

    static {
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private t(String str, int i13, String str2, String str3, String str4) {
        this.shuffleItemImageId = str2;
        this.imageUrl = str3;
        this.pinId = str4;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getPinId() {
        return this.pinId;
    }

    @NotNull
    public final String getShuffleItemImageId() {
        return this.shuffleItemImageId;
    }
}
