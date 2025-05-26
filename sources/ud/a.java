package ud;

import java.util.ArrayDeque;
import nd.k;
import nd.l;
import rd.j;
import td.a0;
import td.b0;
import td.c0;
import td.t;

/* loaded from: classes3.dex */
public final class a implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final k f121905b = k.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final j f121906a;

    public a(j jVar) {
        this.f121906a = jVar;
    }

    @Override // td.c0
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // td.c0
    public final b0 b(Object obj, int i13, int i14, l lVar) {
        t tVar = (t) obj;
        j jVar = this.f121906a;
        if (jVar != null) {
            a0 a13 = a0.a(tVar);
            he.k kVar = (he.k) jVar.f107506b;
            Object a14 = kVar.a(a13);
            ArrayDeque arrayDeque = a0.f117366d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a13);
            }
            t tVar2 = (t) a14;
            if (tVar2 == null) {
                kVar.d(a0.a(tVar), tVar);
            } else {
                tVar = tVar2;
            }
        }
        return new b0(tVar, new com.bumptech.glide.load.data.l(tVar, ((Integer) lVar.c(f121905b)).intValue()));
    }
}
