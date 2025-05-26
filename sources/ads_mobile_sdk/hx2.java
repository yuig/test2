package ads_mobile_sdk;

import android.webkit.WebSettings;
import ao2.j0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class hx2 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ix2 f6137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx2(ix2 ix2Var, bl2.c cVar) {
        super(1, cVar);
        this.f6137a = ix2Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new hx2(this.f6137a, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new hx2(this.f6137a, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ix2 ix2Var = this.f6137a;
        sb2 sb2Var = ix2Var.f6577e;
        if (sb2Var == null) {
            Intrinsics.r("rootTraceCreator");
            throw null;
        }
        il0 il0Var = il0.CUI_NAME_WEBVIEW_USER_AGENT;
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        ss2 ss2Var = new ss2(new o52(), new v01(), new k72(), new g5());
        if (qs2.b().f9801a == null) {
            p12 a13 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
            try {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(ix2Var.f6573a);
                if (defaultUserAgent instanceof jk0) {
                    ft2.a((jk0) defaultUserAgent);
                }
                dl2.b.J(a13, null);
                str = defaultUserAgent;
            } catch (Throwable th3) {
                try {
                    a13.b(th3);
                    if (th3 instanceof a.jf) {
                        throw th3;
                    }
                    a13.a(th3);
                    if (th3 instanceof TimeoutCancellationException) {
                        throw new xl0(th3);
                    }
                    if (th3 instanceof CancellationException) {
                        throw new yj0(th3);
                    }
                    if (th3 instanceof uk0) {
                        throw th3;
                    }
                    throw new dk0(th3);
                } finally {
                }
            }
        } else {
            cs2 a14 = qs2.a(il0Var, q0Var, true);
            try {
                String defaultUserAgent2 = WebSettings.getDefaultUserAgent(ix2Var.f6573a);
                if (defaultUserAgent2 instanceof jk0) {
                    ft2.a((jk0) defaultUserAgent2);
                }
                dl2.b.J(a14, null);
                str = defaultUserAgent2;
            } catch (Throwable th4) {
                try {
                    a14.b(th4);
                    if (th4 instanceof a.jf) {
                        throw th4;
                    }
                    a14.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new xl0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new yj0(th4);
                    }
                    if (th4 instanceof uk0) {
                        throw th4;
                    }
                    throw new dk0(th4);
                } finally {
                }
            }
        }
        ix2 ix2Var2 = this.f6137a;
        j0 j0Var = ix2Var2.f6576d;
        if (j0Var == null) {
            Intrinsics.r("backgroundScope");
            throw null;
        }
        gx2 block = new gx2(ix2Var2, str, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
        return str;
    }
}
