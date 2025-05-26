package da2;

import h32.a4;
import h32.d4;
import h32.g0;
import nx.f0;

/* loaded from: classes4.dex */
public final class e extends uk1.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f54240g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g f54241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, f0 f0Var, int i13) {
        super(f0Var);
        this.f54240g = i13;
        this.f54241h = gVar;
    }

    @Override // uk1.d
    public final g0 f() {
        return null;
    }

    @Override // uk1.d
    public final a4 i() {
        switch (this.f54240g) {
            case 0:
                return this.f54241h.f54245a ? a4.SHOPPING_DOT_FEED : a4.SHOPPING_RELATED_PRODUCTS_FEED;
            default:
                return a4.SHOPPING_PRODUCT_FILTER;
        }
    }

    @Override // uk1.d
    public final d4 j() {
        int i13 = this.f54240g;
        g gVar = this.f54241h;
        switch (i13) {
            case 0:
                if (!gVar.f54246b) {
                    if (!gVar.f54245a) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (!gVar.f54246b) {
                    if (!gVar.f54245a) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return d4.FLASHLIGHT;
    }
}
