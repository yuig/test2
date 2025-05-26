package h4;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kh2.g3;
import kh2.p2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f67519a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67520b;

    /* renamed from: c, reason: collision with root package name */
    public int f67521c;

    /* renamed from: d, reason: collision with root package name */
    public f0 f67522d;

    /* renamed from: e, reason: collision with root package name */
    public int f67523e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f67524f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f67525g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f67526h = true;

    public b0(f0 f0Var, j0 j0Var, boolean z13) {
        this.f67519a = j0Var;
        this.f67520b = z13;
        this.f67522d = f0Var;
    }

    public final void a(j jVar) {
        this.f67521c++;
        try {
            this.f67525g.add(jVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i13 = this.f67521c - 1;
        this.f67521c = i13;
        if (i13 == 0) {
            ArrayList arrayList = this.f67525g;
            if (!arrayList.isEmpty()) {
                this.f67519a.f67569a.f67576e.invoke(CollectionsKt.H0(arrayList));
                arrayList.clear();
            }
        }
        return this.f67521c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z13 = this.f67526h;
        if (!z13) {
            return z13;
        }
        this.f67521c++;
        return true;
    }

    public final void c(int i13) {
        sendKeyEvent(new KeyEvent(0, i13));
        sendKeyEvent(new KeyEvent(1, i13));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i13) {
        boolean z13 = this.f67526h;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f67525g.clear();
        this.f67521c = 0;
        this.f67526h = false;
        k0 k0Var = this.f67519a.f67569a;
        int size = k0Var.f67580i.size();
        for (int i13 = 0; i13 < size; i13++) {
            ArrayList arrayList = k0Var.f67580i;
            if (Intrinsics.d(((WeakReference) arrayList.get(i13)).get(), this)) {
                arrayList.remove(i13);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z13 = this.f67526h;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        boolean z13 = this.f67526h;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z13 = this.f67526h;
        return z13 ? this.f67520b : z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i13) {
        boolean z13 = this.f67526h;
        if (z13) {
            a(new a(String.valueOf(charSequence), i13));
        }
        return z13;
    }

    public final void d(f0 f0Var) {
        this.f67522d = f0Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i13, int i14) {
        boolean z13 = this.f67526h;
        if (!z13) {
            return z13;
        }
        a(new h(i13, i14));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        boolean z13 = this.f67526h;
        if (!z13) {
            return z13;
        }
        a(new i(i13, i14));
        return true;
    }

    public final void e(f0 f0Var, p pVar) {
        if (this.f67526h) {
            this.f67522d = f0Var;
            if (this.f67524f) {
                q qVar = (q) pVar;
                ((InputMethodManager) qVar.f67606b.getValue()).updateExtractedText(qVar.f67605a, this.f67523e, p2.g1(f0Var));
            }
            b4.p0 p0Var = f0Var.f67561c;
            int e13 = p0Var != null ? b4.p0.e(p0Var.f21641a) : -1;
            b4.p0 p0Var2 = f0Var.f67561c;
            int d2 = p0Var2 != null ? b4.p0.d(p0Var2.f21641a) : -1;
            long j13 = f0Var.f67560b;
            q qVar2 = (q) pVar;
            ((InputMethodManager) qVar2.f67606b.getValue()).updateSelection(qVar2.f67605a, b4.p0.e(j13), b4.p0.d(j13), e13, d2);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z13 = this.f67526h;
        if (!z13) {
            return z13;
        }
        a(new m());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i13) {
        f0 f0Var = this.f67522d;
        return TextUtils.getCapsMode(f0Var.f67559a.f21571a, b4.p0.e(f0Var.f67560b), i13);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i13) {
        boolean z13 = (i13 & 1) != 0;
        this.f67524f = z13;
        if (z13) {
            this.f67523e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return p2.g1(this.f67522d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i13) {
        if (b4.p0.b(this.f67522d.f67560b)) {
            return null;
        }
        return g3.h0(this.f67522d).f21571a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i13, int i14) {
        return g3.k0(this.f67522d, i13).f21571a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i13, int i14) {
        return g3.l0(this.f67522d, i13).f21571a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i13) {
        boolean z13 = this.f67526h;
        if (z13) {
            z13 = false;
            switch (i13) {
                case R.id.selectAll:
                    a(new e0(0, this.f67522d.f67559a.f21571a.length()));
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
        boolean z13 = this.f67526h;
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
                this.f67519a.f67569a.f67577f.invoke(new n(i14));
            }
            i14 = 1;
            this.f67519a.f67569a.f67577f.invoke(new n(i14));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z13 = this.f67526h;
        if (z13) {
            return true;
        }
        return z13;
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
            boolean r0 = r9.f67526h
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
            h4.j0 r4 = r9.f67519a
            h4.k0 r4 = r4.f67569a
            h4.f r4 = r4.f67583l
            java.lang.Object r7 = r4.f67543c
            monitor-enter(r7)
            r4.f67546f = r5     // Catch: java.lang.Throwable -> L6d
            r4.f67547g = r6     // Catch: java.lang.Throwable -> L6d
            r4.f67548h = r1     // Catch: java.lang.Throwable -> L6d
            r4.f67549i = r10     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L6f
            r4.f67545e = r2     // Catch: java.lang.Throwable -> L6d
            h4.f0 r10 = r4.f67550j     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L6f
            r4.a()     // Catch: java.lang.Throwable -> L6d
            goto L6f
        L6d:
            r10 = move-exception
            goto L75
        L6f:
            r4.f67544d = r3     // Catch: java.lang.Throwable -> L6d
            kotlin.Unit r10 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.b0.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z13 = this.f67526h;
        if (!z13) {
            return z13;
        }
        ((BaseInputConnection) this.f67519a.f67569a.f67581j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i13, int i14) {
        boolean z13 = this.f67526h;
        if (z13) {
            a(new c0(i13, i14));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i13) {
        boolean z13 = this.f67526h;
        if (z13) {
            a(new d0(String.valueOf(charSequence), i13));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i13, int i14) {
        boolean z13 = this.f67526h;
        if (!z13) {
            return z13;
        }
        a(new e0(i13, i14));
        return true;
    }
}
