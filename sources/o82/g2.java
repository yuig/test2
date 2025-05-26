package o82;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93600i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f93601j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(y0 y0Var, int i13) {
        super(1);
        this.f93600i = i13;
        this.f93601j = y0Var;
    }

    public final i2 b(i2 it) {
        int i13 = this.f93600i;
        y0 y0Var = this.f93601j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return i2.b(it, null, new k(y0Var), 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f93600i) {
            case 0:
                return b((i2) obj);
            case 1:
                y0 it = (y0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                y0 y0Var = this.f93601j;
                List list = y0Var.f93756a;
                t tVar = t.f93712e;
                it.getClass();
                return y0.e(list, tVar, y0Var.f93758c);
            default:
                return b((i2) obj);
        }
    }
}
