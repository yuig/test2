package n2;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public class d extends kotlin.collections.m {

    /* renamed from: f, reason: collision with root package name */
    public static final d f88930f = new d(r.f88954e, 0);

    /* renamed from: d, reason: collision with root package name */
    public final r f88931d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88932e;

    public d(r rVar, int i13) {
        this.f88931d = rVar;
        this.f88932e = i13;
    }

    @Override // kotlin.collections.m
    public final Set c() {
        return new m(this);
    }

    @Override // kotlin.collections.m, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f88931d.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.m
    public final Set d() {
        return new o(this);
    }

    @Override // kotlin.collections.m
    public final int e() {
        return this.f88932e;
    }

    @Override // kotlin.collections.m
    public final Collection f() {
        return new p(this);
    }

    @Override // kotlin.collections.m, java.util.Map
    public Object get(Object obj) {
        return this.f88931d.j(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final d h(Object obj, o2.a aVar) {
        q C = this.f88931d.C(obj != null ? obj.hashCode() : 0, obj, aVar, 0);
        if (C == null) {
            return this;
        }
        return new d(C.f88952a, this.f88932e + C.f88953b);
    }
}
