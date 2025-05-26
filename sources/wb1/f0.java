package wb1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;

/* loaded from: classes5.dex */
public final class f0 extends va1.s implements q0 {

    /* renamed from: e, reason: collision with root package name */
    public final k1 f129014e;

    /* renamed from: f, reason: collision with root package name */
    public final int f129015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@NotNull k1 descriptionProvider, int i13) {
        super(i13);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f129014e = descriptionProvider;
        this.f129015f = 15;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f129014e;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f129015f;
    }
}
