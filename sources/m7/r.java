package m7;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f86367a;

    /* renamed from: b */
    public final /* synthetic */ Object f86368b;

    public /* synthetic */ r(Object obj, int i13) {
        this.f86367a = i13;
        this.f86368b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable it) {
        int i13 = this.f86367a;
        Object obj = this.f86368b;
        switch (i13) {
            case 0:
                ((d7.d) obj).a(it);
                break;
            case 1:
                ((Handler) obj).post(it);
                break;
            default:
                ki2.a aVar = ((lg2.d) obj).f83279d;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                aVar.b(it);
                break;
        }
    }
}
