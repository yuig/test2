package cb2;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f27292j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f27293k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f27294l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f27295m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f27296n = new b(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27297i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f27297i = i13;
    }

    public final rn1.a b(rn1.a displayState) {
        switch (this.f27297i) {
            case 1:
                Intrinsics.checkNotNullParameter(displayState, "it");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f108849g;
                List alignment = e0.b(vn1.b.END);
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                return new rn1.a(i0Var, displayState.f108850h, alignment, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            case 2:
                Intrinsics.checkNotNullParameter(displayState, "it");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var2 = displayState.f108849g;
                List alignment2 = e0.b(vn1.b.START);
                Intrinsics.checkNotNullParameter(alignment2, "alignment");
                return new rn1.a(i0Var2, displayState.f108850h, alignment2, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            default:
                Intrinsics.checkNotNullParameter(displayState, "it");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var3 = displayState.f108849g;
                fm1.c visibility = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                return new rn1.a(i0Var3, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, visibility, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f27297i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            case 3:
                return b((rn1.a) obj);
            default:
                return Unit.f80348a;
        }
    }
}
