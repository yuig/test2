package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33790a;

    /* renamed from: b, reason: collision with root package name */
    public String f33791b;

    /* renamed from: c, reason: collision with root package name */
    public String f33792c;

    /* renamed from: d, reason: collision with root package name */
    public int f33793d;

    /* renamed from: e, reason: collision with root package name */
    public int f33794e = 0;

    public m(Context context) {
        this.f33790a = context;
    }

    public static String b(nl.g gVar) {
        gVar.b();
        nl.i iVar = gVar.f91219c;
        String str = iVar.f91235e;
        if (str != null) {
            return str;
        }
        gVar.b();
        String str2 = iVar.f91232b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f33791b == null) {
                e();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f33791b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f33790a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e13) {
            Log.w("FirebaseMessaging", "Failed to find package " + e13);
            return null;
        }
    }

    public final boolean d() {
        synchronized (this) {
            int i13 = this.f33794e;
            if (i13 == 0) {
                PackageManager packageManager = this.f33790a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    return false;
                }
                Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                    this.f33794e = 2;
                } else {
                    this.f33794e = 2;
                }
            } else if (i13 == 0) {
                return false;
            }
            return true;
        }
    }

    public final synchronized void e() {
        PackageInfo c13 = c(this.f33790a.getPackageName());
        if (c13 != null) {
            this.f33791b = Integer.toString(c13.versionCode);
            this.f33792c = c13.versionName;
        }
    }
}
