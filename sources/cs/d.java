package cs;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    private final String value;
    public static final d NOT_SUPPORTED = new d("NOT_SUPPORTED", 0, "not_supported");
    public static final d VIDEO = new d("VIDEO", 1, "video");
    public static final d IMAGE = new d("IMAGE", 2, "image");

    private static final /* synthetic */ d[] $values() {
        return new d[]{NOT_SUPPORTED, VIDEO, IMAGE};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, String str2) {
        this.value = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
