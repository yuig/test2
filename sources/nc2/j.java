package nc2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j AUTOPLAY_ALWAYS;
    public static final j AUTOPLAY_BY_STATE;
    public static final j AUTOPLAY_BY_STATE_WITH_NETWORK;
    public static final j AUTOPLAY_MAYBE;
    private final boolean shouldAutoplay;
    private final boolean shouldBePlayable;
    private final boolean shouldCheckNetwork;
    public static final j AUTOPLAY_ALWAYS_WITH_NETWORK = new j("AUTOPLAY_ALWAYS_WITH_NETWORK", 4, true, true, true);
    public static final j AUTOPLAY_MAYBE_WITH_NETWORK = new j("AUTOPLAY_MAYBE_WITH_NETWORK", 5, true, false, true, 2, null);
    public static final j DISABLE_AUTOPLAY = new j("DISABLE_AUTOPLAY", 6, false, false, false, 4, null);

    private static final /* synthetic */ j[] $values() {
        return new j[]{AUTOPLAY_BY_STATE, AUTOPLAY_ALWAYS, AUTOPLAY_MAYBE, AUTOPLAY_BY_STATE_WITH_NETWORK, AUTOPLAY_ALWAYS_WITH_NETWORK, AUTOPLAY_MAYBE_WITH_NETWORK, DISABLE_AUTOPLAY};
    }

    static {
        boolean z13 = true;
        boolean z14 = false;
        AUTOPLAY_BY_STATE = new j("AUTOPLAY_BY_STATE", 0, false, z13, z14, 5, null);
        boolean z15 = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AUTOPLAY_ALWAYS = new j("AUTOPLAY_ALWAYS", 1, true, z15, false, 4, defaultConstructorMarker);
        AUTOPLAY_MAYBE = new j("AUTOPLAY_MAYBE", 2, z13, z14, false, 6, null);
        AUTOPLAY_BY_STATE_WITH_NETWORK = new j("AUTOPLAY_BY_STATE_WITH_NETWORK", 3, false, z15, true, 1, defaultConstructorMarker);
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ j(String str, int i13, boolean z13, boolean z14, boolean z15, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? false : z13, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
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

    public final boolean getShouldAutoplay() {
        return this.shouldAutoplay;
    }

    public final boolean getShouldBePlayable() {
        return this.shouldBePlayable;
    }

    public final boolean getShouldCheckNetwork() {
        return this.shouldCheckNetwork;
    }

    private j(String str, int i13, boolean z13, boolean z14, boolean z15) {
        this.shouldAutoplay = z13;
        this.shouldBePlayable = z14;
        this.shouldCheckNetwork = z15;
    }
}
