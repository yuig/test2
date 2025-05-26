package rm2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f108735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f108736b;

    public i(f fVar, ArrayList arrayList) {
        this.f108735a = fVar;
        this.f108736b = arrayList;
    }

    @Override // rm2.e0
    public final void a() {
    }

    @Override // rm2.e0
    public final c0 b(ym2.b classId, fm2.a source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        return this.f108735a.q(classId, source, this.f108736b);
    }
}
