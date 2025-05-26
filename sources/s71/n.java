package s71;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r72.j1;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n f111399j = new n(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n f111400k = new n(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111401i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13) {
        super(1);
        this.f111401i = i13;
    }

    public final Float b(st1.a svgMask) {
        j1 j1Var;
        j1 j1Var2;
        switch (this.f111401i) {
            case 0:
                Intrinsics.checkNotNullParameter(svgMask, "svgMask");
                r72.a aVar = svgMask.f115172b.f106499b;
                if (aVar == null || (j1Var = aVar.f106431a) == null) {
                    return null;
                }
                return Float.valueOf(j1Var.f106509d);
            default:
                Intrinsics.checkNotNullParameter(svgMask, "svgMask");
                r72.a aVar2 = svgMask.f115172b.f106499b;
                if (aVar2 == null || (j1Var2 = aVar2.f106431a) == null) {
                    return null;
                }
                return Float.valueOf(j1Var2.f106508c);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f111401i) {
        }
        return b((st1.a) obj);
    }
}
