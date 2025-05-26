package ol2;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final b f96452c = new b();

    @Override // ol2.a
    public final Random h() {
        Object obj = this.f96452c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
