package e3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.firebase.messaging.FirebaseMessaging;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.a4;
import h32.d4;
import h6.d0;
import h6.g0;
import h6.u;
import h6.w;
import h6.x;
import i32.a0;
import i32.y0;
import java.util.HashMap;
import java.util.WeakHashMap;
import q5.m0;
import q5.s;
import q5.t;
import q5.v0;

/* loaded from: classes.dex */
public final class a implements uk1.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f56995a;

    /* renamed from: b, reason: collision with root package name */
    public Object f56996b;

    /* renamed from: c, reason: collision with root package name */
    public Object f56997c;

    /* renamed from: d, reason: collision with root package name */
    public Object f56998d;

    /* renamed from: e, reason: collision with root package name */
    public Object f56999e;

    public a(int i13) {
        if (i13 != 5) {
            return;
        }
        this.f56995a = false;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z13) {
        x[] xVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (xVarArr = (x[]) editable.getSpans(selectionStart, selectionEnd, x.class)) != null && xVarArr.length > 0) {
            for (x xVar : xVarArr) {
                int spanStart = editable.getSpanStart(xVar);
                int spanEnd = editable.getSpanEnd(xVar);
                if ((z13 && spanStart == selectionStart) || ((!z13 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(float f13, float f14, boolean z13) {
        ViewParent f15;
        if (!this.f56995a || (f15 = f(0)) == null) {
            return false;
        }
        try {
            return f15.onNestedFling((View) this.f56998d, f13, f14, z13);
        } catch (AbstractMethodError e13) {
            Log.e("ViewParentCompat", "ViewParent " + f15 + " does not implement interface method onNestedFling", e13);
            return false;
        }
    }

    public final boolean c(float f13, float f14) {
        ViewParent f15;
        if (!this.f56995a || (f15 = f(0)) == null) {
            return false;
        }
        try {
            return f15.onNestedPreFling((View) this.f56998d, f13, f14);
        } catch (AbstractMethodError e13) {
            Log.e("ViewParentCompat", "ViewParent " + f15 + " does not implement interface method onNestedPreFling", e13);
            return false;
        }
    }

    public final boolean d(int i13, int i14, int i15, int[] iArr, int[] iArr2) {
        ViewParent f13;
        int i16;
        int i17;
        int[] iArr3;
        if (!this.f56995a || (f13 = f(i15)) == null) {
            return false;
        }
        if (i13 == 0 && i14 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            ((View) this.f56998d).getLocationInWindow(iArr2);
            i16 = iArr2[0];
            i17 = iArr2[1];
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (iArr == null) {
            if (((int[]) this.f56999e) == null) {
                this.f56999e = new int[2];
            }
            iArr3 = (int[]) this.f56999e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = (View) this.f56998d;
        if (f13 instanceof s) {
            ((s) f13).l(view, i13, i14, iArr3, i15);
        } else if (i15 == 0) {
            try {
                f13.onNestedPreScroll(view, i13, i14, iArr3);
            } catch (AbstractMethodError e13) {
                Log.e("ViewParentCompat", "ViewParent " + f13 + " does not implement interface method onNestedPreScroll", e13);
            }
        }
        if (iArr2 != null) {
            ((View) this.f56998d).getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i16;
            iArr2[1] = iArr2[1] - i17;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean e(int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2) {
        ViewParent f13;
        int i18;
        int i19;
        int[] iArr3;
        if (!this.f56995a || (f13 = f(i17)) == null) {
            return false;
        }
        if (i13 == 0 && i14 == 0 && i15 == 0 && i16 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            ((View) this.f56998d).getLocationInWindow(iArr);
            i18 = iArr[0];
            i19 = iArr[1];
        } else {
            i18 = 0;
            i19 = 0;
        }
        if (iArr2 == null) {
            if (((int[]) this.f56999e) == null) {
                this.f56999e = new int[2];
            }
            int[] iArr4 = (int[]) this.f56999e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = (View) this.f56998d;
        if (f13 instanceof t) {
            ((t) f13).s(view, i13, i14, i15, i16, i17, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i15;
            iArr3[1] = iArr3[1] + i16;
            if (f13 instanceof s) {
                ((s) f13).t(view, i13, i14, i15, i16, i17);
            } else if (i17 == 0) {
                try {
                    f13.onNestedScroll(view, i13, i14, i15, i16);
                } catch (AbstractMethodError e13) {
                    Log.e("ViewParentCompat", "ViewParent " + f13 + " does not implement interface method onNestedScroll", e13);
                }
            }
        }
        if (iArr != null) {
            ((View) this.f56998d).getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i18;
            iArr[1] = iArr[1] - i19;
        }
        return true;
    }

    public final ViewParent f(int i13) {
        if (i13 == 0) {
            return (ViewParent) this.f56996b;
        }
        if (i13 != 1) {
            return null;
        }
        return (ViewParent) this.f56997c;
    }

    public final boolean g(CharSequence charSequence, int i13, int i14, g0 g0Var) {
        if ((g0Var.f67718c & 3) == 0) {
            h6.i iVar = (h6.i) this.f56998d;
            i6.a c13 = g0Var.c();
            int a13 = c13.a(8);
            if (a13 != 0) {
                c13.f71621b.getShort(a13 + c13.f71620a);
            }
            h6.e eVar = (h6.e) iVar;
            eVar.getClass();
            ThreadLocal threadLocal = h6.e.f67706b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb3 = (StringBuilder) threadLocal.get();
            sb3.setLength(0);
            while (i13 < i14) {
                sb3.append(charSequence.charAt(i13));
                i13++;
            }
            TextPaint textPaint = eVar.f67707a;
            String sb4 = sb3.toString();
            int i15 = f5.f.f61085a;
            boolean hasGlyph = textPaint.hasGlyph(sb4);
            int i16 = g0Var.f67718c & 4;
            g0Var.f67718c = hasGlyph ? i16 | 2 : i16 | 1;
        }
        return (g0Var.f67718c & 3) == 2;
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public final HashMap getO0() {
        return (HashMap) this.f56999e;
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final h32.g0 getF53240t0() {
        return (h32.g0) this.f56998d;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getN0() {
        return (a4) this.f56997c;
    }

    @Override // uk1.c
    /* renamed from: getViewType */
    public final d4 getF79792r0() {
        return (d4) this.f56996b;
    }

    public final boolean h(int i13) {
        return f(i13) != null;
    }

    public final synchronized void i() {
        try {
            if (this.f56995a) {
                return;
            }
            Boolean n13 = n();
            this.f56998d = n13;
            if (n13 == null) {
                com.google.firebase.messaging.k kVar = new com.google.firebase.messaging.k(this);
                this.f56997c = kVar;
                sl.l lVar = (sl.l) ((zl.c) this.f56996b);
                lVar.a(lVar.f113155c, kVar);
            }
            this.f56995a = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final boolean j() {
        rg0.n b13 = ((dh0.d) ((rg0.s) this.f56997c)).b(y0.ANDROID_APP_TAKEOVER);
        if (b13 == null) {
            return false;
        }
        if (b13.f108060b != i32.l.MOBILE_PRIVACY_AND_TERMS_BLOCKING_UPDATE_20180525.getValue()) {
            int value = a0.NAG.getValue();
            int i13 = b13.f108061c;
            if (i13 != value && i13 != a0.ACTION_PROMPT.getValue()) {
                int value2 = i32.l.ANDROID_NOTIFS_PERMISSION.getValue();
                int i14 = b13.f108060b;
                if (i14 != value2 && i14 != i32.l.SCHOOL_TEEN_PROMPT.getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final synchronized boolean k() {
        boolean z13;
        boolean z14;
        try {
            i();
            Object obj = this.f56998d;
            if (((Boolean) obj) != null) {
                z14 = ((Boolean) obj).booleanValue();
            } else {
                nl.g gVar = ((FirebaseMessaging) this.f56999e).f33730a;
                gVar.b();
                gm.a aVar = (gm.a) gVar.f91223g.get();
                synchronized (aVar) {
                    z13 = aVar.f65751a;
                }
                z14 = z13;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return z14;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.content.Context r13, com.pinterest.framework.screens.ScreenDescription r14) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.a.l(android.content.Context, com.pinterest.framework.screens.ScreenDescription):void");
    }

    public final Object m(CharSequence charSequence, int i13, int i14, int i15, boolean z13, u uVar) {
        int i16;
        char c13;
        w wVar = new w((d0) ((com.google.firebase.messaging.q) this.f56997c).f33805c, this.f56995a, (int[]) this.f56999e);
        int codePointAt = Character.codePointAt(charSequence, i13);
        boolean z14 = true;
        int i17 = 0;
        int i18 = i13;
        loop0: while (true) {
            i16 = i18;
            while (i18 < i14 && i17 < i15 && z14) {
                SparseArray sparseArray = wVar.f67755c.f67704a;
                d0 d0Var = sparseArray == null ? null : (d0) sparseArray.get(codePointAt);
                if (wVar.f67753a == 2) {
                    if (d0Var != null) {
                        wVar.f67755c = d0Var;
                        wVar.f67758f++;
                    } else {
                        if (codePointAt == 65038) {
                            wVar.a();
                        } else if (codePointAt != 65039) {
                            d0 d0Var2 = wVar.f67755c;
                            if (d0Var2.f67705b != null) {
                                if (wVar.f67758f != 1) {
                                    wVar.f67756d = d0Var2;
                                    wVar.a();
                                } else if (wVar.b()) {
                                    wVar.f67756d = wVar.f67755c;
                                    wVar.a();
                                } else {
                                    wVar.a();
                                }
                                c13 = 3;
                            } else {
                                wVar.a();
                            }
                        }
                        c13 = 1;
                    }
                    c13 = 2;
                } else if (d0Var == null) {
                    wVar.a();
                    c13 = 1;
                } else {
                    wVar.f67753a = 2;
                    wVar.f67755c = d0Var;
                    wVar.f67758f = 1;
                    c13 = 2;
                }
                wVar.f67757e = codePointAt;
                if (c13 == 1) {
                    i18 = Character.charCount(Character.codePointAt(charSequence, i16)) + i16;
                    if (i18 < i14) {
                        codePointAt = Character.codePointAt(charSequence, i18);
                    }
                } else if (c13 == 2) {
                    int charCount = Character.charCount(codePointAt) + i18;
                    if (charCount < i14) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i18 = charCount;
                } else if (c13 == 3) {
                    if (z13 || !g(charSequence, i16, i18, wVar.f67756d.f67705b)) {
                        z14 = uVar.a(charSequence, i16, i18, wVar.f67756d.f67705b);
                        i17++;
                    }
                }
            }
        }
        if (wVar.f67753a == 2 && wVar.f67755c.f67705b != null && ((wVar.f67758f > 1 || wVar.b()) && i17 < i15 && z14 && (z13 || !g(charSequence, i16, i18, wVar.f67755c.f67705b)))) {
            uVar.a(charSequence, i16, i18, wVar.f67755c.f67705b);
        }
        return uVar.b();
    }

    public final Boolean n() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        nl.g gVar = ((FirebaseMessaging) this.f56999e).f33730a;
        gVar.b();
        Context context = gVar.f91217a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void o(boolean z13) {
        if (this.f56995a) {
            View view = (View) this.f56998d;
            WeakHashMap weakHashMap = v0.f102521a;
            m0.r(view);
        }
        this.f56995a = z13;
    }

    public final void p(d4 d4Var, a4 a4Var, h32.g0 g0Var, HashMap hashMap) {
        this.f56995a = true;
        this.f56996b = d4Var;
        this.f56997c = a4Var;
        this.f56998d = g0Var;
        this.f56999e = hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.h(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.f56995a
            if (r0 == 0) goto L89
            java.lang.Object r0 = r8.f56998d
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            java.lang.Object r2 = r8.f56998d
            android.view.View r2 = (android.view.View) r2
        L18:
            if (r0 == 0) goto L89
            java.lang.Object r3 = r8.f56998d
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r0 instanceof q5.s
            java.lang.String r5 = "ViewParentCompat"
            java.lang.String r6 = "ViewParent "
            if (r4 == 0) goto L2e
            r7 = r0
            q5.s r7 = (q5.s) r7
            boolean r3 = r7.x(r2, r3, r9, r10)
            goto L34
        L2e:
            if (r10 != 0) goto L7d
            boolean r3 = r0.onStartNestedScroll(r2, r3, r9)     // Catch: java.lang.AbstractMethodError -> L68
        L34:
            if (r3 == 0) goto L7d
            if (r10 == 0) goto L3e
            if (r10 == r1) goto L3b
            goto L40
        L3b:
            r8.f56997c = r0
            goto L40
        L3e:
            r8.f56996b = r0
        L40:
            java.lang.Object r3 = r8.f56998d
            android.view.View r3 = (android.view.View) r3
            if (r4 == 0) goto L4c
            q5.s r0 = (q5.s) r0
            r0.i(r2, r3, r9, r10)
            goto L67
        L4c:
            if (r10 != 0) goto L67
            r0.onNestedScrollAccepted(r2, r3, r9)     // Catch: java.lang.AbstractMethodError -> L52
            goto L67
        L52:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r0)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r5, r10, r9)
        L67:
            return r1
        L68:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r6 = " does not implement interface method onStartNestedScroll"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r5, r4, r3)
        L7d:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L84
            r2 = r0
            android.view.View r2 = (android.view.View) r2
        L84:
            android.view.ViewParent r0 = r0.getParent()
            goto L18
        L89:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.a.q(int, int):boolean");
    }

    public final void s(int i13) {
        ViewParent f13 = f(i13);
        if (f13 != null) {
            View view = (View) this.f56998d;
            if (f13 instanceof s) {
                ((s) f13).k(view, i13);
            } else if (i13 == 0) {
                try {
                    f13.onStopNestedScroll(view);
                } catch (AbstractMethodError e13) {
                    Log.e("ViewParentCompat", "ViewParent " + f13 + " does not implement interface method onStopNestedScroll", e13);
                }
            }
            if (i13 == 0) {
                this.f56996b = null;
            } else {
                if (i13 != 1) {
                    return;
                }
                this.f56997c = null;
            }
        }
    }

    public a(View view) {
        this.f56998d = view;
    }
}
