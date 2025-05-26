package qg2;

import android.content.Intent;
import android.util.Log;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import di2.p;
import io.embrace.android.embracesdk.internal.comms.delivery.PendingApiCalls;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.util.HashSet;
import jp2.w;
import kh2.j2;
import kh2.o0;
import kh2.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import org.chromium.net.ProxyChangeListener;
import org.chromium.net.impl.CronetUrlRequestContext;
import org.chromium.net.v;
import pg2.n;
import pg2.s;
import rl2.u;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f103860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f103861c;

    public /* synthetic */ f(int i13, Object obj, Object obj2) {
        this.f103859a = i13;
        this.f103860b = obj;
        this.f103861c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v extractNewProxy;
        int i13 = this.f103859a;
        Object obj = this.f103861c;
        Object obj2 = this.f103860b;
        switch (i13) {
            case 0:
                ((e) ((g) obj2).f103862a).a((PendingApiCalls) obj, "failed_api_calls.json", PendingApiCalls.class);
                return;
            case 1:
                ((e) ((g) obj2).f103862a).b((String) obj);
                return;
            case 2:
                j2 j2Var = (j2) obj2;
                o0 o0Var = (o0) obj;
                try {
                    c0.d.M2("network-connectivity-registration");
                    bg2.a aVar = (bg2.a) ((r0) j2Var.g()).c();
                    aVar.getClass();
                    aVar.f22786b.b(new s81.g(aVar, 25));
                    Unit unit = Unit.f80348a;
                    c0.d.N();
                    try {
                        c0.d.M2("network-connectivity-listeners");
                        r0 r0Var = (r0) o0Var;
                        bg2.c c13 = r0Var.c();
                        u[] uVarArr = r0.f79668m;
                        ((bg2.a) c13).a((j) r0Var.f79675g.a(r0Var, uVarArr[4]));
                        pg2.j jVar = (pg2.j) r0Var.f79676h.a(r0Var, uVarArr[5]);
                        if (jVar != null) {
                            ((bg2.a) r0Var.c()).a(jVar);
                        }
                        return;
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 3:
                Function0 function0 = (Function0) obj2;
                zh2.a aVar2 = (zh2.a) obj;
                try {
                    c0.d.M2("snapshot-session");
                    try {
                        function0.invoke();
                    } catch (Exception e13) {
                        ((lh2.e) aVar2.f141976b).b(lh2.g.FG_SESSION_CACHE_FAIL, e13);
                    }
                    Unit unit2 = Unit.f80348a;
                    return;
                } finally {
                }
            case 4:
                Envelope envelope = (Envelope) obj;
                i iVar = (i) ((p) obj2).f55110b;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(envelope, "logEnvelope");
                n nVar = (n) iVar.f103869b;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(envelope, "logEnvelope");
                l0 l0Var = k0.f80436a;
                rl2.d clz = l0Var.b(Envelope.class);
                rl2.d another = l0Var.b(LogPayload.class);
                Intrinsics.checkNotNullParameter(clz, "clz");
                Intrinsics.checkNotNullParameter(another, "another");
                Util$ParameterizedTypeImpl Z = kg.a.Z(lb.l0.t0(clz), lb.l0.t0(another));
                Intrinsics.checkNotNullExpressionValue(Z, "newParameterizedType(clz.java, another.java)");
                pg2.b bVar = (pg2.b) nVar.f100136e.getValue();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(envelope, "envelope");
                Object obj3 = bVar.f100120d.get(s.LOGS);
                if (obj3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                nVar.f100135d.b(bVar.a((String) obj3), new fn1.k(nVar, envelope, Z, 22), true);
                return;
            case 5:
                int i14 = jo2.i.f77237d;
                ((ao2.m) obj2).i((jo2.i) obj, Unit.f80348a);
                return;
            case 6:
            case 7:
            case 9:
            default:
                Runnable runnable = (Runnable) obj2;
                w wVar = (w) obj;
                HashSet hashSet = CronetUrlRequestContext.f97414w;
                try {
                    try {
                        runnable.run();
                        if (wVar == null) {
                            return;
                        }
                    } catch (Throwable th3) {
                        if (wVar != null) {
                            wVar.a();
                        }
                        throw th3;
                    }
                } catch (Exception e14) {
                    Log.e("cr_CronetUrlRequestContext", "Exception thrown from observation task", e14);
                    if (wVar == null) {
                        return;
                    }
                }
                wVar.a();
                return;
            case 8:
                ((ProxyChangeListener) obj2).lambda$updateProxyConfigFromConnectivityManager$1((Intent) obj);
                return;
            case 10:
                ProxyChangeListener proxyChangeListener = ProxyChangeListener.this;
                extractNewProxy = ProxyChangeListener.extractNewProxy((Intent) obj);
                proxyChangeListener.proxySettingsChanged(extractNewProxy);
                return;
        }
    }
}
