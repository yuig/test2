package ag1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    private final String value;
    public static final i IMAGE = new i("IMAGE", 0, "image");
    public static final i VIDEO = new i("VIDEO", 1, "video");
    public static final i MULTI_ASSET = new i("MULTI_ASSET", 2, "multi_asset");

    private static final /* synthetic */ i[] $values() {
        return new i[]{IMAGE, VIDEO, MULTI_ASSET};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
