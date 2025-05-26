package dm2;

import am2.i1;
import java.util.List;
import kh2.g2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a1 extends b1 {

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f55387l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(am2.b containingDeclaration, i1 i1Var, int i13, bm2.i annotations, ym2.g name, pn2.b0 outType, boolean z13, boolean z14, boolean z15, pn2.b0 b0Var, am2.w0 source, Function0 destructuringVariables) {
        super(containingDeclaration, i1Var, i13, annotations, name, outType, z13, z14, z15, b0Var, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destructuringVariables, "destructuringVariables");
        this.f55387l = xk2.m.b(destructuringVariables);
    }

    @Override // dm2.b1, am2.i1
    public final i1 U(yl2.g newOwner, ym2.g newName, int i13) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        bm2.i annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        pn2.b0 type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean r03 = r0();
        am2.v0 NO_SOURCE = am2.w0.f15602a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        g2 g2Var = new g2(this, 13);
        return new a1(newOwner, null, i13, annotations, newName, type, r03, this.f55396h, this.f55397i, this.f55398j, NO_SOURCE, g2Var);
    }

    public final List w0() {
        return (List) this.f55387l.getValue();
    }
}
