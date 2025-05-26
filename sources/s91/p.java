package s91;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.l1;

/* loaded from: classes5.dex */
public final class p extends l1 implements s {

    /* renamed from: e, reason: collision with root package name */
    public final k1 f112101e;

    /* renamed from: f, reason: collision with root package name */
    public final int f112102f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull k1 descriptionProvider) {
        super(Integer.valueOf(c52.e.settings_account_management_email_sso), null, 2, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f112101e = descriptionProvider;
        this.f112102f = 19;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f112101e;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f112102f;
    }
}
