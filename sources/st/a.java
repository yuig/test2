package st;

import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tb0.g;
import tb0.h;
import tb0.p;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f115148j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f115149k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f115150l = new a(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115151i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f115151i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f115151i;
        switch (i13) {
            case 0:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                f3 z33 = it.z3();
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        HashSet hashSet = h.f117076w;
                        g.f117075a.q(th3, "error on load data", p.COLLECTIONS_ADS);
                        break;
                }
                break;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 1:
                        HashSet hashSet2 = h.f117076w;
                        g.f117075a.q(th4, "error on load data", p.COLLECTIONS_ADS);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
