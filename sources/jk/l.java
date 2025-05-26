package jk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import i2.a2;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final fi.b f76346c = new fi.b("SplitInstallService", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final Intent f76347d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final String f76348a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.c f76349b;

    public l(Context context, String str) {
        String str2;
        this.f76348a = str;
        fi.b bVar = kk.l.f79884a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    kk.l.f79884a.h("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        str2 = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str2 = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str2)) {
                        String str3 = Build.TAGS;
                        if ((!str3.contains("dev-keys") && !str3.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str2)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.f76349b = new kk.c(applicationContext != null ? applicationContext : context, f76346c, f76347d);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(a2 a2Var) {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        a2Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (kk.s sVar : a2Var.f71073a) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", sVar.f79896a);
            bundle2.putLong("event_timestamp", sVar.f79897b);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ ArrayList b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }
}
