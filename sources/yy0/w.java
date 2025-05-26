package yy0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140480i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f140481j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f140482k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Function1 function1, d dVar) {
        super(1);
        this.f140482k = function1;
        this.f140481j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f140480i;
        Function1 function1 = this.f140482k;
        d dVar = this.f140481j;
        switch (i13) {
            case 0:
                xl1.b it = (xl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(new e(dVar.f140436f));
                break;
            default:
                r1.e0 LazyVerticalGrid = (r1.e0) obj;
                Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                x xVar = x.f140483j;
                i1.h hVar = new i1.h(dVar, 15);
                Object obj2 = q2.i.f102113a;
                r1.e0.b(LazyVerticalGrid, xVar, new q2.h(hVar, true, 1316504057));
                if (dVar.f140435e) {
                    r1.e0.b(LazyVerticalGrid, x.f140484k, b.f140424a);
                }
                x xVar2 = x.f140485l;
                List list = dVar.f140431a;
                ((r1.l) LazyVerticalGrid).s(list.size(), null, null, new u80.s(11, list, xVar2), new q2.h(new tc0.k(2, list, function1), true, 699646206));
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d dVar, Function1 function1) {
        super(1);
        this.f140481j = dVar;
        this.f140482k = function1;
    }
}
