package h21;

import com.google.android.gms.ads.AdSize;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final o21.b f66568a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66569b;

    /* renamed from: c, reason: collision with root package name */
    public final ze1.a f66570c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66571d;

    public /* synthetic */ f(o21.b bVar, int i13, int i14) {
        this((i14 & 1) != 0 ? new o21.b(400, AdSize.WIDE_SKYSCRAPER_HEIGHT) : bVar, false, null, (i14 & 8) != 0 ? RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL : i13);
    }

    public f(o21.b dimensions, boolean z13, ze1.a aVar, int i13) {
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        this.f66568a = dimensions;
        this.f66569b = z13;
        this.f66570c = aVar;
        this.f66571d = i13;
    }
}
