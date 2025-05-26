package ag1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public k f15145a;

    public final k a() {
        return this.f15145a;
    }

    public final void b() {
        this.f15145a = new k();
    }

    public final void c() {
        this.f15145a = k.a(this.f15145a, null, null, fg1.b.EDITOR_FIRST, null, null, RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER);
    }

    public final k d(Function1 update, boolean z13) {
        Intrinsics.checkNotNullParameter(update, "update");
        if (z13) {
            b();
        }
        k kVar = (k) update.invoke(this.f15145a);
        this.f15145a = kVar;
        return kVar;
    }
}
