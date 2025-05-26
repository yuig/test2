package pc;

import com.apollographql.apollo3.exception.ApolloException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f99561a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f99562b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f99563c;

    /* renamed from: d, reason: collision with root package name */
    public final List f99564d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f99565e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f99566f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f99567g;

    public h(UUID uuid, o0 o0Var, n0 n0Var, List list, Map map, f0 f0Var, boolean z13) {
        this.f99561a = uuid;
        this.f99562b = o0Var;
        this.f99563c = n0Var;
        this.f99564d = list;
        this.f99565e = map;
        this.f99566f = f0Var;
        this.f99567g = z13;
    }

    public final n0 a() {
        List list = this.f99564d;
        List list2 = list;
        if (!(list2 == null || list2.isEmpty())) {
            throw new ApolloException("The response has errors: " + list, 2);
        }
        n0 n0Var = this.f99563c;
        if (n0Var != null) {
            return n0Var;
        }
        throw new ApolloException("The server did not return any data", 2);
    }

    public final g b() {
        g gVar = new g(this.f99562b, this.f99561a, this.f99563c);
        gVar.f99555e = this.f99564d;
        gVar.f99556f = this.f99565e;
        gVar.a(this.f99566f);
        gVar.f99557g = this.f99567g;
        return gVar;
    }
}
