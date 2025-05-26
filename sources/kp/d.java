package kp;

import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;
import x02.x0;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f80533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f80534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f80535d;

    public /* synthetic */ d(m mVar, int i13, String str) {
        this.f80532a = 0;
        this.f80535d = mVar;
        this.f80534c = i13;
        this.f80533b = str;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f80532a;
        int i14 = this.f80534c;
        String contactRequestId = this.f80533b;
        Object obj = this.f80535d;
        switch (i13) {
            case 0:
                m this$0 = (m) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(contactRequestId, "$contactRequestId");
                this$0.f80547b.d(new g(i14, null, contactRequestId));
                ek2.f fVar = this$0.f80557l;
                if (fVar != null) {
                    bk2.c.dispose(fVar);
                    break;
                }
                break;
            default:
                x0 this$02 = (x0) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(contactRequestId, "$boardId");
                v7 v7Var = (v7) this$02.O(contactRequestId);
                if (v7Var != null) {
                    u7 G1 = v7Var.G1();
                    G1.E(Integer.valueOf(v7Var.l1().intValue() + i14));
                    this$02.W(G1.a());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(x0 x0Var, String str) {
        this.f80532a = 1;
        this.f80535d = x0Var;
        this.f80533b = str;
        this.f80534c = 1;
    }
}
