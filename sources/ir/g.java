package ir;

import com.pinterest.activity.task.activity.MainActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements wk2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73458a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f73459b;

    public /* synthetic */ g(Object obj, int i13) {
        this.f73458a = i13;
        this.f73459b = obj;
    }

    @Override // wk2.a
    public final Object get() {
        int i13 = this.f73458a;
        Object obj = this.f73459b;
        switch (i13) {
            case 0:
                MainActivity this$0 = (MainActivity) obj;
                bk.f fVar = MainActivity.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new w(this$0);
            default:
                yq0.t this$02 = (yq0.t) obj;
                int i14 = yq0.t.f139730t0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                return this$02.g8();
        }
    }
}
