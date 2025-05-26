package nm1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91442i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f91443j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l lVar, int i13) {
        super(1);
        this.f91442i = i13;
        this.f91443j = lVar;
    }

    public final cn1.d b(cn1.d state) {
        int i13 = this.f91442i;
        l lVar = this.f91443j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                dn1.e eVar = dn1.e.END_ACTION_BUTTONS_CUSTOM;
                n nVar = ((g) lVar).f91428a;
                rm1.q qVar = nVar.f91449a;
                om1.f fVar = om1.f.TRANSPARENT_DARK_GRAY;
                u50.i0 i0Var = nVar.f91450b;
                if (i0Var == null) {
                    i0Var = new u50.k0(h1.content_description_icon_button_default);
                }
                return cn1.d.e(state, null, null, null, null, null, null, null, eVar, null, new cn1.c(qVar, fVar, i0Var, dn1.a.END_ACTION_BUTTONS_ONE, 16), null, 424959);
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                dn1.e eVar2 = dn1.e.END_ACTION_BUTTONS_CUSTOM;
                e eVar3 = (e) lVar;
                n nVar2 = eVar3.f91412a;
                rm1.q qVar2 = nVar2.f91449a;
                om1.f fVar2 = om1.f.TRANSPARENT_DARK_GRAY;
                u50.i0 i0Var2 = nVar2.f91450b;
                if (i0Var2 == null) {
                    i0Var2 = new u50.k0(h1.content_description_icon_button_default);
                }
                cn1.c cVar = new cn1.c(qVar2, fVar2, i0Var2, dn1.a.END_ACTION_BUTTONS_ONE, 16);
                n nVar3 = eVar3.f91413b;
                rm1.q qVar3 = nVar3.f91449a;
                u50.i0 i0Var3 = nVar3.f91450b;
                if (i0Var3 == null) {
                    i0Var3 = new u50.k0(h1.content_description_icon_button_default);
                }
                return cn1.d.e(state, null, null, null, null, null, null, null, eVar2, null, cVar, new cn1.c(qVar3, fVar2, i0Var3, dn1.a.END_ACTION_BUTTONS_TWO, 16), 424959);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f91442i) {
        }
        return b((cn1.d) obj);
    }
}
