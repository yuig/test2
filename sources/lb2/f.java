package lb2;

import com.pinterest.api.model.deserializer.UserDeserializer;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f82757b;

    public /* synthetic */ f(n nVar, int i13) {
        this.f82756a = i13;
        this.f82757b = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f82756a;
        n this$0 = this.f82757b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Object obj = this$0.f82783a.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return b0.j(com.bumptech.glide.c.a0((UserDeserializer) obj));
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Object obj2 = this$0.f82783a.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return uj2.q.w(com.bumptech.glide.c.a0((UserDeserializer) obj2));
        }
    }
}
