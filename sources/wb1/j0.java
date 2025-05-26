package wb1;

import com.pinterest.api.model.qv;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.i1;
import va1.k1;

/* loaded from: classes5.dex */
public final class j0 extends i1 implements q0 {

    /* renamed from: f, reason: collision with root package name */
    public final k1 f129025f;

    /* renamed from: g, reason: collision with root package name */
    public String f129026g;

    /* renamed from: h, reason: collision with root package name */
    public final int f129027h;

    /* renamed from: i, reason: collision with root package name */
    public final ScreenLocation f129028i;

    /* renamed from: j, reason: collision with root package name */
    public final int f129029j;

    /* renamed from: k, reason: collision with root package name */
    public final qv f129030k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i13, @NotNull k1 descriptionProvider, @NotNull String displayableValue, @NotNull qv entry) {
        super(i13);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        Intrinsics.checkNotNullParameter(displayableValue, "displayableValue");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f129025f = descriptionProvider;
        this.f129026g = displayableValue;
        this.f129027h = 2;
        this.f129028i = (ScreenLocation) b4.f50563i.getValue();
        this.f129029j = ml1.b.DEFAULT_TRANSITION_WITHOUT_ALPHA_ANIMATION.getValue();
        this.f129030k = entry;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f129025f;
    }

    @Override // va1.h
    public final int c() {
        return this.f129029j;
    }

    @Override // va1.c
    public final String e() {
        return this.f129026g;
    }

    @Override // va1.f
    public final int getViewType() {
        return this.f129027h;
    }

    @Override // va1.f1
    public final ScreenLocation j() {
        return this.f129028i;
    }
}
