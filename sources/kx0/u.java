package kx0;

import com.pinterest.api.model.qx;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class u implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final fx0.a f81087a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81088b;

    /* renamed from: c, reason: collision with root package name */
    public final qx f81089c;

    /* renamed from: d, reason: collision with root package name */
    public final dl1.s f81090d;

    /* renamed from: e, reason: collision with root package name */
    public final List f81091e;

    public u(@NotNull fx0.a itemType, int i13, @NotNull qx newsHubItem, boolean z13, dl1.s sVar, List<? extends dl1.s> list) {
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(newsHubItem, "newsHubItem");
        this.f81087a = itemType;
        this.f81088b = i13;
        this.f81089c = newsHubItem;
        this.f81090d = sVar;
        this.f81091e = list;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return ol2.f.f96454a.toString();
    }

    public /* synthetic */ u(fx0.a aVar, int i13, qx qxVar, boolean z13, dl1.s sVar, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i13, qxVar, z13, (i14 & 16) != 0 ? null : sVar, (i14 & 32) != 0 ? null : list);
    }
}
