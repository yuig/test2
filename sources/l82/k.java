package l82;

import kotlin.jvm.internal.Intrinsics;
import o82.q1;

/* loaded from: classes4.dex */
public final class k implements u50.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u50.r f82230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f82231c;

    public /* synthetic */ k(u50.r rVar, Object obj, int i13) {
        this.f82229a = i13;
        this.f82230b = rVar;
        this.f82231c = obj;
    }

    @Override // u50.r
    public final void a(Object event) {
        int i13 = this.f82229a;
        u50.r rVar = this.f82230b;
        Object obj = this.f82231c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                rVar.a(((f) obj).E((u50.s) event));
                break;
            default:
                Intrinsics.checkNotNullParameter(event, "event");
                rVar.a(new o82.f0(((o82.h0) obj).f93607a, (q1) event));
                break;
        }
    }
}
