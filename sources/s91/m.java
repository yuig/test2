package s91;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.h1;

/* loaded from: classes5.dex */
public final class m extends h1 implements s {

    /* renamed from: f, reason: collision with root package name */
    public final String f112093f;

    /* renamed from: g, reason: collision with root package name */
    public final int f112094g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f112095h;

    /* renamed from: i, reason: collision with root package name */
    public final int f112096i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull String displayableValue) {
        super(c52.e.settings_account_management_password);
        Intrinsics.checkNotNullParameter(displayableValue, "displayableValue");
        this.f112093f = displayableValue;
        this.f112094g = 2;
        this.f112095h = (ScreenLocation) b4.B.getValue();
        this.f112096i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f112096i;
    }

    @Override // va1.c
    public final String e() {
        return this.f112093f;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f112094g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f112095h;
    }
}
