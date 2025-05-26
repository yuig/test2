package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/q;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gi2/b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class q extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f30030f = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f30031a;

    /* renamed from: b, reason: collision with root package name */
    public LoginClient.Request f30032b;

    /* renamed from: c, reason: collision with root package name */
    public LoginClient f30033c;

    /* renamed from: d, reason: collision with root package name */
    public g.b f30034d;

    /* renamed from: e, reason: collision with root package name */
    public View f30035e;

    public final LoginClient M6() {
        LoginClient loginClient = this.f30033c;
        if (loginClient != null) {
            return loginClient;
        }
        Intrinsics.r("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        M6().j(i13, i14, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        LoginClient loginClient = bundle == null ? null : (LoginClient) bundle.getParcelable("loginClient");
        if (loginClient == null) {
            Intrinsics.checkNotNullParameter(this, "fragment");
            loginClient = new LoginClient();
            loginClient.f29955b = -1;
            if (loginClient.f29956c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.f29956c = this;
        } else {
            if (loginClient.f29956c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            loginClient.f29956c = this;
        }
        this.f30033c = loginClient;
        M6().f29957d = new a8.v(this, 11);
        FragmentActivity E4 = E4();
        if (E4 == null) {
            return;
        }
        ComponentName callingActivity = E4.getCallingActivity();
        if (callingActivity != null) {
            this.f30031a = callingActivity.getPackageName();
        }
        Intent intent = E4.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f30032b = (LoginClient.Request) bundleExtra.getParcelable("request");
        }
        g.b registerForActivityResult = registerForActivityResult(new h.g(), new o(new ba.s(5, this, E4)));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f30034d = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(af.d.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(af.c.com_facebook_login_fragment_progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f30035e = findViewById;
        M6().f29958e = new p(this);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LoginMethodHandler g13 = M6().g();
        if (g13 != null) {
            g13.b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View view = getView();
        View findViewById = view == null ? null : view.findViewById(af.c.com_facebook_login_fragment_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f30031a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            FragmentActivity E4 = E4();
            if (E4 == null) {
                return;
            }
            E4.finish();
            return;
        }
        LoginClient M6 = M6();
        LoginClient.Request request = this.f30032b;
        LoginClient.Request request2 = M6.f29960g;
        if ((request2 == null || M6.f29955b < 0) && request != null) {
            if (request2 != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            Date date = AccessToken.f29844l;
            if (!wc.j.z() || M6.b()) {
                M6.f29960g = request;
                Intrinsics.checkNotNullParameter(request, "request");
                ArrayList arrayList = new ArrayList();
                boolean a13 = request.a();
                j jVar = request.f29966a;
                if (!a13) {
                    if (jVar.allowsGetTokenAuth()) {
                        arrayList.add(new GetTokenLoginMethodHandler(M6));
                    }
                    if (!le.v.f83118o && jVar.allowsKatanaAuth()) {
                        arrayList.add(new KatanaProxyLoginMethodHandler(M6));
                    }
                } else if (!le.v.f83118o && jVar.allowsInstagramAppAuth()) {
                    arrayList.add(new InstagramAppLoginMethodHandler(M6));
                }
                if (jVar.allowsCustomTabAuth()) {
                    arrayList.add(new CustomTabLoginMethodHandler(M6));
                }
                if (jVar.allowsWebViewAuth()) {
                    arrayList.add(new WebViewLoginMethodHandler(M6));
                }
                if (!request.a() && jVar.allowsDeviceAuth()) {
                    arrayList.add(new DeviceAuthMethodHandler(M6));
                }
                Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                M6.f29954a = (LoginMethodHandler[]) array;
                M6.k();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", M6());
    }
}
