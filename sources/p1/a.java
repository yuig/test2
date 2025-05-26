package p1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98472i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f98473j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f98474k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f98475l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f98476m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f98477n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f98478o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f98479p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i13, int i14, kotlin.jvm.internal.j0 j0Var, kotlin.jvm.internal.j0 j0Var2, int i15, float f13, int i16) {
        super(1);
        this.f98473j = i13;
        this.f98474k = i14;
        this.f98478o = j0Var;
        this.f98479p = j0Var2;
        this.f98475l = i15;
        this.f98476m = f13;
        this.f98477n = i16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f98472i;
        Object obj2 = this.f98479p;
        Object obj3 = this.f98478o;
        switch (i13) {
            case 0:
                q3.b1 b1Var = (q3.b1) obj;
                boolean z13 = ((q3.a) obj3) instanceof q3.q;
                int i14 = this.f98475l;
                int i15 = this.f98473j;
                float f13 = this.f98476m;
                int i16 = z13 ? 0 : !n4.e.a(f13, Float.NaN) ? i15 : (this.f98474k - i14) - ((q3.c1) obj2).f102178a;
                if (!z13) {
                    i15 = 0;
                } else if (n4.e.a(f13, Float.NaN)) {
                    i15 = (this.f98477n - i14) - ((q3.c1) obj2).f102179b;
                }
                q3.b1.f(b1Var, (q3.c1) obj2, i16, i15);
                return Unit.f80348a;
            default:
                y01.h0 it = (y01.h0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return y01.h0.e(it, null, new y01.c0(this.f98473j, this.f98474k, (Integer) ((kotlin.jvm.internal.j0) obj3).f80434a, (Integer) ((kotlin.jvm.internal.j0) obj2).f80434a, this.f98475l, this.f98476m, this.f98477n), 1);
        }
    }
}
