package dg2;

import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.UiRemoteConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54950i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ tg2.h f54951j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(tg2.i iVar, int i13) {
        super(0);
        this.f54950i = i13;
        this.f54951j = iVar;
    }

    public final Integer b() {
        UiRemoteConfig uiRemoteConfig;
        Integer num;
        int i13 = this.f54950i;
        tg2.h hVar = this.f54951j;
        switch (i13) {
            case 0:
                return Integer.valueOf(((tg2.i) hVar).a());
            default:
                RemoteConfig remoteConfig = ((tg2.i) hVar).f117609a;
                return Integer.valueOf((remoteConfig == null || (uiRemoteConfig = remoteConfig.f73050e) == null || (num = uiRemoteConfig.f73091d) == null) ? 100 : num.intValue());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f54950i) {
        }
        return b();
    }
}
