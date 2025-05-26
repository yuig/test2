package zv;

import android.content.Context;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142830i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f142831j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(1);
        this.f142830i = i13;
        this.f142831j = eVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f142830i;
        e eVar = this.f142831j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String string = eVar.j().u3();
                Intrinsics.checkNotNullParameter(string, "string");
                f0 f0Var = new f0(string);
                Context context = eVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                vn1.g gVar = dl2.b.T1(context) ? vn1.g.UI_100 : vn1.g.BODY_100;
                Context context2 = eVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return rn1.a.y(it, f0Var, null, null, e0.b(dl2.b.T1(context2) ? vn1.e.REGULAR : vn1.e.BOLD), gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String string2 = eVar.j().t3();
                Intrinsics.checkNotNullParameter(string2, "string");
                f0 f0Var2 = new f0(string2);
                Context context3 = eVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                vn1.g gVar2 = dl2.b.T1(context3) ? vn1.g.UI_100 : vn1.g.BODY_100;
                Context context4 = eVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                return rn1.a.y(it, f0Var2, null, null, e0.b(dl2.b.T1(context4) ? vn1.e.REGULAR : vn1.e.BOLD), gVar2, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f142830i) {
        }
        return b((rn1.a) obj);
    }
}
