package ac2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2064a;

    public final Object a(Function0 createFunc) {
        Intrinsics.checkNotNullParameter(createFunc, "createFunc");
        if (this.f2064a == null) {
            synchronized (this) {
                try {
                    if (this.f2064a == null) {
                        this.f2064a = createFunc.invoke();
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        Object obj = this.f2064a;
        Intrinsics.f(obj);
        return obj;
    }
}
