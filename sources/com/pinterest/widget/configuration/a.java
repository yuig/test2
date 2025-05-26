package com.pinterest.widget.configuration;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import h32.d4;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/widget/configuration/a;", "Lnl1/d;", "<init>", "()V", "widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class a extends nl1.d {
    public final d4 X = d4.ANDROID_WIDGET;

    public final int V7() {
        Intent intent;
        Bundle extras;
        FragmentActivity E4 = E4();
        if (E4 == null || (intent = E4.getIntent()) == null || (extras = intent.getExtras()) == null) {
            return 0;
        }
        return extras.getInt("appWidgetId", 0);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public d4 getX() {
        return this.X;
    }
}
