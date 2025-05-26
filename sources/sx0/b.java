package sx0;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import px0.i;
import x02.w1;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115617i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f115618j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, int i13) {
        super(1);
        this.f115617i = i13;
        this.f115618j = gVar;
    }

    public final Boolean b(int i13) {
        int i14 = this.f115617i;
        g gVar = this.f115618j;
        switch (i14) {
            case 2:
                i iVar = gVar.L0;
                if (iVar != null && iVar.f101612g.getItem(i13) != null) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                return Boolean.valueOf(gVar.L0 != null);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f115617i;
        g gVar = this.f115618j;
        switch (i13) {
            case 0:
                String string = gVar.getString(((Number) obj).intValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                break;
            case 1:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                i iVar = gVar.L0;
                if (iVar != null) {
                    w12.a newsType = w12.a.None;
                    w1 w1Var = iVar.f101606a;
                    w1Var.getClass();
                    Intrinsics.checkNotNullParameter(newsType, "newsType");
                    w1Var.f131517a = newsType;
                    w1Var.f131518b.c(newsType);
                }
                break;
        }
        return b(((Number) obj).intValue());
    }
}
