package com.pinterest.framework.screens;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/pinterest/framework/screens/ScreenDescription;", "Landroid/os/Parcelable;", "screen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface ScreenDescription extends Parcelable {
    String A();

    Map H0();

    String L1();

    Bundle O1();

    int c();

    void c2(Bundle bundle);

    boolean g0();

    Class getScreenClass();

    boolean getSupportsStateRestorationOnlyUseInEmergencies();

    Bundle l1();
}
