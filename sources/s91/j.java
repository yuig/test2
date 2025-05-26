package s91;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.i1;
import va1.k1;

/* loaded from: classes5.dex */
public final class j extends i1 implements s {

    /* renamed from: f, reason: collision with root package name */
    public String f112080f;

    /* renamed from: g, reason: collision with root package name */
    public final k1 f112081g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f112082h;

    /* renamed from: i, reason: collision with root package name */
    public final int f112083i;

    /* renamed from: j, reason: collision with root package name */
    public final ScreenLocation f112084j;

    /* renamed from: k, reason: collision with root package name */
    public final int f112085k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull String displayableValue, @NotNull k1 descriptionProvider, boolean z13) {
        super(c52.e.settings_account_management_email);
        Intrinsics.checkNotNullParameter(displayableValue, "displayableValue");
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f112080f = displayableValue;
        this.f112081g = descriptionProvider;
        this.f112082h = z13;
        this.f112083i = 2;
        this.f112084j = (ScreenLocation) b4.f50578x.getValue();
        this.f112085k = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
    }

    @Override // va1.b
    public final k1 a() {
        return this.f112081g;
    }

    @Override // va1.h
    public final int c() {
        return this.f112085k;
    }

    @Override // va1.c
    public final String e() {
        return this.f112080f;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f112083i;
    }

    @Override // va1.j1
    public final boolean h() {
        return this.f112082h;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f112084j;
    }

    public /* synthetic */ j(String str, k1 k1Var, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, k1Var, (i13 & 4) != 0 ? true : z13);
    }
}
