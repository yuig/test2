package ew1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;

/* loaded from: classes4.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60348i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a11.d f60349j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ uk1.e f60350k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(a11.d dVar, uk1.e eVar, int i13) {
        super(0);
        this.f60348i = i13;
        this.f60349j = dVar;
        this.f60350k = eVar;
    }

    public final a11.e b() {
        int i13 = this.f60348i;
        a11.d dVar = this.f60349j;
        uk1.e eVar = this.f60350k;
        switch (i13) {
            case 0:
                d0 d0Var = ((uk1.a) eVar).g().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                return dVar.a(d0Var);
            default:
                d0 d0Var2 = ((uk1.a) eVar).g().f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                return dVar.a(d0Var2);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f60348i) {
        }
        return b();
    }
}
