package df;

import a.l2;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class t1 extends Dialog {

    /* renamed from: m, reason: collision with root package name */
    public static final int f54845m = af.f.com_facebook_activity_theme;

    /* renamed from: n, reason: collision with root package name */
    public static volatile int f54846n;

    /* renamed from: a, reason: collision with root package name */
    public String f54847a;

    /* renamed from: b, reason: collision with root package name */
    public String f54848b;

    /* renamed from: c, reason: collision with root package name */
    public o1 f54849c;

    /* renamed from: d, reason: collision with root package name */
    public s1 f54850d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressDialog f54851e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f54852f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f54853g;

    /* renamed from: h, reason: collision with root package name */
    public final q1 f54854h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f54855i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f54856j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f54857k;

    /* renamed from: l, reason: collision with root package name */
    public WindowManager.LayoutParams f54858l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t1(android.content.Context r4, java.lang.String r5, android.os.Bundle r6, int r7, com.facebook.login.c0 r8, df.o1 r9) {
        /*
            r3 = this;
            if (r7 != 0) goto L7
            df.k1.f()
            int r7 = df.t1.f54846n
        L7:
            r3.<init>(r4, r7)
            java.lang.String r7 = "fbconnect://success"
            r3.f54848b = r7
            if (r6 != 0) goto L15
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L15:
            boolean r4 = df.j1.L0(r4)
            if (r4 == 0) goto L1d
            java.lang.String r7 = "fbconnect://chrome_os_success"
        L1d:
            r3.f54848b = r7
            java.lang.String r4 = "redirect_uri"
            r6.putString(r4, r7)
            java.lang.String r4 = "display"
            java.lang.String r7 = "touch"
            r6.putString(r4, r7)
            java.lang.String r4 = le.v.b()
            java.lang.String r7 = "client_id"
            r6.putString(r7, r4)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r7 = "15.0.2"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r0 = 1
            java.lang.String r1 = "android-%s"
            java.lang.String r2 = "java.lang.String.format(locale, format, *args)"
            java.lang.String r4 = t3.s1.e(r7, r0, r4, r1, r2)
            java.lang.String r7 = "sdk"
            r6.putString(r7, r4)
            r3.f54849c = r9
            java.lang.String r4 = "share"
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r5, r4)
            if (r4 == 0) goto L64
            java.lang.String r4 = "media"
            boolean r4 = r6.containsKey(r4)
            if (r4 == 0) goto L64
            df.q1 r4 = new df.q1
            r4.<init>(r3, r5, r6)
            r3.f54854h = r4
            goto L9f
        L64:
            int[] r4 = df.r1.f54842a
            int r7 = r8.ordinal()
            r4 = r4[r7]
            if (r4 != r0) goto L79
            java.lang.String r4 = df.c1.e()
            java.lang.String r5 = "oauth/authorize"
            android.net.Uri r4 = df.j1.u(r4, r5, r6)
            goto L99
        L79:
            java.lang.String r4 = df.c1.a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = le.v.e()
            r7.append(r8)
            java.lang.String r8 = "/dialog/"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.net.Uri r4 = df.j1.u(r4, r5, r6)
        L99:
            java.lang.String r4 = r4.toString()
            r3.f54847a = r4
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df.t1.<init>(android.content.Context, java.lang.String, android.os.Bundle, int, com.facebook.login.c0, df.o1):void");
    }

    public static int a(float f13, int i13, int i14, int i15) {
        int i16 = (int) (i13 / f13);
        return (int) (i13 * (i16 <= i14 ? 1.0d : i16 >= i15 ? 0.5d : (((i15 - i16) / (i15 - i14)) * 0.5d) + 0.5d));
    }

    public static final void b(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            if ((applicationInfo == null ? null : applicationInfo.metaData) != null && f54846n == 0) {
                int i13 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i13 == 0) {
                    i13 = f54845m;
                }
                f54846n = i13;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri parse = Uri.parse(str);
        Bundle q13 = j1.q1(parse.getQuery());
        q13.putAll(j1.q1(parse.getFragment()));
        return q13;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f54849c == null || this.f54855i) {
            return;
        }
        e(new FacebookOperationCanceledException());
    }

    public final void d() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i13 = displayMetrics.widthPixels;
        int i14 = displayMetrics.heightPixels;
        int i15 = i13 < i14 ? i13 : i14;
        if (i13 < i14) {
            i13 = i14;
        }
        int min = Math.min(a(displayMetrics.density, i15, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(a(displayMetrics.density, i13, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        s1 s1Var = this.f54850d;
        if (s1Var != null) {
            s1Var.stopLoading();
        }
        if (!this.f54856j && (progressDialog = this.f54851e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.f54849c == null || this.f54855i) {
            return;
        }
        this.f54855i = true;
        FacebookException facebookException = exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc);
        o1 o1Var = this.f54849c;
        if (o1Var != null) {
            o1Var.a(null, facebookException);
        }
        dismiss();
    }

    public final void f(int i13) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        s1 s1Var = new s1(getContext());
        this.f54850d = s1Var;
        s1Var.setVerticalScrollBarEnabled(false);
        s1 s1Var2 = this.f54850d;
        if (s1Var2 != null) {
            s1Var2.setHorizontalScrollBarEnabled(false);
        }
        s1 s1Var3 = this.f54850d;
        if (s1Var3 != null) {
            s1Var3.setWebViewClient(new n1(this));
        }
        s1 s1Var4 = this.f54850d;
        WebSettings settings = s1Var4 == null ? null : s1Var4.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        s1 s1Var5 = this.f54850d;
        if (s1Var5 != null) {
            String str = this.f54847a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            s1Var5.loadUrl(str);
        }
        s1 s1Var6 = this.f54850d;
        if (s1Var6 != null) {
            s1Var6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        s1 s1Var7 = this.f54850d;
        if (s1Var7 != null) {
            s1Var7.setVisibility(4);
        }
        s1 s1Var8 = this.f54850d;
        WebSettings settings2 = s1Var8 == null ? null : s1Var8.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        s1 s1Var9 = this.f54850d;
        WebSettings settings3 = s1Var9 != null ? s1Var9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        s1 s1Var10 = this.f54850d;
        if (s1Var10 != null) {
            s1Var10.setFocusable(true);
        }
        s1 s1Var11 = this.f54850d;
        if (s1Var11 != null) {
            s1Var11.setFocusableInTouchMode(true);
        }
        s1 s1Var12 = this.f54850d;
        if (s1Var12 != null) {
            s1Var12.setOnTouchListener(new l1(0));
        }
        linearLayout.setPadding(i13, i13, i13, i13);
        linearLayout.addView(this.f54850d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f54853g;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f54856j = false;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.f54858l) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f54858l;
                Intrinsics.n(layoutParams2 != null ? layoutParams2.token : null, "Set token on onAttachedToWindow(): ");
                le.v vVar = le.v.f83104a;
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f54851e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f54851e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(af.e.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f54851e;
        int i13 = 0;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f54851e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new m1(this, i13));
        }
        requestWindowFeature(1);
        this.f54853g = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f54852f = imageView;
        imageView.setOnClickListener(new l2(this, 6));
        Drawable drawable = getContext().getResources().getDrawable(af.b.com_facebook_close);
        ImageView imageView2 = this.f54852f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f54852f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f54847a != null) {
            ImageView imageView4 = this.f54852f;
            if (imageView4 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f54853g;
        if (frameLayout != null) {
            frameLayout.addView(this.f54852f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f54853g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f54856j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i13, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i13 == 4) {
            s1 s1Var = this.f54850d;
            if (s1Var != null && Intrinsics.d(Boolean.valueOf(s1Var.canGoBack()), Boolean.TRUE)) {
                s1 s1Var2 = this.f54850d;
                if (s1Var2 == null) {
                    return true;
                }
                s1Var2.goBack();
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i13, event);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        q1 q1Var = this.f54854h;
        if (q1Var != null) {
            if ((q1Var == null ? null : q1Var.getStatus()) == AsyncTask.Status.PENDING) {
                if (q1Var != null) {
                    q1Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f54851e;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        q1 q1Var = this.f54854h;
        if (q1Var != null) {
            q1Var.cancel(true);
            ProgressDialog progressDialog = this.f54851e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.f54858l = params;
        }
        super.onWindowAttributesChanged(params);
    }
}
