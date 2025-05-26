package hr;

import com.pinterest.api.model.wy0;
import jf2.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import lb2.n;
import m60.w;
import mf0.l;
import or1.e;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69970i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f69971j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f69972k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, wy0 wy0Var, int i13) {
        super(1);
        this.f69970i = i13;
        this.f69971j = cVar;
        this.f69972k = wy0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f69970i;
        wy0 wy0Var = this.f69972k;
        c cVar = this.f69971j;
        switch (i13) {
            case 0:
                ((w) cVar.f75875d).d(new of0.a(new l()));
                n nVar = (n) cVar.f75872a;
                or1.c cVar2 = or1.c.SWITCH_ACCOUNT;
                e eVar = e.ATTEMPT;
                or1.b.Companion.getClass();
                nVar.h(cVar2, eVar, or1.a.a(wy0Var), null);
                break;
            default:
                n nVar2 = (n) cVar.f75872a;
                or1.c cVar3 = or1.c.SWITCH_ACCOUNT;
                e eVar2 = e.FAILURE;
                or1.b.Companion.getClass();
                nVar2.h(cVar3, eVar2, or1.a.a(wy0Var), (Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
