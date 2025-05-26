package nc1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f90374h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f90375i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f90376j;

    /* renamed from: k, reason: collision with root package name */
    public final String f90377k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i13, @NotNull k1 descriptionProvider, boolean z13, boolean z14, boolean z15) {
        super(i13, z13);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f90374h = descriptionProvider;
        this.f90375i = z14;
        this.f90376j = z15;
        this.f90377k = "opt_in_private_account";
    }

    @Override // va1.b
    public final k1 a() {
        return this.f90374h;
    }

    @Override // nc1.b
    public final String j() {
        return this.f90377k;
    }

    @Override // nc1.b
    public final boolean k() {
        return this.f90375i;
    }
}
