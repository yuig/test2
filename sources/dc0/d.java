package dc0;

import lb.l0;
import org.jetbrains.annotations.NotNull;
import u50.b0;
import u50.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d LOCK;
    public static final d PINTEREST;

    @NotNull
    private final rm1.q icon;

    @NotNull
    private final u50.n marginStart;

    @NotNull
    private final u50.n marginTop;

    @NotNull
    private final om1.e size;

    @NotNull
    private final om1.f style;

    private static final /* synthetic */ d[] $values() {
        return new d[]{LOCK, PINTEREST};
    }

    static {
        rm1.q qVar = rm1.q.LOCK;
        om1.e eVar = om1.e.SM;
        om1.f fVar = om1.f.DEFAULT_LIGHT_GRAY;
        int i13 = eo1.c.space_200;
        LOCK = new d("LOCK", 0, qVar, eVar, fVar, new b0(i13), new b0(i13));
        PINTEREST = new d("PINTEREST", 1, rm1.q.PINTEREST, om1.e.MD, om1.f.TRANSPARENT_ALWAYS_LIGHT, new x(0), new x(0));
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, rm1.q qVar, om1.e eVar, om1.f fVar, u50.n nVar, u50.n nVar2) {
        this.icon = qVar;
        this.size = eVar;
        this.style = fVar;
        this.marginTop = nVar;
        this.marginStart = nVar2;
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

    @NotNull
    public final rm1.q getIcon() {
        return this.icon;
    }

    @NotNull
    public final u50.n getMarginStart() {
        return this.marginStart;
    }

    @NotNull
    public final u50.n getMarginTop() {
        return this.marginTop;
    }

    @NotNull
    public final om1.e getSize() {
        return this.size;
    }

    @NotNull
    public final om1.f getStyle() {
        return this.style;
    }
}
