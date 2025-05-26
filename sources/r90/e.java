package r90;

import kotlin.collections.e0;
import kotlin.text.z;
import o82.r;
import sa0.a0;
import sa0.s;

/* loaded from: classes5.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final e f106868a = new e();

    @Override // o82.r
    public final Object i(Object obj, bl2.c cVar) {
        d dVar = obj instanceof d ? (d) obj : null;
        String str = dVar != null ? dVar.f106867a : null;
        if (str == null) {
            str = "";
        }
        return z.j(str) ? new xz.a(new IllegalStateException("Cutout editor section must be given valid source ID")) : new xz.b(e0.b(new s(new a0(str), new Integer(1), null, 26)));
    }
}
