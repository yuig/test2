package u00;

import a.cb;
import dl1.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final t f119827a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119828b;

    /* renamed from: c, reason: collision with root package name */
    public final uf0.a f119829c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f119830d;

    public d(t repository, String apolloTypeName, z00.b converter, z00.a nodeQuery) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(apolloTypeName, "apolloTypeName");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(nodeQuery, "nodeQuery");
        this.f119827a = repository;
        this.f119828b = apolloTypeName;
        this.f119829c = converter;
        this.f119830d = nodeQuery;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.api.graphql.ApolloRepositoryConnector.Connection<*, *, *>");
        d dVar = (d) obj;
        return Intrinsics.d(this.f119828b, dVar.f119828b) && this.f119827a.getClass() == dVar.f119827a.getClass() && Intrinsics.d(this.f119829c, dVar.f119829c) && Intrinsics.d(this.f119830d, dVar.f119830d);
    }

    public final int hashCode() {
        return this.f119830d.hashCode() + ((this.f119829c.hashCode() + cb.d(this.f119828b, k0.f80436a.b(this.f119827a.getClass()).hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "Connection(repository=" + this.f119827a + ", apolloTypeName=" + this.f119828b + ", converter=" + this.f119829c + ", nodeQuery=" + this.f119830d + ")";
    }
}
