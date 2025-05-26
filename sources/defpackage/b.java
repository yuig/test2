package defpackage;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rl1.d;
import u50.f0;
import wm1.c;
import wm1.n;
import wm1.q;
import wm1.u;

/* loaded from: classes2.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20701i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f20702j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ wy0 f20703k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wy0 wy0Var, String str) {
        super(1);
        this.f20703k = wy0Var;
        this.f20702j = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20701i;
        wy0 wy0Var = this.f20703k;
        switch (i13) {
            case 0:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String t03 = dl2.b.t0(wy0Var);
                String string = this.f20702j;
                u startItem = new u(t03, string);
                Intrinsics.checkNotNullParameter(string, "string");
                f0 f0Var = new f0(string);
                String string2 = "@" + wy0Var.z4();
                Intrinsics.checkNotNullParameter(string2, "string");
                q middleItem = new q(f0Var, new f0(string2), false, 4);
                boolean z13 = it.f130267a;
                Intrinsics.checkNotNullParameter(startItem, "startItem");
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                n endItem = it.f130270d;
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                fm1.c visibility = it.f130271e;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                return new c(z13, startItem, middleItem, endItem, visibility, it.f130272f, it.f130273g);
            default:
                rl1.q it2 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rl1.q.e(it2, this.f20702j, null, false, null, null, false, false, null, 0, new d(wy0Var.q2().intValue()), null, 1534);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, wy0 wy0Var) {
        super(1);
        this.f20702j = str;
        this.f20703k = wy0Var;
    }
}
