package di2;

import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.SessionRemoteConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55081i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f55082j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i13) {
        super(0);
        this.f55081i = i13;
        this.f55082j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        RemoteConfig remoteConfig;
        SessionRemoteConfig sessionRemoteConfig;
        Boolean bool;
        int i13 = this.f55081i;
        boolean z13 = true;
        j jVar = this.f55082j;
        switch (i13) {
            case 0:
                sg2.a configService = jVar.f55091c;
                yh2.c cVar = jVar.f55100l;
                bi2.f state = jVar.f55101m;
                Intrinsics.checkNotNullParameter(configService, "configService");
                og2.a clock = jVar.f55090b;
                Intrinsics.checkNotNullParameter(clock, "clock");
                Intrinsics.checkNotNullParameter(state, "state");
                if (state != bi2.f.BACKGROUND && (((remoteConfig = ((sg2.b) configService).f112882g.f117625a) == null || (sessionRemoteConfig = remoteConfig.f73052g) == null || (bool = sessionRemoteConfig.f73081a) == null || !bool.booleanValue()) && cVar != null)) {
                    z13 = clock.now() - cVar.f139055b < 5000;
                }
                return Boolean.valueOf(z13);
            case 1:
                bi2.f state2 = jVar.f55101m;
                Intrinsics.checkNotNullParameter(state2, "state");
                return Boolean.valueOf(state2 == bi2.f.BACKGROUND);
            default:
                bi2.f state3 = jVar.f55101m;
                Intrinsics.checkNotNullParameter(state3, "state");
                return Boolean.valueOf(state3 == bi2.f.FOREGROUND);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f55081i) {
        }
        return invoke();
    }
}
