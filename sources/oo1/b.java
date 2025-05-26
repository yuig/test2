package oo1;

import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import z40.d0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final bp1.c f96828a;

    /* renamed from: b, reason: collision with root package name */
    public final List f96829b;

    /* renamed from: c, reason: collision with root package name */
    public final List f96830c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.pinterest.api.model.wy0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, z40.d0] */
    public b(bp1.c cVar) {
        ?? r03;
        List A;
        bp1.g gVar;
        this.f96828a = cVar;
        if (cVar instanceof m) {
            List<??> j13 = kh2.d.j1(((m) cVar).f96860b);
            r03 = new ArrayList(g0.q(j13, 10));
            for (?? user : j13) {
                Intrinsics.checkNotNullParameter(user, "user");
                if (user instanceof d0) {
                    gVar = new bp1.g(new bp1.d(user));
                } else {
                    if (!(user instanceof wy0)) {
                        throw new IllegalArgumentException("User type not allowed " + user);
                    }
                    gVar = new bp1.g(new bp1.e((wy0) user));
                }
                r03.add(gVar);
            }
        } else {
            if (!(cVar instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            List<??> G = ((n) cVar).f96861b.G();
            if (G != null) {
                r03 = new ArrayList();
                for (?? user2 : G) {
                    Intrinsics.f(user2);
                    Intrinsics.checkNotNullParameter(user2, "user");
                    r03.add(user2 instanceof d0 ? new bp1.g(new bp1.d((d0) user2)) : new bp1.g(new bp1.e(user2)));
                }
            } else {
                r03 = q0.f80391a;
            }
        }
        this.f96829b = r03;
        bp1.c cVar2 = this.f96828a;
        if (cVar2 instanceof m) {
            A = ((m) cVar2).f96860b.h();
            if (A == null) {
                A = q0.f80391a;
            }
        } else {
            if (!(cVar2 instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            A = ((n) cVar2).f96861b.A();
            if (A == null) {
                A = q0.f80391a;
            }
        }
        this.f96830c = A;
        bp1.c cVar3 = this.f96828a;
        if (cVar3 instanceof m) {
            ((m) cVar3).f96860b.getClass();
        } else {
            if (!(cVar3 instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(((n) cVar3).f96861b.getUid(), "getUid(...)");
        }
    }
}
