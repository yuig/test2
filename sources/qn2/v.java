package qn2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import pn2.v1;
import pn2.x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class v {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ACCEPT_NULL;
    public static final v NOT_NULL;
    public static final v START;
    public static final v UNKNOWN;

    private static final /* synthetic */ v[] $values() {
        return new v[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        START = new t("START", 0, defaultConstructorMarker);
        ACCEPT_NULL = new r("ACCEPT_NULL", 1, defaultConstructorMarker);
        UNKNOWN = new u("UNKNOWN", 2, defaultConstructorMarker);
        NOT_NULL = new s("NOT_NULL", 3, defaultConstructorMarker);
        v[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
    }

    public /* synthetic */ v(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }

    @NotNull
    public abstract v combine(@NotNull v1 v1Var);

    @NotNull
    public final v getResultNullability(@NotNull v1 type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type.x0()) {
            return ACCEPT_NULL;
        }
        if (type instanceof pn2.r) {
        }
        Intrinsics.checkNotNullParameter(type, "type");
        return pn2.c.a(a0.G(false, true, p.f104516a, null, null, 24), dl2.b.b2(type), x0.f100855a) ? NOT_NULL : UNKNOWN;
    }

    private v(String str, int i13) {
    }
}
