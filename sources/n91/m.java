package n91;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.h0;
import u50.i0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90049i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f90050j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a aVar, int i13) {
        super(1);
        this.f90049i = i13;
        this.f90050j = aVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f90049i;
        a aVar = this.f90050j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, aVar.f90027c, null, null, null, null, null, null, 0, null, 1021);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, aVar.f90026b, null, null, null, null, null, null, 0, null, 1021);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f90049i;
        a aVar = this.f90050j;
        switch (i13) {
            case 0:
                ln1.l bind = (ln1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(aVar.f90029e ? ln1.e.LOADING : ln1.e.LOADED);
                break;
            case 1:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = b52.c.email_change_verification_code_description;
                String[] formatArgs = {aVar.f90025a};
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new f0(formatArgs[0]));
                break;
            case 2:
                ao1.b it2 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                i0 i0Var = aVar.f90028d;
                i0 i0Var2 = i0Var == null ? h0.f120562a : i0Var;
                if (i0Var == null || (r2 = yn1.f.ERROR) == null) {
                    yn1.f fVar = yn1.f.DEFAULT;
                }
                break;
        }
        return b((yl1.b) obj);
    }
}
