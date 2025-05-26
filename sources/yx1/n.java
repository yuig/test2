package yx1;

import com.pinterest.api.model.f30;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140381i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f140382j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ uj2.r f140383k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f30 f140384l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, fk2.f fVar, f30 f30Var, int i13) {
        super(1);
        this.f140381i = i13;
        this.f140382j = pVar;
        this.f140383k = fVar;
        this.f140384l = f30Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f140381i;
        uj2.r rVar = this.f140383k;
        f30 f30Var = this.f140384l;
        p pVar = this.f140382j;
        switch (i13) {
            case 0:
                f30 f30Var2 = (f30) obj;
                e eVar = (e) pVar.getView();
                Date U3 = f30Var2.U3();
                if (U3 == null) {
                    U3 = f30Var2.G6();
                }
                ((j) eVar).e8(new w(U3));
                fk2.f fVar = (fk2.f) rVar;
                fVar.c(new cy1.e(f30Var, f30Var2.U3()));
                fVar.b();
                break;
            default:
                ((j) ((e) pVar.getView())).e8(v.f140413b);
                fk2.f fVar2 = (fk2.f) rVar;
                fVar2.c(new cy1.e(f30Var, pVar.f140397l));
                fVar2.b();
                break;
        }
        return Unit.f80348a;
    }
}
