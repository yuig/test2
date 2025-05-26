package ul2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f0 {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 DECLARED = new f0("DECLARED", 0);
    public static final f0 INHERITED = new f0("INHERITED", 1);

    private static final /* synthetic */ f0[] $values() {
        return new f0[]{DECLARED, INHERITED};
    }

    static {
        f0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
    }

    private f0(String str, int i13) {
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }

    public final boolean accept(@NotNull am2.d member) {
        Intrinsics.checkNotNullParameter(member, "member");
        return member.c().isReal() == (this == DECLARED);
    }
}
