package pu0;

import com.pinterest.api.model.dk;
import com.pinterest.api.model.ek;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @NotNull
    private final rm1.q icon;
    private final int label;

    @NotNull
    private final ek spec;
    public static final a Instant = new a("Instant", 0, aq1.h.idea_pin_overlay_transition_type_instant, rm1.q.FLASH, dk.Instant);
    public static final a FadeIn = new a("FadeIn", 1, aq1.h.idea_pin_overlay_transition_type_fade_in, rm1.q.FADE, dk.FadeIn);
    public static final a SlideInLeft = new a("SlideInLeft", 2, aq1.h.idea_pin_overlay_transition_type_slide_left, rm1.q.DIRECTIONAL_ARROW_LEFT, dk.SlideInLeft);
    public static final a SlideInRight = new a("SlideInRight", 3, aq1.h.idea_pin_overlay_transition_type_slide_right, rm1.q.DIRECTIONAL_ARROW_RIGHT, dk.SlideInRight);
    public static final a SlideInUp = new a("SlideInUp", 4, aq1.h.idea_pin_overlay_transition_type_slide_up, rm1.q.SORT_ASCENDING, dk.SlideInUp);
    public static final a SlideInDown = new a("SlideInDown", 5, aq1.h.idea_pin_overlay_transition_type_slide_down, rm1.q.SORT_DESCENDING, dk.SlideInDown);
    public static final a ScaleInUp = new a("ScaleInUp", 6, aq1.h.idea_pin_overlay_transition_type_scale_up, rm1.q.MAXIMIZE, dk.ScaleInUp);
    public static final a ScaleInDown = new a("ScaleInDown", 7, aq1.h.idea_pin_overlay_transition_type_scale_down, rm1.q.MINIMIZE, dk.ScaleInDown);
    public static final a Spread = new a("Spread", 8, aq1.h.idea_pin_overlay_transition_type_spread, rm1.q.SPREAD, dk.Spread);
    public static final a Expand = new a("Expand", 9, aq1.h.idea_pin_overlay_transition_type_expand, rm1.q.EXPAND, dk.Expand);

    private static final /* synthetic */ a[] $values() {
        return new a[]{Instant, FadeIn, SlideInLeft, SlideInRight, SlideInUp, SlideInDown, ScaleInUp, ScaleInDown, Spread, Expand};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private a(String str, int i13, int i14, rm1.q qVar, ek ekVar) {
        this.label = i14;
        this.icon = qVar;
        this.spec = ekVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @NotNull
    public final rm1.q getIcon() {
        return this.icon;
    }

    public final int getLabel() {
        return this.label;
    }

    @NotNull
    public final ek getSpec() {
        return this.spec;
    }
}
