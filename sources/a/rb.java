package a;

import ads_mobile_sdk.sd1;
import ads_mobile_sdk.vd1;
import ads_mobile_sdk.xb1;
import ads_mobile_sdk.yb1;
import ads_mobile_sdk.ym0;
import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.login.DeviceAuthDialog;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class rb implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f160g;

    public /* synthetic */ rb(vd1 vd1Var, String str, String str2, String str3, Activity activity, ym0 ym0Var) {
        this.f158e = vd1Var;
        this.f155b = str;
        this.f156c = str2;
        this.f157d = str3;
        this.f159f = activity;
        this.f160g = ym0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        int i14 = this.f154a;
        Object obj = this.f160g;
        Object obj2 = this.f159f;
        Object obj3 = this.f157d;
        Object obj4 = this.f158e;
        switch (i14) {
            case 0:
                Activity activity = (Activity) obj2;
                ym0 ym0Var = (ym0) obj;
                sd1.a((vd1) obj4, this.f155b, this.f156c, (String) obj3, activity, ym0Var, dialogInterface, i13);
                break;
            case 1:
                xb1.a(this.f155b, this.f156c, (String) obj3, (Long) obj4, (Long) obj2, (yb1) obj, dialogInterface, i13);
                break;
            default:
                DeviceAuthDialog this$0 = (DeviceAuthDialog) obj4;
                q7.v permissions = (q7.v) obj3;
                int i15 = DeviceAuthDialog.B;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String userId = this.f155b;
                Intrinsics.checkNotNullParameter(userId, "$userId");
                Intrinsics.checkNotNullParameter(permissions, "$permissions");
                String accessToken = this.f156c;
                Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
                this$0.U6(userId, permissions, accessToken, (Date) obj2, (Date) obj);
                break;
        }
    }

    public /* synthetic */ rb(DeviceAuthDialog deviceAuthDialog, String str, q7.v vVar, String str2, Date date, Date date2) {
        this.f158e = deviceAuthDialog;
        this.f155b = str;
        this.f157d = vVar;
        this.f156c = str2;
        this.f159f = date;
        this.f160g = date2;
    }

    public /* synthetic */ rb(String str, String str2, String str3, Long l13, Long l14, yb1 yb1Var) {
        this.f155b = str;
        this.f156c = str2;
        this.f157d = str3;
        this.f158e = l13;
        this.f159f = l14;
        this.f160g = yb1Var;
    }
}
