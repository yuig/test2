package s91;

import com.pinterest.framework.screens.NoneLocation;
import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.h1;

/* loaded from: classes5.dex */
public final class e extends h1 implements s {

    /* renamed from: f, reason: collision with root package name */
    public String f112058f;

    /* renamed from: g, reason: collision with root package name */
    public final int f112059g;

    /* renamed from: h, reason: collision with root package name */
    public final NoneLocation f112060h;

    /* renamed from: i, reason: collision with root package name */
    public final int f112061i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull String displayableValue) {
        super(c52.e.settings_account_management_app_theme_title);
        Intrinsics.checkNotNullParameter(displayableValue, "displayableValue");
        this.f112058f = displayableValue;
        this.f112059g = 2;
        this.f112060h = NoneLocation.NONE;
        this.f112061i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f112061i;
    }

    @Override // va1.c
    public final String e() {
        return this.f112058f;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f112059g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f112060h;
    }
}
