package vh2;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class b extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f125846a = new b();

    public b() {
        super(1, Closeable.class, "close", "close()V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Closeable p03 = (Closeable) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        p03.close();
        return Unit.f80348a;
    }
}
