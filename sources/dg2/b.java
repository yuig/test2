package dg2;

import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.UiRemoteConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class b extends p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54946a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tg2.i iVar, int i13) {
        super(0, iVar, tg2.h.class, "getCustomBreadcrumbLimit", "getCustomBreadcrumbLimit()I", 0);
        this.f54946a = i13;
        if (i13 == 1) {
            super(0, iVar, tg2.h.class, "getCustomBreadcrumbLimit", "getCustomBreadcrumbLimit()I", 0);
            return;
        }
        if (i13 == 2) {
            super(0, iVar, tg2.h.class, "getTapBreadcrumbLimit", "getTapBreadcrumbLimit()I", 0);
        } else if (i13 != 3) {
        } else {
            super(0, iVar, tg2.h.class, "getWebViewBreadcrumbLimit", "getWebViewBreadcrumbLimit()I", 0);
        }
    }

    public final Integer h() {
        UiRemoteConfig uiRemoteConfig;
        Integer num;
        UiRemoteConfig uiRemoteConfig2;
        Integer num2;
        int i13 = 100;
        switch (this.f54946a) {
            case 0:
                return Integer.valueOf(((tg2.i) ((tg2.h) this.receiver)).a());
            case 1:
                return Integer.valueOf(((tg2.i) ((tg2.h) this.receiver)).a());
            case 2:
                RemoteConfig remoteConfig = ((tg2.i) ((tg2.h) this.receiver)).f117609a;
                if (remoteConfig != null && (uiRemoteConfig = remoteConfig.f73050e) != null && (num = uiRemoteConfig.f73089b) != null) {
                    i13 = num.intValue();
                }
                return Integer.valueOf(i13);
            default:
                RemoteConfig remoteConfig2 = ((tg2.i) ((tg2.h) this.receiver)).f117609a;
                if (remoteConfig2 != null && (uiRemoteConfig2 = remoteConfig2.f73050e) != null && (num2 = uiRemoteConfig2.f73090c) != null) {
                    i13 = num2.intValue();
                }
                return Integer.valueOf(i13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f54946a) {
        }
        return h();
    }
}
