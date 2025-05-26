package s91;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.g1;
import va1.k1;

/* loaded from: classes5.dex */
public final class i extends g1 implements s {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f112076f;

    /* renamed from: g, reason: collision with root package name */
    public final ScreenLocation f112077g;

    /* renamed from: h, reason: collision with root package name */
    public final int f112078h;

    /* renamed from: i, reason: collision with root package name */
    public final int f112079i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull k1 descriptionProvider) {
        super(Integer.valueOf(c52.e.settings_account_management_delete_data_title), null, 2, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f112076f = descriptionProvider;
        this.f112077g = (ScreenLocation) b4.f50572r.getValue();
        this.f112078h = 2;
        this.f112079i = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.b
    public final k1 a() {
        return this.f112076f;
    }

    @Override // va1.h
    public final int c() {
        return this.f112079i;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f112078h;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f112077g;
    }
}
