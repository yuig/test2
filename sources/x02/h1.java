package x02;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h1 extends dl1.u {

    /* renamed from: d, reason: collision with root package name */
    public final f30 f131404d;

    /* renamed from: e, reason: collision with root package name */
    public final String f131405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(f30 pin, String uid) {
        super(uid);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f131404d = pin;
        this.f131405e = uid;
    }

    @Override // dl1.u
    public final String a() {
        return this.f131405e;
    }
}
