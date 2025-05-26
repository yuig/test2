package p11;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f98634j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f98635k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f98636l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f98637m = new a(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98638i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f98638i = i13;
    }

    public final yl1.b b(yl1.b it) {
        switch (this.f98638i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], ry1.f.add_link), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], ry1.f.date_time_picker_fragment_confirmation), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f98638i;
        switch (i13) {
            case 0:
                return b((yl1.b) obj);
            case 1:
                ln1.l bind = (ln1.l) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(ln1.e.LOADED);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind, "$this$bind");
                        bind.a(ln1.e.LOADING);
                        break;
                }
                return Unit.f80348a;
            case 2:
                ln1.l bind2 = (ln1.l) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(ln1.e.LOADED);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.a(ln1.e.LOADING);
                        break;
                }
                return Unit.f80348a;
            default:
                return b((yl1.b) obj);
        }
    }
}
