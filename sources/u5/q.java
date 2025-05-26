package u5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f120526a;

    public q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f120526a = context;
    }

    public static p a(q qVar) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            v b13 = qVar.b();
            return b13 == null ? qVar.c() : b13;
        }
        if (i13 <= 33) {
            return qVar.c();
        }
        return null;
    }

    public final v b() {
        v vVar = new v(this.f120526a);
        if (vVar.isAvailableOnDevice()) {
            return vVar;
        }
        return null;
    }

    public final p c() {
        String string;
        Context context = this.f120526a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.checkNotNullExpressionValue(serviceInfoArr, "packageInfo.services");
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List F0 = CollectionsKt.F0(arrayList);
        if (F0.isEmpty()) {
            return null;
        }
        Iterator it = F0.iterator();
        p pVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.g(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                p pVar2 = (p) newInstance;
                if (!pVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (pVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    pVar = pVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return pVar;
    }
}
