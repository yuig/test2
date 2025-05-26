package ads_mobile_sdk;

import a.d3;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.activity.i0;
import ao2.j0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class wi0 extends androidx.activity.x implements a.yg, d3 {
    public static final /* synthetic */ rl2.u[] B = {kotlin.jvm.internal.k0.f80436a.e(new kotlin.jvm.internal.x(wi0.class, "hasContentViewBeenSet", "getHasContentViewBeenSet()Z", 0))};
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13046a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f13047b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f13048c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f13049d;

    /* renamed from: e, reason: collision with root package name */
    public final oh0 f13050e;

    /* renamed from: f, reason: collision with root package name */
    public final a.j3 f13051f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13052g;

    /* renamed from: h, reason: collision with root package name */
    public final cm0 f13053h;

    /* renamed from: i, reason: collision with root package name */
    public ao2.o1 f13054i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.activity.o f13055j;

    /* renamed from: k, reason: collision with root package name */
    public final co2 f13056k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f13057l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f13058m;

    /* renamed from: n, reason: collision with root package name */
    public RelativeLayout f13059n;

    /* renamed from: o, reason: collision with root package name */
    public View f13060o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13061q;

    /* renamed from: r, reason: collision with root package name */
    public Cdo f13062r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f13063s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13064t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13065u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13066v;

    /* renamed from: x, reason: collision with root package name */
    public final mo2.a f13067x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13068y;

    /* renamed from: z, reason: collision with root package name */
    public ao2.o1 f13069z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi0(Context applicationContext, j0 uiScope, CoroutineContext uiContext, j0 backgroundScope, oh0 flags, a.j3 traceLogger, String afmaVersion, cm0 gmaUtil) {
        super(true);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.f13046a = applicationContext;
        this.f13047b = uiScope;
        this.f13048c = uiContext;
        this.f13049d = backgroundScope;
        this.f13050e = flags;
        this.f13051f = traceLogger;
        this.f13052g = afmaVersion;
        this.f13053h = gmaUtil;
        this.f13056k = new co2(Boolean.FALSE);
        this.f13057l = new AtomicBoolean(false);
        this.f13058m = new AtomicBoolean(false);
        this.f13063s = new AtomicBoolean(true);
        this.f13067x = mo2.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:15:0x00fe, B:23:0x00ba, B:25:0x00be, B:27:0x00c2, B:28:0x00e6), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v0, types: [ads_mobile_sdk.wi0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(ads_mobile_sdk.wi0 r9, bl2.c r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wi0.a(ads_mobile_sdk.wi0, bl2.c):java.lang.Object");
    }

    public abstract Object a(bl2.c cVar);

    public abstract Object a(wi.o oVar, bl2.c cVar);

    public abstract void a(int i13);

    public Object b(bl2.c cVar) {
        return a(this, cVar);
    }

    public abstract Object c(bl2.c cVar);

    public boolean d() {
        return false;
    }

    public final View e() {
        View view = this.f13060o;
        if (view != null) {
            return view;
        }
        Intrinsics.r("contentView");
        throw null;
    }

    public boolean f() {
        return false;
    }

    public abstract ym0 h();

    @Override // androidx.activity.x
    public final void handleOnBackPressed() {
        i0 onBackPressedDispatcher;
        if (h().canGoBack()) {
            h().goBack();
            return;
        }
        if (this.f13063s.get() || h().f14324j.get()) {
            this.f13062r = Cdo.f4378a;
            setEnabled(false);
            androidx.activity.o oVar = this.f13055j;
            if (oVar == null || (onBackPressedDispatcher = oVar.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.b();
            return;
        }
        j0 j0Var = this.f13047b;
        pi0 block = new pi0(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    public abstract int i();

    public final void j() {
        j0 j0Var = this.f13049d;
        si0 block = new si0(this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f13054i = kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    public final void k() {
        this.f13064t = true;
    }

    public final void m() {
        try {
            androidx.activity.o oVar = this.f13055j;
            if (oVar == null) {
                return;
            }
            oVar.setRequestedOrientation(i());
        } catch (IllegalStateException e13) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.d("Unable to update orientation: " + e13, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(ads_mobile_sdk.ym0 r11, bl2.c r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wi0.a(ads_mobile_sdk.ym0, bl2.c):java.lang.Object");
    }

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            h().f14327m = this;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(this.f13053h.a(context, this));
            j();
            return true;
        } catch (ActivityNotFoundException e13) {
            j0 j0Var = this.f13049d;
            qi0 block = new qi0(this, null);
            kotlin.coroutines.j context2 = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context2, null, new et2(block, null), 2);
            Intrinsics.checkNotNullParameter("Exception starting Activity", "message");
            cs2 a13 = qs2.a();
            a13.f().f6994p.add("Exception starting Activity");
            a13.f().f6988j = false;
            a13.a(e13);
            ((ks2) this.f13051f).a("AdActivityLauncher.show", e13);
            return false;
        } catch (SecurityException e14) {
            j0 j0Var2 = this.f13049d;
            ri0 block2 = new ri0(this, null);
            kotlin.coroutines.j context3 = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var2, "<this>");
            Intrinsics.checkNotNullParameter(context3, "context");
            Intrinsics.checkNotNullParameter(block2, "block");
            kotlin.jvm.internal.j.z(j0Var2, context3, null, new et2(block2, null), 2);
            Intrinsics.checkNotNullParameter("Exception starting Activity", "message");
            cs2 a14 = qs2.a();
            a14.f().f6994p.add("Exception starting Activity");
            a14.f().f6988j = false;
            a14.a(e14);
            ((ks2) this.f13051f).a("AdActivityLauncher.show", e14);
            return false;
        }
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f13060o = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x007d, B:15:0x0081, B:16:0x0084, B:17:0x0088), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:29:0x005b, B:31:0x005f, B:33:0x0063, B:35:0x0069), top: B:28:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [mo2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r9, bl2.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.vi0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.vi0 r0 = (ads_mobile_sdk.vi0) r0
            int r1 = r0.f12516f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12516f = r1
            goto L18
        L13:
            ads_mobile_sdk.vi0 r0 = new ads_mobile_sdk.vi0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f12514d
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f12516f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            mo2.a r9 = r0.f12512b
            ads_mobile_sdk.wi0 r0 = r0.f12511a
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L2f
            goto L7d
        L2f:
            r10 = move-exception
            goto L90
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            boolean r9 = r0.f12513c
            mo2.a r2 = r0.f12512b
            ads_mobile_sdk.wi0 r6 = r0.f12511a
            ue.c.H(r10)
            r10 = r2
            goto L5b
        L44:
            ue.c.H(r10)
            mo2.a r10 = r8.f13067x
            r0.f12511a = r8
            r0.f12512b = r10
            r0.f12513c = r9
            r0.f12516f = r5
            mo2.c r10 = (mo2.c) r10
            java.lang.Object r2 = r10.f(r3, r0)
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r6 = r8
        L5b:
            boolean r2 = r6.A     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L87
            r6.f13068y = r9     // Catch: java.lang.Throwable -> L76
            if (r9 != 0) goto L87
            r6.A = r5     // Catch: java.lang.Throwable -> L76
            ao2.o1 r9 = r6.f13069z     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L7b
            r0.f12511a = r6     // Catch: java.lang.Throwable -> L76
            r0.f12512b = r10     // Catch: java.lang.Throwable -> L76
            r0.f12516f = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r9 = r6.a(r0)     // Catch: java.lang.Throwable -> L76
            if (r9 != r1) goto L7b
            return r1
        L76:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
            goto L90
        L7b:
            r9 = r10
            r0 = r6
        L7d:
            ao2.o1 r10 = r0.f13069z     // Catch: java.lang.Throwable -> L2f
            if (r10 == 0) goto L84
            r10.cancel(r3)     // Catch: java.lang.Throwable -> L2f
        L84:
            r0.f13069z = r3     // Catch: java.lang.Throwable -> L2f
            goto L88
        L87:
            r9 = r10
        L88:
            kotlin.Unit r10 = kotlin.Unit.f80348a     // Catch: java.lang.Throwable -> L2f
            mo2.c r9 = (mo2.c) r9
            r9.i(r3)
            return r10
        L90:
            mo2.c r9 = (mo2.c) r9
            r9.i(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wi0.a(boolean, bl2.c):java.lang.Object");
    }
}
