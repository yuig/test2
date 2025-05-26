package lt0;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.f0;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f84780a;

    static {
        Pair pair = new Pair(Float.valueOf(-7.71f), Float.valueOf(3.21f));
        Float valueOf = Float.valueOf(6.72f);
        Float valueOf2 = Float.valueOf(-7.07f);
        Pair pair2 = new Pair(valueOf, valueOf2);
        Float valueOf3 = Float.valueOf(9.66f);
        f84780a = f0.j(pair, pair2, new Pair(valueOf3, valueOf2), new Pair(valueOf2, valueOf), new Pair(valueOf3, Float.valueOf(-3.21f)), new Pair(Float.valueOf(-0.08f), Float.valueOf(-6.39f)));
    }

    public static final List a() {
        return f84780a;
    }
}
