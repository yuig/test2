package pd;

import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Class f99738a;

    /* renamed from: b, reason: collision with root package name */
    public final List f99739b;

    /* renamed from: c, reason: collision with root package name */
    public final zd.a f99740c;

    /* renamed from: d, reason: collision with root package name */
    public final p5.d f99741d;

    /* renamed from: e, reason: collision with root package name */
    public final String f99742e;

    public p(Class cls, Class cls2, Class cls3, List list, zd.a aVar, x92.b bVar) {
        this.f99738a = cls;
        this.f99739b = list;
        this.f99740c = aVar;
        this.f99741d = bVar;
        this.f99742e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r0 == nd.a.LOCAL) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pd.g0 a(int r18, int r19, nd.l r20, com.bumptech.glide.load.data.g r21, qq2.c r22) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pd.p.a(int, int, nd.l, com.bumptech.glide.load.data.g, qq2.c):pd.g0");
    }

    public final g0 b(com.bumptech.glide.load.data.g gVar, int i13, int i14, nd.l lVar, List list) {
        List list2 = this.f99739b;
        int size = list2.size();
        g0 g0Var = null;
        for (int i15 = 0; i15 < size; i15++) {
            nd.n nVar = (nd.n) list2.get(i15);
            try {
                if (nVar.a(gVar.c(), lVar)) {
                    g0Var = nVar.b(gVar.c(), i13, i14, lVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e13) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + nVar, e13);
                }
                list.add(e13);
            }
            if (g0Var != null) {
                break;
            }
        }
        if (g0Var != null) {
            return g0Var;
        }
        throw new GlideException(this.f99742e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f99738a + ", decoders=" + this.f99739b + ", transcoder=" + this.f99740c + '}';
    }
}
