package com.google.android.gms.common;

import a.cb;
import com.google.android.gms.common.annotation.KeepName;
import ih.d;

@KeepName
/* loaded from: classes3.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i13) {
        super(cb.j("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", d.f72258a, " but found ", i13, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
    }
}
