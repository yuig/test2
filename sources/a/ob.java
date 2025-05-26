package a;

import ads_mobile_sdk.q92;
import ads_mobile_sdk.wm2;
import ads_mobile_sdk.wy2;
import ads_mobile_sdk.xz2;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ob implements ca {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139a;

    public /* synthetic */ ob(int i13) {
        this.f139a = i13;
    }

    @Override // a.v7
    public final Object get() {
        switch (this.f139a) {
            case 0:
                return new q92();
            case 1:
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                kh2.a1.p(uuid);
                return uuid;
            case 2:
                return 1;
            case 3:
                return new dd();
            case 4:
                return new ads_mobile_sdk.v4();
            case 5:
                return new fe();
            case 6:
                return new wm2();
            case 7:
                return new wy2();
            case 8:
                return new uf();
            default:
                return new xz2();
        }
    }
}
