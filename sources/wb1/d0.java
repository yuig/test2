package wb1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class d0 extends m1 implements q0 {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f129013h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i13, @NotNull k1 descriptionProvider, boolean z13, boolean z14) {
        super(Integer.valueOf(i13), z13, null, z14, 4, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f129013h = descriptionProvider;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f129013h;
    }

    public /* synthetic */ d0(int i13, k1 k1Var, boolean z13, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, k1Var, z13, (i14 & 8) != 0 ? true : z14);
    }
}
