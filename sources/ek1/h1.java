package ek1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h1 f59239j = new h1(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h1 f59240k = new h1(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h1 f59241l = new h1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h1 f59242m = new h1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h1 f59243n = new h1(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h1 f59244o = new h1(5);

    /* renamed from: p, reason: collision with root package name */
    public static final h1 f59245p = new h1(6);

    /* renamed from: q, reason: collision with root package name */
    public static final h1 f59246q = new h1(7);

    /* renamed from: r, reason: collision with root package name */
    public static final h1 f59247r = new h1(8);

    /* renamed from: s, reason: collision with root package name */
    public static final h1 f59248s = new h1(9);

    /* renamed from: t, reason: collision with root package name */
    public static final h1 f59249t = new h1(10);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59250i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(int i13) {
        super(1);
        this.f59250i = i13;
    }

    public final r b(r it) {
        h32.z1 z1Var;
        switch (this.f59250i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return r.e(it, kotlin.collections.q0.f80391a, null, null, false, null, 30);
            case 1:
            case 2:
            case 5:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                az.b bVar = it.f59329b;
                h32.z1 source = bVar.f20694b;
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    z1Var = new h32.z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, Double.valueOf(-1.0d), source.f67500l, source.f67502m, Boolean.FALSE, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
                } else {
                    z1Var = null;
                }
                return r.e(it, null, az.b.e(bVar, null, z1Var, null, 5), null, false, null, 29);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return r.e(it, null, null, null, true, null, 23);
            case 4:
                Intrinsics.checkNotNullParameter(it, "existingMediaZoneDs");
                Iterator it2 = it.f59328a.iterator();
                int i13 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i13 = -1;
                    } else if (!(((wi1.b) it2.next()) instanceof yi1.l)) {
                        i13++;
                    }
                }
                if (i13 == -1) {
                    return it;
                }
                List list = it.f59328a;
                wi1.b bVar2 = (wi1.b) list.get(i13);
                Intrinsics.g(bVar2, "null cannot be cast to non-null type com.pinterest.featurelibrary.pingridcell.sba.view.piece.media.image.PinImageDisplayState");
                yi1.l e13 = yi1.l.e((yi1.l) bVar2, yi1.c.f139077a);
                ArrayList H0 = CollectionsKt.H0(list);
                H0.set(i13, e13);
                return r.e(it, H0, null, null, false, null, 30);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return r.e(it, CollectionsKt.m0(new ak1.b(new u50.b0(ni1.e0.f90644c), "possiblyAddLegoChinCTAPieces - GRID_CARD_PADDING_RES"), it.f59328a), null, null, false, null, 30);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return r.e(it, null, null, n.f59285a, false, null, 27);
        }
    }

    public final r1 e(r1 it) {
        switch (this.f59250i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, null, 0, yi1.a.LoadRequested, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -131073, 4194303);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, yi1.r.a(it.f59351m, true, null, 0L, 0L, false, false, null, 510), 0, yi1.a.SuccessfullyLoaded, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -135169, 4194303);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, e.f59228a, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -129, 4194303);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, it.f59351m, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -4097, 4194303);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return r1.b(it, null, null, 0, null, null, null, false, false, null, 0, null, d2.Is1PxVisible, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -262145, 4194303);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f59250i) {
            case 0:
                return b((r) obj);
            case 1:
                return e((r1) obj);
            case 2:
                return e((r1) obj);
            case 3:
                return b((r) obj);
            case 4:
                return b((r) obj);
            case 5:
                return e((r1) obj);
            case 6:
                return b((r) obj);
            case 7:
                return b((r) obj);
            case 8:
                return e((r1) obj);
            case 9:
                return e((r1) obj);
            default:
                return b((r) obj);
        }
    }
}
