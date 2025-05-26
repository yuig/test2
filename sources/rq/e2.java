package rq;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109149i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f109150j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f109151k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(int i13, String str) {
        super(1);
        this.f109149i = 5;
        this.f109151k = i13;
        this.f109150j = str;
    }

    public final rl1.q b(rl1.q it) {
        int i13 = this.f109149i;
        int i14 = this.f109151k;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, this.f109150j, null, true, null, null, false, false, fm1.c.VISIBLE, 0, new rl1.d(i14), null, 1402);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, this.f109150j, null, false, null, null, false, false, null, 0, new rl1.d(i14), null, 1534);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f109149i;
        int i14 = this.f109151k;
        String str = this.f109150j;
        switch (i13) {
            case 0:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, null, null, null, 0, null, null, null, null, false, this.f109151k, null, null, null, null, null, false, null, null, 2095102);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, kotlin.collections.e0.b(vn1.b.START), i14 == 0 ? kotlin.collections.e0.b(vn1.e.BOLD) : kotlin.collections.q0.f80391a, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097122);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), vn1.c.DEFAULT, null, null, vn1.g.BODY_300, this.f109151k, fm1.c.VISIBLE, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096908);
            case 3:
                return rn1.a.y(it, jq.b.p(it, "it", str, "string", str), null, kotlin.collections.e0.b(vn1.b.START), i14 == 0 ? kotlin.collections.e0.b(vn1.e.BOLD) : kotlin.collections.q0.f80391a, vn1.g.BODY_200, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, fm1.b.LOCALE, 1048546);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, vn1.g.BODY_100, this.f109151k, d7.b.Z(str.length() > 0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097038);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f109149i) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return e((rn1.a) obj);
            case 2:
                return e((rn1.a) obj);
            case 3:
                return e((rn1.a) obj);
            case 4:
                d6.b it = (d6.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                d6.g key = d7.b.c0(this.f109150j);
                Integer valueOf = Integer.valueOf(this.f109151k);
                it.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                it.c(key, valueOf);
                return Unit.f80348a;
            case 5:
                return b((rl1.q) obj);
            case 6:
                return e((rn1.a) obj);
            default:
                return b((rl1.q) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(String str, int i13, int i14) {
        super(1);
        this.f109149i = i14;
        this.f109150j = str;
        this.f109151k = i13;
    }
}
