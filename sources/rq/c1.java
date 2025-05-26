package rq;

import com.pinterest.activity.pin.view.modules.PinCloseupFavoriteModule;
import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109118a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f109119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f109120c;

    public /* synthetic */ c1(int i13, PinCloseupFavoriteModule pinCloseupFavoriteModule) {
        this.f109119b = i13;
        this.f109120c = pinCloseupFavoriteModule;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f109118a;
        int i14 = this.f109119b;
        Object obj = this.f109120c;
        switch (i13) {
            case 0:
                PinCloseupFavoriteModule this$0 = (PinCloseupFavoriteModule) obj;
                int i15 = PinCloseupFavoriteModule.f34993s;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (i14 > 1 || (i14 == 1 && !this$0.f35008o)) {
                    m60.w wVar = this$0.f34999f;
                    if (wVar == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    ScreenLocation screenLocation = (ScreenLocation) com.pinterest.screens.i0.f50931i.getValue();
                    f30 pin = this$0.getPin();
                    String uid = pin != null ? pin.getUid() : null;
                    if (uid == null) {
                        uid = "";
                    }
                    wVar.d(Navigation.z0(screenLocation, uid));
                    return;
                }
                return;
            default:
                oo0.a aVar = (oo0.a) obj;
                int i16 = oo0.a.f96801c;
                aVar.getClass();
                if (it instanceof em1.c) {
                    aVar.f96803b.f96812g.r3(i14);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c1(oo0.a aVar, int i13) {
        this.f109120c = aVar;
        this.f109119b = i13;
    }
}
