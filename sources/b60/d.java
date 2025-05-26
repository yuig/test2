package b60;

import a.cb;
import android.os.SystemClock;
import com.pinterest.api.model.fz0;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lb0.m;
import lb0.o;
import nm.u;
import tb0.h;
import uk2.f;
import vb0.j;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final o f22011a;

    /* renamed from: b, reason: collision with root package name */
    public final h f22012b;

    /* renamed from: c, reason: collision with root package name */
    public wy0 f22013c;

    /* renamed from: d, reason: collision with root package name */
    public final f f22014d;

    public d(o userPreferencesProvider, h crashReporting) {
        Intrinsics.checkNotNullParameter(userPreferencesProvider, "userPreferencesProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f22011a = userPreferencesProvider;
        this.f22012b = crashReporting;
        this.f22014d = cb.r("create(...)");
    }

    public final wy0 f() {
        if (this.f22013c == null) {
            if (j.f125481p == 0) {
                j.f125481p = SystemClock.elapsedRealtime();
            }
            vd0.c h10 = h();
            wy0 wy0Var = null;
            if (h10 != null) {
                Object e13 = vd0.c.f125622b.e(h10.f125623a, wy0.class);
                Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.User");
                wy0 wy0Var2 = (wy0) e13;
                if (j.f125482q == 0) {
                    j.f125482q = SystemClock.elapsedRealtime();
                }
                if (j1.d1(wy0Var2.getUid())) {
                    wy0Var = wy0Var2;
                }
            }
            this.f22013c = wy0Var;
            if (wy0Var != null) {
                String uid = wy0Var.getUid();
                h hVar = this.f22012b;
                hVar.C(uid);
                hVar.t(wy0Var.G2());
            }
        }
        return this.f22013c;
    }

    public final String g() {
        wy0 f13 = f();
        if (f13 != null) {
            return f13.getUid();
        }
        return null;
    }

    public final vd0.c h() {
        try {
            return new vd0.c(((lb0.b) this.f22011a).j("PREF_MY_USER", ""));
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean i() {
        return f() != null && c60.d.b();
    }

    public final void j(wy0 newModel) {
        wy0 wy0Var;
        String uid;
        String str;
        Intrinsics.checkNotNullParameter(newModel, "user");
        wy0 wy0Var2 = this.f22013c;
        if (wy0Var2 == null) {
            this.f22013c = newModel;
        } else {
            String uid2 = wy0Var2.getUid();
            if ((uid2 == null || z.j(uid2)) && (wy0Var = this.f22013c) != null && (uid = wy0Var.getUid()) != null) {
                vy0 H4 = newModel.H4();
                H4.p1(uid);
                newModel = H4.a();
                Intrinsics.checkNotNullExpressionValue(newModel, "build(...)");
            }
            new fz0();
            wy0 oldModel = this.f22013c;
            if (oldModel != null) {
                Intrinsics.checkNotNullParameter(oldModel, "oldModel");
                Intrinsics.checkNotNullParameter(newModel, "newModel");
                wy0 a13 = oldModel.G4(newModel).H4().a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                this.f22013c = a13;
            }
        }
        u i13 = vd0.c.f125622b.o(this.f22013c).i();
        wy0 wy0Var3 = this.f22013c;
        if (wy0Var3 == null || (str = wy0Var3.getUid()) == null) {
            str = "\u0000";
        }
        this.f22014d.c(str);
        m c13 = ((lb0.b) this.f22011a).c();
        c13.putString("PREF_MY_USER", i13.toString());
        c13.remove("PREF_MY_ID");
        wy0 wy0Var4 = this.f22013c;
        c13.putString("PREF_MY_ID", wy0Var4 != null ? wy0Var4.getUid() : null);
        c13.apply();
        wy0 wy0Var5 = this.f22013c;
        if (wy0Var5 != null) {
            String uid3 = wy0Var5.getUid();
            h hVar = this.f22012b;
            hVar.C(uid3);
            hVar.t(wy0Var5.G2());
        }
    }

    public final void k(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        wy0 f13 = f();
        if (f13 == null || !dl2.b.S1(f13, user.getUid())) {
            return;
        }
        j(user);
    }
}
