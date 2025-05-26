package ek1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59264i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ az.b f59265j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(az.b bVar, int i13) {
        super(1);
        this.f59264i = i13;
        this.f59265j = bVar;
    }

    public final r b(r it) {
        switch (this.f59264i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return r.e(it, null, this.f59265j, null, false, null, 29);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f59264i) {
            case 0:
                return b((r) obj);
            case 1:
                r1 it = (r1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                az.c cVar = it.f59343e;
                h32.z1 z1Var = this.f59265j.f20694b;
                cVar.getClass();
                return r1.b(it, null, new az.c(z1Var), 0, null, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -17, 4194303);
            default:
                return b((r) obj);
        }
    }
}
