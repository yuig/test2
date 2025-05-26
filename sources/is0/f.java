package is0;

import android.content.Context;
import gb2.i;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import so.oa;
import wa2.o;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f73535j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f73536k = new f(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f f73537l = new f(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f f73538m = new f(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f f73539n = new f(4);

    /* renamed from: o, reason: collision with root package name */
    public static final f f73540o = new f(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73541i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f73541i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f73541i) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                i iVar = (i) CollectionsKt.d0(it);
                return Boolean.valueOf((iVar != null ? iVar.f64755c : null) != o.EVENT_ONLY);
        }
    }

    public final void e(Throwable th3) {
        switch (this.f73541i) {
            case 0:
                Context context = kb0.a.f79058b;
                i92.a.a(((oa) ((j92.a) ep.b.g(j92.a.class))).E2(), "Error: " + th3, false, 6);
                break;
            default:
                Context context2 = kb0.a.f79058b;
                i92.a.a(((oa) ((j92.a) ep.b.g(j92.a.class))).E2(), "Error: " + th3, false, 6);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73541i) {
            case 0:
                e((Throwable) obj);
                break;
            case 1:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof i)) {
                    break;
                } else {
                    break;
                }
            case 2:
                break;
            case 3:
                break;
            case 4:
                e((Throwable) obj);
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
