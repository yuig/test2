package ey;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c5 extends v1 {

    /* renamed from: k, reason: collision with root package name */
    public static final Set f60460k = kotlin.collections.h1.f(n4.class, o4.class, p4.class, l4.class, m4.class, f4.class, g4.class, q4.class, v0.class, r4.class, h4.class, i4.class, j4.class, k4.class, e4.class, l2.class);

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f60461f;

    /* renamed from: g, reason: collision with root package name */
    public String f60462g;

    /* renamed from: h, reason: collision with root package name */
    public s4 f60463h;

    /* renamed from: i, reason: collision with root package name */
    public String f60464i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f60465j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(k3 perfLogger, m60.w eventManager) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f60461f = eventManager;
        this.f60465j = new LinkedHashSet();
    }

    public final void A(z1 z1Var, boolean z13) {
        LinkedHashSet linkedHashSet = this.f60465j;
        boolean z14 = linkedHashSet instanceof Collection;
        if (!z14 || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((z1) it.next()).getClass() == z1Var.getClass()) {
                    return;
                }
            }
        }
        if (d()) {
            r(z1Var.c());
            linkedHashSet.add(z1Var);
        }
        if (z13) {
            long c13 = z1Var.c();
            if (z14 && linkedHashSet.isEmpty()) {
                return;
            }
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                if (((z1) it2.next()) instanceof k4) {
                    if (linkedHashSet.isEmpty()) {
                        return;
                    }
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        if (((z1) it3.next()) instanceof m4) {
                            if (!linkedHashSet.isEmpty()) {
                                Iterator it4 = linkedHashSet.iterator();
                                while (it4.hasNext()) {
                                    if (((z1) it4.next()) instanceof p4) {
                                        break;
                                    }
                                }
                            }
                            if (!ff0.j.f62104b) {
                                return;
                            }
                            v(s92.o.COMPLETE, c13);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // ey.v1
    public final Set b() {
        return f60460k;
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!(e13 instanceof n4) && (e13 instanceof z1) && !Intrinsics.d(((z1) e13).l(), this.f60462g)) {
            return false;
        }
        if (this.f60462g != null && (e13 instanceof v0)) {
            x((v0) e13);
        }
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof n4) {
            w((n4) e13);
        } else if (e13 instanceof o4) {
            z((z1) e13);
        } else if (e13 instanceof p4) {
            A((z1) e13, true);
        } else if (e13 instanceof l4) {
            z((z1) e13);
        } else if (e13 instanceof m4) {
            A((z1) e13, true);
        } else if (e13 instanceof f4) {
            z((z1) e13);
        } else if (e13 instanceof g4) {
            A((z1) e13, false);
        } else if (e13 instanceof q4) {
            z((z1) e13);
        } else if (e13 instanceof r4) {
            A((z1) e13, false);
        } else if (e13 instanceof h4) {
            z((z1) e13);
        } else if (e13 instanceof i4) {
            A((z1) e13, false);
        } else if (e13 instanceof j4) {
            z((z1) e13);
        } else if (e13 instanceof k4) {
            y((k4) e13);
        } else if (e13 instanceof e4) {
            v(((e4) e13).m(), e13.c());
        }
        return true;
    }

    public final void v(s92.o oVar, long j13) {
        String str = this.f60464i;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            j("static_image_loaded_from", lowerCase);
        }
        s4 s4Var = this.f60463h;
        if (s4Var != null) {
            String lowerCase2 = s4Var.toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            j("idea_pin_data_loaded_from", lowerCase2);
        }
        String str2 = b5.f60449a;
        String pinUid = this.f60462g;
        Intrinsics.f(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        t(str2, pinUid, null, new n4(pinUid));
        a(oVar, s92.l.USER_NAVIGATION, h32.d4.PIN, h32.a4.PIN_STORY_PIN, j13, false);
        this.f60465j.clear();
        this.f60462g = null;
        this.f60464i = null;
        this.f60463h = null;
        this.f60461f.d(jy.d.f77704a);
    }

    public final void w(n4 n4Var) {
        this.f60462g = n4Var.f60634c;
        this.f60465j.clear();
        q(n4Var.c());
        String str = this.f60462g;
        if (str == null) {
            str = "";
        }
        j("pin.id", str);
    }

    public final void x(v0 v0Var) {
        LinkedHashSet linkedHashSet = this.f60465j;
        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((z1) it.next()) instanceof v0) {
                    return;
                }
            }
        }
        linkedHashSet.add(v0Var);
        this.f60463h = v0Var.f60592e;
    }

    public final void y(k4 k4Var) {
        LinkedHashSet linkedHashSet = this.f60465j;
        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((z1) it.next()) instanceof k4) {
                    return;
                }
            }
        }
        this.f60464i = k4Var.f60528e;
        A(k4Var, true);
    }

    public final void z(z1 z1Var) {
        LinkedHashSet linkedHashSet = this.f60465j;
        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((z1) it.next()).getClass() == z1Var.getClass()) {
                    return;
                }
            }
        }
        if (d()) {
            return;
        }
        linkedHashSet.add(z1Var);
        q(z1Var.c());
    }
}
