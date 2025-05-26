package rm1;

import android.content.Context;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class n implements m {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ADD;
    public static final n ANGLED_PIN;
    public static final n ARROW_UP_RIGHT;
    public static final n CANCEL;
    public static final n CART;
    public static final n CHECK;
    public static final n CHECK_CIRCLE_FILL;
    public static final n CHEVRON_DOWN;
    public static final n CHEVRON_LEFT;
    public static final n CHEVRON_RIGHT;
    public static final n CHEVRON_UP;
    public static final n DASH;
    public static final n DIRECTIONAL_ARROW_LEFT;
    public static final n DIRECTIONAL_ARROW_RIGHT;
    public static final n ELLIPSIS;
    public static final n INFO_CIRCLE_FILL;
    public static final n LOCK;
    public static final n MAXIMIZE;
    public static final n MUTE;
    public static final n SORT_ASCENDING;
    public static final n SORT_DESCENDING;
    public static final n SOUND;
    public static final n SOUND_SLASH;
    public static final n SPARKLE;
    public static final n WORKFLOW_STATUS_CANCELED;
    public static final n WORKFLOW_STATUS_HALTED;
    public static final n WORKFLOW_STATUS_IN_PROGRESS;
    public static final n WORKFLOW_STATUS_PROBLEM;
    public static final n WORKFLOW_STATUS_UNSTARTED;
    public static final n WORKFLOW_STATUS_WARNING;

    @NotNull
    private final o iconDefinition;

    private static final /* synthetic */ n[] $values() {
        return new n[]{ADD, ANGLED_PIN, ARROW_UP_RIGHT, CANCEL, CART, CHECK, CHECK_CIRCLE_FILL, CHEVRON_DOWN, CHEVRON_LEFT, CHEVRON_RIGHT, CHEVRON_UP, DASH, DIRECTIONAL_ARROW_LEFT, DIRECTIONAL_ARROW_RIGHT, ELLIPSIS, INFO_CIRCLE_FILL, LOCK, MAXIMIZE, MUTE, SORT_ASCENDING, SORT_DESCENDING, SOUND, SOUND_SLASH, SPARKLE, WORKFLOW_STATUS_CANCELED, WORKFLOW_STATUS_HALTED, WORKFLOW_STATUS_IN_PROGRESS, WORKFLOW_STATUS_PROBLEM, WORKFLOW_STATUS_UNSTARTED, WORKFLOW_STATUS_WARNING};
    }

    static {
        g92.d dVar = g92.d.CLASSIC;
        Pair pair = new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_add_gestalt));
        g92.d dVar2 = g92.d.VR;
        ADD = new n("ADD", 0, new p(z0.g(pair, new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_add_gestalt)))));
        ANGLED_PIN = new n("ANGLED_PIN", 1, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_angled_pin_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_angled_pin_gestalt)))));
        ARROW_UP_RIGHT = new n("ARROW_UP_RIGHT", 2, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_arrow_up_right_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_arrow_up_right_gestalt)))));
        CANCEL = new n("CANCEL", 3, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_cancel_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_cancel_gestalt)))));
        CART = new n("CART", 4, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_cart_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_cart_gestalt)))));
        CHECK = new n("CHECK", 5, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_check_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_check_gestalt)))));
        CHECK_CIRCLE_FILL = new n("CHECK_CIRCLE_FILL", 6, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_check_circle_fill_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_check_circle_fill_gestalt)))));
        CHEVRON_DOWN = new n("CHEVRON_DOWN", 7, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_chevron_down_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_chevron_down_gestalt)))));
        CHEVRON_LEFT = new n("CHEVRON_LEFT", 8, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_chevron_left_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_chevron_left_gestalt)))));
        CHEVRON_RIGHT = new n("CHEVRON_RIGHT", 9, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_chevron_right_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_chevron_right_gestalt)))));
        CHEVRON_UP = new n("CHEVRON_UP", 10, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_chevron_up_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_chevron_up_gestalt)))));
        DASH = new n("DASH", 11, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_dash_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_dash_gestalt)))));
        DIRECTIONAL_ARROW_LEFT = new n("DIRECTIONAL_ARROW_LEFT", 12, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_directional_arrow_left_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_directional_arrow_left_gestalt)))));
        DIRECTIONAL_ARROW_RIGHT = new n("DIRECTIONAL_ARROW_RIGHT", 13, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_directional_arrow_right_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_directional_arrow_right_gestalt)))));
        ELLIPSIS = new n("ELLIPSIS", 14, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_ellipsis_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_ellipsis_gestalt)))));
        INFO_CIRCLE_FILL = new n("INFO_CIRCLE_FILL", 15, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_info_circle_fill_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_info_circle_fill_gestalt)))));
        LOCK = new n("LOCK", 16, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_lock_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_lock_gestalt)))));
        MAXIMIZE = new n("MAXIMIZE", 17, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_maximize_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_maximize_gestalt)))));
        MUTE = new n("MUTE", 18, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_mute_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_mute_gestalt)))));
        SORT_ASCENDING = new n("SORT_ASCENDING", 19, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_sort_ascending_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_sort_ascending_gestalt)))));
        SORT_DESCENDING = new n("SORT_DESCENDING", 20, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_sort_descending_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_sort_descending_gestalt)))));
        SOUND = new n("SOUND", 21, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_sound_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_sound_gestalt)))));
        SOUND_SLASH = new n("SOUND_SLASH", 22, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_sound_slash_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_sound_slash_gestalt)))));
        SPARKLE = new n("SPARKLE", 23, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_sparkle_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_sparkle_gestalt)))));
        WORKFLOW_STATUS_CANCELED = new n("WORKFLOW_STATUS_CANCELED", 24, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_workflow_status_canceled_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_workflow_status_canceled_gestalt)))));
        WORKFLOW_STATUS_HALTED = new n("WORKFLOW_STATUS_HALTED", 25, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_workflow_status_halted_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_workflow_status_halted_gestalt)))));
        WORKFLOW_STATUS_IN_PROGRESS = new n("WORKFLOW_STATUS_IN_PROGRESS", 26, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_workflow_status_in_progress_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_workflow_status_in_progress_gestalt)))));
        WORKFLOW_STATUS_PROBLEM = new n("WORKFLOW_STATUS_PROBLEM", 27, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_workflow_status_problem_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_workflow_status_problem_gestalt)))));
        WORKFLOW_STATUS_UNSTARTED = new n("WORKFLOW_STATUS_UNSTARTED", 28, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_workflow_status_unstarted_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_workflow_status_unstarted_gestalt)))));
        WORKFLOW_STATUS_WARNING = new n("WORKFLOW_STATUS_WARNING", 29, new p(z0.g(new Pair(dVar, Integer.valueOf(sm1.b.ic_compact_workflow_status_warning_gestalt)), new Pair(dVar2, Integer.valueOf(sm1.b.ic_vr_compact_workflow_status_warning_gestalt)))));
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private n(String str, int i13, o oVar) {
        this.iconDefinition = oVar;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @Override // rm1.m
    public int drawableRes(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.iconDefinition.a(context);
    }

    public int getDrawableRes() {
        return this.iconDefinition.c();
    }

    public int drawableRes(@NotNull Context context, @NotNull g92.d theme) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return this.iconDefinition.b(context, theme);
    }
}
