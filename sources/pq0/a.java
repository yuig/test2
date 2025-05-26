package pq0;

import com.pinterest.api.model.mv;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f100983j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f100984k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100985i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f100985i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f100985i;
        switch (i13) {
            case 0:
                mv it = (mv) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return it;
                }
            default:
                mv it2 = (mv) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2;
                }
        }
    }
}
