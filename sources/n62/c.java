package n62;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m62.t0;
import m62.u0;

/* loaded from: classes4.dex */
public final class c extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89343i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f89344j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, int i13) {
        super(2);
        this.f89343i = i13;
        this.f89344j = gVar;
    }

    public final void b(View view, float f13) {
        int i13 = this.f89343i;
        g gVar = this.f89344j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                gVar.f89362k.invoke(new t0(f13));
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                gVar.f89362k.invoke(new u0(f13));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f89343i) {
            case 0:
                b((View) obj, ((Number) obj2).floatValue());
                break;
            default:
                b((View) obj, ((Number) obj2).floatValue());
                break;
        }
        return Unit.f80348a;
    }
}
