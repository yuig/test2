package ot1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p BASELINE = new p("BASELINE", 0, 66, false, false, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, null);
    public static final p CONSTRAINED_BASELINE = new p("CONSTRAINED_BASELINE", 1, 66, false, true, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN, null);
    private final boolean constraint0;
    private final boolean constraint1;
    private final boolean constraint2;
    private final boolean constraint3;
    private final boolean constraint4;
    private final boolean constraint5;
    private final long profileIdc;

    private static final /* synthetic */ p[] $values() {
        return new p[]{BASELINE, CONSTRAINED_BASELINE};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    public /* synthetic */ p(String str, int i13, long j13, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, j13, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? false : z18);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final boolean getConstraint0() {
        return this.constraint0;
    }

    public final boolean getConstraint1() {
        return this.constraint1;
    }

    public final boolean getConstraint2() {
        return this.constraint2;
    }

    public final boolean getConstraint3() {
        return this.constraint3;
    }

    public final boolean getConstraint4() {
        return this.constraint4;
    }

    public final boolean getConstraint5() {
        return this.constraint5;
    }

    /* renamed from: getProfileIdc-s-VKNKU, reason: not valid java name */
    public final long m228getProfileIdcsVKNKU() {
        return this.profileIdc;
    }

    private p(String str, int i13, long j13, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.profileIdc = j13;
        this.constraint0 = z13;
        this.constraint1 = z14;
        this.constraint2 = z15;
        this.constraint3 = z16;
        this.constraint4 = z17;
        this.constraint5 = z18;
    }
}
