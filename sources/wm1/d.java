package wm1;

import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ADD;
    public static final d ARROW_FORWARD = new d("ARROW_FORWARD", 0, new rm1.e(rm1.n.CHEVRON_RIGHT));
    public static final d ARROW_UP_RIGHT;
    public static final d ELLIPSIS;

    @NotNull
    private final rm1.g iconAndSize;

    private static final /* synthetic */ d[] $values() {
        return new d[]{ARROW_FORWARD, ARROW_UP_RIGHT, ELLIPSIS, ADD};
    }

    static {
        rm1.q qVar = rm1.q.ARROW_UP_RIGHT;
        rm1.i iVar = rm1.i.SM;
        ARROW_UP_RIGHT = new d("ARROW_UP_RIGHT", 1, new rm1.f(qVar, iVar));
        ELLIPSIS = new d("ELLIPSIS", 2, new rm1.f(rm1.q.ELLIPSIS, iVar));
        ADD = new d("ADD", 3, new rm1.f(rm1.q.ADD, iVar));
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    private d(String str, int i13, rm1.g gVar) {
        this.iconAndSize = gVar;
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
    public final rm1.g getIconAndSize() {
        return this.iconAndSize;
    }
}
