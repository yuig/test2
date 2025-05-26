package a6;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final r f875i = new r(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        p msg = (p) obj;
        Throwable th3 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg instanceof o) {
            ao2.v vVar = ((o) msg).f871b;
            if (th3 == null) {
                th3 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            ((ao2.w) vVar).e0(th3);
        }
        return Unit.f80348a;
    }
}
