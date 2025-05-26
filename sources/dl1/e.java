package dl1;

import java.util.concurrent.Callable;
import jk2.i2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f55208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f55209c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f55210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f55211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f55212f;

    public /* synthetic */ e(u uVar, boolean z13, l lVar, z zVar, l lVar2, int i13) {
        this.f55207a = i13;
        this.f55208b = uVar;
        this.f55209c = z13;
        this.f55210d = lVar;
        this.f55211e = zVar;
        this.f55212f = lVar2;
    }

    public final uj2.q a() {
        jk2.h0 h0Var = jk2.h0.f76488a;
        int i13 = 2;
        int i14 = this.f55207a;
        l lVar = this.f55210d;
        l lVar2 = this.f55212f;
        int i15 = 1;
        u uVar = this.f55208b;
        z zVar = this.f55211e;
        switch (i14) {
            case 0:
                if (!zVar.b(uVar, a.READ)) {
                    return h0Var;
                }
                i2 q13 = lVar2.q(uVar);
                final d dVar = new d(lVar, 0);
                return new jk2.x(q13, new ak2.g(dVar) { // from class: dl1.i

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Function1 f55232a;

                    {
                        Intrinsics.checkNotNullParameter(dVar, "function");
                        this.f55232a = dVar;
                    }

                    @Override // ak2.g
                    public final /* synthetic */ boolean test(Object obj) {
                        return ((Boolean) this.f55232a.invoke(obj)).booleanValue();
                    }
                }, i13);
            default:
                if (!zVar.a(uVar, a.READ)) {
                    return h0Var;
                }
                jk2.a0 p13 = lVar2.p(uVar, this.f55209c);
                final d dVar2 = new d(lVar, i15);
                return new jk2.x(p13, new ak2.g(dVar2) { // from class: dl1.i

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ Function1 f55232a;

                    {
                        Intrinsics.checkNotNullParameter(dVar2, "function");
                        this.f55232a = dVar2;
                    }

                    @Override // ak2.g
                    public final /* synthetic */ boolean test(Object obj) {
                        return ((Boolean) this.f55232a.invoke(obj)).booleanValue();
                    }
                }, i13);
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f55207a) {
        }
        return a();
    }
}
