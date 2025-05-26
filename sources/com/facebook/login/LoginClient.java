package com.facebook.login;

import a.cb;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import df.j1;
import df.k1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "com/facebook/login/p", "gi2/b", "a8/v", "Request", "Result", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class LoginClient implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoginClient> CREATOR = new c8.a(13);

    /* renamed from: a, reason: collision with root package name */
    public LoginMethodHandler[] f29954a;

    /* renamed from: b, reason: collision with root package name */
    public int f29955b;

    /* renamed from: c, reason: collision with root package name */
    public Fragment f29956c;

    /* renamed from: d, reason: collision with root package name */
    public a8.v f29957d;

    /* renamed from: e, reason: collision with root package name */
    public p f29958e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29959f;

    /* renamed from: g, reason: collision with root package name */
    public Request f29960g;

    /* renamed from: h, reason: collision with root package name */
    public Map f29961h;

    /* renamed from: i, reason: collision with root package name */
    public LinkedHashMap f29962i;

    /* renamed from: j, reason: collision with root package name */
    public r f29963j;

    /* renamed from: k, reason: collision with root package name */
    public int f29964k;

    /* renamed from: l, reason: collision with root package name */
    public int f29965l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "com/facebook/login/l", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Result implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new m();

        /* renamed from: a, reason: collision with root package name */
        public final l f29984a;

        /* renamed from: b, reason: collision with root package name */
        public final AccessToken f29985b;

        /* renamed from: c, reason: collision with root package name */
        public final AuthenticationToken f29986c;

        /* renamed from: d, reason: collision with root package name */
        public final String f29987d;

        /* renamed from: e, reason: collision with root package name */
        public final String f29988e;

        /* renamed from: f, reason: collision with root package name */
        public final Request f29989f;

        /* renamed from: g, reason: collision with root package name */
        public Map f29990g;

        /* renamed from: h, reason: collision with root package name */
        public HashMap f29991h;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, l code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            Intrinsics.checkNotNullParameter(code, "code");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i13) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f29984a.name());
            dest.writeParcelable(this.f29985b, i13);
            dest.writeParcelable(this.f29986c, i13);
            dest.writeString(this.f29987d);
            dest.writeString(this.f29988e);
            dest.writeParcelable(this.f29989f, i13);
            j1.X1(dest, this.f29990g);
            j1.X1(dest, this.f29991h);
        }

        public Result(Request request, l code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f29989f = request;
            this.f29985b = accessToken;
            this.f29986c = authenticationToken;
            this.f29987d = str;
            this.f29984a = code;
            this.f29988e = str2;
        }

        public Result(Parcel parcel) {
            String readString = parcel.readString();
            this.f29984a = l.valueOf(readString == null ? "error" : readString);
            this.f29985b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f29986c = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.f29987d = parcel.readString();
            this.f29988e = parcel.readString();
            this.f29989f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f29990g = j1.t1(parcel);
            this.f29991h = j1.t1(parcel);
        }
    }

    public final void a(String str, String str2, boolean z13) {
        Map map = this.f29961h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f29961h == null) {
            this.f29961h = map;
        }
        if (map.containsKey(str) && z13) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        if (this.f29959f) {
            return true;
        }
        Intrinsics.checkNotNullParameter("android.permission.INTERNET", "permission");
        FragmentActivity f13 = f();
        if (f13 != null && f13.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            this.f29959f = true;
            return true;
        }
        FragmentActivity f14 = f();
        String string = f14 == null ? null : f14.getString(af.e.com_facebook_internet_permission_error_title);
        String string2 = f14 != null ? f14.getString(af.e.com_facebook_internet_permission_error_message) : null;
        Request request = this.f29960g;
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            arrayList.add(string);
        }
        if (string2 != null) {
            arrayList.add(string2);
        }
        d(new Result(request, l.ERROR, null, TextUtils.join(": ", arrayList), null));
        return false;
    }

    public final void d(Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        LoginMethodHandler g13 = g();
        if (g13 != null) {
            i(g13.getF29998f(), outcome.f29984a.getLoggingValue(), outcome.f29987d, outcome.f29988e, g13.f29992a);
        }
        Map map = this.f29961h;
        if (map != null) {
            outcome.f29990g = map;
        }
        LinkedHashMap linkedHashMap = this.f29962i;
        if (linkedHashMap != null) {
            outcome.f29991h = linkedHashMap;
        }
        this.f29954a = null;
        this.f29955b = -1;
        this.f29960g = null;
        this.f29961h = null;
        this.f29964k = 0;
        this.f29965l = 0;
        a8.v vVar = this.f29957d;
        if (vVar == null) {
            return;
        }
        q this$0 = (q) vVar.f1465b;
        int i13 = q.f30030f;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        this$0.f30032b = null;
        int i14 = outcome.f29984a == l.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        FragmentActivity E4 = this$0.E4();
        if (!this$0.isAdded() || E4 == null) {
            return;
        }
        E4.setResult(i14, intent);
        E4.finish();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(Result pendingResult) {
        Result result;
        Intrinsics.checkNotNullParameter(pendingResult, "outcome");
        if (pendingResult.f29985b != null) {
            Date date = AccessToken.f29844l;
            if (wc.j.z()) {
                Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
                AccessToken accessToken = pendingResult.f29985b;
                if (accessToken == null) {
                    throw new FacebookException("Can't validate without a token");
                }
                AccessToken s13 = wc.j.s();
                if (s13 != null) {
                    try {
                        if (Intrinsics.d(s13.f29855i, accessToken.f29855i)) {
                            result = new Result(this.f29960g, l.SUCCESS, pendingResult.f29985b, pendingResult.f29986c, null, null);
                            d(result);
                            return;
                        }
                    } catch (Exception e13) {
                        Request request = this.f29960g;
                        String message = e13.getMessage();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("Caught exception");
                        if (message != null) {
                            arrayList.add(message);
                        }
                        d(new Result(request, l.ERROR, null, TextUtils.join(": ", arrayList), null));
                        return;
                    }
                }
                Request request2 = this.f29960g;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("User logged in as different Facebook user.");
                result = new Result(request2, l.ERROR, null, TextUtils.join(": ", arrayList2), null);
                d(result);
                return;
            }
        }
        d(pendingResult);
    }

    public final FragmentActivity f() {
        Fragment fragment = this.f29956c;
        if (fragment == null) {
            return null;
        }
        return fragment.E4();
    }

    public final LoginMethodHandler g() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i13 = this.f29955b;
        if (i13 < 0 || (loginMethodHandlerArr = this.f29954a) == null) {
            return null;
        }
        return loginMethodHandlerArr[i13];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1, r3 != null ? r3.f29969d : null) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.login.r h() {
        /*
            r4 = this;
            com.facebook.login.r r0 = r4.f29963j
            if (r0 == 0) goto L22
            boolean r1 = p001if.a.b(r0)
            r2 = 0
            if (r1 == 0) goto Ld
        Lb:
            r1 = r2
            goto L15
        Ld:
            java.lang.String r1 = r0.f30037a     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r1 = move-exception
            p001if.a.a(r0, r1)
            goto Lb
        L15:
            com.facebook.login.LoginClient$Request r3 = r4.f29960g
            if (r3 != 0) goto L1a
            goto L1c
        L1a:
            java.lang.String r2 = r3.f29969d
        L1c:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 != 0) goto L3e
        L22:
            com.facebook.login.r r0 = new com.facebook.login.r
            androidx.fragment.app.FragmentActivity r1 = r4.f()
            if (r1 != 0) goto L2e
            android.content.Context r1 = le.v.a()
        L2e:
            com.facebook.login.LoginClient$Request r2 = r4.f29960g
            if (r2 != 0) goto L37
            java.lang.String r2 = le.v.b()
            goto L39
        L37:
            java.lang.String r2 = r2.f29969d
        L39:
            r0.<init>(r1, r2)
            r4.f29963j = r0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.h():com.facebook.login.r");
    }

    public final void i(String str, String str2, String str3, String str4, HashMap hashMap) {
        Request request = this.f29960g;
        if (request == null) {
            h().b("fb_mobile_login_method_complete", str);
            return;
        }
        r h10 = h();
        String str5 = request.f29970e;
        String str6 = request.f29978m ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        if (p001if.a.b(h10)) {
            return;
        }
        try {
            ScheduledExecutorService scheduledExecutorService = r.f30036d;
            Bundle b13 = wc.b.b(str5);
            if (str2 != null) {
                b13.putString("2_result", str2);
            }
            if (str3 != null) {
                b13.putString("5_error_message", str3);
            }
            if (str4 != null) {
                b13.putString("4_error_code", str4);
            }
            if (hashMap != null && (!hashMap.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                b13.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            b13.putString("3_method", str);
            h10.f30038b.c(str6, b13);
        } catch (Throwable th3) {
            p001if.a.a(h10, th3);
        }
    }

    public final void j(int i13, int i14, Intent intent) {
        this.f29964k++;
        if (this.f29960g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f29895i, false)) {
                k();
                return;
            }
            LoginMethodHandler g13 = g();
            if (g13 != null) {
                if ((g13 instanceof KatanaProxyLoginMethodHandler) && intent == null && this.f29964k < this.f29965l) {
                    return;
                }
                g13.i(i13, i14, intent);
            }
        }
    }

    public final void k() {
        LoginMethodHandler g13 = g();
        if (g13 != null) {
            i(g13.getF29998f(), "skipped", null, null, g13.f29992a);
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.f29954a;
        while (loginMethodHandlerArr != null) {
            int i13 = this.f29955b;
            if (i13 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.f29955b = i13 + 1;
            LoginMethodHandler g14 = g();
            if (g14 != null) {
                if (!(g14 instanceof WebViewLoginMethodHandler) || b()) {
                    Request request = this.f29960g;
                    if (request == null) {
                        continue;
                    } else {
                        int l13 = g14.l(request);
                        this.f29964k = 0;
                        if (l13 > 0) {
                            r h10 = h();
                            String str = request.f29970e;
                            String f29998f = g14.getF29998f();
                            String str2 = request.f29978m ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                            if (!p001if.a.b(h10)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = r.f30036d;
                                    Bundle b13 = wc.b.b(str);
                                    b13.putString("3_method", f29998f);
                                    h10.f30038b.c(str2, b13);
                                } catch (Throwable th3) {
                                    p001if.a.a(h10, th3);
                                }
                            }
                            this.f29965l = l13;
                        } else {
                            r h13 = h();
                            String str3 = request.f29970e;
                            String f29998f2 = g14.getF29998f();
                            String str4 = request.f29978m ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                            if (!p001if.a.b(h13)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = r.f30036d;
                                    Bundle b14 = wc.b.b(str3);
                                    b14.putString("3_method", f29998f2);
                                    h13.f30038b.c(str4, b14);
                                } catch (Throwable th4) {
                                    p001if.a.a(h13, th4);
                                }
                            }
                            a("not_tried", g14.getF29998f(), true);
                        }
                        if (l13 > 0) {
                            return;
                        }
                    }
                } else {
                    a("no_internet_permission", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, false);
                }
            }
        }
        Request request2 = this.f29960g;
        if (request2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("Login attempt failed.");
            d(new Result(request2, l.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.f29954a, i13);
        dest.writeInt(this.f29955b);
        dest.writeParcelable(this.f29960g, i13);
        j1.X1(dest, this.f29961h);
        j1.X1(dest, this.f29962i);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Request implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new k();

        /* renamed from: a, reason: collision with root package name */
        public final j f29966a;

        /* renamed from: b, reason: collision with root package name */
        public Set f29967b;

        /* renamed from: c, reason: collision with root package name */
        public final c f29968c;

        /* renamed from: d, reason: collision with root package name */
        public final String f29969d;

        /* renamed from: e, reason: collision with root package name */
        public String f29970e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f29971f;

        /* renamed from: g, reason: collision with root package name */
        public final String f29972g;

        /* renamed from: h, reason: collision with root package name */
        public final String f29973h;

        /* renamed from: i, reason: collision with root package name */
        public final String f29974i;

        /* renamed from: j, reason: collision with root package name */
        public String f29975j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f29976k;

        /* renamed from: l, reason: collision with root package name */
        public final c0 f29977l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f29978m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f29979n;

        /* renamed from: o, reason: collision with root package name */
        public final String f29980o;

        /* renamed from: p, reason: collision with root package name */
        public final String f29981p;

        /* renamed from: q, reason: collision with root package name */
        public final String f29982q;

        /* renamed from: r, reason: collision with root package name */
        public final a f29983r;

        public Request(j loginBehavior, Set set, c defaultAudience, String authType, String applicationId, String authId, c0 c0Var, String str, String str2, String str3, a aVar) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
            this.f29966a = loginBehavior;
            this.f29967b = set == null ? new HashSet() : set;
            this.f29968c = defaultAudience;
            this.f29973h = authType;
            this.f29969d = applicationId;
            this.f29970e = authId;
            this.f29977l = c0Var == null ? c0.FACEBOOK : c0Var;
            if (str == null || str.length() == 0) {
                this.f29980o = cb.g("randomUUID().toString()");
            } else {
                this.f29980o = str;
            }
            this.f29981p = str2;
            this.f29982q = str3;
            this.f29983r = aVar;
        }

        public final boolean a() {
            return this.f29977l == c0.INSTAGRAM;
        }

        public final void b(boolean z13) {
            this.f29978m = z13;
        }

        public final void d(String str) {
            this.f29975j = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final void e(boolean z13) {
            this.f29971f = z13;
        }

        public final void f(boolean z13) {
            this.f29976k = z13;
        }

        public final void g(boolean z13) {
            this.f29979n = z13;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i13) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f29966a.name());
            dest.writeStringList(new ArrayList(this.f29967b));
            dest.writeString(this.f29968c.name());
            dest.writeString(this.f29969d);
            dest.writeString(this.f29970e);
            dest.writeByte(this.f29971f ? (byte) 1 : (byte) 0);
            dest.writeString(this.f29972g);
            dest.writeString(this.f29973h);
            dest.writeString(this.f29974i);
            dest.writeString(this.f29975j);
            dest.writeByte(this.f29976k ? (byte) 1 : (byte) 0);
            dest.writeString(this.f29977l.name());
            dest.writeByte(this.f29978m ? (byte) 1 : (byte) 0);
            dest.writeByte(this.f29979n ? (byte) 1 : (byte) 0);
            dest.writeString(this.f29980o);
            dest.writeString(this.f29981p);
            dest.writeString(this.f29982q);
            a aVar = this.f29983r;
            dest.writeString(aVar == null ? null : aVar.name());
        }

        public Request(Parcel parcel) {
            c cVar;
            c0 c0Var;
            String str = k1.f54788a;
            String readString = parcel.readString();
            k1.e(readString, "loginBehavior");
            this.f29966a = j.valueOf(readString);
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f29967b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            if (readString2 != null) {
                cVar = c.valueOf(readString2);
            } else {
                cVar = c.NONE;
            }
            this.f29968c = cVar;
            String readString3 = parcel.readString();
            k1.e(readString3, "applicationId");
            this.f29969d = readString3;
            String readString4 = parcel.readString();
            k1.e(readString4, "authId");
            this.f29970e = readString4;
            this.f29971f = parcel.readByte() != 0;
            this.f29972g = parcel.readString();
            String readString5 = parcel.readString();
            k1.e(readString5, "authType");
            this.f29973h = readString5;
            this.f29974i = parcel.readString();
            this.f29975j = parcel.readString();
            this.f29976k = parcel.readByte() != 0;
            String readString6 = parcel.readString();
            if (readString6 != null) {
                c0Var = c0.valueOf(readString6);
            } else {
                c0Var = c0.FACEBOOK;
            }
            this.f29977l = c0Var;
            this.f29978m = parcel.readByte() != 0;
            this.f29979n = parcel.readByte() != 0;
            String readString7 = parcel.readString();
            k1.e(readString7, "nonce");
            this.f29980o = readString7;
            this.f29981p = parcel.readString();
            this.f29982q = parcel.readString();
            String readString8 = parcel.readString();
            this.f29983r = readString8 == null ? null : a.valueOf(readString8);
        }
    }
}
