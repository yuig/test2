package jh;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final g1.o0 f76188a = new g1.o0();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f76189b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = ph.b.a(context).f67746a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i13) {
        Resources resources = context.getResources();
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? resources.getString(R.string.ok) : resources.getString(gh.c.common_google_play_services_enable_button) : resources.getString(gh.c.common_google_play_services_update_button) : resources.getString(gh.c.common_google_play_services_install_button);
    }

    public static String c(Context context, int i13) {
        Resources resources = context.getResources();
        String a13 = a(context);
        if (i13 == 1) {
            return resources.getString(gh.c.common_google_play_services_install_text, a13);
        }
        if (i13 == 2) {
            return b7.c.E(context) ? resources.getString(gh.c.common_google_play_services_wear_update_text) : resources.getString(gh.c.common_google_play_services_update_text, a13);
        }
        if (i13 == 3) {
            return resources.getString(gh.c.common_google_play_services_enable_text, a13);
        }
        if (i13 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", a13);
        }
        if (i13 == 7) {
            return g(context, "common_google_play_services_network_error_text", a13);
        }
        if (i13 == 9) {
            return resources.getString(gh.c.common_google_play_services_unsupported_text, a13);
        }
        if (i13 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", a13);
        }
        switch (i13) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", a13);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", a13);
            case 18:
                return resources.getString(gh.c.common_google_play_services_updating_text, a13);
            default:
                return resources.getString(ih.h.common_google_play_services_unknown_issue, a13);
        }
    }

    public static String d(Context context, int i13) {
        return (i13 == 6 || i13 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i13);
    }

    public static String e(Context context, int i13) {
        String h10 = i13 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i13);
        return h10 == null ? context.getResources().getString(gh.c.common_google_play_services_notification_ticker) : h10;
    }

    public static String f(Context context, int i13) {
        Resources resources = context.getResources();
        switch (i13) {
            case 1:
                return resources.getString(gh.c.common_google_play_services_install_title);
            case 2:
                return resources.getString(gh.c.common_google_play_services_update_title);
            case 3:
                return resources.getString(gh.c.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i13);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h10 = h(context, str);
        if (h10 == null) {
            h10 = resources.getString(ih.h.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, h10, str2);
    }

    public static String h(Context context, String str) {
        Resources resources;
        g1.o0 o0Var = f76188a;
        synchronized (o0Var) {
            try {
                Locale b13 = new j5.h(new j5.j(context.getResources().getConfiguration().getLocales())).b(0);
                if (!b13.equals(f76189b)) {
                    o0Var.clear();
                    f76189b = b13;
                }
                String str2 = (String) o0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i13 = ih.e.f72260e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f76188a.put(str, string);
                return string;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
