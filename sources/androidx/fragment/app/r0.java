package androidx.fragment.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0 extends h.a {
    @Override // h.a
    public final Intent a(androidx.activity.o oVar, Object obj) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest.f15934b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                IntentSender intentSender = intentSenderRequest.f15933a;
                Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                intentSenderRequest = new IntentSenderRequest(intentSender, null, intentSenderRequest.f15935c, intentSenderRequest.f15936d);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
        }
        return intent;
    }

    @Override // h.a
    public final Object c(Intent intent, int i13) {
        return new ActivityResult(intent, i13);
    }
}
