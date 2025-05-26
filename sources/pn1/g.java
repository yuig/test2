package pn1;

import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import hn1.q;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100756i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f100757j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13, int i14) {
        super(1);
        this.f100756i = i14;
        this.f100757j = i13;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f100756i;
        int i14 = this.f100757j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                yn1.f fVar = yn1.f.ERROR;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return ao1.b.e(it, null, null, new k0(i14, new ArrayList(0)), null, fVar, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(String.valueOf(i14)), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, bs1.c.j2(new String[0], i14), null, yn1.f.ERROR, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
        }
    }

    public final wy0 e(wy0 myUser) {
        int i13 = this.f100756i;
        int i14 = this.f100757j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(myUser, "myUser");
                vy0 H4 = myUser.H4();
                if (myUser.W2()) {
                    int intValue = myUser.V2().intValue() + i14;
                    H4.L(Integer.valueOf(intValue >= 0 ? intValue : 0));
                }
                wy0 a13 = H4.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            default:
                Intrinsics.checkNotNullParameter(myUser, "myUser");
                vy0 H42 = myUser.H4();
                boolean[] zArr = myUser.V1;
                if (zArr.length > 41 && zArr[41]) {
                    H42.P = Integer.valueOf(Math.max(myUser.Q2().intValue() + i14, 0));
                    boolean[] zArr2 = H42.V1;
                    if (zArr2.length > 41) {
                        zArr2[41] = true;
                    }
                }
                wy0 a14 = H42.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                return a14;
        }
    }

    public final Boolean f(ke2.d it) {
        int i13 = this.f100756i;
        int i14 = this.f100757j;
        switch (i13) {
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f79319a.f79333a == i14);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f79319a.f79333a == i14);
        }
    }

    public final rn1.a h(rn1.a it) {
        int i13 = this.f100756i;
        int i14 = this.f100757j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, this.f100757j, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096991);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new k0(i14, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return rn1.a.y(it, new k0(i14, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, this.f100757j, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097119);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, this.f100757j, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097119);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], i14), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f100756i;
        int i14 = this.f100757j;
        switch (i13) {
            case 0:
                um1.d bind = (um1.d) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f122796a = Integer.valueOf(i14);
                bind.f122798c = fm1.c.VISIBLE;
                return Unit.f80348a;
            case 1:
                return h((rn1.a) obj);
            case 2:
                return h((rn1.a) obj);
            case 3:
                return b((ao1.b) obj);
            case 4:
                return h((rn1.a) obj);
            case 5:
                return h((rn1.a) obj);
            case 6:
                return b((ao1.b) obj);
            case 7:
                return Integer.valueOf(((Number) obj).intValue() + i14);
            case 8:
                en1.d it = (en1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return en1.d.e(it, null, null, null, false, null, null, false, this.f100757j, 255);
            case 9:
                jb2.b it2 = (jb2.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return jb2.b.e(it2, null, null, false, 0.0f, null, false, null, this.f100757j, 255);
            case 10:
                return b((ao1.b) obj);
            case 11:
                return e((wy0) obj);
            case 12:
                return e((wy0) obj);
            case 13:
                kn1.b it3 = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return kn1.b.e(it3, false, true, q.Center, bs1.c.j2(new String[0], i14), null, null, null, 1952);
            case 14:
                yl1.b it4 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return yl1.b.f(it4, bs1.c.j2(new String[0], i14), false, null, null, null, null, null, null, 0, null, 1022);
            case 15:
                return h((rn1.a) obj);
            case 16:
                return h((rn1.a) obj);
            case 17:
                return h((rn1.a) obj);
            case 18:
                return f((ke2.d) obj);
            case 19:
                Pair it5 = (Pair) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return Boolean.valueOf(((Number) it5.f80347b).intValue() == i14);
            default:
                return f((ke2.d) obj);
        }
    }
}
