package a;

import ads_mobile_sdk.sd1;
import ads_mobile_sdk.vd1;
import ads_mobile_sdk.xb1;
import ads_mobile_sdk.yb1;
import ads_mobile_sdk.ym0;
import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class sb implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym0 f165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f166c;

    public /* synthetic */ sb(Object obj, ym0 ym0Var, int i13) {
        this.f164a = i13;
        this.f166c = obj;
        this.f165b = ym0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        int i14 = this.f164a;
        ym0 ym0Var = this.f165b;
        Object obj = this.f166c;
        switch (i14) {
            case 0:
                sd1.a((vd1) obj, ym0Var, dialogInterface, i13);
                break;
            default:
                xb1.a((yb1) obj, ym0Var, dialogInterface, i13);
                break;
        }
    }
}
