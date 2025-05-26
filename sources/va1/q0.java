package va1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class q0 extends m1 {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f125229h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f125230i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i13, @NotNull k1 descriptionProvider, boolean z13, boolean z14) {
        super(Integer.valueOf(i13), z14, null, false, 12, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f125229h = descriptionProvider;
        this.f125230i = z13;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f125229h;
    }

    @Override // va1.m1, va1.j1
    public final boolean h() {
        return this.f125230i;
    }
}
