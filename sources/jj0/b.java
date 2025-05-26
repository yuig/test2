package jj0;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import oj0.g;
import oj0.h;
import tb0.p;
import u60.l;
import vb0.j;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76306i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f76307j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i13) {
        super(0);
        this.f76306i = i13;
        this.f76307j = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f76306i;
        c cVar = this.f76307j;
        switch (i13) {
            case 0:
                j.f125466a.M(cVar.O, "OneTapSaveConfig must be provided in order to use OneTapSaveController", p.BOARD_AND_SECTION_VIEW, new Object[0]);
                h hVar = cVar.O;
                Intrinsics.f(hVar);
                oj0.b bVar = oj0.b.f95357d;
                HashMap hashMap = bVar.f95360c;
                hashMap.put("board_id", cVar.L);
                hashMap.put("is_saved_to_wishlist", "true");
                Unit unit = Unit.f80348a;
                oj0.a aVar = (oj0.a) cVar.S.getValue();
                return new g(hVar.f95387a, hVar.f95388b, cVar.M, hVar.f95389c, cVar.P, hVar.f95390d, bVar, aVar, hVar.f95391e, hVar.f95392f, cVar.Q);
            default:
                return new l(cVar, 3);
        }
    }
}
