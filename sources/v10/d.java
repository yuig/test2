package v10;

import d12.i;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i f123842a;

    public d(@NotNull i repositoryBatcher) {
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        this.f123842a = repositoryBatcher;
    }

    public final void a(List models) {
        Intrinsics.checkNotNullParameter(models, "models");
        new c(CollectionsKt.F0(models), this).b();
    }
}
