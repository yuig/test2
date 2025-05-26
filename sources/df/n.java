package df;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldf/n;", "Landroidx/fragment/app/q;", "<init>", "()V", "me/f", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class n extends androidx.fragment.app.q {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f54806r = 0;

    /* renamed from: q, reason: collision with root package name */
    public Dialog f54807q;

    @Override // androidx.fragment.app.q
    public final Dialog O6(Bundle bundle) {
        Dialog dialog = this.f54807q;
        if (dialog != null) {
            if (dialog != null) {
                return dialog;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
        T6(null, null);
        this.f18412h = false;
        Dialog O6 = super.O6(bundle);
        Intrinsics.checkNotNullExpressionValue(O6, "super.onCreateDialog(savedInstanceState)");
        return O6;
    }

    public final void T6(Bundle bundle, FacebookException facebookException) {
        FragmentActivity E4 = E4();
        if (E4 == null) {
            return;
        }
        y0 y0Var = y0.f54883a;
        Intent intent = E4.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        E4.setResult(facebookException == null ? -1 : 0, y0.e(intent, bundle, facebookException));
        E4.finish();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f54807q instanceof t1) && isResumed()) {
            Dialog dialog = this.f54807q;
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((t1) dialog).d();
        }
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FragmentActivity context;
        String url;
        t1 rVar;
        String str;
        super.onCreate(bundle);
        if (this.f54807q == null && (context = E4()) != null) {
            Intent intent = context.getIntent();
            y0 y0Var = y0.f54883a;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            Bundle h10 = y0.h(intent);
            final int i13 = 0;
            if (h10 == null ? false : h10.getBoolean("is_fallback", false)) {
                url = h10 != null ? h10.getString("url") : null;
                if (j1.V0(url)) {
                    le.v vVar = le.v.f83104a;
                    context.finish();
                    return;
                }
                final int i14 = 1;
                String expectedRedirectUrl = t3.s1.d(new Object[]{le.v.b()}, 1, "fb%s://bridge/", "java.lang.String.format(format, *args)");
                int i15 = r.f54838p;
                if (url == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
                t1.b(context);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(url, "url");
                k1.f();
                int i16 = t1.f54846n;
                if (i16 == 0) {
                    k1.f();
                    i16 = t1.f54846n;
                }
                rVar = new r(context, i16);
                rVar.f54848b = "fbconnect://success";
                rVar.f54847a = url;
                Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
                rVar.f54848b = expectedRedirectUrl;
                rVar.f54849c = new o1(this) { // from class: df.m

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n f54800b;

                    {
                        this.f54800b = this;
                    }

                    @Override // df.o1
                    public final void a(Bundle bundle2, FacebookException facebookException) {
                        int i17 = i14;
                        n this$0 = this.f54800b;
                        switch (i17) {
                            case 0:
                                int i18 = n.f54806r;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.T6(bundle2, facebookException);
                                break;
                            default:
                                int i19 = n.f54806r;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                FragmentActivity E4 = this$0.E4();
                                if (E4 != null) {
                                    Intent intent2 = new Intent();
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    intent2.putExtras(bundle2);
                                    E4.setResult(-1, intent2);
                                    E4.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
            } else {
                String action = h10 == null ? null : h10.getString("action");
                Bundle bundle2 = h10 == null ? null : h10.getBundle("params");
                if (j1.V0(action)) {
                    le.v vVar2 = le.v.f83104a;
                    context.finish();
                    return;
                }
                if (action == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(action, "action");
                Date date = AccessToken.f29844l;
                AccessToken s13 = wc.j.s();
                if (wc.j.z()) {
                    str = null;
                } else {
                    k1.d(context, "context");
                    str = le.v.b();
                }
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                o1 o1Var = new o1(this) { // from class: df.m

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n f54800b;

                    {
                        this.f54800b = this;
                    }

                    @Override // df.o1
                    public final void a(Bundle bundle22, FacebookException facebookException) {
                        int i17 = i13;
                        n this$0 = this.f54800b;
                        switch (i17) {
                            case 0:
                                int i18 = n.f54806r;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.T6(bundle22, facebookException);
                                break;
                            default:
                                int i19 = n.f54806r;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                FragmentActivity E4 = this$0.E4();
                                if (E4 != null) {
                                    Intent intent2 = new Intent();
                                    if (bundle22 == null) {
                                        bundle22 = new Bundle();
                                    }
                                    intent2.putExtras(bundle22);
                                    E4.setResult(-1, intent2);
                                    E4.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (s13 != null) {
                    bundle2.putString("app_id", s13.f29854h);
                    url = s13 != null ? s13.f29851e : null;
                    bundle2.putString("access_token", url);
                } else {
                    bundle2.putString("app_id", str);
                }
                int i17 = t1.f54845m;
                Intrinsics.checkNotNullParameter(context, "context");
                t1.b(context);
                rVar = new t1(context, action, bundle2, 0, com.facebook.login.c0.FACEBOOK, o1Var);
            }
            this.f54807q = rVar;
        }
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = this.f18416l;
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f54807q;
        if (dialog instanceof t1) {
            if (dialog == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
            }
            ((t1) dialog).d();
        }
    }
}
