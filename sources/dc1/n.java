package dc1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.k1;
import va1.m1;

/* loaded from: classes5.dex */
public final class n extends m1 implements o {

    /* renamed from: h, reason: collision with root package name */
    public final k1 f54387h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull k1 descriptionProvider, boolean z13) {
        super(Integer.valueOf(i52.c.settings_privacy_data_store_contacts_title_update), z13, null, false, 12, null);
        Intrinsics.checkNotNullParameter(descriptionProvider, "descriptionProvider");
        this.f54387h = descriptionProvider;
    }

    @Override // va1.b
    public final k1 a() {
        return this.f54387h;
    }
}
