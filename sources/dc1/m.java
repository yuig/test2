package dc1;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.i4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.g1;
import va1.k1;

/* loaded from: classes5.dex */
public final class m extends g1 implements o {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f54383f;

    /* renamed from: g, reason: collision with root package name */
    public final int f54384g;

    /* renamed from: h, reason: collision with root package name */
    public final ScreenLocation f54385h;

    /* renamed from: i, reason: collision with root package name */
    public final int f54386i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull k1 descriptionProvider) {
        super(Integer.valueOf(i52.c.settings_privacy_data_request_data), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f54383f = descriptionProvider;
        this.f54384g = 2;
        this.f54385h = (ScreenLocation) i4.f50996d.getValue();
        this.f54386i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.b
    public final k1 a() {
        return this.f54383f;
    }

    @Override // va1.h
    public final int c() {
        return this.f54386i;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f54384g;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f54385h;
    }
}
