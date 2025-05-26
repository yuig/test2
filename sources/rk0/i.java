package rk0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import tk0.m;

/* loaded from: classes5.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108464i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f108465j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(0);
        this.f108464i = i13;
        this.f108465j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f108464i) {
            case 0:
                m248invoke();
                break;
            default:
                m248invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m248invoke() {
        int i13 = this.f108464i;
        j jVar = this.f108465j;
        switch (i13) {
            case 0:
                jVar.u(jl0.d.VIEW);
                jVar.t(tk0.h.f117967a);
                break;
            default:
                if (jVar.G.isSelectAllBackendToggled()) {
                    jVar.o();
                    jVar.u(jl0.d.ORGANIZE);
                } else {
                    jVar.o();
                    jVar.u(jl0.d.ORGANIZE_SELECT_ALL_BACKEND_TOGGLED);
                    com.pinterest.feature.board.organize.h hVar = jVar.f108470s;
                    if (hVar != null) {
                        jVar.E.addAll(hVar.e3());
                    }
                }
                jVar.n();
                jVar.t(m.f117984a);
                break;
        }
    }
}
