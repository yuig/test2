package dy0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    private final float pin1HorizontalBias;
    private final float pin1RotationDegrees;
    private final float pin1WidthPercent;
    private final float pin1ZIndex;
    private final float pin2HorizontalBias;
    private final float pin2RotationDegrees;
    private final float pin2VerticalOffsetPercent;
    private final float pin2WidthPercent;
    private final float pin2ZIndex;
    private final float pin3HorizontalBias;
    private final float pin3RotationDegrees;
    private final float pin3WidthPercent;
    private final float pin3ZIndex;
    public static final p0 START = new p0("START", 0, 0.4f, 0.4f, 0.4f, -4.0f, 0.0f, 4.0f, -0.6f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f, 0.06f);
    public static final p0 PIN_3_FOCUS = new p0("PIN_3_FOCUS", 1, 0.4f, 0.4f, 0.64f, -4.0f, 4.0f, 0.0f, -0.88f, 0.88f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    public static final p0 PIN_2_FOCUS = new p0("PIN_2_FOCUS", 2, 0.4f, 0.64f, 0.4f, 4.0f, 0.0f, -4.0f, 0.88f, 0.0f, -0.88f, 0.0f, 1.0f, 0.0f, 0.0f);
    public static final p0 PIN_1_FOCUS = new p0("PIN_1_FOCUS", 3, 0.64f, 0.4f, 0.4f, 0.0f, -4.0f, 4.0f, 0.0f, -0.88f, 0.88f, 1.0f, 0.0f, 0.0f, 0.0f);

    private static final /* synthetic */ p0[] $values() {
        return new p0[]{START, PIN_3_FOCUS, PIN_2_FOCUS, PIN_1_FOCUS};
    }

    static {
        p0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private p0(String str, int i13, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f23, float f24, float f25, float f26, float f27, float f28) {
        this.pin1WidthPercent = f13;
        this.pin2WidthPercent = f14;
        this.pin3WidthPercent = f15;
        this.pin1RotationDegrees = f16;
        this.pin2RotationDegrees = f17;
        this.pin3RotationDegrees = f18;
        this.pin1HorizontalBias = f19;
        this.pin2HorizontalBias = f23;
        this.pin3HorizontalBias = f24;
        this.pin1ZIndex = f25;
        this.pin2ZIndex = f26;
        this.pin3ZIndex = f27;
        this.pin2VerticalOffsetPercent = f28;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }

    public final float getPin1HorizontalBias() {
        return this.pin1HorizontalBias;
    }

    public final float getPin1RotationDegrees() {
        return this.pin1RotationDegrees;
    }

    public final float getPin1WidthPercent() {
        return this.pin1WidthPercent;
    }

    public final float getPin1ZIndex() {
        return this.pin1ZIndex;
    }

    public final float getPin2HorizontalBias() {
        return this.pin2HorizontalBias;
    }

    public final float getPin2RotationDegrees() {
        return this.pin2RotationDegrees;
    }

    public final float getPin2VerticalOffsetPercent() {
        return this.pin2VerticalOffsetPercent;
    }

    public final float getPin2WidthPercent() {
        return this.pin2WidthPercent;
    }

    public final float getPin2ZIndex() {
        return this.pin2ZIndex;
    }

    public final float getPin3HorizontalBias() {
        return this.pin3HorizontalBias;
    }

    public final float getPin3RotationDegrees() {
        return this.pin3RotationDegrees;
    }

    public final float getPin3WidthPercent() {
        return this.pin3WidthPercent;
    }

    public final float getPin3ZIndex() {
        return this.pin3ZIndex;
    }
}
