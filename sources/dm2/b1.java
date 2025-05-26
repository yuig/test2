package dm2;

import am2.i1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pn2.q1;

/* loaded from: classes2.dex */
public class b1 extends c1 implements i1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f55394f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f55395g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f55396h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f55397i;

    /* renamed from: j, reason: collision with root package name */
    public final pn2.b0 f55398j;

    /* renamed from: k, reason: collision with root package name */
    public final i1 f55399k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(am2.b containingDeclaration, i1 i1Var, int i13, bm2.i annotations, ym2.g name, pn2.b0 outType, boolean z13, boolean z14, boolean z15, pn2.b0 b0Var, am2.w0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f55394f = i13;
        this.f55395g = z13;
        this.f55396h = z14;
        this.f55397i = z15;
        this.f55398j = b0Var;
        this.f55399k = i1Var == null ? this : i1Var;
    }

    @Override // am2.j1
    public final boolean C() {
        return false;
    }

    public i1 U(yl2.g newOwner, ym2.g newName, int i13) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        bm2.i annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        pn2.b0 type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean r03 = r0();
        am2.v0 NO_SOURCE = am2.w0.f15602a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new b1(newOwner, null, i13, annotations, newName, type, r03, this.f55396h, this.f55397i, this.f55398j, NO_SOURCE);
    }

    @Override // am2.y0
    public final am2.n d(q1 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.f100834a.f()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // am2.j1
    public final /* bridge */ /* synthetic */ dn2.g d0() {
        return null;
    }

    @Override // am2.p
    public final am2.q getVisibility() {
        am2.r LOCAL = am2.s.f15578f;
        Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // am2.b
    public final Collection h() {
        Collection h10 = g().h();
        Intrinsics.checkNotNullExpressionValue(h10, "getOverriddenDescriptors(...)");
        Collection collection = h10;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((i1) ((am2.b) it.next()).x().get(this.f55394f));
        }
        return arrayList;
    }

    @Override // am2.m
    public final Object l0(ul2.e visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        switch (visitor.f122512a) {
            case 0:
                return null;
            default:
                StringBuilder builder = (StringBuilder) obj;
                Intrinsics.checkNotNullParameter(this, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                an2.y yVar = (an2.y) visitor.f122513b;
                an2.y yVar2 = an2.y.f15818c;
                yVar.k0(this, true, builder, true);
                return Unit.f80348a;
        }
    }

    public final boolean r0() {
        return this.f55395g && ((am2.d) g()).c().isReal();
    }

    @Override // dm2.p, am2.m
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public final am2.b g() {
        am2.m g13 = super.g();
        Intrinsics.g(g13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (am2.b) g13;
    }

    @Override // dm2.p
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final i1 o0() {
        i1 i1Var = this.f55399k;
        return i1Var == this ? this : ((b1) i1Var).o0();
    }
}
