package ac1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.h4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.h1;

/* loaded from: classes5.dex */
public final class e extends h1 implements i {

    /* renamed from: f, reason: collision with root package name */
    public String f1922f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1923g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f1924h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1925i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull String displayableValue) {
        super(h52.c.settings_personal_information_gender);
        Intrinsics.checkNotNullParameter(displayableValue, "displayableValue");
        this.f1922f = displayableValue;
        this.f1923g = 2;
        this.f1924h = (ScreenLocation) h4.f50917f.getValue();
        this.f1925i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f1925i;
    }

    @Override // va1.c
    public final String e() {
        return this.f1922f;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f1923g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f1924h;
    }
}
