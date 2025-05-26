package ld2;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d Swivel = new d("Swivel", 0);
    public static final d Pulse = new d("Pulse", 1);
    public static final d Shaky = new d("Shaky", 2);
    public static final d Wobbly = new d("Wobbly", 3);
    public static final d Floaty = new d("Floaty", 4);
    public static final d Watery = new d("Watery", 5);
    public static final d LavaLamp = new d("LavaLamp", 6);
    public static final d Rotation = new d("Rotation", 7);
    public static final d Slide = new d("Slide", 8);

    private static final /* synthetic */ d[] $values() {
        return new d[]{Swivel, Pulse, Shaky, Wobbly, Floaty, Watery, LavaLamp, Rotation, Slide};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13) {
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
}
