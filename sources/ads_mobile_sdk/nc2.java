package ads_mobile_sdk;

import a.w0;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import ao2.j0;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xk2.s;

/* loaded from: classes2.dex */
public final class nc2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f8750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc2 f8751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8752c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f8754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f8755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vi.a f8756g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc2(Bundle bundle, Bundle bundle2, vi.a aVar, pc2 pc2Var, String str, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f8751b = pc2Var;
        this.f8752c = str;
        this.f8753d = str2;
        this.f8754e = bundle;
        this.f8755f = bundle2;
        this.f8756g = aVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nc2(this.f8754e, this.f8755f, this.f8756g, this.f8751b, this.f8752c, this.f8753d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nc2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        AdFormat adFormat;
        AdSize adSize;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f8750a;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
            return obj;
        }
        ue.c.H(obj);
        pc2 pc2Var = this.f8751b;
        String str = this.f8752c;
        String adType = this.f8753d;
        Bundle requestExtras = this.f8754e;
        Bundle serverExtras = this.f8755f;
        vi.a aVar2 = this.f8756g;
        this.f8750a = 1;
        w0 a13 = a.fe.a(pc2Var.f9627d, str, true, false, null, 12);
        ao2.o oVar = new ao2.o(1, cl2.h.b(this));
        oVar.v();
        zn2.a aVar3 = zn2.b.f142311b;
        pc2Var.f9625b.getClass();
        long Q2 = dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS);
        if (a13 == null || !(a13 instanceof ic2)) {
            xk2.q qVar = s.f135225b;
            oVar.resumeWith(new ac2(str, null, null, "Adapter failed to instantiate.", new Integer(1), 78));
        } else {
            ic2 ic2Var = (ic2) a13;
            qs2.a().f4018a.f11217c.f7153e = ic2Var.f4426a.getVersionInfo().toString();
            uc2 callback = new uc2(str, ic2Var, Q2, pc2Var.f9625b, oVar);
            Context context = pc2Var.f9624a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(requestExtras, "requestExtras");
            Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
            Intrinsics.checkNotNullParameter(callback, "callback");
            RtbAdapter rtbAdapter = ic2Var.f6316b;
            switch (adType.hashCode()) {
                case -1396342996:
                    if (adType.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case -1052618729:
                    if (adType.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case -239580146:
                    if (adType.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case 604727084:
                    if (adType.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case 1167692200:
                    if (adType.equals("app_open")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case 1778294298:
                    if (adType.equals("app_open_ad")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                case 1911491517:
                    if (adType.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    }
                    adFormat = AdFormat.UNKNOWN;
                    break;
                default:
                    adFormat = AdFormat.UNKNOWN;
                    break;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, serverExtras);
            if (aVar2 != null) {
                String formatString = aVar2.f125861e;
                Intrinsics.checkNotNullParameter(formatString, "formatString");
                int i14 = aVar2.f125857a;
                int i15 = aVar2.f125858b;
                adSize = new AdSize(i14, i15, formatString, aVar2.f125859c, aVar2.f125860d, i15);
            } else {
                adSize = null;
            }
            rtbAdapter.collectSignals(new RtbSignalData(context, kotlin.collections.e0.b(mediationConfiguration), requestExtras, adSize), callback);
        }
        Object u13 = oVar.u();
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return u13 == aVar ? aVar : u13;
    }
}
