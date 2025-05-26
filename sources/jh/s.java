package jh;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class s implements DialogInterface.OnClickListener {
    public static s b(Activity activity, Intent intent, int i13) {
        return new q(activity, intent, i13);
    }

    public static s c(@NonNull com.google.android.gms.common.api.internal.i iVar, Intent intent, int i13) {
        return new r(iVar, intent);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e13) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e13);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
