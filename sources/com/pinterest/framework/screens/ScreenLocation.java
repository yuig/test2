package com.pinterest.framework.screens;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/pinterest/framework/screens/ScreenLocation;", "Landroid/os/Parcelable;", "screen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface ScreenLocation extends Parcelable {
    /* renamed from: getDisplayMode */
    default g getF50396b() {
        return g.DEFAULT;
    }

    default kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    String getName();

    /* renamed from: getScreenClass */
    Class getF48308a();

    /* renamed from: getShouldKeepOldScreenVisible */
    default boolean getF48309b() {
        return false;
    }

    /* renamed from: getShouldNotActivateLastScreenVisible */
    default boolean getF47454c() {
        return false;
    }

    default boolean getShouldShowMainNavigation() {
        return getF50396b() != g.MODAL;
    }

    /* renamed from: getShouldSkipTransitions */
    default boolean getF50415c() {
        return false;
    }

    default boolean getSupportsStateRestorationOnlyUseInEmergencies() {
        return true;
    }

    void onScreenNavigation();

    @Override // android.os.Parcelable
    default void writeToParcel(Parcel dest, int i13) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        s82.c.f111949a.writeToParcel(dest, i13);
    }
}
