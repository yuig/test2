package mx;

import com.pinterest.handshake.ui.webview.HandshakeWebView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lh0.l;
import pk.a0;
import pp1.n;
import qp1.k;
import qp1.o;
import qp1.s;
import qp1.z;

/* loaded from: classes3.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f88450r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f88451s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, bl2.c cVar) {
        super(2, cVar);
        this.f88451s = hVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f88451s, cVar);
        dVar.f88450r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((k) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        k kVar = (k) this.f88450r;
        ArrayList arrayList = kVar.f104797a;
        int i13 = h.f88457l0;
        h hVar = this.f88451s;
        hVar.getClass();
        Iterator it = arrayList.iterator();
        while (true) {
            int i14 = 1;
            if (!it.hasNext()) {
                hVar.a8().f104843e.e().a(o.f104814a);
                int i15 = 2;
                if (a.f88444a[kVar.f104798b.ordinal()] == 2) {
                    HandshakeWebView handshakeWebView = hVar.f88463h0;
                    if (handshakeWebView == null) {
                        Intrinsics.r("webview");
                        throw null;
                    }
                    if (handshakeWebView.f49729c.canGoBack()) {
                        HandshakeWebView handshakeWebView2 = hVar.f88463h0;
                        if (handshakeWebView2 == null) {
                            Intrinsics.r("webview");
                            throw null;
                        }
                        handshakeWebView2.e();
                    } else {
                        hVar.D5();
                        l lVar = hVar.f88459d0;
                        if (lVar == null) {
                            Intrinsics.r("experiment");
                            throw null;
                        }
                        if (lVar.a()) {
                            ((np1.i) hVar.Z7()).f91789a.a();
                        }
                    }
                    hVar.a8().f104843e.e().a(s.f104826a);
                }
                pp1.f Y7 = hVar.Y7();
                Y7.getClass();
                n displayState = kVar.f104799c;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                a0.q(Y7.f100921c, displayState.f100936a);
                a0.q(Y7.f100920b, displayState.f100937b);
                int i16 = 0;
                Y7.f100922d.d(new pp1.e(displayState, i16));
                Y7.f100923e.d(new pp1.e(displayState, i14));
                for (pp1.k kVar2 : displayState.f100941f) {
                    if (kVar2 instanceof pp1.i) {
                        hVar.c8(new c(hVar, kVar2, i16));
                    } else if (kVar2 instanceof pp1.g) {
                        hVar.c8(new c(hVar, kVar2, i14));
                    } else if (kVar2 instanceof pp1.h) {
                        hVar.c8(new c(hVar, kVar2, i15));
                    } else if (kVar2 instanceof pp1.j) {
                        hVar.c8(new b(hVar, i14));
                    }
                }
                return Unit.f80348a;
            }
            qp1.j jVar = (qp1.j) it.next();
            if (jVar instanceof qp1.e) {
                HandshakeWebView handshakeWebView3 = hVar.f88463h0;
                if (handshakeWebView3 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                handshakeWebView3.b(new rp1.b(hVar), hVar.a8().f104843e.e());
                hVar.f88464i0 = true;
                np1.j Z7 = hVar.Z7();
                HandshakeWebView handshakeWebView4 = hVar.f88463h0;
                if (handshakeWebView4 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                ((np1.i) Z7).e(handshakeWebView4);
                hVar.a8().f104843e.e().a(new z(System.currentTimeMillis() * 1000000));
                HandshakeWebView handshakeWebView5 = hVar.f88463h0;
                if (handshakeWebView5 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                qp1.e eVar = (qp1.e) jVar;
                handshakeWebView5.c(eVar.f104761a, eVar.f104763c, eVar.f104762b);
            } else if (jVar instanceof qp1.f) {
                hVar.b8(((qp1.f) jVar).f104773a);
            } else if (jVar instanceof qp1.d) {
                hVar.D5();
            } else if (jVar instanceof qp1.g) {
                HandshakeWebView handshakeWebView6 = hVar.f88463h0;
                if (handshakeWebView6 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                qp1.g gVar = (qp1.g) jVar;
                String str = gVar.f104779a;
                if (str == null) {
                    str = "";
                }
                handshakeWebView6.c(str, gVar.f104780b, null);
            } else if (jVar instanceof qp1.h) {
                HandshakeWebView handshakeWebView7 = hVar.f88463h0;
                if (handshakeWebView7 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                handshakeWebView7.d();
            } else if (jVar instanceof qp1.i) {
                np1.j Z72 = hVar.Z7();
                HandshakeWebView handshakeWebView8 = hVar.f88463h0;
                if (handshakeWebView8 == null) {
                    Intrinsics.r("webview");
                    throw null;
                }
                ((np1.i) Z72).e(handshakeWebView8);
            } else {
                continue;
            }
        }
    }
}
