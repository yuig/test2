package ro0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.my0;

/* loaded from: classes5.dex */
public final class c extends rk2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f108938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f108939c;

    public /* synthetic */ c(g gVar, int i13) {
        this.f108938b = i13;
        this.f108939c = gVar;
    }

    @Override // uj2.v
    public final void a() {
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int i13 = this.f108938b;
        e eVar = this.f108939c;
        switch (i13) {
            case 0:
                f30 f30Var = (f30) obj;
                if (eVar.f108942c == null) {
                    eVar.f108942c = f30Var;
                    break;
                }
                break;
            default:
                my0 my0Var = (my0) obj;
                String str = my0Var.f40258a;
                if (!str.equalsIgnoreCase("blocked") && !str.equalsIgnoreCase("block")) {
                    String str2 = my0Var.f40258a;
                    if (!str2.equalsIgnoreCase("suspicious") && !str2.equalsIgnoreCase("warn")) {
                        eVar.f108952m = true;
                        eVar.s3();
                        break;
                    }
                }
                eVar.f108952m = false;
                ((to0.g) ((po0.d) eVar.getView())).f118670x0.d(new of0.a(new pp.c()));
                break;
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
    }
}
