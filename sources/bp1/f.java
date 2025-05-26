package bp1;

import com.pinterest.api.model.b40;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z40.b0;
import z40.z;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f23655a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23656b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23657c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23658d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23659e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23660f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23661g;

    public f(c cVar) {
        String uid;
        String z43;
        boolean D0;
        String B0;
        String y03;
        this.f23655a = cVar;
        boolean z13 = cVar instanceof a;
        if (z13) {
            uid = ((a) cVar).f23650b.a();
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            uid = ((b) cVar).f23651b.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        }
        this.f23656b = uid;
        if (z13) {
            z43 = ((a) cVar).f23650b.c();
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            z43 = ((b) cVar).f23651b.z4();
        }
        this.f23657c = z43;
        String str = null;
        if (z13) {
            b0 b0Var = ((a) cVar).f23650b;
            Intrinsics.checkNotNullParameter(b0Var, "<this>");
            z f13 = b0Var.f();
            D0 = Intrinsics.d(f13 != null ? f13.getType() : null, "gif");
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            D0 = b40.D0(((b) cVar).f23651b);
        }
        this.f23658d = D0;
        if (z13) {
            z f14 = ((a) cVar).f23650b.f();
            if (f14 != null) {
                str = f14.a();
            }
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            str = b40.r(((b) cVar).f23651b);
        }
        this.f23659e = str;
        if (z13) {
            B0 = ((a) cVar).f23650b.b();
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            B0 = bs1.c.B0(((b) cVar).f23651b);
        }
        this.f23660f = B0;
        if (z13) {
            y03 = ((a) cVar).f23650b.e();
        } else {
            if (!(cVar instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            y03 = bs1.c.y0(((b) cVar).f23651b);
        }
        this.f23661g = y03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.hairball.graphql.tuples.PinTuple");
        f fVar = (f) obj;
        return Intrinsics.d(this.f23656b, fVar.f23656b) && Intrinsics.d(this.f23657c, fVar.f23657c) && this.f23658d == fVar.f23658d && Intrinsics.d(this.f23659e, fVar.f23659e) && Intrinsics.d(this.f23660f, fVar.f23660f) && Intrinsics.d(this.f23661g, fVar.f23661g);
    }

    public final int hashCode() {
        int hashCode = this.f23656b.hashCode() * 31;
        String str = this.f23657c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
