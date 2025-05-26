package nr0;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uk1.d f91883a;

    public s(uk1.d dVar) {
        this.f91883a = dVar;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        i0 generateLoggingContext = this.f91883a.generateLoggingContext();
        Intrinsics.checkNotNullExpressionValue(generateLoggingContext, "generateLoggingContext(...)");
        return generateLoggingContext;
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f91883a.f122382d;
    }
}
