package pf;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f100003a;

    public b(int i13) {
        if (i13 != 1) {
            this.f100003a = new Bundle();
        } else {
            this.f100003a = new Bundle();
        }
    }

    public static boolean f(Bundle bundle) {
        return SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(bundle.getString("gcm.n.e")) || SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final boolean a(String str) {
        String e13 = e(str);
        return SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(e13) || Boolean.parseBoolean(e13);
    }

    public final Integer b(String str) {
        String e13 = e(str);
        if (TextUtils.isEmpty(e13)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(e13));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + h(str) + "(" + e13 + ") into an int");
            return null;
        }
    }

    public final JSONArray c(String str) {
        String e13 = e(str);
        if (TextUtils.isEmpty(e13)) {
            return null;
        }
        try {
            return new JSONArray(e13);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + h(str) + ": " + e13 + ", falling back to default");
            return null;
        }
    }

    public final String d(Resources resources, String str, String str2) {
        String[] strArr;
        String e13 = e(str2);
        if (!TextUtils.isEmpty(e13)) {
            return e13;
        }
        String e14 = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e14)) {
            return null;
        }
        int identifier = resources.getIdentifier(e14, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", h(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray c13 = c(str2.concat("_loc_args"));
        if (c13 == null) {
            strArr = null;
        } else {
            int length = c13.length();
            strArr = new String[length];
            for (int i13 = 0; i13 < length; i13++) {
                strArr[i13] = c13.optString(i13);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e15) {
            Log.w("NotificationParams", "Missing format argument for " + h(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e15);
            return null;
        }
    }

    public final String e(String str) {
        Bundle bundle = this.f100003a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle g() {
        Bundle bundle = this.f100003a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public b(Bundle bundle) {
        this.f100003a = new Bundle(bundle);
    }
}
