package fp1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import df.j1;
import java.util.HashSet;
import lb0.m;
import lb0.n;
import m60.f0;
import m60.x0;
import tb0.g;
import tb0.h;
import tb0.k;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f62784a;

    static {
        Context context = kb0.a.f79058b;
        f62784a = j1.V("market://details?id=%s", f0.W().getPackageName());
    }

    public static void a(final Context context) {
        if (context == null) {
            return;
        }
        if (context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(f62784a)), 65536).size() == 0) {
            return;
        }
        final m c13 = ((lb0.b) n.f82722a.a()).c();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        HashSet hashSet = h.f117076w;
        final h hVar = g.f117075a;
        String string = context.getString(x0.rate_title, context.getString(x0.app_name));
        String string2 = context.getString(x0.rate_message);
        builder.setTitle(string);
        builder.setMessage(string2);
        builder.setPositiveButton(x0.rate, new DialogInterface.OnClickListener() { // from class: fp1.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(d.f62784a)));
                SharedPreferences.Editor editor = c13;
                if (editor != null) {
                    editor.putBoolean("ARater__DONT_SHOW", true);
                    editor.apply();
                }
                k kVar = new k();
                kVar.c("Button", "Rate");
                hVar.k("AppRaterClick", kVar.f117102a);
                dialogInterface.dismiss();
            }
        });
        final int i13 = 0;
        builder.setNeutralButton(x0.later, new DialogInterface.OnClickListener() { // from class: fp1.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i14) {
                int i15 = i13;
                h hVar2 = hVar;
                SharedPreferences.Editor editor = c13;
                switch (i15) {
                    case 0:
                        if (editor != null) {
                            editor.putLong("ARater__REMINDED_DATE", System.currentTimeMillis());
                            editor.apply();
                        }
                        k kVar = new k();
                        kVar.c("Button", "Not Now");
                        hVar2.k("AppRaterClick", kVar.f117102a);
                        dialogInterface.dismiss();
                        break;
                    default:
                        if (editor != null) {
                            editor.putBoolean("ARater__DONT_SHOW", true);
                            editor.apply();
                        }
                        k kVar2 = new k();
                        kVar2.c("Button", "No Thanks");
                        hVar2.k("AppRaterClick", kVar2.f117102a);
                        dialogInterface.dismiss();
                        break;
                }
            }
        });
        final int i14 = 1;
        builder.setNegativeButton(x0.f85949no, new DialogInterface.OnClickListener() { // from class: fp1.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i142) {
                int i15 = i14;
                h hVar2 = hVar;
                SharedPreferences.Editor editor = c13;
                switch (i15) {
                    case 0:
                        if (editor != null) {
                            editor.putLong("ARater__REMINDED_DATE", System.currentTimeMillis());
                            editor.apply();
                        }
                        k kVar = new k();
                        kVar.c("Button", "Not Now");
                        hVar2.k("AppRaterClick", kVar.f117102a);
                        dialogInterface.dismiss();
                        break;
                    default:
                        if (editor != null) {
                            editor.putBoolean("ARater__DONT_SHOW", true);
                            editor.apply();
                        }
                        k kVar2 = new k();
                        kVar2.c("Button", "No Thanks");
                        hVar2.k("AppRaterClick", kVar2.f117102a);
                        dialogInterface.dismiss();
                        break;
                }
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: fp1.c
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                SharedPreferences.Editor editor = c13;
                if (editor != null) {
                    editor.putBoolean("ARater__DONT_SHOW", true);
                    editor.apply();
                }
                k kVar = new k();
                kVar.c("Button", "Cancel");
                hVar.k("AppRaterClick", kVar.f117102a);
                dialogInterface.dismiss();
            }
        });
        hVar.k("AppRaterShow", new k().f117102a);
        builder.create().show();
    }
}
