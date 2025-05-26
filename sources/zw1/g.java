package zw1;

import bx1.j;
import bx1.s;
import kotlin.jvm.internal.Intrinsics;
import m60.v;
import px1.l;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f142957b;

    public /* synthetic */ g(Object obj, int i13) {
        this.f142956a = i13;
        this.f142957b = obj;
    }

    @Override // m60.v
    public final void a(Object obj) {
        int i13 = this.f142956a;
        Object obj2 = this.f142957b;
        switch (i13) {
            case 0:
                i this$0 = (i) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (obj instanceof l) {
                    this$0.q3();
                    break;
                }
                break;
            default:
                s this$02 = (s) obj2;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (obj instanceof l) {
                    this$02.f24120g.e().a(j.f24108a);
                    break;
                }
                break;
        }
    }
}
