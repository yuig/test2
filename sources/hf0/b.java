package hf0;

import android.R;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import h32.m;
import java.util.regex.Pattern;
import m60.f0;
import m60.u;
import m60.z;

/* loaded from: classes.dex */
public final class b implements z, c {

    /* renamed from: a */
    public static float f69001a = 0.0f;

    /* renamed from: b */
    public static int f69002b = 0;

    /* renamed from: c */
    public static int f69003c = 0;

    /* renamed from: d */
    public static int f69004d = -1;

    /* renamed from: e */
    public static Boolean f69005e;

    /* renamed from: f */
    public static Boolean f69006f;

    /* renamed from: g */
    public static int f69007g;

    public static m a() {
        return q() ? m.ANDROID_TABLET : m.ANDROID_MOBILE;
    }

    public static String b() {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        Context context = kb0.a.f79058b;
        Application W = f0.W();
        if (d5.a.a(W, "android.permission.GET_ACCOUNTS") != 0) {
            return null;
        }
        for (Account account : AccountManager.get(W).getAccounts()) {
            if (pattern.matcher(account.name).matches()) {
                return account.name;
            }
        }
        return null;
    }

    public static DisplayMetrics c() {
        Context context = kb0.a.f79058b;
        return f0.X().getResources().getDisplayMetrics();
    }

    public static int d(Activity activity) {
        return f() + activity.getWindow().findViewById(R.id.content).getHeight();
    }

    public static int f() {
        if (f69007g == 0) {
            Context context = kb0.a.f79058b;
            Resources resources = f0.W().getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                f69007g = resources.getDimensionPixelSize(identifier);
            }
        }
        return f69007g;
    }

    public static int g(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int[] h(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
    }

    public static int i(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            return 0;
        }
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    public static int j(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static void k(View view) {
        if (view != null) {
            Context context = kb0.a.f79058b;
            ((InputMethodManager) f0.W().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void l(FragmentActivity fragmentActivity) {
        View currentFocus = fragmentActivity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(fragmentActivity);
        }
        k(currentFocus);
    }

    public static boolean m() {
        Context context = kb0.a.f79058b;
        return f0.W().getResources().getConfiguration().orientation == 2;
    }

    public static boolean n() {
        return q() && m();
    }

    public static boolean o() {
        Context context = kb0.a.f79058b;
        return f0.W().getResources().getConfiguration().orientation == 1;
    }

    public static boolean p() {
        return q() && o();
    }

    public static boolean q() {
        if (f69005e == null) {
            Context context = kb0.a.f79058b;
            f69005e = Boolean.valueOf(f0.X().getResources().getBoolean(xb2.a.is_tablet));
        }
        return f69005e.booleanValue();
    }

    public static void r(Context context) {
        DisplayMetrics c13 = c();
        f69001a = c13.density;
        f69002b = c13.widthPixels;
        f69003c = c13.heightPixels;
        f69004d = context.getResources().getInteger(xb2.b.pin_grid_cols);
        u.f85943a.d(new a());
    }

    public static void s(View view) {
        Context context = kb0.a.f79058b;
        ((InputMethodManager) f0.W().getSystemService("input_method")).showSoftInput(view, 1);
    }

    public static void t(Context context) {
        bs1.c.k0(context).getWindow().setSoftInputMode(16);
    }

    public final float e() {
        float f13 = f69001a;
        if (f13 > 0.0f) {
            return f13;
        }
        return 1.0f;
    }
}
