package pn;

import ik2.j;
import uj2.b0;
import uj2.f0;
import uj2.q;
import uj2.v;

/* loaded from: classes.dex */
public final class c extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100714a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f100715b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f100716c;

    public c(int i13, Object obj, Object obj2) {
        this.f100714a = i13;
        this.f100715b = obj;
        this.f100716c = obj2;
    }

    @Override // uj2.q
    public final void G(v vVar) {
        int i13 = this.f100714a;
        Object obj = this.f100715b;
        Object obj2 = this.f100716c;
        switch (i13) {
            case 0:
                ((q) obj).d(new d(vVar, (a) obj2, 0));
                break;
            default:
                j jVar = new j(vVar, (ak2.f) obj2);
                vVar.b(jVar);
                ((b0) ((f0) obj)).p(jVar);
                break;
        }
    }
}
