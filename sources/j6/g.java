package j6;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class g implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f74805a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.e f74806b;

    public g(KeyListener keyListener) {
        e3.e eVar = new e3.e();
        this.f74805a = keyListener;
        this.f74806b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i13) {
        this.f74805a.clearMetaKeyState(view, editable, i13);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f74805a.getInputType();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.text.method.KeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
        /*
            r3 = this;
            e3.e r0 = r3.f74806b
            r0.getClass()
            java.lang.Object r0 = h6.m.f67727j
            r0 = 67
            r1 = 1
            r2 = 0
            if (r6 == r0) goto L17
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto L12
            goto L21
        L12:
            boolean r0 = e3.a.a(r5, r7, r1)
            goto L1b
        L17:
            boolean r0 = e3.a.a(r5, r7, r2)
        L1b:
            if (r0 == 0) goto L21
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            goto L2b
        L21:
            android.text.method.KeyListener r0 = r3.f74805a
            boolean r4 = r0.onKeyDown(r4, r5, r6, r7)
            if (r4 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.g.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f74805a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i13, KeyEvent keyEvent) {
        return this.f74805a.onKeyUp(view, editable, i13, keyEvent);
    }
}
