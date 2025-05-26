package hr;

import com.pinterest.api.model.wy0;
import jf2.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import lb2.n;
import mo1.d;
import or1.e;

/* loaded from: classes3.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69973i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f69974j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(1);
        this.f69973i = i13;
        this.f69974j = cVar;
    }

    public final void b(wy0 wy0Var) {
        int i13 = this.f69973i;
        c cVar = this.f69974j;
        switch (i13) {
            case 0:
                n nVar = (n) cVar.f75872a;
                or1.c cVar2 = or1.c.SWITCH_ACCOUNT;
                e eVar = e.SUCCESS;
                or1.b.Companion.getClass();
                nVar.h(cVar2, eVar, or1.a.a(wy0Var), null);
                break;
            default:
                d.a((d) cVar.f75877f, false, null, null, null, 15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f69973i) {
            case 0:
                b((wy0) obj);
                break;
            default:
                b((wy0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
