package pd;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final p5.d f99652a;

    /* renamed from: b, reason: collision with root package name */
    public final List f99653b;

    /* renamed from: c, reason: collision with root package name */
    public final String f99654c;

    public e0(Class cls, Class cls2, Class cls3, List list, x92.b bVar) {
        this.f99652a = bVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f99653b = list;
        this.f99654c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final g0 a(int i13, int i14, nd.l lVar, com.bumptech.glide.load.data.g gVar, qq2.c cVar) {
        p5.d dVar = this.f99652a;
        Object b13 = dVar.b();
        d7.b.p(b13, "Argument must not be null");
        List list = (List) b13;
        try {
            List list2 = this.f99653b;
            int size = list2.size();
            g0 g0Var = null;
            for (int i15 = 0; i15 < size; i15++) {
                try {
                    g0Var = ((p) list2.get(i15)).a(i13, i14, lVar, gVar, cVar);
                } catch (GlideException e13) {
                    list.add(e13);
                }
                if (g0Var != null) {
                    break;
                }
            }
            if (g0Var != null) {
                return g0Var;
            }
            throw new GlideException(this.f99654c, new ArrayList(list));
        } finally {
            dVar.a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f99653b.toArray()) + '}';
    }
}
