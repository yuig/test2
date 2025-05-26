package u80;

import kotlin.Pair;
import ra0.t0;
import xk2.w;

/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final b f120966a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f120967b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f120968c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f120969d;

    static {
        c cVar = new c(0.0f, -6, 3);
        Pair pair = new Pair(new c(0.0f, -6, 3), new c(-0.09f, 7, 1));
        f120966a = new b(new a(0.15f, 0.5f), new d(cVar, pair, new w(new c(-0.13f, -6, 1), new c(0.0f, 5, 3), new c(-0.08f, 5, 1))));
        f120967b = new b(new a(0.15f, 0.6f), new d(cVar, pair, new w(new c(0.0f, -2, 3), new c(-0.15f, 1, 1), new c(0.1f, 12, 1))));
        f120968c = new b(new a(0.25f, 0.5f), new d(new c(-0.1f, -8, 1), new Pair(new c(-0.19f, 8, 1), new c(-0.1f, -4, 1)), new w(new c(0.0f, -2, 3), new c(-0.15f, 1, 1), new c(0.1f, 12, 1))), t0.StartOnTop);
        f120969d = new b(new a(0.25f, 0.0f), new d(new c(0.0f, -8, 3), new Pair(new c(-0.09f, 8, 1), new c(0.0f, -4, 3)), new w(new c(-0.35f, 0.25f, -15), new c(-0.265f, 0.28f, -15), new c(-0.42f, -0.2f, -15))));
    }
}
