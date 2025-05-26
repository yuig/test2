package a01;

import b01.l;
import b01.q;
import bs1.c;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h20;
import com.pinterest.api.model.v7;
import com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h20 p03 = (h20) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        b bVar = (b) this.receiver;
        bVar.getClass();
        List A = p03.A();
        if (A == null) {
            A = q0.f80391a;
        }
        bVar.f212d = A;
        q qVar = (q) bVar.getView();
        List pins = bVar.f212d;
        l lVar = (l) qVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(pins, "pins");
        List list = lVar.Y0;
        if (list == null) {
            Intrinsics.r("coverPinCarousels");
            throw null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new ArrayList());
        }
        int i15 = 0;
        for (Object obj2 : pins) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                f0.p();
                throw null;
            }
            ((List) arrayList.get(i15 % size)).add((f30) obj2);
            i15 = i16;
        }
        List list2 = lVar.Y0;
        if (list2 == null) {
            Intrinsics.r("coverPinCarousels");
            throw null;
        }
        for (Object obj3 : list2) {
            int i17 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            AnimatedPinVerticalCarouselView animatedPinVerticalCarouselView = (AnimatedPinVerticalCarouselView) obj3;
            c.U1(animatedPinVerticalCarouselView);
            animatedPinVerticalCarouselView.a((List) arrayList.get(i13));
            animatedPinVerticalCarouselView.c();
            i13 = i17;
        }
        GestaltIconButton gestaltIconButton = ((l) ((q) bVar.getView())).f20748d1;
        if (gestaltIconButton == null) {
            Intrinsics.r("shareButton");
            throw null;
        }
        com.bumptech.glide.c.u1(gestaltIconButton);
        q qVar2 = (q) bVar.getView();
        v7 B = p03.B();
        String boardId = B != null ? B.getUid() : null;
        if (boardId == null) {
            boardId = "";
        }
        l lVar2 = (l) qVar2;
        lVar2.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        lVar2.X0 = boardId;
        return Unit.f80348a;
    }
}
