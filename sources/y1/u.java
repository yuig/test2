package y1;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import b2.t0;
import b4.l0;
import b4.m0;
import b4.p0;
import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import t3.e4;
import w1.l1;
import w1.r2;
import w1.w0;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f136603a = new u();

    private final void C(l1 l1Var, SelectGesture selectGesture, t0 t0Var) {
        RectF selectionArea;
        int granularity;
        if (t0Var != null) {
            selectionArea = selectGesture.getSelectionArea();
            a3.d P0 = n3.P0(selectionArea);
            granularity = selectGesture.getGranularity();
            long f13 = androidx.compose.foundation.text.input.internal.a.f(l1Var, P0, G(granularity));
            l1 l1Var2 = t0Var.f21219d;
            if (l1Var2 != null) {
                l1Var2.g(f13);
            }
            l1 l1Var3 = t0Var.f21219d;
            if (l1Var3 != null) {
                l1Var3.f(p0.f21639b);
            }
            if (p0.b(f13)) {
                return;
            }
            t0Var.u(false);
            t0Var.r(w0.None);
        }
    }

    private final void D(k0 k0Var, SelectGesture selectGesture, j0 j0Var) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        n3.P0(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void E(l1 l1Var, SelectRangeGesture selectRangeGesture, t0 t0Var) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        if (t0Var != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            a3.d P0 = n3.P0(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            a3.d P02 = n3.P0(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            long a13 = androidx.compose.foundation.text.input.internal.a.a(l1Var, P0, P02, G(granularity));
            l1 l1Var2 = t0Var.f21219d;
            if (l1Var2 != null) {
                l1Var2.g(a13);
            }
            l1 l1Var3 = t0Var.f21219d;
            if (l1Var3 != null) {
                l1Var3.f(p0.f21639b);
            }
            if (p0.b(a13)) {
                return;
            }
            t0Var.u(false);
            t0Var.r(w0.None);
        }
    }

    private final void F(k0 k0Var, SelectRangeGesture selectRangeGesture, j0 j0Var) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        n3.P0(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        n3.P0(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int G(int i13) {
        return i13 != 1 ? 0 : 1;
    }

    private final int a(k0 k0Var, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, Function1<? super h4.j, Unit> function1) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        function1.invoke(new h4.a(fallbackText, 1));
        return 5;
    }

    private final int c(l1 l1Var, DeleteGesture deleteGesture, b4.g gVar, Function1<? super h4.j, Unit> function1) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        int G = G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        long f13 = androidx.compose.foundation.text.input.internal.a.f(l1Var, n3.P0(deletionArea), G);
        if (p0.b(f13)) {
            return f136603a.b(q.n(deleteGesture), function1);
        }
        h(f13, gVar, G == 1, function1);
        return 1;
    }

    private final int d(k0 k0Var, DeleteGesture deleteGesture, j0 j0Var) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        n3.P0(deletionArea);
        throw null;
    }

    private final int e(l1 l1Var, DeleteRangeGesture deleteRangeGesture, b4.g gVar, Function1<? super h4.j, Unit> function1) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int G = G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        a3.d P0 = n3.P0(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long a13 = androidx.compose.foundation.text.input.internal.a.a(l1Var, P0, n3.P0(deletionEndArea), G);
        if (p0.b(a13)) {
            return f136603a.b(q.n(deleteRangeGesture), function1);
        }
        h(a13, gVar, G == 1, function1);
        return 1;
    }

    private final int f(k0 k0Var, DeleteRangeGesture deleteRangeGesture, j0 j0Var) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        n3.P0(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        n3.P0(deletionEndArea);
        throw null;
    }

    private final void g(k0 k0Var, long j13, boolean z13) {
        if (z13) {
            throw null;
        }
        z1.a aVar = z1.a.MergeIfPossible;
        throw null;
    }

    private final void h(long j13, b4.g gVar, boolean z13, Function1<? super h4.j, Unit> function1) {
        if (z13) {
            int i13 = p0.f21640c;
            int i14 = (int) (j13 >> 32);
            int i15 = (int) (j13 & 4294967295L);
            int codePointBefore = i14 > 0 ? Character.codePointBefore(gVar, i14) : 10;
            int codePointAt = i15 < gVar.length() ? Character.codePointAt(gVar, i15) : 10;
            if (androidx.compose.foundation.text.input.internal.a.i(codePointBefore) && (androidx.compose.foundation.text.input.internal.a.h(codePointAt) || androidx.compose.foundation.text.input.internal.a.g(codePointAt))) {
                do {
                    i14 -= Character.charCount(codePointBefore);
                    if (i14 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(gVar, i14);
                    }
                } while (androidx.compose.foundation.text.input.internal.a.i(codePointBefore));
                j13 = b7.c.h(i14, i15);
            } else if (androidx.compose.foundation.text.input.internal.a.i(codePointAt) && (androidx.compose.foundation.text.input.internal.a.h(codePointBefore) || androidx.compose.foundation.text.input.internal.a.g(codePointBefore))) {
                do {
                    i15 += Character.charCount(codePointAt);
                    if (i15 == gVar.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(gVar, i15);
                    }
                } while (androidx.compose.foundation.text.input.internal.a.i(codePointAt));
                j13 = b7.c.h(i14, i15);
            }
        }
        int i16 = (int) (4294967295L & j13);
        function1.invoke(new v(new h4.j[]{new h4.e0(i16, i16), new h4.h(p0.c(j13), 0)}));
    }

    private final int k(l1 l1Var, InsertGesture insertGesture, e4 e4Var, Function1<? super h4.j, Unit> function1) {
        PointF insertionPoint;
        r2 d2;
        String textToInsert;
        m0 m0Var;
        m0 m0Var2;
        b4.o oVar;
        q3.x c13;
        long B;
        int e13;
        if (e4Var == null) {
            return b(q.n(insertGesture), function1);
        }
        insertionPoint = insertGesture.getInsertionPoint();
        long d13 = com.bumptech.glide.c.d(insertionPoint.x, insertionPoint.y);
        r2 d14 = l1Var.d();
        int e14 = (d14 == null || (m0Var2 = d14.f127471a) == null || (oVar = m0Var2.f21616b) == null || (c13 = l1Var.c()) == null || (e13 = androidx.compose.foundation.text.input.internal.a.e(oVar, (B = c13.B(d13)), e4Var)) == -1) ? -1 : oVar.e(a3.c.a(B, (oVar.b(e13) + oVar.d(e13)) / 2.0f, 1));
        if (e14 == -1 || !((d2 = l1Var.d()) == null || (m0Var = d2.f127471a) == null || !androidx.compose.foundation.text.input.internal.a.b(m0Var, e14))) {
            return b(q.n(insertGesture), function1);
        }
        textToInsert = insertGesture.getTextToInsert();
        m(e14, textToInsert, function1);
        return 1;
    }

    private final int l(k0 k0Var, InsertGesture insertGesture, j0 j0Var, e4 e4Var) {
        PointF insertionPoint;
        insertionPoint = insertGesture.getInsertionPoint();
        com.bumptech.glide.c.d(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i13, String str, Function1<? super h4.j, Unit> function1) {
        function1.invoke(new v(new h4.j[]{new h4.e0(i13, i13), new h4.a(str, 1)}));
    }

    private final int n(l1 l1Var, JoinOrSplitGesture joinOrSplitGesture, b4.g gVar, e4 e4Var, Function1<? super h4.j, Unit> function1) {
        PointF joinOrSplitPoint;
        r2 d2;
        m0 m0Var;
        m0 m0Var2;
        b4.o oVar;
        q3.x c13;
        long B;
        int e13;
        if (e4Var == null) {
            return b(q.n(joinOrSplitGesture), function1);
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long d13 = com.bumptech.glide.c.d(joinOrSplitPoint.x, joinOrSplitPoint.y);
        r2 d14 = l1Var.d();
        int e14 = (d14 == null || (m0Var2 = d14.f127471a) == null || (oVar = m0Var2.f21616b) == null || (c13 = l1Var.c()) == null || (e13 = androidx.compose.foundation.text.input.internal.a.e(oVar, (B = c13.B(d13)), e4Var)) == -1) ? -1 : oVar.e(a3.c.a(B, (oVar.b(e13) + oVar.d(e13)) / 2.0f, 1));
        if (e14 == -1 || !((d2 = l1Var.d()) == null || (m0Var = d2.f127471a) == null || !androidx.compose.foundation.text.input.internal.a.b(m0Var, e14))) {
            return b(q.n(joinOrSplitGesture), function1);
        }
        int i13 = e14;
        while (i13 > 0) {
            int codePointBefore = Character.codePointBefore(gVar, i13);
            if (!androidx.compose.foundation.text.input.internal.a.h(codePointBefore)) {
                break;
            }
            i13 -= Character.charCount(codePointBefore);
        }
        while (e14 < gVar.length()) {
            int codePointAt = Character.codePointAt(gVar, e14);
            if (!androidx.compose.foundation.text.input.internal.a.h(codePointAt)) {
                break;
            }
            e14 += Character.charCount(codePointAt);
        }
        long h10 = b7.c.h(i13, e14);
        if (p0.b(h10)) {
            m((int) (h10 >> 32), " ", function1);
        } else {
            h(h10, gVar, false, function1);
        }
        return 1;
    }

    private final int o(k0 k0Var, JoinOrSplitGesture joinOrSplitGesture, j0 j0Var, e4 e4Var) {
        throw null;
    }

    private final int p(l1 l1Var, RemoveSpaceGesture removeSpaceGesture, b4.g gVar, e4 e4Var, Function1<? super h4.j, Unit> function1) {
        PointF startPoint;
        PointF endPoint;
        long j13;
        String sb3;
        int i13;
        r2 d2 = l1Var.d();
        m0 m0Var = d2 != null ? d2.f127471a : null;
        startPoint = removeSpaceGesture.getStartPoint();
        long d13 = com.bumptech.glide.c.d(startPoint.x, startPoint.y);
        endPoint = removeSpaceGesture.getEndPoint();
        long d14 = com.bumptech.glide.c.d(endPoint.x, endPoint.y);
        q3.x c13 = l1Var.c();
        if (m0Var == null || c13 == null) {
            j13 = p0.f21639b;
        } else {
            long B = c13.B(d13);
            long B2 = c13.B(d14);
            b4.o oVar = m0Var.f21616b;
            int e13 = androidx.compose.foundation.text.input.internal.a.e(oVar, B, e4Var);
            int e14 = androidx.compose.foundation.text.input.internal.a.e(oVar, B2, e4Var);
            if (e13 != -1) {
                if (e14 != -1) {
                    e13 = Math.min(e13, e14);
                }
                e14 = e13;
            } else if (e14 == -1) {
                j13 = p0.f21639b;
            }
            float b13 = (oVar.b(e14) + oVar.d(e14)) / 2;
            j13 = oVar.f(new a3.d(Math.min(a3.c.d(B), a3.c.d(B2)), b13 - 0.1f, Math.max(a3.c.d(B), a3.c.d(B2)), b13 + 0.1f), 0, b4.i0.f21596a);
        }
        if (p0.b(j13)) {
            return f136603a.b(q.n(removeSpaceGesture), function1);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f80426a = -1;
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f80426a = -1;
        String input = gVar.subSequence(p0.e(j13), p0.d(j13)).toString();
        Regex regex = new Regex("\\s+");
        t transform = new t(h0Var, h0Var2);
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        kotlin.text.j b14 = regex.b(0, input);
        if (b14 == null) {
            sb3 = input.toString();
        } else {
            int length = input.length();
            StringBuilder sb4 = new StringBuilder(length);
            int i14 = 0;
            do {
                sb4.append((CharSequence) input, i14, b14.a().f80453a);
                transform.invoke(b14);
                sb4.append((CharSequence) "");
                i14 = b14.a().f80454b + 1;
                b14 = b14.next();
                if (i14 >= length) {
                    break;
                }
            } while (b14 != null);
            if (i14 < length) {
                sb4.append((CharSequence) input, i14, length);
            }
            sb3 = sb4.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        }
        int i15 = h0Var.f80426a;
        if (i15 == -1 || (i13 = h0Var2.f80426a) == -1) {
            return b(q.n(removeSpaceGesture), function1);
        }
        int i16 = (int) (j13 >> 32);
        String substring = sb3.substring(i15, sb3.length() - (p0.c(j13) - h0Var2.f80426a));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        function1.invoke(new v(new h4.j[]{new h4.e0(i16 + i15, i16 + i13), new h4.a(substring, 1)}));
        return 1;
    }

    private final int q(k0 k0Var, RemoveSpaceGesture removeSpaceGesture, j0 j0Var, e4 e4Var) {
        throw null;
    }

    private final int r(l1 l1Var, SelectGesture selectGesture, t0 t0Var, Function1<? super h4.j, Unit> function1) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        a3.d P0 = n3.P0(selectionArea);
        granularity = selectGesture.getGranularity();
        long f13 = androidx.compose.foundation.text.input.internal.a.f(l1Var, P0, G(granularity));
        if (p0.b(f13)) {
            return f136603a.b(q.n(selectGesture), function1);
        }
        v(f13, t0Var, function1);
        return 1;
    }

    private final int s(k0 k0Var, SelectGesture selectGesture, j0 j0Var) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        n3.P0(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int t(l1 l1Var, SelectRangeGesture selectRangeGesture, t0 t0Var, Function1<? super h4.j, Unit> function1) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        a3.d P0 = n3.P0(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        a3.d P02 = n3.P0(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long a13 = androidx.compose.foundation.text.input.internal.a.a(l1Var, P0, P02, G(granularity));
        if (p0.b(a13)) {
            return f136603a.b(q.n(selectRangeGesture), function1);
        }
        v(a13, t0Var, function1);
        return 1;
    }

    private final int u(k0 k0Var, SelectRangeGesture selectRangeGesture, j0 j0Var) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        n3.P0(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        n3.P0(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void v(long j13, t0 t0Var, Function1<? super h4.j, Unit> function1) {
        int i13 = p0.f21640c;
        function1.invoke(new h4.e0((int) (j13 >> 32), (int) (j13 & 4294967295L)));
        if (t0Var != null) {
            t0Var.h(true);
        }
    }

    private final void w(l1 l1Var, DeleteGesture deleteGesture, t0 t0Var) {
        RectF deletionArea;
        int granularity;
        if (t0Var != null) {
            deletionArea = deleteGesture.getDeletionArea();
            a3.d P0 = n3.P0(deletionArea);
            granularity = deleteGesture.getGranularity();
            long f13 = androidx.compose.foundation.text.input.internal.a.f(l1Var, P0, G(granularity));
            l1 l1Var2 = t0Var.f21219d;
            if (l1Var2 != null) {
                l1Var2.f(f13);
            }
            l1 l1Var3 = t0Var.f21219d;
            if (l1Var3 != null) {
                l1Var3.g(p0.f21639b);
            }
            if (p0.b(f13)) {
                return;
            }
            t0Var.u(false);
            t0Var.r(w0.None);
        }
    }

    private final void x(k0 k0Var, DeleteGesture deleteGesture, j0 j0Var) {
        RectF deletionArea;
        int granularity;
        deletionArea = deleteGesture.getDeletionArea();
        n3.P0(deletionArea);
        granularity = deleteGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void y(l1 l1Var, DeleteRangeGesture deleteRangeGesture, t0 t0Var) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        if (t0Var != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            a3.d P0 = n3.P0(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            a3.d P02 = n3.P0(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            long a13 = androidx.compose.foundation.text.input.internal.a.a(l1Var, P0, P02, G(granularity));
            l1 l1Var2 = t0Var.f21219d;
            if (l1Var2 != null) {
                l1Var2.f(a13);
            }
            l1 l1Var3 = t0Var.f21219d;
            if (l1Var3 != null) {
                l1Var3.g(p0.f21639b);
            }
            if (p0.b(a13)) {
                return;
            }
            t0Var.u(false);
            t0Var.r(w0.None);
        }
    }

    private final void z(k0 k0Var, DeleteRangeGesture deleteRangeGesture, j0 j0Var) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        n3.P0(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        n3.P0(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    public final boolean A(@NotNull l1 l1Var, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, t0 t0Var, CancellationSignal cancellationSignal) {
        m0 m0Var;
        l0 l0Var;
        b4.g gVar = l1Var.f127364j;
        if (gVar == null) {
            return false;
        }
        r2 d2 = l1Var.d();
        if (!Intrinsics.d(gVar, (d2 == null || (m0Var = d2.f127471a) == null || (l0Var = m0Var.f21615a) == null) ? null : l0Var.f21603a)) {
            return false;
        }
        if (q.D(previewableHandwritingGesture)) {
            C(l1Var, r.b(previewableHandwritingGesture), t0Var);
        } else if (q.u(previewableHandwritingGesture)) {
            w(l1Var, q.l(previewableHandwritingGesture), t0Var);
        } else if (q.y(previewableHandwritingGesture)) {
            E(l1Var, q.r(previewableHandwritingGesture), t0Var);
        } else {
            if (!q.z(previewableHandwritingGesture)) {
                return false;
            }
            y(l1Var, q.m(previewableHandwritingGesture), t0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new s(t0Var, 0));
        return true;
    }

    public final boolean B(@NotNull k0 k0Var, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @NotNull j0 j0Var, CancellationSignal cancellationSignal) {
        if (q.D(previewableHandwritingGesture)) {
            D(k0Var, r.b(previewableHandwritingGesture), j0Var);
        } else if (q.u(previewableHandwritingGesture)) {
            x(k0Var, q.l(previewableHandwritingGesture), j0Var);
        } else if (q.y(previewableHandwritingGesture)) {
            F(k0Var, q.r(previewableHandwritingGesture), j0Var);
        } else {
            if (!q.z(previewableHandwritingGesture)) {
                return false;
            }
            z(k0Var, q.m(previewableHandwritingGesture), j0Var);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new s(k0Var, 1));
        }
        return true;
    }

    public final int i(@NotNull l1 l1Var, @NotNull HandwritingGesture handwritingGesture, t0 t0Var, e4 e4Var, @NotNull Function1<? super h4.j, Unit> function1) {
        m0 m0Var;
        l0 l0Var;
        b4.g gVar = l1Var.f127364j;
        if (gVar == null) {
            return 3;
        }
        r2 d2 = l1Var.d();
        if (!Intrinsics.d(gVar, (d2 == null || (m0Var = d2.f127471a) == null || (l0Var = m0Var.f21615a) == null) ? null : l0Var.f21603a)) {
            return 3;
        }
        if (q.D(handwritingGesture)) {
            return r(l1Var, r.b(handwritingGesture), t0Var, function1);
        }
        if (q.u(handwritingGesture)) {
            return c(l1Var, q.l(handwritingGesture), gVar, function1);
        }
        if (q.y(handwritingGesture)) {
            return t(l1Var, q.r(handwritingGesture), t0Var, function1);
        }
        if (q.z(handwritingGesture)) {
            return e(l1Var, q.m(handwritingGesture), gVar, function1);
        }
        if (q.C(handwritingGesture)) {
            return n(l1Var, q.p(handwritingGesture), gVar, e4Var, function1);
        }
        if (q.A(handwritingGesture)) {
            return k(l1Var, q.o(handwritingGesture), e4Var, function1);
        }
        if (q.B(handwritingGesture)) {
            return p(l1Var, q.q(handwritingGesture), gVar, e4Var, function1);
        }
        return 2;
    }

    public final int j(@NotNull k0 k0Var, @NotNull HandwritingGesture handwritingGesture, @NotNull j0 j0Var, e4 e4Var) {
        if (q.D(handwritingGesture)) {
            return s(k0Var, r.b(handwritingGesture), j0Var);
        }
        if (q.u(handwritingGesture)) {
            return d(k0Var, q.l(handwritingGesture), j0Var);
        }
        if (q.y(handwritingGesture)) {
            return u(k0Var, q.r(handwritingGesture), j0Var);
        }
        if (q.z(handwritingGesture)) {
            return f(k0Var, q.m(handwritingGesture), j0Var);
        }
        if (q.C(handwritingGesture)) {
            return o(k0Var, q.p(handwritingGesture), j0Var, e4Var);
        }
        if (q.A(handwritingGesture)) {
            return l(k0Var, q.o(handwritingGesture), j0Var, e4Var);
        }
        if (q.B(handwritingGesture)) {
            return q(k0Var, q.q(handwritingGesture), j0Var, e4Var);
        }
        return 2;
    }
}
