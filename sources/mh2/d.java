package mh2;

import io.embrace.android.embracesdk.internal.config.remote.LogRemoteConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class d extends p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87171a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, int i13) {
        super(0, obj, ig2.b.class, "getProperties", "getProperties()Ljava/util/Map;", 0);
        this.f87171a = i13;
        if (i13 == 1) {
            super(0, obj, tg2.k.class, "getInfoLogLimit", "getInfoLogLimit()I", 0);
            return;
        }
        if (i13 == 2) {
            super(0, obj, tg2.k.class, "getWarnLogLimit", "getWarnLogLimit()I", 0);
        } else if (i13 != 3) {
        } else {
            super(0, obj, tg2.k.class, "getErrorLogLimit", "getErrorLogLimit()I", 0);
        }
    }

    public final Integer h() {
        Integer num;
        Integer num2;
        Integer num3;
        int i13 = 100;
        switch (this.f87171a) {
            case 1:
                LogRemoteConfig logRemoteConfig = ((tg2.l) ((tg2.k) this.receiver)).f117612a;
                if (logRemoteConfig != null && (num = logRemoteConfig.f73015b) != null) {
                    i13 = num.intValue();
                }
                return Integer.valueOf(i13);
            case 2:
                LogRemoteConfig logRemoteConfig2 = ((tg2.l) ((tg2.k) this.receiver)).f117612a;
                if (logRemoteConfig2 != null && (num2 = logRemoteConfig2.f73016c) != null) {
                    i13 = num2.intValue();
                }
                return Integer.valueOf(i13);
            default:
                LogRemoteConfig logRemoteConfig3 = ((tg2.l) ((tg2.k) this.receiver)).f117612a;
                return Integer.valueOf((logRemoteConfig3 == null || (num3 = logRemoteConfig3.f73017d) == null) ? 250 : num3.intValue());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f87171a) {
        }
        return h();
    }
}
