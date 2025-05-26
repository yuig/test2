package w2;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import b4.g;
import java.util.List;
import java.util.function.Consumer;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.q3;
import z3.q;
import z3.t;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f127606a = new d();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        r0 = r0.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r0 = r0.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(w2.f r6, android.util.LongSparseArray r7) {
        /*
            r0 = 0
        L1:
            int r1 = r7.size()
            if (r0 >= r1) goto L59
            int r1 = r0 + 1
            long r2 = r7.keyAt(r0)
            java.lang.Object r0 = r7.get(r2)
            android.view.translation.ViewTranslationResponse r0 = w2.b.h(r0)
            if (r0 == 0) goto L57
            android.view.translation.TranslationResponseValue r0 = w2.b.e(r0)
            if (r0 == 0) goto L57
            java.lang.CharSequence r0 = w2.b.j(r0)
            if (r0 == 0) goto L57
            g1.u r4 = r6.e()
            int r2 = (int) r2
            java.lang.Object r2 = r4.h(r2)
            t3.q3 r2 = (t3.q3) r2
            if (r2 == 0) goto L57
            z3.q r2 = r2.f116173a
            if (r2 == 0) goto L57
            z3.x r3 = z3.i.f140683j
            z3.j r2 = r2.f140714d
            java.lang.Object r2 = bs1.c.M0(r2, r3)
            z3.a r2 = (z3.a) r2
            if (r2 == 0) goto L57
            xk2.g r2 = r2.f140659b
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            if (r2 == 0) goto L57
            b4.g r3 = new b4.g
            java.lang.String r0 = r0.toString()
            r4 = 6
            r5 = 0
            r3.<init>(r0, r5, r4)
            java.lang.Object r0 = r2.invoke(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L57:
            r0 = r1
            goto L1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.d.a(w2.f, android.util.LongSparseArray):void");
    }

    public final void b(@NotNull f fVar, @NotNull long[] jArr, @NotNull int[] iArr, @NotNull Consumer<ViewTranslationRequest> consumer) {
        q qVar;
        String o13;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j13 : jArr) {
            q3 q3Var = (q3) fVar.e().h((int) j13);
            if (q3Var != null && (qVar = q3Var.f116173a) != null) {
                b.l();
                ViewTranslationRequest.Builder f13 = b.f(fVar.f127612a.getAutofillId(), qVar.f140717g);
                List list = (List) bs1.c.M0(qVar.f140714d, t.f140753v);
                if (list != null && (o13 = g0.o(list, "\n")) != null) {
                    forText = TranslationRequestValue.forText(new g(o13, null, 6));
                    f13.setValue("android:text", forText);
                    build = f13.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public final void c(@NotNull f fVar, @NotNull LongSparseArray<ViewTranslationResponse> longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(fVar, longSparseArray);
        } else {
            fVar.f127612a.post(new c(0, fVar, longSparseArray));
        }
    }
}
