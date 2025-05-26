package c5;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.a1;
import g1.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class h extends Activity implements androidx.lifecycle.z, q5.k {

    @NotNull
    private final o0 extraDataMap = new o0(0);

    @NotNull
    private final androidx.lifecycle.b0 lifecycleRegistry = new androidx.lifecycle.b0(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (kotlin.jvm.internal.r.p(decorView, event)) {
            return true;
        }
        return kotlin.jvm.internal.r.q(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        if (kotlin.jvm.internal.r.p(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public void g() {
        finish();
    }

    @xk2.d
    public <T extends g> T getExtraData(@NotNull Class<T> extraDataClass) {
        Intrinsics.checkNotNullParameter(extraDataClass, "extraDataClass");
        ep.b.A(this.extraDataMap.get(extraDataClass));
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i13 = a1.f18582b;
        bk.f.U(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.lifecycleRegistry.g(androidx.lifecycle.r.CREATED);
        super.onSaveInstanceState(outState);
    }

    @xk2.d
    public void putExtraData(@NotNull g extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 31) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r4.equals("--autofill") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldDumpInternalState(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L56
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto L56
        L8:
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L46;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1d;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L56
        L12:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L1b
            goto L56
        L1b:
            r1 = r0
            goto L56
        L1d:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L26
            goto L56
        L26:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L56
            goto L1b
        L2d:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3f
            goto L56
        L36:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L3f
            goto L56
        L3f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L56
            goto L1b
        L46:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4f
            goto L56
        L4f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L56
            goto L1b
        L56:
            r4 = r1 ^ 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.h.shouldDumpInternalState(java.lang.String[]):boolean");
    }

    @Override // q5.k
    public boolean superDispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
