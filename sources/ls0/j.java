package ls0;

import com.pinterest.api.model.oc;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f84655j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f84656k = new j(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84657i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f84657i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84657i) {
            case 0:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                HashMap hashMap = rw0.f.f110112b;
                rw0.e.f110110a.getClass();
                return new Pair(it, rw0.f.e());
            default:
                tt1.a response = (tt1.a) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                return (oc) response.c();
        }
    }
}
