package ga1;

import df.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64626i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f64627j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(p pVar, int i13) {
        super(1);
        this.f64626i = i13;
        this.f64627j = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f64626i;
        p pVar = this.f64627j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence a03 = j1.a0(pVar.requireContext().getString(b52.c.learn_more_about_imports, "https://help.pinterest.com/article/claim-your-account#:~:text=You%20can%20import%20up%20to%20150%20Instagram%20posts%20per%20day%20to%20Pinterest"));
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                return rn1.a.y(it, bs1.c.h2(a03), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
            default:
                an1.q event = (an1.q) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof an1.p) {
                    int i14 = ((an1.p) event).f15758c;
                    e82.u uVar = i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 3 ? e82.u.NONE : e82.u.NONE : e82.u.YEAR : e82.u.HALF_YEAR : e82.u.QUARTER;
                    int i15 = p.f64637p0;
                    pVar.Z7().f64663f.e().a(new c(uVar));
                }
                return Unit.f80348a;
        }
    }
}
