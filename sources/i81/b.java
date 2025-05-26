package i81;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import net.quikkly.android.ui.CameraPreview;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ORGANIC_PIN_FADE_DURING_COLLAPSE;
    public static final b PDP_PIN_FADE_AFTER_FOUR_SECONDS;
    private final long delay;
    private final long duration;
    public static final b ORGANIC_PIN_FADE_AFTER_COLLAPSE = new b("ORGANIC_PIN_FADE_AFTER_COLLAPSE", 0, 4000, 0, 2, null);
    public static final b PDP_PIN_FADE_AFTER_FIVE_SECONDS = new b("PDP_PIN_FADE_AFTER_FIVE_SECONDS", 2, 5000, 0, 2, null);
    public static final b NONE = new b("NONE", 4, 0, 0);

    private static final /* synthetic */ b[] $values() {
        return new b[]{ORGANIC_PIN_FADE_AFTER_COLLAPSE, ORGANIC_PIN_FADE_DURING_COLLAPSE, PDP_PIN_FADE_AFTER_FIVE_SECONDS, PDP_PIN_FADE_AFTER_FOUR_SECONDS, NONE};
    }

    static {
        long j13 = 0;
        int i13 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        ORGANIC_PIN_FADE_DURING_COLLAPSE = new b("ORGANIC_PIN_FADE_DURING_COLLAPSE", 1, CameraPreview.AUTOFOCUS_INTERVAL_MILLIS, j13, i13, defaultConstructorMarker);
        PDP_PIN_FADE_AFTER_FOUR_SECONDS = new b("PDP_PIN_FADE_AFTER_FOUR_SECONDS", 3, 4000L, j13, i13, defaultConstructorMarker);
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ b(String str, int i13, long j13, long j14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, j13, (i14 & 2) != 0 ? 600L : j14);
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

    public final long getDelay() {
        return this.delay;
    }

    public final long getDuration() {
        return this.duration;
    }

    private b(String str, int i13, long j13, long j14) {
        this.delay = j13;
        this.duration = j14;
    }
}
