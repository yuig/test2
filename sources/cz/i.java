package cz;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i SEARCH_STYLES_SURVEY = new i("SEARCH_STYLES_SURVEY", 0, "336");

    /* renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f53472id;

    private static final /* synthetic */ i[] $values() {
        return new i[]{SEARCH_STYLES_SURVEY};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private i(String str, int i13, String str2) {
        this.f53472id = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.f53472id;
    }
}
