package yq0;

import kotlin.jvm.internal.Intrinsics;
import qa2.s1;

/* loaded from: classes.dex */
public abstract class m extends s1 implements sq0.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final sq0.e0 f139716d;

    public m(sq0.e0 dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f139716d = dataSource;
    }

    @Override // androidx.recyclerview.widget.b2
    public int e() {
        return this.f139716d.a();
    }
}
