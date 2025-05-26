package n7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements d7.r, uj2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f89404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f89405c;

    public /* synthetic */ d(Object obj, boolean z13, int i13) {
        this.f89403a = i13;
        this.f89404b = obj;
        this.f89405c = z13;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f89403a;
        boolean z13 = this.f89405c;
        b bVar = (b) this.f89404b;
        c cVar = (c) obj;
        switch (i13) {
            case 0:
                cVar.getClass();
                cVar.D(bVar, z13);
                break;
            default:
                cVar.q(bVar, z13);
                break;
        }
    }

    @Override // uj2.e
    public final void n(fk2.f emitter) {
        ir1.e this$0 = (ir1.e) this.f89404b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this$0.f84602b.H3(new ir1.d(this$0, this.f89405c, emitter));
    }
}
