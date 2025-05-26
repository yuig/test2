package ka0;

import com.pinterest.gestalt.tabs.GestaltTabLayout;

/* loaded from: classes5.dex */
public final class i extends ek.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f78905d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nl1.d f78906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(GestaltTabLayout gestaltTabLayout, mv0.t tVar) {
        super(gestaltTabLayout);
        this.f78906e = tVar;
    }

    @Override // ek.f, xa.i
    public final void A5(int i13) {
        nl1.d dVar = this.f78906e;
        switch (this.f78905d) {
            case 0:
                super.A5(i13);
                kh2.j.x2((w) ((j) dVar).f78909d0.getValue(), new c(i13));
                break;
            default:
                super.A5(i13);
                int i14 = mv0.t.f88408u0;
                ((mv0.t) dVar).b8().w(i13, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, GestaltTabLayout gestaltTabLayout) {
        super(gestaltTabLayout);
        this.f78906e = jVar;
    }
}
