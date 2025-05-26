package bc2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j DASH;
    public static final j HLS;
    public static final j MP4;
    public static final j OTHER;
    private final int value;

    private static final /* synthetic */ j[] $values() {
        return new j[]{HLS, DASH, MP4, OTHER};
    }

    static {
        int i13 = 0;
        int i14 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        HLS = new g("HLS", i13, i14, defaultConstructorMarker);
        DASH = new f("DASH", 1, i13, defaultConstructorMarker);
        MP4 = new h("MP4", i14, 5, defaultConstructorMarker);
        OTHER = new i("OTHER", 3, 4, defaultConstructorMarker);
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ j(String str, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, i14);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    @NotNull
    public abstract String fileExtension();

    public final int getValue() {
        return this.value;
    }

    private j(String str, int i13, int i14) {
        this.value = i14;
    }
}
