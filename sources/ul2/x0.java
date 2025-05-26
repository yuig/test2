package ul2;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f122630i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f122631j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i13) {
        super(0);
        this.f122630i = i13;
        this.f122631j = y0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        IntRange intRange;
        int i13 = this.f122630i;
        y0 y0Var = this.f122631j;
        switch (i13) {
            case 0:
                return c2.d(y0Var.c());
            default:
                am2.p0 c13 = y0Var.c();
                boolean z13 = c13 instanceof dm2.d;
                t tVar = y0Var.f122643a;
                if (z13 && Intrinsics.d(c2.g(tVar.n()), c13) && tVar.n().c() == am2.c.FAKE_OVERRIDE) {
                    am2.m g13 = tVar.n().g();
                    Intrinsics.g(g13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class k13 = c2.k((am2.g) g13);
                    if (k13 != null) {
                        return k13;
                    }
                    throw new u1("Cannot determine receiver Java type of inherited declaration: " + c13);
                }
                vl2.g i14 = tVar.i();
                boolean z14 = i14 instanceof vl2.e0;
                int i15 = y0Var.f122644b;
                if (!z14) {
                    if (!(i14 instanceof vl2.d0)) {
                        return (Type) i14.a().get(i15);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((vl2.d0) i14).f126168d.get(i15)).toArray(new Class[0]);
                    return y0.a(y0Var, (Type[]) Arrays.copyOf(clsArr, clsArr.length));
                }
                IntRange[] intRangeArr = ((vl2.e0) i14).f126177e;
                if (i15 >= 0 && i15 < intRangeArr.length) {
                    intRange = intRangeArr[i15];
                } else if (intRangeArr.length == 0) {
                    intRange = new IntRange(i15, i15, 1);
                } else {
                    int length = ((IntRange) kotlin.collections.c0.N(intRangeArr)).f80454b + 1 + (i15 - intRangeArr.length);
                    intRange = new IntRange(length, length, 1);
                }
                Type[] typeArr = (Type[]) CollectionsKt.v0(i14.a(), intRange).toArray(new Type[0]);
                return y0.a(y0Var, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
        }
    }
}
