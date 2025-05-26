package qn1;

import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import rm1.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEFAULT;
    public static final d DISABLED;
    public static final d ERROR;
    public static final d WARNING;
    private final int backgroundColor;
    private final int iconColor;
    private final rm1.g startIcon;
    private final int textColor;

    private static final /* synthetic */ d[] $values() {
        return new d[]{DEFAULT, ERROR, WARNING, DISABLED};
    }

    static {
        String str = "DEFAULT";
        DEFAULT = new d(str, 0, eo1.a.comp_tag_text_color_default, eo1.a.comp_tag_default_background_color, null, eo1.a.comp_tag_icon_color_default, 4, null);
        int i13 = eo1.a.comp_tag_text_color_error;
        int i14 = eo1.a.comp_tag_error_background_color;
        n nVar = n.WORKFLOW_STATUS_PROBLEM;
        rm1.h hVar = GestaltIcon.f49404f;
        ERROR = new d("ERROR", 1, i13, i14, new rm1.e(nVar, hVar), eo1.a.comp_tag_icon_color_error);
        WARNING = new d("WARNING", 2, eo1.a.comp_tag_text_color_warning, eo1.a.comp_tag_warning_background_color, new rm1.e(n.WORKFLOW_STATUS_WARNING, hVar), eo1.a.comp_tag_icon_color_warning);
        String str2 = "DISABLED";
        DISABLED = new d(str2, 3, eo1.a.comp_tag_text_color_disabled, eo1.a.comp_tag_disabled_background_color, null, eo1.a.comp_tag_icon_color_disabled, 4, null);
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ d(String str, int i13, int i14, int i15, rm1.g gVar, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, i14, i15, (i17 & 4) != 0 ? null : gVar, i16);
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

    public final int getBackgroundColor$tag_release() {
        return this.backgroundColor;
    }

    public final int getIconColor$tag_release() {
        return this.iconColor;
    }

    public final rm1.g getStartIcon$tag_release() {
        return this.startIcon;
    }

    public final int getTextColor$tag_release() {
        return this.textColor;
    }

    private d(String str, int i13, int i14, int i15, rm1.g gVar, int i16) {
        this.textColor = i14;
        this.backgroundColor = i15;
        this.startIcon = gVar;
        this.iconColor = i16;
    }
}
