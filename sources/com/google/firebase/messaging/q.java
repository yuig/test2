package com.google.firebase.messaging;

import a.m2;
import am2.f0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import ao2.j0;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.messaging.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import el.a1;
import el.l0;
import el.y0;
import el.z0;
import g1.o0;
import gm2.g0;
import i2.a2;
import java.lang.reflect.Type;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import pc.q0;
import pk.c1;
import pn2.h0;
import pn2.r1;
import x40.ye;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: e */
    public static q f33802e;

    /* renamed from: a */
    public Object f33803a;

    /* renamed from: b */
    public Object f33804b;

    /* renamed from: c */
    public Object f33805c;

    /* renamed from: d */
    public Object f33806d;

    public q(View component, AttributeSet attributeSet, int i13, int[] styleableRes, Function1 createDisplayState) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(styleableRes, "styleableRes");
        Intrinsics.checkNotNullParameter(createDisplayState, "createDisplayState");
        this.f33805c = component;
        Context context = component.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, styleableRes, i13, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            u50.o oVar = (u50.o) createDisplayState.invoke(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            this.f33803a = oVar;
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public static im1.g A(q qVar, boolean z13, TextInputEditText editText, Function1 makeClickEvent, int i13) {
        int i14 = 1;
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        im1.m doOnClick = im1.m.f72667m;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(doOnClick, "doOnClick");
        Intrinsics.checkNotNullParameter(makeClickEvent, "makeClickEvent");
        im1.g gVar = new im1.g(doOnClick, qVar, makeClickEvent, i14);
        if (!z13) {
            editText.setOnClickListener(gVar);
        }
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnFocusChangeListener, im1.b] */
    public static im1.b H(final q qVar, boolean z13, TextInputEditText editText, final Function1 makeFocusChangeEvent, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        final im1.m doOnFocusChange = im1.m.f72669o;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(doOnFocusChange, "doOnFocusChange");
        Intrinsics.checkNotNullParameter(makeFocusChangeEvent, "makeFocusChangeEvent");
        ?? r03 = new View.OnFocusChangeListener() { // from class: im1.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z14) {
                Function1 doOnFocusChange2 = Function1.this;
                Intrinsics.checkNotNullParameter(doOnFocusChange2, "$doOnFocusChange");
                q this$0 = qVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 makeFocusChangeEvent2 = makeFocusChangeEvent;
                Intrinsics.checkNotNullParameter(makeFocusChangeEvent2, "$makeFocusChangeEvent");
                doOnFocusChange2.invoke(Boolean.valueOf(z14));
                this$0.s((gm1.c) makeFocusChangeEvent2.invoke(Boolean.valueOf(z14)));
            }
        };
        if (!z13) {
            editText.setOnFocusChangeListener(r03);
        }
        return r03;
    }

    public static void K(final q qVar, final boolean z13, om1.j jVar, final Function2 makeOnTouchEvent, int i13) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        final Function2 doOnTouch = jVar;
        if ((i13 & 2) != 0) {
            doOnTouch = im1.p.f72682i;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(doOnTouch, "doOnTouch");
        Intrinsics.checkNotNullParameter(makeOnTouchEvent, "makeOnTouchEvent");
        ((View) qVar.f33805c).setOnTouchListener(new View.OnTouchListener() { // from class: im1.f
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Function2 doOnTouch2 = Function2.this;
                Intrinsics.checkNotNullParameter(doOnTouch2, "$doOnTouch");
                q this$0 = qVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function2 makeOnTouchEvent2 = makeOnTouchEvent;
                Intrinsics.checkNotNullParameter(makeOnTouchEvent2, "$makeOnTouchEvent");
                Unit unit = Unit.f80348a;
                Intrinsics.f(motionEvent);
                doOnTouch2.invoke(unit, motionEvent);
                this$0.s((gm1.c) makeOnTouchEvent2.invoke(unit, motionEvent));
                return z13;
            }
        });
    }

    public static void i(List list, String str, String str2, a2 a2Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pc.s sVar = (pc.s) it.next();
            if (sVar instanceof pc.m) {
                a2Var.f71073a.add(sVar);
            } else if (sVar instanceof pc.n) {
                pc.n nVar = (pc.n) sVar;
                if (CollectionsKt.L(nVar.f99592b, str2) || Intrinsics.d(nVar.f99591a, str)) {
                    i(nVar.f99594d, str, str2, a2Var);
                }
            }
        }
    }

    public static synchronized q n() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f33802e == null) {
                    f33802e = new q(0);
                }
                qVar = f33802e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return qVar;
    }

    public static void x(long j13, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j13) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            map.remove(arrayList.get(i13));
        }
    }

    public final void B(int i13) {
        if (i13 != 12 && i13 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i13)));
        }
        this.f33804b = Integer.valueOf(i13);
    }

    public final void C() {
        this.f33804b = 12;
    }

    public final void D(int i13) {
        if (i13 != 16 && i13 != 24 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
        }
        this.f33803a = Integer.valueOf(i13);
    }

    public final void E(int i13) {
        if (i13 != 16 && i13 != 24 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i13)));
        }
        this.f33803a = Integer.valueOf(i13);
    }

    public final void F(Function1 doOnClick, Function1 makeClickEvent) {
        Intrinsics.checkNotNullParameter(doOnClick, "doOnClick");
        Intrinsics.checkNotNullParameter(makeClickEvent, "makeClickEvent");
        ((View) this.f33805c).setOnClickListener(new im1.g(doOnClick, this, makeClickEvent, 0));
    }

    public final void I(final Function1 doOnLongClick, final Function1 makeLongClickEvent) {
        Intrinsics.checkNotNullParameter(doOnLongClick, "doOnLongClick");
        Intrinsics.checkNotNullParameter(makeLongClickEvent, "makeLongClickEvent");
        ((View) this.f33805c).setOnLongClickListener(new View.OnLongClickListener() { // from class: im1.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Function1 doOnLongClick2 = Function1.this;
                Intrinsics.checkNotNullParameter(doOnLongClick2, "$doOnLongClick");
                q this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 makeLongClickEvent2 = makeLongClickEvent;
                Intrinsics.checkNotNullParameter(makeLongClickEvent2, "$makeLongClickEvent");
                Unit unit = Unit.f80348a;
                doOnLongClick2.invoke(unit);
                this$0.s((gm1.c) makeLongClickEvent2.invoke(unit));
                return true;
            }
        });
    }

    public final im1.o J(boolean z13, EditText editText, kl2.l doOnTextChanged, kl2.m makeTextChangedEvent, kl2.m makeBeforeTextChangedEvent, Function1 makeAfterTextChangedEvent) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(doOnTextChanged, "doOnTextChanged");
        Intrinsics.checkNotNullParameter(makeTextChangedEvent, "makeTextChangedEvent");
        Intrinsics.checkNotNullParameter(makeBeforeTextChangedEvent, "makeBeforeTextChangedEvent");
        Intrinsics.checkNotNullParameter(makeAfterTextChangedEvent, "makeAfterTextChangedEvent");
        im1.o oVar = new im1.o(this, makeBeforeTextChangedEvent, doOnTextChanged, makeTextChangedEvent, makeAfterTextChangedEvent);
        if (!z13) {
            editText.removeTextChangedListener((TextWatcher) this.f33806d);
            this.f33806d = oVar;
            editText.addTextChangedListener(oVar);
        }
        return oVar;
    }

    public final void L() {
        this.f33805c = 16;
    }

    public final void M() {
        this.f33805c = 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pn2.v1 N(pm2.f r8, nm2.a r9, boolean r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "arrayType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "attr"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            r2 = r8
            gm2.i r2 = (gm2.i) r2
            gm2.d0 r2 = r2.f65777b
            boolean r3 = r2 instanceof pm2.n
            r4 = 0
            if (r3 == 0) goto L1a
            r3 = r2
            pm2.n r3 = (pm2.n) r3
            goto L1b
        L1a:
            r3 = r4
        L1b:
            if (r3 == 0) goto L37
            gm2.b0 r3 = (gm2.b0) r3
            java.lang.Class r5 = java.lang.Void.TYPE
            java.lang.Class r3 = r3.f65757a
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r3, r5)
            if (r5 == 0) goto L2a
            goto L37
        L2a:
            java.lang.String r3 = r3.getName()
            gn2.c r3 = gn2.c.get(r3)
            xl2.o r3 = r3.getPrimitiveType()
            goto L38
        L37:
            r3 = r4
        L38:
            lm2.d r5 = new lm2.d
            java.lang.Object r6 = r7.f33803a
            rg.a r6 = (rg.a) r6
            r5.<init>(r6, r8, r1)
            boolean r8 = r9.f91523d
            if (r3 == 0) goto L7c
            java.lang.Object r9 = r7.f33803a
            rg.a r9 = (rg.a) r9
            am2.d0 r9 = r9.b()
            xl2.l r9 = r9.f()
            pn2.h0 r9 = r9.r(r3)
            bm2.j r10 = new bm2.j
            bm2.i r2 = r9.getAnnotations()
            r3 = 2
            bm2.i[] r3 = new bm2.i[r3]
            r3[r0] = r2
            r3[r1] = r5
            r10.<init>(r3)
            pn2.b0 r9 = kotlin.jvm.internal.j.E(r9, r10)
            java.lang.String r10 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            kotlin.jvm.internal.Intrinsics.g(r9, r10)
            pn2.h0 r9 = (pn2.h0) r9
            if (r8 == 0) goto L73
            goto L7b
        L73:
            pn2.h0 r8 = r9.A0(r1)
            pn2.v1 r9 = pn2.g.i(r9, r8)
        L7b:
            return r9
        L7c:
            pn2.r1 r9 = pn2.r1.COMMON
            r3 = 6
            nm2.a r9 = com.bumptech.glide.c.m1(r9, r8, r0, r4, r3)
            pn2.b0 r9 = r7.O(r2, r9)
            java.lang.String r0 = "getArrayType(...)"
            if (r8 == 0) goto La6
            if (r10 == 0) goto L90
            pn2.w1 r8 = pn2.w1.OUT_VARIANCE
            goto L92
        L90:
            pn2.w1 r8 = pn2.w1.INVARIANT
        L92:
            java.lang.Object r10 = r7.f33803a
            rg.a r10 = (rg.a) r10
            am2.d0 r10 = r10.b()
            xl2.l r10 = r10.f()
            pn2.h0 r8 = r10.h(r8, r9, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            return r8
        La6:
            java.lang.Object r8 = r7.f33803a
            rg.a r8 = (rg.a) r8
            am2.d0 r8 = r8.b()
            xl2.l r8 = r8.f()
            pn2.w1 r10 = pn2.w1.INVARIANT
            pn2.h0 r8 = r8.h(r10, r9, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            java.lang.Object r10 = r7.f33803a
            rg.a r10 = (rg.a) r10
            am2.d0 r10 = r10.b()
            xl2.l r10 = r10.f()
            pn2.w1 r0 = pn2.w1.OUT_VARIANCE
            pn2.h0 r9 = r10.h(r0, r9, r5)
            pn2.h0 r9 = r9.A0(r1)
            pn2.v1 r8 = pn2.g.i(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.q.N(pm2.f, nm2.a, boolean):pn2.v1");
    }

    public final pn2.b0 O(pm2.p pVar, nm2.a attr) {
        pn2.b0 O;
        h0 k13;
        Intrinsics.checkNotNullParameter(attr, "attr");
        if (pVar instanceof pm2.n) {
            Class cls = Void.TYPE;
            Class cls2 = ((gm2.b0) ((pm2.n) pVar)).f65757a;
            xl2.o primitiveType = Intrinsics.d(cls2, cls) ? null : gn2.c.get(cls2.getName()).getPrimitiveType();
            h0 t13 = primitiveType != null ? ((rg.a) this.f33803a).b().f().t(primitiveType) : ((rg.a) this.f33803a).b().f().x();
            Intrinsics.f(t13);
            return t13;
        }
        boolean z13 = false;
        if (pVar instanceof pm2.i) {
            pm2.i iVar = (pm2.i) pVar;
            if (!attr.f91523d) {
                if (attr.f91520a != r1.SUPERTYPE) {
                    z13 = true;
                }
            }
            gm2.s sVar = (gm2.s) iVar;
            boolean d2 = sVar.d();
            Type type = sVar.f65788a;
            if (!d2 && !z13) {
                h0 k14 = k(sVar, attr, null);
                return k14 != null ? k14 : rn2.m.d(rn2.l.UNRESOLVED_JAVA_CLASS, type.toString());
            }
            h0 k15 = k(sVar, attr.h(nm2.b.FLEXIBLE_LOWER_BOUND), null);
            if (k15 != null && (k13 = k(sVar, attr.h(nm2.b.FLEXIBLE_UPPER_BOUND), k15)) != null) {
                return d2 ? new nm2.g(k15, k13) : pn2.g.i(k15, k13);
            }
            return rn2.m.d(rn2.l.UNRESOLVED_JAVA_CLASS, type.toString());
        }
        if (pVar instanceof pm2.f) {
            return N((pm2.f) pVar, attr, false);
        }
        if (pVar instanceof pm2.r) {
            pm2.p c13 = ((g0) ((pm2.r) pVar)).c();
            if (c13 != null && (O = O(c13, attr)) != null) {
                return O;
            }
            h0 m13 = ((rg.a) this.f33803a).b().f().m();
            Intrinsics.checkNotNullExpressionValue(m13, "getDefaultBound(...)");
            return m13;
        }
        if (pVar == null) {
            h0 m14 = ((rg.a) this.f33803a).b().f().m();
            Intrinsics.checkNotNullExpressionValue(m14, "getDefaultBound(...)");
            return m14;
        }
        throw new UnsupportedOperationException("Unsupported type: " + pVar);
    }

    public final void a(Function1 doOnTap, Function1 makeTapEvent) {
        Intrinsics.checkNotNullParameter(doOnTap, "doOnTap");
        Intrinsics.checkNotNullParameter(makeTapEvent, "makeTapEvent");
        ((View) this.f33805c).setOnTouchListener(new m2(new GestureDetector(((View) this.f33805c).getContext(), new ui0.i(doOnTap, this, makeTapEvent, 1)), 17));
    }

    public final ArrayList b(c1 c1Var) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        x(elapsedRealtime, (Map) this.f33803a);
        x(elapsedRealtime, (Map) this.f33804b);
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < c1Var.size(); i13++) {
            q7.b bVar = (q7.b) c1Var.get(i13);
            if (!((Map) this.f33803a).containsKey(bVar.f102601b) && !((Map) this.f33804b).containsKey(Integer.valueOf(bVar.f102602c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final View c(gm1.a eventHandler, Function1 doOnBind) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(doOnBind, "doOnBind");
        if (!Intrinsics.d((gm1.a) this.f33804b, eventHandler)) {
            this.f33804b = eventHandler;
            doOnBind.invoke(eventHandler);
        }
        return (View) this.f33805c;
    }

    public final View d(Function1 nextState, Function1 doOnBind) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        Intrinsics.checkNotNullParameter(doOnBind, "doOnBind");
        u50.o oVar = (u50.o) nextState.invoke((u50.o) this.f33803a);
        if (!Intrinsics.d((u50.o) this.f33803a, oVar)) {
            this.f33803a = oVar;
            doOnBind.invoke(oVar);
        }
        return (View) this.f33805c;
    }

    public final fl.l e() {
        Integer num = (Integer) this.f33803a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f33804b) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((fl.j) this.f33805c) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((fl.k) this.f33806d) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f33803a));
        }
        Integer num2 = (Integer) this.f33804b;
        int intValue = num2.intValue();
        fl.j jVar = (fl.j) this.f33805c;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (jVar == fl.j.f62523b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (jVar == fl.j.f62524c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (jVar == fl.j.f62525d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (jVar == fl.j.f62526e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (jVar != fl.j.f62527f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new fl.l(((Integer) this.f33803a).intValue(), ((Integer) this.f33804b).intValue(), (fl.k) this.f33806d, (fl.j) this.f33805c);
    }

    public final vk.p f() {
        Integer num = (Integer) this.f33803a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f33804b) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((vk.o) this.f33806d) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (((Integer) this.f33805c) != null) {
            return new vk.p(num.intValue(), ((Integer) this.f33804b).intValue(), ((Integer) this.f33805c).intValue(), (vk.o) this.f33806d);
        }
        throw new GeneralSecurityException("Tag size is not set");
    }

    public final vk.t g() {
        Integer num = (Integer) this.f33803a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((vk.s) this.f33806d) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (((Integer) this.f33804b) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f33805c) != null) {
            return new vk.t(num.intValue(), ((Integer) this.f33804b).intValue(), ((Integer) this.f33805c).intValue(), (vk.s) this.f33806d);
        }
        throw new GeneralSecurityException("Tag size is not set");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final wc.c h(java.util.Map r18, java.lang.String r19, java.util.List r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.q.h(java.util.Map, java.lang.String, java.util.List, java.lang.String):wc.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if ((!r0.isEmpty()) != false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List j(pm2.i r18, nm2.a r19, pn2.b1 r20) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.q.j(pm2.i, nm2.a, pn2.b1):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x014d, code lost:
    
        if (r7 != pn2.w1.OUT_VARIANCE) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pn2.h0 k(pm2.i r18, nm2.a r19, pn2.h0 r20) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.q.k(pm2.i, nm2.a, pn2.h0):pn2.h0");
    }

    public final void l(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o0) this.f33804b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                l(arrayList2.get(i13), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final am2.g m(ym2.b classId, List typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        return (am2.g) ((on2.r) this.f33806d).invoke(new f0(classId, typeParametersCount));
    }

    public final boolean o(Context context) {
        if (((Boolean) this.f33805c) == null) {
            this.f33805c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f33804b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f33805c).booleanValue();
    }

    public final boolean p(Context context) {
        if (((Boolean) this.f33804b) == null) {
            this.f33804b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f33804b).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f33804b).booleanValue();
    }

    public final void q(String eventType, String deviceId, Bundle bundle) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        ye yeVar = new ye(deviceId, eventType, new q0(bundle != null ? bundle.getString("push_id") : null), new q0(bundle != null ? bundle.getString("body") : null), new q0(bundle != null ? bundle.getString("link") : null), new q0(bundle != null ? bundle.getString("display_mode") : null));
        xk2.v vVar = vy.m.f126870h;
        vy.e.c(new a11.p(23, this, yeVar), true);
    }

    public final void r(a6.p pVar) {
        Object g13 = ((co2.q) this.f33805c).g(pVar);
        if (g13 instanceof co2.r) {
            Throwable a13 = co2.t.a(g13);
            if (a13 != null) {
                throw a13;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!(!(g13 instanceof co2.s))) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (((AtomicInteger) this.f33806d).getAndIncrement() == 0) {
            kotlin.jvm.internal.j.z((j0) this.f33803a, null, null, new a6.m(this, null), 3);
        }
    }

    public final void s(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        gm1.a aVar = (gm1.a) this.f33804b;
        if (aVar != null) {
            aVar.h3(event);
        }
    }

    public final void t(el.l lVar) {
        y0 y0Var = new y0(lVar.f59504b, lVar.f59503a);
        if (!((Map) this.f33804b).containsKey(y0Var)) {
            ((Map) this.f33804b).put(y0Var, lVar);
            return;
        }
        el.l lVar2 = (el.l) ((Map) this.f33804b).get(y0Var);
        if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + y0Var);
    }

    public final void u(el.n nVar) {
        z0 z0Var = new z0(nVar.f59509a, nVar.f59510b);
        if (!((Map) this.f33803a).containsKey(z0Var)) {
            ((Map) this.f33803a).put(z0Var, nVar);
            return;
        }
        el.n nVar2 = (el.n) ((Map) this.f33803a).get(z0Var);
        if (nVar2.equals(nVar) && nVar.equals(nVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + z0Var);
    }

    public final void v(el.j0 j0Var) {
        y0 y0Var = new y0(j0Var.f59497b, j0Var.f59496a);
        if (!((Map) this.f33806d).containsKey(y0Var)) {
            ((Map) this.f33806d).put(y0Var, j0Var);
            return;
        }
        el.j0 j0Var2 = (el.j0) ((Map) this.f33806d).get(y0Var);
        if (j0Var2.equals(j0Var) && j0Var.equals(j0Var2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + y0Var);
    }

    public final void w(l0 l0Var) {
        z0 z0Var = new z0(l0Var.f59506a, l0Var.f59507b);
        if (!((Map) this.f33805c).containsKey(z0Var)) {
            ((Map) this.f33805c).put(z0Var, l0Var);
            return;
        }
        l0 l0Var2 = (l0) ((Map) this.f33805c).get(z0Var);
        if (l0Var2.equals(l0Var) && l0Var.equals(l0Var2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + z0Var);
    }

    public final Object y(Object obj, pc.m field, b7.c cVar, String str) {
        String str2;
        if (cVar instanceof pc.r) {
            if (obj == null) {
                throw new IllegalStateException("Check failed.".toString());
            }
            cVar = ((pc.r) cVar).f99600g;
        } else if (obj == null) {
            return null;
        }
        if (!(cVar instanceof pc.p)) {
            if (!(cVar instanceof pc.q) || !pc.o.c((pc.q) cVar)) {
                return obj;
            }
            if (!(obj instanceof Map)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            wc.d dVar = (wc.d) this.f33805c;
            Map map = (Map) obj;
            ja.c0 variables = (ja.c0) this.f33804b;
            Intrinsics.checkNotNullParameter(field, "field");
            Intrinsics.checkNotNullParameter(variables, "variables");
            tb.e eVar = new tb.e();
            eVar.f116963a = field;
            eVar.f116964b = variables;
            wc.c r13 = dVar.r(map, eVar);
            if (r13 != null && (str2 = r13.f129079a) != null) {
                str = str2;
            }
            return h(map, str, field.f99587f, field.f99583b.L().f99598g);
        }
        if (!(obj instanceof List)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(iterable, 10));
        int i13 = 0;
        for (Object obj2 : iterable) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            b7.c cVar2 = ((pc.p) cVar).f99596g;
            String valueOf = String.valueOf(i13);
            if (str != null) {
                valueOf = str + '.' + valueOf;
            }
            arrayList.add(y(obj2, field, cVar2, valueOf));
            i13 = i14;
        }
        return arrayList;
    }

    public final q7.b z(c1 c1Var) {
        ArrayList b13 = b(c1Var);
        if (b13.size() < 2) {
            return (q7.b) com.bumptech.glide.c.L(b13, null);
        }
        Collections.sort(b13, new i2.t(4));
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = ((q7.b) b13.get(0)).f102602c;
        int i15 = 0;
        while (true) {
            if (i15 >= b13.size()) {
                break;
            }
            q7.b bVar = (q7.b) b13.get(i15);
            if (i14 == bVar.f102602c) {
                arrayList.add(new Pair(bVar.f102601b, Integer.valueOf(bVar.f102603d)));
                i15++;
            } else if (arrayList.size() == 1) {
                return (q7.b) b13.get(0);
            }
        }
        q7.b bVar2 = (q7.b) ((Map) this.f33805c).get(arrayList);
        if (bVar2 == null) {
            List subList = b13.subList(0, arrayList.size());
            int i16 = 0;
            for (int i17 = 0; i17 < subList.size(); i17++) {
                i16 += ((q7.b) subList.get(i17)).f102603d;
            }
            int nextInt = ((Random) this.f33806d).nextInt(i16);
            int i18 = 0;
            while (true) {
                if (i13 >= subList.size()) {
                    bVar2 = (q7.b) com.bumptech.glide.c.P(subList);
                    break;
                }
                q7.b bVar3 = (q7.b) subList.get(i13);
                i18 += bVar3.f102603d;
                if (nextInt < i18) {
                    bVar2 = bVar3;
                    break;
                }
                i13++;
            }
            ((Map) this.f33805c).put(arrayList, bVar2);
        }
        return bVar2;
    }

    public q(View component, u50.o initialState) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f33805c = component;
        this.f33803a = initialState;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f33803a = obj;
        this.f33804b = obj2;
        this.f33805c = obj3;
        this.f33806d = obj4;
    }

    public q(ml1.r action, ScreenDescription description, Function1 function1, Function2 function2) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f33803a = action;
        this.f33804b = description;
        this.f33805c = function1;
        this.f33806d = function2;
    }

    public q(on2.u storageManager, am2.d0 module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f33803a = storageManager;
        this.f33804b = module;
        this.f33805c = ((on2.q) storageManager).d(new am2.h0(this, 1));
        this.f33806d = ((on2.q) ((on2.u) this.f33803a)).d(new am2.h0(this, 0));
    }

    public q(a1 a1Var) {
        this.f33803a = new HashMap(a1Var.f59453a);
        this.f33804b = new HashMap(a1Var.f59454b);
        this.f33805c = new HashMap(a1Var.f59455c);
        this.f33806d = new HashMap(a1Var.f59456d);
    }

    public q(Typeface typeface, i6.b bVar) {
        int i13;
        int i14;
        this.f33806d = typeface;
        this.f33803a = bVar;
        this.f33805c = new h6.d0(1024);
        i6.b bVar2 = (i6.b) this.f33803a;
        int a13 = bVar2.a(6);
        if (a13 != 0) {
            int i15 = a13 + bVar2.f71620a;
            i13 = bVar2.f71621b.getInt(bVar2.f71621b.getInt(i15) + i15);
        } else {
            i13 = 0;
        }
        this.f33804b = new char[i13 * 2];
        i6.b bVar3 = (i6.b) this.f33803a;
        int a14 = bVar3.a(6);
        if (a14 != 0) {
            int i16 = a14 + bVar3.f71620a;
            i14 = bVar3.f71621b.getInt(bVar3.f71621b.getInt(i16) + i16);
        } else {
            i14 = 0;
        }
        for (int i17 = 0; i17 < i14; i17++) {
            h6.g0 g0Var = new h6.g0(this, i17);
            i6.a c13 = g0Var.c();
            int a15 = c13.a(4);
            Character.toChars(a15 != 0 ? c13.f71621b.getInt(a15 + c13.f71620a) : 0, (char[]) this.f33804b, i17 * 2);
            com.bumptech.glide.d.g("invalid metadata codepoint length", g0Var.b() > 0);
            ((h6.d0) this.f33805c).a(g0Var, 0, g0Var.b() - 1);
        }
    }

    public q(int i13) {
        if (i13 == 1) {
            this.f33803a = new s4.f(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 0);
            this.f33804b = new s4.f(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 0);
            this.f33805c = new s4.f(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, 0);
            this.f33806d = new s4.j[32];
            return;
        }
        if (i13 == 2) {
            this.f33803a = new s4.f(10, 1);
            this.f33804b = new o0(0);
            this.f33805c = new ArrayList();
            this.f33806d = new HashSet();
            return;
        }
        if (i13 == 6) {
            Random random = new Random();
            this.f33805c = new HashMap();
            this.f33806d = random;
            this.f33803a = new HashMap();
            this.f33804b = new HashMap();
            return;
        }
        Object obj = null;
        if (i13 != 7) {
            switch (i13) {
                case 12:
                    this.f33803a = null;
                    this.f33804b = null;
                    this.f33805c = null;
                    this.f33806d = vk.o.f126007d;
                    break;
                case 13:
                    this.f33803a = null;
                    this.f33804b = null;
                    this.f33805c = null;
                    this.f33806d = vk.s.f126037d;
                    break;
                case 14:
                    this.f33803a = new HashMap();
                    this.f33804b = new HashMap();
                    this.f33805c = new HashMap();
                    this.f33806d = new HashMap();
                    break;
                case 15:
                    this.f33803a = null;
                    this.f33804b = null;
                    this.f33805c = null;
                    this.f33806d = fl.k.f62532e;
                    break;
                default:
                    this.f33803a = null;
                    this.f33804b = null;
                    this.f33805c = null;
                    this.f33806d = new ArrayDeque();
                    break;
            }
            return;
        }
        this.f33803a = new g1.g(0);
        this.f33804b = new SparseArray();
        this.f33805c = new g1.p(obj);
        this.f33806d = new g1.g(0);
    }
}
