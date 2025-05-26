package iv1;

import i32.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NRT_AUTO_ORG_DOWNLOAD_V1 = new a("NRT_AUTO_ORG_DOWNLOAD_V1", 1, l.NRT_AUTO_ORG_UPSELL_MEDIA_MODAL_DOWNLOAD, false, f60.b.AFTER_DOWNLOAD, 2, null);
    public static final a NRT_AUTO_ORG_V1 = new a("NRT_AUTO_ORG_V1", 0, l.NRT_AUTO_ORG_UPSELL_MEDIA_MODAL, true, f60.b.AFTER_PROFILE_SAVE);

    @NotNull
    private final l experience;

    @NotNull
    private final f60.b source;
    private final boolean usesLocalCooldowns;

    private static final /* synthetic */ a[] $values() {
        return new a[]{NRT_AUTO_ORG_V1, NRT_AUTO_ORG_DOWNLOAD_V1};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ a(String str, int i13, l lVar, boolean z13, f60.b bVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, lVar, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? f60.b.UNKNOWN : bVar);
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
    public final l getExperience() {
        return this.experience;
    }

    @NotNull
    public final f60.b getSource() {
        return this.source;
    }

    public final boolean getUsesLocalCooldowns() {
        return this.usesLocalCooldowns;
    }

    private a(String str, int i13, l lVar, boolean z13, f60.b bVar) {
        this.experience = lVar;
        this.usesLocalCooldowns = z13;
        this.source = bVar;
    }
}
