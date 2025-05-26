package y72;

import android.graphics.PointF;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import ld2.c;
import ld2.d;
import ld2.e;
import ld2.g;
import pd2.l0;
import pd2.o0;
import pd2.r0;
import r72.a0;
import r72.b0;
import r72.c0;
import r72.d0;
import r72.e0;
import r72.f;
import r72.f0;
import r72.h;
import r72.h0;
import r72.i;
import r72.i0;
import r72.j;
import r72.j0;
import r72.k;
import r72.l;
import r72.m;
import r72.n;
import r72.o;
import r72.q;
import r72.r;
import r72.s;
import r72.t;
import r72.u;
import r72.v;
import r72.w;
import r72.x;
import r72.y;
import r72.z;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f138018a;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f138019b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f138020c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f138021d;

    static {
        Intrinsics.checkNotNullParameter("shuffle-canvas", "tag");
        Set<c> f13 = h1.f(c.Opacity, c.AlphaGradient, c.TransparentHighlights, c.TransparentShadows);
        ArrayList arrayList = new ArrayList(g0.q(f13, 10));
        for (c cVar : f13) {
            x72.b bVar = x72.b.f134124d;
            if (bVar == null) {
                Intrinsics.r("current");
                throw null;
            }
            arrayList.add(bVar.y(cVar).f94185a);
        }
        f138018a = CollectionsKt.J0(arrayList);
        Set<Enum> f14 = h1.f(d.Wobbly, d.Watery, d.Floaty, d.Shaky, d.Slide, d.Pulse, d.Swivel, d.Rotation, d.LavaLamp, c.Fade, g.Carousel, g.Glitch, g.Echo);
        ArrayList arrayList2 = new ArrayList(g0.q(f14, 10));
        for (Enum r53 : f14) {
            x72.b bVar2 = x72.b.f134124d;
            if (bVar2 == null) {
                Intrinsics.r("current");
                throw null;
            }
            arrayList2.add(bVar2.a(r53).f94185a);
        }
        f138019b = CollectionsKt.J0(arrayList2);
        Set<e> f15 = h1.f(e.Shadow, e.Border, e.Stamp, e.TornPaper);
        ArrayList arrayList3 = new ArrayList(g0.q(f15, 10));
        for (e eVar : f15) {
            x72.b bVar3 = x72.b.f134124d;
            if (bVar3 == null) {
                Intrinsics.r("current");
                throw null;
            }
            arrayList3.add(bVar3.t(eVar).f90426a);
        }
        f138020c = CollectionsKt.J0(arrayList3);
        q[] values = q.values();
        ArrayList arrayList4 = new ArrayList(values.length);
        for (q qVar : values) {
            arrayList4.add(qVar.getType());
        }
        f138021d = CollectionsKt.J0(arrayList4);
    }

    public static od2.d a(r72.g effect) {
        c cVar;
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (effect instanceof r72.b) {
            cVar = c.Opacity;
        } else if (effect instanceof r72.c) {
            cVar = c.AlphaGradient;
        } else if (Intrinsics.d(effect, r72.d.f106453b)) {
            cVar = c.TransparentHighlights;
        } else if (Intrinsics.d(effect, f.f106466b)) {
            cVar = c.TransparentShadows;
        } else {
            if (!Intrinsics.d(effect, r72.e.f106461b)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = null;
        }
        if (cVar == null) {
            return null;
        }
        x72.b bVar = x72.b.f134124d;
        if (bVar != null) {
            return bVar.a(cVar);
        }
        Intrinsics.r("current");
        throw null;
    }

    public static nd2.b b(n effect) {
        e eVar;
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (effect instanceof l) {
            eVar = ((l) effect).f106532f ? e.ShadowOld : e.Shadow;
        } else if (effect instanceof j) {
            eVar = ((j) effect).f106502d ? e.BorderOld : e.Border;
        } else if (effect instanceof m) {
            eVar = e.Stamp;
        } else if (effect instanceof k) {
            eVar = e.TornPaper;
        } else {
            if (!Intrinsics.d(effect, h.f106490b) && !Intrinsics.d(effect, i.f106496b)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = null;
        }
        if (eVar == null) {
            return null;
        }
        x72.b bVar = x72.b.f134124d;
        if (bVar != null) {
            return bVar.t(eVar);
        }
        Intrinsics.r("current");
        throw null;
    }

    public static nd2.b c(s effect) {
        c cVar;
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (!(effect instanceof o)) {
            if (Intrinsics.d(effect, r.f106630b)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        q b13 = ((o) effect).b();
        switch (b13 == null ? -1 : a.f138017a[b13.ordinal()]) {
            case -1:
            case 13:
                cVar = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                cVar = c.Washed;
                break;
            case 2:
                cVar = c.Invert;
                break;
            case 3:
                cVar = c.Chrome;
                break;
            case 4:
                cVar = c.Instant;
                break;
            case 5:
                cVar = c.Mono;
                break;
            case 6:
                cVar = c.Noir;
                break;
            case 7:
                cVar = c.Process;
                break;
            case 8:
                cVar = c.Tonal;
                break;
            case 9:
                cVar = c.Transfer;
                break;
            case 10:
                cVar = c.Tone;
                break;
            case 11:
                cVar = c.Linear;
                break;
            case 12:
                cVar = c.Sepia;
                break;
        }
        if (cVar == null) {
            return null;
        }
        x72.b bVar = x72.b.f134124d;
        if (bVar == null) {
            Intrinsics.r("current");
            throw null;
        }
        od2.a y13 = bVar.y(cVar);
        x72.b bVar2 = x72.b.f134124d;
        if (bVar2 != null) {
            return bVar2.v(y13);
        }
        Intrinsics.r("current");
        throw null;
    }

    public static od2.d d(i0 effect) {
        Enum r23;
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (effect instanceof h0) {
            r23 = d.Wobbly;
        } else if (effect instanceof r72.g0) {
            r23 = d.Watery;
        } else if (effect instanceof x) {
            r23 = d.Floaty;
        } else if (effect instanceof c0) {
            r23 = d.Shaky;
        } else if (effect instanceof d0) {
            r23 = d.Slide;
        } else if (effect instanceof b0) {
            r23 = d.Pulse;
        } else if (effect instanceof f0) {
            r23 = d.Swivel;
        } else if (effect instanceof a0) {
            r23 = d.Rotation;
        } else if (effect instanceof e0) {
            r23 = d.LavaLamp;
        } else if (effect instanceof w) {
            r23 = c.Fade;
        } else if (effect instanceof t) {
            r23 = g.Carousel;
        } else if (effect instanceof y) {
            r23 = g.Glitch;
        } else if (effect instanceof v) {
            r23 = g.Echo;
        } else {
            if (!Intrinsics.d(effect, u.f106665b) && !Intrinsics.d(effect, z.f106727b)) {
                throw new NoWhenBranchMatchedException();
            }
            r23 = null;
        }
        if (r23 == null) {
            return null;
        }
        x72.b bVar = x72.b.f134124d;
        if (bVar != null) {
            return bVar.a(r23);
        }
        Intrinsics.r("current");
        throw null;
    }

    public static String e(j0 effect) {
        q b13;
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (effect instanceof r72.g) {
            od2.d a13 = a((r72.g) effect);
            if (a13 != null) {
                return a13.f94185a;
            }
            return null;
        }
        if (effect instanceof i0) {
            od2.d d2 = d((i0) effect);
            if (d2 != null) {
                return d2.f94185a;
            }
            return null;
        }
        if (effect instanceof n) {
            nd2.b b14 = b((n) effect);
            if (b14 != null) {
                return b14.f90426a;
            }
            return null;
        }
        if (!(effect instanceof s)) {
            throw new NoWhenBranchMatchedException();
        }
        if ((effect instanceof r) || !(effect instanceof o) || (b13 = ((o) effect).b()) == null) {
            return null;
        }
        return b13.getType();
    }

    public static void f(r0 settings, r72.g effect) {
        Object obj;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(effect, "effect");
        try {
            xk2.q qVar = xk2.s.f135225b;
            if (effect instanceof r72.b) {
                settings.b("opacity", new pd2.f0(((r72.b) effect).f106440b));
                obj = settings;
            } else if (effect instanceof r72.c) {
                PointF from = new PointF(((r72.c) effect).f106446b, ((r72.c) effect).f106447c);
                PointF to3 = new PointF(((r72.c) effect).f106448d, ((r72.c) effect).f106449e);
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to3, "to");
                settings.b("direction", new l0(new hd2.f(from, to3)));
                obj = settings;
            } else if (Intrinsics.d(effect, r72.d.f106453b)) {
                obj = Unit.f80348a;
            } else if (Intrinsics.d(effect, f.f106466b)) {
                obj = Unit.f80348a;
            } else {
                if (!Intrinsics.d(effect, r72.e.f106461b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = Unit.f80348a;
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            obj = ue.c.m(th3);
        }
        xk2.s.a(obj);
    }

    public static void g(r0 settings, n effect) {
        Object obj;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(effect, "effect");
        try {
            xk2.q qVar = xk2.s.f135225b;
            if (effect instanceof l) {
                settings.b("opacity", new pd2.f0(((l) effect).f106528b));
                settings.b("radius", new pd2.f0(((l) effect).f106529c));
                settings.b("direction", new o0(new PointF(((l) effect).f106530d - 0.5f, ((l) effect).f106531e - 0.5f)));
                obj = settings;
            } else if (effect instanceof j) {
                settings.b("radius", new pd2.f0((((((j) effect).f106500b - 0.2f) / 5.8f) * 0.29000002f) + 0.01f));
                int i13 = ((j) effect).f106501c;
                id2.c.Companion.getClass();
                settings.b("color", new pd2.a0(id2.b.a(i13)));
                obj = settings;
            } else if (Intrinsics.d(effect, m.f106547b)) {
                obj = Unit.f80348a;
            } else if (Intrinsics.d(effect, k.f106511b)) {
                obj = Unit.f80348a;
            } else {
                if (!Intrinsics.d(effect, h.f106490b) && !Intrinsics.d(effect, i.f106496b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = Unit.f80348a;
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            obj = ue.c.m(th3);
        }
        xk2.s.a(obj);
    }

    public static void h(r0 settings, s effect) {
        Object obj;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(effect, "effect");
        try {
            xk2.q qVar = xk2.s.f135225b;
            if (effect instanceof o) {
                settings.b("strength", new pd2.f0(((o) effect).f106584c));
                settings.b("exposure", new pd2.f0(((o) effect).f106585d));
                settings.b("contrast", new pd2.f0(((o) effect).f106586e));
                settings.b("shadows", new pd2.f0(((o) effect).f106592k));
                settings.b("highlights", new pd2.f0(((o) effect).f106593l));
                settings.b("saturation", new pd2.f0(((o) effect).f106587f));
                settings.b("temperature", new pd2.f0(((o) effect).f106589h));
                settings.b("tint", new pd2.f0(((o) effect).f106590i));
                settings.b("hue", new pd2.f0(((o) effect).f106588g));
                settings.b("invert", new pd2.x(((o) effect).f106591j));
                obj = settings;
            } else {
                if (!Intrinsics.d(effect, r.f106630b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = Unit.f80348a;
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            obj = ue.c.m(th3);
        }
        xk2.s.a(obj);
    }

    public static void i(r0 settings, i0 effect) {
        Object obj;
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(effect, "effect");
        try {
            xk2.q qVar = xk2.s.f135225b;
            if (effect instanceof h0) {
                settings.b("speed", new pd2.f0(((h0) effect).f106491b));
                float f13 = 2;
                settings.b("angle", new pd2.f0((float) (((((h0) effect).f106492c * f13) * RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP) / 3.141592653589793d)));
                PointF pointF = new PointF(((h0) effect).f106493d, ((h0) effect).f106494e);
                float f14 = 1;
                settings.b("pivot", new o0(new PointF((pointF.x * f13) - f14, (pointF.y * f13) - f14)));
                obj = settings;
            } else if (effect instanceof r72.g0) {
                settings.b("speed", new pd2.f0(((r72.g0) effect).f106478b));
                obj = settings;
            } else if (effect instanceof x) {
                settings.b("speed", new pd2.f0(((x) effect).f106702b));
                obj = settings;
            } else if (effect instanceof c0) {
                settings.b("speed", new pd2.f0(((c0) effect).f106450b));
                obj = settings;
            } else if (effect instanceof d0) {
                settings.b("speed", new pd2.f0(((d0) effect).f106454b));
                settings.b("horizontal", new pd2.x(((d0) effect).f106455c));
                obj = settings;
            } else if (effect instanceof b0) {
                settings.b("speed", new pd2.f0(((b0) effect).f106441b));
                obj = settings;
            } else if (effect instanceof f0) {
                settings.b("speed", new pd2.f0(((f0) effect).f106467b));
                obj = settings;
            } else if (effect instanceof a0) {
                settings.b("speed", new pd2.f0(((a0) effect).f106433b));
                settings.b("clockwise", new pd2.x(((a0) effect).f106434c));
                obj = settings;
            } else if (effect instanceof e0) {
                settings.b("speed", new pd2.f0(((e0) effect).f106462b));
                obj = settings;
            } else if (effect instanceof w) {
                settings.b("speed", new pd2.f0(((w) effect).f106700b));
                obj = settings;
            } else if (effect instanceof t) {
                settings.b("speed", new pd2.f0(((t) effect).f106651b));
                settings.b("scale", new pd2.f0(((t) effect).f106652c));
                float f15 = 2;
                settings.b("hSpacing", new pd2.f0(((t) effect).f106655f * f15));
                settings.b("vSpacing", new pd2.f0(((t) effect).f106656g * f15));
                PointF pointF2 = new PointF(((t) effect).f106653d, ((t) effect).f106654e);
                float f16 = 1;
                settings.b("direction", new o0(new PointF((pointF2.x * f15) - f16, (pointF2.y * f15) - f16)));
                settings.b("mirror", new pd2.x(((t) effect).f106657h));
                obj = settings;
            } else if (effect instanceof y) {
                settings.b("speed", new pd2.f0(((y) effect).f106709b));
                settings.b("intensity", new pd2.f0(((y) effect).f106711d));
                settings.b("animateColor", new pd2.x(((y) effect).f106710c));
                float f17 = ((y) effect).f106713f;
                x72.b bVar = x72.b.f134124d;
                if (bVar == null) {
                    Intrinsics.r("current");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                if (bVar.f134125a != x72.e.LEGACY) {
                    f17 = 0.5f - f17;
                }
                settings.b("colorDistortion", new pd2.f0(f17));
                settings.b("melt", new pd2.f0(((y) effect).f106714g));
                settings.b("lineWidth", new pd2.f0(((y) effect).f106712e));
                obj = settings;
            } else if (effect instanceof v) {
                settings.b("speed", new pd2.f0(((v) effect).f106688b));
                settings.b("strength", new pd2.f0(((v) effect).f106689c));
                settings.b("inverted", new pd2.x(((v) effect).f106692f));
                settings.b("radial", new pd2.x(((v) effect).f106693g));
                settings.b("center", new o0(new PointF(((v) effect).f106690d, ((v) effect).f106691e)));
                obj = settings;
            } else {
                if (!Intrinsics.d(effect, u.f106665b) && !Intrinsics.d(effect, z.f106727b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = Unit.f80348a;
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            obj = ue.c.m(th3);
        }
        xk2.s.a(obj);
    }
}
