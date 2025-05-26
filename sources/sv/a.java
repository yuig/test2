package sv;

import androidx.recyclerview.widget.b2;
import com.pinterest.adsCollageHeroCutout.view.HeroCutoutCarouselView;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class a implements fb2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f115257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeroCutoutCarouselView f115258b;

    public a(e eVar, HeroCutoutCarouselView heroCutoutCarouselView) {
        this.f115257a = eVar;
        this.f115258b = heroCutoutCarouselView;
    }

    @Override // fb2.c
    public final void A(int i13) {
        h hVar;
        b2 b2Var = this.f115258b.f19240m;
        String str = null;
        rv.a aVar = b2Var instanceof rv.a ? (rv.a) b2Var : null;
        if (aVar != null && (hVar = (h) CollectionsKt.U(i13, aVar.f110087e)) != null) {
            str = hVar.f115293a;
        }
        l lVar = new l(i13, str);
        int i14 = e.f115274q0;
        kh2.j.x2((g) this.f115257a.f115285m0.getValue(), lVar);
    }
}
