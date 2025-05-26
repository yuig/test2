package net.quikkly.android.utils;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import net.quikkly.android.R;

/* loaded from: classes4.dex */
public class UiUtils {
    private static ProgressDialog mProgressDialog;

    private UiUtils() {
    }

    public static void dismissProgressDialog() {
        Runnable runnable = new Runnable() { // from class: net.quikkly.android.utils.UiUtils.4
            @Override // java.lang.Runnable
            public void run() {
                if (UiUtils.mProgressDialog != null) {
                    UiUtils.mProgressDialog.dismiss();
                    ProgressDialog unused = UiUtils.mProgressDialog = null;
                }
            }
        };
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    public static long elapsedNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static String getAppName(@NonNull Context context) {
        ApplicationInfo applicationInfo;
        CharSequence applicationLabel;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0)) == null || (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) == null) ? "Unknown" : applicationLabel.toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "Unknown";
        }
    }

    public static void setLayoutMargins(View view, int i13, int i14, int i15, int i16) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i13, i14, i15, i16);
            view.requestLayout();
        }
    }

    public static void showConfirmDialog(@NonNull Context context, int i13, int i14, View view, DialogInterface.OnClickListener onClickListener) {
        showConfirmDialog(context, i13, i14, R.string.quikkly_dialog_yes, R.string.quikkly_dialog_no, view, onClickListener);
    }

    public static void showDialog(@NonNull Context context, String str, String str2, String str3, final DialogInterface.OnDismissListener onDismissListener) {
        dismissProgressDialog();
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        if (str3 == null) {
            str3 = context.getString(R.string.quikkly_dialog_ok_button);
        }
        builder.setNeutralButton(str3, new DialogInterface.OnClickListener() { // from class: net.quikkly.android.utils.UiUtils.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i13) {
                dialogInterface.cancel();
            }
        });
        Runnable runnable = new Runnable() { // from class: net.quikkly.android.utils.UiUtils.2
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog create = builder.create();
                create.setCancelable(false);
                DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                if (onDismissListener2 != null) {
                    create.setOnDismissListener(onDismissListener2);
                }
                create.show();
            }
        };
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void showProgressDialog(@NonNull final Context context, int i13, int i14) {
        final String str;
        dismissProgressDialog();
        final String str2 = null;
        try {
            str = context.getString(i13);
        } catch (Exception unused) {
            str = null;
        }
        try {
            str2 = context.getString(i14);
        } catch (Exception unused2) {
        }
        Runnable runnable = new Runnable() { // from class: net.quikkly.android.utils.UiUtils.5
            @Override // java.lang.Runnable
            public void run() {
                ProgressDialog unused3 = UiUtils.mProgressDialog = new ProgressDialog(context);
                UiUtils.mProgressDialog.setTitle(str);
                UiUtils.mProgressDialog.setMessage(str2);
                UiUtils.mProgressDialog.setCancelable(false);
                UiUtils.mProgressDialog.show();
            }
        };
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void showConfirmDialog(@NonNull Context context, int i13, int i14, int i15, int i16, View view, @NonNull DialogInterface.OnClickListener onClickListener) {
        String str;
        String string;
        String string2;
        String str2 = null;
        try {
            str = context.getString(i13);
        } catch (Resources.NotFoundException unused) {
            str = null;
        }
        try {
            str2 = context.getString(i14);
        } catch (Resources.NotFoundException unused2) {
        }
        String str3 = str2;
        try {
            string = context.getString(i15);
        } catch (Resources.NotFoundException unused3) {
            string = context.getString(R.string.quikkly_dialog_yes);
        }
        String str4 = string;
        try {
            string2 = context.getString(i16);
        } catch (Resources.NotFoundException unused4) {
            string2 = context.getString(R.string.quikkly_dialog_no);
        }
        showConfirmDialog(context, str, str3, str4, string2, view, onClickListener);
    }

    public static void showConfirmDialog(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull View view, @NonNull DialogInterface.OnClickListener onClickListener) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(str3, onClickListener);
        builder.setNegativeButton(str4, onClickListener);
        builder.setCancelable(false);
        if (view != null) {
            builder.setView(view);
        }
        Runnable runnable = new Runnable() { // from class: net.quikkly.android.utils.UiUtils.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog create = builder.create();
                create.getWindow().setSoftInputMode(4);
                create.show();
            }
        };
        dismissProgressDialog();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void showDialog(@NonNull Context context, int i13, int i14, int i15, DialogInterface.OnDismissListener onDismissListener) {
        String str;
        String str2;
        String str3 = null;
        try {
            str = context.getString(i13);
        } catch (Resources.NotFoundException unused) {
            str = null;
        }
        try {
            str2 = context.getString(i14);
        } catch (Resources.NotFoundException unused2) {
            str2 = null;
        }
        try {
            str3 = context.getString(i15);
        } catch (Resources.NotFoundException unused3) {
        }
        showDialog(context, str, str2, str3, onDismissListener);
    }
}
