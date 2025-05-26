package t3;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f116286a = new z0();

    public final boolean onClearTranslation(View view) {
        z3.a aVar;
        Function0 function0;
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        w2.f fVar = ((c0) view).f115893m;
        fVar.getClass();
        fVar.f127618g = w2.a.SHOW_ORIGINAL;
        g1.u e13 = fVar.e();
        Object[] objArr = e13.f63327c;
        long[] jArr = e13.f63325a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        z3.j jVar = ((q3) objArr[(i13 << 3) + i15]).f116173a.f140714d;
                        if (bs1.c.M0(jVar, z3.t.f140755x) != null && (aVar = (z3.a) bs1.c.M0(jVar, z3.i.f140685l)) != null && (function0 = (Function0) aVar.f140659b) != null) {
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }

    public final boolean onHideTranslation(View view) {
        z3.a aVar;
        Function1 function1;
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        w2.f fVar = ((c0) view).f115893m;
        fVar.getClass();
        fVar.f127618g = w2.a.SHOW_ORIGINAL;
        g1.u e13 = fVar.e();
        Object[] objArr = e13.f63327c;
        long[] jArr = e13.f63325a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        z3.j jVar = ((q3) objArr[(i13 << 3) + i15]).f116173a.f140714d;
                        if (Intrinsics.d(bs1.c.M0(jVar, z3.t.f140755x), Boolean.TRUE) && (aVar = (z3.a) bs1.c.M0(jVar, z3.i.f140684k)) != null && (function1 = (Function1) aVar.f140659b) != null) {
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }

    public final boolean onShowTranslation(View view) {
        z3.a aVar;
        Function1 function1;
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        w2.f fVar = ((c0) view).f115893m;
        fVar.getClass();
        fVar.f127618g = w2.a.SHOW_TRANSLATED;
        g1.u e13 = fVar.e();
        Object[] objArr = e13.f63327c;
        long[] jArr = e13.f63325a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128) {
                        z3.j jVar = ((q3) objArr[(i13 << 3) + i15]).f116173a.f140714d;
                        if (Intrinsics.d(bs1.c.M0(jVar, z3.t.f140755x), Boolean.FALSE) && (aVar = (z3.a) bs1.c.M0(jVar, z3.i.f140684k)) != null && (function1 = (Function1) aVar.f140659b) != null) {
                        }
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return true;
                }
            }
            if (i13 == length) {
                return true;
            }
            i13++;
        }
    }
}
