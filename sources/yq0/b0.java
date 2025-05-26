package yq0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yq0.a0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyq0/b0;", "Lyq0/a0;", "D", "Lyq0/t;", "Lyq0/z;", "<init>", "()V", "recyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class b0<D extends a0> extends t<D, z> {
    public abstract void Q8(z zVar);

    @Override // yq0.t
    public final m d8(sq0.e0 e0Var) {
        a0 dataSource = (a0) e0Var;
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        vq0.i iVar = new vq0.i(dataSource);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        z zVar = new z(iVar, bf.b.S(viewLifecycleOwner), 4);
        Q8(zVar);
        return zVar;
    }

    @Override // yq0.t
    public final m e8(wk1.i dataSourceProvider) {
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        z zVar = new z(dataSourceProvider, bf.b.S(viewLifecycleOwner), 4);
        Q8(zVar);
        return zVar;
    }
}
