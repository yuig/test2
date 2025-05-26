package ads_mobile_sdk;

import ao2.j0;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class nz2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.ce f9073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pz2 f9074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ss2 f9075c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz f9076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f9077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l03 f9078f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz2(a.ce ceVar, pz2 pz2Var, ss2 ss2Var, dz dzVar, String str, l03 l03Var, bl2.c cVar) {
        super(2, cVar);
        this.f9073a = ceVar;
        this.f9074b = pz2Var;
        this.f9075c = ss2Var;
        this.f9076d = dzVar;
        this.f9077e = str;
        this.f9078f = l03Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new nz2(this.f9073a, this.f9074b, this.f9075c, this.f9076d, this.f9077e, this.f9078f, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nz2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cs2 cs2Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        il0 il0Var = il0.CUI_NAME_WEBVIEW_INITIALIZATION;
        pz2 pz2Var = this.f9074b;
        dz dzVar = this.f9076d;
        String str = this.f9077e;
        l03 l03Var = this.f9078f;
        WeakHashMap weakHashMap = qs2.f10249a;
        cs2 a13 = qs2.a(il0Var, kotlin.collections.q0.f80391a, false);
        try {
        } catch (Throwable th3) {
            th = th3;
            cs2Var = a13;
        }
        try {
            ym0 ym0Var = new ym0(pz2Var.f9865d, pz2Var.f9864c, pz2Var.f9863b, dzVar, pz2Var.f9868g, pz2Var.f9867f, pz2Var.f9862a, str, l03Var, new a.l4(), pz2Var.f9871j, pz2Var.f9873l);
            if (ym0Var instanceof jk0) {
                ft2.a((jk0) ym0Var);
            }
            dl2.b.J(a13, null);
            a.ce ceVar = this.f9073a;
            if (ceVar == null) {
                pz2 pz2Var2 = this.f9074b;
                ceVar = new b03(ym0Var, pz2Var2.f9866e, this.f9075c, pz2Var2.f9869h, pz2Var2.f9863b, pz2Var2.f9873l);
            }
            pz2 pz2Var3 = this.f9074b;
            kn0 client = new kn0(ceVar, ym0Var, pz2Var3.f9863b, pz2Var3.f9869h, pz2Var3.f9867f, pz2Var3.f9873l);
            a.r6 r6Var = this.f9074b.f9872k;
            ss2 ss2Var = this.f9075c;
            ly0 ly0Var = ((ky0) r6Var).f7560a;
            ym0Var.addJavascriptInterface(new iy0(ym0Var, ss2Var, (sb2) ly0Var.f8025a.get(), (y4) ly0Var.f8026b.get()), "googleAdsJsInterface");
            Intrinsics.checkNotNullParameter(client, "client");
            ym0Var.setWebViewClient(client);
            Intrinsics.checkNotNullParameter(client, "<set-?>");
            ym0Var.f14337w = client;
            Intrinsics.checkNotNullParameter(ceVar, "<set-?>");
            ym0Var.f14336v = ceVar;
            return ym0Var;
        } catch (Throwable th4) {
            th = th4;
            cs2Var = a13;
            try {
                cs2Var.b(th);
                if (th instanceof a.jf) {
                    throw th;
                }
                cs2Var.a(th);
                if (th instanceof TimeoutCancellationException) {
                    throw new xl0(th);
                }
                if (th instanceof CancellationException) {
                    throw new yj0(th);
                }
                if (th instanceof uk0) {
                    throw th;
                }
                throw new dk0(th);
            } finally {
            }
        }
    }
}
