package ac1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.h4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.h1;

/* loaded from: classes5.dex */
public final class b extends h1 implements i {

    /* renamed from: f, reason: collision with root package name */
    public String f1910f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1911g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f1912h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1913i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull String displayableValue) {
        super(h52.c.settings_personal_information_business_type);
        Intrinsics.checkNotNullParameter(displayableValue, "displayableValue");
        this.f1910f = displayableValue;
        this.f1911g = 2;
        this.f1912h = (ScreenLocation) h4.f50914c.getValue();
        this.f1913i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.h
    public final int c() {
        return this.f1913i;
    }

    @Override // va1.c
    public final String e() {
        return this.f1910f;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f1911g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f1912h;
    }
}
