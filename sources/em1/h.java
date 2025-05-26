package em1;

import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.z;
import u50.i0;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0 f59612i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f59613j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f59614k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ rn1.b f59615l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GestaltCheckBox f59616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i0 i0Var, int i13, boolean z13, rn1.b bVar, GestaltCheckBox gestaltCheckBox) {
        super(1);
        this.f59612i = i0Var;
        this.f59613j = i13;
        this.f59614k = z13;
        this.f59615l = bVar;
        this.f59616m = gestaltCheckBox;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rn1.k bind = (rn1.k) obj;
        Intrinsics.checkNotNullParameter(bind, "$this$bind");
        bind.g(this.f59612i);
        bind.h(vn1.g.BODY_300);
        int i13 = this.f59613j;
        bind.f108891f = i13;
        bind.f108896k = this.f59614k;
        bind.c(i13 > 3 ? this.f59615l : rn1.b.NONE);
        Intrinsics.checkNotNullExpressionValue(this.f59616m.getContext(), "getContext(...)");
        bind.i(d7.b.Z(!z.j(r0.a(r1))));
        return Unit.f80348a;
    }
}
