package rm2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f108724a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f108725b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f108726c;

    public c(d dVar, j0 signature) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f108726c = dVar;
        this.f108724a = signature;
        this.f108725b = new ArrayList();
    }

    @Override // rm2.e0
    public final void a() {
        ArrayList arrayList = this.f108725b;
        if (!arrayList.isEmpty()) {
            this.f108726c.f108728b.put(this.f108724a, arrayList);
        }
    }

    @Override // rm2.e0
    public final c0 b(ym2.b classId, fm2.a source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        return this.f108726c.f108727a.q(classId, source, this.f108725b);
    }
}
