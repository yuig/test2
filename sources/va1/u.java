package va1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class u extends j1 implements e {

    /* renamed from: e, reason: collision with root package name */
    public final k1 f125246e;

    /* renamed from: f, reason: collision with root package name */
    public final rm1.q f125247f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i13, @NotNull k1 urlProvider) {
        super(Integer.valueOf(i13), null, 2, null);
        Intrinsics.checkNotNullParameter(urlProvider, "urlProvider");
        this.f125246e = urlProvider;
        this.f125247f = rm1.q.ARROW_UP_RIGHT;
    }

    @Override // va1.e
    public final rm1.q g() {
        return this.f125247f;
    }

    public final k1 j() {
        return this.f125246e;
    }
}
