package jl0;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;

    @NotNull
    private static final d DEFAULT;
    public static final d ORGANIZE;
    public static final d ORGANIZE_SELECT_ALL_BACKEND_TOGGLED;
    public static final d VIEW;

    private static final /* synthetic */ d[] $values() {
        return new d[]{VIEW, ORGANIZE, ORGANIZE_SELECT_ALL_BACKEND_TOGGLED};
    }

    static {
        d dVar = new d("VIEW", 0);
        VIEW = dVar;
        ORGANIZE = new d("ORGANIZE", 1);
        ORGANIZE_SELECT_ALL_BACKEND_TOGGLED = new d("ORGANIZE_SELECT_ALL_BACKEND_TOGGLED", 2);
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new c();
        DEFAULT = dVar;
    }

    private d(String str, int i13) {
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

    public final boolean inOrganize() {
        return this == ORGANIZE || this == ORGANIZE_SELECT_ALL_BACKEND_TOGGLED;
    }

    public final boolean isSelectAllBackendToggled() {
        return this == ORGANIZE_SELECT_ALL_BACKEND_TOGGLED;
    }
}
