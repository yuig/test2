package l62;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r72.u1;
import r72.x1;
import r72.z1;

/* loaded from: classes4.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f0 f81632j = new f0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f0 f81633k = new f0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f0 f81634l = new f0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f0 f81635m = new f0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f0 f81636n = new f0(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81637i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i13) {
        super(1);
        this.f81637i = i13;
    }

    public final z1 b(z1 it) {
        switch (this.f81637i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return kh2.w.v(it, null, null, 0.0d, 0.0d, r72.k0.a(it.a(), false, false, !it.a().f106515c, false, 0.0f, null, null, null, null, 0.0d, 0.0d, null, 16379), 15);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return kh2.w.v(it, null, null, 0.0d, 0.0d, r72.k0.a(it.a(), false, false, false, !it.a().f106516d, 0.0f, null, null, null, null, 0.0d, 0.0d, null, 16375), 15);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof u1 ? u1.f((u1) it, null, null, 0.0d, 0.0d, null, null, null, null, null, null, null, x1.UPLOADING, null, 245759) : it;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return it instanceof u1 ? u1.f((u1) it, null, null, 0.0d, 0.0d, null, null, null, null, null, null, null, x1.FAILED, null, 245759) : it;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f81637i) {
            case 0:
                ((Number) obj).intValue();
                break;
        }
        return b((z1) obj);
    }
}
