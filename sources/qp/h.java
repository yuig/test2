package qp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;
import u50.k0;

/* loaded from: classes3.dex */
public final class h extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f104683j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f104684k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f104685l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f104686m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f104687n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f104688o = new h(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104689i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f104689i = i13;
    }

    public final em1.d b(em1.d displayState) {
        switch (this.f104689i) {
            case 0:
                Intrinsics.checkNotNullParameter(displayState, "it");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                em1.b bVar = displayState.f59598a;
                em1.b checkedState = em1.b.UNCHECKED;
                Intrinsics.checkNotNullParameter(checkedState, "checkedState");
                return new em1.d(checkedState, displayState.f59599b, displayState.f59600c, displayState.f59601d, displayState.f59602e, displayState.f59603f, displayState.f59604g, displayState.f59605h, displayState.f59606i, displayState.f59607j);
            default:
                Intrinsics.checkNotNullParameter(displayState, "it");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                em1.b bVar2 = displayState.f59598a;
                em1.b checkedState2 = em1.b.CHECKED;
                Intrinsics.checkNotNullParameter(checkedState2, "checkedState");
                return new em1.d(checkedState2, displayState.f59599b, displayState.f59600c, displayState.f59601d, displayState.f59602e, displayState.f59603f, displayState.f59604g, displayState.f59605h, displayState.f59606i, displayState.f59607j);
        }
    }

    public final rn1.a e(rn1.a displayState) {
        switch (this.f104689i) {
            case 2:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var = displayState.f108849g;
                k0 text = bs1.c.j2(new String[0], yy1.e.create_select_another_title);
                Intrinsics.checkNotNullParameter(text, "text");
                return new rn1.a(text, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            case 3:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var2 = displayState.f108849g;
                k0 text2 = bs1.c.j2(new String[0], yy1.e.create_select_title);
                Intrinsics.checkNotNullParameter(text2, "text");
                return new rn1.a(text2, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            case 4:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var3 = displayState.f108849g;
                k0 text3 = bs1.c.j2(new String[0], yy1.e.create_select_multiple_title);
                Intrinsics.checkNotNullParameter(text3, "text");
                return new rn1.a(text3, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            default:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                i0 i0Var4 = displayState.f108849g;
                k0 text4 = bs1.c.j2(new String[0], yy1.e.create_select_title);
                Intrinsics.checkNotNullParameter(text4, "text");
                return new rn1.a(text4, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f104689i) {
        }
        return e((rn1.a) obj);
    }
}
