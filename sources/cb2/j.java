package cb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f27332j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f27333k = new j(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27334i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f27334i = i13;
    }

    public final rn1.a b(rn1.a displayState) {
        switch (this.f27334i) {
            case 0:
                Intrinsics.checkNotNullParameter(displayState, "it");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f108849g;
                vn1.g variant = vn1.g.HEADING_XL;
                Intrinsics.checkNotNullParameter(variant, "variant");
                fm1.c visibility = fm1.c.INVISIBLE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                Object[] objArr = {vn1.e.BOLD};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                List style = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullExpressionValue(style, "of(...)");
                Intrinsics.checkNotNullParameter(style, "style");
                return new rn1.a(i0Var, displayState.f108850h, displayState.f108851i, style, variant, displayState.f108854l, visibility, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            default:
                Intrinsics.checkNotNullParameter(displayState, "it");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var2 = displayState.f108849g;
                fm1.c visibility2 = fm1.c.GONE;
                Intrinsics.checkNotNullParameter(visibility2, "visibility");
                return new rn1.a(i0Var2, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, visibility2, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f27334i) {
        }
        return b((rn1.a) obj);
    }
}
