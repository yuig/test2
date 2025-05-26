package kx0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81070i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ux0.c f81071j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ux0.c cVar, int i13) {
        super(1);
        this.f81070i = i13;
        this.f81071j = cVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f81070i;
        ux0.c cVar = this.f81071j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, d7.g.q(cVar.getResources(), x0.explore_more_ideas_in_your_home_feed_cta, "getString(...)"), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(bs1.c.f2(cVar, zu1.e.got_to_home)), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f81070i) {
        }
        return b((yl1.b) obj);
    }
}
