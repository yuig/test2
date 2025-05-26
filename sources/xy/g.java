package xy;

import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import df.j1;
import ey.j3;
import ey.s1;
import h32.a4;
import h32.d4;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import xk2.k;
import xk2.m;
import xk2.n;
import xk2.v;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: o, reason: collision with root package name */
    public static final v f136159o = m.b(e.f136157k);

    /* renamed from: p, reason: collision with root package name */
    public static final k f136160p = m.a(n.NONE, e.f136156j);

    /* renamed from: a, reason: collision with root package name */
    public final a4 f136161a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f136162b;

    /* renamed from: c, reason: collision with root package name */
    public final List f136163c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f136164d;

    /* renamed from: e, reason: collision with root package name */
    public int f136165e;

    /* renamed from: f, reason: collision with root package name */
    public int f136166f;

    /* renamed from: g, reason: collision with root package name */
    public int f136167g;

    /* renamed from: h, reason: collision with root package name */
    public final j f136168h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f136169i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f136170j;

    /* renamed from: k, reason: collision with root package name */
    public int f136171k;

    /* renamed from: l, reason: collision with root package name */
    public int f136172l;

    /* renamed from: m, reason: collision with root package name */
    public int f136173m;

    /* renamed from: n, reason: collision with root package name */
    public final String f136174n;

    public g(RecyclerView recyclerView, a4 a4Var, d4 viewType, Window window, List list, b60.d activeUserManager) {
        h config = h.f136175e;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f136161a = a4Var;
        this.f136162b = viewType;
        this.f136163c = list;
        this.f136164d = activeUserManager;
        this.f136168h = new j(window, recyclerView, this);
        j3 j3Var = j3.f60510a;
        this.f136174n = Util.y(j3.a());
        ArrayDeque arrayDeque = s1.f60573a;
    }

    public final void a() {
        if (this.f136170j) {
            return;
        }
        this.f136170j = true;
        j jVar = this.f136168h;
        jVar.f136183d = true;
        jVar.f136184e = 0L;
        jVar.f136185f = 0;
        jVar.f136186g = 0;
        jVar.f136187h = 0;
        jVar.f136188i = j1.n0(jVar.f136180a);
        jVar.f136189j = 0;
        jVar.f136190k = -1L;
        y9.g gVar = jVar.f136191l;
        gVar.f138100b.f(true);
        gVar.f138101c = true;
    }
}
