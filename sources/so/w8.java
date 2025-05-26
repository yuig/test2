package so;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w8 implements bf2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114688a;

    /* renamed from: b, reason: collision with root package name */
    public final oa f114689b;

    /* renamed from: c, reason: collision with root package name */
    public final s8 f114690c;

    /* renamed from: d, reason: collision with root package name */
    public final int f114691d;

    /* renamed from: e, reason: collision with root package name */
    public final af2.a f114692e;

    public /* synthetic */ w8(oa oaVar, s8 s8Var, af2.a aVar, int i13, int i14) {
        this.f114688a = i14;
        this.f114689b = oaVar;
        this.f114690c = s8Var;
        this.f114692e = aVar;
        this.f114691d = i13;
    }

    @Override // wk2.a
    public final Object get() {
        Object dVar;
        int i13 = this.f114688a;
        int i14 = this.f114691d;
        switch (i13) {
            case 0:
                if (i14 == 0) {
                    return new v8(this);
                }
                throw new AssertionError(i14);
            default:
                af2.a aVar = this.f114692e;
                s8 s8Var = this.f114690c;
                oa oaVar = this.f114689b;
                switch (i14) {
                    case 0:
                        return new bb(this);
                    case 1:
                        dVar = new rf1.d((rf1.r) ((jb) aVar).f113487e.get(), (yk1.v) s8Var.C.get());
                        break;
                    case 2:
                        return new rf1.r((yk1.v) s8Var.C.get(), new lh0.u1((lh0.z0) s8Var.f114255d.D0.get()));
                    case 3:
                        return new cb(this);
                    case 4:
                        return new db(this);
                    case 5:
                        return new eb(this);
                    case 6:
                        return new pa(this, 1);
                    case 7:
                        return new fb(this);
                    case 8:
                        return new yh1.a((ac2.m) oaVar.C7.get());
                    case 9:
                        return new gb(this);
                    case 10:
                        return new hb(this);
                    case 11:
                        return new qi0.f();
                    case 12:
                        return new qi0.i();
                    case 13:
                        return new qi0.a();
                    case 14:
                        return new ib(this);
                    case 15:
                        return new kp0.d();
                    case 16:
                        return new au0.g(oaVar.f114018y8, oaVar.f113797m0);
                    case 17:
                        return new au0.j(oaVar.f114018y8, oaVar.f113797m0);
                    case 18:
                        return new ta();
                    case 19:
                        return new ll.j(this, 14);
                    case 20:
                        return new ua();
                    case 21:
                        return new ps1.a();
                    case 22:
                        return new va(this);
                    case 23:
                        return new wa(this);
                    case 24:
                        oa oaVar2 = ((jb) aVar).f113483a;
                        lb2.n accountSwitcher = (lb2.n) oaVar2.B6.get();
                        bf2.a userDeserializerProvider = oaVar2.f113905s3;
                        b60.b activeUserManager = (b60.b) oaVar2.f113850p0.get();
                        m60.w eventManager = (m60.w) oaVar2.f113885r0.get();
                        qb0.e networkUtils = (qb0.e) oaVar2.f113869q1.get();
                        mo1.d intentHelper = (mo1.d) oaVar2.D5.get();
                        i92.k toastUtils = (i92.k) oaVar2.f113921t1.get();
                        Intrinsics.checkNotNullParameter(accountSwitcher, "accountSwitcher");
                        Intrinsics.checkNotNullParameter(userDeserializerProvider, "userDeserializerProvider");
                        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
                        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                        Intrinsics.checkNotNullParameter(networkUtils, "networkUtils");
                        Intrinsics.checkNotNullParameter(intentHelper, "intentHelper");
                        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
                        jf2.c cVar = new jf2.c();
                        cVar.f75872a = accountSwitcher;
                        cVar.f75873b = userDeserializerProvider;
                        cVar.f75874c = activeUserManager;
                        cVar.f75875d = eventManager;
                        cVar.f75876e = networkUtils;
                        cVar.f75877f = intentHelper;
                        cVar.f75878g = toastUtils;
                        dVar = new xa1.a(cVar);
                        break;
                    case 25:
                        return new xa(this);
                    case 26:
                        return new ya(this);
                    case 27:
                        return new za(this);
                    case 28:
                        return new ab(this);
                    default:
                        throw new AssertionError(i14);
                }
                return dVar;
        }
    }
}
