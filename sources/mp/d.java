package mp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87838i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f87839j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f87840k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f87841l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f87842m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, int i13, String str3) {
        super(1);
        this.f87839j = str;
        this.f87840k = str2;
        this.f87841l = i13;
        this.f87842m = str3;
    }

    public final rl1.q b(rl1.q it) {
        int i13 = this.f87838i;
        int i14 = this.f87841l;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = this.f87842m;
                return rl1.q.e(it, this.f87839j, this.f87840k, false, null, ep.b.x(str, "string", str), false, false, null, 0, new rl1.d(i14), null, 1516);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = this.f87839j;
                if (str2 == null) {
                    str2 = this.f87840k;
                }
                String str3 = str2;
                rl1.d dVar = new rl1.d(i14);
                return rl1.q.e(it, this.f87842m, str3, false, null, null, false, false, fm1.c.VISIBLE, 0, dVar, null, 1404);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f87838i) {
        }
        return b((rl1.q) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, String str3, int i13) {
        super(1);
        this.f87839j = str;
        this.f87840k = str2;
        this.f87842m = str3;
        this.f87841l = i13;
    }
}
