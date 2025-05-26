package com.facebook.login;

import a.l2;
import a.nc;
import a.rb;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.login.LoginClient;
import df.e1;
import df.j1;
import df.k1;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import t3.s1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/q;", "<init>", "()V", "gi2/b", "q7/v", "RequestState", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class DeviceAuthDialog extends androidx.fragment.app.q {
    public static final /* synthetic */ int B = 0;
    public LoginClient.Request A;

    /* renamed from: q, reason: collision with root package name */
    public View f29931q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f29932r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f29933s;

    /* renamed from: t, reason: collision with root package name */
    public DeviceAuthMethodHandler f29934t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f29935u = new AtomicBoolean();

    /* renamed from: v, reason: collision with root package name */
    public volatile le.b0 f29936v;

    /* renamed from: w, reason: collision with root package name */
    public volatile ScheduledFuture f29937w;

    /* renamed from: x, reason: collision with root package name */
    public volatile RequestState f29938x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29939y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f29940z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class RequestState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RequestState> CREATOR = new e();

        /* renamed from: a, reason: collision with root package name */
        public String f29941a;

        /* renamed from: b, reason: collision with root package name */
        public String f29942b;

        /* renamed from: c, reason: collision with root package name */
        public String f29943c;

        /* renamed from: d, reason: collision with root package name */
        public long f29944d;

        /* renamed from: e, reason: collision with root package name */
        public long f29945e;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i13) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f29941a);
            dest.writeString(this.f29942b);
            dest.writeString(this.f29943c);
            dest.writeLong(this.f29944d);
            dest.writeLong(this.f29945e);
        }
    }

    public static void T6(DeviceAuthDialog this$0, String accessToken, Date date, Date date2, le.e0 response) {
        EnumSet enumSet;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (this$0.f29935u.get()) {
            return;
        }
        FacebookRequestError facebookRequestError = response.f83046c;
        if (facebookRequestError != null) {
            FacebookException facebookException = facebookRequestError.f29913i;
            if (facebookException == null) {
                facebookException = new FacebookException();
            }
            this$0.X6(facebookException);
            return;
        }
        try {
            JSONObject jSONObject = response.f83045b;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            String string = jSONObject.getString("id");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(\"id\")");
            q7.v S = gi2.b.S(jSONObject);
            String string2 = jSONObject.getString("name");
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"name\")");
            RequestState requestState = this$0.f29938x;
            if (requestState != null) {
                cf.b bVar = cf.b.f27635a;
                cf.b.a(requestState.f29942b);
            }
            df.e0 e0Var = df.e0.f54743a;
            df.c0 b13 = df.e0.b(le.v.b());
            Boolean bool = null;
            if (b13 != null && (enumSet = b13.f54728e) != null) {
                bool = Boolean.valueOf(enumSet.contains(e1.RequireConfirm));
            }
            if (!Intrinsics.d(bool, Boolean.TRUE) || this$0.f29940z) {
                this$0.U6(string, S, accessToken, date, date2);
                return;
            }
            this$0.f29940z = true;
            String string3 = this$0.getResources().getString(af.e.com_facebook_smart_login_confirmation_title);
            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
            String string4 = this$0.getResources().getString(af.e.com_facebook_smart_login_confirmation_continue_as);
            Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
            String string5 = this$0.getResources().getString(af.e.com_facebook_smart_login_confirmation_cancel);
            Intrinsics.checkNotNullExpressionValue(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
            String d2 = s1.d(new Object[]{string2}, 1, string4, "java.lang.String.format(format, *args)");
            AlertDialog.Builder builder = new AlertDialog.Builder(this$0.getContext());
            builder.setMessage(string3).setCancelable(true).setNegativeButton(d2, new rb(this$0, string, S, accessToken, date, date2)).setPositiveButton(string5, new nc(this$0, 2));
            builder.create().show();
        } catch (JSONException e13) {
            this$0.X6(new FacebookException((Throwable) e13));
        }
    }

    @Override // androidx.fragment.app.q
    public final Dialog O6(Bundle bundle) {
        f fVar = new f(this, requireActivity(), af.f.com_facebook_auth_dialog);
        fVar.setContentView(V6(cf.b.c() && !this.f29940z));
        return fVar;
    }

    public final void U6(String userId, q7.v vVar, String accessToken, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.f29934t;
        if (deviceAuthMethodHandler != null) {
            String applicationId = le.v.b();
            List list = vVar.f102687a;
            List list2 = vVar.f102688b;
            List list3 = vVar.f102689c;
            le.g gVar = le.g.DEVICE_AUTH;
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            AccessToken token = new AccessToken(accessToken, applicationId, userId, list, list2, list3, gVar, date, null, date2);
            LoginClient.Request request = deviceAuthMethodHandler.e().f29960g;
            Intrinsics.checkNotNullParameter(token, "token");
            deviceAuthMethodHandler.e().e(new LoginClient.Result(request, l.SUCCESS, token, null, null));
        }
        Dialog dialog = this.f18416l;
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    public final View V6(boolean z13) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(z13 ? af.d.com_facebook_smart_device_dialog_fragment : af.d.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(af.c.progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f29931q = findViewById;
        View findViewById2 = inflate.findViewById(af.c.confirmation_code);
        if (findViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f29932r = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(af.c.cancel_button);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) findViewById3).setOnClickListener(new l2(this, 7));
        View findViewById4 = inflate.findViewById(af.c.com_facebook_device_auth_instructions);
        if (findViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) findViewById4;
        this.f29933s = textView;
        textView.setText(Html.fromHtml(getString(af.e.com_facebook_device_auth_instructions)));
        return inflate;
    }

    public final void W6() {
        if (this.f29935u.compareAndSet(false, true)) {
            RequestState requestState = this.f29938x;
            if (requestState != null) {
                cf.b bVar = cf.b.f27635a;
                cf.b.a(requestState.f29942b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f29934t;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.e().e(new LoginClient.Result(deviceAuthMethodHandler.e().f29960g, l.CANCEL, null, "User canceled log in.", null));
            }
            Dialog dialog = this.f18416l;
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    public final void X6(FacebookException ex2) {
        Intrinsics.checkNotNullParameter(ex2, "ex");
        if (this.f29935u.compareAndSet(false, true)) {
            RequestState requestState = this.f29938x;
            if (requestState != null) {
                cf.b bVar = cf.b.f27635a;
                cf.b.a(requestState.f29942b);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f29934t;
            if (deviceAuthMethodHandler != null) {
                Intrinsics.checkNotNullParameter(ex2, "ex");
                LoginClient.Request request = deviceAuthMethodHandler.e().f29960g;
                String message = ex2.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                deviceAuthMethodHandler.e().e(new LoginClient.Result(request, l.ERROR, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = this.f18416l;
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    public final void Y6(String str, long j13, Long l13) {
        Bundle a13 = n60.o.a("fields", "id,permissions,name");
        Date date = j13 != 0 ? new Date((j13 * 1000) + new Date().getTime()) : null;
        Date date2 = l13.longValue() != 0 ? new Date(l13.longValue() * 1000) : null;
        AccessToken accessToken = new AccessToken(str, le.v.b(), "0", null, null, null, null, date, null, date2);
        String str2 = le.a0.f83002j;
        le.a0 A = wc.b.A(accessToken, "me", new le.b(this, str, date, date2, 2));
        A.l(le.f0.GET);
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        A.f83009d = a13;
        A.e();
    }

    public final void Z6() {
        RequestState requestState = this.f29938x;
        if (requestState != null) {
            requestState.f29945e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        RequestState requestState2 = this.f29938x;
        bundle.putString("code", requestState2 == null ? null : requestState2.f29943c);
        StringBuilder sb3 = new StringBuilder();
        String str = k1.f54788a;
        sb3.append(le.v.b());
        sb3.append('|');
        sb3.append(le.v.c());
        bundle.putString("access_token", sb3.toString());
        String str2 = le.a0.f83002j;
        this.f29936v = new le.a0(null, "device/login_status", bundle, le.f0.POST, new d(this, 0)).e();
    }

    public final void a7() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        RequestState requestState = this.f29938x;
        Long valueOf = requestState == null ? null : Long.valueOf(requestState.f29944d);
        if (valueOf != null) {
            synchronized (DeviceAuthMethodHandler.f29946d) {
                try {
                    if (DeviceAuthMethodHandler.f29947e == null) {
                        DeviceAuthMethodHandler.f29947e = new ScheduledThreadPoolExecutor(1);
                    }
                    scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f29947e;
                    if (scheduledThreadPoolExecutor == null) {
                        Intrinsics.r("backgroundExecutor");
                        throw null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f29937w = scheduledThreadPoolExecutor.schedule(new com.airbnb.lottie.k(this, 13), valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b7(com.facebook.login.DeviceAuthDialog.RequestState r22) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.DeviceAuthDialog.b7(com.facebook.login.DeviceAuthDialog$RequestState):void");
    }

    public final void c7(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.A = request;
        Bundle b13 = new Bundle();
        b13.putString("scope", TextUtils.join(",", request.f29967b));
        String str = request.f29972g;
        Intrinsics.checkNotNullParameter(b13, "b");
        if (!j1.V0(str)) {
            b13.putString("redirect_uri", str);
        }
        String str2 = request.f29974i;
        Intrinsics.checkNotNullParameter(b13, "b");
        if (!j1.V0(str2)) {
            b13.putString("target_user_id", str2);
        }
        StringBuilder sb3 = new StringBuilder();
        String str3 = k1.f54788a;
        sb3.append(le.v.b());
        sb3.append('|');
        sb3.append(le.v.c());
        b13.putString("access_token", sb3.toString());
        cf.b bVar = cf.b.f27635a;
        String str4 = null;
        if (!p001if.a.b(cf.b.class)) {
            try {
                HashMap hashMap = new HashMap();
                String DEVICE = Build.DEVICE;
                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                hashMap.put("device", DEVICE);
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                hashMap.put("model", MODEL);
                String jSONObject = new JSONObject(hashMap).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject(deviceInfo as Map<*, *>).toString()");
                str4 = jSONObject;
            } catch (Throwable th3) {
                p001if.a.a(cf.b.class, th3);
            }
        }
        b13.putString("device_info", str4);
        String str5 = le.a0.f83002j;
        new le.a0(null, "device/login", b13, le.f0.POST, new d(this, 1)).e();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        q qVar = (q) ((FacebookActivity) requireActivity()).f29898a;
        this.f29934t = (DeviceAuthMethodHandler) (qVar == null ? null : qVar.M6().g());
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            b7(requestState);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f29939y = true;
        this.f29935u.set(true);
        super.onDestroyView();
        le.b0 b0Var = this.f29936v;
        if (b0Var != null) {
            b0Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f29937w;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.f29939y) {
            return;
        }
        W6();
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f29938x != null) {
            outState.putParcelable("request_state", this.f29938x);
        }
    }
}
