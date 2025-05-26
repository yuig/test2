package eu;

import com.pinterest.ads.feature.owc.view.collection.AdsCollectionScrollingModule;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f60126a;

    public d(e eVar) {
        this.f60126a = eVar;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dc2.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f60126a;
        eVar.f7().i(event);
        m60.w f73 = eVar.f7();
        NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.f.f50739a.getValue());
        w13.m0("com.pinterest.EXTRA_VIDEO_SCREEN_PIN_ID", eVar.getPin().getUid());
        bc2.q S0 = dl2.b.S0(eVar.getPin(), null);
        float a13 = S0 != null ? S0.a() : 0.0f;
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_VIDEO_SCREEN_RATIO", "key");
        w13.f49942d.putFloat("com.pinterest.EXTRA_VIDEO_SCREEN_RATIO", a13);
        f73.d(w13);
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ds0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f60126a;
        eVar.f7().i(event);
        eVar.P7();
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x00eb, code lost:
    
        if (r0.l("android_ads_mdl_collections") == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ec  */
    @sp2.k(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull eu.u r33) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eu.d.onEventMainThread(eu.u):void");
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ps.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f60126a;
        eVar.f7().i(event);
        AdsCollectionScrollingModule d83 = eVar.d8();
        int i13 = event.f101244a;
        ps.k i23 = d83.i2();
        int min = Math.min(d83.g2().size(), i23.f101241d);
        i23.f101241d = min;
        if (i13 >= min) {
            i13 = min - 1;
        }
        i23.f101240c = i13;
        d83.r2(i23);
        List g23 = d83.g2();
        int i14 = i23.f101240c;
        i23.f101240c = i14 + 1;
        d83.t1((List) g23.get(i14));
        ps.k.d(i23, d83.g2().size(), false, null, new i(d83, i23, 0), 12);
    }
}
