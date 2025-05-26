package pu0;

import com.pinterest.api.model.uk;
import com.pinterest.api.model.vk;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final rm1.q icon;
    private final int label;

    @NotNull
    private final vk spec;
    public static final b Instant = new b("Instant", 0, aq1.h.idea_pin_overlay_transition_type_instant, rm1.q.FLASH, uk.Instant);
    public static final b FadeOut = new b("FadeOut", 1, aq1.h.idea_pin_overlay_transition_type_fade_out, rm1.q.FADE, uk.FadeOut);
    public static final b SlideOutLeft = new b("SlideOutLeft", 2, aq1.h.idea_pin_overlay_transition_type_slide_left, rm1.q.DIRECTIONAL_ARROW_LEFT, uk.SlideOutLeft);
    public static final b SlideOutRight = new b("SlideOutRight", 3, aq1.h.idea_pin_overlay_transition_type_slide_right, rm1.q.DIRECTIONAL_ARROW_RIGHT, uk.SlideOutRight);
    public static final b SlideOutUp = new b("SlideOutUp", 4, aq1.h.idea_pin_overlay_transition_type_slide_up, rm1.q.SORT_ASCENDING, uk.SlideOutUp);
    public static final b SlideOutDown = new b("SlideOutDown", 5, aq1.h.idea_pin_overlay_transition_type_slide_down, rm1.q.SORT_DESCENDING, uk.SlideOutDown);
    public static final b ScaleOutUp = new b("ScaleOutUp", 6, aq1.h.idea_pin_overlay_transition_type_scale_up, rm1.q.MAXIMIZE, uk.ScaleOutUp);
    public static final b ScaleOutDown = new b("ScaleOutDown", 7, aq1.h.idea_pin_overlay_transition_type_scale_down, rm1.q.MINIMIZE, uk.ScaleOutDown);
    public static final b Shrink = new b("Shrink", 8, aq1.h.idea_pin_overlay_transition_type_shrink, rm1.q.SHRINK, uk.Shrink);
    public static final b Collapse = new b("Collapse", 9, aq1.h.idea_pin_overlay_transition_type_collapse, rm1.q.COLLAPSE, uk.Collapse);

    private static final /* synthetic */ b[] $values() {
        return new b[]{Instant, FadeOut, SlideOutLeft, SlideOutRight, SlideOutUp, SlideOutDown, ScaleOutUp, ScaleOutDown, Shrink, Collapse};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private b(String str, int i13, int i14, rm1.q qVar, vk vkVar) {
        this.label = i14;
        this.icon = qVar;
        this.spec = vkVar;
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

    @NotNull
    public final rm1.q getIcon() {
        return this.icon;
    }

    public final int getLabel() {
        return this.label;
    }

    @NotNull
    public final vk getSpec() {
        return this.spec;
    }
}
