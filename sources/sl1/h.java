package sl1;

import kotlin.NoWhenBranchMatchedException;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h LG = new h("LG", 0, rl1.r.LG, eo1.a.comp_avatargroup_lg_group_spacing, Integer.valueOf(eo1.a.comp_avatargroup_lg_count_circle_text_size));
    public static final h MD = new h("MD", 1, rl1.r.MD, eo1.a.comp_avatargroup_md_group_spacing, Integer.valueOf(eo1.a.comp_avatargroup_md_count_circle_text_size));
    public static final h SM = new h("SM", 2, rl1.r.SM, eo1.a.comp_avatargroup_sm_group_spacing, Integer.valueOf(eo1.a.comp_avatargroup_sm_count_circle_text_size));
    public static final h XS = new h("XS", 3, rl1.r.XS, eo1.a.comp_avatargroup_xs_group_spacing, null);

    @NotNull
    private final rl1.r avatarSize;
    private final Integer fontSizeRes;
    private final int spacingRes;

    private static final /* synthetic */ h[] $values() {
        return new h[]{LG, MD, SM, XS};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private h(String str, int i13, rl1.r rVar, int i14, Integer num) {
        this.avatarSize = rVar;
        this.spacingRes = i14;
        this.fontSizeRes = num;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @NotNull
    public final rl1.r getAvatarSize$avatarGroup_release() {
        return this.avatarSize;
    }

    public final Integer getFontSizeRes$avatarGroup_release() {
        return this.fontSizeRes;
    }

    public final int getSpacingRes$avatarGroup_release() {
        return this.spacingRes;
    }

    public final om1.e toIconButtonSizeOrNull$avatarGroup_release() {
        int i13 = g.f113175a[ordinal()];
        if (i13 == 1) {
            return om1.e.LG;
        }
        if (i13 == 2) {
            return om1.e.MD;
        }
        if (i13 == 3) {
            return om1.e.SM;
        }
        if (i13 == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
