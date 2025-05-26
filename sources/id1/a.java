package id1;

import et1.v0;
import kotlin.jvm.internal.Intrinsics;
import nr0.m;
import qa2.n;
import so.n6;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements wk2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f72139b;

    public /* synthetic */ a(Object obj, int i13) {
        this.f72138a = i13;
        this.f72139b = obj;
    }

    @Override // wk2.a
    public final Object get() {
        int i13 = this.f72138a;
        Object obj = this.f72139b;
        switch (i13) {
            case 0:
                g this$0 = (g) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                m mVar = this$0.f72154b;
                wk1.c cVar = this$0.f72153a.f72162a;
                uk1.d dVar = cVar.f130130a;
                n nVar = cVar.f130131b;
                return ((n6) mVar).a(dVar, nVar.f103320a, nVar, cVar.f130137h);
            default:
                v0 this$02 = (v0) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                return new v0(this$02.f60109a);
        }
    }
}
