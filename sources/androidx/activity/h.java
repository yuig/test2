package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;

/* loaded from: classes.dex */
public final class h extends g.g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f15898h;

    public h(o oVar) {
        this.f15898h = oVar;
    }

    @Override // g.g
    public final void c(int i13, h.a aVar, Object obj) {
        Bundle bundle;
        o oVar = this.f15898h;
        a8.q b13 = aVar.b(oVar, obj);
        if (b13 != null) {
            new Handler(Looper.getMainLooper()).post(new d.d(this, i13, b13, 1));
            return;
        }
        Intent a13 = aVar.a(oVar, obj);
        if (a13.getExtras() != null && a13.getExtras().getClassLoader() == null) {
            a13.setExtrasClassLoader(oVar.getClassLoader());
        }
        if (a13.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a13.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a13.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a13.getAction())) {
            String[] stringArrayExtra = a13.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            c5.c.f(oVar, stringArrayExtra, i13);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a13.getAction())) {
            int i14 = c5.c.f25774b;
            oVar.startActivityForResult(a13, i13, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a13.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            IntentSender intentSender = intentSenderRequest.f15933a;
            Intent intent = intentSenderRequest.f15934b;
            int i15 = intentSenderRequest.f15935c;
            int i16 = intentSenderRequest.f15936d;
            int i17 = c5.c.f25774b;
            oVar.startIntentSenderForResult(intentSender, i13, intent, i15, i16, 0, bundle);
        } catch (IntentSender.SendIntentException e13) {
            new Handler(Looper.getMainLooper()).post(new d.d(this, i13, e13, 2));
        }
    }
}
