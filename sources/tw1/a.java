package tw1;

import com.pinterest.api.model.o4;
import kotlin.jvm.internal.Intrinsics;
import uw1.c;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119613a;

    /* renamed from: b, reason: collision with root package name */
    public final o4 f119614b;

    /* renamed from: c, reason: collision with root package name */
    public final ww1.c f119615c;

    public a(o4 metrics, ww1.c metricType, int i13) {
        this.f119613a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            Intrinsics.checkNotNullParameter(metricType, "metricType");
            this.f119614b = metrics;
            this.f119615c = metricType;
            return;
        }
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.f119614b = metrics;
        this.f119615c = metricType;
    }
}
