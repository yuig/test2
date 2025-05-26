package d0;

import com.google.common.util.concurrent.c0;

/* loaded from: classes2.dex */
public final class u implements y {

    /* renamed from: a, reason: collision with root package name */
    public final h f53567a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f53568b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.l f53569c;

    /* renamed from: d, reason: collision with root package name */
    public final r4.l f53570d;

    /* renamed from: e, reason: collision with root package name */
    public r4.i f53571e;

    /* renamed from: f, reason: collision with root package name */
    public r4.i f53572f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53573g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f53574h = false;

    /* renamed from: i, reason: collision with root package name */
    public c0 f53575i;

    public u(h hVar, a0 a0Var) {
        final int i13 = 0;
        this.f53567a = hVar;
        this.f53568b = a0Var;
        this.f53569c = com.bumptech.glide.d.L(new r4.j(this) { // from class: d0.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f53566b;

            {
                this.f53566b = this;
            }

            @Override // r4.j
            public final Object C(r4.i iVar) {
                int i14 = i13;
                u uVar = this.f53566b;
                switch (i14) {
                    case 0:
                        uVar.f53571e = iVar;
                        return "CaptureCompleteFuture";
                    default:
                        uVar.f53572f = iVar;
                        return "RequestCompleteFuture";
                }
            }
        });
        final int i14 = 1;
        this.f53570d = com.bumptech.glide.d.L(new r4.j(this) { // from class: d0.t

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f53566b;

            {
                this.f53566b = this;
            }

            @Override // r4.j
            public final Object C(r4.i iVar) {
                int i142 = i14;
                u uVar = this.f53566b;
                switch (i142) {
                    case 0:
                        uVar.f53571e = iVar;
                        return "CaptureCompleteFuture";
                    default:
                        uVar.f53572f = iVar;
                        return "RequestCompleteFuture";
                }
            }
        });
    }

    public final void a() {
        com.bumptech.glide.d.v("The callback can only complete once.", !this.f53570d.f106128b.isDone());
        this.f53572f.b(null);
    }
}
