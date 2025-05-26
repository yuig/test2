package w01;

import android.os.Handler;
import com.pinterest.activity.pin.view.modules.PinCloseupLegoActionButtonModule;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import com.pinterest.feature.pin.closeup.view.PinCloseupFloatingActionBarModule;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import df.j1;
import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127101i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinCloseupPresenter f127102j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(PinCloseupPresenter pinCloseupPresenter, int i13) {
        super(1);
        this.f127101i = i13;
        this.f127102j = pinCloseupPresenter;
    }

    public final void b(f30 f30Var) {
        f30 f30Var2;
        f30 f30Var3;
        f30 f30Var4;
        com.pinterest.feature.pin.closeup.datasource.j jVar;
        j01.b bVar;
        com.pinterest.feature.pin.closeup.datasource.j jVar2;
        j01.b bVar2;
        es.h hVar;
        f30 f30Var5;
        m60.w wVar;
        ls1.e eVar;
        es.h hVar2;
        lh0.d dVar;
        b60.b bVar3;
        boolean shouldRefreshExperience;
        Handler handler;
        int i13 = this.f127101i;
        ArrayList arrayList = null;
        PinCloseupPresenter pinCloseupPresenter = this.f127102j;
        switch (i13) {
            case 3:
                if (f30Var != null) {
                    pinCloseupPresenter.logPinLoadCacheEvent(f1.CLOSEUP_PIN_LOAD_CACHE_HIT);
                }
                if (pinCloseupPresenter.isBound()) {
                    f30Var2 = pinCloseupPresenter.pin;
                    if (f30Var2 == null) {
                        Intrinsics.f(f30Var);
                        pinCloseupPresenter.updatePin(f30Var);
                        f30Var3 = pinCloseupPresenter.pin;
                        if (f30Var3 != null) {
                            hVar = pinCloseupPresenter.adsCommonDisplay;
                            if (((es.v) hVar).M(f30Var3)) {
                                f30Var5 = pinCloseupPresenter.pin;
                                if (f30Var5 != null) {
                                    hVar2 = pinCloseupPresenter.adsCommonDisplay;
                                    dVar = pinCloseupPresenter.adFormatsLibraryExperiments;
                                    arrayList = ((es.v) hVar2).t(f30Var5, dVar);
                                }
                                pinCloseupPresenter.pinChipEvent = new ls1.e(arrayList, true);
                                wVar = pinCloseupPresenter.eventManager;
                                eVar = pinCloseupPresenter.pinChipEvent;
                                wVar.f(eVar);
                            }
                        }
                        f30Var4 = pinCloseupPresenter.pin;
                        if (f30Var4 != null) {
                            if (!j1.F1(f30Var4)) {
                                jVar = pinCloseupPresenter.moduleList;
                                bVar = pinCloseupPresenter.closeupConfig;
                                jVar.u(bVar.a(f30Var4, false));
                                break;
                            } else {
                                jVar2 = pinCloseupPresenter.moduleList;
                                bVar2 = pinCloseupPresenter.pdpCloseupConfig;
                                jVar2.u(bVar2.a(f30Var4, false));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                Intrinsics.f(f30Var);
                bVar3 = pinCloseupPresenter.activeUserManager;
                wy0 f13 = ((b60.d) bVar3).f();
                if (rl2.g0.V(f30Var, f13 != null ? f13.getUid() : null)) {
                    PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) PinCloseupPresenter.access$getView(pinCloseupPresenter);
                    PinCloseupLegoActionButtonModule pinCloseupLegoActionButtonModule = pinCloseupFragment.f47015p2;
                    if (pinCloseupLegoActionButtonModule != null) {
                        pinCloseupLegoActionButtonModule.e();
                    }
                    PinCloseupFloatingActionBarModule pinCloseupFloatingActionBarModule = pinCloseupFragment.f47017q2;
                    if (pinCloseupFloatingActionBarModule != null) {
                        pinCloseupFloatingActionBarModule.d();
                    }
                    ((PinCloseupFragment) PinCloseupPresenter.access$getView(pinCloseupPresenter)).O9(f30Var);
                    shouldRefreshExperience = pinCloseupPresenter.shouldRefreshExperience(f30Var);
                    if (shouldRefreshExperience) {
                        handler = pinCloseupPresenter.getHandler();
                        handler.postDelayed(new i(pinCloseupPresenter, 1), 1000L);
                        break;
                    }
                }
                break;
        }
    }

    public final void e(wt1.c0 c0Var) {
        com.pinterest.feature.pin.closeup.datasource.k relatedModulesFetchedList;
        lh0.a0 a0Var;
        wk1.c cVar;
        int i13 = this.f127101i;
        PinCloseupPresenter pinCloseupPresenter = this.f127102j;
        switch (i13) {
            case 6:
                relatedModulesFetchedList = pinCloseupPresenter.getRelatedModulesFetchedList();
                relatedModulesFetchedList.clear();
                break;
            default:
                a0Var = pinCloseupPresenter.experiments;
                if (!a0Var.N()) {
                    cVar = pinCloseupPresenter.parameters;
                    ky.e eVar = cVar.f130135f;
                    eVar.b(true);
                    eVar.d();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String errorText;
        boolean isValidCachedPin;
        com.pinterest.feature.pin.closeup.datasource.j jVar;
        String str;
        int i13 = this.f127101i;
        boolean z13 = false;
        PinCloseupPresenter pinCloseupPresenter = this.f127102j;
        switch (i13) {
            case 0:
                pinCloseupPresenter.refreshForPlacement();
                return Unit.f80348a;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        i01.t access$getView = PinCloseupPresenter.access$getView(pinCloseupPresenter);
                        String localizedMessage = th3.getLocalizedMessage();
                        errorText = localizedMessage != null ? localizedMessage : "Unable to load user";
                        PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) access$getView;
                        pinCloseupFragment.getClass();
                        Intrinsics.checkNotNullParameter(errorText, "errorText");
                        se2.a aVar = pinCloseupFragment.Z0;
                        if (aVar == null) {
                            Intrinsics.r("toastUtils");
                            throw null;
                        }
                        ((i92.k) ((bf2.b) aVar).get()).i(errorText);
                        break;
                    default:
                        pinCloseupPresenter.onCacheMiss();
                        break;
                }
                return Unit.f80348a;
            case 2:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                isValidCachedPin = pinCloseupPresenter.isValidCachedPin(it);
                return Boolean.valueOf(isValidCachedPin);
            case 3:
                b((f30) obj);
                return Unit.f80348a;
            case 4:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        i01.t access$getView2 = PinCloseupPresenter.access$getView(pinCloseupPresenter);
                        String localizedMessage2 = th4.getLocalizedMessage();
                        errorText = localizedMessage2 != null ? localizedMessage2 : "Unable to load user";
                        PinCloseupFragment pinCloseupFragment2 = (PinCloseupFragment) access$getView2;
                        pinCloseupFragment2.getClass();
                        Intrinsics.checkNotNullParameter(errorText, "errorText");
                        se2.a aVar2 = pinCloseupFragment2.Z0;
                        if (aVar2 == null) {
                            Intrinsics.r("toastUtils");
                            throw null;
                        }
                        ((i92.k) ((bf2.b) aVar2).get()).i(errorText);
                        break;
                    default:
                        pinCloseupPresenter.onCacheMiss();
                        break;
                }
                return Unit.f80348a;
            case 5:
                Boolean bool = (Boolean) obj;
                Intrinsics.f(bool);
                if (bool.booleanValue()) {
                    jVar = pinCloseupPresenter.moduleList;
                    if (!jVar.f46948r) {
                        pinCloseupPresenter.getDataSourceRegistry().d();
                    }
                }
                return Unit.f80348a;
            case 6:
                e((wt1.c0) obj);
                return Unit.f80348a;
            case 7:
                e((wt1.c0) obj);
                return Unit.f80348a;
            case 8:
                gb2.i it2 = (gb2.i) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.f64755c.compareTo(wa2.o.UI_ONLY) > 0) {
                    str = pinCloseupPresenter.pinUid;
                    if (Intrinsics.d(it2.f64753a, str)) {
                        wa2.p pVar = wa2.p.STATE_HIDDEN;
                        wa2.p pVar2 = it2.f64754b;
                        if (pVar2 == pVar || pVar2 == wa2.p.STATE_HIDDEN_CREATOR || pVar2 == wa2.p.STATE_FILTER_PIN || pVar2 == wa2.p.STATE_REPORTED || pVar2 == wa2.p.STATE_UNFOLLOWED_USER || pVar2 == wa2.p.STATE_UNFOLLOWED_INTEREST || pVar2 == wa2.p.STATE_UNFOLLOWED_BOARD || pVar2 == wa2.p.STATE_HIDDEN_WEIGHT_LOSS_AD) {
                            z13 = true;
                        }
                    }
                }
                return Boolean.valueOf(z13);
            case 9:
                ((PinCloseupFragment) PinCloseupPresenter.access$getView(pinCloseupPresenter)).P7();
                return Unit.f80348a;
            case 10:
                b((f30) obj);
                return Unit.f80348a;
            case 11:
                List it3 = (List) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                List d2 = pinCloseupPresenter.getActiveRelatedPagedList().d();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : d2) {
                    if (obj2 instanceof f30) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((dl1.s) it4.next()).getUid());
                }
                ArrayList H0 = CollectionsKt.H0(arrayList2);
                gb2.f fVar = gb2.f.f64747a;
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = H0.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    if (Intrinsics.d((String) next, ((gb2.l) d7.b.j0(it3)).a())) {
                        arrayList3.add(next);
                    }
                }
                if (arrayList3.size() != 1) {
                    return new ArrayList();
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = H0.iterator();
                int i14 = 0;
                while (it6.hasNext()) {
                    Object next2 = it6.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    String str2 = (String) next2;
                    int i16 = -1;
                    int i17 = 0;
                    for (Object obj3 : it3) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        gb2.l lVar = (gb2.l) obj3;
                        if (Intrinsics.d(lVar.a(), str2)) {
                            arrayList4.add(new Pair(Integer.valueOf(i14), lVar));
                            i16 = i17;
                        }
                        i17 = i18;
                    }
                    if (i16 > 0) {
                        it3.remove(i16);
                    }
                    it3.isEmpty();
                    i14 = i15;
                }
                return arrayList4;
            default:
                List<Pair> list = (List) obj;
                Intrinsics.f(list);
                for (Pair pair : list) {
                    Object obj4 = pair.f80346a;
                    gb2.k update = (gb2.k) pair.f80347b;
                    int intValue = ((Number) obj4).intValue();
                    dl1.s item = pinCloseupPresenter.getRelatedPinsPagedList().getItem(intValue);
                    if (item != null) {
                        com.pinterest.feature.pin.closeup.datasource.l relatedPinsPagedList = pinCloseupPresenter.getRelatedPinsPagedList();
                        relatedPinsPagedList.getClass();
                        Intrinsics.checkNotNullParameter(update, "update");
                        relatedPinsPagedList.M.put(update.f64758a, update);
                        pinCloseupPresenter.getRelatedPinsPagedList().u1(intValue, item);
                    }
                }
                return Unit.f80348a;
        }
    }
}
