package mm2;

import am2.r0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87636i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f87637j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ gm2.w f87638k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.j0 f87639l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(c0 c0Var, gm2.w wVar, kotlin.jvm.internal.j0 j0Var, int i13) {
        super(0);
        this.f87636i = i13;
        this.f87637j = c0Var;
        this.f87638k = wVar;
        this.f87639l = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f87636i;
        kotlin.jvm.internal.j0 j0Var = this.f87639l;
        gm2.w field = this.f87638k;
        c0 c0Var = this.f87637j;
        switch (i13) {
            case 0:
                jm2.i iVar = ((lm2.a) c0Var.f87643b.f107929a).f83938h;
                r0 descriptor = (r0) j0Var.f80434a;
                ((jm2.h) iVar).getClass();
                Intrinsics.checkNotNullParameter(field, "field");
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return null;
            default:
                on2.u c13 = c0Var.f87643b.c();
                a0 a0Var = new a0(c0Var, field, j0Var, 0);
                on2.q qVar = (on2.q) c13;
                qVar.getClass();
                return new on2.j(qVar, a0Var);
        }
    }
}
