package tg2;

import io.embrace.android.embracesdk.internal.config.remote.KillSwitchRemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117598i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f117599j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(0);
        this.f117598i = i13;
        this.f117599j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        KillSwitchRemoteConfig killSwitchRemoteConfig;
        KillSwitchRemoteConfig killSwitchRemoteConfig2;
        int i13 = this.f117598i;
        Float f13 = null;
        e eVar = this.f117599j;
        switch (i13) {
            case 0:
                g gVar = eVar.f117600a;
                RemoteConfig remoteConfig = eVar.f117601b;
                if (remoteConfig != null && (killSwitchRemoteConfig = remoteConfig.f73056k) != null) {
                    f13 = killSwitchRemoteConfig.f73009d;
                }
                Boolean a13 = gVar.a(f13);
                return Boolean.valueOf(a13 != null ? a13.booleanValue() : true);
            default:
                g gVar2 = eVar.f117600a;
                RemoteConfig remoteConfig2 = eVar.f117601b;
                if (remoteConfig2 != null && (killSwitchRemoteConfig2 = remoteConfig2.f73056k) != null) {
                    f13 = killSwitchRemoteConfig2.f73008c;
                }
                Boolean a14 = gVar2.a(f13);
                return Boolean.valueOf(a14 != null ? a14.booleanValue() : true);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f117598i) {
        }
        return invoke();
    }
}
