package y00;

import com.apollographql.apollo3.exception.CacheMissException;
import ja.c0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import pc.m;
import tb0.p;
import vb0.j;
import wc.e;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136379a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final e f136380b;

    public a(f0 cacheKeyResolver) {
        Intrinsics.checkNotNullParameter(cacheKeyResolver, "cacheKeyResolver");
        this.f136380b = cacheKeyResolver;
    }

    @Override // wc.e
    public final Object k(m field, c0 variables, Map parent, String parentId) {
        int i13 = this.f136379a;
        e eVar = this.f136380b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(field, "field");
                Intrinsics.checkNotNullParameter(variables, "variables");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(parentId, "parentId");
                try {
                    return ((f0) eVar).k(field, variables, parent, parentId);
                } catch (CacheMissException unused) {
                    return null;
                } catch (NullPointerException e13) {
                    j.f125466a.I(e13, "There is a cache miss on a null value which should be populated. Please check your DSL and your .graphql file to ensure all fields are accounted for.", p.PLATFORM);
                    return null;
                }
            default:
                Intrinsics.checkNotNullParameter(field, "field");
                Intrinsics.checkNotNullParameter(variables, "variables");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(parentId, "parentId");
                String str = field.f99582a;
                if (Intrinsics.d(str, "users") && Intrinsics.d(parent.get("__typename"), "Conversation") && parent.get("users") == null) {
                    throw new CacheMissException(parentId, str, true);
                }
                return ((a) eVar).k(field, variables, parent, parentId);
        }
    }

    public a(a nullableFieldCacheResolver) {
        Intrinsics.checkNotNullParameter(nullableFieldCacheResolver, "nullableFieldCacheResolver");
        this.f136380b = nullableFieldCacheResolver;
    }
}
