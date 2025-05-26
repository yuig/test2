package ep0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private int value;
    public static final d FLASH_MODE_ON = new d("FLASH_MODE_ON", 0, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE);
    public static final d FLASH_MODE_OFF = new d("FLASH_MODE_OFF", 1, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE);
    public static final d FLASH_MODE_AUTO = new d("FLASH_MODE_AUTO", 2, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE);

    private static final /* synthetic */ d[] $values() {
        return new d[]{FLASH_MODE_ON, FLASH_MODE_OFF, FLASH_MODE_AUTO};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, int i14) {
        this.value = i14;
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

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i13) {
        this.value = i13;
    }
}
