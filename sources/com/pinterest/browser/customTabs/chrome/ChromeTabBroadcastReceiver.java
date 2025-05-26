package com.pinterest.browser.customTabs.chrome;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import df.j1;
import h32.g0;
import h32.i0;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import z70.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/browser/customTabs/chrome/ChromeTabBroadcastReceiver;", "Lly1/a;", "<init>", "()V", "a", "customTabs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ChromeTabBroadcastReceiver extends ly1.a {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/pinterest/browser/customTabs/chrome/ChromeTabBroadcastReceiver$a;", "", "customTabs_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // ly1.a, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        String dataString;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        k kVar = (k) ((oa) ((a) j1.b0(a.class, context.getApplicationContext()))).O9.get();
        kVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString("com.pinterest.EXTRA_PIN_ID");
        int i13 = extras.getInt("com.pinterest.EXTRA_CHROME_TAB_ACTION_ID", 0);
        if (i13 == 1) {
            Intrinsics.f(string);
            String string2 = extras.getString("com.pinterest.EXTRA_CHROME_TAB_MENU_ID");
            if (string2 != null) {
                String string3 = extras.getString("com.pinterest.CLIENT_TRACKING_PARAMETER");
                if (Intrinsics.d(string2, "Report")) {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    if (string3 == null) {
                        string3 = "";
                    }
                    intent2.setData(Uri.parse("pinterest://report_link/?pin_id=" + string + "&tracking_params=" + string3));
                    intent2.setFlags(268435456);
                    context.startActivity(intent2);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 2) {
            Intrinsics.f(string);
            k.a(kVar, context, string);
            return;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 == null || (dataString = intent.getDataString()) == null) {
            return;
        }
        i0 generateLoggingContext = kVar.generateLoggingContext();
        int i14 = extras2.getInt("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID", -1);
        if (i14 != ud0.a.save_pinit_bt) {
            if (i14 == ud0.a.share_bt) {
                Intrinsics.f(string);
                k.a(kVar, context, string);
                return;
            }
            return;
        }
        kVar.f140999b.c0(generateLoggingContext, u0.PIN_REPIN_BUTTON, g0.MODAL_PIN, string);
        String string4 = extras2.getString("com.pinterest.PIN_MARKLET_URL");
        Intrinsics.f(string4);
        String string5 = extras2.getString("com.pinterest.EXTRA_CLOSEUP_URL");
        Intrinsics.f(string5);
        Intent b13 = kVar.f140998a.b(context, lu1.a.PIN_IT_ACTIVITY);
        b13.putExtra("com.pinterest.EXTRA_URL", dataString);
        b13.putExtra("com.pinterest.EXTRA_ID", string);
        b13.putExtra("com.pinterest.PIN_MARKLET_URL", string4);
        b13.putExtra("com.pinterest.EXTRA_CLOSEUP_URL", string5);
        b13.putExtra("com.pinterest.CLOSEUP_PIN_ID", string);
        b13.setFlags(268435456);
        context.startActivity(b13);
    }
}
