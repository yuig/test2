package tn0;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import oj0.g;
import tb0.p;
import u60.l;
import un0.h;
import vb0.j;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118593i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f118594j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(0);
        this.f118593i = i13;
        this.f118594j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f118593i;
        e eVar = this.f118594j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(!((h) eVar.P).B3());
            default:
                j.f125466a.M(eVar.S, "OneTapSaveConfig must be provided in order to use OneTapSaveController", p.BOARD_AND_SECTION_VIEW, new Object[0]);
                oj0.h hVar = eVar.S;
                Intrinsics.f(hVar);
                oj0.b bVar = oj0.b.f95357d;
                HashMap hashMap = bVar.f95360c;
                hashMap.put("board_id", eVar.M);
                hashMap.put("board_section_id", eVar.N);
                hashMap.put("is_saved_to_wishlist", "true");
                Unit unit = Unit.f80348a;
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                return new g(hVar.f95387a, hVar.f95388b, eVar.O, hVar.f95389c, eVar.R, hVar.f95390d, bVar, new l(eVar, 4), hVar.f95391e, hVar.f95392f, eVar.T);
        }
    }
}
