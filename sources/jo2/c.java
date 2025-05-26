package jo2;

import ao2.m;
import ao2.o;
import eo2.w;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import uj2.v;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class c implements v {

    /* renamed from: a, reason: collision with root package name */
    public xj2.c f77219a;

    /* renamed from: b, reason: collision with root package name */
    public Object f77220b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f77221c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f77222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f77223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f77224f;

    public c(o oVar, a aVar, Object obj) {
        this.f77222d = oVar;
        this.f77223e = aVar;
        this.f77224f = obj;
    }

    @Override // uj2.v
    public final void a() {
        boolean z13 = this.f77221c;
        m mVar = this.f77222d;
        if (z13) {
            if (mVar.isActive()) {
                q qVar = s.f135225b;
                mVar.resumeWith(this.f77220b);
                return;
            }
            return;
        }
        a aVar = a.FIRST_OR_DEFAULT;
        a aVar2 = this.f77223e;
        if (aVar2 == aVar) {
            q qVar2 = s.f135225b;
            mVar.resumeWith(this.f77224f);
        } else if (mVar.isActive()) {
            q qVar3 = s.f135225b;
            mVar.resumeWith(ue.c.m(new NoSuchElementException("No value received via onNext for " + aVar2)));
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        this.f77219a = cVar;
        this.f77222d.e(new w(cVar, 1));
    }

    @Override // uj2.v
    public final void c(Object obj) {
        int[] iArr = b.f77218a;
        a aVar = this.f77223e;
        int i13 = iArr[aVar.ordinal()];
        m mVar = this.f77222d;
        if (i13 == 1 || i13 == 2) {
            if (this.f77221c) {
                return;
            }
            this.f77221c = true;
            q qVar = s.f135225b;
            mVar.resumeWith(obj);
            xj2.c cVar = this.f77219a;
            if (cVar != null) {
                cVar.dispose();
                return;
            } else {
                Intrinsics.r("subscription");
                throw null;
            }
        }
        if (i13 != 3 && i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (aVar != a.SINGLE || !this.f77221c) {
            this.f77220b = obj;
            this.f77221c = true;
            return;
        }
        if (mVar.isActive()) {
            q qVar2 = s.f135225b;
            mVar.resumeWith(ue.c.m(new IllegalArgumentException("More than one onNext value for " + aVar)));
        }
        xj2.c cVar2 = this.f77219a;
        if (cVar2 != null) {
            cVar2.dispose();
        } else {
            Intrinsics.r("subscription");
            throw null;
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        q qVar = s.f135225b;
        this.f77222d.resumeWith(ue.c.m(th3));
    }
}
