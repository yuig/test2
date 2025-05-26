package s91;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class d extends m1 implements s {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f112057h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z13, @NotNull k1 descriptionProvider) {
        super(Integer.valueOf(c52.e.settings_account_management_app_sounds_title), z13, null, false, 12, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f112057h = descriptionProvider;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f112057h;
    }
}
