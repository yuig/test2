package km;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import fl.q;
import pd.s;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements sl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f80165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f80166c;

    public /* synthetic */ d(String str, int i13, Object obj) {
        this.f80164a = i13;
        this.f80165b = str;
        this.f80166c = obj;
    }

    @Override // sl.e
    public final Object e(s sVar) {
        int i13 = this.f80164a;
        Object obj = this.f80166c;
        String str = this.f80165b;
        switch (i13) {
            case 0:
                Context context = (Context) sVar.a(Context.class);
                int i14 = ((q) ((e) obj)).f62543a;
                String str2 = "";
                switch (i14) {
                    case 13:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case 14:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 15:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str2 = "embedded";
                                        break;
                                    }
                                } else {
                                    str2 = "auto";
                                    break;
                                }
                            } else {
                                str2 = "watch";
                                break;
                            }
                        } else {
                            str2 = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        break;
                }
                return new a(str, str2);
            default:
                sl.b bVar = (sl.b) obj;
                try {
                    Trace.beginSection(str);
                    return bVar.f113132f.e(sVar);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
