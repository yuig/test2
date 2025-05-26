package kh2;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79636i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f79637j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i13) {
        super(0);
        this.f79636i = i13;
        this.f79637j = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79636i;
        q qVar = this.f79637j;
        switch (i13) {
            case 0:
                Context b13 = qVar.b();
                Intrinsics.g(b13, "null cannot be cast to non-null type android.app.Application");
                return (Application) b13;
            case 1:
                ApplicationInfo appInfo = qVar.b().getApplicationInfo();
                Intrinsics.checkNotNullExpressionValue(appInfo, "context.applicationInfo");
                Intrinsics.checkNotNullParameter(appInfo, "appInfo");
                boolean z13 = (appInfo.flags & 2) != 0;
                gg2.a aVar = gg2.a.DEV;
                return Boolean.valueOf(z13);
            case 2:
                PackageInfo packageInfo = qVar.b().getPackageManager().getPackageInfo(qVar.b().getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
                return new t2(packageInfo);
            default:
                return new nf2.c(qVar.b());
        }
    }
}
