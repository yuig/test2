package z00;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import x40.ej;
import x40.fg;
import x40.g1;
import x40.i3;
import x40.l1;

/* loaded from: classes.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f140513j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f140514k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f140515l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f140516m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f140517n = new a(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140518i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f140518i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f140518i) {
            case 0:
                String id3 = (String) obj;
                Intrinsics.checkNotNullParameter(id3, "id");
                return new g1(id3);
            case 1:
                String id4 = (String) obj;
                Intrinsics.checkNotNullParameter(id4, "id");
                return new l1(id4);
            case 2:
                String id5 = (String) obj;
                Intrinsics.checkNotNullParameter(id5, "id");
                return new i3(id5);
            case 3:
                String id6 = (String) obj;
                Intrinsics.checkNotNullParameter(id6, "id");
                return new fg(id6);
            default:
                String id7 = (String) obj;
                Intrinsics.checkNotNullParameter(id7, "id");
                return new ej(id7);
        }
    }
}
