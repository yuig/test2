package io.embrace.android.embracesdk;

import android.view.View;
import androidx.annotation.NonNull;
import kotlin.Pair;
import nf2.f;
import th2.n;

/* loaded from: classes4.dex */
public final class ViewSwazzledHooks {
    private static final String UNKNOWN_ELEMENT_NAME = "Unknown element";

    private ViewSwazzledHooks() {
    }

    private static void logError(@NonNull Throwable th3) {
        f.f90499e.a().logInternalError(th3);
    }

    public static void logOnClickEvent(View view, n nVar) {
        String str;
        Pair pair;
        try {
            try {
                str = view.getResources().getResourceName(view.getId());
            } catch (NoSuchMethodError e13) {
                logError(e13);
                return;
            }
        } catch (Exception unused) {
            str = UNKNOWN_ELEMENT_NAME;
        }
        try {
            try {
                pair = new Pair(Float.valueOf(view.getX()), Float.valueOf(view.getY()));
            } catch (Exception unused2) {
                pair = new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
            f.f90499e.a().logTap(pair, str, nVar);
        } catch (Exception e14) {
            logError(e14);
        }
    }
}
