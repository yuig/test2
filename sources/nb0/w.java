package nb0;

import java.util.Base64;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lh0.t2;

/* loaded from: classes5.dex */
public final class w implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f90332b;

    public w(t2 preferencesExperiments, int i13) {
        this.f90331a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(preferencesExperiments, "preferencesExperiments");
            b6.a aVar = new b6.a(u.f90325j);
            lb0.o a13 = lb0.n.f82724c.a();
            Intrinsics.checkNotNullExpressionValue(a13, "persisted(...)");
            this.f90332b = new t(d6.f.a(aVar, kotlin.collections.e0.b(new a(preferencesExperiments, a13)), v.f90328j, 4));
            return;
        }
        Intrinsics.checkNotNullParameter(preferencesExperiments, "preferencesExperiments");
        b6.a aVar2 = new b6.a(u.f90326k);
        lb0.o a14 = lb0.n.f82725d.a();
        Intrinsics.checkNotNullExpressionValue(a14, "user(...)");
        this.f90332b = new t(d6.f.a(aVar2, kotlin.collections.e0.b(new a(preferencesExperiments, a14)), v.f90329k, 4));
    }

    @Override // nb0.e
    public final Object a(String str, int i13, bl2.c cVar) {
        int i14 = this.f90331a;
        t tVar = this.f90332b;
        switch (i14) {
            case 0:
                tVar.getClass();
                break;
            default:
                tVar.getClass();
                break;
        }
        return t.s(tVar, str, i13, cVar);
    }

    @Override // nb0.e
    public final Object b(String str, String str2, Boolean bool, com.pinterest.encryption.dataEncryptionLibrary.a aVar, int i13, bl2.c cVar) {
        int i14 = this.f90331a;
        t tVar = this.f90332b;
        switch (i14) {
            case 0:
                tVar.getClass();
                break;
            default:
                tVar.getClass();
                break;
        }
        return t.x(tVar, str, str2, bool, aVar, cVar);
    }

    @Override // nb0.e
    public final Object c(String str, bl2.c cVar, boolean z13) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
            case 0:
                tVar.getClass();
                break;
            default:
                tVar.getClass();
                break;
        }
        return t.q(tVar, str, z13, cVar);
    }

    @Override // nb0.e
    public final Object d(String str, int i13, bl2.c cVar) {
        int i14 = this.f90331a;
        t tVar = this.f90332b;
        switch (i14) {
        }
        return tVar.d(str, i13, cVar);
    }

    @Override // nb0.e
    public final Object e(String str, long j13, bl2.c cVar) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
            case 0:
                tVar.getClass();
                break;
            default:
                tVar.getClass();
                break;
        }
        return t.t(tVar, str, j13, cVar);
    }

    @Override // nb0.e
    public final Object f(String str, long j13, bl2.c cVar) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
        }
        return tVar.f(str, j13, cVar);
    }

    @Override // nb0.e
    public final Object g(String str, String str2, int i13, com.pinterest.encryption.dataEncryptionLibrary.a aVar, Base64.Decoder decoder, bl2.c cVar) {
        int i14 = this.f90331a;
        t tVar = this.f90332b;
        switch (i14) {
            case 0:
                tVar.getClass();
                break;
            default:
                tVar.getClass();
                break;
        }
        return t.p(tVar, str, str2, aVar, decoder, cVar);
    }

    @Override // nb0.e
    public final Object h(String str, String str2, bl2.c cVar) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
            case 0:
                tVar.getClass();
                break;
            default:
                tVar.getClass();
                break;
        }
        return t.u(tVar, str, str2, cVar);
    }

    @Override // nb0.e
    public final Object i(String str, String str2, bl2.c cVar) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
        }
        return tVar.i(str, str2, cVar);
    }

    @Override // nb0.e
    public final Object j(String str, bl2.c cVar) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
            case 0:
                tVar.getClass();
                break;
            default:
                tVar.getClass();
                break;
        }
        return t.o(tVar, str, cVar);
    }

    @Override // nb0.e
    public final Object k(String str, Set set, bl2.c cVar) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
            case 0:
                tVar.getClass();
                break;
            default:
                tVar.getClass();
                break;
        }
        return t.v(tVar, str, set, cVar);
    }

    @Override // nb0.e
    public final Object l(String str, bl2.c cVar, boolean z13) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
        }
        return tVar.l(str, cVar, z13);
    }

    @Override // nb0.e
    public final Object m(String str, Set set, bl2.c cVar) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
        }
        return tVar.m(str, set, cVar);
    }

    @Override // nb0.e
    public final Object n(String str, bl2.c cVar) {
        int i13 = this.f90331a;
        t tVar = this.f90332b;
        switch (i13) {
        }
        return tVar.n(str, cVar);
    }
}
