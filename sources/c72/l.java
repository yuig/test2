package c72;

import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class l {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l Contrast = new l() { // from class: c72.g

        /* renamed from: a, reason: collision with root package name */
        public final Pair f26899a = new Pair(Float.valueOf(0.0f), Float.valueOf(2.0f));

        /* renamed from: b, reason: collision with root package name */
        public final Pair f26900b = new Pair(Float.valueOf(0.9f), Float.valueOf(1.1f));

        @Override // c72.l
        public final Pair getSupportedRange() {
            return this.f26900b;
        }

        @Override // c72.l
        public final Pair getXRendererRange() {
            return this.f26899a;
        }
    };
    public static final l Exposure = new l() { // from class: c72.h

        /* renamed from: a, reason: collision with root package name */
        public final Pair f26901a = new Pair(Float.valueOf(-0.3f), Float.valueOf(0.3f));

        /* renamed from: b, reason: collision with root package name */
        public final Pair f26902b = new Pair(Float.valueOf(-0.07f), Float.valueOf(0.07f));

        @Override // c72.l
        public final Pair getSupportedRange() {
            return this.f26902b;
        }

        @Override // c72.l
        public final Pair getXRendererRange() {
            return this.f26901a;
        }
    };
    public static final l Warmth = new l() { // from class: c72.k

        /* renamed from: a, reason: collision with root package name */
        public final Pair f26907a = new Pair(Float.valueOf(-1.0f), Float.valueOf(1.0f));

        /* renamed from: b, reason: collision with root package name */
        public final Pair f26908b = new Pair(Float.valueOf(-0.4f), Float.valueOf(0.4f));

        @Override // c72.l
        public final Pair getSupportedRange() {
            return this.f26908b;
        }

        @Override // c72.l
        public final Pair getXRendererRange() {
            return this.f26907a;
        }
    };
    public static final l Tone = new l() { // from class: c72.j

        /* renamed from: a, reason: collision with root package name */
        public final Pair f26905a = new Pair(Float.valueOf(-1.0f), Float.valueOf(1.0f));

        /* renamed from: b, reason: collision with root package name */
        public final Pair f26906b = new Pair(Float.valueOf(-0.14f), Float.valueOf(0.14f));

        @Override // c72.l
        public final Pair getSupportedRange() {
            return this.f26906b;
        }

        @Override // c72.l
        public final Pair getXRendererRange() {
            return this.f26905a;
        }
    };
    public static final l Shadows = new l() { // from class: c72.i

        /* renamed from: a, reason: collision with root package name */
        public final Pair f26903a = new Pair(Float.valueOf(-1.0f), Float.valueOf(1.0f));

        /* renamed from: b, reason: collision with root package name */
        public final Pair f26904b = new Pair(Float.valueOf(-0.7f), Float.valueOf(0.7f));

        @Override // c72.l
        public final Pair getSupportedRange() {
            return this.f26904b;
        }

        @Override // c72.l
        public final Pair getXRendererRange() {
            return this.f26903a;
        }
    };

    private static final /* synthetic */ l[] $values() {
        return new l[]{Contrast, Exposure, Warmth, Tone, Shadows};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ l(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    @NotNull
    public abstract Pair<Float, Float> getSupportedRange();

    @NotNull
    public abstract Pair<Float, Float> getXRendererRange();

    public final float mapToSupportXR(float f13, boolean z13) {
        if (!z13) {
            return f13;
        }
        Pair<Float, Float> xRendererRange = getXRendererRange();
        float floatValue = ((Number) xRendererRange.f80346a).floatValue();
        float floatValue2 = ((Number) xRendererRange.f80347b).floatValue();
        Pair<Float, Float> supportedRange = getSupportedRange();
        float floatValue3 = ((Number) supportedRange.f80346a).floatValue();
        return (((((Number) supportedRange.f80347b).floatValue() - floatValue3) * (f13 - floatValue)) / (floatValue2 - floatValue)) + floatValue3;
    }

    private l(String str, int i13) {
    }
}
