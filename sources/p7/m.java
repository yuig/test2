package p7;

import g7.a0;
import java.util.ArrayList;
import l8.x;
import n7.q0;

/* loaded from: classes.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    public final g7.e f99006a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99007b;

    /* renamed from: c, reason: collision with root package name */
    public final h8.g f99008c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f99009d;

    /* renamed from: e, reason: collision with root package name */
    public n f99010e;

    public m(g7.e eVar) {
        o5.a aVar = new o5.a(1);
        this.f99009d = false;
        this.f99010e = n.NEVER;
        this.f99008c = aVar;
        this.f99006a = eVar;
        this.f99007b = 1;
    }

    public final q a(x xVar, q7.c cVar, com.google.firebase.messaging.q qVar, int i13, int[] iArr, k8.t tVar, int i14, long j13, boolean z13, ArrayList arrayList, t tVar2, a0 a0Var, q0 q0Var, k0.a aVar) {
        g7.f a13 = this.f99006a.a();
        if (a0Var != null) {
            a13.f(a0Var);
        }
        return new q(this.f99008c, xVar, cVar, qVar, i13, iArr, tVar, i14, a13, j13, this.f99007b, z13, arrayList, tVar2, q0Var, aVar, this.f99009d, this.f99010e);
    }
}
