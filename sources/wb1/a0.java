package wb1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class a0 extends m1 implements q0 {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f129005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i13, @NotNull k1 descriptionProvider, boolean z13) {
        super(Integer.valueOf(i13), z13, null, false, 12, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f129005h = descriptionProvider;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f129005h;
    }
}
