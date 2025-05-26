package sv;

import com.pinterest.adsCollageHeroCutout.view.HeroCutoutCarouselView;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import java.util.List;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f115260r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f115261s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, bl2.c cVar) {
        super(2, cVar);
        this.f115261s = eVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f115261s, cVar);
        bVar.f115260r = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((i) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        i iVar = (i) this.f115260r;
        e eVar = this.f115261s;
        if (!Intrinsics.d(iVar, eVar.f115287o0)) {
            eVar.f115286n0 = iVar.f115299d;
            if (!iVar.f115296a) {
                GestaltSpinner gestaltSpinner = eVar.f115284l0;
                if (gestaltSpinner == null) {
                    Intrinsics.r("loadingSpinner");
                    throw null;
                }
                s0.w(gestaltSpinner, d.f115271i);
            }
            HeroCutoutCarouselView heroCutoutCarouselView = eVar.f115283k0;
            if (heroCutoutCarouselView == null) {
                Intrinsics.r("cutoutCarousel");
                throw null;
            }
            List list = iVar.f115298c;
            heroCutoutCarouselView.j3(list);
            heroCutoutCarouselView.G2(iVar.f115297b);
            if (list.size() != eVar.f115287o0.f115298c.size()) {
                if (iVar.f115302g) {
                    nx.k kVar = eVar.f115277e0;
                    if (kVar == null) {
                        Intrinsics.r("collageAdsLogger");
                        throw null;
                    }
                    String Y7 = eVar.Y7();
                    if (eVar.f115276d0 == null) {
                        Intrinsics.r("clock");
                        throw null;
                    }
                    nx.k.c(kVar, Y7, false, null, System.currentTimeMillis() - eVar.f115280h0, false, false, 48);
                } else {
                    int size = list.size();
                    nx.k kVar2 = eVar.f115277e0;
                    if (kVar2 == null) {
                        Intrinsics.r("collageAdsLogger");
                        throw null;
                    }
                    String Y72 = eVar.Y7();
                    if (eVar.f115276d0 == null) {
                        Intrinsics.r("clock");
                        throw null;
                    }
                    nx.k.c(kVar2, Y72, true, Integer.valueOf(size), System.currentTimeMillis() - eVar.f115280h0, true, false, 32);
                }
            }
            eVar.f115287o0 = iVar;
        }
        return Unit.f80348a;
    }
}
