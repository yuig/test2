package i1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.net.Uri;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70763i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f70764j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(int i13, Function1 function1) {
        super(1);
        this.f70763i = i13;
        this.f70764j = function1;
    }

    public final void b(int i13) {
        int i14 = this.f70763i;
        Function1 function1 = this.f70764j;
        switch (i14) {
            case 18:
                function1.invoke(new s80.y0(new t80.e(i13)));
                break;
            default:
                function1.invoke(new s80.y0(new t80.e(i13)));
                break;
        }
    }

    public final void e(Uri uri) {
        int i13 = this.f70763i;
        Function1 function1 = this.f70764j;
        switch (i13) {
            case 15:
                if (uri != null) {
                    String uri2 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                    function1.invoke(new s80.e1(uri2, sa0.d0.Gallery));
                    break;
                }
                break;
            default:
                if (uri != null) {
                    String uri3 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
                    function1.invoke(new s80.e1(uri3, sa0.d0.Gallery));
                    break;
                }
                break;
        }
    }

    public final void f(f30 f30Var) {
        int i13 = this.f70763i;
        Function1 function1 = this.f70764j;
        switch (i13) {
            case 7:
                Intrinsics.f(f30Var);
                function1.invoke(f30Var);
                break;
            case 8:
                Intrinsics.f(f30Var);
                function1.invoke(f30Var);
                break;
            default:
                Intrinsics.f(f30Var);
                function1.invoke(f30Var);
                break;
        }
    }

    public final void h(om1.p it) {
        s80.h0 h0Var = s80.h0.f111565a;
        int i13 = this.f70763i;
        Function1 function1 = this.f70764j;
        switch (i13) {
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    function1.invoke(h0Var);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    function1.invoke(h0Var);
                    break;
                }
                break;
        }
    }

    public final void i(xl1.b it) {
        s80.i0 i0Var = s80.i0.f111575a;
        int i13 = this.f70763i;
        Function1 function1 = this.f70764j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(i0Var);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(s80.z0.f111872a);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(i0Var);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1 = this.f70764j;
        int i13 = this.f70763i;
        switch (i13) {
            case 0:
                return new n4.j(j(((n4.j) obj).f89186a));
            case 1:
                return new n4.j(j(((n4.j) obj).f89186a));
            case 2:
                return new n4.h(d7.b.a(0, ((Number) function1.invoke(Integer.valueOf((int) (((n4.j) obj).f89186a & 4294967295L)))).intValue()));
            case 3:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                switch (i13) {
                    case 3:
                        throw null;
                    default:
                        throw null;
                }
            case 4:
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                function1.invoke(th3);
                return Unit.f80348a;
            case 5:
                return function1.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 6:
                xn1.j it = (xn1.j) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xn1.f) {
                    function1.invoke(Boolean.valueOf(((xn1.f) it).f135448c));
                }
                return Unit.f80348a;
            case 7:
                f((f30) obj);
                return Unit.f80348a;
            case 8:
                f((f30) obj);
                return Unit.f80348a;
            case 9:
                wy0 wy0Var = (wy0) obj;
                switch (i13) {
                    case 9:
                        Intrinsics.f(wy0Var);
                        function1.invoke(wy0Var);
                        break;
                    default:
                        Intrinsics.f(wy0Var);
                        function1.invoke(wy0Var);
                        break;
                }
                return Unit.f80348a;
            case 10:
                wy0 wy0Var2 = (wy0) obj;
                switch (i13) {
                    case 9:
                        Intrinsics.f(wy0Var2);
                        function1.invoke(wy0Var2);
                        break;
                    default:
                        Intrinsics.f(wy0Var2);
                        function1.invoke(wy0Var2);
                        break;
                }
                return Unit.f80348a;
            case 11:
                rn1.i it2 = (rn1.i) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof rn1.f) {
                    function1.invoke(s80.y.f111851a);
                }
                return Unit.f80348a;
            case 12:
                s80.a1 it3 = (s80.a1) obj;
                switch (i13) {
                    case 12:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        function1.invoke(it3);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        function1.invoke(it3);
                        break;
                }
                return Unit.f80348a;
            case 13:
                h((om1.p) obj);
                return Unit.f80348a;
            case 14:
                i((xl1.b) obj);
                return Unit.f80348a;
            case 15:
                e((Uri) obj);
                return Unit.f80348a;
            case 16:
                long j13 = ((b3.w) obj).f21392a;
                switch (i13) {
                    case 16:
                        function1.invoke(new s80.g0(j13));
                        break;
                    default:
                        function1.invoke(new s80.g0(j13));
                        break;
                }
                return Unit.f80348a;
            case 17:
                l62.w it4 = (l62.w) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                function1.invoke(it4);
                return Unit.f80348a;
            case 18:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 19:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 20:
                i((xl1.b) obj);
                return Unit.f80348a;
            case 21:
                e((Uri) obj);
                return Unit.f80348a;
            case 22:
                s80.a1 it5 = (s80.a1) obj;
                switch (i13) {
                    case 12:
                        Intrinsics.checkNotNullParameter(it5, "it");
                        function1.invoke(it5);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it5, "it");
                        function1.invoke(it5);
                        break;
                }
                return Unit.f80348a;
            case 23:
                q3.x it6 = (q3.x) obj;
                switch (i13) {
                    case 23:
                        Intrinsics.checkNotNullParameter(it6, "it");
                        function1.invoke(it6);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it6, "it");
                        function1.invoke(it6);
                        break;
                }
                return Unit.f80348a;
            case 24:
                q3.x it7 = (q3.x) obj;
                switch (i13) {
                    case 23:
                        Intrinsics.checkNotNullParameter(it7, "it");
                        function1.invoke(it7);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it7, "it");
                        function1.invoke(it7);
                        break;
                }
                return Unit.f80348a;
            case 25:
                long j14 = ((b3.w) obj).f21392a;
                switch (i13) {
                    case 16:
                        function1.invoke(new s80.g0(j14));
                        break;
                    default:
                        function1.invoke(new s80.g0(j14));
                        break;
                }
                return Unit.f80348a;
            case 26:
                h((om1.p) obj);
                return Unit.f80348a;
            case 27:
                i((xl1.b) obj);
                return Unit.f80348a;
            case 28:
                f((f30) obj);
                return Unit.f80348a;
        }
    }

    public final long j(long j13) {
        int i13 = this.f70763i;
        Function1 function1 = this.f70764j;
        switch (i13) {
        }
        return lb.l0.d((int) (j13 >> 32), ((Number) function1.invoke(Integer.valueOf((int) (j13 & 4294967295L)))).intValue());
    }
}
