package ey;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q1 extends Enum {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ q1[] $VALUES;

    @NotNull
    public static final p1 Companion;
    public static final q1 PINS;
    public static final q1 USERS;

    @NotNull
    private static final Set<String> spanNames;

    @NotNull
    private final s92.i pwtAction;

    @NotNull
    private final String spanName;

    private static final /* synthetic */ q1[] $values() {
        return new q1[]{PINS, USERS};
    }

    static {
        s92.i iVar = s92.i.SEARCH_FEED_RENDER;
        PINS = new q1("PINS", 0, iVar, a3.a(iVar));
        s92.i iVar2 = s92.i.SEARCH_PROFILES_FEED_RENDER;
        USERS = new q1("USERS", 1, iVar2, a3.a(iVar2));
        q1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lb.l0.b0($values);
        Companion = new p1();
        q1[] values = values();
        ArrayList arrayList = new ArrayList(values.length);
        for (q1 q1Var : values) {
            arrayList.add(q1Var.spanName);
        }
        spanNames = CollectionsKt.J0(arrayList);
    }

    private q1(String str, int i13, s92.i iVar, String str2) {
        super(str, i13);
        this.pwtAction = iVar;
        this.spanName = str2;
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) $VALUES.clone();
    }

    @NotNull
    public final s92.i getPwtAction() {
        return this.pwtAction;
    }

    @NotNull
    public final String getSpanName() {
        return this.spanName;
    }
}
