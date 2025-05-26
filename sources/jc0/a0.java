package jc0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface a0 {
    z createModalContentContainerInternal(Context context, Bundle bundle);

    default View getEducationContainer() {
        return null;
    }

    default int getLayoutHeight() {
        return -2;
    }

    z getModalContentContainer();

    int getModalHeight();

    View getModalOverlay();

    int getModalWidth();

    a getOverrideAnimation();

    default String getPinId() {
        return null;
    }

    String getSavedInstanceStateKey();

    default d4 getViewType() {
        return null;
    }

    default boolean isDismissible() {
        return isDismissible(false);
    }

    default void onAboutToDismiss() {
    }

    default void onAboutToShow() {
    }

    default void onActivityResult(int i13, int i14, Intent intent) {
    }

    default void onDisplayed() {
    }

    default void onModalContentContainerCreated() {
    }

    default void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    void setOverlay(View view);

    default boolean shouldOverrideDismissEvent() {
        return false;
    }

    default boolean isDismissible(boolean z13) {
        return !(this instanceof ji0.i);
    }
}
