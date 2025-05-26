package ra0;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n4.b f106952i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u50.i f106953j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f106954k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f106955l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j0 f106956m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n4.b bVar, u50.i iVar, float f13, float f14, j0 j0Var) {
        super(1);
        this.f106952i = bVar;
        this.f106953j = iVar;
        this.f106954k = f13;
        this.f106955l = f14;
        this.f106956m = j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        float f13 = this.f106954k;
        n4.b bVar = this.f106952i;
        n0 n0Var = new n0(context, ml2.c.c(bVar.l0(f13)), ml2.c.c(bVar.l0(this.f106955l)), ((Number) this.f106953j.a(context)).intValue());
        n0Var.a(this.f106956m);
        return n0Var;
    }
}
