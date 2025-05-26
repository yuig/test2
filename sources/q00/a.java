package q00;

import com.pinterest.api.model.fs0;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import nm.o;

/* loaded from: classes3.dex */
public final class a extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final o f101765b;

    public a(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f101765b = gson;
    }

    @Override // pq2.p
    public final Object a(Object obj) {
        if (obj instanceof fs0) {
            return this.f101765b.k(obj);
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
