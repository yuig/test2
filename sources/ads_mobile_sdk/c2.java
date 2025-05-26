package ads_mobile_sdk;

import android.os.Bundle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final e2 f3703a;

    /* renamed from: b, reason: collision with root package name */
    public final a.rg f3704b;

    public c2(e2 adMetadataHolder, a.rg adMetadataChangedEventEmitter) {
        Intrinsics.checkNotNullParameter(adMetadataHolder, "adMetadataHolder");
        Intrinsics.checkNotNullParameter(adMetadataChangedEventEmitter, "adMetadataChangedEventEmitter");
        this.f3703a = adMetadataHolder;
        this.f3704b = adMetadataChangedEventEmitter;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("info");
        if (str == null) {
            str = "";
        }
        Bundle a13 = k41.a(str);
        if (a13 == null) {
            ft2.b("Unable to parse ad metadata info: ".concat(str));
            return Unit.f80348a;
        }
        this.f3703a.a(a13);
        Object a14 = this.f3704b.a(a13, cVar);
        return a14 == cl2.a.COROUTINE_SUSPENDED ? a14 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_AD_METADATA_CHANGED;
    }
}
