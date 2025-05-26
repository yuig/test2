package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements le.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceAuthDialog f30007b;

    public /* synthetic */ d(DeviceAuthDialog deviceAuthDialog, int i13) {
        this.f30006a = i13;
        this.f30007b = deviceAuthDialog;
    }

    @Override // le.x
    public final void a(le.e0 response) {
        switch (this.f30006a) {
            case 0:
                DeviceAuthDialog this$0 = this.f30007b;
                int i13 = DeviceAuthDialog.B;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!this$0.f29935u.get()) {
                    FacebookRequestError facebookRequestError = response.f83046c;
                    if (facebookRequestError != null) {
                        int i14 = facebookRequestError.f29907c;
                        if (i14 != 1349174 && i14 != 1349172) {
                            if (i14 != 1349152) {
                                if (i14 != 1349173) {
                                    FacebookException facebookException = facebookRequestError.f29913i;
                                    if (facebookException == null) {
                                        facebookException = new FacebookException();
                                    }
                                    this$0.X6(facebookException);
                                    break;
                                } else {
                                    this$0.W6();
                                    break;
                                }
                            } else {
                                DeviceAuthDialog.RequestState requestState = this$0.f29938x;
                                if (requestState != null) {
                                    cf.b bVar = cf.b.f27635a;
                                    cf.b.a(requestState.f29942b);
                                }
                                LoginClient.Request request = this$0.A;
                                if (request == null) {
                                    this$0.W6();
                                    break;
                                } else {
                                    this$0.c7(request);
                                    break;
                                }
                            }
                        } else {
                            this$0.a7();
                            break;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = response.f83045b;
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            String string = jSONObject.getString("access_token");
                            Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                            this$0.Y6(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                            break;
                        } catch (JSONException e13) {
                            this$0.X6(new FacebookException((Throwable) e13));
                            return;
                        }
                    }
                }
                break;
            default:
                int i15 = DeviceAuthDialog.B;
                DeviceAuthDialog this$02 = this.f30007b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!this$02.f29939y) {
                    FacebookRequestError facebookRequestError2 = response.f83046c;
                    if (facebookRequestError2 != null) {
                        FacebookException facebookException2 = facebookRequestError2.f29913i;
                        if (facebookException2 == null) {
                            facebookException2 = new FacebookException();
                        }
                        this$02.X6(facebookException2);
                        break;
                    } else {
                        JSONObject jSONObject2 = response.f83045b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        DeviceAuthDialog.RequestState requestState2 = new DeviceAuthDialog.RequestState();
                        try {
                            String string2 = jSONObject2.getString("user_code");
                            requestState2.f29942b = string2;
                            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                            requestState2.f29941a = format;
                            requestState2.f29943c = jSONObject2.getString("code");
                            requestState2.f29944d = jSONObject2.getLong("interval");
                            this$02.b7(requestState2);
                            break;
                        } catch (JSONException e14) {
                            this$02.X6(new FacebookException((Throwable) e14));
                        }
                    }
                }
                break;
        }
    }
}
