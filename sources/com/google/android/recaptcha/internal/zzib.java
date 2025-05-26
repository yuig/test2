package com.google.android.recaptcha.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzib implements zzih {

    @NotNull
    private final Context zza;

    public zzib(@NotNull Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    @SuppressLint({"UnprotectedReceiver"})
    public final Object zza(@NotNull Object... objArr) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = Build.VERSION.SDK_INT >= 33 ? this.zza.registerReceiver(null, intentFilter, 4) : this.zza.registerReceiver(null, intentFilter);
        if (registerReceiver == null) {
            throw new zzce(7, 19, null);
        }
        int intExtra = registerReceiver.getIntExtra("health", -1);
        int intExtra2 = registerReceiver.getIntExtra("level", -1);
        int intExtra3 = registerReceiver.getIntExtra("plugged", -1);
        boolean booleanExtra = registerReceiver.getBooleanExtra("present", false);
        int intExtra4 = registerReceiver.getIntExtra("scale", -1);
        int intExtra5 = registerReceiver.getIntExtra("status", -1);
        String stringExtra = registerReceiver.getStringExtra("technology");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra2), Integer.valueOf(intExtra3), Boolean.valueOf(booleanExtra), Integer.valueOf(intExtra4), Integer.valueOf(intExtra5), stringExtra, Integer.valueOf(registerReceiver.getIntExtra("temperature", -1)), Integer.valueOf(registerReceiver.getIntExtra("voltage", -1))};
    }
}
