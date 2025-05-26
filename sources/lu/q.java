package lu;

import android.content.Context;
import kh2.m2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84927i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vt.r f84928j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f84929k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, vt.r rVar) {
        super(1);
        this.f84929k = sVar;
        this.f84928j = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84927i;
        s sVar = this.f84929k;
        vt.r rVar = this.f84928j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = sVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return rn1.a.y(it, bs1.c.h2(m2.C0(context, sVar.f84949u, ((vt.l) rVar).f126608g)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String str = ((vt.l) rVar).f126603b;
                if (str == null) {
                    str = sVar.getContext().getString(ps.s.ads_quiz_visit_site);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                }
                return yl1.b.f(it2, bs1.c.h2(str), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(vt.r rVar, s sVar) {
        super(1);
        this.f84928j = rVar;
        this.f84929k = sVar;
    }
}
