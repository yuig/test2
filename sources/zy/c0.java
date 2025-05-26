package zy;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.v0;
import h32.w0;
import h32.x3;
import java.util.ArrayList;
import java.util.HashMap;
import k1.s2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.i1;
import nx.t0;

/* loaded from: classes.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k0 f143061r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f143062s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(k0 k0Var, d0 d0Var, bl2.c cVar) {
        super(2, cVar);
        this.f143061r = k0Var;
        this.f143062s = d0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f143061r, this.f143062s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        nx.o0 o0Var;
        w0 w0Var;
        d4 d4Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        k0 k0Var = this.f143061r;
        boolean z13 = k0Var instanceof j0;
        d0 d0Var = this.f143062s;
        if (z13) {
            j0 j0Var = (j0) k0Var;
            h32.i0 i0Var = j0Var.f143082a;
            String str = j0Var.f143083b;
            n0 n0Var = d0Var.f143069f;
            h32.i0 z03 = com.bumptech.glide.d.z0(n0Var.f143096a, new s2(i0Var, 28));
            Intrinsics.checkNotNullParameter(z03, "<set-?>");
            n0Var.f143096a = z03;
            n0Var.f143097b = str;
        } else if (k0Var instanceof h0) {
            h0 h0Var = (h0) k0Var;
            d0.k(d0Var, h0Var.getAuxData(), h0Var.j());
        } else if (k0Var instanceof g0) {
            g0 g0Var = (g0) k0Var;
            HashMap auxData = g0Var.getAuxData();
            auxData.put("nav_target", g0Var.j());
            rd.j jVar = d0Var.f143065b;
            n0 provider = d0Var.l();
            jVar.getClass();
            Intrinsics.checkNotNullParameter(provider, "contextProvider");
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            nx.l0 l0Var = (nx.l0) ((t0) jVar.f107506b);
            l0Var.getClass();
            Intrinsics.checkNotNullParameter(provider, "contextProvider");
            h32.i0 source = provider.generateLoggingContext();
            if (source != null) {
                nx.o0 o0Var2 = (nx.o0) l0Var.f92420a;
                o0Var2.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                ArrayList arrayList = o0Var2.f92438a;
                if (arrayList.contains(provider)) {
                    Intrinsics.checkNotNullParameter(provider, "provider");
                    arrayList.remove(provider);
                }
                arrayList.add(0, provider);
                ((m60.d) l0Var.f92422c).g();
                Intrinsics.checkNotNullParameter(source, "source");
                x3 x3Var = source.f67083c;
                String str2 = x3Var != null ? x3Var.f67402f : null;
                boolean z14 = provider instanceof i1;
                h32.g0 g0Var2 = source.f67084d;
                if (z14) {
                    i1 i1Var = (i1) provider;
                    w0Var = i1Var.e();
                    HashMap f63135d0 = i1Var.getF63135d0();
                    if (f63135d0 != null) {
                        auxData.putAll(f63135d0);
                    }
                    if (g0Var2 == null) {
                        g0Var2 = i1Var.b2();
                    }
                } else {
                    w0Var = null;
                }
                d4 d4Var2 = source.f67081a;
                a4 a4Var = source.f67082b;
                x3 x3Var2 = source.f67083c;
                h32.d0 d0Var2 = source.f67085e;
                h32.i0 source2 = new h32.i0(d4Var2, a4Var, x3Var2, g0Var2, d0Var2, source.f67086f);
                if (w0Var != null) {
                    if (Intrinsics.d(w0Var.A, Boolean.TRUE)) {
                        f1 f1Var = f1.VIEW;
                        v0 v0Var = new v0(w0Var);
                        AdvertisingIdClient.Info a13 = l0Var.f92425f.a();
                        String id3 = a13 != null ? a13.getId() : null;
                        if (a13 != null && id3 != null && id3.length() != 0) {
                            auxData.put("advertising_identifier", id3);
                            String bool = Boolean.toString(!a13.isLimitAdTrackingEnabled());
                            Intrinsics.checkNotNullExpressionValue(bool, "toString(...)");
                            auxData.put("advertising_tracking_enabled", bool);
                        }
                        Intrinsics.checkNotNullParameter(source2, "source");
                        d4Var = d4Var2;
                        t0.b(l0Var, new h32.i0(d4Var2, a4Var, x3Var2, g0Var2, d0Var2, null), f1Var, str2, null, auxData, v0Var, false, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
                        dl2.b.a3(d4Var, a4Var);
                    }
                }
                d4Var = d4Var2;
                t0.b(l0Var, source2, f1.VIEW, str2, null, auxData, w0Var != null ? new v0(w0Var) : null, false, RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY);
                dl2.b.a3(d4Var, a4Var);
            }
        } else if (k0Var instanceof i0) {
            o0Var = d0Var.f143067d;
            n0 provider2 = d0Var.l();
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(provider2, "provider");
            o0Var.f92438a.remove(provider2);
        } else if (k0Var instanceof e0) {
            d0Var.f143065b.n(((e0) k0Var).j());
        } else if (k0Var instanceof f0) {
            d0Var.f143065b.p(((f0) k0Var).j());
        }
        return Unit.f80348a;
    }
}
