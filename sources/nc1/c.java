package nc1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;

/* loaded from: classes5.dex */
public final class c extends b {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f90378h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f90379i;

    /* renamed from: j, reason: collision with root package name */
    public final String f90380j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i13, @NotNull k1 descriptionProvider, boolean z13, boolean z14) {
        super(i13, z13);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f90378h = descriptionProvider;
        this.f90379i = z14;
        this.f90380j = "exclude_from_search";
    }

    @Override // va1.b
    public final k1 a() {
        return this.f90378h;
    }

    @Override // nc1.b
    public final String j() {
        return this.f90380j;
    }

    @Override // nc1.b
    public final boolean k() {
        return this.f90379i;
    }
}
