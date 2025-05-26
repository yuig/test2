package ce1;

import em1.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f27601j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f27602k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f27603l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f27604m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f27605n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f27606o = new b(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27607i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f27607i = i13;
    }

    public final an1.b b(an1.b it) {
        switch (this.f27607i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return an1.b.e(it, false, fm1.c.VISIBLE, 11);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return an1.b.e(it, false, fm1.c.GONE, 11);
        }
    }

    public final d e(d it) {
        switch (this.f27607i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                em1.b bVar = it.f59598a;
                em1.b bVar2 = em1.b.CHECKED;
                if (bVar == bVar2) {
                    bVar2 = em1.b.UNCHECKED;
                }
                return d.e(it, bVar2, null, null, null, null, null, 0, null, false, 0, 1022);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                em1.b bVar3 = it.f59598a;
                em1.b bVar4 = em1.b.CHECKED;
                if (bVar3 == bVar4) {
                    bVar4 = em1.b.UNCHECKED;
                }
                return d.e(it, bVar4, null, null, null, null, null, 0, null, false, 0, 1022);
            case 2:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, fm1.c.VISIBLE, null, null, null, 0, null, false, 0, 1019);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, null, null, fm1.c.GONE, null, null, null, 0, null, false, 0, 1019);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f27607i) {
            case 0:
                return e((d) obj);
            case 1:
                return e((d) obj);
            case 2:
                return b((an1.b) obj);
            case 3:
                return e((d) obj);
            case 4:
                return b((an1.b) obj);
            default:
                return e((d) obj);
        }
    }
}
