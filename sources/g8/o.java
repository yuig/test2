package g8;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final q8.v f64357a;

    /* renamed from: d, reason: collision with root package name */
    public g7.e f64360d;

    /* renamed from: f, reason: collision with root package name */
    public l9.j f64362f;

    /* renamed from: g, reason: collision with root package name */
    public int f64363g;

    /* renamed from: h, reason: collision with root package name */
    public l8.f f64364h;

    /* renamed from: i, reason: collision with root package name */
    public s7.i f64365i;

    /* renamed from: j, reason: collision with root package name */
    public a10.e f64366j;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f64358b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f64359c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f64361e = true;

    public o(q8.q qVar, bk.f fVar) {
        this.f64357a = qVar;
        this.f64362f = fVar;
    }

    public final d0 a(int i13) {
        HashMap hashMap = this.f64359c;
        d0 d0Var = (d0) hashMap.get(Integer.valueOf(i13));
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = (d0) b(i13).get();
        l8.f fVar = this.f64364h;
        if (fVar != null) {
            d0Var2.c(fVar);
        }
        s7.i iVar = this.f64365i;
        if (iVar != null) {
            d0Var2.e(iVar);
        }
        a10.e eVar = this.f64366j;
        if (eVar != null) {
            d0Var2.g(eVar);
        }
        d0Var2.a(this.f64362f);
        d0Var2.f(this.f64361e);
        d0Var2.b(this.f64363g);
        hashMap.put(Integer.valueOf(i13), d0Var2);
        return d0Var2;
    }

    public final ok.g0 b(int i13) {
        ok.g0 g0Var;
        ok.g0 g0Var2;
        HashMap hashMap = this.f64358b;
        ok.g0 g0Var3 = (ok.g0) hashMap.get(Integer.valueOf(i13));
        if (g0Var3 != null) {
            return g0Var3;
        }
        final g7.e eVar = this.f64360d;
        eVar.getClass();
        if (i13 != 0) {
            final int i14 = 1;
            if (i13 != 1) {
                final int i15 = 2;
                if (i13 != 2) {
                    final int i16 = 3;
                    if (i13 == 3) {
                        g0Var = new m7.v(RtspMediaSource$Factory.class.asSubclass(d0.class), 5);
                    } else {
                        if (i13 != 4) {
                            throw new IllegalArgumentException(a.a.d("Unrecognized contentType: ", i13));
                        }
                        g0Var = new ok.g0() { // from class: g8.n
                            @Override // ok.g0
                            public final Object get() {
                                int i17 = i16;
                                g7.e eVar2 = eVar;
                                Object obj = this;
                                switch (i17) {
                                    case 0:
                                        return q.h((Class) obj, eVar2);
                                    case 1:
                                        return q.h((Class) obj, eVar2);
                                    case 2:
                                        return q.h((Class) obj, eVar2);
                                    default:
                                        return new u0(eVar2, ((o) obj).f64357a);
                                }
                            }
                        };
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(d0.class);
                    g0Var2 = new ok.g0() { // from class: g8.n
                        @Override // ok.g0
                        public final Object get() {
                            int i17 = i15;
                            g7.e eVar2 = eVar;
                            Object obj = asSubclass;
                            switch (i17) {
                                case 0:
                                    return q.h((Class) obj, eVar2);
                                case 1:
                                    return q.h((Class) obj, eVar2);
                                case 2:
                                    return q.h((Class) obj, eVar2);
                                default:
                                    return new u0(eVar2, ((o) obj).f64357a);
                            }
                        }
                    };
                }
            } else {
                final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(d0.class);
                g0Var2 = new ok.g0() { // from class: g8.n
                    @Override // ok.g0
                    public final Object get() {
                        int i17 = i14;
                        g7.e eVar2 = eVar;
                        Object obj = asSubclass2;
                        switch (i17) {
                            case 0:
                                return q.h((Class) obj, eVar2);
                            case 1:
                                return q.h((Class) obj, eVar2);
                            case 2:
                                return q.h((Class) obj, eVar2);
                            default:
                                return new u0(eVar2, ((o) obj).f64357a);
                        }
                    }
                };
            }
            g0Var = g0Var2;
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(d0.class);
            final int i17 = 0;
            g0Var = new ok.g0() { // from class: g8.n
                @Override // ok.g0
                public final Object get() {
                    int i172 = i17;
                    g7.e eVar2 = eVar;
                    Object obj = asSubclass3;
                    switch (i172) {
                        case 0:
                            return q.h((Class) obj, eVar2);
                        case 1:
                            return q.h((Class) obj, eVar2);
                        case 2:
                            return q.h((Class) obj, eVar2);
                        default:
                            return new u0(eVar2, ((o) obj).f64357a);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i13), g0Var);
        return g0Var;
    }
}
