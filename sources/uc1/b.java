package uc1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n91.z;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class b extends m1 implements g {

    /* renamed from: h, reason: collision with root package name */
    public final wy0 f121891h;

    /* renamed from: i, reason: collision with root package name */
    public final k1 f121892i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull wy0 user, boolean z13, @NotNull k1 descriptionProvider) {
        super(Integer.valueOf(l52.c.settings_security_google_login_title), z13, null, false, 12, null);
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f121891h = user;
        this.f121892i = descriptionProvider;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f121892i;
    }

    public /* synthetic */ b(wy0 wy0Var, boolean z13, k1 k1Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(wy0Var, z13, (i13 & 4) != 0 ? z.c("") : k1Var);
    }
}
