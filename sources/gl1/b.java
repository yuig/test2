package gl1;

import dl1.m;
import dl1.s;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements el1.a {

    /* renamed from: a, reason: collision with root package name */
    public final uk2.f f65739a;

    public b() {
        uk2.f fVar = a.f65738a;
        Intrinsics.g(fVar, "null cannot be cast to non-null type io.reactivex.subjects.Subject<kotlin.Pair<P of com.pinterest.framework.repository.reactive.ApolloUpdateStream.create, Model of com.pinterest.framework.repository.reactive.ApolloUpdateStream.create>>");
        this.f65739a = fVar;
    }

    @Override // el1.a
    public final void h(m params, s model) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f65739a.c(new Pair(params, model));
    }
}
