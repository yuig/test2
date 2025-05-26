package id0;

import android.content.Context;
import android.os.Bundle;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.c1;
import hd0.f;
import hd0.g;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import ku1.l;
import ug0.i;

/* loaded from: classes5.dex */
public final /* synthetic */ class b extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72126a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, int i13) {
        super(1, obj, e.class, "logEvent", "logEvent(Lcom/pinterest/creatorHub/feature/logging/CreatorHubEventLogging$CreatorHubLogEvent;)V", 0);
        this.f72126a = i13;
        if (i13 == 1) {
            super(1, obj, e.class, "onRecentIdeaPinActionTapped", "onRecentIdeaPinActionTapped(Lcom/pinterest/api/model/Pin;)V", 0);
            return;
        }
        if (i13 == 2) {
            super(1, obj, e.class, "logEvent", "logEvent(Lcom/pinterest/creatorHub/feature/logging/CreatorHubEventLogging$CreatorHubLogEvent;)V", 0);
            return;
        }
        if (i13 == 3) {
            super(1, obj, e.class, "logEvent", "logEvent(Lcom/pinterest/creatorHub/feature/logging/CreatorHubEventLogging$CreatorHubLogEvent;)V", 0);
        } else if (i13 != 4) {
        } else {
            super(1, obj, e.class, "handleNewsCardActions", "handleNewsCardActions(Lcom/pinterest/creatorHub/feature/hub/domain/NewsCardAction;)V", 0);
        }
    }

    public final void h(md0.a p03) {
        switch (this.f72126a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((e) this.receiver).t3(p03);
                break;
            case 1:
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((e) this.receiver).t3(p03);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((e) this.receiver).t3(p03);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f72126a) {
            case 0:
                h((md0.a) obj);
                return Unit.f80348a;
            case 1:
                f30 ideaPin = (f30) obj;
                Intrinsics.checkNotNullParameter(ideaPin, "p0");
                e eVar = (e) this.receiver;
                fd0.b bVar = (fd0.b) eVar.getView();
                wy0 f13 = ((b60.d) ((b60.b) eVar.f72129b.f16875b)).f();
                boolean d2 = f13 != null ? Intrinsics.d(f13.G3(), Boolean.TRUE) : false;
                kd0.b bVar2 = (kd0.b) bVar;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(ideaPin, "ideaPin");
                Bundle bundle = new Bundle();
                bundle.putString("PIN_ID", ideaPin.getUid());
                bundle.putBoolean("IS_A_PARTNER", d2);
                bVar2.M1(Navigation.v1(c1.e(), bundle));
                md0.a aVar = md0.a.RECENT_PIN_STATS_TAPPED;
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("pin_id", ideaPin.getUid());
                aVar.setAuxData(hashMap);
                eVar.t3(aVar);
                return Unit.f80348a;
            case 2:
                h((md0.a) obj);
                return Unit.f80348a;
            case 3:
                h((md0.a) obj);
                return Unit.f80348a;
            default:
                f p03 = (f) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                e eVar2 = (e) this.receiver;
                eVar2.getClass();
                boolean z13 = p03 instanceof hd0.c;
                tg0.d sideEffect = tg0.d.f117578b;
                gd0.f fVar = eVar2.f72137j;
                if (z13) {
                    hd0.c cVar = (hd0.c) p03;
                    g gVar = cVar.f68850a;
                    i.d(eVar2.f72130c, gVar.f68856d, gVar.f68855c, null, sideEffect, 20);
                    g gVar2 = cVar.f68850a;
                    String str = gVar2.f68859g;
                    kd0.b bVar3 = (kd0.b) ((fd0.b) eVar2.getView());
                    nu1.a aVar2 = bVar3.A0;
                    if (aVar2 == null) {
                        Intrinsics.r("inAppNavigator");
                        throw null;
                    }
                    if (!nu1.a.c(aVar2, str, null, null, false, 30)) {
                        l lVar = bVar3.B0;
                        if (lVar == null) {
                            Intrinsics.r("uriNavigator");
                            throw null;
                        }
                        Context requireContext = bVar3.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        l.b(lVar, requireContext, str, false, true, null, null, RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER);
                    }
                    fVar.v(gVar2);
                } else {
                    boolean z14 = p03 instanceof hd0.d;
                    i iVar = eVar2.f72130c;
                    if (z14) {
                        hd0.d dVar = (hd0.d) p03;
                        g gVar3 = dVar.f68851a;
                        String placementId = gVar3.f68856d;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(placementId, "placementId");
                        String experienceId = gVar3.f68855c;
                        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
                        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
                        iVar.e(placementId, experienceId, null, sideEffect, null);
                        fVar.v(dVar.f68851a);
                    } else if (p03 instanceof hd0.e) {
                        g gVar4 = ((hd0.e) p03).f68852a;
                        String placementId2 = gVar4.f68856d;
                        iVar.getClass();
                        Intrinsics.checkNotNullParameter(placementId2, "placementId");
                        String experienceId2 = gVar4.f68855c;
                        Intrinsics.checkNotNullParameter(experienceId2, "experienceId");
                        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
                        iVar.l(placementId2, experienceId2, null, null);
                    }
                }
                return Unit.f80348a;
        }
    }
}
