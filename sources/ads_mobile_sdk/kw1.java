package ads_mobile_sdk;

import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class kw1 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final eg0 f7554a;

    public kw1(eg0 flagDataStore) {
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        this.f7554a = flagDataStore;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("key");
        String str2 = (String) map.get(AnimatedTarget.PROPERTY_STATE);
        if (str == null || str.length() == 0) {
            return Unit.f80348a;
        }
        eg0 eg0Var = this.f7554a;
        eg0Var.getClass();
        Object a13 = eg0.a(eg0Var, str, str2, cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_PERSISTENT_SDK_CORE_DATA;
    }
}
