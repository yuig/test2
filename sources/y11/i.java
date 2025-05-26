package y11;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f136647i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Integer f136648j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f136649k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Integer f136650l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Integer f136651m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f136652n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f136653o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Integer num, Integer num2, int i13, Integer num3, Integer num4, String str, int i14) {
        super(1);
        this.f136647i = num;
        this.f136648j = num2;
        this.f136649k = i13;
        this.f136650l = num3;
        this.f136651m = num4;
        this.f136652n = str;
        this.f136653o = i14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ao1.b state = (ao1.b) obj;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z13 = this.f136647i != null;
        i0 i0Var = h0.f120562a;
        Integer num = this.f136648j;
        i0 j23 = num != null ? bs1.c.j2(new String[0], num.intValue()) : i0Var;
        k0 j24 = bs1.c.j2(new String[0], this.f136649k);
        Integer num2 = this.f136650l;
        if (num2 != null) {
            i0Var = bs1.c.j2(new String[0], num2.intValue());
        }
        i0 i0Var2 = i0Var;
        Integer num3 = this.f136651m;
        int intValue = num3 != null ? num3.intValue() : 0;
        String str = this.f136652n;
        if (str == null) {
            str = "";
        }
        return ao1.b.e(state, new f0(str), i0Var2, j23, j24, null, false, 1, intValue, this.f136653o, z13, false, false, null, false, null, null, null, null, null, 0, 4192360);
    }
}
