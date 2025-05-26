package ir;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final r f73475j = new r(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r f73476k = new r(1);

    /* renamed from: l, reason: collision with root package name */
    public static final r f73477l = new r(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73478i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i13) {
        super(1);
        this.f73478i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73478i;
        switch (i13) {
            case 0:
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return null;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return null;
                }
            case 1:
                View it2 = (View) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return null;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return null;
                }
            default:
                return Unit.f80348a;
        }
    }
}
