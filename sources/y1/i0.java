package y1;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import b2.t0;
import b4.p0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kh2.g3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t3.e4;
import w1.l1;

/* loaded from: classes2.dex */
public final class i0 implements InputConnection {

    /* renamed from: a */
    public final f0 f136575a;

    /* renamed from: b */
    public final boolean f136576b;

    /* renamed from: c */
    public final l1 f136577c;

    /* renamed from: d */
    public final t0 f136578d;

    /* renamed from: e */
    public final e4 f136579e;

    /* renamed from: f */
    public int f136580f;

    /* renamed from: g */
    public h4.f0 f136581g;

    /* renamed from: h */
    public int f136582h;

    /* renamed from: i */
    public boolean f136583i;

    /* renamed from: j */
    public final ArrayList f136584j = new ArrayList();

    /* renamed from: k */
    public boolean f136585k = true;

    public i0(h4.f0 f0Var, f0 f0Var2, boolean z13, l1 l1Var, t0 t0Var, e4 e4Var) {
        this.f136575a = f0Var2;
        this.f136576b = z13;
        this.f136577c = l1Var;
        this.f136578d = t0Var;
        this.f136579e = e4Var;
        this.f136581g = f0Var;
    }

    public final void a(h4.j jVar) {
        this.f136580f++;
        try {
            this.f136584j.add(jVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i13 = this.f136580f - 1;
        this.f136580f = i13;
        if (i13 == 0) {
            ArrayList arrayList = this.f136584j;
            if (!arrayList.isEmpty()) {
                this.f136575a.f136555a.f136561c.invoke(CollectionsKt.H0(arrayList));
                arrayList.clear();
            }
        }
        return this.f136580f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z13 = this.f136585k;
        if (!z13) {
            return z13;
        }
        this.f136580f++;
        return true;
    }

    public final void c(int i13) {
        sendKeyEvent(new KeyEvent(0, i13));
        sendKeyEvent(new KeyEvent(1, i13));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i13) {
        boolean z13 = this.f136585k;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f136584j.clear();
        this.f136580f = 0;
        this.f136585k = false;
        g0 g0Var = this.f136575a.f136555a;
        int size = g0Var.f136568j.size();
        for (int i13 = 0; i13 < size; i13++) {
            ArrayList arrayList = g0Var.f136568j;
            if (Intrinsics.d(((WeakReference) arrayList.get(i13)).get(), this)) {
                arrayList.remove(i13);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z13 = this.f136585k;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        boolean z13 = this.f136585k;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z13 = this.f136585k;
        return z13 ? this.f136576b : z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i13) {
        boolean z13 = this.f136585k;
        if (z13) {
            a(new h4.a(String.valueOf(charSequence), i13));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i13, int i14) {
        boolean z13 = this.f136585k;
        if (!z13) {
            return z13;
        }
        a(new h4.h(i13, i14));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        boolean z13 = this.f136585k;
        if (!z13) {
            return z13;
        }
        a(new h4.i(i13, i14));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z13 = this.f136585k;
        if (!z13) {
            return z13;
        }
        a(new h4.m());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i13) {
        h4.f0 f0Var = this.f136581g;
        return TextUtils.getCapsMode(f0Var.f67559a.f21571a, p0.e(f0Var.f67560b), i13);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i13) {
        boolean z13 = (i13 & 1) != 0;
        this.f136583i = z13;
        if (z13) {
            this.f136582h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return androidx.compose.foundation.text.input.internal.a.c(this.f136581g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i13) {
        if (p0.b(this.f136581g.f67560b)) {
            return null;
        }
        return g3.h0(this.f136581g).f21571a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i13, int i14) {
        return g3.k0(this.f136581g, i13).f21571a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i13, int i14) {
        return g3.l0(this.f136581g, i13).f21571a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i13) {
        boolean z13 = this.f136585k;
        if (z13) {
            z13 = false;
            switch (i13) {
                case R.id.selectAll:
                    a(new h4.e0(0, this.f136581g.f67559a.f21571a.length()));
                    break;
                case R.id.cut:
                    c(RecyclerViewTypes.VIEW_TYPE_PIN_AD_EXCLUDE);
                    break;
                case R.id.copy:
                    c(RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN_AD_EXCLUDE);
                    break;
                case R.id.paste:
                    c(RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL);
                    break;
            }
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i13) {
        int i14;
        boolean z13 = this.f136585k;
        if (z13) {
            z13 = true;
            if (i13 != 0) {
                switch (i13) {
                    case 2:
                        i14 = 2;
                        break;
                    case 3:
                        i14 = 3;
                        break;
                    case 4:
                        i14 = 4;
                        break;
                    case 5:
                        i14 = 6;
                        break;
                    case 6:
                        i14 = 7;
                        break;
                    case 7:
                        i14 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i13);
                        break;
                }
                this.f136575a.f136555a.f136562d.invoke(new h4.n(i14));
            }
            i14 = 1;
            this.f136575a.f136555a.f136562d.invoke(new h4.n(i14));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            h.f136572a.a(this.f136577c, this.f136578d, handwritingGesture, this.f136579e, executor, intConsumer, new q0.e(this, 20));
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z13 = this.f136585k;
        if (z13) {
            return true;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return h.f136572a.b(this.f136577c, this.f136578d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z13) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f136585k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            y1.f0 r4 = r9.f136575a
            y1.g0 r4 = r4.f136555a
            y1.a0 r4 = r4.f136571m
            java.lang.Object r7 = r4.f136520c
            monitor-enter(r7)
            r4.f136523f = r5     // Catch: java.lang.Throwable -> L6d
            r4.f136524g = r6     // Catch: java.lang.Throwable -> L6d
            r4.f136525h = r1     // Catch: java.lang.Throwable -> L6d
            r4.f136526i = r10     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6f
            r4.f136522e = r2     // Catch: java.lang.Throwable -> L6d
            h4.f0 r10 = r4.f136527j     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L6f
            r4.a()     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r10 = move-exception
            goto L75
        L6f:
            r4.f136521d = r3     // Catch: java.lang.Throwable -> L6d
            kotlin.Unit r10 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.i0.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z13 = this.f136585k;
        if (!z13) {
            return z13;
        }
        ((BaseInputConnection) this.f136575a.f136555a.f136569k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i13, int i14) {
        boolean z13 = this.f136585k;
        if (z13) {
            a(new h4.c0(i13, i14));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i13) {
        boolean z13 = this.f136585k;
        if (z13) {
            a(new h4.d0(String.valueOf(charSequence), i13));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i13, int i14) {
        boolean z13 = this.f136585k;
        if (!z13) {
            return z13;
        }
        a(new h4.e0(i13, i14));
        return true;
    }
}
