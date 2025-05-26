package rm2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f108723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, j0 signature) {
        super(dVar, signature);
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f108723d = dVar;
    }

    public final n c(int i13, ym2.b classId, fm2.a source) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(source, "source");
        j0 j13 = i0.j(this.f108724a, i13);
        d dVar = this.f108723d;
        List list = (List) dVar.f108728b.get(j13);
        if (list == null) {
            list = new ArrayList();
            dVar.f108728b.put(j13, list);
        }
        return dVar.f108727a.q(classId, source, list);
    }
}
