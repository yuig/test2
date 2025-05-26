package xl2;

import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o BOOLEAN = new o("BOOLEAN", 0, "Boolean");
    public static final o BYTE;
    public static final o CHAR;

    @NotNull
    public static final m Companion;
    public static final o DOUBLE;
    public static final o FLOAT;
    public static final o INT;
    public static final o LONG;

    @NotNull
    public static final Set<o> NUMBER_TYPES;
    public static final o SHORT;

    @NotNull
    private final xk2.k arrayTypeFqName$delegate;

    @NotNull
    private final ym2.g arrayTypeName;

    @NotNull
    private final xk2.k typeFqName$delegate;

    @NotNull
    private final ym2.g typeName;

    private static final /* synthetic */ o[] $values() {
        return new o[]{BOOLEAN, CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE};
    }

    static {
        o oVar = new o("CHAR", 1, "Char");
        CHAR = oVar;
        o oVar2 = new o("BYTE", 2, "Byte");
        BYTE = oVar2;
        o oVar3 = new o("SHORT", 3, "Short");
        SHORT = oVar3;
        o oVar4 = new o("INT", 4, "Int");
        INT = oVar4;
        o oVar5 = new o("FLOAT", 5, "Float");
        FLOAT = oVar5;
        o oVar6 = new o("LONG", 6, "Long");
        LONG = oVar6;
        o oVar7 = new o("DOUBLE", 7, "Double");
        DOUBLE = oVar7;
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new m();
        NUMBER_TYPES = h1.f(oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7);
    }

    private o(String str, int i13, String str2) {
        ym2.g e13 = ym2.g.e(str2);
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        this.typeName = e13;
        ym2.g e14 = ym2.g.e(str2.concat("Array"));
        Intrinsics.checkNotNullExpressionValue(e14, "identifier(...)");
        this.arrayTypeName = e14;
        xk2.n nVar = xk2.n.PUBLICATION;
        this.typeFqName$delegate = xk2.m.a(nVar, new n(this, 1));
        this.arrayTypeFqName$delegate = xk2.m.a(nVar, new n(this, 0));
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    @NotNull
    public final ym2.c getArrayTypeFqName() {
        return (ym2.c) this.arrayTypeFqName$delegate.getValue();
    }

    @NotNull
    public final ym2.g getArrayTypeName() {
        return this.arrayTypeName;
    }

    @NotNull
    public final ym2.c getTypeFqName() {
        return (ym2.c) this.typeFqName$delegate.getValue();
    }

    @NotNull
    public final ym2.g getTypeName() {
        return this.typeName;
    }
}
