package s91;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class l extends m1 implements s {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f112091h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f112092i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i13, @NotNull k1 descriptionProvider, boolean z13, boolean z14) {
        super(Integer.valueOf(i13), z14, null, false, 12, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f112091h = descriptionProvider;
        this.f112092i = z13;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f112091h;
    }

    @Override // va1.m1, va1.j1
    public final boolean h() {
        return this.f112092i;
    }
}
