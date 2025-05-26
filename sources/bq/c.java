package bq;

import android.content.Context;
import com.bumptech.glide.d;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.u;
import pk.a0;
import sh.f;
import so.oa;
import uj2.l;
import x02.x2;
import x02.y;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final b f23676d = b.MOST_RECENT;

    /* renamed from: a, reason: collision with root package name */
    public final x2 f23677a;

    /* renamed from: b, reason: collision with root package name */
    public final y f23678b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f23679c;

    public c() {
        Context context = kb0.a.f79058b;
        this.f23677a = ((oa) ((so1.b) a0.M(f0.X(), so1.b.class))).G2();
        this.f23678b = (y) ((oa) ((so1.b) a0.M(f0.X(), so1.b.class))).f113660e4.get();
        this.f23679c = d.E();
    }

    public static c a() {
        return a.f23675a;
    }

    public final b b() {
        b optionByApiKey;
        wy0 f13 = ((b60.d) this.f23679c).f();
        b bVar = f23676d;
        return (f13 == null || f13.U3() == null || (optionByApiKey = b.getOptionByApiKey(f13.U3())) == null) ? bVar : optionByApiKey;
    }

    public final void c(b bVar) {
        this.f23678b.a();
        f.a().X(u0.LIBRARY_SORT_BOARDS_OPTION_CHANGED);
        u.f85943a.f(new yp.a(bVar));
    }

    public final uj2.b d(b bVar) {
        wy0 f13 = ((b60.d) this.f23679c).f();
        if (f13 == null) {
            return uj2.b.g(new Throwable("BoardSortUtils: myUser is null, Fail to update board sort option"));
        }
        vy0 H4 = f13.H4();
        H4.Y0 = bVar.getApiKey();
        boolean[] zArr = H4.V1;
        if (zArr.length > 102) {
            zArr[102] = true;
        }
        wy0 user = H4.a();
        String option = bVar.getApiKey();
        x2 x2Var = this.f23677a;
        x2Var.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(option, "option");
        String id3 = user.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        l l03 = x2Var.l0(user, new k22.b(id3, option));
        l03.getClass();
        hk2.u uVar = new hk2.u(l03);
        Intrinsics.checkNotNullExpressionValue(uVar, "ignoreElement(...)");
        return uVar;
    }
}
